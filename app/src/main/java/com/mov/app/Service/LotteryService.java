package com.mov.app.Service;

import com.mov.app.Entity.LotteryEntity;
import com.mov.app.Repository.LotteryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LotteryService {
    @Autowired
    private LotteryRepository lotteryRepository;

    public List getAllLottery() {
        return lotteryRepository.findAll();
    }
    public LotteryEntity saveExample(LotteryEntity lotteryEntity){
        return lotteryRepository.save(lotteryEntity);
    }
}
