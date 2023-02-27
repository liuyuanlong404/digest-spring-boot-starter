package com.lakers.digest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DigestSpringBootStarterApplicationTests {

    @Resource
    private Digest digest;

    @Test
    void contextLoads() {
        System.out.println(digest.digest("123456"));
    }

}
