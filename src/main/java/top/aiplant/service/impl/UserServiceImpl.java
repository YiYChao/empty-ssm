package top.aiplant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.aiplant.dao.UserDao;
import top.aiplant.entity.UserModel;
import top.aiplant.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
    private UserDao userDao;

    @Override
    public List<UserModel> getUserList() {
        return userDao.findUserList();
    }
}
