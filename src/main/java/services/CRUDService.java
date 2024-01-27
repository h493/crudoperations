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

    public Characters readSuperHeroById(int val){
        return superHeroRepository.findById(val).get();
    }

    public void updateSuperHeroName(Characters superHero, int id){
        Characters superHeroToBeUpdated = readSuperHeroById(id);
        superHeroToBeUpdated.setName(superHero.getName());

        createSuperhero(superHeroToBeUpdated);

    }

    public void deleteById(int id){
        superHeroRepository.deleteById(id);
    }
}
