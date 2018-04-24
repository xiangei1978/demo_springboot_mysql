package com.davidxl.rocketmq;


import com.alibaba.rocketmq.common.message.MessageExt;

/**
 * Created by xianglei on 2018/4/24.
 */
public interface MqMessageProcessor {


    /**
     * 处理消息的接口
     * @param messageExt
     * @return
     */
    boolean handleMessage(MessageExt messageExt);
}
