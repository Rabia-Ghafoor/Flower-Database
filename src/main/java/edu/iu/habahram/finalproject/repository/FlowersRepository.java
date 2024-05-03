package edu.iu.habahram.finalproject.repository;

import edu.iu.habahram.finalproject.model.Flower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowersRepository
        extends CrudRepository<Flower, Integer> {
}
