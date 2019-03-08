package org.oasis.service;

import org.oasis.iface.HelloIface;
import org.oasis.model.SexEnum;
import org.springframework.stereotype.Service;

/**
 * @author tianbo
 * @date 2019-03-06
 */
@Service
public class HelloService implements HelloIface {

    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public String hello(String name) {
        return "hello, " + name;
    }

    @Override
    public String hello(String name, SexEnum sexEnum) {
        return "hello, " + name + sexEnum.getDesc();
    }
}
