package top.fjy8018.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import top.fjy8018.consumer.common.MySink;

/**
 * @author F嘉阳
 * @date 2018-10-08 18:10
 */
@EnableBinding(MySink.class)
public class Consumer {
    @StreamListener(MySink.INPUT)
    public void receive(Message<String> message) {
        System.out.println("接收到MQ消息:" + message);
    }
}