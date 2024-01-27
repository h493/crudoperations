package controllers;

import models.Characters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.CRUDService;

@RestController
public class MarvelCrudController {

    @Autowired
    CRUDService crudService;

    //CRUD

    //Create API Endpoint - Post

    @PostMapping("create")
    public void createSuperHero(@RequestBody Characters superhero){
            crudService.createSuperhero(superhero);
    }

    @GetMapping("read")
    public Characters readSuperHeroById(@RequestParam(name = "id") int id){
        return crudService.readSuperHeroById(id);
    }

    @PutMapping("update")
    public void updateSuperHeroByName(@RequestBody Characters superHero,@RequestParam(name ="id") int id){
        crudService.updateSuperHeroName(superHero,id);
    }

    @DeleteMapping("delete")
    public void deleteSuperHero(@RequestParam(name = "id") int id){
        crudService.deleteById(id);
    }
}
