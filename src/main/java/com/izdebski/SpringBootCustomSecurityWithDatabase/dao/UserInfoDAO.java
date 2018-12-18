package com.izdebski.SpringBootCustomSecurityWithDatabase.dao;

import com.izdebski.SpringBootCustomSecurityWithDatabase.entity.UserInfo;

public interface UserInfoDAO {
    public abstract UserInfo getActiveUser(String userName);
}