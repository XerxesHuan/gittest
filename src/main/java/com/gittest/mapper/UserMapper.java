package com.gittest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gittest.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
