package com.mashibing.factory.demo01.controller;

import com.mashibing.factory.entity.AwardInfo;
import com.mashibing.factory.entity.ResponseResult;
import com.mashibing.factory.demo01.factory.FreeGoodsFactory;
import com.mashibing.factory.service.IFreeGoods;
import org.junit.jupiter.api.Test;

public class DeliverController {

    @Test
    public void test() {
        //1. 发放打折券优惠
        AwardInfo info1 = new AwardInfo();
        info1.setUid("1001");
        info1.setAwardType(1);
        info1.setAwardNumber("DEL12345");
        awardToUser(info1);
    }
    public ResponseResult awardToUser(AwardInfo awardInfo) {
        try {
            IFreeGoods freeGoods = FreeGoodsFactory.getInstance(awardInfo.getAwardType());
            ResponseResult responseResult = freeGoods.sendFreeGoods(awardInfo);
            return responseResult;
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseResult("201","奖品发放失败!");
        }
    }
}
