package com.example.demo.service.impl;



import org.junit.jupiter.api.Test;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.when;

@SpringBootTest
public class PpfServiceImplTest {

    @Autowired
    PpfServiceImpl ppfService;




    @Test
    public void get() throws Exception {
        ppfService.get();
    }
}