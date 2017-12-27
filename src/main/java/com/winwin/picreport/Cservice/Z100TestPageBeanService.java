package com.winwin.picreport.Cservice;

import com.github.pagehelper.PageHelper;
import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Edto.PrdtSampExample;
import com.winwin.picreport.Futils.PageBean;
import com.winwin.picreport.Edto.PrdtSamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service("zt")
public class Z100TestPageBeanService {

    @Autowired
    private Cnst cnst;
    public List<PrdtSamp> findItemByPage(int currentPage, int pageSize) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        PageHelper.startPage(currentPage, pageSize);
        //由于上面的分页类设置了分页信息,所以,下面这个findAll()不会一下子全部真的findAll
        PrdtSampExample pe=new PrdtSampExample();
        pe.createCriteria().andIdxNameIsNotNull();
        pe.setOrderByClause("id desc");
        List<PrdtSamp> allItems = cnst.prdtSampMapper.selectByExample(pe);        //全部商品
        int countNums = cnst.manyTabSerch.countItem();            //总记录数
        PageBean<PrdtSamp> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }

}
