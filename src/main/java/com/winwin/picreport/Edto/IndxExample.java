package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndxExample() {
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

        public Criteria andIdxNoIsNull() {
            addCriterion("IDX_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdxNoIsNotNull() {
            addCriterion("IDX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdxNoEqualTo(String value) {
            addCriterion("IDX_NO =", value, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoNotEqualTo(String value) {
            addCriterion("IDX_NO <>", value, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoGreaterThan(String value) {
            addCriterion("IDX_NO >", value, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoGreaterThanOrEqualTo(String value) {
            addCriterion("IDX_NO >=", value, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoLessThan(String value) {
            addCriterion("IDX_NO <", value, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoLessThanOrEqualTo(String value) {
            addCriterion("IDX_NO <=", value, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoLike(String value) {
            addCriterion("IDX_NO like", value, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoNotLike(String value) {
            addCriterion("IDX_NO not like", value, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoIn(List<String> values) {
            addCriterion("IDX_NO in", values, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoNotIn(List<String> values) {
            addCriterion("IDX_NO not in", values, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoBetween(String value1, String value2) {
            addCriterion("IDX_NO between", value1, value2, "idxNo");
            return (Criteria) this;
        }

        public Criteria andIdxNoNotBetween(String value1, String value2) {
            addCriterion("IDX_NO not between", value1, value2, "idxNo");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdxUpIsNull() {
            addCriterion("IDX_UP is null");
            return (Criteria) this;
        }

        public Criteria andIdxUpIsNotNull() {
            addCriterion("IDX_UP is not null");
            return (Criteria) this;
        }

        public Criteria andIdxUpEqualTo(String value) {
            addCriterion("IDX_UP =", value, "idxUp");
            return (Criteria) this;
        }

        public Criteria andIdxUpNotEqualTo(String value) {
            addCriterion("IDX_UP <>", value, "idxUp");
            return (Criteria) this;
        }

        public Criteria andIdxUpGreaterThan(String value) {
            addCriterion("IDX_UP >", value, "idxUp");
            return (Criteria) this;
        }

        public Criteria andIdxUpGreaterThanOrEqualTo(String value) {
            addCriterion("IDX_UP >=", value, "idxUp");
            return (Criteria) this;
        }

        public Criteria andIdxUpLessThan(String value) {
            addCriterion("IDX_UP <", value, "idxUp");
            return (Criteria) this;
        }

        public Criteria andIdxUpLessThanOrEqualTo(String value) {
            addCriterion("IDX_UP <=", value, "idxUp");
            return (Criteria) this;
        }

        public Criteria andIdxUpLike(String value) {
            addCriterion("IDX_UP like", value, "idxUp");
            return (Criteria) this;
        }

        public Criteria andIdxUpNotLike(String value) {
            addCriterion("IDX_UP not like", value, "idxUp");
            return (Criteria) this;
        }

        public Criteria andIdxUpIn(List<String> values) {
            addCriterion("IDX_UP in", values, "idxUp");
            return (Criteria) this;
        }

        public Criteria andIdxUpNotIn(List<String> values) {
            addCriterion("IDX_UP not in", values, "idxUp");
            return (Criteria) this;
        }

        public Criteria andIdxUpBetween(String value1, String value2) {
            addCriterion("IDX_UP between", value1, value2, "idxUp");
            return (Criteria) this;
        }

        public Criteria andIdxUpNotBetween(String value1, String value2) {
            addCriterion("IDX_UP not between", value1, value2, "idxUp");
            return (Criteria) this;
        }

        public Criteria andStopDdIsNull() {
            addCriterion("STOP_DD is null");
            return (Criteria) this;
        }

        public Criteria andStopDdIsNotNull() {
            addCriterion("STOP_DD is not null");
            return (Criteria) this;
        }

        public Criteria andStopDdEqualTo(Date value) {
            addCriterion("STOP_DD =", value, "stopDd");
            return (Criteria) this;
        }

        public Criteria andStopDdNotEqualTo(Date value) {
            addCriterion("STOP_DD <>", value, "stopDd");
            return (Criteria) this;
        }

        public Criteria andStopDdGreaterThan(Date value) {
            addCriterion("STOP_DD >", value, "stopDd");
            return (Criteria) this;
        }

        public Criteria andStopDdGreaterThanOrEqualTo(Date value) {
            addCriterion("STOP_DD >=", value, "stopDd");
            return (Criteria) this;
        }

        public Criteria andStopDdLessThan(Date value) {
            addCriterion("STOP_DD <", value, "stopDd");
            return (Criteria) this;
        }

        public Criteria andStopDdLessThanOrEqualTo(Date value) {
            addCriterion("STOP_DD <=", value, "stopDd");
            return (Criteria) this;
        }

        public Criteria andStopDdIn(List<Date> values) {
            addCriterion("STOP_DD in", values, "stopDd");
            return (Criteria) this;
        }

        public Criteria andStopDdNotIn(List<Date> values) {
            addCriterion("STOP_DD not in", values, "stopDd");
            return (Criteria) this;
        }

        public Criteria andStopDdBetween(Date value1, Date value2) {
            addCriterion("STOP_DD between", value1, value2, "stopDd");
            return (Criteria) this;
        }

        public Criteria andStopDdNotBetween(Date value1, Date value2) {
            addCriterion("STOP_DD not between", value1, value2, "stopDd");
            return (Criteria) this;
        }

        public Criteria andRemIsNull() {
            addCriterion("REM is null");
            return (Criteria) this;
        }

        public Criteria andRemIsNotNull() {
            addCriterion("REM is not null");
            return (Criteria) this;
        }

        public Criteria andRemEqualTo(String value) {
            addCriterion("REM =", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemNotEqualTo(String value) {
            addCriterion("REM <>", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemGreaterThan(String value) {
            addCriterion("REM >", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemGreaterThanOrEqualTo(String value) {
            addCriterion("REM >=", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemLessThan(String value) {
            addCriterion("REM <", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemLessThanOrEqualTo(String value) {
            addCriterion("REM <=", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemLike(String value) {
            addCriterion("REM like", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemNotLike(String value) {
            addCriterion("REM not like", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemIn(List<String> values) {
            addCriterion("REM in", values, "rem");
            return (Criteria) this;
        }

        public Criteria andRemNotIn(List<String> values) {
            addCriterion("REM not in", values, "rem");
            return (Criteria) this;
        }

        public Criteria andRemBetween(String value1, String value2) {
            addCriterion("REM between", value1, value2, "rem");
            return (Criteria) this;
        }

        public Criteria andRemNotBetween(String value1, String value2) {
            addCriterion("REM not between", value1, value2, "rem");
            return (Criteria) this;
        }

        public Criteria andUpStdIsNull() {
            addCriterion("UP_STD is null");
            return (Criteria) this;
        }

        public Criteria andUpStdIsNotNull() {
            addCriterion("UP_STD is not null");
            return (Criteria) this;
        }

        public Criteria andUpStdEqualTo(BigDecimal value) {
            addCriterion("UP_STD =", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdNotEqualTo(BigDecimal value) {
            addCriterion("UP_STD <>", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdGreaterThan(BigDecimal value) {
            addCriterion("UP_STD >", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_STD >=", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdLessThan(BigDecimal value) {
            addCriterion("UP_STD <", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_STD <=", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdIn(List<BigDecimal> values) {
            addCriterion("UP_STD in", values, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdNotIn(List<BigDecimal> values) {
            addCriterion("UP_STD not in", values, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_STD between", value1, value2, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_STD not between", value1, value2, "upStd");
            return (Criteria) this;
        }

        public Criteria andWebTitleIsNull() {
            addCriterion("WEB_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andWebTitleIsNotNull() {
            addCriterion("WEB_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andWebTitleEqualTo(String value) {
            addCriterion("WEB_TITLE =", value, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleNotEqualTo(String value) {
            addCriterion("WEB_TITLE <>", value, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleGreaterThan(String value) {
            addCriterion("WEB_TITLE >", value, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_TITLE >=", value, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleLessThan(String value) {
            addCriterion("WEB_TITLE <", value, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleLessThanOrEqualTo(String value) {
            addCriterion("WEB_TITLE <=", value, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleLike(String value) {
            addCriterion("WEB_TITLE like", value, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleNotLike(String value) {
            addCriterion("WEB_TITLE not like", value, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleIn(List<String> values) {
            addCriterion("WEB_TITLE in", values, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleNotIn(List<String> values) {
            addCriterion("WEB_TITLE not in", values, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleBetween(String value1, String value2) {
            addCriterion("WEB_TITLE between", value1, value2, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleNotBetween(String value1, String value2) {
            addCriterion("WEB_TITLE not between", value1, value2, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionIsNull() {
            addCriterion("WEB_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionIsNotNull() {
            addCriterion("WEB_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionEqualTo(String value) {
            addCriterion("WEB_DESCRIPTION =", value, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionNotEqualTo(String value) {
            addCriterion("WEB_DESCRIPTION <>", value, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionGreaterThan(String value) {
            addCriterion("WEB_DESCRIPTION >", value, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_DESCRIPTION >=", value, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionLessThan(String value) {
            addCriterion("WEB_DESCRIPTION <", value, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionLessThanOrEqualTo(String value) {
            addCriterion("WEB_DESCRIPTION <=", value, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionLike(String value) {
            addCriterion("WEB_DESCRIPTION like", value, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionNotLike(String value) {
            addCriterion("WEB_DESCRIPTION not like", value, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionIn(List<String> values) {
            addCriterion("WEB_DESCRIPTION in", values, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionNotIn(List<String> values) {
            addCriterion("WEB_DESCRIPTION not in", values, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionBetween(String value1, String value2) {
            addCriterion("WEB_DESCRIPTION between", value1, value2, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionNotBetween(String value1, String value2) {
            addCriterion("WEB_DESCRIPTION not between", value1, value2, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsIsNull() {
            addCriterion("WEB_KEYWORDS is null");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsIsNotNull() {
            addCriterion("WEB_KEYWORDS is not null");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsEqualTo(String value) {
            addCriterion("WEB_KEYWORDS =", value, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsNotEqualTo(String value) {
            addCriterion("WEB_KEYWORDS <>", value, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsGreaterThan(String value) {
            addCriterion("WEB_KEYWORDS >", value, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_KEYWORDS >=", value, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsLessThan(String value) {
            addCriterion("WEB_KEYWORDS <", value, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsLessThanOrEqualTo(String value) {
            addCriterion("WEB_KEYWORDS <=", value, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsLike(String value) {
            addCriterion("WEB_KEYWORDS like", value, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsNotLike(String value) {
            addCriterion("WEB_KEYWORDS not like", value, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsIn(List<String> values) {
            addCriterion("WEB_KEYWORDS in", values, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsNotIn(List<String> values) {
            addCriterion("WEB_KEYWORDS not in", values, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsBetween(String value1, String value2) {
            addCriterion("WEB_KEYWORDS between", value1, value2, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsNotBetween(String value1, String value2) {
            addCriterion("WEB_KEYWORDS not between", value1, value2, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andDaySupplyIsNull() {
            addCriterion("DAY_SUPPLY is null");
            return (Criteria) this;
        }

        public Criteria andDaySupplyIsNotNull() {
            addCriterion("DAY_SUPPLY is not null");
            return (Criteria) this;
        }

        public Criteria andDaySupplyEqualTo(String value) {
            addCriterion("DAY_SUPPLY =", value, "daySupply");
            return (Criteria) this;
        }

        public Criteria andDaySupplyNotEqualTo(String value) {
            addCriterion("DAY_SUPPLY <>", value, "daySupply");
            return (Criteria) this;
        }

        public Criteria andDaySupplyGreaterThan(String value) {
            addCriterion("DAY_SUPPLY >", value, "daySupply");
            return (Criteria) this;
        }

        public Criteria andDaySupplyGreaterThanOrEqualTo(String value) {
            addCriterion("DAY_SUPPLY >=", value, "daySupply");
            return (Criteria) this;
        }

        public Criteria andDaySupplyLessThan(String value) {
            addCriterion("DAY_SUPPLY <", value, "daySupply");
            return (Criteria) this;
        }

        public Criteria andDaySupplyLessThanOrEqualTo(String value) {
            addCriterion("DAY_SUPPLY <=", value, "daySupply");
            return (Criteria) this;
        }

        public Criteria andDaySupplyLike(String value) {
            addCriterion("DAY_SUPPLY like", value, "daySupply");
            return (Criteria) this;
        }

        public Criteria andDaySupplyNotLike(String value) {
            addCriterion("DAY_SUPPLY not like", value, "daySupply");
            return (Criteria) this;
        }

        public Criteria andDaySupplyIn(List<String> values) {
            addCriterion("DAY_SUPPLY in", values, "daySupply");
            return (Criteria) this;
        }

        public Criteria andDaySupplyNotIn(List<String> values) {
            addCriterion("DAY_SUPPLY not in", values, "daySupply");
            return (Criteria) this;
        }

        public Criteria andDaySupplyBetween(String value1, String value2) {
            addCriterion("DAY_SUPPLY between", value1, value2, "daySupply");
            return (Criteria) this;
        }

        public Criteria andDaySupplyNotBetween(String value1, String value2) {
            addCriterion("DAY_SUPPLY not between", value1, value2, "daySupply");
            return (Criteria) this;
        }

        public Criteria andChkYhIsNull() {
            addCriterion("CHK_YH is null");
            return (Criteria) this;
        }

        public Criteria andChkYhIsNotNull() {
            addCriterion("CHK_YH is not null");
            return (Criteria) this;
        }

        public Criteria andChkYhEqualTo(String value) {
            addCriterion("CHK_YH =", value, "chkYh");
            return (Criteria) this;
        }

        public Criteria andChkYhNotEqualTo(String value) {
            addCriterion("CHK_YH <>", value, "chkYh");
            return (Criteria) this;
        }

        public Criteria andChkYhGreaterThan(String value) {
            addCriterion("CHK_YH >", value, "chkYh");
            return (Criteria) this;
        }

        public Criteria andChkYhGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_YH >=", value, "chkYh");
            return (Criteria) this;
        }

        public Criteria andChkYhLessThan(String value) {
            addCriterion("CHK_YH <", value, "chkYh");
            return (Criteria) this;
        }

        public Criteria andChkYhLessThanOrEqualTo(String value) {
            addCriterion("CHK_YH <=", value, "chkYh");
            return (Criteria) this;
        }

        public Criteria andChkYhLike(String value) {
            addCriterion("CHK_YH like", value, "chkYh");
            return (Criteria) this;
        }

        public Criteria andChkYhNotLike(String value) {
            addCriterion("CHK_YH not like", value, "chkYh");
            return (Criteria) this;
        }

        public Criteria andChkYhIn(List<String> values) {
            addCriterion("CHK_YH in", values, "chkYh");
            return (Criteria) this;
        }

        public Criteria andChkYhNotIn(List<String> values) {
            addCriterion("CHK_YH not in", values, "chkYh");
            return (Criteria) this;
        }

        public Criteria andChkYhBetween(String value1, String value2) {
            addCriterion("CHK_YH between", value1, value2, "chkYh");
            return (Criteria) this;
        }

        public Criteria andChkYhNotBetween(String value1, String value2) {
            addCriterion("CHK_YH not between", value1, value2, "chkYh");
            return (Criteria) this;
        }

        public Criteria andLosRtoIsNull() {
            addCriterion("LOS_RTO is null");
            return (Criteria) this;
        }

        public Criteria andLosRtoIsNotNull() {
            addCriterion("LOS_RTO is not null");
            return (Criteria) this;
        }

        public Criteria andLosRtoEqualTo(BigDecimal value) {
            addCriterion("LOS_RTO =", value, "losRto");
            return (Criteria) this;
        }

        public Criteria andLosRtoNotEqualTo(BigDecimal value) {
            addCriterion("LOS_RTO <>", value, "losRto");
            return (Criteria) this;
        }

        public Criteria andLosRtoGreaterThan(BigDecimal value) {
            addCriterion("LOS_RTO >", value, "losRto");
            return (Criteria) this;
        }

        public Criteria andLosRtoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOS_RTO >=", value, "losRto");
            return (Criteria) this;
        }

        public Criteria andLosRtoLessThan(BigDecimal value) {
            addCriterion("LOS_RTO <", value, "losRto");
            return (Criteria) this;
        }

        public Criteria andLosRtoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOS_RTO <=", value, "losRto");
            return (Criteria) this;
        }

        public Criteria andLosRtoIn(List<BigDecimal> values) {
            addCriterion("LOS_RTO in", values, "losRto");
            return (Criteria) this;
        }

        public Criteria andLosRtoNotIn(List<BigDecimal> values) {
            addCriterion("LOS_RTO not in", values, "losRto");
            return (Criteria) this;
        }

        public Criteria andLosRtoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOS_RTO between", value1, value2, "losRto");
            return (Criteria) this;
        }

        public Criteria andLosRtoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOS_RTO not between", value1, value2, "losRto");
            return (Criteria) this;
        }

        public Criteria andChkPosIsNull() {
            addCriterion("CHK_POS is null");
            return (Criteria) this;
        }

        public Criteria andChkPosIsNotNull() {
            addCriterion("CHK_POS is not null");
            return (Criteria) this;
        }

        public Criteria andChkPosEqualTo(String value) {
            addCriterion("CHK_POS =", value, "chkPos");
            return (Criteria) this;
        }

        public Criteria andChkPosNotEqualTo(String value) {
            addCriterion("CHK_POS <>", value, "chkPos");
            return (Criteria) this;
        }

        public Criteria andChkPosGreaterThan(String value) {
            addCriterion("CHK_POS >", value, "chkPos");
            return (Criteria) this;
        }

        public Criteria andChkPosGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_POS >=", value, "chkPos");
            return (Criteria) this;
        }

        public Criteria andChkPosLessThan(String value) {
            addCriterion("CHK_POS <", value, "chkPos");
            return (Criteria) this;
        }

        public Criteria andChkPosLessThanOrEqualTo(String value) {
            addCriterion("CHK_POS <=", value, "chkPos");
            return (Criteria) this;
        }

        public Criteria andChkPosLike(String value) {
            addCriterion("CHK_POS like", value, "chkPos");
            return (Criteria) this;
        }

        public Criteria andChkPosNotLike(String value) {
            addCriterion("CHK_POS not like", value, "chkPos");
            return (Criteria) this;
        }

        public Criteria andChkPosIn(List<String> values) {
            addCriterion("CHK_POS in", values, "chkPos");
            return (Criteria) this;
        }

        public Criteria andChkPosNotIn(List<String> values) {
            addCriterion("CHK_POS not in", values, "chkPos");
            return (Criteria) this;
        }

        public Criteria andChkPosBetween(String value1, String value2) {
            addCriterion("CHK_POS between", value1, value2, "chkPos");
            return (Criteria) this;
        }

        public Criteria andChkPosNotBetween(String value1, String value2) {
            addCriterion("CHK_POS not between", value1, value2, "chkPos");
            return (Criteria) this;
        }

        public Criteria andIdxTypeIsNull() {
            addCriterion("IDX_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdxTypeIsNotNull() {
            addCriterion("IDX_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdxTypeEqualTo(String value) {
            addCriterion("IDX_TYPE =", value, "idxType");
            return (Criteria) this;
        }

        public Criteria andIdxTypeNotEqualTo(String value) {
            addCriterion("IDX_TYPE <>", value, "idxType");
            return (Criteria) this;
        }

        public Criteria andIdxTypeGreaterThan(String value) {
            addCriterion("IDX_TYPE >", value, "idxType");
            return (Criteria) this;
        }

        public Criteria andIdxTypeGreaterThanOrEqualTo(String value) {
            addCriterion("IDX_TYPE >=", value, "idxType");
            return (Criteria) this;
        }

        public Criteria andIdxTypeLessThan(String value) {
            addCriterion("IDX_TYPE <", value, "idxType");
            return (Criteria) this;
        }

        public Criteria andIdxTypeLessThanOrEqualTo(String value) {
            addCriterion("IDX_TYPE <=", value, "idxType");
            return (Criteria) this;
        }

        public Criteria andIdxTypeLike(String value) {
            addCriterion("IDX_TYPE like", value, "idxType");
            return (Criteria) this;
        }

        public Criteria andIdxTypeNotLike(String value) {
            addCriterion("IDX_TYPE not like", value, "idxType");
            return (Criteria) this;
        }

        public Criteria andIdxTypeIn(List<String> values) {
            addCriterion("IDX_TYPE in", values, "idxType");
            return (Criteria) this;
        }

        public Criteria andIdxTypeNotIn(List<String> values) {
            addCriterion("IDX_TYPE not in", values, "idxType");
            return (Criteria) this;
        }

        public Criteria andIdxTypeBetween(String value1, String value2) {
            addCriterion("IDX_TYPE between", value1, value2, "idxType");
            return (Criteria) this;
        }

        public Criteria andIdxTypeNotBetween(String value1, String value2) {
            addCriterion("IDX_TYPE not between", value1, value2, "idxType");
            return (Criteria) this;
        }

        public Criteria andChkB2cIsNull() {
            addCriterion("CHK_B2C is null");
            return (Criteria) this;
        }

        public Criteria andChkB2cIsNotNull() {
            addCriterion("CHK_B2C is not null");
            return (Criteria) this;
        }

        public Criteria andChkB2cEqualTo(String value) {
            addCriterion("CHK_B2C =", value, "chkB2c");
            return (Criteria) this;
        }

        public Criteria andChkB2cNotEqualTo(String value) {
            addCriterion("CHK_B2C <>", value, "chkB2c");
            return (Criteria) this;
        }

        public Criteria andChkB2cGreaterThan(String value) {
            addCriterion("CHK_B2C >", value, "chkB2c");
            return (Criteria) this;
        }

        public Criteria andChkB2cGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_B2C >=", value, "chkB2c");
            return (Criteria) this;
        }

        public Criteria andChkB2cLessThan(String value) {
            addCriterion("CHK_B2C <", value, "chkB2c");
            return (Criteria) this;
        }

        public Criteria andChkB2cLessThanOrEqualTo(String value) {
            addCriterion("CHK_B2C <=", value, "chkB2c");
            return (Criteria) this;
        }

        public Criteria andChkB2cLike(String value) {
            addCriterion("CHK_B2C like", value, "chkB2c");
            return (Criteria) this;
        }

        public Criteria andChkB2cNotLike(String value) {
            addCriterion("CHK_B2C not like", value, "chkB2c");
            return (Criteria) this;
        }

        public Criteria andChkB2cIn(List<String> values) {
            addCriterion("CHK_B2C in", values, "chkB2c");
            return (Criteria) this;
        }

        public Criteria andChkB2cNotIn(List<String> values) {
            addCriterion("CHK_B2C not in", values, "chkB2c");
            return (Criteria) this;
        }

        public Criteria andChkB2cBetween(String value1, String value2) {
            addCriterion("CHK_B2C between", value1, value2, "chkB2c");
            return (Criteria) this;
        }

        public Criteria andChkB2cNotBetween(String value1, String value2) {
            addCriterion("CHK_B2C not between", value1, value2, "chkB2c");
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