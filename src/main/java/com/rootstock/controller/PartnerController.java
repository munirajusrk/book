package com.rootstock.controller;

import com.rootstock.model.ContentManager;
import com.rootstock.model.PartnerModel;
import com.rootstock.model.PartnerRequest;
import com.rootstock.model.PartnerResponse;
import com.rootstock.util.PartnerSingleton;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/partner")
public class PartnerController {


    @GetMapping
    public List<PartnerModel> listPartners() {
        return Collections.EMPTY_LIST;
    }

    @PostMapping
    public PartnerResponse createPartner(@RequestBody PartnerRequest partnerRequest) {
        PartnerSingleton.createPerson(partnerRequest);
        return null;
    }

    @GetMapping("/{partnerId}")
    public PartnerResponse getPartnerById(@PathVariable("partnerId") Long partnerId) {
        return null;
    }

    /**
     *
     * Get Tene CONTENT_MANAGER role users
     *
     */
    @GetMapping("/list/content/manager")
    public List<ContentManager> listContentManagers() {
        return null;
    }
}
