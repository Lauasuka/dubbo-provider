package io.amoe.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.amoe.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Mr.Amoe
 * @project dubbo-provider
 * @date 2019/4/2 11:35
 */
@Mapper
public interface IUserMapper extends BaseMapper<User> {
}
