package com.sportive.player.service;

import com.sportive.player.model.Player;

import java.util.List;

public interface PlayerService {
    public Player savePlayer(Player player);
    public List<Player> getAllPlayers();
}
