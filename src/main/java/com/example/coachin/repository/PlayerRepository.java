package com.example.coachin.repository;

import com.example.coachin.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {
    void deleteByName(String name);
    Player findByName(String name);
    Player findById(int id);
    Player findByWickets(int wickets);
}
