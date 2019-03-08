package org.oasis.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.oasis.iface.HelloIface;
import org.oasis.model.SexEnum;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author tianbo
 * @date 2019-03-06
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-test.xml")
public class HelloServiceTest {

    @Resource
    HelloIface helloService;

    @Test
    public void testHello() throws Exception {
        Assert.assertEquals("hello", helloService.hello());
        Assert.assertEquals("hello, 王二小", helloService.hello("王二小"));
        Assert.assertEquals("hello, 王小二先生", helloService.hello("王小二", SexEnum.MALE));
    }
}
