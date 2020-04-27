package com.fpl.covid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpl.covid.entity.ContactInfo;

@Service
public class ContactInfoServiceImpl {

	@Autowired
	private ContactInfoService cis;

	public ContactInfo save(ContactInfo data) {

		return cis.save(data);
	}
}
