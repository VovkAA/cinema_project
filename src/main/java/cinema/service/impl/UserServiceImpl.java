package cinema.service.impl;

import cinema.dao.UserDao;
import cinema.library.Inject;
import cinema.library.Service;
import cinema.model.User;
import cinema.service.UserService;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Inject
    UserDao userDao;

    @Override
    public User add(User user) {
        return userDao.add(user);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userDao.findByEmail(email);
    }
}