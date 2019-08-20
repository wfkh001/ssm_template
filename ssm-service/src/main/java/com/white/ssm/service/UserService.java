package com.white.ssm.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.white.ssm.pojo.User;

/**
 * @InterfaceName UserService
 * @Author White.
 * @Date 2019/7/2 2049
 * @Version 1.0
 * 用户业务层接口
 */
public interface UserService extends IService<User> {

    /**
     * 根据条件查询结果,并且按照分页要求返回结果
     * @param startPage 当前页
     * @param pageCount 每页显示条数
     * @param like 条件对象
     * @return
     */
    IPage<User> findByWrapper(Integer startPage, Integer pageCount, LambdaQueryWrapper<User> like);
}
