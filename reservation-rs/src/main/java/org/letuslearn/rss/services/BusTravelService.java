/*
 * Letus Learn 2017 Copyright
 */

package org.letuslearn.rss.services;

import org.letuslearn.rss.domain.BusTravels;

import java.util.List;

/**
 * Created by prasad on 12/3/17.
 */
public interface BusTravelService {
    public BusTravels getBusTravels(String serviceName);
    public List<BusTravels> getAllTravels();
}
