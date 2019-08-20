package com.white.ssm.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @ClassName User
 * @Author White.
 * @Date 2019/7/2 20:28
 * @Version 1.0
 * User的实体类
 */
//生成GetterAndSetter方法
@Data
//生成toString方法
@ToString
//打开对象的快速实例化方式,实现链式编程 ->User user =  new User().setId("123L");
@Accessors(chain = true)
public class User {

    /**
     * 声明该字段是对应数据库表中的ID，如属性名不为id时需要使用该注解
     */
    @TableId
    private Long id;

    //用户名
    private String username;

    //密码
    private String password;

}
