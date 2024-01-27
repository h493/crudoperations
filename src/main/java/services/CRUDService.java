package services;

import models.Characters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.SuperHeroRepository;

@Service
public class CRUDService {

    @Autowired
    SuperHeroRepository superHeroRepository;

    public void createSuperhero(Characters superHero){
        superHeroRepository.save(superHero);
    }
}
