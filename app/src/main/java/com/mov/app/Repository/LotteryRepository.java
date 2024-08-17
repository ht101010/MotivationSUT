package com.mov.app.Repository;

import com.mov.app.Entity.LotteryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LotteryRepository extends JpaRepository<LotteryEntity,Integer> {
}
//@param