package com.smt.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface WechatAppletJpaRepository extends JpaRepository<WeixinApplet, Long> {

    @Query("SELECT wa FROM WeixinApplet wa WHERE wa.appID = ?1")
    WeixinApplet findByAppID(String appid);
}
