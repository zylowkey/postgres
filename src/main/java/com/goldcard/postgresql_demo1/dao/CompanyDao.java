package com.goldcard.postgresql_demo1.dao;

import com.goldcard.postgresql_demo1.entity.Company;

import java.util.List;

/**
 * @description:
 * @author: 1933
 * @createDate: 2020/9/14 7:49 PM
 * @version: 1.0
 */
public interface CompanyDao {
    List<Company> getList();
}
