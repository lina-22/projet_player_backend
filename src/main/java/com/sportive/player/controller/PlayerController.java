package com.sportive.player.controller;

import com.sportive.player.model.Player;
import com.sportive.player.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
@CrossOrigin
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("/add")
    public String add(@RequestBody Player player){
        playerService.savePlayer(player);
        return "New Player is added";
    }

    @GetMapping("/getAll")
    public List<Player> getAllPlayers(){
        return  playerService.getAllPlayers();
    }
}
