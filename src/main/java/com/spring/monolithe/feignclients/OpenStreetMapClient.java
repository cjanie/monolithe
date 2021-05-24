package com.spring.monolithe.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "openstreetmap", url = "http://overpass-api.de/api") // basic url
public interface OpenStreetMapClient {
    
    @GetMapping(value = "/interpreter?data=[out:json];way({id});out;") // ressource
    public String getWayById(@PathVariable Long id);

    @GetMapping(value = "/interpreter?data=[out:json];node({id});out;")
    public String getNodeById(@PathVariable Long id);
}
