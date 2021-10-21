package com.example.toyProject.controller;

import com.example.toyProject.domain.InfoVO;
import com.example.toyProject.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/info")
public class InfoController {
    @Autowired
    private InfoService infoService;

    @GetMapping("/find/room")
    public int findRoom(@PathVariable String co) { return infoService.findRoom(co); }

    @GetMapping("/find/user")
    public List<InfoVO> findUser(@PathVariable String co) { return infoService.findUser(co); }

    @PostMapping("/enter/room")
    public void enterRoom(@RequestBody InfoVO enter) {
        infoService.enterRoom(enter);
    }

    @DeleteMapping("exit/room")
    public void exitRoom(@PathVariable String id) {
        infoService.exitRoom(id);
    }
}
