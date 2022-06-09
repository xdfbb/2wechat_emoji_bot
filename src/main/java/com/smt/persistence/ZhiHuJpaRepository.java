package com.smt.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ZhiHuJpaRepository extends JpaRepository<ZhiHu, Long> {

    @Query("SELECT wa FROM ZhiHu wa WHERE wa.id = ?1")
    ZhiHu findByID(long id);
}
