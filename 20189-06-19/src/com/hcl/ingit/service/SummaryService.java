package com.hcl.ingit.service;

import com.hcl.ingit.dto.RegistrationReqDTO;
import com.hcl.ingit.dto.RegistrationResDTO;

public interface SummaryService {

	RegistrationResDTO summaryDetails(RegistrationReqDTO registrationReqDto);

}
