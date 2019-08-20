package com.white.ssm;

import com.white.ssm.pojo.User;
import com.white.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName UserServcieTest
 * @Author White.
 * @Date 2019/7/2 20:52
 * @Version 1.0
 * 用户业务层测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-service.xml")
public class UserServcieTest {

    /**
     * 注入用户业务层实现类实例化对象
     */
    @Autowired
    private UserService userService;

    /**
     * 测试查询所有方法
     */
    @Test
    public void testFindAll(){
        List<User> userList = userService.list();
        userList.forEach(System.out::println);
    }
}
