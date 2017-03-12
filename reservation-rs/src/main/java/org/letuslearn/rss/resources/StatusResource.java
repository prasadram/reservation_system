package org.letuslearn.rss.resources;

import lombok.extern.slf4j.Slf4j;
import org.letuslearn.rss.dto.response.StatusResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

/**
 * Created by prasad on 11/3/17.
 */
@RestController
@Slf4j
@RequestMapping("/reservation")
public class StatusResource {

    @GetMapping("/ping")
    public ResponseEntity getStatus() {
        //log
        StatusResponseDto statusResponseDto = new StatusResponseDto();
        statusResponseDto.setStatus(HttpStatus.OK.getReasonPhrase());
        //statusResponseDto.setProjectName();
        //log
        return new ResponseEntity(statusResponseDto,HttpStatus.OK);
    }
}
