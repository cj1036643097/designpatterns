package com.mashibing.factory.service;

import com.mashibing.factory.entity.AwardInfo;
import com.mashibing.factory.entity.ResponseResult;

public interface IFreeGoods {
    //发放赠品
    ResponseResult sendFreeGoods(AwardInfo awardInfo);
}
