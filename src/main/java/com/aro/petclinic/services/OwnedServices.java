package com.aro.petclinic.services;

import com.aro.petclinic.model.Owner;

public interface OwnedServices extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);

}
