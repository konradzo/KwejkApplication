package pl.akademiakodu.kwejk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GifController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/gif/{name}")
    public String details(@PathVariable String name, ModelMap modelMap){
        //modelMap.addAttribute("gif",gifDao.findOne(name));
        return "gif-details";
    }

}
