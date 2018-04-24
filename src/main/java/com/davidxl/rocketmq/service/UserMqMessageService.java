package com.davidxl.rocketmq.service;


import com.alibaba.rocketmq.common.message.MessageExt;
import com.davidxl.rocketmq.MqMessageProcessor;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
/**
 * Created by xianglei on 2018/4/24.
 */
@Service
public class UserMqMessageService implements MqMessageProcessor {

    @Override
    public boolean handleMessage(MessageExt messageExt) {
        try {
            System.out.println("consumer-service==============");
            System.out.println(new String(messageExt.getBody(),"utf-8"));
            return  true;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return false;
    }
}