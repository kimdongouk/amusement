package com.exciting.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	@Select("select * from rides")
	public String getTime();
	
	public String getTime2();
}
