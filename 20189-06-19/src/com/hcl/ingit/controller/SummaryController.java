package com.hcl.ingit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingit.dto.RegistrationReqDTO;
import com.hcl.ingit.dto.RegistrationResDTO;
import com.hcl.ingit.service.SummaryService;

@RestController
@RequestMapping("/")
public class SummaryController {
	@Autowired
	private SummaryService summaryService;

@GetMapping("/ingit/summary/{studentId}")
public ResponseEntity<RegistrationResDTO> getSummary(@RequestBody RegistrationReqDTO registrationReqDto) {
	RegistrationResDTO registratonResDto = summaryService.summaryDetails(registrationReqDto);
	return new ResponseEntity<>(registratonResDto, HttpStatus.OK);
}
}