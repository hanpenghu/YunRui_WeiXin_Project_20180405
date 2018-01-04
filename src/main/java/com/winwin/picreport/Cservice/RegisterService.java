package com.winwin.picreport.Cservice;

import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Ddao.reportxmlmapper.A001TongYongMapper;
import com.winwin.picreport.Edto.LoginInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegisterService {

    @Autowired
    private Cnst cnst;

    @Transactional
    public void  insertTenantAndUsers(LoginInfo info){
        cnst.a001TongYongMapper.insertTenantAndUsers(info);
    }

    @Transactional
    public void insertUsers(LoginInfo info) {
        cnst.a001TongYongMapper.insertUsers(info);
    }

}
