package com.white.ssm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.white.ssm.mapper.UserMapper;
import com.white.ssm.pojo.User;
import com.white.ssm.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName UserServiceImpl
 * @Author White.
 * @Date 2019/7/2 20:51
 * @Version 1.0
 * 用户业务层实现类
 */
@Service("userService")
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    /**
     * 根据条件查询结果,并且按照分页要求返回结果
     * @param startPage 当前页
     * @param pageCount 每页显示条数
     * @param like 条件对象
     * @return
     */
    @Override
    public IPage<User> findByWrapper(Integer startPage, Integer pageCount, LambdaQueryWrapper<User> like) {
        Integer initStartPage = startPage == null || startPage <= 0 ? 1 : startPage;
        Integer initPageCount = startPage == null || startPage <= 0 ? 5 : pageCount;
        IPage<User> iPage = this.baseMapper.findByWrapper(new Page<User>(initStartPage,initPageCount),like);
        return iPage;
    }
}
