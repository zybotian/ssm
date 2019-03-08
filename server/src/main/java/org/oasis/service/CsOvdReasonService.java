package org.oasis.service;

import org.oasis.model.CsOvdReason;
import org.oasis.model.CsOvdReasonExample;
import org.oasis.mybatis.mapper.CsOvdReasonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tianbo
 * @date 2019-03-07
 */
@Service
public class CsOvdReasonService {

    @Autowired
    private CsOvdReasonMapper dao;

    /**
     * 按主键查询
     **/
    public CsOvdReason selectByPrimaryKey(Long id) {
        return dao.selectByPrimaryKey(id);
    }

    /**
     * 按条件查询
     */
    public List<CsOvdReason> selectByExample(CsOvdReasonExample condition) {
        return dao.selectByExample(condition);
    }

    /**
     * 统计
     */
    public long count(CsOvdReasonExample example) {
        return dao.countByExample(example);
    }

    /**
     * 插入
     */
    public int insert(CsOvdReason record) {
        return dao.insert(record);
    }

    /**
     * 选择字段值不为null的插入
     */
    public int insertSelective(CsOvdReason reason) {
        return dao.insertSelective(reason);
    }

    /**
     * 按照主键,全字段更新
     */
    public int updateByPrimaryKey(CsOvdReason reason) {
        return dao.updateByPrimaryKey(reason);
    }

    /**
     * 按照主键, 选择不为null的字段更新
     */
    public int updateByPrimaryKeySelective(CsOvdReason reason) {
        return dao.updateByPrimaryKeySelective(reason);
    }

    /**
     * 更新所有符合example的记录为record
     */
    public int updateByExample(CsOvdReason record, CsOvdReasonExample example) {
        return dao.updateByExample(record, example);
    }

    /**
     * 更新所有符合example的记录为record,如果record的字段为null,则不更新该字段的值
     */
    public int updateByExampleSelective(CsOvdReason reason, CsOvdReasonExample example) {
        return dao.updateByExampleSelective(reason, example);
    }

    /**
     * 按主键删除一条记录
     */
    public int deleteByPrimaryKey(Long id) {
        return dao.deleteByPrimaryKey(id);
    }

    /**
     * 删除符合条件的记录
     */
    public int deleteByExample(CsOvdReasonExample example) {
        return dao.deleteByExample(example);
    }

}
