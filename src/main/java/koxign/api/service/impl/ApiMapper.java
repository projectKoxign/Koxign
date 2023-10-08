package koxign.api.service.impl;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import koxign.api.service.ApiVO;

@Mapper
@Repository
public interface ApiMapper {


	void apiIssue(ApiVO vo) throws Exception;
	
		}
