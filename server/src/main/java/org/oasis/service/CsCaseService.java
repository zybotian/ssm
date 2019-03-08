package org.oasis.service;

import org.oasis.model.CsCase;
import org.oasis.mybatis.mapper.CsCaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tianbo
 * @date 2019-03-08
 */
@Service
public class CsCaseService {

    @Autowired
    private CsCaseMapper dao;

    public CsCase selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }
}
