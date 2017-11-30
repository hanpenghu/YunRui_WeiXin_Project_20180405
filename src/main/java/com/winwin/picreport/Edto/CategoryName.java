package com.winwin.picreport.Edto;

public class CategoryName {
    private String idxName="";//分类名称

    private String idxNo="";//分类编号

    public String getIdxName() {
        return idxName;
    }

    public CategoryName setIdxName(String idxName) {
        this.idxName = idxName;
        return this;
    }

    public String getIdxNo() {
        return idxNo;
    }

    public CategoryName setIdxNo(String idxNo) {
        this.idxNo = idxNo;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Edto.CategoryName{");
        sb.append("idxName='").append(idxName).append('\'');
        sb.append(", idxNo='").append(idxNo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
