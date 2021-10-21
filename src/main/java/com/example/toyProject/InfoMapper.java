package com.example.toyProject;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InfoMapper {
    public InfoVO findRoom(@Param("co") String co);
    public List<InfoVO> findUser(@Param("co") String co);
    public void enterRoom(@Param("new") InfoVO enter);
    public void exitRoom(@Param("id") String id);
}
