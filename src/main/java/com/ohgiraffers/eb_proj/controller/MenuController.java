package com.ohgiraffers.eb_proj.controller;

import com.ohgiraffers.eb_proj.dto.MenuDTO;
import com.ohgiraffers.eb_proj.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/")
    public String healthCheckRoot() {
        return "health check root!";
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "eb_proj is fine!";
    }

    @GetMapping("/menus/{menuCode}")
    public MenuDTO findMenuByMenuCode(@PathVariable("menuCode") int menuCode) {
        MenuDTO returnMenu = menuService.findMenuByMenuCode(menuCode);
        return returnMenu;
    }
}













