package controllers;

import models.Characters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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

}
