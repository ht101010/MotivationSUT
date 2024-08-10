package com.mov.app.Controller;

import com.mov.app.Entity.LotteryEntity;
import com.mov.app.Service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lot")
public class LotteryController {
    @Autowired
    private LotteryService lotteryService;

    @GetMapping
    public List<LotteryEntity> getAllLottery(){
        return lotteryService.getAllLottery();
    }

    @PostMapping
    public LotteryEntity createExample(@RequestBody LotteryEntity lotteryEntity){
        return lotteryService.saveExample(lotteryEntity);
    }
}
