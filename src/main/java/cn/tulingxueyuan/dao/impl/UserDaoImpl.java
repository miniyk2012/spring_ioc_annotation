package cn.tulingxueyuan.dao.impl;

import cn.tulingxueyuan.beans.User;
import cn.tulingxueyuan.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private User user;

    public User getUser() {
        System.out.printf("查询数据库: %s", user);
        return user;
    }


    @Override
    public String toString() {
        return "UserDaoImpl{" +
            "user=" + user +
            '}';
    }
}
