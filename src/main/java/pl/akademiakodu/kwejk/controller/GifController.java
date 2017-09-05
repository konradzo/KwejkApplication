package pl.akademiakodu.kwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.akademiakodu.kwejk.dao.GifDao;
import pl.akademiakodu.kwejk.dao.GifDaoImpl;

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
        return "get-details";
    }

}
