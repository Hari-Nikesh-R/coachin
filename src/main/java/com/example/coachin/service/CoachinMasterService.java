package com.example.coachin.service;

import com.example.coachin.dto.GameDto;
import com.example.coachin.dto.PlayerDto;
import com.example.coachin.model.Game;

import java.util.List;

public interface CoachinMasterService {
    PlayerDto addNewPlayer(PlayerDto playerDto);
    List<PlayerDto> getPlayerDetails(String name);
    String deletePlayer(String name);
    GameDto addGame(GameDto game);
}
