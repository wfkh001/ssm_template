package com.white.ssm.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.white.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @InterfaceName UserMapper
 * @Author White.
 * @Date 2019/7/2 20:37
 * @Version 1.0
 * 用户数据访问层接口
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据条件查询用户
     * @param userPage
     * @param like
     * @return
     */
    IPage<User> findByWrapper(Page<User> userPage,@Param(Constants.WRAPPER) LambdaQueryWrapper<User> like);
}
