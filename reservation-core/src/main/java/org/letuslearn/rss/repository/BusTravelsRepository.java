/*
 * Letus Learn 2017 Copyright
 */

package org.letuslearn.rss.repository;

import org.letuslearn.rss.domain.BusTravels;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by prasad on 12/3/17.
 */
public interface BusTravelsRepository extends MongoRepository<BusTravels,String> {

    public BusTravels findByServiceName(String serviceName);
    public List<BusTravels> findAll();
}
