package com.maodun.service.impl;

import com.maodun.service.Demo2;
import org.springframework.stereotype.Service;

/**
 * @author tongjian
 * @date 2020/7/7 15:04
 */
@Service
public class Demo2Impl extends Demo2 {
    @Override
    public void hello() {
        System.out.println("hello world demo2");
    }
}
