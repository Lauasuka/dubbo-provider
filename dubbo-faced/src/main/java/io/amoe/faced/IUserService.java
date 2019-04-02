package io.amoe.faced;

import io.amoe.pojo.User;

import java.util.List;

/**
 * @author Mr.Amoe
 * @project dubbo-provider
 * @date 2019/4/2 11:33
 */
public interface IUserService {
    /**
     * Get users
     * @return user list
     */
    List<User> listUser();

    /**
     * search user by fuzzy name
     * @param name fuzzy name condition
     * @return user list
     */
    List<User> queryUserByName(String name);

    /**
     * search user by fuzzy phone
     * @param phone fuzzy phone condition
     * @return user list
     */
    List<User> queryUserByPhone(String phone);

    /**
     * search user by id
     * @param id user id
     * @return user
     */
    User queryUserById(Long id);

    /**
     * update user
     * @param user user info
     * @return update row count
     */
    int updateUser(User user);
}
