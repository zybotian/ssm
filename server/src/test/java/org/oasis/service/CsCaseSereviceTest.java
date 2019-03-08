package org.oasis.service;

import org.junit.*;
import org.junit.runner.RunWith;
import org.oasis.model.CsCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author tianbo
 * @date 2019-03-08
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-test.xml")
@Ignore
public class CsCaseSereviceTest {

    @Autowired
    CsCaseService csCaseService;

    @Test
    public void testSelect() throws Exception {
        CsCase csCase = csCaseService.selectByPrimaryKey(1024373);
        Assert.assertEquals(1024373, csCase.getId().intValue());
    }
}
