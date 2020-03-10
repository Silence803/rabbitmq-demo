package com.example.rabbitmq.receiver;

import com.example.rabbitmq.config.RabbitMqConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Creat by ZhangXueRong on 2019/7/17
 */
@Component
@RabbitListener(queues = RabbitMqConfig.QUEUE_A)
public class MsgReceiver {

    @RabbitHandler
    public void process(String content) {
        System.out.println("接收处理队列A当中的消息： " + content);
    }


}
