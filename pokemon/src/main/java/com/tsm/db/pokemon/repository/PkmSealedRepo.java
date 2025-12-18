package com.tsm.db.pokemon.repository;

import com.tsm.db.pokemon.entity.PkmSealed;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PkmSealedRepo extends MongoRepository<PkmSealed,String> {
}
