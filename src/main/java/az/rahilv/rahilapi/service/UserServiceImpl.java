package az.rahilv.rahilapi.service;

import az.rahilv.rahilapi.dao.UserDao;
import az.rahilv.rahilapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public User checkUser(String username, String password) {

        return userDao.checkUser(username,password);
    }
}
