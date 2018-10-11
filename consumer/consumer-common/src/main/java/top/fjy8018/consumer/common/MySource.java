package top.fjy8018.consumer.common;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author F嘉阳
 * @date 2018-10-08 18:01
 */
public interface MySource {
    String OUTPUT = "output";

    @Output(MySource.OUTPUT)
    MessageChannel output();
}