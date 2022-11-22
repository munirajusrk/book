package com.rootstock.controller;

import com.rootstock.model.FarmPunditRequest;
import com.rootstock.model.FarmPunditResponse;
import com.rootstock.model.Status;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pundit")
public class FarmPunditController {

    @PostMapping("/create")
    public FarmPunditResponse createFarmPundit(@RequestBody FarmPunditRequest farmPunditRequest) {
        return new FarmPunditResponse();
    }

    @PostMapping("/update")
    public FarmPunditResponse updateFarmPundit(@RequestBody FarmPunditRequest farmPunditRequest) {
        /**
         * updates roles and status
         */
        return new FarmPunditResponse();
    }

    @PostMapping("/delete/{farmPunditId}")
    public Status deleteFarmPundit(@RequestBody FarmPunditRequest farmPunditRequest) {
        /**
         * updates roles and status
         */
        return Status.SUCCESS;
    }

    @GetMapping("/list")
    public List<FarmPunditResponse> listFarmPunditResponse() {
        return new ArrayList<>();
    }

    @PostMapping("/request/{farmPunditId}")
    public FarmPunditResponse requestFarmPundit(@PathVariable("farmPunditId") long farmPunditId) {
//        long partnerId = PartnerContext.getPartnerId();
        /**
         * store an request entry in db and fetch to farm pundit's as notification
         * farm Pundit will approve by sending farmPunditId and partnerId to which he subscribe
         */
        return new FarmPunditResponse();
    }

    @PostMapping("/approve/{farmPunditId}/{partnerId}")
    public boolean approvePartnerRequest(@PathVariable("farmPunditId") long farmPunditId,
                                         @PathVariable("partnerId") long partnerId) {
        /**
         * create a mapping between partner and farmPundit
         */
        return true;
    }
}
