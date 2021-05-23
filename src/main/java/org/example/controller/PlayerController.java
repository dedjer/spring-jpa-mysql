package org.example.controller;

import org.example.model.Player;
import org.example.repository.PlayerRepository;
import org.example.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.*;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    // RESTful API methods for Retrieval operations
    @GetMapping("/players")
    public List<Player> list()
    {
        return playerService.listAll();
    }

    @GetMapping("/player/{id}")
    public ResponseEntity<Player> get(@PathVariable Integer id) {
        try
        {
            Player player = playerService.get(id);
            return new ResponseEntity<Player>(player, HttpStatus.OK);
        }
        catch (NoSuchElementException e)
        {
            return new ResponseEntity<Player>(HttpStatus.NOT_FOUND);
        }
    }

    // RESTful API method for Create operation

    // RESTful API method for Update operation

    // RESTful API method for Delete operation
}
