package com.aro.petclinic.dataloader;

import com.aro.petclinic.model.Owner;
import com.aro.petclinic.model.Vet;
import com.aro.petclinic.services.OwnerService;
import com.aro.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerServices;
    private final VetService  vetService;

    public DataLoader(OwnerService ownerServices, VetService vetService) {
        this.ownerServices = ownerServices;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setFirstName("Artur");
        owner.setLastName("Medrala");

        ownerServices.save(owner);
        System.out.println("Loaded Owners");

        Vet vet = new Vet();

        vet.setFirstName("Dagmara");
        vet.setLastName("Poronczyk");

        vetService.save(vet);
        System.out.println("Loaded Vets");


    }
}
