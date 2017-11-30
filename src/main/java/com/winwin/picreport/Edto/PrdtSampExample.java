package com.winwin.picreport.Edto;

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