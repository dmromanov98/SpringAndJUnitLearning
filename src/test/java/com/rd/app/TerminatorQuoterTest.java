package com.rd.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@DisplayName("Quoter Test")
public class TerminatorQuoterTest {

    @Test
    @DisplayName("Testing random")
    public void sayQuote() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:src\\resources\\context.xml");
        while (true) {
            Thread.sleep(100);
            context.getBean(Quoter.class).sayQuote();
        }
    }

}