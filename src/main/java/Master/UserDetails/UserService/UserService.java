package Master.UserDetails.UserService;

import Master.UserDetails.UserEntity.UserEntity;

import java.util.List;

public interface UserService {

    public List<UserEntity> getDetails();
    public UserEntity postDetails(UserEntity userEntity);

}
