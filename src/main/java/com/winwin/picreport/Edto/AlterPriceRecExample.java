package com.winwin.picreport.Edto;

import java.util.ArrayList;
import java.util.List;

public class AlterPriceRecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlterPriceRecExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDingJiaGuanLianIsNull() {
            addCriterion("ding_Jia_Guan_Lian is null");
            return (Criteria) this;
        }

        public Criteria andDingJiaGuanLianIsNotNull() {
            addCriterion("ding_Jia_Guan_Lian is not null");
            return (Criteria) this;
        }

        public Criteria andDingJiaGuanLianEqualTo(String value) {
            addCriterion("ding_Jia_Guan_Lian =", value, "dingJiaGuanLian");
            return (Criteria) this;
        }

        public Criteria andDingJiaGuanLianNotEqualTo(String value) {
            addCriterion("ding_Jia_Guan_Lian <>", value, "dingJiaGuanLian");
            return (Criteria) this;
        }

        public Criteria andDingJiaGuanLianGreaterThan(String value) {
            addCriterion("ding_Jia_Guan_Lian >", value, "dingJiaGuanLian");
            return (Criteria) this;
        }

        public Criteria andDingJiaGuanLianGreaterThanOrEqualTo(String value) {
            addCriterion("ding_Jia_Guan_Lian >=", value, "dingJiaGuanLian");
            return (Criteria) this;
        }

        public Criteria andDingJiaGuanLianLessThan(String value) {
            addCriterion("ding_Jia_Guan_Lian <", value, "dingJiaGuanLian");
            return (Criteria) this;
        }

        public Criteria andDingJiaGuanLianLessThanOrEqualTo(String value) {
            addCriterion("ding_Jia_Guan_Lian <=", value, "dingJiaGuanLian");
            return (Criteria) this;
        }

        public Criteria andDingJiaGuanLianLike(String value) {
            addCriterion("ding_Jia_Guan_Lian like", value, "dingJiaGuanLian");
            return (Criteria) this;
        }

        public Criteria andDingJiaGuanLianNotLike(String value) {
            addCriterion("ding_Jia_Guan_Lian not like", value, "dingJiaGuanLian");
            return (Criteria) this;
        }

        public Criteria andDingJiaGuanLianIn(List<String> values) {
            addCriterion("ding_Jia_Guan_Lian in", values, "dingJiaGuanLian");
            return (Criteria) this;
        }

        public Criteria andDingJiaGuanLianNotIn(List<String> values) {
            addCriterion("ding_Jia_Guan_Lian not in", values, "dingJiaGuanLian");
            return (Criteria) this;
        }

        public Criteria andDingJiaGuanLianBetween(String value1, String value2) {
            addCriterion("ding_Jia_Guan_Lian between", value1, value2, "dingJiaGuanLian");
            return (Criteria) this;
        }

        public Criteria andDingJiaGuanLianNotBetween(String value1, String value2) {
            addCriterion("ding_Jia_Guan_Lian not between", value1, value2, "dingJiaGuanLian");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_Name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_Name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_Name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_Name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_Name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_Name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_Name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_Name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_Name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_Name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_Name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_Name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_Name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("tenant_Id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("tenant_Id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("tenant_Id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("tenant_Id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("tenant_Id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_Id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("tenant_Id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("tenant_Id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("tenant_Id like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("tenant_Id not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("tenant_Id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("tenant_Id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("tenant_Id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("tenant_Id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andAlterTimeIsNull() {
            addCriterion("alter_Time is null");
            return (Criteria) this;
        }

        public Criteria andAlterTimeIsNotNull() {
            addCriterion("alter_Time is not null");
            return (Criteria) this;
        }

        public Criteria andAlterTimeEqualTo(String value) {
            addCriterion("alter_Time =", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeNotEqualTo(String value) {
            addCriterion("alter_Time <>", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeGreaterThan(String value) {
            addCriterion("alter_Time >", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeGreaterThanOrEqualTo(String value) {
            addCriterion("alter_Time >=", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeLessThan(String value) {
            addCriterion("alter_Time <", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeLessThanOrEqualTo(String value) {
            addCriterion("alter_Time <=", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeLike(String value) {
            addCriterion("alter_Time like", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeNotLike(String value) {
            addCriterion("alter_Time not like", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeIn(List<String> values) {
            addCriterion("alter_Time in", values, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeNotIn(List<String> values) {
            addCriterion("alter_Time not in", values, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeBetween(String value1, String value2) {
            addCriterion("alter_Time between", value1, value2, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeNotBetween(String value1, String value2) {
            addCriterion("alter_Time not between", value1, value2, "alterTime");
            return (Criteria) this;
        }

        public Criteria andPrdtCodeIsNull() {
            addCriterion("prdt_Code is null");
            return (Criteria) this;
        }

        public Criteria andPrdtCodeIsNotNull() {
            addCriterion("prdt_Code is not null");
            return (Criteria) this;
        }

        public Criteria andPrdtCodeEqualTo(String value) {
            addCriterion("prdt_Code =", value, "prdtCode");
            return (Criteria) this;
        }

        public Criteria andPrdtCodeNotEqualTo(String value) {
            addCriterion("prdt_Code <>", value, "prdtCode");
            return (Criteria) this;
        }

        public Criteria andPrdtCodeGreaterThan(String value) {
            addCriterion("prdt_Code >", value, "prdtCode");
            return (Criteria) this;
        }

        public Criteria andPrdtCodeGreaterThanOrEqualTo(String value) {
            addCriterion("prdt_Code >=", value, "prdtCode");
            return (Criteria) this;
        }

        public Criteria andPrdtCodeLessThan(String value) {
            addCriterion("prdt_Code <", value, "prdtCode");
            return (Criteria) this;
        }

        public Criteria andPrdtCodeLessThanOrEqualTo(String value) {
            addCriterion("prdt_Code <=", value, "prdtCode");
            return (Criteria) this;
        }

        public Criteria andPrdtCodeLike(String value) {
            addCriterion("prdt_Code like", value, "prdtCode");
            return (Criteria) this;
        }

        public Criteria andPrdtCodeNotLike(String value) {
            addCriterion("prdt_Code not like", value, "prdtCode");
            return (Criteria) this;
        }

        public Criteria andPrdtCodeIn(List<String> values) {
            addCriterion("prdt_Code in", values, "prdtCode");
            return (Criteria) this;
        }

        public Criteria andPrdtCodeNotIn(List<String> values) {
            addCriterion("prdt_Code not in", values, "prdtCode");
            return (Criteria) this;
        }

        public Criteria andPrdtCodeBetween(String value1, String value2) {
            addCriterion("prdt_Code between", value1, value2, "prdtCode");
            return (Criteria) this;
        }

        public Criteria andPrdtCodeNotBetween(String value1, String value2) {
            addCriterion("prdt_Code not between", value1, value2, "prdtCode");
            return (Criteria) this;
        }

        public Criteria andPrdtSampUuidIsNull() {
            addCriterion("prdt_Samp_Uuid is null");
            return (Criteria) this;
        }

        public Criteria andPrdtSampUuidIsNotNull() {
            addCriterion("prdt_Samp_Uuid is not null");
            return (Criteria) this;
        }

        public Criteria andPrdtSampUuidEqualTo(String value) {
            addCriterion("prdt_Samp_Uuid =", value, "prdtSampUuid");
            return (Criteria) this;
        }

        public Criteria andPrdtSampUuidNotEqualTo(String value) {
            addCriterion("prdt_Samp_Uuid <>", value, "prdtSampUuid");
            return (Criteria) this;
        }

        public Criteria andPrdtSampUuidGreaterThan(String value) {
            addCriterion("prdt_Samp_Uuid >", value, "prdtSampUuid");
            return (Criteria) this;
        }

        public Criteria andPrdtSampUuidGreaterThanOrEqualTo(String value) {
            addCriterion("prdt_Samp_Uuid >=", value, "prdtSampUuid");
            return (Criteria) this;
        }

        public Criteria andPrdtSampUuidLessThan(String value) {
            addCriterion("prdt_Samp_Uuid <", value, "prdtSampUuid");
            return (Criteria) this;
        }

        public Criteria andPrdtSampUuidLessThanOrEqualTo(String value) {
            addCriterion("prdt_Samp_Uuid <=", value, "prdtSampUuid");
            return (Criteria) this;
        }

        public Criteria andPrdtSampUuidLike(String value) {
            addCriterion("prdt_Samp_Uuid like", value, "prdtSampUuid");
            return (Criteria) this;
        }

        public Criteria andPrdtSampUuidNotLike(String value) {
            addCriterion("prdt_Samp_Uuid not like", value, "prdtSampUuid");
            return (Criteria) this;
        }

        public Criteria andPrdtSampUuidIn(List<String> values) {
            addCriterion("prdt_Samp_Uuid in", values, "prdtSampUuid");
            return (Criteria) this;
        }

        public Criteria andPrdtSampUuidNotIn(List<String> values) {
            addCriterion("prdt_Samp_Uuid not in", values, "prdtSampUuid");
            return (Criteria) this;
        }

        public Criteria andPrdtSampUuidBetween(String value1, String value2) {
            addCriterion("prdt_Samp_Uuid between", value1, value2, "prdtSampUuid");
            return (Criteria) this;
        }

        public Criteria andPrdtSampUuidNotBetween(String value1, String value2) {
            addCriterion("prdt_Samp_Uuid not between", value1, value2, "prdtSampUuid");
            return (Criteria) this;
        }

        public Criteria andQtyBeforeIsNull() {
            addCriterion("qty_Before is null");
            return (Criteria) this;
        }

        public Criteria andQtyBeforeIsNotNull() {
            addCriterion("qty_Before is not null");
            return (Criteria) this;
        }

        public Criteria andQtyBeforeEqualTo(String value) {
            addCriterion("qty_Before =", value, "qtyBefore");
            return (Criteria) this;
        }

        public Criteria andQtyBeforeNotEqualTo(String value) {
            addCriterion("qty_Before <>", value, "qtyBefore");
            return (Criteria) this;
        }

        public Criteria andQtyBeforeGreaterThan(String value) {
            addCriterion("qty_Before >", value, "qtyBefore");
            return (Criteria) this;
        }

        public Criteria andQtyBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("qty_Before >=", value, "qtyBefore");
            return (Criteria) this;
        }

        public Criteria andQtyBeforeLessThan(String value) {
            addCriterion("qty_Before <", value, "qtyBefore");
            return (Criteria) this;
        }

        public Criteria andQtyBeforeLessThanOrEqualTo(String value) {
            addCriterion("qty_Before <=", value, "qtyBefore");
            return (Criteria) this;
        }

        public Criteria andQtyBeforeLike(String value) {
            addCriterion("qty_Before like", value, "qtyBefore");
            return (Criteria) this;
        }

        public Criteria andQtyBeforeNotLike(String value) {
            addCriterion("qty_Before not like", value, "qtyBefore");
            return (Criteria) this;
        }

        public Criteria andQtyBeforeIn(List<String> values) {
            addCriterion("qty_Before in", values, "qtyBefore");
            return (Criteria) this;
        }

        public Criteria andQtyBeforeNotIn(List<String> values) {
            addCriterion("qty_Before not in", values, "qtyBefore");
            return (Criteria) this;
        }

        public Criteria andQtyBeforeBetween(String value1, String value2) {
            addCriterion("qty_Before between", value1, value2, "qtyBefore");
            return (Criteria) this;
        }

        public Criteria andQtyBeforeNotBetween(String value1, String value2) {
            addCriterion("qty_Before not between", value1, value2, "qtyBefore");
            return (Criteria) this;
        }

        public Criteria andQtyAfterIsNull() {
            addCriterion("qty_After is null");
            return (Criteria) this;
        }

        public Criteria andQtyAfterIsNotNull() {
            addCriterion("qty_After is not null");
            return (Criteria) this;
        }

        public Criteria andQtyAfterEqualTo(String value) {
            addCriterion("qty_After =", value, "qtyAfter");
            return (Criteria) this;
        }

        public Criteria andQtyAfterNotEqualTo(String value) {
            addCriterion("qty_After <>", value, "qtyAfter");
            return (Criteria) this;
        }

        public Criteria andQtyAfterGreaterThan(String value) {
            addCriterion("qty_After >", value, "qtyAfter");
            return (Criteria) this;
        }

        public Criteria andQtyAfterGreaterThanOrEqualTo(String value) {
            addCriterion("qty_After >=", value, "qtyAfter");
            return (Criteria) this;
        }

        public Criteria andQtyAfterLessThan(String value) {
            addCriterion("qty_After <", value, "qtyAfter");
            return (Criteria) this;
        }

        public Criteria andQtyAfterLessThanOrEqualTo(String value) {
            addCriterion("qty_After <=", value, "qtyAfter");
            return (Criteria) this;
        }

        public Criteria andQtyAfterLike(String value) {
            addCriterion("qty_After like", value, "qtyAfter");
            return (Criteria) this;
        }

        public Criteria andQtyAfterNotLike(String value) {
            addCriterion("qty_After not like", value, "qtyAfter");
            return (Criteria) this;
        }

        public Criteria andQtyAfterIn(List<String> values) {
            addCriterion("qty_After in", values, "qtyAfter");
            return (Criteria) this;
        }

        public Criteria andQtyAfterNotIn(List<String> values) {
            addCriterion("qty_After not in", values, "qtyAfter");
            return (Criteria) this;
        }

        public Criteria andQtyAfterBetween(String value1, String value2) {
            addCriterion("qty_After between", value1, value2, "qtyAfter");
            return (Criteria) this;
        }

        public Criteria andQtyAfterNotBetween(String value1, String value2) {
            addCriterion("qty_After not between", value1, value2, "qtyAfter");
            return (Criteria) this;
        }

        public Criteria andUpBeforeIsNull() {
            addCriterion("up_Before is null");
            return (Criteria) this;
        }

        public Criteria andUpBeforeIsNotNull() {
            addCriterion("up_Before is not null");
            return (Criteria) this;
        }

        public Criteria andUpBeforeEqualTo(String value) {
            addCriterion("up_Before =", value, "upBefore");
            return (Criteria) this;
        }

        public Criteria andUpBeforeNotEqualTo(String value) {
            addCriterion("up_Before <>", value, "upBefore");
            return (Criteria) this;
        }

        public Criteria andUpBeforeGreaterThan(String value) {
            addCriterion("up_Before >", value, "upBefore");
            return (Criteria) this;
        }

        public Criteria andUpBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("up_Before >=", value, "upBefore");
            return (Criteria) this;
        }

        public Criteria andUpBeforeLessThan(String value) {
            addCriterion("up_Before <", value, "upBefore");
            return (Criteria) this;
        }

        public Criteria andUpBeforeLessThanOrEqualTo(String value) {
            addCriterion("up_Before <=", value, "upBefore");
            return (Criteria) this;
        }

        public Criteria andUpBeforeLike(String value) {
            addCriterion("up_Before like", value, "upBefore");
            return (Criteria) this;
        }

        public Criteria andUpBeforeNotLike(String value) {
            addCriterion("up_Before not like", value, "upBefore");
            return (Criteria) this;
        }

        public Criteria andUpBeforeIn(List<String> values) {
            addCriterion("up_Before in", values, "upBefore");
            return (Criteria) this;
        }

        public Criteria andUpBeforeNotIn(List<String> values) {
            addCriterion("up_Before not in", values, "upBefore");
            return (Criteria) this;
        }

        public Criteria andUpBeforeBetween(String value1, String value2) {
            addCriterion("up_Before between", value1, value2, "upBefore");
            return (Criteria) this;
        }

        public Criteria andUpBeforeNotBetween(String value1, String value2) {
            addCriterion("up_Before not between", value1, value2, "upBefore");
            return (Criteria) this;
        }

        public Criteria andUpAfterIsNull() {
            addCriterion("up_After is null");
            return (Criteria) this;
        }

        public Criteria andUpAfterIsNotNull() {
            addCriterion("up_After is not null");
            return (Criteria) this;
        }

        public Criteria andUpAfterEqualTo(String value) {
            addCriterion("up_After =", value, "upAfter");
            return (Criteria) this;
        }

        public Criteria andUpAfterNotEqualTo(String value) {
            addCriterion("up_After <>", value, "upAfter");
            return (Criteria) this;
        }

        public Criteria andUpAfterGreaterThan(String value) {
            addCriterion("up_After >", value, "upAfter");
            return (Criteria) this;
        }

        public Criteria andUpAfterGreaterThanOrEqualTo(String value) {
            addCriterion("up_After >=", value, "upAfter");
            return (Criteria) this;
        }

        public Criteria andUpAfterLessThan(String value) {
            addCriterion("up_After <", value, "upAfter");
            return (Criteria) this;
        }

        public Criteria andUpAfterLessThanOrEqualTo(String value) {
            addCriterion("up_After <=", value, "upAfter");
            return (Criteria) this;
        }

        public Criteria andUpAfterLike(String value) {
            addCriterion("up_After like", value, "upAfter");
            return (Criteria) this;
        }

        public Criteria andUpAfterNotLike(String value) {
            addCriterion("up_After not like", value, "upAfter");
            return (Criteria) this;
        }

        public Criteria andUpAfterIn(List<String> values) {
            addCriterion("up_After in", values, "upAfter");
            return (Criteria) this;
        }

        public Criteria andUpAfterNotIn(List<String> values) {
            addCriterion("up_After not in", values, "upAfter");
            return (Criteria) this;
        }

        public Criteria andUpAfterBetween(String value1, String value2) {
            addCriterion("up_After between", value1, value2, "upAfter");
            return (Criteria) this;
        }

        public Criteria andUpAfterNotBetween(String value1, String value2) {
            addCriterion("up_After not between", value1, value2, "upAfter");
            return (Criteria) this;
        }

        public Criteria andUnitBeforeIsNull() {
            addCriterion("unit_Before is null");
            return (Criteria) this;
        }

        public Criteria andUnitBeforeIsNotNull() {
            addCriterion("unit_Before is not null");
            return (Criteria) this;
        }

        public Criteria andUnitBeforeEqualTo(String value) {
            addCriterion("unit_Before =", value, "unitBefore");
            return (Criteria) this;
        }

        public Criteria andUnitBeforeNotEqualTo(String value) {
            addCriterion("unit_Before <>", value, "unitBefore");
            return (Criteria) this;
        }

        public Criteria andUnitBeforeGreaterThan(String value) {
            addCriterion("unit_Before >", value, "unitBefore");
            return (Criteria) this;
        }

        public Criteria andUnitBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("unit_Before >=", value, "unitBefore");
            return (Criteria) this;
        }

        public Criteria andUnitBeforeLessThan(String value) {
            addCriterion("unit_Before <", value, "unitBefore");
            return (Criteria) this;
        }

        public Criteria andUnitBeforeLessThanOrEqualTo(String value) {
            addCriterion("unit_Before <=", value, "unitBefore");
            return (Criteria) this;
        }

        public Criteria andUnitBeforeLike(String value) {
            addCriterion("unit_Before like", value, "unitBefore");
            return (Criteria) this;
        }

        public Criteria andUnitBeforeNotLike(String value) {
            addCriterion("unit_Before not like", value, "unitBefore");
            return (Criteria) this;
        }

        public Criteria andUnitBeforeIn(List<String> values) {
            addCriterion("unit_Before in", values, "unitBefore");
            return (Criteria) this;
        }

        public Criteria andUnitBeforeNotIn(List<String> values) {
            addCriterion("unit_Before not in", values, "unitBefore");
            return (Criteria) this;
        }

        public Criteria andUnitBeforeBetween(String value1, String value2) {
            addCriterion("unit_Before between", value1, value2, "unitBefore");
            return (Criteria) this;
        }

        public Criteria andUnitBeforeNotBetween(String value1, String value2) {
            addCriterion("unit_Before not between", value1, value2, "unitBefore");
            return (Criteria) this;
        }

        public Criteria andUnitAfterIsNull() {
            addCriterion("unit_After is null");
            return (Criteria) this;
        }

        public Criteria andUnitAfterIsNotNull() {
            addCriterion("unit_After is not null");
            return (Criteria) this;
        }

        public Criteria andUnitAfterEqualTo(String value) {
            addCriterion("unit_After =", value, "unitAfter");
            return (Criteria) this;
        }

        public Criteria andUnitAfterNotEqualTo(String value) {
            addCriterion("unit_After <>", value, "unitAfter");
            return (Criteria) this;
        }

        public Criteria andUnitAfterGreaterThan(String value) {
            addCriterion("unit_After >", value, "unitAfter");
            return (Criteria) this;
        }

        public Criteria andUnitAfterGreaterThanOrEqualTo(String value) {
            addCriterion("unit_After >=", value, "unitAfter");
            return (Criteria) this;
        }

        public Criteria andUnitAfterLessThan(String value) {
            addCriterion("unit_After <", value, "unitAfter");
            return (Criteria) this;
        }

        public Criteria andUnitAfterLessThanOrEqualTo(String value) {
            addCriterion("unit_After <=", value, "unitAfter");
            return (Criteria) this;
        }

        public Criteria andUnitAfterLike(String value) {
            addCriterion("unit_After like", value, "unitAfter");
            return (Criteria) this;
        }

        public Criteria andUnitAfterNotLike(String value) {
            addCriterion("unit_After not like", value, "unitAfter");
            return (Criteria) this;
        }

        public Criteria andUnitAfterIn(List<String> values) {
            addCriterion("unit_After in", values, "unitAfter");
            return (Criteria) this;
        }

        public Criteria andUnitAfterNotIn(List<String> values) {
            addCriterion("unit_After not in", values, "unitAfter");
            return (Criteria) this;
        }

        public Criteria andUnitAfterBetween(String value1, String value2) {
            addCriterion("unit_After between", value1, value2, "unitAfter");
            return (Criteria) this;
        }

        public Criteria andUnitAfterNotBetween(String value1, String value2) {
            addCriterion("unit_After not between", value1, value2, "unitAfter");
            return (Criteria) this;
        }

        public Criteria andRemFrontBeforeIsNull() {
            addCriterion("rem_Front_Before is null");
            return (Criteria) this;
        }

        public Criteria andRemFrontBeforeIsNotNull() {
            addCriterion("rem_Front_Before is not null");
            return (Criteria) this;
        }

        public Criteria andRemFrontBeforeEqualTo(String value) {
            addCriterion("rem_Front_Before =", value, "remFrontBefore");
            return (Criteria) this;
        }

        public Criteria andRemFrontBeforeNotEqualTo(String value) {
            addCriterion("rem_Front_Before <>", value, "remFrontBefore");
            return (Criteria) this;
        }

        public Criteria andRemFrontBeforeGreaterThan(String value) {
            addCriterion("rem_Front_Before >", value, "remFrontBefore");
            return (Criteria) this;
        }

        public Criteria andRemFrontBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("rem_Front_Before >=", value, "remFrontBefore");
            return (Criteria) this;
        }

        public Criteria andRemFrontBeforeLessThan(String value) {
            addCriterion("rem_Front_Before <", value, "remFrontBefore");
            return (Criteria) this;
        }

        public Criteria andRemFrontBeforeLessThanOrEqualTo(String value) {
            addCriterion("rem_Front_Before <=", value, "remFrontBefore");
            return (Criteria) this;
        }

        public Criteria andRemFrontBeforeLike(String value) {
            addCriterion("rem_Front_Before like", value, "remFrontBefore");
            return (Criteria) this;
        }

        public Criteria andRemFrontBeforeNotLike(String value) {
            addCriterion("rem_Front_Before not like", value, "remFrontBefore");
            return (Criteria) this;
        }

        public Criteria andRemFrontBeforeIn(List<String> values) {
            addCriterion("rem_Front_Before in", values, "remFrontBefore");
            return (Criteria) this;
        }

        public Criteria andRemFrontBeforeNotIn(List<String> values) {
            addCriterion("rem_Front_Before not in", values, "remFrontBefore");
            return (Criteria) this;
        }

        public Criteria andRemFrontBeforeBetween(String value1, String value2) {
            addCriterion("rem_Front_Before between", value1, value2, "remFrontBefore");
            return (Criteria) this;
        }

        public Criteria andRemFrontBeforeNotBetween(String value1, String value2) {
            addCriterion("rem_Front_Before not between", value1, value2, "remFrontBefore");
            return (Criteria) this;
        }

        public Criteria andRemFrontAfterIsNull() {
            addCriterion("rem_Front_After is null");
            return (Criteria) this;
        }

        public Criteria andRemFrontAfterIsNotNull() {
            addCriterion("rem_Front_After is not null");
            return (Criteria) this;
        }

        public Criteria andRemFrontAfterEqualTo(String value) {
            addCriterion("rem_Front_After =", value, "remFrontAfter");
            return (Criteria) this;
        }

        public Criteria andRemFrontAfterNotEqualTo(String value) {
            addCriterion("rem_Front_After <>", value, "remFrontAfter");
            return (Criteria) this;
        }

        public Criteria andRemFrontAfterGreaterThan(String value) {
            addCriterion("rem_Front_After >", value, "remFrontAfter");
            return (Criteria) this;
        }

        public Criteria andRemFrontAfterGreaterThanOrEqualTo(String value) {
            addCriterion("rem_Front_After >=", value, "remFrontAfter");
            return (Criteria) this;
        }

        public Criteria andRemFrontAfterLessThan(String value) {
            addCriterion("rem_Front_After <", value, "remFrontAfter");
            return (Criteria) this;
        }

        public Criteria andRemFrontAfterLessThanOrEqualTo(String value) {
            addCriterion("rem_Front_After <=", value, "remFrontAfter");
            return (Criteria) this;
        }

        public Criteria andRemFrontAfterLike(String value) {
            addCriterion("rem_Front_After like", value, "remFrontAfter");
            return (Criteria) this;
        }

        public Criteria andRemFrontAfterNotLike(String value) {
            addCriterion("rem_Front_After not like", value, "remFrontAfter");
            return (Criteria) this;
        }

        public Criteria andRemFrontAfterIn(List<String> values) {
            addCriterion("rem_Front_After in", values, "remFrontAfter");
            return (Criteria) this;
        }

        public Criteria andRemFrontAfterNotIn(List<String> values) {
            addCriterion("rem_Front_After not in", values, "remFrontAfter");
            return (Criteria) this;
        }

        public Criteria andRemFrontAfterBetween(String value1, String value2) {
            addCriterion("rem_Front_After between", value1, value2, "remFrontAfter");
            return (Criteria) this;
        }

        public Criteria andRemFrontAfterNotBetween(String value1, String value2) {
            addCriterion("rem_Front_After not between", value1, value2, "remFrontAfter");
            return (Criteria) this;
        }

        public Criteria andBilTypeIsNull() {
            addCriterion("bil_Type is null");
            return (Criteria) this;
        }

        public Criteria andBilTypeIsNotNull() {
            addCriterion("bil_Type is not null");
            return (Criteria) this;
        }

        public Criteria andBilTypeEqualTo(String value) {
            addCriterion("bil_Type =", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotEqualTo(String value) {
            addCriterion("bil_Type <>", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeGreaterThan(String value) {
            addCriterion("bil_Type >", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bil_Type >=", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLessThan(String value) {
            addCriterion("bil_Type <", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLessThanOrEqualTo(String value) {
            addCriterion("bil_Type <=", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLike(String value) {
            addCriterion("bil_Type like", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotLike(String value) {
            addCriterion("bil_Type not like", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeIn(List<String> values) {
            addCriterion("bil_Type in", values, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotIn(List<String> values) {
            addCriterion("bil_Type not in", values, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeBetween(String value1, String value2) {
            addCriterion("bil_Type between", value1, value2, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotBetween(String value1, String value2) {
            addCriterion("bil_Type not between", value1, value2, "bilType");
            return (Criteria) this;
        }

        public Criteria andCurIdBeforeIsNull() {
            addCriterion("cur_Id_Before is null");
            return (Criteria) this;
        }

        public Criteria andCurIdBeforeIsNotNull() {
            addCriterion("cur_Id_Before is not null");
            return (Criteria) this;
        }

        public Criteria andCurIdBeforeEqualTo(String value) {
            addCriterion("cur_Id_Before =", value, "curIdBefore");
            return (Criteria) this;
        }

        public Criteria andCurIdBeforeNotEqualTo(String value) {
            addCriterion("cur_Id_Before <>", value, "curIdBefore");
            return (Criteria) this;
        }

        public Criteria andCurIdBeforeGreaterThan(String value) {
            addCriterion("cur_Id_Before >", value, "curIdBefore");
            return (Criteria) this;
        }

        public Criteria andCurIdBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("cur_Id_Before >=", value, "curIdBefore");
            return (Criteria) this;
        }

        public Criteria andCurIdBeforeLessThan(String value) {
            addCriterion("cur_Id_Before <", value, "curIdBefore");
            return (Criteria) this;
        }

        public Criteria andCurIdBeforeLessThanOrEqualTo(String value) {
            addCriterion("cur_Id_Before <=", value, "curIdBefore");
            return (Criteria) this;
        }

        public Criteria andCurIdBeforeLike(String value) {
            addCriterion("cur_Id_Before like", value, "curIdBefore");
            return (Criteria) this;
        }

        public Criteria andCurIdBeforeNotLike(String value) {
            addCriterion("cur_Id_Before not like", value, "curIdBefore");
            return (Criteria) this;
        }

        public Criteria andCurIdBeforeIn(List<String> values) {
            addCriterion("cur_Id_Before in", values, "curIdBefore");
            return (Criteria) this;
        }

        public Criteria andCurIdBeforeNotIn(List<String> values) {
            addCriterion("cur_Id_Before not in", values, "curIdBefore");
            return (Criteria) this;
        }

        public Criteria andCurIdBeforeBetween(String value1, String value2) {
            addCriterion("cur_Id_Before between", value1, value2, "curIdBefore");
            return (Criteria) this;
        }

        public Criteria andCurIdBeforeNotBetween(String value1, String value2) {
            addCriterion("cur_Id_Before not between", value1, value2, "curIdBefore");
            return (Criteria) this;
        }

        public Criteria andCurIdAfterIsNull() {
            addCriterion("cur_Id_After is null");
            return (Criteria) this;
        }

        public Criteria andCurIdAfterIsNotNull() {
            addCriterion("cur_Id_After is not null");
            return (Criteria) this;
        }

        public Criteria andCurIdAfterEqualTo(String value) {
            addCriterion("cur_Id_After =", value, "curIdAfter");
            return (Criteria) this;
        }

        public Criteria andCurIdAfterNotEqualTo(String value) {
            addCriterion("cur_Id_After <>", value, "curIdAfter");
            return (Criteria) this;
        }

        public Criteria andCurIdAfterGreaterThan(String value) {
            addCriterion("cur_Id_After >", value, "curIdAfter");
            return (Criteria) this;
        }

        public Criteria andCurIdAfterGreaterThanOrEqualTo(String value) {
            addCriterion("cur_Id_After >=", value, "curIdAfter");
            return (Criteria) this;
        }

        public Criteria andCurIdAfterLessThan(String value) {
            addCriterion("cur_Id_After <", value, "curIdAfter");
            return (Criteria) this;
        }

        public Criteria andCurIdAfterLessThanOrEqualTo(String value) {
            addCriterion("cur_Id_After <=", value, "curIdAfter");
            return (Criteria) this;
        }

        public Criteria andCurIdAfterLike(String value) {
            addCriterion("cur_Id_After like", value, "curIdAfter");
            return (Criteria) this;
        }

        public Criteria andCurIdAfterNotLike(String value) {
            addCriterion("cur_Id_After not like", value, "curIdAfter");
            return (Criteria) this;
        }

        public Criteria andCurIdAfterIn(List<String> values) {
            addCriterion("cur_Id_After in", values, "curIdAfter");
            return (Criteria) this;
        }

        public Criteria andCurIdAfterNotIn(List<String> values) {
            addCriterion("cur_Id_After not in", values, "curIdAfter");
            return (Criteria) this;
        }

        public Criteria andCurIdAfterBetween(String value1, String value2) {
            addCriterion("cur_Id_After between", value1, value2, "curIdAfter");
            return (Criteria) this;
        }

        public Criteria andCurIdAfterNotBetween(String value1, String value2) {
            addCriterion("cur_Id_After not between", value1, value2, "curIdAfter");
            return (Criteria) this;
        }

        public Criteria andSaleOrBuyIsNull() {
            addCriterion("sale_or_buy is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrBuyIsNotNull() {
            addCriterion("sale_or_buy is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrBuyEqualTo(String value) {
            addCriterion("sale_or_buy =", value, "saleOrBuy");
            return (Criteria) this;
        }

        public Criteria andSaleOrBuyNotEqualTo(String value) {
            addCriterion("sale_or_buy <>", value, "saleOrBuy");
            return (Criteria) this;
        }

        public Criteria andSaleOrBuyGreaterThan(String value) {
            addCriterion("sale_or_buy >", value, "saleOrBuy");
            return (Criteria) this;
        }

        public Criteria andSaleOrBuyGreaterThanOrEqualTo(String value) {
            addCriterion("sale_or_buy >=", value, "saleOrBuy");
            return (Criteria) this;
        }

        public Criteria andSaleOrBuyLessThan(String value) {
            addCriterion("sale_or_buy <", value, "saleOrBuy");
            return (Criteria) this;
        }

        public Criteria andSaleOrBuyLessThanOrEqualTo(String value) {
            addCriterion("sale_or_buy <=", value, "saleOrBuy");
            return (Criteria) this;
        }

        public Criteria andSaleOrBuyLike(String value) {
            addCriterion("sale_or_buy like", value, "saleOrBuy");
            return (Criteria) this;
        }

        public Criteria andSaleOrBuyNotLike(String value) {
            addCriterion("sale_or_buy not like", value, "saleOrBuy");
            return (Criteria) this;
        }

        public Criteria andSaleOrBuyIn(List<String> values) {
            addCriterion("sale_or_buy in", values, "saleOrBuy");
            return (Criteria) this;
        }

        public Criteria andSaleOrBuyNotIn(List<String> values) {
            addCriterion("sale_or_buy not in", values, "saleOrBuy");
            return (Criteria) this;
        }

        public Criteria andSaleOrBuyBetween(String value1, String value2) {
            addCriterion("sale_or_buy between", value1, value2, "saleOrBuy");
            return (Criteria) this;
        }

        public Criteria andSaleOrBuyNotBetween(String value1, String value2) {
            addCriterion("sale_or_buy not between", value1, value2, "saleOrBuy");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyBeforeIsNull() {
            addCriterion("no_Trans_Up_My_Before is null");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyBeforeIsNotNull() {
            addCriterion("no_Trans_Up_My_Before is not null");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyBeforeEqualTo(String value) {
            addCriterion("no_Trans_Up_My_Before =", value, "noTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyBeforeNotEqualTo(String value) {
            addCriterion("no_Trans_Up_My_Before <>", value, "noTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyBeforeGreaterThan(String value) {
            addCriterion("no_Trans_Up_My_Before >", value, "noTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("no_Trans_Up_My_Before >=", value, "noTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyBeforeLessThan(String value) {
            addCriterion("no_Trans_Up_My_Before <", value, "noTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyBeforeLessThanOrEqualTo(String value) {
            addCriterion("no_Trans_Up_My_Before <=", value, "noTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyBeforeLike(String value) {
            addCriterion("no_Trans_Up_My_Before like", value, "noTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyBeforeNotLike(String value) {
            addCriterion("no_Trans_Up_My_Before not like", value, "noTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyBeforeIn(List<String> values) {
            addCriterion("no_Trans_Up_My_Before in", values, "noTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyBeforeNotIn(List<String> values) {
            addCriterion("no_Trans_Up_My_Before not in", values, "noTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyBeforeBetween(String value1, String value2) {
            addCriterion("no_Trans_Up_My_Before between", value1, value2, "noTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyBeforeNotBetween(String value1, String value2) {
            addCriterion("no_Trans_Up_My_Before not between", value1, value2, "noTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyAfterIsNull() {
            addCriterion("no_Trans_Up_My_After is null");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyAfterIsNotNull() {
            addCriterion("no_Trans_Up_My_After is not null");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyAfterEqualTo(String value) {
            addCriterion("no_Trans_Up_My_After =", value, "noTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyAfterNotEqualTo(String value) {
            addCriterion("no_Trans_Up_My_After <>", value, "noTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyAfterGreaterThan(String value) {
            addCriterion("no_Trans_Up_My_After >", value, "noTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyAfterGreaterThanOrEqualTo(String value) {
            addCriterion("no_Trans_Up_My_After >=", value, "noTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyAfterLessThan(String value) {
            addCriterion("no_Trans_Up_My_After <", value, "noTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyAfterLessThanOrEqualTo(String value) {
            addCriterion("no_Trans_Up_My_After <=", value, "noTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyAfterLike(String value) {
            addCriterion("no_Trans_Up_My_After like", value, "noTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyAfterNotLike(String value) {
            addCriterion("no_Trans_Up_My_After not like", value, "noTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyAfterIn(List<String> values) {
            addCriterion("no_Trans_Up_My_After in", values, "noTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyAfterNotIn(List<String> values) {
            addCriterion("no_Trans_Up_My_After not in", values, "noTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyAfterBetween(String value1, String value2) {
            addCriterion("no_Trans_Up_My_After between", value1, value2, "noTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpMyAfterNotBetween(String value1, String value2) {
            addCriterion("no_Trans_Up_My_After not between", value1, value2, "noTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherBeforeIsNull() {
            addCriterion("no_Trans_Up_Other_Before is null");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherBeforeIsNotNull() {
            addCriterion("no_Trans_Up_Other_Before is not null");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherBeforeEqualTo(String value) {
            addCriterion("no_Trans_Up_Other_Before =", value, "noTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherBeforeNotEqualTo(String value) {
            addCriterion("no_Trans_Up_Other_Before <>", value, "noTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherBeforeGreaterThan(String value) {
            addCriterion("no_Trans_Up_Other_Before >", value, "noTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("no_Trans_Up_Other_Before >=", value, "noTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherBeforeLessThan(String value) {
            addCriterion("no_Trans_Up_Other_Before <", value, "noTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherBeforeLessThanOrEqualTo(String value) {
            addCriterion("no_Trans_Up_Other_Before <=", value, "noTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherBeforeLike(String value) {
            addCriterion("no_Trans_Up_Other_Before like", value, "noTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherBeforeNotLike(String value) {
            addCriterion("no_Trans_Up_Other_Before not like", value, "noTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherBeforeIn(List<String> values) {
            addCriterion("no_Trans_Up_Other_Before in", values, "noTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherBeforeNotIn(List<String> values) {
            addCriterion("no_Trans_Up_Other_Before not in", values, "noTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherBeforeBetween(String value1, String value2) {
            addCriterion("no_Trans_Up_Other_Before between", value1, value2, "noTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherBeforeNotBetween(String value1, String value2) {
            addCriterion("no_Trans_Up_Other_Before not between", value1, value2, "noTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherAfterIsNull() {
            addCriterion("no_Trans_Up_Other_After is null");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherAfterIsNotNull() {
            addCriterion("no_Trans_Up_Other_After is not null");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherAfterEqualTo(String value) {
            addCriterion("no_Trans_Up_Other_After =", value, "noTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherAfterNotEqualTo(String value) {
            addCriterion("no_Trans_Up_Other_After <>", value, "noTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherAfterGreaterThan(String value) {
            addCriterion("no_Trans_Up_Other_After >", value, "noTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherAfterGreaterThanOrEqualTo(String value) {
            addCriterion("no_Trans_Up_Other_After >=", value, "noTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherAfterLessThan(String value) {
            addCriterion("no_Trans_Up_Other_After <", value, "noTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherAfterLessThanOrEqualTo(String value) {
            addCriterion("no_Trans_Up_Other_After <=", value, "noTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherAfterLike(String value) {
            addCriterion("no_Trans_Up_Other_After like", value, "noTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherAfterNotLike(String value) {
            addCriterion("no_Trans_Up_Other_After not like", value, "noTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherAfterIn(List<String> values) {
            addCriterion("no_Trans_Up_Other_After in", values, "noTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherAfterNotIn(List<String> values) {
            addCriterion("no_Trans_Up_Other_After not in", values, "noTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherAfterBetween(String value1, String value2) {
            addCriterion("no_Trans_Up_Other_After between", value1, value2, "noTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andNoTransUpOtherAfterNotBetween(String value1, String value2) {
            addCriterion("no_Trans_Up_Other_After not between", value1, value2, "noTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyBeforeIsNull() {
            addCriterion("have_Trans_Up_My_Before is null");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyBeforeIsNotNull() {
            addCriterion("have_Trans_Up_My_Before is not null");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyBeforeEqualTo(String value) {
            addCriterion("have_Trans_Up_My_Before =", value, "haveTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyBeforeNotEqualTo(String value) {
            addCriterion("have_Trans_Up_My_Before <>", value, "haveTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyBeforeGreaterThan(String value) {
            addCriterion("have_Trans_Up_My_Before >", value, "haveTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("have_Trans_Up_My_Before >=", value, "haveTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyBeforeLessThan(String value) {
            addCriterion("have_Trans_Up_My_Before <", value, "haveTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyBeforeLessThanOrEqualTo(String value) {
            addCriterion("have_Trans_Up_My_Before <=", value, "haveTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyBeforeLike(String value) {
            addCriterion("have_Trans_Up_My_Before like", value, "haveTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyBeforeNotLike(String value) {
            addCriterion("have_Trans_Up_My_Before not like", value, "haveTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyBeforeIn(List<String> values) {
            addCriterion("have_Trans_Up_My_Before in", values, "haveTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyBeforeNotIn(List<String> values) {
            addCriterion("have_Trans_Up_My_Before not in", values, "haveTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyBeforeBetween(String value1, String value2) {
            addCriterion("have_Trans_Up_My_Before between", value1, value2, "haveTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyBeforeNotBetween(String value1, String value2) {
            addCriterion("have_Trans_Up_My_Before not between", value1, value2, "haveTransUpMyBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyAfterIsNull() {
            addCriterion("have_Trans_Up_My_After is null");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyAfterIsNotNull() {
            addCriterion("have_Trans_Up_My_After is not null");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyAfterEqualTo(String value) {
            addCriterion("have_Trans_Up_My_After =", value, "haveTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyAfterNotEqualTo(String value) {
            addCriterion("have_Trans_Up_My_After <>", value, "haveTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyAfterGreaterThan(String value) {
            addCriterion("have_Trans_Up_My_After >", value, "haveTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyAfterGreaterThanOrEqualTo(String value) {
            addCriterion("have_Trans_Up_My_After >=", value, "haveTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyAfterLessThan(String value) {
            addCriterion("have_Trans_Up_My_After <", value, "haveTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyAfterLessThanOrEqualTo(String value) {
            addCriterion("have_Trans_Up_My_After <=", value, "haveTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyAfterLike(String value) {
            addCriterion("have_Trans_Up_My_After like", value, "haveTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyAfterNotLike(String value) {
            addCriterion("have_Trans_Up_My_After not like", value, "haveTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyAfterIn(List<String> values) {
            addCriterion("have_Trans_Up_My_After in", values, "haveTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyAfterNotIn(List<String> values) {
            addCriterion("have_Trans_Up_My_After not in", values, "haveTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyAfterBetween(String value1, String value2) {
            addCriterion("have_Trans_Up_My_After between", value1, value2, "haveTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpMyAfterNotBetween(String value1, String value2) {
            addCriterion("have_Trans_Up_My_After not between", value1, value2, "haveTransUpMyAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherBeforeIsNull() {
            addCriterion("have_Trans_Up_Other_Before is null");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherBeforeIsNotNull() {
            addCriterion("have_Trans_Up_Other_Before is not null");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherBeforeEqualTo(String value) {
            addCriterion("have_Trans_Up_Other_Before =", value, "haveTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherBeforeNotEqualTo(String value) {
            addCriterion("have_Trans_Up_Other_Before <>", value, "haveTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherBeforeGreaterThan(String value) {
            addCriterion("have_Trans_Up_Other_Before >", value, "haveTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("have_Trans_Up_Other_Before >=", value, "haveTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherBeforeLessThan(String value) {
            addCriterion("have_Trans_Up_Other_Before <", value, "haveTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherBeforeLessThanOrEqualTo(String value) {
            addCriterion("have_Trans_Up_Other_Before <=", value, "haveTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherBeforeLike(String value) {
            addCriterion("have_Trans_Up_Other_Before like", value, "haveTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherBeforeNotLike(String value) {
            addCriterion("have_Trans_Up_Other_Before not like", value, "haveTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherBeforeIn(List<String> values) {
            addCriterion("have_Trans_Up_Other_Before in", values, "haveTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherBeforeNotIn(List<String> values) {
            addCriterion("have_Trans_Up_Other_Before not in", values, "haveTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherBeforeBetween(String value1, String value2) {
            addCriterion("have_Trans_Up_Other_Before between", value1, value2, "haveTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherBeforeNotBetween(String value1, String value2) {
            addCriterion("have_Trans_Up_Other_Before not between", value1, value2, "haveTransUpOtherBefore");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherAfterIsNull() {
            addCriterion("have_Trans_Up_Other_After is null");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherAfterIsNotNull() {
            addCriterion("have_Trans_Up_Other_After is not null");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherAfterEqualTo(String value) {
            addCriterion("have_Trans_Up_Other_After =", value, "haveTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherAfterNotEqualTo(String value) {
            addCriterion("have_Trans_Up_Other_After <>", value, "haveTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherAfterGreaterThan(String value) {
            addCriterion("have_Trans_Up_Other_After >", value, "haveTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherAfterGreaterThanOrEqualTo(String value) {
            addCriterion("have_Trans_Up_Other_After >=", value, "haveTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherAfterLessThan(String value) {
            addCriterion("have_Trans_Up_Other_After <", value, "haveTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherAfterLessThanOrEqualTo(String value) {
            addCriterion("have_Trans_Up_Other_After <=", value, "haveTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherAfterLike(String value) {
            addCriterion("have_Trans_Up_Other_After like", value, "haveTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherAfterNotLike(String value) {
            addCriterion("have_Trans_Up_Other_After not like", value, "haveTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherAfterIn(List<String> values) {
            addCriterion("have_Trans_Up_Other_After in", values, "haveTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherAfterNotIn(List<String> values) {
            addCriterion("have_Trans_Up_Other_After not in", values, "haveTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherAfterBetween(String value1, String value2) {
            addCriterion("have_Trans_Up_Other_After between", value1, value2, "haveTransUpOtherAfter");
            return (Criteria) this;
        }

        public Criteria andHaveTransUpOtherAfterNotBetween(String value1, String value2) {
            addCriterion("have_Trans_Up_Other_After not between", value1, value2, "haveTransUpOtherAfter");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}