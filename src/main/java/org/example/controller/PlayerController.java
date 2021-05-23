package org.example.controller;

import org.example.model.Player;
import org.example.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    // RESTful API methods for Retrieval operations
    @GetMapping("/products")
    public List<Player> list() {
        return playerService.listAll();
    }

    // RESTful API method for Create operation

    // RESTful API method for Update operation

    // RESTful API method for Delete operation
}
