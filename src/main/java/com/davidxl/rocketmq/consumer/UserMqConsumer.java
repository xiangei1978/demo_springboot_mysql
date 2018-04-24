package com.davidxl.rocketmq.consumer;

import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.davidxl.rocketmq.BaseMqConsumer;
import com.davidxl.rocketmq.service.UserMqMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xianglei on 2018/4/24.
 */
@Configuration
@ConfigurationProperties(prefix = "davidxl.rocketmq.user")
public class UserMqConsumer extends BaseMqConsumer {

    private   String consumerGroup ;

    private   String nameSrvAddr ;

    private   String topic ;

    private   String subExpression ;

    /**
     * 实际消息处理过程
     */
    @Autowired
    UserMqMessageService userMqMessageService;

    @Override
    public String getConsumerGroup() {
        return consumerGroup;
    }

    public void setConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
    }

    public void setNameSrvAddr(String nameSrvAddr) {
        this.nameSrvAddr = nameSrvAddr;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setSubExpression(String subExpression) {
        this.subExpression = subExpression;
    }

    @Override
    public String getNameSrvAddr() {
        return nameSrvAddr;
    }

    @Override
    public String getTopic() {
        return topic;
    }

    @Override
    public String getSubExpression() {
        return subExpression;
    }

    @Bean
    public DefaultMQPushConsumer getUserConsumer() throws MQClientException, InterruptedException {
        return super.getConsumer(userMqMessageService);
    }
}