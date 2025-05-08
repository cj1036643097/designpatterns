package com.mashibing.factory.entity;

import lombok.Data;

import java.util.Map;

@Data
public class AwardInfo {

    private String uid; //用户唯一ID

    private Integer awardType; //奖品类型: 1 打折券 ,2 优酷会员,3 小礼品

    private String awardNumber; //奖品编号

    private String awardAddress; //获奖者收获地址信息

    Map<String, String> extMap; //额外信息
}
