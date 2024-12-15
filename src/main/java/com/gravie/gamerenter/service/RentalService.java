package com.gravie.gamerenter.service;

import com.gravie.gamerenter.domain.CustomerOrder;
import com.gravie.gamerenter.domain.RentalResponse;

public interface RentalService {
    RentalResponse finalizeRental(CustomerOrder customerOrder);
}
