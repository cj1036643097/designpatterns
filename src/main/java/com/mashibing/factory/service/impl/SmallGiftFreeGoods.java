package com.mashibing.factory.service.impl;

import com.alibaba.fastjson.JSON;
import com.mashibing.factory.entity.AwardInfo;
import com.mashibing.factory.entity.ResponseResult;
import com.mashibing.factory.entity.SmallGiftInfo;
import com.mashibing.factory.service.IFreeGoods;

import java.util.UUID;

/**
 * 模拟礼品服务
 * @author spikeCong
 * @date 2022/9/8
 **/
public class SmallGiftFreeGoods implements IFreeGoods {

    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {

        SmallGiftInfo smallGiftInfo = new SmallGiftInfo();
        smallGiftInfo.setUserName(awardInfo.getExtMap().get("username"));
        smallGiftInfo.setUserPhone(awardInfo.getExtMap().get("phone"));
        smallGiftInfo.setRelAddress(awardInfo.getExtMap().get("address"));
        smallGiftInfo.setOrderId(UUID.randomUUID().toString());

        System.out.println("小礼品已发货,获奖用户注意查收! " + JSON.toJSON(smallGiftInfo));
        return new ResponseResult("200","赠品: 小礼物发放成功!",smallGiftInfo);
    }

}
