package com.home.poc.ileague.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.home.poc.ileague.model.Player;
import com.home.poc.ileague.repository.PlayerRepository;

@Service("playerService")
public class PlayerServiceImpl implements PlayerService {
	
	private PlayerRepository playerRepository;

	public PlayerRepository getPlayerRepository() {
		return playerRepository;
	}

	@Autowired
	public void setPlayerRepository(PlayerRepository playerRepository) {
		System.out.println("We are using setter injection ...");
		this.playerRepository = playerRepository;
	}
	
	@Override
	@Transactional
	public void addPlayer(Player player) {
		 playerRepository.save(player);
}
	
}
