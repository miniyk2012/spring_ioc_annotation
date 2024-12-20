package cn.tulingxueyuan.service.impl;

import cn.tulingxueyuan.beans.Role;
import cn.tulingxueyuan.beans.User;
import cn.tulingxueyuan.dao.UserDao;
import cn.tulingxueyuan.service.BaseService;
import cn.tulingxueyuan.service.RoleService;
import cn.tulingxueyuan.service.UserService;
import jdk.jfr.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Service
@Lazy
public class RoleServiceImpl  implements BaseService<Role> {

    @Autowired
    private Role role;

    public RoleServiceImpl() {
        System.out.println("RoleServiceImpl init");
    }

    public Role getBean() {
        System.out.println("RoleServiceImpl");
        return role;
    }

    @Override
    public String toString() {
        return "RoleServiceImpl{" +
            "role=" + role +
            '}';
    }
}
