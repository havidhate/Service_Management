package Master.state_master.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Master.state_master.entity.Model;

public interface Dao extends JpaRepository<Model, Long>{

}
