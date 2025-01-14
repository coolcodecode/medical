package com.medical.mapper;

import com.medical.entity.Consulting;
import com.medical.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author JiaJieTang
 * @since 2022-08-11
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> findCases(Integer id);

    List<User> byCases(Integer id);

    List<Consulting> selectUser(User user);

    List<User> getUser(Integer id);

    int add(User user);

    int update(User user);

    int upuser(User user);

    int findAll(User user);

    int addid(User user);
}
