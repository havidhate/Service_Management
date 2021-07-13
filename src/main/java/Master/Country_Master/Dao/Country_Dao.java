package Master.Country_Master.Dao;

import Master.Country_Master.entity.Country_Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Country_Dao extends JpaRepository<Country_Model, Long>{

}
