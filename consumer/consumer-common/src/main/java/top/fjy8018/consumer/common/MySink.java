package top.fjy8018.consumer.common;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author F嘉阳
 * @date 2018-10-08 18:07
 */
public interface MySink {
    String INPUT = "input";

    @Input(Sink.INPUT)
    SubscribableChannel input();
}
