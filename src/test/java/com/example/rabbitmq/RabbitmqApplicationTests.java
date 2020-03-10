package com.example.rabbitmq;

import com.example.rabbitmq.product.MsgProduct;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {

    @Autowired
    MsgProduct msgProduct;

    @Test
    public void contextLoads() {
    }

    @Test
    public void sendMag() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            msgProduct.sendMsg("这是消息" + i);
            Thread.sleep(1000);
        }
    }

}
