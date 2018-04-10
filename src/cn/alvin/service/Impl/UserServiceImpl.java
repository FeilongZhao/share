package cn.alvin.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.alvin.Dao.UserDao;
import cn.alvin.domain.User;
import cn.alvin.service.UserService;

@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User getUserByCodePassword(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, readOnly = false)
    public void saveUser(User user) {
        userDao.save(user);

    }
}
