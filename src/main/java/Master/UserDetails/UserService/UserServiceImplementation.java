package Master.UserDetails.UserService;

import Master.UserDetails.UserDao.UserDao;
import Master.UserDetails.UserEntity.UserEntity;
import Master.state_master.Dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements  UserService{

    @Autowired
    public UserDao userDao;


    @Override
    public List<UserEntity> getDetails() {
        return userDao.findAll();
    }

    @Override
    public UserEntity postDetails(UserEntity userEntity) {

        userDao.save(userEntity);
        return userEntity;
    }
}
