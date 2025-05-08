package com.mashibing.factory.service.impl;

import com.mashibing.factory.entity.AwardInfo;
import com.mashibing.factory.entity.ResponseResult;
import com.mashibing.factory.service.IFreeGoods;

public class DiscountFreeGoods implements IFreeGoods {
    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {
        System.out.println("向用户发放打折券一张: " + awardInfo.getUid() + " , " + awardInfo.getAwardNumber());
        return new ResponseResult("200","打折券发放成功!");
    }
}
