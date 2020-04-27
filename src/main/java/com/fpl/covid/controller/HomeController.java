package com.fpl.covid.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fpl.covid.entity.ContactInfo;
import com.fpl.covid.entity.Questionaire;
import com.fpl.covid.service.ContactInfoServiceImpl;
import com.fpl.covid.service.QuestionaireServiceImpl;

@CrossOrigin(origins = "*")
@RestController
public class HomeController {

	@Autowired
	private ContactInfoServiceImpl cisi;

	@Autowired
	private QuestionaireServiceImpl qsi;

	@PostMapping("/Users")
	public ContactInfo createUser(@Valid @RequestBody ContactInfo data) {
		return cisi.save(data);
	}

	@PostMapping("/QuestionaireForm")
	public Questionaire createForm(@Valid @RequestBody Questionaire data1) {
		return qsi.save(data1);
	}
}
