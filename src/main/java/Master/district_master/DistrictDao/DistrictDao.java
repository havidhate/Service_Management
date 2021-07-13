package Master.district_master.DistrictDao;

import Master.district_master.DistrictEntity.DistrictModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictDao extends JpaRepository<DistrictModel, Long> {
}
