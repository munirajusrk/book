package com.rootstock.controller;

import com.rootstock.model.InputSellerRequest;
import com.rootstock.model.InputSellerResponse;
import com.rootstock.model.InputSellerSearchFilter;
import com.rootstock.model.PartnerInputSeller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/seller")
public class InputSellerController {

    @PostMapping("/create")
    public InputSellerResponse createInputSeller(@RequestBody InputSellerRequest inputSellerRequest) {
        return new InputSellerResponse();
    }

    @PostMapping("/list")
    public List<InputSellerResponse> listInputSellers(@RequestBody InputSellerSearchFilter inputSellerSearchFilter) {
        return new ArrayList<>();
    }

    @PostMapping("/add")
    public InputSellerResponse addInputSellers(@RequestBody PartnerInputSeller partnerInputSeller) {
        return new InputSellerResponse();
    }
}
