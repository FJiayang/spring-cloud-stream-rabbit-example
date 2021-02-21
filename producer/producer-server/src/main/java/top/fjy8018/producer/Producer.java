package top.fjy8018.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author F嘉阳
 * @date 2018-10-08 17:57
 */
@RestController
public class Producer {

    @Autowired
    private StreamBridge streamBridge;

    @RequestMapping("/send1")
    public String send1() {
        streamBridge.send("send1", new Date());
        return "success1";
    }

    @RequestMapping("/send2")
    public String send2() {
        streamBridge.send("send2", LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        return "success2";
    }

}
