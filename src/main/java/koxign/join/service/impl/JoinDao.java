package koxign.join.service.impl;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import koxign.join.service.JoinVO;
@Mapper
@Repository
public interface JoinDao {

	//ID중복체크
	int duplicateCheck(JoinVO vo) throws Exception;
	
	//회원등록
	void insertJoin(JoinVO vo) throws Exception;
	
		}
