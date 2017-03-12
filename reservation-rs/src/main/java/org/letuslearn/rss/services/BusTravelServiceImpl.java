/*
 * Letus Learn 2017 Copyright
 */

package org.letuslearn.rss.services;

import org.letuslearn.rss.domain.BusTravels;
import org.letuslearn.rss.repository.BusTravelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by prasad on 12/3/17.
 */
@Service
public class BusTravelServiceImpl implements BusTravelService {

    @Autowired
    BusTravelsRepository busTravelsRepository;

    @Override
    public BusTravels getBusTravels(String serviceName) {
        BusTravels busTravels = null;
        try {
            List<BusTravels> busTravelsList = busTravelsRepository.findAll();
            busTravels = busTravelsRepository.findByServiceName(serviceName);
        }catch (Exception e){
            e.printStackTrace();
        }
        return busTravels;
    }

    @Override
    public List<BusTravels> getAllTravels() {
        return busTravelsRepository.findAll();
    }
}
