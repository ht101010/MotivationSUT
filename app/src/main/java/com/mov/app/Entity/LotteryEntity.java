package com.mov.app.Entity;


import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Lottery")
public class LotteryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "l_id",nullable = false)
    private Integer lotteryId;

    @Column(name = "l_date")
    private Date date;

    @Column(name = "jackpot_first")
    private String jackpotFirst;

    @Column(name = "jackpot_second")
    private String jackpotSecond;

    @Column(name = "jackpot_third")
    private String jackpotThird;

    @Column(name = "jackpot_digit3_front")
    private String jackpotDigit3Front;

    @Column(name = "jackpot_digit3_back")
    private String jackpotDigit3Back;

    @Column(name = "jackpot_digit2_back")
    private String jackpotDigit2Back;

    //++Getter & Setter++
    public Integer getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(Integer lotteryId) {
        this.lotteryId = lotteryId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getJackpotFirst() {
        return jackpotFirst;
    }

    public void setJackpotFirst(String jackpotFirst) {
        this.jackpotFirst = jackpotFirst;
    }

    public String getJackpotSecond() {
        return jackpotSecond;
    }

    public void setJackpotSecond(String jackpotSecond) {
        this.jackpotSecond = jackpotSecond;
    }

    public String getJackpotThird() {
        return jackpotThird;
    }

    public void setJackpotThird(String jackpotThird) {
        this.jackpotThird = jackpotThird;
    }

    public String getJackpotDigit3Front() {
        return jackpotDigit3Front;
    }

    public void setJackpotDigit3Front(String jackpotDigit3Front) {
        this.jackpotDigit3Front = jackpotDigit3Front;
    }

    public String getJackpotDigit3Back() {
        return jackpotDigit3Back;
    }

    public void setJackpotDigit3Back(String jackpotDigit3Back) {
        this.jackpotDigit3Back = jackpotDigit3Back;
    }

    public String getJackpotDigit2Back() {
        return jackpotDigit2Back;
    }

    public void setJackpotDigit2Back(String jackpotDigit2Back) {
        this.jackpotDigit2Back = jackpotDigit2Back;
    }
}