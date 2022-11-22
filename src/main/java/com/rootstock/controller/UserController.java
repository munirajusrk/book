package com.rootstock.controller;


import com.rootstock.model.UserRequest;
import com.rootstock.model.UserResponse;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/list")
    public List<UserRequest> listUsers() {
        return new ArrayList<>();
    }

    @PostMapping("/create")
    public UserResponse createUser(@RequestBody UserRequest userRequest) {
        return new UserResponse();
    }

    @GetMapping("/generate/csv")
    public ResponseEntity<Resource> generateCSV() throws Exception {
        List<UserRequest> userRequests = listUsers();
        /**
         * Generate CSV content from listUsers api endpoint
         */
        String fileName = "csvFile.csv";
        File file = new File(fileName);
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
        HttpHeaders headers = new HttpHeaders();
        return ResponseEntity.ok()
                .headers(headers)
                .contentLength(file.length())
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(resource);
    }

}
