package org.daistudy.min.service.impl;

import org.daistudy.min.entity.User;
import org.daistudy.min.mapper.UserDao;
import org.daistudy.min.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean save(User user) {
        int rows = userDao.insert(user);
        return rows >= 1;
    }
}
