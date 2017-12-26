package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrdtSampExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrdtSampExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPrdCodeIsNull() {
            addCriterion("prd_code is null");
            return (Criteria) this;
        }

        public Criteria andPrdCodeIsNotNull() {
            addCriterion("prd_code is not null");
            return (Criteria) this;
        }

        public Criteria andPrdCodeEqualTo(String value) {
            addCriterion("prd_code =", value, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeNotEqualTo(String value) {
            addCriterion("prd_code <>", value, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeGreaterThan(String value) {
            addCriterion("prd_code >", value, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("prd_code >=", value, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeLessThan(String value) {
            addCriterion("prd_code <", value, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeLessThanOrEqualTo(String value) {
            addCriterion("prd_code <=", value, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeLike(String value) {
            addCriterion("prd_code like", value, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeNotLike(String value) {
            addCriterion("prd_code not like", value, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeIn(List<String> values) {
            addCriterion("prd_code in", values, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeNotIn(List<String> values) {
            addCriterion("prd_code not in", values, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeBetween(String value1, String value2) {
            addCriterion("prd_code between", value1, value2, "prdCode");
            return (Criteria) this;
        }

        public Criteria andPrdCodeNotBetween(String value1, String value2) {
            addCriterion("prd_code not between", value1, value2, "prdCode");
            return (Criteria) this;
        }

        public Criteria andIdxNameIsNull() {
            addCriterion("idx_name is null");
            return (Criteria) this;
        }

        public Criteria andIdxNameIsNotNull() {
            addCriterion("idx_name is not null");
            return (Criteria) this;
        }

        public Criteria andIdxNameEqualTo(String value) {
            addCriterion("idx_name =", value, "idxName");
            return (Criteria) this;
        }

        public Criteria andIdxNameNotEqualTo(String value) {
            addCriterion("idx_name <>", value, "idxName");
            return (Criteria) this;
        }

        public Criteria andIdxNameGreaterThan(String value) {
            addCriterion("idx_name >", value, "idxName");
            return (Criteria) this;
        }

        public Criteria andIdxNameGreaterThanOrEqualTo(String value) {
            addCriterion("idx_name >=", value, "idxName");
            return (Criteria) this;
        }

        public Criteria andIdxNameLessThan(String value) {
            addCriterion("idx_name <", value, "idxName");
            return (Criteria) this;
        }

        public Criteria andIdxNameLessThanOrEqualTo(String value) {
            addCriterion("idx_name <=", value, "idxName");
            return (Criteria) this;
        }

        public Criteria andIdxNameLike(String value) {
            addCriterion("idx_name like", value, "idxName");
            return (Criteria) this;
        }

        public Criteria andIdxNameNotLike(String value) {
            addCriterion("idx_name not like", value, "idxName");
            return (Criteria) this;
        }

        public Criteria andIdxNameIn(List<String> values) {
            addCriterion("idx_name in", values, "idxName");
            return (Criteria) this;
        }

        public Criteria andIdxNameNotIn(List<String> values) {
            addCriterion("idx_name not in", values, "idxName");
            return (Criteria) this;
        }

        public Criteria andIdxNameBetween(String value1, String value2) {
            addCriterion("idx_name between", value1, value2, "idxName");
            return (Criteria) this;
        }

        public Criteria andIdxNameNotBetween(String value1, String value2) {
            addCriterion("idx_name not between", value1, value2, "idxName");
            return (Criteria) this;
        }

        public Criteria andIdxNoIsNull() {
            addCriterion("idx_no is null");
            return (Criteria) this;
        }

        public Criteria andIdxNoIsNotNull() {
            addCriterion("idx_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdxNoEqualTo(String value) {
            addCriterion("idx_no =", value, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoNotEqualTo(String value) {
            addCriterion("idx_no <>", value, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoGreaterThan(String value) {
            addCriterion("idx_no >", value, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoGreaterThanOrEqualTo(String value) {
            addCriterion("idx_no >=", value, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoLessThan(String value) {
            addCriterion("idx_no <", value, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoLessThanOrEqualTo(String value) {
            addCriterion("idx_no <=", value, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoLike(String value) {
            addCriterion("idx_no like", value, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoNotLike(String value) {
            addCriterion("idx_no not like", value, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoIn(List<String> values) {
            addCriterion("idx_no in", values, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoNotIn(List<String> values) {
            addCriterion("idx_no not in", values, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoBetween(String value1, String value2) {
            addCriterion("idx_no between", value1, value2, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoNotBetween(String value1, String value2) {
            addCriterion("idx_no not between", value1, value2, "idxNo");
            return (Criteria) this;
        }

        public Criteria andMarkNameIsNull() {
            addCriterion("mark_name is null");
            return (Criteria) this;
        }

        public Criteria andMarkNameIsNotNull() {
            addCriterion("mark_name is not null");
            return (Criteria) this;
        }

        public Criteria andMarkNameEqualTo(String value) {
            addCriterion("mark_name =", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameNotEqualTo(String value) {
            addCriterion("mark_name <>", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameGreaterThan(String value) {
            addCriterion("mark_name >", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameGreaterThanOrEqualTo(String value) {
            addCriterion("mark_name >=", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameLessThan(String value) {
            addCriterion("mark_name <", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameLessThanOrEqualTo(String value) {
            addCriterion("mark_name <=", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameLike(String value) {
            addCriterion("mark_name like", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameNotLike(String value) {
            addCriterion("mark_name not like", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameIn(List<String> values) {
            addCriterion("mark_name in", values, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameNotIn(List<String> values) {
            addCriterion("mark_name not in", values, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameBetween(String value1, String value2) {
            addCriterion("mark_name between", value1, value2, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameNotBetween(String value1, String value2) {
            addCriterion("mark_name not between", value1, value2, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNoIsNull() {
            addCriterion("mark_no is null");
            return (Criteria) this;
        }

        public Criteria andMarkNoIsNotNull() {
            addCriterion("mark_no is not null");
            return (Criteria) this;
        }

        public Criteria andMarkNoEqualTo(String value) {
            addCriterion("mark_no =", value, "markNo");
            return (Criteria) this;
        }

        public Criteria andMarkNoNotEqualTo(String value) {
            addCriterion("mark_no <>", value, "markNo");
            return (Criteria) this;
        }

        public Criteria andMarkNoGreaterThan(String value) {
            addCriterion("mark_no >", value, "markNo");
            return (Criteria) this;
        }

        public Criteria andMarkNoGreaterThanOrEqualTo(String value) {
            addCriterion("mark_no >=", value, "markNo");
            return (Criteria) this;
        }

        public Criteria andMarkNoLessThan(String value) {
            addCriterion("mark_no <", value, "markNo");
            return (Criteria) this;
        }

        public Criteria andMarkNoLessThanOrEqualTo(String value) {
            addCriterion("mark_no <=", value, "markNo");
            return (Criteria) this;
        }

        public Criteria andMarkNoLike(String value) {
            addCriterion("mark_no like", value, "markNo");
            return (Criteria) this;
        }

        public Criteria andMarkNoNotLike(String value) {
            addCriterion("mark_no not like", value, "markNo");
            return (Criteria) this;
        }

        public Criteria andMarkNoIn(List<String> values) {
            addCriterion("mark_no in", values, "markNo");
            return (Criteria) this;
        }

        public Criteria andMarkNoNotIn(List<String> values) {
            addCriterion("mark_no not in", values, "markNo");
            return (Criteria) this;
        }

        public Criteria andMarkNoBetween(String value1, String value2) {
            addCriterion("mark_no between", value1, value2, "markNo");
            return (Criteria) this;
        }

        public Criteria andMarkNoNotBetween(String value1, String value2) {
            addCriterion("mark_no not between", value1, value2, "markNo");
            return (Criteria) this;
        }

        public Criteria andColourIsNull() {
            addCriterion("colour is null");
            return (Criteria) this;
        }

        public Criteria andColourIsNotNull() {
            addCriterion("colour is not null");
            return (Criteria) this;
        }

        public Criteria andColourEqualTo(String value) {
            addCriterion("colour =", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourNotEqualTo(String value) {
            addCriterion("colour <>", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourGreaterThan(String value) {
            addCriterion("colour >", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourGreaterThanOrEqualTo(String value) {
            addCriterion("colour >=", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourLessThan(String value) {
            addCriterion("colour <", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourLessThanOrEqualTo(String value) {
            addCriterion("colour <=", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourLike(String value) {
            addCriterion("colour like", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourNotLike(String value) {
            addCriterion("colour not like", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourIn(List<String> values) {
            addCriterion("colour in", values, "colour");
            return (Criteria) this;
        }

        public Criteria andColourNotIn(List<String> values) {
            addCriterion("colour not in", values, "colour");
            return (Criteria) this;
        }

        public Criteria andColourBetween(String value1, String value2) {
            addCriterion("colour between", value1, value2, "colour");
            return (Criteria) this;
        }

        public Criteria andColourNotBetween(String value1, String value2) {
            addCriterion("colour not between", value1, value2, "colour");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSalNameIsNull() {
            addCriterion("sal_name is null");
            return (Criteria) this;
        }

        public Criteria andSalNameIsNotNull() {
            addCriterion("sal_name is not null");
            return (Criteria) this;
        }

        public Criteria andSalNameEqualTo(String value) {
            addCriterion("sal_name =", value, "salName");
            return (Criteria) this;
        }

        public Criteria andSalNameNotEqualTo(String value) {
            addCriterion("sal_name <>", value, "salName");
            return (Criteria) this;
        }

        public Criteria andSalNameGreaterThan(String value) {
            addCriterion("sal_name >", value, "salName");
            return (Criteria) this;
        }

        public Criteria andSalNameGreaterThanOrEqualTo(String value) {
            addCriterion("sal_name >=", value, "salName");
            return (Criteria) this;
        }

        public Criteria andSalNameLessThan(String value) {
            addCriterion("sal_name <", value, "salName");
            return (Criteria) this;
        }

        public Criteria andSalNameLessThanOrEqualTo(String value) {
            addCriterion("sal_name <=", value, "salName");
            return (Criteria) this;
        }

        public Criteria andSalNameLike(String value) {
            addCriterion("sal_name like", value, "salName");
            return (Criteria) this;
        }

        public Criteria andSalNameNotLike(String value) {
            addCriterion("sal_name not like", value, "salName");
            return (Criteria) this;
        }

        public Criteria andSalNameIn(List<String> values) {
            addCriterion("sal_name in", values, "salName");
            return (Criteria) this;
        }

        public Criteria andSalNameNotIn(List<String> values) {
            addCriterion("sal_name not in", values, "salName");
            return (Criteria) this;
        }

        public Criteria andSalNameBetween(String value1, String value2) {
            addCriterion("sal_name between", value1, value2, "salName");
            return (Criteria) this;
        }

        public Criteria andSalNameNotBetween(String value1, String value2) {
            addCriterion("sal_name not between", value1, value2, "salName");
            return (Criteria) this;
        }

        public Criteria andSalNoIsNull() {
            addCriterion("sal_no is null");
            return (Criteria) this;
        }

        public Criteria andSalNoIsNotNull() {
            addCriterion("sal_no is not null");
            return (Criteria) this;
        }

        public Criteria andSalNoEqualTo(String value) {
            addCriterion("sal_no =", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotEqualTo(String value) {
            addCriterion("sal_no <>", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoGreaterThan(String value) {
            addCriterion("sal_no >", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoGreaterThanOrEqualTo(String value) {
            addCriterion("sal_no >=", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLessThan(String value) {
            addCriterion("sal_no <", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLessThanOrEqualTo(String value) {
            addCriterion("sal_no <=", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLike(String value) {
            addCriterion("sal_no like", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotLike(String value) {
            addCriterion("sal_no not like", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoIn(List<String> values) {
            addCriterion("sal_no in", values, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotIn(List<String> values) {
            addCriterion("sal_no not in", values, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoBetween(String value1, String value2) {
            addCriterion("sal_no between", value1, value2, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotBetween(String value1, String value2) {
            addCriterion("sal_no not between", value1, value2, "salNo");
            return (Criteria) this;
        }

        public Criteria andCusNoIsNull() {
            addCriterion("cus_no is null");
            return (Criteria) this;
        }

        public Criteria andCusNoIsNotNull() {
            addCriterion("cus_no is not null");
            return (Criteria) this;
        }

        public Criteria andCusNoEqualTo(String value) {
            addCriterion("cus_no =", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotEqualTo(String value) {
            addCriterion("cus_no <>", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoGreaterThan(String value) {
            addCriterion("cus_no >", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoGreaterThanOrEqualTo(String value) {
            addCriterion("cus_no >=", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLessThan(String value) {
            addCriterion("cus_no <", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLessThanOrEqualTo(String value) {
            addCriterion("cus_no <=", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLike(String value) {
            addCriterion("cus_no like", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotLike(String value) {
            addCriterion("cus_no not like", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoIn(List<String> values) {
            addCriterion("cus_no in", values, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotIn(List<String> values) {
            addCriterion("cus_no not in", values, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoBetween(String value1, String value2) {
            addCriterion("cus_no between", value1, value2, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotBetween(String value1, String value2) {
            addCriterion("cus_no not between", value1, value2, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNull() {
            addCriterion("cus_name is null");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNotNull() {
            addCriterion("cus_name is not null");
            return (Criteria) this;
        }

        public Criteria andCusNameEqualTo(String value) {
            addCriterion("cus_name =", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotEqualTo(String value) {
            addCriterion("cus_name <>", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThan(String value) {
            addCriterion("cus_name >", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThanOrEqualTo(String value) {
            addCriterion("cus_name >=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThan(String value) {
            addCriterion("cus_name <", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThanOrEqualTo(String value) {
            addCriterion("cus_name <=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLike(String value) {
            addCriterion("cus_name like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotLike(String value) {
            addCriterion("cus_name not like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameIn(List<String> values) {
            addCriterion("cus_name in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotIn(List<String> values) {
            addCriterion("cus_name not in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameBetween(String value1, String value2) {
            addCriterion("cus_name between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotBetween(String value1, String value2) {
            addCriterion("cus_name not between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andIsfenjieIsNull() {
            addCriterion("isFenJie is null");
            return (Criteria) this;
        }

        public Criteria andIsfenjieIsNotNull() {
            addCriterion("isFenJie is not null");
            return (Criteria) this;
        }

        public Criteria andIsfenjieEqualTo(String value) {
            addCriterion("isFenJie =", value, "isfenjie");
            return (Criteria) this;
        }

        public Criteria andIsfenjieNotEqualTo(String value) {
            addCriterion("isFenJie <>", value, "isfenjie");
            return (Criteria) this;
        }

        public Criteria andIsfenjieGreaterThan(String value) {
            addCriterion("isFenJie >", value, "isfenjie");
            return (Criteria) this;
        }

        public Criteria andIsfenjieGreaterThanOrEqualTo(String value) {
            addCriterion("isFenJie >=", value, "isfenjie");
            return (Criteria) this;
        }

        public Criteria andIsfenjieLessThan(String value) {
            addCriterion("isFenJie <", value, "isfenjie");
            return (Criteria) this;
        }

        public Criteria andIsfenjieLessThanOrEqualTo(String value) {
            addCriterion("isFenJie <=", value, "isfenjie");
            return (Criteria) this;
        }

        public Criteria andIsfenjieLike(String value) {
            addCriterion("isFenJie like", value, "isfenjie");
            return (Criteria) this;
        }

        public Criteria andIsfenjieNotLike(String value) {
            addCriterion("isFenJie not like", value, "isfenjie");
            return (Criteria) this;
        }

        public Criteria andIsfenjieIn(List<String> values) {
            addCriterion("isFenJie in", values, "isfenjie");
            return (Criteria) this;
        }

        public Criteria andIsfenjieNotIn(List<String> values) {
            addCriterion("isFenJie not in", values, "isfenjie");
            return (Criteria) this;
        }

        public Criteria andIsfenjieBetween(String value1, String value2) {
            addCriterion("isFenJie between", value1, value2, "isfenjie");
            return (Criteria) this;
        }

        public Criteria andIsfenjieNotBetween(String value1, String value2) {
            addCriterion("isFenJie not between", value1, value2, "isfenjie");
            return (Criteria) this;
        }

        public Criteria andSampMakeIsNull() {
            addCriterion("samp_make is null");
            return (Criteria) this;
        }

        public Criteria andSampMakeIsNotNull() {
            addCriterion("samp_make is not null");
            return (Criteria) this;
        }

        public Criteria andSampMakeEqualTo(Date value) {
            addCriterion("samp_make =", value, "sampMake");
            return (Criteria) this;
        }

        public Criteria andSampMakeNotEqualTo(Date value) {
            addCriterion("samp_make <>", value, "sampMake");
            return (Criteria) this;
        }

        public Criteria andSampMakeGreaterThan(Date value) {
            addCriterion("samp_make >", value, "sampMake");
            return (Criteria) this;
        }

        public Criteria andSampMakeGreaterThanOrEqualTo(Date value) {
            addCriterion("samp_make >=", value, "sampMake");
            return (Criteria) this;
        }

        public Criteria andSampMakeLessThan(Date value) {
            addCriterion("samp_make <", value, "sampMake");
            return (Criteria) this;
        }

        public Criteria andSampMakeLessThanOrEqualTo(Date value) {
            addCriterion("samp_make <=", value, "sampMake");
            return (Criteria) this;
        }

        public Criteria andSampMakeIn(List<Date> values) {
            addCriterion("samp_make in", values, "sampMake");
            return (Criteria) this;
        }

        public Criteria andSampMakeNotIn(List<Date> values) {
            addCriterion("samp_make not in", values, "sampMake");
            return (Criteria) this;
        }

        public Criteria andSampMakeBetween(Date value1, Date value2) {
            addCriterion("samp_make between", value1, value2, "sampMake");
            return (Criteria) this;
        }

        public Criteria andSampMakeNotBetween(Date value1, Date value2) {
            addCriterion("samp_make not between", value1, value2, "sampMake");
            return (Criteria) this;
        }

        public Criteria andSampSendIsNull() {
            addCriterion("samp_send is null");
            return (Criteria) this;
        }

        public Criteria andSampSendIsNotNull() {
            addCriterion("samp_send is not null");
            return (Criteria) this;
        }

        public Criteria andSampSendEqualTo(Date value) {
            addCriterion("samp_send =", value, "sampSend");
            return (Criteria) this;
        }

        public Criteria andSampSendNotEqualTo(Date value) {
            addCriterion("samp_send <>", value, "sampSend");
            return (Criteria) this;
        }

        public Criteria andSampSendGreaterThan(Date value) {
            addCriterion("samp_send >", value, "sampSend");
            return (Criteria) this;
        }

        public Criteria andSampSendGreaterThanOrEqualTo(Date value) {
            addCriterion("samp_send >=", value, "sampSend");
            return (Criteria) this;
        }

        public Criteria andSampSendLessThan(Date value) {
            addCriterion("samp_send <", value, "sampSend");
            return (Criteria) this;
        }

        public Criteria andSampSendLessThanOrEqualTo(Date value) {
            addCriterion("samp_send <=", value, "sampSend");
            return (Criteria) this;
        }

        public Criteria andSampSendIn(List<Date> values) {
            addCriterion("samp_send in", values, "sampSend");
            return (Criteria) this;
        }

        public Criteria andSampSendNotIn(List<Date> values) {
            addCriterion("samp_send not in", values, "sampSend");
            return (Criteria) this;
        }

        public Criteria andSampSendBetween(Date value1, Date value2) {
            addCriterion("samp_send between", value1, value2, "sampSend");
            return (Criteria) this;
        }

        public Criteria andSampSendNotBetween(Date value1, Date value2) {
            addCriterion("samp_send not between", value1, value2, "sampSend");
            return (Criteria) this;
        }

        public Criteria andSampRequIsNull() {
            addCriterion("samp_requ is null");
            return (Criteria) this;
        }

        public Criteria andSampRequIsNotNull() {
            addCriterion("samp_requ is not null");
            return (Criteria) this;
        }

        public Criteria andSampRequEqualTo(String value) {
            addCriterion("samp_requ =", value, "sampRequ");
            return (Criteria) this;
        }

        public Criteria andSampRequNotEqualTo(String value) {
            addCriterion("samp_requ <>", value, "sampRequ");
            return (Criteria) this;
        }

        public Criteria andSampRequGreaterThan(String value) {
            addCriterion("samp_requ >", value, "sampRequ");
            return (Criteria) this;
        }

        public Criteria andSampRequGreaterThanOrEqualTo(String value) {
            addCriterion("samp_requ >=", value, "sampRequ");
            return (Criteria) this;
        }

        public Criteria andSampRequLessThan(String value) {
            addCriterion("samp_requ <", value, "sampRequ");
            return (Criteria) this;
        }

        public Criteria andSampRequLessThanOrEqualTo(String value) {
            addCriterion("samp_requ <=", value, "sampRequ");
            return (Criteria) this;
        }

        public Criteria andSampRequLike(String value) {
            addCriterion("samp_requ like", value, "sampRequ");
            return (Criteria) this;
        }

        public Criteria andSampRequNotLike(String value) {
            addCriterion("samp_requ not like", value, "sampRequ");
            return (Criteria) this;
        }

        public Criteria andSampRequIn(List<String> values) {
            addCriterion("samp_requ in", values, "sampRequ");
            return (Criteria) this;
        }

        public Criteria andSampRequNotIn(List<String> values) {
            addCriterion("samp_requ not in", values, "sampRequ");
            return (Criteria) this;
        }

        public Criteria andSampRequBetween(String value1, String value2) {
            addCriterion("samp_requ between", value1, value2, "sampRequ");
            return (Criteria) this;
        }

        public Criteria andSampRequNotBetween(String value1, String value2) {
            addCriterion("samp_requ not between", value1, value2, "sampRequ");
            return (Criteria) this;
        }

        public Criteria andSampDescIsNull() {
            addCriterion("samp_desc is null");
            return (Criteria) this;
        }

        public Criteria andSampDescIsNotNull() {
            addCriterion("samp_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSampDescEqualTo(String value) {
            addCriterion("samp_desc =", value, "sampDesc");
            return (Criteria) this;
        }

        public Criteria andSampDescNotEqualTo(String value) {
            addCriterion("samp_desc <>", value, "sampDesc");
            return (Criteria) this;
        }

        public Criteria andSampDescGreaterThan(String value) {
            addCriterion("samp_desc >", value, "sampDesc");
            return (Criteria) this;
        }

        public Criteria andSampDescGreaterThanOrEqualTo(String value) {
            addCriterion("samp_desc >=", value, "sampDesc");
            return (Criteria) this;
        }

        public Criteria andSampDescLessThan(String value) {
            addCriterion("samp_desc <", value, "sampDesc");
            return (Criteria) this;
        }

        public Criteria andSampDescLessThanOrEqualTo(String value) {
            addCriterion("samp_desc <=", value, "sampDesc");
            return (Criteria) this;
        }

        public Criteria andSampDescLike(String value) {
            addCriterion("samp_desc like", value, "sampDesc");
            return (Criteria) this;
        }

        public Criteria andSampDescNotLike(String value) {
            addCriterion("samp_desc not like", value, "sampDesc");
            return (Criteria) this;
        }

        public Criteria andSampDescIn(List<String> values) {
            addCriterion("samp_desc in", values, "sampDesc");
            return (Criteria) this;
        }

        public Criteria andSampDescNotIn(List<String> values) {
            addCriterion("samp_desc not in", values, "sampDesc");
            return (Criteria) this;
        }

        public Criteria andSampDescBetween(String value1, String value2) {
            addCriterion("samp_desc between", value1, value2, "sampDesc");
            return (Criteria) this;
        }

        public Criteria andSampDescNotBetween(String value1, String value2) {
            addCriterion("samp_desc not between", value1, value2, "sampDesc");
            return (Criteria) this;
        }

        public Criteria andThumIsNull() {
            addCriterion("thum is null");
            return (Criteria) this;
        }

        public Criteria andThumIsNotNull() {
            addCriterion("thum is not null");
            return (Criteria) this;
        }

        public Criteria andThumEqualTo(String value) {
            addCriterion("thum =", value, "thum");
            return (Criteria) this;
        }

        public Criteria andThumNotEqualTo(String value) {
            addCriterion("thum <>", value, "thum");
            return (Criteria) this;
        }

        public Criteria andThumGreaterThan(String value) {
            addCriterion("thum >", value, "thum");
            return (Criteria) this;
        }

        public Criteria andThumGreaterThanOrEqualTo(String value) {
            addCriterion("thum >=", value, "thum");
            return (Criteria) this;
        }

        public Criteria andThumLessThan(String value) {
            addCriterion("thum <", value, "thum");
            return (Criteria) this;
        }

        public Criteria andThumLessThanOrEqualTo(String value) {
            addCriterion("thum <=", value, "thum");
            return (Criteria) this;
        }

        public Criteria andThumLike(String value) {
            addCriterion("thum like", value, "thum");
            return (Criteria) this;
        }

        public Criteria andThumNotLike(String value) {
            addCriterion("thum not like", value, "thum");
            return (Criteria) this;
        }

        public Criteria andThumIn(List<String> values) {
            addCriterion("thum in", values, "thum");
            return (Criteria) this;
        }

        public Criteria andThumNotIn(List<String> values) {
            addCriterion("thum not in", values, "thum");
            return (Criteria) this;
        }

        public Criteria andThumBetween(String value1, String value2) {
            addCriterion("thum between", value1, value2, "thum");
            return (Criteria) this;
        }

        public Criteria andThumNotBetween(String value1, String value2) {
            addCriterion("thum not between", value1, value2, "thum");
            return (Criteria) this;
        }

        public Criteria andAttachIsNull() {
            addCriterion("attach is null");
            return (Criteria) this;
        }

        public Criteria andAttachIsNotNull() {
            addCriterion("attach is not null");
            return (Criteria) this;
        }

        public Criteria andAttachEqualTo(String value) {
            addCriterion("attach =", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotEqualTo(String value) {
            addCriterion("attach <>", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThan(String value) {
            addCriterion("attach >", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThanOrEqualTo(String value) {
            addCriterion("attach >=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThan(String value) {
            addCriterion("attach <", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThanOrEqualTo(String value) {
            addCriterion("attach <=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLike(String value) {
            addCriterion("attach like", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotLike(String value) {
            addCriterion("attach not like", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachIn(List<String> values) {
            addCriterion("attach in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotIn(List<String> values) {
            addCriterion("attach not in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachBetween(String value1, String value2) {
            addCriterion("attach between", value1, value2, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotBetween(String value1, String value2) {
            addCriterion("attach not between", value1, value2, "attach");
            return (Criteria) this;
        }

        public Criteria andInsertdateIsNull() {
            addCriterion("insertdate is null");
            return (Criteria) this;
        }

        public Criteria andInsertdateIsNotNull() {
            addCriterion("insertdate is not null");
            return (Criteria) this;
        }

        public Criteria andInsertdateEqualTo(Date value) {
            addCriterion("insertdate =", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateNotEqualTo(Date value) {
            addCriterion("insertdate <>", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateGreaterThan(Date value) {
            addCriterion("insertdate >", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateGreaterThanOrEqualTo(Date value) {
            addCriterion("insertdate >=", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateLessThan(Date value) {
            addCriterion("insertdate <", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateLessThanOrEqualTo(Date value) {
            addCriterion("insertdate <=", value, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateIn(List<Date> values) {
            addCriterion("insertdate in", values, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateNotIn(List<Date> values) {
            addCriterion("insertdate not in", values, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateBetween(Date value1, Date value2) {
            addCriterion("insertdate between", value1, value2, "insertdate");
            return (Criteria) this;
        }

        public Criteria andInsertdateNotBetween(Date value1, Date value2) {
            addCriterion("insertdate not between", value1, value2, "insertdate");
            return (Criteria) this;
        }

        public Criteria andConfirmmanIsNull() {
            addCriterion("confirmMan is null");
            return (Criteria) this;
        }

        public Criteria andConfirmmanIsNotNull() {
            addCriterion("confirmMan is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmmanEqualTo(String value) {
            addCriterion("confirmMan =", value, "confirmman");
            return (Criteria) this;
        }

        public Criteria andConfirmmanNotEqualTo(String value) {
            addCriterion("confirmMan <>", value, "confirmman");
            return (Criteria) this;
        }

        public Criteria andConfirmmanGreaterThan(String value) {
            addCriterion("confirmMan >", value, "confirmman");
            return (Criteria) this;
        }

        public Criteria andConfirmmanGreaterThanOrEqualTo(String value) {
            addCriterion("confirmMan >=", value, "confirmman");
            return (Criteria) this;
        }

        public Criteria andConfirmmanLessThan(String value) {
            addCriterion("confirmMan <", value, "confirmman");
            return (Criteria) this;
        }

        public Criteria andConfirmmanLessThanOrEqualTo(String value) {
            addCriterion("confirmMan <=", value, "confirmman");
            return (Criteria) this;
        }

        public Criteria andConfirmmanLike(String value) {
            addCriterion("confirmMan like", value, "confirmman");
            return (Criteria) this;
        }

        public Criteria andConfirmmanNotLike(String value) {
            addCriterion("confirmMan not like", value, "confirmman");
            return (Criteria) this;
        }

        public Criteria andConfirmmanIn(List<String> values) {
            addCriterion("confirmMan in", values, "confirmman");
            return (Criteria) this;
        }

        public Criteria andConfirmmanNotIn(List<String> values) {
            addCriterion("confirmMan not in", values, "confirmman");
            return (Criteria) this;
        }

        public Criteria andConfirmmanBetween(String value1, String value2) {
            addCriterion("confirmMan between", value1, value2, "confirmman");
            return (Criteria) this;
        }

        public Criteria andConfirmmanNotBetween(String value1, String value2) {
            addCriterion("confirmMan not between", value1, value2, "confirmman");
            return (Criteria) this;
        }

        public Criteria andConfirmtimestrIsNull() {
            addCriterion("confirmTimeStr is null");
            return (Criteria) this;
        }

        public Criteria andConfirmtimestrIsNotNull() {
            addCriterion("confirmTimeStr is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmtimestrEqualTo(String value) {
            addCriterion("confirmTimeStr =", value, "confirmtimestr");
            return (Criteria) this;
        }

        public Criteria andConfirmtimestrNotEqualTo(String value) {
            addCriterion("confirmTimeStr <>", value, "confirmtimestr");
            return (Criteria) this;
        }

        public Criteria andConfirmtimestrGreaterThan(String value) {
            addCriterion("confirmTimeStr >", value, "confirmtimestr");
            return (Criteria) this;
        }

        public Criteria andConfirmtimestrGreaterThanOrEqualTo(String value) {
            addCriterion("confirmTimeStr >=", value, "confirmtimestr");
            return (Criteria) this;
        }

        public Criteria andConfirmtimestrLessThan(String value) {
            addCriterion("confirmTimeStr <", value, "confirmtimestr");
            return (Criteria) this;
        }

        public Criteria andConfirmtimestrLessThanOrEqualTo(String value) {
            addCriterion("confirmTimeStr <=", value, "confirmtimestr");
            return (Criteria) this;
        }

        public Criteria andConfirmtimestrLike(String value) {
            addCriterion("confirmTimeStr like", value, "confirmtimestr");
            return (Criteria) this;
        }

        public Criteria andConfirmtimestrNotLike(String value) {
            addCriterion("confirmTimeStr not like", value, "confirmtimestr");
            return (Criteria) this;
        }

        public Criteria andConfirmtimestrIn(List<String> values) {
            addCriterion("confirmTimeStr in", values, "confirmtimestr");
            return (Criteria) this;
        }

        public Criteria andConfirmtimestrNotIn(List<String> values) {
            addCriterion("confirmTimeStr not in", values, "confirmtimestr");
            return (Criteria) this;
        }

        public Criteria andConfirmtimestrBetween(String value1, String value2) {
            addCriterion("confirmTimeStr between", value1, value2, "confirmtimestr");
            return (Criteria) this;
        }

        public Criteria andConfirmtimestrNotBetween(String value1, String value2) {
            addCriterion("confirmTimeStr not between", value1, value2, "confirmtimestr");
            return (Criteria) this;
        }

        public Criteria andIsconfirmIsNull() {
            addCriterion("isConfirm is null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmIsNotNull() {
            addCriterion("isConfirm is not null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmEqualTo(Integer value) {
            addCriterion("isConfirm =", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmNotEqualTo(Integer value) {
            addCriterion("isConfirm <>", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmGreaterThan(Integer value) {
            addCriterion("isConfirm >", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmGreaterThanOrEqualTo(Integer value) {
            addCriterion("isConfirm >=", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmLessThan(Integer value) {
            addCriterion("isConfirm <", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmLessThanOrEqualTo(Integer value) {
            addCriterion("isConfirm <=", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmIn(List<Integer> values) {
            addCriterion("isConfirm in", values, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmNotIn(List<Integer> values) {
            addCriterion("isConfirm not in", values, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmBetween(Integer value1, Integer value2) {
            addCriterion("isConfirm between", value1, value2, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmNotBetween(Integer value1, Integer value2) {
            addCriterion("isConfirm not between", value1, value2, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("Category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("Category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("Category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("Category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("Category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("Category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("Category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("Category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("Category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("Category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("Category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("Category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("Category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("Category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andTeamnameIsNull() {
            addCriterion("TeamName is null");
            return (Criteria) this;
        }

        public Criteria andTeamnameIsNotNull() {
            addCriterion("TeamName is not null");
            return (Criteria) this;
        }

        public Criteria andTeamnameEqualTo(String value) {
            addCriterion("TeamName =", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotEqualTo(String value) {
            addCriterion("TeamName <>", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThan(String value) {
            addCriterion("TeamName >", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThanOrEqualTo(String value) {
            addCriterion("TeamName >=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThan(String value) {
            addCriterion("TeamName <", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThanOrEqualTo(String value) {
            addCriterion("TeamName <=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLike(String value) {
            addCriterion("TeamName like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotLike(String value) {
            addCriterion("TeamName not like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameIn(List<String> values) {
            addCriterion("TeamName in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotIn(List<String> values) {
            addCriterion("TeamName not in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameBetween(String value1, String value2) {
            addCriterion("TeamName between", value1, value2, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotBetween(String value1, String value2) {
            addCriterion("TeamName not between", value1, value2, "teamname");
            return (Criteria) this;
        }

        public Criteria andConfirmremIsNull() {
            addCriterion("confirmRem is null");
            return (Criteria) this;
        }

        public Criteria andConfirmremIsNotNull() {
            addCriterion("confirmRem is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmremEqualTo(String value) {
            addCriterion("confirmRem =", value, "confirmrem");
            return (Criteria) this;
        }

        public Criteria andConfirmremNotEqualTo(String value) {
            addCriterion("confirmRem <>", value, "confirmrem");
            return (Criteria) this;
        }

        public Criteria andConfirmremGreaterThan(String value) {
            addCriterion("confirmRem >", value, "confirmrem");
            return (Criteria) this;
        }

        public Criteria andConfirmremGreaterThanOrEqualTo(String value) {
            addCriterion("confirmRem >=", value, "confirmrem");
            return (Criteria) this;
        }

        public Criteria andConfirmremLessThan(String value) {
            addCriterion("confirmRem <", value, "confirmrem");
            return (Criteria) this;
        }

        public Criteria andConfirmremLessThanOrEqualTo(String value) {
            addCriterion("confirmRem <=", value, "confirmrem");
            return (Criteria) this;
        }

        public Criteria andConfirmremLike(String value) {
            addCriterion("confirmRem like", value, "confirmrem");
            return (Criteria) this;
        }

        public Criteria andConfirmremNotLike(String value) {
            addCriterion("confirmRem not like", value, "confirmrem");
            return (Criteria) this;
        }

        public Criteria andConfirmremIn(List<String> values) {
            addCriterion("confirmRem in", values, "confirmrem");
            return (Criteria) this;
        }

        public Criteria andConfirmremNotIn(List<String> values) {
            addCriterion("confirmRem not in", values, "confirmrem");
            return (Criteria) this;
        }

        public Criteria andConfirmremBetween(String value1, String value2) {
            addCriterion("confirmRem between", value1, value2, "confirmrem");
            return (Criteria) this;
        }

        public Criteria andConfirmremNotBetween(String value1, String value2) {
            addCriterion("confirmRem not between", value1, value2, "confirmrem");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andBusinessdescIsNull() {
            addCriterion("businessDesc is null");
            return (Criteria) this;
        }

        public Criteria andBusinessdescIsNotNull() {
            addCriterion("businessDesc is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessdescEqualTo(String value) {
            addCriterion("businessDesc =", value, "businessdesc");
            return (Criteria) this;
        }

        public Criteria andBusinessdescNotEqualTo(String value) {
            addCriterion("businessDesc <>", value, "businessdesc");
            return (Criteria) this;
        }

        public Criteria andBusinessdescGreaterThan(String value) {
            addCriterion("businessDesc >", value, "businessdesc");
            return (Criteria) this;
        }

        public Criteria andBusinessdescGreaterThanOrEqualTo(String value) {
            addCriterion("businessDesc >=", value, "businessdesc");
            return (Criteria) this;
        }

        public Criteria andBusinessdescLessThan(String value) {
            addCriterion("businessDesc <", value, "businessdesc");
            return (Criteria) this;
        }

        public Criteria andBusinessdescLessThanOrEqualTo(String value) {
            addCriterion("businessDesc <=", value, "businessdesc");
            return (Criteria) this;
        }

        public Criteria andBusinessdescLike(String value) {
            addCriterion("businessDesc like", value, "businessdesc");
            return (Criteria) this;
        }

        public Criteria andBusinessdescNotLike(String value) {
            addCriterion("businessDesc not like", value, "businessdesc");
            return (Criteria) this;
        }

        public Criteria andBusinessdescIn(List<String> values) {
            addCriterion("businessDesc in", values, "businessdesc");
            return (Criteria) this;
        }

        public Criteria andBusinessdescNotIn(List<String> values) {
            addCriterion("businessDesc not in", values, "businessdesc");
            return (Criteria) this;
        }

        public Criteria andBusinessdescBetween(String value1, String value2) {
            addCriterion("businessDesc between", value1, value2, "businessdesc");
            return (Criteria) this;
        }

        public Criteria andBusinessdescNotBetween(String value1, String value2) {
            addCriterion("businessDesc not between", value1, value2, "businessdesc");
            return (Criteria) this;
        }

        public Criteria andFinancedescIsNull() {
            addCriterion("financeDesc is null");
            return (Criteria) this;
        }

        public Criteria andFinancedescIsNotNull() {
            addCriterion("financeDesc is not null");
            return (Criteria) this;
        }

        public Criteria andFinancedescEqualTo(String value) {
            addCriterion("financeDesc =", value, "financedesc");
            return (Criteria) this;
        }

        public Criteria andFinancedescNotEqualTo(String value) {
            addCriterion("financeDesc <>", value, "financedesc");
            return (Criteria) this;
        }

        public Criteria andFinancedescGreaterThan(String value) {
            addCriterion("financeDesc >", value, "financedesc");
            return (Criteria) this;
        }

        public Criteria andFinancedescGreaterThanOrEqualTo(String value) {
            addCriterion("financeDesc >=", value, "financedesc");
            return (Criteria) this;
        }

        public Criteria andFinancedescLessThan(String value) {
            addCriterion("financeDesc <", value, "financedesc");
            return (Criteria) this;
        }

        public Criteria andFinancedescLessThanOrEqualTo(String value) {
            addCriterion("financeDesc <=", value, "financedesc");
            return (Criteria) this;
        }

        public Criteria andFinancedescLike(String value) {
            addCriterion("financeDesc like", value, "financedesc");
            return (Criteria) this;
        }

        public Criteria andFinancedescNotLike(String value) {
            addCriterion("financeDesc not like", value, "financedesc");
            return (Criteria) this;
        }

        public Criteria andFinancedescIn(List<String> values) {
            addCriterion("financeDesc in", values, "financedesc");
            return (Criteria) this;
        }

        public Criteria andFinancedescNotIn(List<String> values) {
            addCriterion("financeDesc not in", values, "financedesc");
            return (Criteria) this;
        }

        public Criteria andFinancedescBetween(String value1, String value2) {
            addCriterion("financeDesc between", value1, value2, "financedesc");
            return (Criteria) this;
        }

        public Criteria andFinancedescNotBetween(String value1, String value2) {
            addCriterion("financeDesc not between", value1, value2, "financedesc");
            return (Criteria) this;
        }

        public Criteria andStartsellcountIsNull() {
            addCriterion("startSellCount is null");
            return (Criteria) this;
        }

        public Criteria andStartsellcountIsNotNull() {
            addCriterion("startSellCount is not null");
            return (Criteria) this;
        }

        public Criteria andStartsellcountEqualTo(BigDecimal value) {
            addCriterion("startSellCount =", value, "startsellcount");
            return (Criteria) this;
        }

        public Criteria andStartsellcountNotEqualTo(BigDecimal value) {
            addCriterion("startSellCount <>", value, "startsellcount");
            return (Criteria) this;
        }

        public Criteria andStartsellcountGreaterThan(BigDecimal value) {
            addCriterion("startSellCount >", value, "startsellcount");
            return (Criteria) this;
        }

        public Criteria andStartsellcountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("startSellCount >=", value, "startsellcount");
            return (Criteria) this;
        }

        public Criteria andStartsellcountLessThan(BigDecimal value) {
            addCriterion("startSellCount <", value, "startsellcount");
            return (Criteria) this;
        }

        public Criteria andStartsellcountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("startSellCount <=", value, "startsellcount");
            return (Criteria) this;
        }

        public Criteria andStartsellcountIn(List<BigDecimal> values) {
            addCriterion("startSellCount in", values, "startsellcount");
            return (Criteria) this;
        }

        public Criteria andStartsellcountNotIn(List<BigDecimal> values) {
            addCriterion("startSellCount not in", values, "startsellcount");
            return (Criteria) this;
        }

        public Criteria andStartsellcountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("startSellCount between", value1, value2, "startsellcount");
            return (Criteria) this;
        }

        public Criteria andStartsellcountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("startSellCount not between", value1, value2, "startsellcount");
            return (Criteria) this;
        }

        public Criteria andModelcostIsNull() {
            addCriterion("modelCost is null");
            return (Criteria) this;
        }

        public Criteria andModelcostIsNotNull() {
            addCriterion("modelCost is not null");
            return (Criteria) this;
        }

        public Criteria andModelcostEqualTo(BigDecimal value) {
            addCriterion("modelCost =", value, "modelcost");
            return (Criteria) this;
        }

        public Criteria andModelcostNotEqualTo(BigDecimal value) {
            addCriterion("modelCost <>", value, "modelcost");
            return (Criteria) this;
        }

        public Criteria andModelcostGreaterThan(BigDecimal value) {
            addCriterion("modelCost >", value, "modelcost");
            return (Criteria) this;
        }

        public Criteria andModelcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("modelCost >=", value, "modelcost");
            return (Criteria) this;
        }

        public Criteria andModelcostLessThan(BigDecimal value) {
            addCriterion("modelCost <", value, "modelcost");
            return (Criteria) this;
        }

        public Criteria andModelcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("modelCost <=", value, "modelcost");
            return (Criteria) this;
        }

        public Criteria andModelcostIn(List<BigDecimal> values) {
            addCriterion("modelCost in", values, "modelcost");
            return (Criteria) this;
        }

        public Criteria andModelcostNotIn(List<BigDecimal> values) {
            addCriterion("modelCost not in", values, "modelcost");
            return (Criteria) this;
        }

        public Criteria andModelcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("modelCost between", value1, value2, "modelcost");
            return (Criteria) this;
        }

        public Criteria andModelcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("modelCost not between", value1, value2, "modelcost");
            return (Criteria) this;
        }

        public Criteria andEstimatepriceIsNull() {
            addCriterion("estimatePrice is null");
            return (Criteria) this;
        }

        public Criteria andEstimatepriceIsNotNull() {
            addCriterion("estimatePrice is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatepriceEqualTo(BigDecimal value) {
            addCriterion("estimatePrice =", value, "estimateprice");
            return (Criteria) this;
        }

        public Criteria andEstimatepriceNotEqualTo(BigDecimal value) {
            addCriterion("estimatePrice <>", value, "estimateprice");
            return (Criteria) this;
        }

        public Criteria andEstimatepriceGreaterThan(BigDecimal value) {
            addCriterion("estimatePrice >", value, "estimateprice");
            return (Criteria) this;
        }

        public Criteria andEstimatepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("estimatePrice >=", value, "estimateprice");
            return (Criteria) this;
        }

        public Criteria andEstimatepriceLessThan(BigDecimal value) {
            addCriterion("estimatePrice <", value, "estimateprice");
            return (Criteria) this;
        }

        public Criteria andEstimatepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("estimatePrice <=", value, "estimateprice");
            return (Criteria) this;
        }

        public Criteria andEstimatepriceIn(List<BigDecimal> values) {
            addCriterion("estimatePrice in", values, "estimateprice");
            return (Criteria) this;
        }

        public Criteria andEstimatepriceNotIn(List<BigDecimal> values) {
            addCriterion("estimatePrice not in", values, "estimateprice");
            return (Criteria) this;
        }

        public Criteria andEstimatepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimatePrice between", value1, value2, "estimateprice");
            return (Criteria) this;
        }

        public Criteria andEstimatepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimatePrice not between", value1, value2, "estimateprice");
            return (Criteria) this;
        }

        public Criteria andLittleorderpriceIsNull() {
            addCriterion("littleOrderPrice is null");
            return (Criteria) this;
        }

        public Criteria andLittleorderpriceIsNotNull() {
            addCriterion("littleOrderPrice is not null");
            return (Criteria) this;
        }

        public Criteria andLittleorderpriceEqualTo(BigDecimal value) {
            addCriterion("littleOrderPrice =", value, "littleorderprice");
            return (Criteria) this;
        }

        public Criteria andLittleorderpriceNotEqualTo(BigDecimal value) {
            addCriterion("littleOrderPrice <>", value, "littleorderprice");
            return (Criteria) this;
        }

        public Criteria andLittleorderpriceGreaterThan(BigDecimal value) {
            addCriterion("littleOrderPrice >", value, "littleorderprice");
            return (Criteria) this;
        }

        public Criteria andLittleorderpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("littleOrderPrice >=", value, "littleorderprice");
            return (Criteria) this;
        }

        public Criteria andLittleorderpriceLessThan(BigDecimal value) {
            addCriterion("littleOrderPrice <", value, "littleorderprice");
            return (Criteria) this;
        }

        public Criteria andLittleorderpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("littleOrderPrice <=", value, "littleorderprice");
            return (Criteria) this;
        }

        public Criteria andLittleorderpriceIn(List<BigDecimal> values) {
            addCriterion("littleOrderPrice in", values, "littleorderprice");
            return (Criteria) this;
        }

        public Criteria andLittleorderpriceNotIn(List<BigDecimal> values) {
            addCriterion("littleOrderPrice not in", values, "littleorderprice");
            return (Criteria) this;
        }

        public Criteria andLittleorderpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("littleOrderPrice between", value1, value2, "littleorderprice");
            return (Criteria) this;
        }

        public Criteria andLittleorderpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("littleOrderPrice not between", value1, value2, "littleorderprice");
            return (Criteria) this;
        }

        public Criteria andModelcostinvoicenoIsNull() {
            addCriterion("modelCostInvoiceNo is null");
            return (Criteria) this;
        }

        public Criteria andModelcostinvoicenoIsNotNull() {
            addCriterion("modelCostInvoiceNo is not null");
            return (Criteria) this;
        }

        public Criteria andModelcostinvoicenoEqualTo(String value) {
            addCriterion("modelCostInvoiceNo =", value, "modelcostinvoiceno");
            return (Criteria) this;
        }

        public Criteria andModelcostinvoicenoNotEqualTo(String value) {
            addCriterion("modelCostInvoiceNo <>", value, "modelcostinvoiceno");
            return (Criteria) this;
        }

        public Criteria andModelcostinvoicenoGreaterThan(String value) {
            addCriterion("modelCostInvoiceNo >", value, "modelcostinvoiceno");
            return (Criteria) this;
        }

        public Criteria andModelcostinvoicenoGreaterThanOrEqualTo(String value) {
            addCriterion("modelCostInvoiceNo >=", value, "modelcostinvoiceno");
            return (Criteria) this;
        }

        public Criteria andModelcostinvoicenoLessThan(String value) {
            addCriterion("modelCostInvoiceNo <", value, "modelcostinvoiceno");
            return (Criteria) this;
        }

        public Criteria andModelcostinvoicenoLessThanOrEqualTo(String value) {
            addCriterion("modelCostInvoiceNo <=", value, "modelcostinvoiceno");
            return (Criteria) this;
        }

        public Criteria andModelcostinvoicenoLike(String value) {
            addCriterion("modelCostInvoiceNo like", value, "modelcostinvoiceno");
            return (Criteria) this;
        }

        public Criteria andModelcostinvoicenoNotLike(String value) {
            addCriterion("modelCostInvoiceNo not like", value, "modelcostinvoiceno");
            return (Criteria) this;
        }

        public Criteria andModelcostinvoicenoIn(List<String> values) {
            addCriterion("modelCostInvoiceNo in", values, "modelcostinvoiceno");
            return (Criteria) this;
        }

        public Criteria andModelcostinvoicenoNotIn(List<String> values) {
            addCriterion("modelCostInvoiceNo not in", values, "modelcostinvoiceno");
            return (Criteria) this;
        }

        public Criteria andModelcostinvoicenoBetween(String value1, String value2) {
            addCriterion("modelCostInvoiceNo between", value1, value2, "modelcostinvoiceno");
            return (Criteria) this;
        }

        public Criteria andModelcostinvoicenoNotBetween(String value1, String value2) {
            addCriterion("modelCostInvoiceNo not between", value1, value2, "modelcostinvoiceno");
            return (Criteria) this;
        }

        public Criteria andFinancestartsellcountIsNull() {
            addCriterion("financeStartSellCount is null");
            return (Criteria) this;
        }

        public Criteria andFinancestartsellcountIsNotNull() {
            addCriterion("financeStartSellCount is not null");
            return (Criteria) this;
        }

        public Criteria andFinancestartsellcountEqualTo(BigDecimal value) {
            addCriterion("financeStartSellCount =", value, "financestartsellcount");
            return (Criteria) this;
        }

        public Criteria andFinancestartsellcountNotEqualTo(BigDecimal value) {
            addCriterion("financeStartSellCount <>", value, "financestartsellcount");
            return (Criteria) this;
        }

        public Criteria andFinancestartsellcountGreaterThan(BigDecimal value) {
            addCriterion("financeStartSellCount >", value, "financestartsellcount");
            return (Criteria) this;
        }

        public Criteria andFinancestartsellcountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("financeStartSellCount >=", value, "financestartsellcount");
            return (Criteria) this;
        }

        public Criteria andFinancestartsellcountLessThan(BigDecimal value) {
            addCriterion("financeStartSellCount <", value, "financestartsellcount");
            return (Criteria) this;
        }

        public Criteria andFinancestartsellcountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("financeStartSellCount <=", value, "financestartsellcount");
            return (Criteria) this;
        }

        public Criteria andFinancestartsellcountIn(List<BigDecimal> values) {
            addCriterion("financeStartSellCount in", values, "financestartsellcount");
            return (Criteria) this;
        }

        public Criteria andFinancestartsellcountNotIn(List<BigDecimal> values) {
            addCriterion("financeStartSellCount not in", values, "financestartsellcount");
            return (Criteria) this;
        }

        public Criteria andFinancestartsellcountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("financeStartSellCount between", value1, value2, "financestartsellcount");
            return (Criteria) this;
        }

        public Criteria andFinancestartsellcountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("financeStartSellCount not between", value1, value2, "financestartsellcount");
            return (Criteria) this;
        }

        public Criteria andFinancemodelcostIsNull() {
            addCriterion("financeModelCost is null");
            return (Criteria) this;
        }

        public Criteria andFinancemodelcostIsNotNull() {
            addCriterion("financeModelCost is not null");
            return (Criteria) this;
        }

        public Criteria andFinancemodelcostEqualTo(BigDecimal value) {
            addCriterion("financeModelCost =", value, "financemodelcost");
            return (Criteria) this;
        }

        public Criteria andFinancemodelcostNotEqualTo(BigDecimal value) {
            addCriterion("financeModelCost <>", value, "financemodelcost");
            return (Criteria) this;
        }

        public Criteria andFinancemodelcostGreaterThan(BigDecimal value) {
            addCriterion("financeModelCost >", value, "financemodelcost");
            return (Criteria) this;
        }

        public Criteria andFinancemodelcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("financeModelCost >=", value, "financemodelcost");
            return (Criteria) this;
        }

        public Criteria andFinancemodelcostLessThan(BigDecimal value) {
            addCriterion("financeModelCost <", value, "financemodelcost");
            return (Criteria) this;
        }

        public Criteria andFinancemodelcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("financeModelCost <=", value, "financemodelcost");
            return (Criteria) this;
        }

        public Criteria andFinancemodelcostIn(List<BigDecimal> values) {
            addCriterion("financeModelCost in", values, "financemodelcost");
            return (Criteria) this;
        }

        public Criteria andFinancemodelcostNotIn(List<BigDecimal> values) {
            addCriterion("financeModelCost not in", values, "financemodelcost");
            return (Criteria) this;
        }

        public Criteria andFinancemodelcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("financeModelCost between", value1, value2, "financemodelcost");
            return (Criteria) this;
        }

        public Criteria andFinancemodelcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("financeModelCost not between", value1, value2, "financemodelcost");
            return (Criteria) this;
        }

        public Criteria andFinancelittleorderpriceIsNull() {
            addCriterion("financeLittleOrderPrice is null");
            return (Criteria) this;
        }

        public Criteria andFinancelittleorderpriceIsNotNull() {
            addCriterion("financeLittleOrderPrice is not null");
            return (Criteria) this;
        }

        public Criteria andFinancelittleorderpriceEqualTo(BigDecimal value) {
            addCriterion("financeLittleOrderPrice =", value, "financelittleorderprice");
            return (Criteria) this;
        }

        public Criteria andFinancelittleorderpriceNotEqualTo(BigDecimal value) {
            addCriterion("financeLittleOrderPrice <>", value, "financelittleorderprice");
            return (Criteria) this;
        }

        public Criteria andFinancelittleorderpriceGreaterThan(BigDecimal value) {
            addCriterion("financeLittleOrderPrice >", value, "financelittleorderprice");
            return (Criteria) this;
        }

        public Criteria andFinancelittleorderpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("financeLittleOrderPrice >=", value, "financelittleorderprice");
            return (Criteria) this;
        }

        public Criteria andFinancelittleorderpriceLessThan(BigDecimal value) {
            addCriterion("financeLittleOrderPrice <", value, "financelittleorderprice");
            return (Criteria) this;
        }

        public Criteria andFinancelittleorderpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("financeLittleOrderPrice <=", value, "financelittleorderprice");
            return (Criteria) this;
        }

        public Criteria andFinancelittleorderpriceIn(List<BigDecimal> values) {
            addCriterion("financeLittleOrderPrice in", values, "financelittleorderprice");
            return (Criteria) this;
        }

        public Criteria andFinancelittleorderpriceNotIn(List<BigDecimal> values) {
            addCriterion("financeLittleOrderPrice not in", values, "financelittleorderprice");
            return (Criteria) this;
        }

        public Criteria andFinancelittleorderpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("financeLittleOrderPrice between", value1, value2, "financelittleorderprice");
            return (Criteria) this;
        }

        public Criteria andFinancelittleorderpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("financeLittleOrderPrice not between", value1, value2, "financelittleorderprice");
            return (Criteria) this;
        }

        public Criteria andBuyerdescIsNull() {
            addCriterion("buyerDesc is null");
            return (Criteria) this;
        }

        public Criteria andBuyerdescIsNotNull() {
            addCriterion("buyerDesc is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerdescEqualTo(String value) {
            addCriterion("buyerDesc =", value, "buyerdesc");
            return (Criteria) this;
        }

        public Criteria andBuyerdescNotEqualTo(String value) {
            addCriterion("buyerDesc <>", value, "buyerdesc");
            return (Criteria) this;
        }

        public Criteria andBuyerdescGreaterThan(String value) {
            addCriterion("buyerDesc >", value, "buyerdesc");
            return (Criteria) this;
        }

        public Criteria andBuyerdescGreaterThanOrEqualTo(String value) {
            addCriterion("buyerDesc >=", value, "buyerdesc");
            return (Criteria) this;
        }

        public Criteria andBuyerdescLessThan(String value) {
            addCriterion("buyerDesc <", value, "buyerdesc");
            return (Criteria) this;
        }

        public Criteria andBuyerdescLessThanOrEqualTo(String value) {
            addCriterion("buyerDesc <=", value, "buyerdesc");
            return (Criteria) this;
        }

        public Criteria andBuyerdescLike(String value) {
            addCriterion("buyerDesc like", value, "buyerdesc");
            return (Criteria) this;
        }

        public Criteria andBuyerdescNotLike(String value) {
            addCriterion("buyerDesc not like", value, "buyerdesc");
            return (Criteria) this;
        }

        public Criteria andBuyerdescIn(List<String> values) {
            addCriterion("buyerDesc in", values, "buyerdesc");
            return (Criteria) this;
        }

        public Criteria andBuyerdescNotIn(List<String> values) {
            addCriterion("buyerDesc not in", values, "buyerdesc");
            return (Criteria) this;
        }

        public Criteria andBuyerdescBetween(String value1, String value2) {
            addCriterion("buyerDesc between", value1, value2, "buyerdesc");
            return (Criteria) this;
        }

        public Criteria andBuyerdescNotBetween(String value1, String value2) {
            addCriterion("buyerDesc not between", value1, value2, "buyerdesc");
            return (Criteria) this;
        }

        public Criteria andPrdNoIsNull() {
            addCriterion("prd_no is null");
            return (Criteria) this;
        }

        public Criteria andPrdNoIsNotNull() {
            addCriterion("prd_no is not null");
            return (Criteria) this;
        }

        public Criteria andPrdNoEqualTo(String value) {
            addCriterion("prd_no =", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotEqualTo(String value) {
            addCriterion("prd_no <>", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoGreaterThan(String value) {
            addCriterion("prd_no >", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoGreaterThanOrEqualTo(String value) {
            addCriterion("prd_no >=", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoLessThan(String value) {
            addCriterion("prd_no <", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoLessThanOrEqualTo(String value) {
            addCriterion("prd_no <=", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoLike(String value) {
            addCriterion("prd_no like", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotLike(String value) {
            addCriterion("prd_no not like", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoIn(List<String> values) {
            addCriterion("prd_no in", values, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotIn(List<String> values) {
            addCriterion("prd_no not in", values, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoBetween(String value1, String value2) {
            addCriterion("prd_no between", value1, value2, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotBetween(String value1, String value2) {
            addCriterion("prd_no not between", value1, value2, "prdNo");
            return (Criteria) this;
        }

        public Criteria andSalemandescIsNull() {
            addCriterion("saleManDesc is null");
            return (Criteria) this;
        }

        public Criteria andSalemandescIsNotNull() {
            addCriterion("saleManDesc is not null");
            return (Criteria) this;
        }

        public Criteria andSalemandescEqualTo(String value) {
            addCriterion("saleManDesc =", value, "salemandesc");
            return (Criteria) this;
        }

        public Criteria andSalemandescNotEqualTo(String value) {
            addCriterion("saleManDesc <>", value, "salemandesc");
            return (Criteria) this;
        }

        public Criteria andSalemandescGreaterThan(String value) {
            addCriterion("saleManDesc >", value, "salemandesc");
            return (Criteria) this;
        }

        public Criteria andSalemandescGreaterThanOrEqualTo(String value) {
            addCriterion("saleManDesc >=", value, "salemandesc");
            return (Criteria) this;
        }

        public Criteria andSalemandescLessThan(String value) {
            addCriterion("saleManDesc <", value, "salemandesc");
            return (Criteria) this;
        }

        public Criteria andSalemandescLessThanOrEqualTo(String value) {
            addCriterion("saleManDesc <=", value, "salemandesc");
            return (Criteria) this;
        }

        public Criteria andSalemandescLike(String value) {
            addCriterion("saleManDesc like", value, "salemandesc");
            return (Criteria) this;
        }

        public Criteria andSalemandescNotLike(String value) {
            addCriterion("saleManDesc not like", value, "salemandesc");
            return (Criteria) this;
        }

        public Criteria andSalemandescIn(List<String> values) {
            addCriterion("saleManDesc in", values, "salemandesc");
            return (Criteria) this;
        }

        public Criteria andSalemandescNotIn(List<String> values) {
            addCriterion("saleManDesc not in", values, "salemandesc");
            return (Criteria) this;
        }

        public Criteria andSalemandescBetween(String value1, String value2) {
            addCriterion("saleManDesc between", value1, value2, "salemandesc");
            return (Criteria) this;
        }

        public Criteria andSalemandescNotBetween(String value1, String value2) {
            addCriterion("saleManDesc not between", value1, value2, "salemandesc");
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