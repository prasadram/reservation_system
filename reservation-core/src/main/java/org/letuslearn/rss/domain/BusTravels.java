/*
 * Letus Learn 2017 Copyright
 */

package org.letuslearn.rss.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by prasad on 12/3/17.
 */
@Document(collection = "services")
@Data
public class BusTravels {

    @Id
    private String serviceName;

    private String source;

    private String destination;

    private List<String> stations;

    @Override
    public String toString() {
        return String.format("Service[name=%s, source=%s destination=%s]",serviceName,source,destination);
    }

}
