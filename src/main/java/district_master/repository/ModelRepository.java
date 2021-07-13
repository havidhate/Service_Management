package district_master.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import district_master.entity.Model;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ModelRepository extends JpaRepository<Model, Integer> {

}