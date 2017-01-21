package pl.codecouple.omomfood.offer;

import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.core.query.result.FacetPage;
import org.springframework.data.solr.repository.Facet;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.Collection;

/**
 * Created by Krzysztof Chruściel.
 */
public interface OfferRepository extends SolrCrudRepository<Offer, String> {

    @Facet(fields = { "city" })
    FacetPage<Offer> findByCityAllIgnoreCaseStartingWith(Collection<String> nameFragments, Pageable pageable);
}
