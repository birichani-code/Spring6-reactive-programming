package birichani_codes.spring6reactive.mappers;

import birichani_codes.spring6reactive.domain.Beer;
import birichani_codes.spring6reactive.model.BeerDTO;
import org.mapstruct.Mapper;
@Mapper
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}
