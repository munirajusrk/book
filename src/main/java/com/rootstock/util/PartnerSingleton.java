package com.rootstock.util;

import java.util.ArrayList;
import java.util.List;
import com.rootstock.model.Partner;
import com.rootstock.model.PartnerRequest;
import com.rootstock.model.PartnerResponse;

public class PartnerSingleton {

    static List<Partner> partners = new ArrayList<Partner>(){
        {
            add(new Partner("Varun", 30));
            add(new Partner("RB", 38));
            add(new Partner("AB", 37));
            add(new Partner("PB", 12));
            add(new Partner("SB", 4));
            add(new Partner("ROB", 8));
        }
    };

    private PartnerResponse getPartnerResponse() {
        return null;
    }
    public static List<Partner> listPartners() {
        return partners;
    }

    public static void createPerson(Partner partner) {
        partners.add(partner);
    }

    public static void createPerson(PartnerRequest partnerRequest) {
        System.out.println(partnerRequest);
    }

    public static List<Partner> deleteById(Integer age) {
        partners.removeIf(partner -> partner.getAge() == age);
        return partners;
    }

}
