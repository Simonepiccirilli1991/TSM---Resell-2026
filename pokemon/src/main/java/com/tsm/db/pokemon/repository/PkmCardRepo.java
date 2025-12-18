package com.tsm.db.pokemon.repository;

import com.tsm.db.pokemon.entity.PkmCard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PkmCardRepo extends MongoRepository<PkmCard,String> {
}
