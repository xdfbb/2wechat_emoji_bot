package com.smt.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CiLiuTiJpaRepository extends JpaRepository<CiLiuTiArticel, Long> {

    @Query("SELECT wa FROM CiLiuTiArticel wa WHERE wa.data_id = ?1")
    CiLiuTiArticel findByDataID(long id);
}
