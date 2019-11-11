package com.controller;

import com.entity.Image;
import com.entity.User;
import com.service.ImageService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private UserService userService;
    @Autowired
    private ImageService imageService;
    @RequestMapping("/try")
    public int hello(){
        User user = new User();
        user.setAccount("111111");
        user.setPassword("111111");
        user.setHeadSculpture("empty");
        user.setIsAdmin(0);
        user.setNickname("aaaa");
        int row=userService.insert(user);
        return row;
    }

    @GetMapping("/mainpic")
    public List<Image> getPic() {
        List<Image> images=imageService.getImages();
        return images;
    }
}
