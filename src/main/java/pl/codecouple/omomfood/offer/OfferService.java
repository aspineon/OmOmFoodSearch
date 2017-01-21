package pl.codecouple.omomfood.offer;

import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.core.query.result.FacetPage;

/**
 * Created by Krzysztof Chruściel.
 */
public interface OfferService {

    FacetPage<Offer> autocompleteNameFragment(String fragment, Pageable pageable);

}
