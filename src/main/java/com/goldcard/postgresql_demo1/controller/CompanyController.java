package com.goldcard.postgresql_demo1.controller;

import com.goldcard.postgresql_demo1.entity.Company;
import com.goldcard.postgresql_demo1.service.ICompanyServie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: 1933
 * @createDate: 2020/9/14 7:52 PM
 * @version: 1.0
 */
@RestController
public class CompanyController {
    @Resource
    private ICompanyServie companyServie;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String hello(){
        List<Company> list = companyServie.list();
        list.forEach(t-> System.out.println(t));
        return "success";
    }
}
