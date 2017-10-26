package com.redant.mvc.user;

import com.redant.core.bean.annotation.Bean;
import com.redant.mappers.UserMapper;
import com.redant.mybatissist.sqlsession.SqlSessionContext;

@Bean(name="userService")
public class UserServiceImpl implements IUserService{


    /**
     * UserMapper
     */
    private UserMapper userMapper = SqlSessionContext.getSqlSession().getMapper(UserMapper.class);

    @Override
    public UserBean selectUserInfo(Integer id) {
        UserBean user = new UserBean();
        user.setId(id);
        user.setUserName("fakeName");
        return user;
    }

    @Override
    public int selectCount(UserBean bean) {
        if(bean==null){
            bean = new UserBean();
        }
        return userMapper.selectCount(bean);
    }

}