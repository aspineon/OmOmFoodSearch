package pl.codecouple.omomfood.offer;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * Created by Krzysztof Chruściel.
 */
@Data
@SolrDocument(solrCoreName = "offers")
public class Offer {

    @Id
    @Field
    private String id;

    @Field
    private String city;

}
