package top.fjy8018.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.fjy8018.consumer.common.MySource;

import java.util.Date;

/**
 * @author F嘉阳
 * @date 2018-10-08 17:57
 */
@RestController
@EnableBinding(MySource.class)
public class Producer {

    @Autowired
    private MySource channel;

    @RequestMapping("/send")
    public String send() {
        channel.output().send(MessageBuilder.withPayload(new Date()).build());
        return "success";
    }
}
