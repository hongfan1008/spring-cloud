package com.example;

import com.example.api.ApiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = FeignApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDB {
    @Autowired
    private ApiService apiService;

    @Test
    public void test() {
        try {
            System.out.println(apiService.index());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        try {
            System.out.println(apiService.re());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
