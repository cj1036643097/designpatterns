package com.mashibing.factory.service.impl;

import com.mashibing.factory.entity.AwardInfo;
import com.mashibing.factory.entity.ResponseResult;
import com.mashibing.factory.service.IFreeGoods;

/**
 * 模拟优酷会员服务
 * @author spikeCong
 * @date 2022/9/8
 **/
public class YouKuMemberFreeGoods implements IFreeGoods {

    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {

        String phone = awardInfo.getExtMap().get("phone");
        System.out.println("会员绑定成功,手机号: " + phone);
        return new ResponseResult("200","赠品: 优酷会员发放成功!");
    }
}
