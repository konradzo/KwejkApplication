package pl.akademiakodu.kwejk.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.akademiakodu.kwejk.dao.GifDao;

@Controller
public class GifController {

    @Autowired
    private GifDao gifDao;

    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/gif/{name}")
    public String details(@PathVariable String name, ModelMap modelMap){
        modelMap.addAttribute("gif", gifDao.findOne(name));
        return "gif-details";
    }
    @GetMapping("/favorites")
    public String favorites(ModelMap modelMap){
        modelMap.addAttribute("gifs",gifDao.findFavorites());
        return "favorites";
    }
    @GetMapping("/show/all")
    public String findall(ModelMap modelMap){
        modelMap.addAttribute("gifs",gifDao.findAll());
        return "home";
    }
    @GetMapping("/categories")
    public String categories(ModelMap modelMap) {
        modelMap.addAttribute("categories", gifDao.findCategories());
        return "categories";
    }
    @GetMapping("/gif/find")
    public String findAndShow(@RequestParam String name, ModelMap modelMap){
        modelMap.addAttribute("gif", gifDao.findOne(name));
        return "gif-details";
    }
    @GetMapping("/category/{id}")
    public String category(@PathVariable Integer id, ModelMap modelMap){
        modelMap.addAttribute("gifs",gifDao.findByCategory(id));
        modelMap.addAttribute("gifLabel",gifDao.findOne(gifDao.findByCategory(id).get(0).getName()));
        return "category";
    }

}
