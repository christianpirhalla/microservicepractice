package io.christian.moviecatalogservice.controller;

import io.christian.moviecatalogservice.models.CatalogItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @GetMapping("/{userId}")
    public List<CatalogItem> getMovieInfo(@PathVariable("userId") Long userId){

        return Collections.singletonList(
                new CatalogItem("Slumdunder Mifflionaire", "funny movie", 5)
        );

    }

}
