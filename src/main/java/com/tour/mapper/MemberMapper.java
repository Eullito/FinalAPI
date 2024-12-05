package com.tour.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.tour.dtos.MemberDto;

@Mapper
public interface MemberMapper {

	public boolean addUser(MemberDto dto);
	
	public String idChk(String id);
	
	public MemberDto loginUser(String id);
}
