package com.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private Integer uid;
    private String account;
    private String password;
    private Integer isAdmin;//0普通用户1管理员
    private String nickname;
    private String  headSculpture;//头像
}
