package com.ujiuye.serviceimpl;

import com.ujiuye.pojo.User;
import com.ujiuye.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(Integer id, String username) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        return user;
    }
}
