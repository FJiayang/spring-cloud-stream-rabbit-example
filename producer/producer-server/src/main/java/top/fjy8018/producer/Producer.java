package top.fjy8018.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.fjy8018.consumer.common.MySource;

import java.util.Date;

/**
 * @author F嘉阳
 * @date 2018-10-08 17:57
 */
@RestController
public class Producer {

    @Autowired
    private StreamBridge streamBridge;

    @RequestMapping("/send")
    public String send() {
        streamBridge.send(MySource.OUTPUT, new Date());
        return "success";
    }

}
