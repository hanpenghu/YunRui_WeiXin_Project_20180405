package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UpDefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpDefExample() {
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

        public Criteria andPriceIdIsNull() {
            addCriterion("PRICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPriceIdIsNotNull() {
            addCriterion("PRICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPriceIdEqualTo(String value) {
            addCriterion("PRICE_ID =", value, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdNotEqualTo(String value) {
            addCriterion("PRICE_ID <>", value, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdGreaterThan(String value) {
            addCriterion("PRICE_ID >", value, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_ID >=", value, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdLessThan(String value) {
            addCriterion("PRICE_ID <", value, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdLessThanOrEqualTo(String value) {
            addCriterion("PRICE_ID <=", value, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdLike(String value) {
            addCriterion("PRICE_ID like", value, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdNotLike(String value) {
            addCriterion("PRICE_ID not like", value, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdIn(List<String> values) {
            addCriterion("PRICE_ID in", values, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdNotIn(List<String> values) {
            addCriterion("PRICE_ID not in", values, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdBetween(String value1, String value2) {
            addCriterion("PRICE_ID between", value1, value2, "priceId");
            return (Criteria) this;
        }

        public Criteria andPriceIdNotBetween(String value1, String value2) {
            addCriterion("PRICE_ID not between", value1, value2, "priceId");
            return (Criteria) this;
        }

        public Criteria andCusNoIsNull() {
            addCriterion("CUS_NO is null");
            return (Criteria) this;
        }

        public Criteria andCusNoIsNotNull() {
            addCriterion("CUS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCusNoEqualTo(String value) {
            addCriterion("CUS_NO =", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotEqualTo(String value) {
            addCriterion("CUS_NO <>", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoGreaterThan(String value) {
            addCriterion("CUS_NO >", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_NO >=", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLessThan(String value) {
            addCriterion("CUS_NO <", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLessThanOrEqualTo(String value) {
            addCriterion("CUS_NO <=", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLike(String value) {
            addCriterion("CUS_NO like", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotLike(String value) {
            addCriterion("CUS_NO not like", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoIn(List<String> values) {
            addCriterion("CUS_NO in", values, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotIn(List<String> values) {
            addCriterion("CUS_NO not in", values, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoBetween(String value1, String value2) {
            addCriterion("CUS_NO between", value1, value2, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotBetween(String value1, String value2) {
            addCriterion("CUS_NO not between", value1, value2, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCurIdIsNull() {
            addCriterion("CUR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCurIdIsNotNull() {
            addCriterion("CUR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCurIdEqualTo(String value) {
            addCriterion("CUR_ID =", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotEqualTo(String value) {
            addCriterion("CUR_ID <>", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdGreaterThan(String value) {
            addCriterion("CUR_ID >", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUR_ID >=", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdLessThan(String value) {
            addCriterion("CUR_ID <", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdLessThanOrEqualTo(String value) {
            addCriterion("CUR_ID <=", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdLike(String value) {
            addCriterion("CUR_ID like", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotLike(String value) {
            addCriterion("CUR_ID not like", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdIn(List<String> values) {
            addCriterion("CUR_ID in", values, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotIn(List<String> values) {
            addCriterion("CUR_ID not in", values, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdBetween(String value1, String value2) {
            addCriterion("CUR_ID between", value1, value2, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotBetween(String value1, String value2) {
            addCriterion("CUR_ID not between", value1, value2, "curId");
            return (Criteria) this;
        }

        public Criteria andPrdNoIsNull() {
            addCriterion("PRD_NO is null");
            return (Criteria) this;
        }

        public Criteria andPrdNoIsNotNull() {
            addCriterion("PRD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPrdNoEqualTo(String value) {
            addCriterion("PRD_NO =", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotEqualTo(String value) {
            addCriterion("PRD_NO <>", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoGreaterThan(String value) {
            addCriterion("PRD_NO >", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_NO >=", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoLessThan(String value) {
            addCriterion("PRD_NO <", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoLessThanOrEqualTo(String value) {
            addCriterion("PRD_NO <=", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoLike(String value) {
            addCriterion("PRD_NO like", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotLike(String value) {
            addCriterion("PRD_NO not like", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoIn(List<String> values) {
            addCriterion("PRD_NO in", values, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotIn(List<String> values) {
            addCriterion("PRD_NO not in", values, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoBetween(String value1, String value2) {
            addCriterion("PRD_NO between", value1, value2, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotBetween(String value1, String value2) {
            addCriterion("PRD_NO not between", value1, value2, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdMarkIsNull() {
            addCriterion("PRD_MARK is null");
            return (Criteria) this;
        }

        public Criteria andPrdMarkIsNotNull() {
            addCriterion("PRD_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andPrdMarkEqualTo(String value) {
            addCriterion("PRD_MARK =", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkNotEqualTo(String value) {
            addCriterion("PRD_MARK <>", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkGreaterThan(String value) {
            addCriterion("PRD_MARK >", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_MARK >=", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkLessThan(String value) {
            addCriterion("PRD_MARK <", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkLessThanOrEqualTo(String value) {
            addCriterion("PRD_MARK <=", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkLike(String value) {
            addCriterion("PRD_MARK like", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkNotLike(String value) {
            addCriterion("PRD_MARK not like", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkIn(List<String> values) {
            addCriterion("PRD_MARK in", values, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkNotIn(List<String> values) {
            addCriterion("PRD_MARK not in", values, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkBetween(String value1, String value2) {
            addCriterion("PRD_MARK between", value1, value2, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkNotBetween(String value1, String value2) {
            addCriterion("PRD_MARK not between", value1, value2, "prdMark");
            return (Criteria) this;
        }

        public Criteria andBzKndIsNull() {
            addCriterion("BZ_KND is null");
            return (Criteria) this;
        }

        public Criteria andBzKndIsNotNull() {
            addCriterion("BZ_KND is not null");
            return (Criteria) this;
        }

        public Criteria andBzKndEqualTo(String value) {
            addCriterion("BZ_KND =", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndNotEqualTo(String value) {
            addCriterion("BZ_KND <>", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndGreaterThan(String value) {
            addCriterion("BZ_KND >", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndGreaterThanOrEqualTo(String value) {
            addCriterion("BZ_KND >=", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndLessThan(String value) {
            addCriterion("BZ_KND <", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndLessThanOrEqualTo(String value) {
            addCriterion("BZ_KND <=", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndLike(String value) {
            addCriterion("BZ_KND like", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndNotLike(String value) {
            addCriterion("BZ_KND not like", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndIn(List<String> values) {
            addCriterion("BZ_KND in", values, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndNotIn(List<String> values) {
            addCriterion("BZ_KND not in", values, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndBetween(String value1, String value2) {
            addCriterion("BZ_KND between", value1, value2, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndNotBetween(String value1, String value2) {
            addCriterion("BZ_KND not between", value1, value2, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andKndIsNull() {
            addCriterion("KND is null");
            return (Criteria) this;
        }

        public Criteria andKndIsNotNull() {
            addCriterion("KND is not null");
            return (Criteria) this;
        }

        public Criteria andKndEqualTo(String value) {
            addCriterion("KND =", value, "knd");
            return (Criteria) this;
        }

        public Criteria andKndNotEqualTo(String value) {
            addCriterion("KND <>", value, "knd");
            return (Criteria) this;
        }

        public Criteria andKndGreaterThan(String value) {
            addCriterion("KND >", value, "knd");
            return (Criteria) this;
        }

        public Criteria andKndGreaterThanOrEqualTo(String value) {
            addCriterion("KND >=", value, "knd");
            return (Criteria) this;
        }

        public Criteria andKndLessThan(String value) {
            addCriterion("KND <", value, "knd");
            return (Criteria) this;
        }

        public Criteria andKndLessThanOrEqualTo(String value) {
            addCriterion("KND <=", value, "knd");
            return (Criteria) this;
        }

        public Criteria andKndLike(String value) {
            addCriterion("KND like", value, "knd");
            return (Criteria) this;
        }

        public Criteria andKndNotLike(String value) {
            addCriterion("KND not like", value, "knd");
            return (Criteria) this;
        }

        public Criteria andKndIn(List<String> values) {
            addCriterion("KND in", values, "knd");
            return (Criteria) this;
        }

        public Criteria andKndNotIn(List<String> values) {
            addCriterion("KND not in", values, "knd");
            return (Criteria) this;
        }

        public Criteria andKndBetween(String value1, String value2) {
            addCriterion("KND between", value1, value2, "knd");
            return (Criteria) this;
        }

        public Criteria andKndNotBetween(String value1, String value2) {
            addCriterion("KND not between", value1, value2, "knd");
            return (Criteria) this;
        }

        public Criteria andQtyIsNull() {
            addCriterion("QTY is null");
            return (Criteria) this;
        }

        public Criteria andQtyIsNotNull() {
            addCriterion("QTY is not null");
            return (Criteria) this;
        }

        public Criteria andQtyEqualTo(BigDecimal value) {
            addCriterion("QTY =", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualTo(BigDecimal value) {
            addCriterion("QTY <>", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThan(BigDecimal value) {
            addCriterion("QTY >", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY >=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThan(BigDecimal value) {
            addCriterion("QTY <", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY <=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyIn(List<BigDecimal> values) {
            addCriterion("QTY in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotIn(List<BigDecimal> values) {
            addCriterion("QTY not in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY not between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andSDdIsNull() {
            addCriterion("S_DD is null");
            return (Criteria) this;
        }

        public Criteria andSDdIsNotNull() {
            addCriterion("S_DD is not null");
            return (Criteria) this;
        }

        public Criteria andSDdEqualTo(Date value) {
            addCriterion("S_DD =", value, "sDd");
            return (Criteria) this;
        }

        public Criteria andSDdNotEqualTo(Date value) {
            addCriterion("S_DD <>", value, "sDd");
            return (Criteria) this;
        }

        public Criteria andSDdGreaterThan(Date value) {
            addCriterion("S_DD >", value, "sDd");
            return (Criteria) this;
        }

        public Criteria andSDdGreaterThanOrEqualTo(Date value) {
            addCriterion("S_DD >=", value, "sDd");
            return (Criteria) this;
        }

        public Criteria andSDdLessThan(Date value) {
            addCriterion("S_DD <", value, "sDd");
            return (Criteria) this;
        }

        public Criteria andSDdLessThanOrEqualTo(Date value) {
            addCriterion("S_DD <=", value, "sDd");
            return (Criteria) this;
        }

        public Criteria andSDdIn(List<Date> values) {
            addCriterion("S_DD in", values, "sDd");
            return (Criteria) this;
        }

        public Criteria andSDdNotIn(List<Date> values) {
            addCriterion("S_DD not in", values, "sDd");
            return (Criteria) this;
        }

        public Criteria andSDdBetween(Date value1, Date value2) {
            addCriterion("S_DD between", value1, value2, "sDd");
            return (Criteria) this;
        }

        public Criteria andSDdNotBetween(Date value1, Date value2) {
            addCriterion("S_DD not between", value1, value2, "sDd");
            return (Criteria) this;
        }

        public Criteria andBilTypeIsNull() {
            addCriterion("BIL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBilTypeIsNotNull() {
            addCriterion("BIL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBilTypeEqualTo(String value) {
            addCriterion("BIL_TYPE =", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotEqualTo(String value) {
            addCriterion("BIL_TYPE <>", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeGreaterThan(String value) {
            addCriterion("BIL_TYPE >", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BIL_TYPE >=", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLessThan(String value) {
            addCriterion("BIL_TYPE <", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLessThanOrEqualTo(String value) {
            addCriterion("BIL_TYPE <=", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLike(String value) {
            addCriterion("BIL_TYPE like", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotLike(String value) {
            addCriterion("BIL_TYPE not like", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeIn(List<String> values) {
            addCriterion("BIL_TYPE in", values, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotIn(List<String> values) {
            addCriterion("BIL_TYPE not in", values, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeBetween(String value1, String value2) {
            addCriterion("BIL_TYPE between", value1, value2, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotBetween(String value1, String value2) {
            addCriterion("BIL_TYPE not between", value1, value2, "bilType");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoIsNull() {
            addCriterion("SUP_PRD_NO is null");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoIsNotNull() {
            addCriterion("SUP_PRD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoEqualTo(String value) {
            addCriterion("SUP_PRD_NO =", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoNotEqualTo(String value) {
            addCriterion("SUP_PRD_NO <>", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoGreaterThan(String value) {
            addCriterion("SUP_PRD_NO >", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoGreaterThanOrEqualTo(String value) {
            addCriterion("SUP_PRD_NO >=", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoLessThan(String value) {
            addCriterion("SUP_PRD_NO <", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoLessThanOrEqualTo(String value) {
            addCriterion("SUP_PRD_NO <=", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoLike(String value) {
            addCriterion("SUP_PRD_NO like", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoNotLike(String value) {
            addCriterion("SUP_PRD_NO not like", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoIn(List<String> values) {
            addCriterion("SUP_PRD_NO in", values, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoNotIn(List<String> values) {
            addCriterion("SUP_PRD_NO not in", values, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoBetween(String value1, String value2) {
            addCriterion("SUP_PRD_NO between", value1, value2, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoNotBetween(String value1, String value2) {
            addCriterion("SUP_PRD_NO not between", value1, value2, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andCusAreIsNull() {
            addCriterion("CUS_ARE is null");
            return (Criteria) this;
        }

        public Criteria andCusAreIsNotNull() {
            addCriterion("CUS_ARE is not null");
            return (Criteria) this;
        }

        public Criteria andCusAreEqualTo(String value) {
            addCriterion("CUS_ARE =", value, "cusAre");
            return (Criteria) this;
        }

        public Criteria andCusAreNotEqualTo(String value) {
            addCriterion("CUS_ARE <>", value, "cusAre");
            return (Criteria) this;
        }

        public Criteria andCusAreGreaterThan(String value) {
            addCriterion("CUS_ARE >", value, "cusAre");
            return (Criteria) this;
        }

        public Criteria andCusAreGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_ARE >=", value, "cusAre");
            return (Criteria) this;
        }

        public Criteria andCusAreLessThan(String value) {
            addCriterion("CUS_ARE <", value, "cusAre");
            return (Criteria) this;
        }

        public Criteria andCusAreLessThanOrEqualTo(String value) {
            addCriterion("CUS_ARE <=", value, "cusAre");
            return (Criteria) this;
        }

        public Criteria andCusAreLike(String value) {
            addCriterion("CUS_ARE like", value, "cusAre");
            return (Criteria) this;
        }

        public Criteria andCusAreNotLike(String value) {
            addCriterion("CUS_ARE not like", value, "cusAre");
            return (Criteria) this;
        }

        public Criteria andCusAreIn(List<String> values) {
            addCriterion("CUS_ARE in", values, "cusAre");
            return (Criteria) this;
        }

        public Criteria andCusAreNotIn(List<String> values) {
            addCriterion("CUS_ARE not in", values, "cusAre");
            return (Criteria) this;
        }

        public Criteria andCusAreBetween(String value1, String value2) {
            addCriterion("CUS_ARE between", value1, value2, "cusAre");
            return (Criteria) this;
        }

        public Criteria andCusAreNotBetween(String value1, String value2) {
            addCriterion("CUS_ARE not between", value1, value2, "cusAre");
            return (Criteria) this;
        }

        public Criteria andUpIsNull() {
            addCriterion("UP is null");
            return (Criteria) this;
        }

        public Criteria andUpIsNotNull() {
            addCriterion("UP is not null");
            return (Criteria) this;
        }

        public Criteria andUpEqualTo(BigDecimal value) {
            addCriterion("UP =", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpNotEqualTo(BigDecimal value) {
            addCriterion("UP <>", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpGreaterThan(BigDecimal value) {
            addCriterion("UP >", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP >=", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpLessThan(BigDecimal value) {
            addCriterion("UP <", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP <=", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpIn(List<BigDecimal> values) {
            addCriterion("UP in", values, "up");
            return (Criteria) this;
        }

        public Criteria andUpNotIn(List<BigDecimal> values) {
            addCriterion("UP not in", values, "up");
            return (Criteria) this;
        }

        public Criteria andUpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP between", value1, value2, "up");
            return (Criteria) this;
        }

        public Criteria andUpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP not between", value1, value2, "up");
            return (Criteria) this;
        }

        public Criteria andDisCntIsNull() {
            addCriterion("DIS_CNT is null");
            return (Criteria) this;
        }

        public Criteria andDisCntIsNotNull() {
            addCriterion("DIS_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andDisCntEqualTo(BigDecimal value) {
            addCriterion("DIS_CNT =", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntNotEqualTo(BigDecimal value) {
            addCriterion("DIS_CNT <>", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntGreaterThan(BigDecimal value) {
            addCriterion("DIS_CNT >", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DIS_CNT >=", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntLessThan(BigDecimal value) {
            addCriterion("DIS_CNT <", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DIS_CNT <=", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntIn(List<BigDecimal> values) {
            addCriterion("DIS_CNT in", values, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntNotIn(List<BigDecimal> values) {
            addCriterion("DIS_CNT not in", values, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIS_CNT between", value1, value2, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIS_CNT not between", value1, value2, "disCnt");
            return (Criteria) this;
        }

        public Criteria andFDdIsNull() {
            addCriterion("F_DD is null");
            return (Criteria) this;
        }

        public Criteria andFDdIsNotNull() {
            addCriterion("F_DD is not null");
            return (Criteria) this;
        }

        public Criteria andFDdEqualTo(Date value) {
            addCriterion("F_DD =", value, "fDd");
            return (Criteria) this;
        }

        public Criteria andFDdNotEqualTo(Date value) {
            addCriterion("F_DD <>", value, "fDd");
            return (Criteria) this;
        }

        public Criteria andFDdGreaterThan(Date value) {
            addCriterion("F_DD >", value, "fDd");
            return (Criteria) this;
        }

        public Criteria andFDdGreaterThanOrEqualTo(Date value) {
            addCriterion("F_DD >=", value, "fDd");
            return (Criteria) this;
        }

        public Criteria andFDdLessThan(Date value) {
            addCriterion("F_DD <", value, "fDd");
            return (Criteria) this;
        }

        public Criteria andFDdLessThanOrEqualTo(Date value) {
            addCriterion("F_DD <=", value, "fDd");
            return (Criteria) this;
        }

        public Criteria andFDdIn(List<Date> values) {
            addCriterion("F_DD in", values, "fDd");
            return (Criteria) this;
        }

        public Criteria andFDdNotIn(List<Date> values) {
            addCriterion("F_DD not in", values, "fDd");
            return (Criteria) this;
        }

        public Criteria andFDdBetween(Date value1, Date value2) {
            addCriterion("F_DD between", value1, value2, "fDd");
            return (Criteria) this;
        }

        public Criteria andFDdNotBetween(Date value1, Date value2) {
            addCriterion("F_DD not between", value1, value2, "fDd");
            return (Criteria) this;
        }

        public Criteria andEDdIsNull() {
            addCriterion("E_DD is null");
            return (Criteria) this;
        }

        public Criteria andEDdIsNotNull() {
            addCriterion("E_DD is not null");
            return (Criteria) this;
        }

        public Criteria andEDdEqualTo(Date value) {
            addCriterion("E_DD =", value, "eDd");
            return (Criteria) this;
        }

        public Criteria andEDdNotEqualTo(Date value) {
            addCriterion("E_DD <>", value, "eDd");
            return (Criteria) this;
        }

        public Criteria andEDdGreaterThan(Date value) {
            addCriterion("E_DD >", value, "eDd");
            return (Criteria) this;
        }

        public Criteria andEDdGreaterThanOrEqualTo(Date value) {
            addCriterion("E_DD >=", value, "eDd");
            return (Criteria) this;
        }

        public Criteria andEDdLessThan(Date value) {
            addCriterion("E_DD <", value, "eDd");
            return (Criteria) this;
        }

        public Criteria andEDdLessThanOrEqualTo(Date value) {
            addCriterion("E_DD <=", value, "eDd");
            return (Criteria) this;
        }

        public Criteria andEDdIn(List<Date> values) {
            addCriterion("E_DD in", values, "eDd");
            return (Criteria) this;
        }

        public Criteria andEDdNotIn(List<Date> values) {
            addCriterion("E_DD not in", values, "eDd");
            return (Criteria) this;
        }

        public Criteria andEDdBetween(Date value1, Date value2) {
            addCriterion("E_DD between", value1, value2, "eDd");
            return (Criteria) this;
        }

        public Criteria andEDdNotBetween(Date value1, Date value2) {
            addCriterion("E_DD not between", value1, value2, "eDd");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andQtyFreeIsNull() {
            addCriterion("QTY_FREE is null");
            return (Criteria) this;
        }

        public Criteria andQtyFreeIsNotNull() {
            addCriterion("QTY_FREE is not null");
            return (Criteria) this;
        }

        public Criteria andQtyFreeEqualTo(BigDecimal value) {
            addCriterion("QTY_FREE =", value, "qtyFree");
            return (Criteria) this;
        }

        public Criteria andQtyFreeNotEqualTo(BigDecimal value) {
            addCriterion("QTY_FREE <>", value, "qtyFree");
            return (Criteria) this;
        }

        public Criteria andQtyFreeGreaterThan(BigDecimal value) {
            addCriterion("QTY_FREE >", value, "qtyFree");
            return (Criteria) this;
        }

        public Criteria andQtyFreeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FREE >=", value, "qtyFree");
            return (Criteria) this;
        }

        public Criteria andQtyFreeLessThan(BigDecimal value) {
            addCriterion("QTY_FREE <", value, "qtyFree");
            return (Criteria) this;
        }

        public Criteria andQtyFreeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FREE <=", value, "qtyFree");
            return (Criteria) this;
        }

        public Criteria andQtyFreeIn(List<BigDecimal> values) {
            addCriterion("QTY_FREE in", values, "qtyFree");
            return (Criteria) this;
        }

        public Criteria andQtyFreeNotIn(List<BigDecimal> values) {
            addCriterion("QTY_FREE not in", values, "qtyFree");
            return (Criteria) this;
        }

        public Criteria andQtyFreeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FREE between", value1, value2, "qtyFree");
            return (Criteria) this;
        }

        public Criteria andQtyFreeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FREE not between", value1, value2, "qtyFree");
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

        public Criteria andChkManIsNull() {
            addCriterion("CHK_MAN is null");
            return (Criteria) this;
        }

        public Criteria andChkManIsNotNull() {
            addCriterion("CHK_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andChkManEqualTo(String value) {
            addCriterion("CHK_MAN =", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotEqualTo(String value) {
            addCriterion("CHK_MAN <>", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManGreaterThan(String value) {
            addCriterion("CHK_MAN >", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_MAN >=", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLessThan(String value) {
            addCriterion("CHK_MAN <", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLessThanOrEqualTo(String value) {
            addCriterion("CHK_MAN <=", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLike(String value) {
            addCriterion("CHK_MAN like", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotLike(String value) {
            addCriterion("CHK_MAN not like", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManIn(List<String> values) {
            addCriterion("CHK_MAN in", values, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotIn(List<String> values) {
            addCriterion("CHK_MAN not in", values, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManBetween(String value1, String value2) {
            addCriterion("CHK_MAN between", value1, value2, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotBetween(String value1, String value2) {
            addCriterion("CHK_MAN not between", value1, value2, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkDateIsNull() {
            addCriterion("CHK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andChkDateIsNotNull() {
            addCriterion("CHK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andChkDateEqualTo(Date value) {
            addCriterion("CHK_DATE =", value, "chkDate");
            return (Criteria) this;
        }

        public Criteria andChkDateNotEqualTo(Date value) {
            addCriterion("CHK_DATE <>", value, "chkDate");
            return (Criteria) this;
        }

        public Criteria andChkDateGreaterThan(Date value) {
            addCriterion("CHK_DATE >", value, "chkDate");
            return (Criteria) this;
        }

        public Criteria andChkDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CHK_DATE >=", value, "chkDate");
            return (Criteria) this;
        }

        public Criteria andChkDateLessThan(Date value) {
            addCriterion("CHK_DATE <", value, "chkDate");
            return (Criteria) this;
        }

        public Criteria andChkDateLessThanOrEqualTo(Date value) {
            addCriterion("CHK_DATE <=", value, "chkDate");
            return (Criteria) this;
        }

        public Criteria andChkDateIn(List<Date> values) {
            addCriterion("CHK_DATE in", values, "chkDate");
            return (Criteria) this;
        }

        public Criteria andChkDateNotIn(List<Date> values) {
            addCriterion("CHK_DATE not in", values, "chkDate");
            return (Criteria) this;
        }

        public Criteria andChkDateBetween(Date value1, Date value2) {
            addCriterion("CHK_DATE between", value1, value2, "chkDate");
            return (Criteria) this;
        }

        public Criteria andChkDateNotBetween(Date value1, Date value2) {
            addCriterion("CHK_DATE not between", value1, value2, "chkDate");
            return (Criteria) this;
        }

        public Criteria andUsrIsNull() {
            addCriterion("USR is null");
            return (Criteria) this;
        }

        public Criteria andUsrIsNotNull() {
            addCriterion("USR is not null");
            return (Criteria) this;
        }

        public Criteria andUsrEqualTo(String value) {
            addCriterion("USR =", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotEqualTo(String value) {
            addCriterion("USR <>", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrGreaterThan(String value) {
            addCriterion("USR >", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrGreaterThanOrEqualTo(String value) {
            addCriterion("USR >=", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLessThan(String value) {
            addCriterion("USR <", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLessThanOrEqualTo(String value) {
            addCriterion("USR <=", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLike(String value) {
            addCriterion("USR like", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotLike(String value) {
            addCriterion("USR not like", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrIn(List<String> values) {
            addCriterion("USR in", values, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotIn(List<String> values) {
            addCriterion("USR not in", values, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrBetween(String value1, String value2) {
            addCriterion("USR between", value1, value2, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotBetween(String value1, String value2) {
            addCriterion("USR not between", value1, value2, "usr");
            return (Criteria) this;
        }

        public Criteria andSysDateIsNull() {
            addCriterion("SYS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSysDateIsNotNull() {
            addCriterion("SYS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSysDateEqualTo(Date value) {
            addCriterion("SYS_DATE =", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotEqualTo(Date value) {
            addCriterion("SYS_DATE <>", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateGreaterThan(Date value) {
            addCriterion("SYS_DATE >", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SYS_DATE >=", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateLessThan(Date value) {
            addCriterion("SYS_DATE <", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateLessThanOrEqualTo(Date value) {
            addCriterion("SYS_DATE <=", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateIn(List<Date> values) {
            addCriterion("SYS_DATE in", values, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotIn(List<Date> values) {
            addCriterion("SYS_DATE not in", values, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateBetween(Date value1, Date value2) {
            addCriterion("SYS_DATE between", value1, value2, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotBetween(Date value1, Date value2) {
            addCriterion("SYS_DATE not between", value1, value2, "sysDate");
            return (Criteria) this;
        }

        public Criteria andHjNoIsNull() {
            addCriterion("HJ_NO is null");
            return (Criteria) this;
        }

        public Criteria andHjNoIsNotNull() {
            addCriterion("HJ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andHjNoEqualTo(String value) {
            addCriterion("HJ_NO =", value, "hjNo");
            return (Criteria) this;
        }

        public Criteria andHjNoNotEqualTo(String value) {
            addCriterion("HJ_NO <>", value, "hjNo");
            return (Criteria) this;
        }

        public Criteria andHjNoGreaterThan(String value) {
            addCriterion("HJ_NO >", value, "hjNo");
            return (Criteria) this;
        }

        public Criteria andHjNoGreaterThanOrEqualTo(String value) {
            addCriterion("HJ_NO >=", value, "hjNo");
            return (Criteria) this;
        }

        public Criteria andHjNoLessThan(String value) {
            addCriterion("HJ_NO <", value, "hjNo");
            return (Criteria) this;
        }

        public Criteria andHjNoLessThanOrEqualTo(String value) {
            addCriterion("HJ_NO <=", value, "hjNo");
            return (Criteria) this;
        }

        public Criteria andHjNoLike(String value) {
            addCriterion("HJ_NO like", value, "hjNo");
            return (Criteria) this;
        }

        public Criteria andHjNoNotLike(String value) {
            addCriterion("HJ_NO not like", value, "hjNo");
            return (Criteria) this;
        }

        public Criteria andHjNoIn(List<String> values) {
            addCriterion("HJ_NO in", values, "hjNo");
            return (Criteria) this;
        }

        public Criteria andHjNoNotIn(List<String> values) {
            addCriterion("HJ_NO not in", values, "hjNo");
            return (Criteria) this;
        }

        public Criteria andHjNoBetween(String value1, String value2) {
            addCriterion("HJ_NO between", value1, value2, "hjNo");
            return (Criteria) this;
        }

        public Criteria andHjNoNotBetween(String value1, String value2) {
            addCriterion("HJ_NO not between", value1, value2, "hjNo");
            return (Criteria) this;
        }

        public Criteria andPreItmIsNull() {
            addCriterion("PRE_ITM is null");
            return (Criteria) this;
        }

        public Criteria andPreItmIsNotNull() {
            addCriterion("PRE_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andPreItmEqualTo(Integer value) {
            addCriterion("PRE_ITM =", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmNotEqualTo(Integer value) {
            addCriterion("PRE_ITM <>", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmGreaterThan(Integer value) {
            addCriterion("PRE_ITM >", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRE_ITM >=", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmLessThan(Integer value) {
            addCriterion("PRE_ITM <", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmLessThanOrEqualTo(Integer value) {
            addCriterion("PRE_ITM <=", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmIn(List<Integer> values) {
            addCriterion("PRE_ITM in", values, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmNotIn(List<Integer> values) {
            addCriterion("PRE_ITM not in", values, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmBetween(Integer value1, Integer value2) {
            addCriterion("PRE_ITM between", value1, value2, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmNotBetween(Integer value1, Integer value2) {
            addCriterion("PRE_ITM not between", value1, value2, "preItm");
            return (Criteria) this;
        }

        public Criteria andRtoBjstIsNull() {
            addCriterion("RTO_BJST is null");
            return (Criteria) this;
        }

        public Criteria andRtoBjstIsNotNull() {
            addCriterion("RTO_BJST is not null");
            return (Criteria) this;
        }

        public Criteria andRtoBjstEqualTo(BigDecimal value) {
            addCriterion("RTO_BJST =", value, "rtoBjst");
            return (Criteria) this;
        }

        public Criteria andRtoBjstNotEqualTo(BigDecimal value) {
            addCriterion("RTO_BJST <>", value, "rtoBjst");
            return (Criteria) this;
        }

        public Criteria andRtoBjstGreaterThan(BigDecimal value) {
            addCriterion("RTO_BJST >", value, "rtoBjst");
            return (Criteria) this;
        }

        public Criteria andRtoBjstGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_BJST >=", value, "rtoBjst");
            return (Criteria) this;
        }

        public Criteria andRtoBjstLessThan(BigDecimal value) {
            addCriterion("RTO_BJST <", value, "rtoBjst");
            return (Criteria) this;
        }

        public Criteria andRtoBjstLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_BJST <=", value, "rtoBjst");
            return (Criteria) this;
        }

        public Criteria andRtoBjstIn(List<BigDecimal> values) {
            addCriterion("RTO_BJST in", values, "rtoBjst");
            return (Criteria) this;
        }

        public Criteria andRtoBjstNotIn(List<BigDecimal> values) {
            addCriterion("RTO_BJST not in", values, "rtoBjst");
            return (Criteria) this;
        }

        public Criteria andRtoBjstBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_BJST between", value1, value2, "rtoBjst");
            return (Criteria) this;
        }

        public Criteria andRtoBjstNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_BJST not between", value1, value2, "rtoBjst");
            return (Criteria) this;
        }

        public Criteria andZdFlagIsNull() {
            addCriterion("ZD_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andZdFlagIsNotNull() {
            addCriterion("ZD_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andZdFlagEqualTo(String value) {
            addCriterion("ZD_FLAG =", value, "zdFlag");
            return (Criteria) this;
        }

        public Criteria andZdFlagNotEqualTo(String value) {
            addCriterion("ZD_FLAG <>", value, "zdFlag");
            return (Criteria) this;
        }

        public Criteria andZdFlagGreaterThan(String value) {
            addCriterion("ZD_FLAG >", value, "zdFlag");
            return (Criteria) this;
        }

        public Criteria andZdFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ZD_FLAG >=", value, "zdFlag");
            return (Criteria) this;
        }

        public Criteria andZdFlagLessThan(String value) {
            addCriterion("ZD_FLAG <", value, "zdFlag");
            return (Criteria) this;
        }

        public Criteria andZdFlagLessThanOrEqualTo(String value) {
            addCriterion("ZD_FLAG <=", value, "zdFlag");
            return (Criteria) this;
        }

        public Criteria andZdFlagLike(String value) {
            addCriterion("ZD_FLAG like", value, "zdFlag");
            return (Criteria) this;
        }

        public Criteria andZdFlagNotLike(String value) {
            addCriterion("ZD_FLAG not like", value, "zdFlag");
            return (Criteria) this;
        }

        public Criteria andZdFlagIn(List<String> values) {
            addCriterion("ZD_FLAG in", values, "zdFlag");
            return (Criteria) this;
        }

        public Criteria andZdFlagNotIn(List<String> values) {
            addCriterion("ZD_FLAG not in", values, "zdFlag");
            return (Criteria) this;
        }

        public Criteria andZdFlagBetween(String value1, String value2) {
            addCriterion("ZD_FLAG between", value1, value2, "zdFlag");
            return (Criteria) this;
        }

        public Criteria andZdFlagNotBetween(String value1, String value2) {
            addCriterion("ZD_FLAG not between", value1, value2, "zdFlag");
            return (Criteria) this;
        }

        public Criteria andOlefieldIsNull() {
            addCriterion("OLEFIELD is null");
            return (Criteria) this;
        }

        public Criteria andOlefieldIsNotNull() {
            addCriterion("OLEFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andOlefieldEqualTo(String value) {
            addCriterion("OLEFIELD =", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldNotEqualTo(String value) {
            addCriterion("OLEFIELD <>", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldGreaterThan(String value) {
            addCriterion("OLEFIELD >", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldGreaterThanOrEqualTo(String value) {
            addCriterion("OLEFIELD >=", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldLessThan(String value) {
            addCriterion("OLEFIELD <", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldLessThanOrEqualTo(String value) {
            addCriterion("OLEFIELD <=", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldLike(String value) {
            addCriterion("OLEFIELD like", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldNotLike(String value) {
            addCriterion("OLEFIELD not like", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldIn(List<String> values) {
            addCriterion("OLEFIELD in", values, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldNotIn(List<String> values) {
            addCriterion("OLEFIELD not in", values, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldBetween(String value1, String value2) {
            addCriterion("OLEFIELD between", value1, value2, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldNotBetween(String value1, String value2) {
            addCriterion("OLEFIELD not between", value1, value2, "olefield");
            return (Criteria) this;
        }

        public Criteria andUpNetIsNull() {
            addCriterion("UP_NET is null");
            return (Criteria) this;
        }

        public Criteria andUpNetIsNotNull() {
            addCriterion("UP_NET is not null");
            return (Criteria) this;
        }

        public Criteria andUpNetEqualTo(BigDecimal value) {
            addCriterion("UP_NET =", value, "upNet");
            return (Criteria) this;
        }

        public Criteria andUpNetNotEqualTo(BigDecimal value) {
            addCriterion("UP_NET <>", value, "upNet");
            return (Criteria) this;
        }

        public Criteria andUpNetGreaterThan(BigDecimal value) {
            addCriterion("UP_NET >", value, "upNet");
            return (Criteria) this;
        }

        public Criteria andUpNetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_NET >=", value, "upNet");
            return (Criteria) this;
        }

        public Criteria andUpNetLessThan(BigDecimal value) {
            addCriterion("UP_NET <", value, "upNet");
            return (Criteria) this;
        }

        public Criteria andUpNetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_NET <=", value, "upNet");
            return (Criteria) this;
        }

        public Criteria andUpNetIn(List<BigDecimal> values) {
            addCriterion("UP_NET in", values, "upNet");
            return (Criteria) this;
        }

        public Criteria andUpNetNotIn(List<BigDecimal> values) {
            addCriterion("UP_NET not in", values, "upNet");
            return (Criteria) this;
        }

        public Criteria andUpNetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_NET between", value1, value2, "upNet");
            return (Criteria) this;
        }

        public Criteria andUpNetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_NET not between", value1, value2, "upNet");
            return (Criteria) this;
        }

        public Criteria andFlagRkDdIsNull() {
            addCriterion("FLAG_RK_DD is null");
            return (Criteria) this;
        }

        public Criteria andFlagRkDdIsNotNull() {
            addCriterion("FLAG_RK_DD is not null");
            return (Criteria) this;
        }

        public Criteria andFlagRkDdEqualTo(String value) {
            addCriterion("FLAG_RK_DD =", value, "flagRkDd");
            return (Criteria) this;
        }

        public Criteria andFlagRkDdNotEqualTo(String value) {
            addCriterion("FLAG_RK_DD <>", value, "flagRkDd");
            return (Criteria) this;
        }

        public Criteria andFlagRkDdGreaterThan(String value) {
            addCriterion("FLAG_RK_DD >", value, "flagRkDd");
            return (Criteria) this;
        }

        public Criteria andFlagRkDdGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG_RK_DD >=", value, "flagRkDd");
            return (Criteria) this;
        }

        public Criteria andFlagRkDdLessThan(String value) {
            addCriterion("FLAG_RK_DD <", value, "flagRkDd");
            return (Criteria) this;
        }

        public Criteria andFlagRkDdLessThanOrEqualTo(String value) {
            addCriterion("FLAG_RK_DD <=", value, "flagRkDd");
            return (Criteria) this;
        }

        public Criteria andFlagRkDdLike(String value) {
            addCriterion("FLAG_RK_DD like", value, "flagRkDd");
            return (Criteria) this;
        }

        public Criteria andFlagRkDdNotLike(String value) {
            addCriterion("FLAG_RK_DD not like", value, "flagRkDd");
            return (Criteria) this;
        }

        public Criteria andFlagRkDdIn(List<String> values) {
            addCriterion("FLAG_RK_DD in", values, "flagRkDd");
            return (Criteria) this;
        }

        public Criteria andFlagRkDdNotIn(List<String> values) {
            addCriterion("FLAG_RK_DD not in", values, "flagRkDd");
            return (Criteria) this;
        }

        public Criteria andFlagRkDdBetween(String value1, String value2) {
            addCriterion("FLAG_RK_DD between", value1, value2, "flagRkDd");
            return (Criteria) this;
        }

        public Criteria andFlagRkDdNotBetween(String value1, String value2) {
            addCriterion("FLAG_RK_DD not between", value1, value2, "flagRkDd");
            return (Criteria) this;
        }

        public Criteria andPrmNoIsNull() {
            addCriterion("PRM_NO is null");
            return (Criteria) this;
        }

        public Criteria andPrmNoIsNotNull() {
            addCriterion("PRM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPrmNoEqualTo(String value) {
            addCriterion("PRM_NO =", value, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoNotEqualTo(String value) {
            addCriterion("PRM_NO <>", value, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoGreaterThan(String value) {
            addCriterion("PRM_NO >", value, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoGreaterThanOrEqualTo(String value) {
            addCriterion("PRM_NO >=", value, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoLessThan(String value) {
            addCriterion("PRM_NO <", value, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoLessThanOrEqualTo(String value) {
            addCriterion("PRM_NO <=", value, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoLike(String value) {
            addCriterion("PRM_NO like", value, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoNotLike(String value) {
            addCriterion("PRM_NO not like", value, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoIn(List<String> values) {
            addCriterion("PRM_NO in", values, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoNotIn(List<String> values) {
            addCriterion("PRM_NO not in", values, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoBetween(String value1, String value2) {
            addCriterion("PRM_NO between", value1, value2, "prmNo");
            return (Criteria) this;
        }

        public Criteria andPrmNoNotBetween(String value1, String value2) {
            addCriterion("PRM_NO not between", value1, value2, "prmNo");
            return (Criteria) this;
        }

        public Criteria andAmtDisCntIsNull() {
            addCriterion("AMT_DIS_CNT is null");
            return (Criteria) this;
        }

        public Criteria andAmtDisCntIsNotNull() {
            addCriterion("AMT_DIS_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmtDisCntEqualTo(BigDecimal value) {
            addCriterion("AMT_DIS_CNT =", value, "amtDisCnt");
            return (Criteria) this;
        }

        public Criteria andAmtDisCntNotEqualTo(BigDecimal value) {
            addCriterion("AMT_DIS_CNT <>", value, "amtDisCnt");
            return (Criteria) this;
        }

        public Criteria andAmtDisCntGreaterThan(BigDecimal value) {
            addCriterion("AMT_DIS_CNT >", value, "amtDisCnt");
            return (Criteria) this;
        }

        public Criteria andAmtDisCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_DIS_CNT >=", value, "amtDisCnt");
            return (Criteria) this;
        }

        public Criteria andAmtDisCntLessThan(BigDecimal value) {
            addCriterion("AMT_DIS_CNT <", value, "amtDisCnt");
            return (Criteria) this;
        }

        public Criteria andAmtDisCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_DIS_CNT <=", value, "amtDisCnt");
            return (Criteria) this;
        }

        public Criteria andAmtDisCntIn(List<BigDecimal> values) {
            addCriterion("AMT_DIS_CNT in", values, "amtDisCnt");
            return (Criteria) this;
        }

        public Criteria andAmtDisCntNotIn(List<BigDecimal> values) {
            addCriterion("AMT_DIS_CNT not in", values, "amtDisCnt");
            return (Criteria) this;
        }

        public Criteria andAmtDisCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_DIS_CNT between", value1, value2, "amtDisCnt");
            return (Criteria) this;
        }

        public Criteria andAmtDisCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_DIS_CNT not between", value1, value2, "amtDisCnt");
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