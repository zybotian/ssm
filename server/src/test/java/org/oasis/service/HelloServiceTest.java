package org.oasis.service;

import org.oasis.iface.HelloIface;
import org.oasis.model.SexEnum;

/**
 * @author tianbo
 * @date 2019-03-06
 */
public class HelloServiceTest {

    public static void main(String[] args) {
        HelloIface helloService = new HelloService();
        System.out.println(helloService.hello());
        System.out.println(helloService.hello("王二小"));
        System.out.println(helloService.hello("王小二", SexEnum.MALE));
    }
}
