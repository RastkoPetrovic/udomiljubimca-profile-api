package com.java.profileservice.contoller;

import com.java.profileservice.config.ApiResponse;
import com.java.profileservice.model.Coexistence;
import com.java.profileservice.service.CoexistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/coexistence")
public class CoexistenceController {

    @Autowired
    public CoexistenceService coexistenceService;

    @GetMapping("/all")
    public ApiResponse getAllCoexistences() {

        List<Coexistence> coexistenceList = coexistenceService.getAllCoexistences();
        return new ApiResponse(coexistenceList);
    }
}
