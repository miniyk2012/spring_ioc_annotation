package cn.tulingxueyuan.service.impl;

import cn.tulingxueyuan.beans.User;
import cn.tulingxueyuan.dao.UserDao;
import cn.tulingxueyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService2Impl implements UserService {

  @Autowired
  UserDao userDao;

  public void getBean() {
    System.out.println("UserServiceImpl2");
  }

  @Override
  public String toString() {
    return "UserServiceImpl2{" +
        "userDao=" + userDao +
        '}';
  }
}
