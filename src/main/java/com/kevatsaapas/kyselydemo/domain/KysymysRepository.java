package com.kevatsaapas.kyselydemo.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface KysymysRepository extends CrudRepository <Kysymys, Long>{

}
