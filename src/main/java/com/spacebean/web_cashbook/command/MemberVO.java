package com.spacebean.web_cashbook.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemberVO {
  private String userId;
  private String userPw;
  private String userName;
  private String userEmail;
}
