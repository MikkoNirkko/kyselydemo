package com.kevatsaapas.kyselydemo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kevatsaapas.kyselydemo.domain.Kysymys;
import com.kevatsaapas.kyselydemo.domain.KysymysRepository;

@RestController
public class KyselyController {
	
	@Autowired
	private KysymysRepository repository;
	
	@RequestMapping(value="/kysymykset", method = RequestMethod.GET)
    public @ResponseBody List<Kysymys> kysymykset() {
        return (List<Kysymys>) repository.findAll();
    }
	
}
