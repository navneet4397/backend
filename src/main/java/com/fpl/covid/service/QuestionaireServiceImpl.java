package com.fpl.covid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpl.covid.entity.Questionaire;

@Service
public class QuestionaireServiceImpl {

	@Autowired
	private QuestionaireService qs;

	public Questionaire save(Questionaire data1) {
		return qs.save(data1);
	}
}
