package district_master;

import org.springframework.data.jpa.repository.JpaRepository;


import district_master.Model;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ModelRepository extends JpaRepository<Model, Integer> {

}