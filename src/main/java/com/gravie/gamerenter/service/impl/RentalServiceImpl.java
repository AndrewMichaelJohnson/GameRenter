package com.gravie.gamerenter.service.impl;

import com.gravie.gamerenter.domain.CustomerOrder;
import com.gravie.gamerenter.domain.RentalResponse;
import com.gravie.gamerenter.service.RentalService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RentalServiceImpl implements RentalService {

    public RentalResponse finalizeRental(CustomerOrder customerOrder) {
        //Here we would charge the credit card for the order, using a credit card client, and update the inventory.
        //That might be a database depending on design, or through an API. We are just logging instead.
        return new RentalResponse(true, "Order completed!", new Date(System.currentTimeMillis() + (86400 * 7 * 1000)), customerOrder.getGames());

    }
}
