package hiber.service;

import hiber.dao.CarDao;
import hiber.dao.UserDao;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {



   private UserDao userDao;
   private CarDao carDao;

   @Autowired
   public UserServiceImp(UserDao userDao, CarDao carDao) {
      this.userDao = userDao;
      this.carDao = carDao;
   }

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

   @Transactional
   @Override
   public User getByCar(String model, int series) {
      return carDao.getByCar(model, series);
   }

}
