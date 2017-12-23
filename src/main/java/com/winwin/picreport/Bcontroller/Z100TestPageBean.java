package com.winwin.picreport.Bcontroller;

import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.InterFaceCnst;
import com.winwin.picreport.Edto.PrdtSamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class Z100TestPageBean {
    @Autowired
    private Cnst cnst;

    /**
     * 商品分页功能(集成mybatis的分页插件pageHelper实现)
     *
     * @param currentPage    :当前页数
     * @param pageSize        :每页显示的总记录数
     * @return
     */
    @RequestMapping(InterFaceCnst.itemsPage)
    @ResponseBody
    public List<PrdtSamp> itemsPage(int currentPage, int pageSize){
        return cnst.zt.findItemByPage(currentPage, pageSize);
    }


}
