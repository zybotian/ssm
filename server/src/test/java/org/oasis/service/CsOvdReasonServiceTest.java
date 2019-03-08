package org.oasis.service;

import org.junit.*;
import org.junit.runner.RunWith;
import org.oasis.model.CsOvdReason;
import org.oasis.model.CsOvdReasonExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author tianbo
 * @date 2019-03-07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-test.xml")
@Ignore
public class CsOvdReasonServiceTest {

    @Autowired
    private CsOvdReasonService service;

    // 每个@Test执行之前都会执行
    @Before
    public void setUp() throws Exception {
        CsOvdReasonExample example = new CsOvdReasonExample();
        example.createCriteria()
                .andReasonEqualTo("对方已经无法联系上了")
                .andTypeEqualTo(99)
        ;
        service.deleteByExample(example);

        for (int i = 0; i < 10; i++) {
            CsOvdReason generate = generate();
            service.insert(generate);
        }
    }

    // 每个@Test执行之后都会执行
    @After
    public void tearDown() throws Exception {
        CsOvdReasonExample example = new CsOvdReasonExample();
        example.createCriteria()
                .andReasonEqualTo("对方已经无法联系上了")
                .andTypeEqualTo(99)
        ;
        service.deleteByExample(example);
    }

    @Test
    public void testSelectByExample() throws Exception {
        CsOvdReasonExample example = new CsOvdReasonExample();
        example.createCriteria().andTypeEqualTo(99).andReasonEqualTo("对方已经无法联系上了");
        List<CsOvdReason> csOvdReasons = service.selectByExample(example);
        Assert.assertEquals(10, csOvdReasons.size());
        Assert.assertEquals(20190307, csOvdReasons.get(0).getCaseId().intValue());
    }

    @Test
    public void testUpdate() throws Exception {
        CsOvdReasonExample example = new CsOvdReasonExample();
        example.createCriteria().andReasonEqualTo("对方已经无法联系上了");
        CsOvdReason reason = new CsOvdReason();
        reason.setCaseId(2019030809);
        int updated = service.updateByExampleSelective(reason, example);
        Assert.assertEquals(10, updated);

        List<CsOvdReason> csOvdReasons = service.selectByExample(example);
        Assert.assertEquals(10, csOvdReasons.size());
        Assert.assertEquals(2019030809, csOvdReasons.get(0).getCaseId().intValue());

    }

    private CsOvdReason generate() {
        CsOvdReason reason = new CsOvdReason();
        // 设置了id也没用, mybatis使用mysql自动生成的id
        reason.setId(201903071845000L);
        reason.setCaseId(20190307);
        reason.setCreateTime(201903071845000L);
        reason.setUpdateTime(201903071845000L);
        reason.setType(99);
        reason.setReason("对方已经无法联系上了");
        return reason;
    }
}
