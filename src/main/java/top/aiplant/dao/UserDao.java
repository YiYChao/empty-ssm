package top.aiplant.dao;

import java.util.List;

import top.aiplant.entity.UserModel;

public interface UserDao {

	List<UserModel> findUserList();
}
