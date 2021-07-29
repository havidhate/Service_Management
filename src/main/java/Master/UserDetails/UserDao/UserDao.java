package Master.UserDetails.UserDao;

import Master.UserDetails.UserEntity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserEntity,Long> {
}
