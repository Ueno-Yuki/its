package com.example.its.domain.issue;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IssueRepesitory {
  @Select("SELECT * FROM issues")
  List<IssueEntity> findAll();
}
