package com.mashibing.factory.demo01.factory;

import com.mashibing.factory.service.IFreeGoods;
import com.mashibing.factory.service.impl.DiscountFreeGoods;
import com.mashibing.factory.service.impl.SmallGiftFreeGoods;
import com.mashibing.factory.service.impl.YouKuMemberFreeGoods;

public class FreeGoodsFactory {
    public static IFreeGoods getInstance(Integer awardType) {
        IFreeGoods freeGoods = null;
        switch (awardType) {
            case 1:
                freeGoods = new DiscountFreeGoods();
                break;
            case 2:
                freeGoods = new YouKuMemberFreeGoods();
                break;
            case 3:
                freeGoods = new SmallGiftFreeGoods();
                break;
            default:
                break;
        }
        return freeGoods;
    }
}
