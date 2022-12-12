package com.aro.petclinic.services;

import com.aro.petclinic.model.Owner;

public interface OwnerServices extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);

}
