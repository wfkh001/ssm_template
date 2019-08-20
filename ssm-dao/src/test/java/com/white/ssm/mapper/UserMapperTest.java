package com.white.ssm.mapper;

import com.white.ssm.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName UserMapperTest
 * @Author White.
 * @Date 2019/7/2 20:45
 * @Version 1.0
 * UserMapper的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class UserMapperTest {

    /**
     * 注入userMapper实现类的实例化对象
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * 测试findAll方法
     */
    @Test
    public void testFindAll(){
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
}
