package com.goldcard.postgresql_demo1.service.impl;

import com.goldcard.postgresql_demo1.dao.CompanyDao;
import com.goldcard.postgresql_demo1.entity.Company;
import com.goldcard.postgresql_demo1.service.ICompanyServie;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: 1933
 * @createDate: 2020/9/14 7:51 PM
 * @version: 1.0
 */
@Service
public class CompanyServieImpl implements ICompanyServie {
    @Resource
    private CompanyDao companyDao;

    @Override
    public List<Company> list() {
        return companyDao.getList();
    }
}
