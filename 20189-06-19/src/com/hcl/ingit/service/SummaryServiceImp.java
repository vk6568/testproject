package com.hcl.ingit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingit.dto.RegistrationReqDTO;
import com.hcl.ingit.dto.RegistrationResDTO;
import com.hcl.ingit.repository.SummaryRepository;

import ch.qos.logback.classic.Logger;
@Service
public class SummaryServiceImp implements SummaryService {

	@Autowired
	private SummaryRepository summaryRepository;
	@Override
	public RegistrationResDTO summaryDetails(RegistrationReqDTO registrationReqDto) {
		return summaryRepository.findByStudentId(registrationReqDto);
	 
		

	}

}
