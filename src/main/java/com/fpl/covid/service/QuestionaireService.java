package com.fpl.covid.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpl.covid.entity.Questionaire;

public interface QuestionaireService extends JpaRepository<Questionaire, Long> {

}
