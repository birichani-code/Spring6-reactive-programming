package birichani_codes.spring6reactive.repositories;

import birichani_codes.spring6reactive.domain.Beer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
public interface BeerRepository extends ReactiveCrudRepository<Beer, Integer> {
}
