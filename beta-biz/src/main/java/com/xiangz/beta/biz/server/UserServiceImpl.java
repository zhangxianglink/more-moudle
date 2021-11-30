package com.xiangz.beta.biz.server;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiangz.beta.dao.User;
import com.xiangz.beta.dao.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author nuc
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
