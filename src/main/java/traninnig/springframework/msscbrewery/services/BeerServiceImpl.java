package traninnig.springframework.msscbrewery.services;

import org.springframework.stereotype.Service;
import traninnig.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy cat")
                .beerStyle("pale ale")
                .build();
    }
}
