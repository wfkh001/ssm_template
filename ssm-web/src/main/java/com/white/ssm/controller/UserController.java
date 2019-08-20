package com.white.ssm.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.white.ssm.pojo.ResultJson;
import com.white.ssm.pojo.User;
import com.white.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserController
 * @Author White.
 * @Date 2019/7/2 20:59
 * @Version 1.0
 * 用户的前端请求处理器
 */
@Controller
@RequestMapping("user")
public class UserController {

    /**
     * 注入用户业务实现类实例化对象
     */
    @Autowired
    private UserService userService;

    /**
     * 查询筛选后的结果集,并且按照指定分页返回
     * @param startPage 当前页
     * @param pageCount 每页显示条数
     * @param likeName 模糊查询条件
     * @return
     */
    @RequestMapping("/findByWrapper")
    @ResponseBody
    public ResultJson findByWrapper(Integer startPage , Integer pageCount , String likeName){
        IPage<User> iPage =  userService.findByWrapper(
                startPage,
                pageCount,
                new LambdaQueryWrapper<User>().like(User::getUsername,likeName == null ? "" : likeName));
        Map<String,Object> objectMap = new HashMap<>();
        objectMap.put("iPage",iPage);
        return new ResultJson()
                .setSucceedFlag(iPage.getRecords().size() == 0 ? false : true)
                .setMessage(iPage.getRecords().size() == 0 ? "未查询到结果" : "已查询到结果")
                .setResultMap(objectMap);
    }
}
