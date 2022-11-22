package com.rootstock.controller;

import com.rootstock.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/advisory")
public class AdvisoryController {

    /**
     *
     * Crop Cycle and Crop Health will be visible only to CONTENT_MANAGER
     * Advisory is visible only for Assigned CONTENT_MANAGER
     *
     * List Active and Assign Partners from this API
     *
     * Assigned Partners to CONTENT_MANAGER from TENE_ROOTSTOCK
     *
     * @return
     */
    @GetMapping("/list/active/partner")
    public List<PartnerModel> listActivePartners() {
        return Collections.EMPTY_LIST;
    }

    @GetMapping("/list/partner/{cropId}")
    public List<PartnerModel> listActivePartners(@PathVariable("cropId") long cropId) {
        return Collections.EMPTY_LIST;
    }

    @GetMapping("/list/crop/cycle/{partnerId}")
    public List<CropCycle> listCropCycles(@PathVariable("partnerId") Long partnerId) {
        return new ArrayList<>();
    }

    /**
     *
     * Get All Crops Health connected to Diagnostic Architecture
     * Get All Problems connected to each of the crop from CropHealth list
     *
     * @return
     */
    @GetMapping("/list/crop/health")
    public List<CropHealth> listCropHealths() {
        return new ArrayList<>();
    }

    @GetMapping("/list/crop/problem/{partnerId}")
    public List<CropProblem> listCropProblems(@PathVariable("partnerId") Long partnerId) {
        return new ArrayList<>();
    }

    @PostMapping("/crop/cycle/package")
    public PackageResponse createCropPackage(@RequestBody PackageRequest packageRequest) {
        return new PackageResponse();
    }

    @PostMapping("/crop/cycle/package/form")
    public PackageFormResponse createCropPackageForm(@RequestBody PackageFormRequest packageRequest) {
        return new PackageFormResponse();
    }

    @GetMapping("/crop/cycle/packages/{partnerId}/{cropId}")
    public List<PackageResponse> listPackages(@PathVariable("partnerId") long partnerId,
                                              @PathVariable("cropId") long cropId) {
        return new ArrayList<>();
    }

    @GetMapping("/crop/cycle/packages/{partnerId}/{cropId}/{packageId}")
    public List<PackageFormResponse> listPackageForms(@PathVariable("partnerId") long partnerId,
                                                      @PathVariable("cropId") long cropId,
                                                      @PathVariable("packageId") long packageId) {
        return new ArrayList<>();
    }

    /**
     *
     * TENE_CONTENT_MANAGER to whom partners assigned will be listed in dropdown slide-13
     *
     * Select partner to add crops from the list of crops added by TENE_ADMIN while partner creation slide-15
     *
     * Crop can be in-active or active
     *
     *
     *
     */

    /**
     *
     * ProblemGroups which are not assigned to any crop will be automatically
     * assigned to all the crops to create and map problems to partner
     *
     * @param cropProblemPartnerRequest
     * @return
     */
    @PostMapping("/assign/crop/problem")
    public List<CropProblem> assignCropProblemToPartners(@RequestBody CropProblemPartnerRequest cropProblemPartnerRequest) {
        return new ArrayList<>();
    }

    @GetMapping("/crop/health/problem/{partnerId}/{cropId}")
    public List<CropProblem> listCropProblems(@PathVariable("partnerId") Long partnerId,
                                              @PathVariable("cropId") Long cropId) {
        return new ArrayList<>();
    }

    @GetMapping("/crop/health/problem/{partnerId}/{cropId}/{problemId}")
    public List<ProblemFormResponse> listProblemForms(@PathVariable("partnerId") Long partnerId,
                                                      @PathVariable("cropId") Long cropId,
                                                      @PathVariable("problemId") Long problemId) {
        return new ArrayList<>();
    }

    @PostMapping("/crop/health/problem/form")
    public ProblemFormResponse createCropHealthProblemForm(@RequestBody ProblemFormRequest problemFormRequest) {
        return new ProblemFormResponse();
    }
}
