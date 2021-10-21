package com.example.toyProject;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InfoMapper {
    public InfoVO findRoom(@Param("co") String co);
}
