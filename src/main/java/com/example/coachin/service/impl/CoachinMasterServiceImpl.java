package com.example.coachin.service.impl;

import com.example.coachin.dto.GameDto;
import com.example.coachin.dto.PlayerDto;
import com.example.coachin.model.Game;
import com.example.coachin.model.Player;
import com.example.coachin.repository.GameRepository;
import com.example.coachin.repository.PlayerRepository;
import com.example.coachin.service.CoachinMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CoachinMasterServiceImpl implements CoachinMasterService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private GameRepository gameRepository;

    @Override
    public PlayerDto addNewPlayer(PlayerDto playerDto) {
        Player player = new Player();
        player.setName(playerDto.getName());
        player.setAge(playerDto.getAge());
        player.setCatches(playerDto.getCatches());
        player.setAverageRunRate(playerDto.getAverageRunRate());
        player.setJerseyNumber(playerDto.getJerseyNumber());
        player.setEconomy(playerDto.getEconomy());
        player.setRuns(playerDto.getRuns());
        player.setWickets(playerDto.getWickets());

//        Player newPlayer = new Player();
//        newPlayer.setName("Virat kohli");
//        newPlayer.setAge(38);
//        newPlayer.setCatches(890);
//        newPlayer.setAverageRunRate(98);
//        newPlayer.setJerseyNumber(18);
//        newPlayer.setEconomy(7);
//        newPlayer.setRuns(23232);
//        newPlayer.setWickets(46);


        // Single
        player = playerRepository.save(player);
//
        // List<Player>
//        List<Player> players = new ArrayList<>();
//        players.add(player);
//        players.add(newPlayer);

        // Multiple save
//        playerRepository.saveAll(players);
        playerDto.setId(player.getId());
        return playerDto;
    }




    @Override
    public List<PlayerDto> getPlayerDetails(String name) {
        if (name == null || name.isEmpty()) {
            List<Player> players = playerRepository.findAll();
            List<PlayerDto> playerDtos = new ArrayList<>();
            for (Player player : players) {
                PlayerDto playerDto = new PlayerDto();
                playerDto.setId(player.getId());
                playerDto.setName(player.getName());
                playerDto.setAge(player.getAge());
                playerDto.setCatches(player.getCatches());
                playerDto.setAverageRunRate(player.getAverageRunRate());
                playerDto.setJerseyNumber(player.getJerseyNumber());
                playerDto.setEconomy(player.getEconomy());
                playerDto.setRuns(player.getRuns());
                playerDto.setWickets(player.getWickets());
                playerDtos.add(playerDto);
            }
            return playerDtos;
        }
        else {
            Player player = playerRepository.findByName(name);
            PlayerDto playerDto = new PlayerDto();
            playerDto.setId(player.getId());
            playerDto.setName(player.getName());
            playerDto.setAge(player.getAge());
            playerDto.setCatches(player.getCatches());
            playerDto.setAverageRunRate(player.getAverageRunRate());
            playerDto.setJerseyNumber(player.getJerseyNumber());
            playerDto.setEconomy(player.getEconomy());
            playerDto.setRuns(player.getRuns());
            playerDto.setWickets(player.getWickets());
            return List.of(playerDto);
        }

    }

    @Override
    public String deletePlayer(String name) {
        playerRepository.deleteAll();
        return "Player deleted";
    }

    @Override
    public GameDto addGame(GameDto gameDto) {
        Game game = new Game();
        game.setTitle(gameDto.getTitle());
        game.setDescription(gameDto.getDescription());
        gameRepository.save(game);
        return gameDto;
    }
}
