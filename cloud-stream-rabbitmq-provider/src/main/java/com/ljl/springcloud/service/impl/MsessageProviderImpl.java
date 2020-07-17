package com.ljl.springcloud.service.impl;

import cn.hutool.core.lang.UUID;
import com.ljl.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import javax.xml.transform.Source;

/**
 * @author ljl
 * @version 1.0
 * @date 2020-06-21 15:20
 */
@EnableBinding(Source.class)//定义消息的推送管道
public class MsessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output; // 消息发送管道

    @Override
    public String send()
    {
        String serial = UUID.randomUUID().toString();
        //构建消息
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: "+serial);
        return null;
    }
}
