package com.spacebean.web_cashbook.mapper;

import com.spacebean.web_cashbook.command.MemberVO;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
  public int join(MemberVO vo);
}
