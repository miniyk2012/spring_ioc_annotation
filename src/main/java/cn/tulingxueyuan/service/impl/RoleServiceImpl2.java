package cn.tulingxueyuan.service.impl;

import cn.tulingxueyuan.beans.Role;
import cn.tulingxueyuan.service.BaseService;
import cn.tulingxueyuan.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Service
@Lazy
public class RoleServiceImpl2 implements RoleService {

    @Autowired
    private Role role;

    public RoleServiceImpl2() {
        System.out.println("RoleServiceImpl init");
    }

    public void getBean() {
        System.out.println("RoleServiceImpl2");
    }

    @Override
    public String toString() {
        return "RoleServiceImpl2{" +
            "role=" + role +
            '}';
    }
}
