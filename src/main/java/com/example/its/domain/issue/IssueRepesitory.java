package com.example.its.domain.issue;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IssueRepesitory {
    @Select("SELECT * FROM issues")
    List<IssueEntity> findAll();

    @Insert("INSERT INTO issues (summary, description) VALUES (#{summary}, #{description})")
    void insert(@Param("summary") String summary, @Param("description") String description);

    @Select("SELECT * FROM issues WHERE id = #{issueId}")
    IssueEntity findById(long issueId);
}