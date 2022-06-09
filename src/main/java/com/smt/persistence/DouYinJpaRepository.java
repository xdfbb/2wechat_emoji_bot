package com.smt.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface DouYinJpaRepository extends JpaRepository<DouYin, Long> {

    @Query("SELECT wa FROM DouYin wa WHERE wa.douyin_id = ?1")
    DouYin findByDouYinID(long id);
}
