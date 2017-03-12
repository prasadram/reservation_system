/*
 * Letus Learn 2017 Copyright
 */

package org.letuslearn.rss.resources;

import lombok.extern.slf4j.Slf4j;
import org.letuslearn.rss.domain.BusTravels;
import org.letuslearn.rss.services.BusTravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by prasad on 12/3/17.
 */
@RestController
@RequestMapping("/service")
@Slf4j
public class BusServiceResource {

    @Autowired
    BusTravelService busTravelService;

    @GetMapping("/{serviceName}")
    public ResponseEntity getBusService(@PathVariable String serviceName) {
        //log
        BusTravels busTravels = busTravelService.getBusTravels(serviceName);
        log.info(busTravels.toString());
        //log
        return new ResponseEntity(busTravels, HttpStatus.OK);
    }
}
