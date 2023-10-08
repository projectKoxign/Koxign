package koxign.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import koxign.api.service.ApiService;
import koxign.api.service.ApiVO;

@Service
public class ApiServiveImpl implements ApiService {

	@Autowired
	private ApiMapper apiMapper;


		@Override
		public String apiIssue(ApiVO vo) throws Exception {
			return null;
		}
		
	
		
		
	}

