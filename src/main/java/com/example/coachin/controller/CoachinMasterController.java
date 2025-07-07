package com.example.coachin.controller;

import com.example.coachin.dto.GameDto;
import com.example.coachin.dto.PlayerDto;
import com.example.coachin.service.CoachinMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoachinMasterController {

    @Autowired
    private CoachinMasterService coachinMasterService;

    @PostMapping("/add/player")
    public PlayerDto addPlayerDetail(@RequestBody PlayerDto playerDto) {
        return coachinMasterService.addNewPlayer(playerDto);
    }

    @DeleteMapping("/delete/player")
    public String deletePlayerDetail(@RequestParam("name") String name) {
        return coachinMasterService.deletePlayer(name);
    }

    @GetMapping("/get/player")
    public List<PlayerDto> getPlayerDetail(@RequestParam(value = "name", required = false) String name) {
        return coachinMasterService.getPlayerDetails(name);
    }

    @PostMapping("/add/game")
    public GameDto addGameDetail(@RequestBody GameDto gameDto) {
        return coachinMasterService.addGame(gameDto);
    }
}
