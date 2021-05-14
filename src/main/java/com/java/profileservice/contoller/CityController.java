package com.java.profileservice.contoller;

import com.java.profileservice.config.ApiResponse;
import com.java.profileservice.model.City;
import com.java.profileservice.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/city")
public class CityController {

    @Autowired
    public CityService cityService;

    @GetMapping("/all")
    public ApiResponse getAllCities(){
        List<City> cityList = cityService.getAllCities();

        return new ApiResponse(cityList);

    }
}