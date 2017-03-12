/*
 * Letus Learn 2017 Copyright
 */

package org.letuslearn.rss.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by prasad on 12/3/17.
 */
@Configuration
@EnableMongoRepositories(basePackages = "org.letuslearn.rss")
public class DBConfig extends AbstractMongoConfiguration {
    @Override
    protected String getDatabaseName() {
        return "llrn_reservation";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient("localhost",27017);
    }
}
