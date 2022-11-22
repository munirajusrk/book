package com.rootstock.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rootstock.model.SeedBrandRequest;
import com.rootstock.model.SeedBrandResponse;
import com.rootstock.model.SeedDataRequest;
import com.rootstock.model.SeedDataResponse;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/seed")
public class SeedController {

    ObjectMapper objectMapper = new ObjectMapper();

    @PostMapping("/create")
    public SeedDataResponse createSeedData(@RequestBody SeedDataRequest seedDataRequest) throws Exception {
        URL resource = SeedController.class.getResource("/partner/seed_data_response.json");
        return objectMapper.readValue(Files.readString(Path.of(resource.toURI())).getBytes(), SeedDataResponse.class);
    }

    @GetMapping("/list/{cropId}")
    public List<SeedDataResponse> listSeedData(@PathVariable("cropId") Long cropId) {
        return new ArrayList<>();
    }

    @PostMapping("/brand/create")
    public SeedBrandResponse createSeedBrand(@RequestBody SeedBrandRequest seedBrandRequest) throws Exception {
        URL resource = SeedController.class.getResource("/partner/seed_brand_response.json");
        return objectMapper.readValue(Files.readString(Path.of(resource.toURI())).getBytes(), SeedBrandResponse.class);
    }

    @GetMapping("/brand/list/{cropId}")
    public List<SeedBrandResponse> listSeedBrands(@PathVariable("cropId") Long cropId) {
        return new ArrayList<>();
    }
}
