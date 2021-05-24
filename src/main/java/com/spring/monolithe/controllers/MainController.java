package com.spring.monolithe.controllers;

import java.util.List;

import com.spring.monolithe.entities.Locality;
import com.spring.monolithe.exceptions.DatabaseException;
import com.spring.monolithe.feignclients.OpenStreetMapClient;
import com.spring.monolithe.services.LocalityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/main")
public class MainController {

    @Autowired
    private LocalityService localityService;

    @Autowired
    private OpenStreetMapClient openStreetMapClient;

    @GetMapping(value = "/localities")
    public List<Locality> getLocalities() throws DatabaseException {
        return this.localityService.list();
    }


    // OSM Ways

    @GetMapping(value = "/pelusium")
    public String getPelusium() {
        return this.openStreetMapClient.getWayById(265286960L);
    }

    @GetMapping(value = "/memphis")
    public String getMemphis() {
        return this.openStreetMapClient.getWayById(653703867L);
    }

    // OSM Nodes

    @GetMapping(value = "/babylon")
    public String getBabylon() {
        return this.openStreetMapClient.getNodeById(2488023863L);
    }

    @GetMapping(value = "/temple_of_mut_at_gebel_barkal")
    public String getTempleOfMutAtGebelBarkal() {
        return this.openStreetMapClient.getNodeById(4720409592L);
    }
    
    
}
