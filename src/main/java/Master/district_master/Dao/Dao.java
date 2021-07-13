package Master.district_master.Dao;

import Master.district_master.entity.DistrictModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Dao extends JpaRepository<DistrictModel, Long> {
}
