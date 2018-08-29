package be.wesleyjaemers.project1.repositories;

import be.wesleyjaemers.project1.entities.Games;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends PagingAndSortingRepository<Games, Long> {
    Games findByName (String name);
    Games findByType (String type);
}
