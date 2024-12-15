package com.gravie.gamerenter.controller;

import com.gravie.gamerenter.domain.CustomerOrder;
import com.gravie.gamerenter.domain.RentalResponse;
import com.gravie.gamerenter.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping("/v1")
public class RentalController {

    private final RentalService rentalService;

    @Autowired
    public RentalController(RentalService rentalService) { this.rentalService = rentalService; }

    @PostMapping(path = "/rent", consumes = APPLICATION_JSON_VALUE, produces = {APPLICATION_JSON_VALUE})
    @CrossOrigin(origins = "http://localhost:4200")
    @ResponseBody
    public RentalResponse rentGames(@RequestBody final CustomerOrder customerOrder) {
        return this.rentalService.finalizeRental(customerOrder);
    }

}
