package com.java.profileservice.contoller;

import com.java.profileservice.config.ApiResponse;
import com.java.profileservice.model.City;
import com.java.profileservice.service.CityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/city")
@Api(tags = {"City controller"})
public class CityController {

    @Autowired
    public CityService cityService;

    @GetMapping("/all")
    @ApiOperation(
            notes = "${operation12.description}",
            value = "${operation12.value}"
    )
    public ApiResponse getAllCities(){
        List<City> cityList = cityService.getAllCities();

        return new ApiResponse(cityList);

    }
}
