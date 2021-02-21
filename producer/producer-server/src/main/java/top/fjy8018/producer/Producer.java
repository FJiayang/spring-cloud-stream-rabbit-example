package top.fjy8018.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.function.Supplier;

/**
 * @author F嘉阳
 * @date 2018-10-08 17:57
 */
@RestController
public class Producer {

    @Autowired
    private Supplier<Date> supplier;

    @RequestMapping("/send")
    public String send() {
        supplier.get();
        return "success";
    }

}
