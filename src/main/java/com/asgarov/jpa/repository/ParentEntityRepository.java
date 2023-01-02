package com.asgarov.jpa.repository;

import com.asgarov.model.ParentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentEntityRepository extends JpaRepository<ParentEntity, Long> {

}
