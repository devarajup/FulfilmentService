package com.cjss.FulfilmentService.service;

import com.cjss.FulfilmentService.model.StatusUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class FulfilmentService {
     RestTemplate rt = new RestTemplate();
public StatusUpdate upadateStatus(StatusUpdate statusUpdate){
    String url = UriComponentsBuilder.fromUriString("http://localhost:8084/update-item-status")
           .build().toUriString();
    ResponseEntity<StatusUpdate> result = rt.postForEntity(url, statusUpdate, StatusUpdate.class);
  return    result.getBody();
}

}
