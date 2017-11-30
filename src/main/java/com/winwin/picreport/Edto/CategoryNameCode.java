package com.winwin.picreport.Edto;

import java.util.ArrayList;
import java.util.List;

public class CategoryNameCode {
    private List<String> prdCodeList=new ArrayList<>();//就是prdt中的name

    private String idxName="";//分类名称

    private String idxNo="";//分类编号

    public List<String> getPrdCodeList() {
        return prdCodeList;
    }

    public CategoryNameCode setPrdCodeList(List<String> prdCodeList) {
        this.prdCodeList = prdCodeList;
        return this;
    }

    public String getIdxName() {
        return idxName;
    }

    public CategoryNameCode setIdxName(String idxName) {
        this.idxName = idxName;
        return this;
    }

    public String getIdxNo() {
        return idxNo;
    }

    public CategoryNameCode setIdxNo(String idxNo) {
        this.idxNo = idxNo;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Edto.CategoryNameCode{");
        sb.append("prdCodeList=").append(prdCodeList);
        sb.append(", idxName='").append(idxName).append('\'');
        sb.append(", idxNo='").append(idxNo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
