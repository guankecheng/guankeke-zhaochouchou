package com.guan.producers;

import com.guan.producers.dao.UserRepository;
import com.guan.producers.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProducersApplicationTests {
    @Autowired
    private UserRepository repository;
    Logger log = LoggerFactory.getLogger(ProducersApplication.class);
    @Test
    public void contextLoads() {

        log.info(repository.findAll().toString());
    }

}
