package com.aro.petclinic.dataloader;

import com.aro.petclinic.services.OwnerServices;
import com.aro.petclinic.services.VetService;
import com.aro.petclinic.services.map.OwnerServiceMap;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {

    private final OwnerServices ownerServices;
    private final VetService  vetService;

    public DataLoader(OwnerServices ownerServices, VetService vetService) {
        this.ownerServices = ownerServices;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
       ;
    }
}
