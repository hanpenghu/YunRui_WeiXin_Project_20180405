package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TfPosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TfPosExample() {
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

        public Criteria andOsIdIsNull() {
            addCriterion("OS_ID is null");
            return (Criteria) this;
        }

        public Criteria andOsIdIsNotNull() {
            addCriterion("OS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOsIdEqualTo(String value) {
            addCriterion("OS_ID =", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdNotEqualTo(String value) {
            addCriterion("OS_ID <>", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdGreaterThan(String value) {
            addCriterion("OS_ID >", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdGreaterThanOrEqualTo(String value) {
            addCriterion("OS_ID >=", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdLessThan(String value) {
            addCriterion("OS_ID <", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdLessThanOrEqualTo(String value) {
            addCriterion("OS_ID <=", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdLike(String value) {
            addCriterion("OS_ID like", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdNotLike(String value) {
            addCriterion("OS_ID not like", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdIn(List<String> values) {
            addCriterion("OS_ID in", values, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdNotIn(List<String> values) {
            addCriterion("OS_ID not in", values, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdBetween(String value1, String value2) {
            addCriterion("OS_ID between", value1, value2, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdNotBetween(String value1, String value2) {
            addCriterion("OS_ID not between", value1, value2, "osId");
            return (Criteria) this;
        }

        public Criteria andOsNoIsNull() {
            addCriterion("OS_NO is null");
            return (Criteria) this;
        }

        public Criteria andOsNoIsNotNull() {
            addCriterion("OS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOsNoEqualTo(String value) {
            addCriterion("OS_NO =", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoNotEqualTo(String value) {
            addCriterion("OS_NO <>", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoGreaterThan(String value) {
            addCriterion("OS_NO >", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoGreaterThanOrEqualTo(String value) {
            addCriterion("OS_NO >=", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoLessThan(String value) {
            addCriterion("OS_NO <", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoLessThanOrEqualTo(String value) {
            addCriterion("OS_NO <=", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoLike(String value) {
            addCriterion("OS_NO like", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoNotLike(String value) {
            addCriterion("OS_NO not like", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoIn(List<String> values) {
            addCriterion("OS_NO in", values, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoNotIn(List<String> values) {
            addCriterion("OS_NO not in", values, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoBetween(String value1, String value2) {
            addCriterion("OS_NO between", value1, value2, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoNotBetween(String value1, String value2) {
            addCriterion("OS_NO not between", value1, value2, "osNo");
            return (Criteria) this;
        }

        public Criteria andItmIsNull() {
            addCriterion("ITM is null");
            return (Criteria) this;
        }

        public Criteria andItmIsNotNull() {
            addCriterion("ITM is not null");
            return (Criteria) this;
        }

        public Criteria andItmEqualTo(Integer value) {
            addCriterion("ITM =", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmNotEqualTo(Integer value) {
            addCriterion("ITM <>", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmGreaterThan(Integer value) {
            addCriterion("ITM >", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITM >=", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmLessThan(Integer value) {
            addCriterion("ITM <", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmLessThanOrEqualTo(Integer value) {
            addCriterion("ITM <=", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmIn(List<Integer> values) {
            addCriterion("ITM in", values, "itm");
            return (Criteria) this;
        }

        public Criteria andItmNotIn(List<Integer> values) {
            addCriterion("ITM not in", values, "itm");
            return (Criteria) this;
        }

        public Criteria andItmBetween(Integer value1, Integer value2) {
            addCriterion("ITM between", value1, value2, "itm");
            return (Criteria) this;
        }

        public Criteria andItmNotBetween(Integer value1, Integer value2) {
            addCriterion("ITM not between", value1, value2, "itm");
            return (Criteria) this;
        }

        public Criteria andQtNoIsNull() {
            addCriterion("QT_NO is null");
            return (Criteria) this;
        }

        public Criteria andQtNoIsNotNull() {
            addCriterion("QT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andQtNoEqualTo(String value) {
            addCriterion("QT_NO =", value, "qtNo");
            return (Criteria) this;
        }

        public Criteria andQtNoNotEqualTo(String value) {
            addCriterion("QT_NO <>", value, "qtNo");
            return (Criteria) this;
        }

        public Criteria andQtNoGreaterThan(String value) {
            addCriterion("QT_NO >", value, "qtNo");
            return (Criteria) this;
        }

        public Criteria andQtNoGreaterThanOrEqualTo(String value) {
            addCriterion("QT_NO >=", value, "qtNo");
            return (Criteria) this;
        }

        public Criteria andQtNoLessThan(String value) {
            addCriterion("QT_NO <", value, "qtNo");
            return (Criteria) this;
        }

        public Criteria andQtNoLessThanOrEqualTo(String value) {
            addCriterion("QT_NO <=", value, "qtNo");
            return (Criteria) this;
        }

        public Criteria andQtNoLike(String value) {
            addCriterion("QT_NO like", value, "qtNo");
            return (Criteria) this;
        }

        public Criteria andQtNoNotLike(String value) {
            addCriterion("QT_NO not like", value, "qtNo");
            return (Criteria) this;
        }

        public Criteria andQtNoIn(List<String> values) {
            addCriterion("QT_NO in", values, "qtNo");
            return (Criteria) this;
        }

        public Criteria andQtNoNotIn(List<String> values) {
            addCriterion("QT_NO not in", values, "qtNo");
            return (Criteria) this;
        }

        public Criteria andQtNoBetween(String value1, String value2) {
            addCriterion("QT_NO between", value1, value2, "qtNo");
            return (Criteria) this;
        }

        public Criteria andQtNoNotBetween(String value1, String value2) {
            addCriterion("QT_NO not between", value1, value2, "qtNo");
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

        public Criteria andPrdNameIsNull() {
            addCriterion("PRD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPrdNameIsNotNull() {
            addCriterion("PRD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrdNameEqualTo(String value) {
            addCriterion("PRD_NAME =", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameNotEqualTo(String value) {
            addCriterion("PRD_NAME <>", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameGreaterThan(String value) {
            addCriterion("PRD_NAME >", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_NAME >=", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameLessThan(String value) {
            addCriterion("PRD_NAME <", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameLessThanOrEqualTo(String value) {
            addCriterion("PRD_NAME <=", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameLike(String value) {
            addCriterion("PRD_NAME like", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameNotLike(String value) {
            addCriterion("PRD_NAME not like", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameIn(List<String> values) {
            addCriterion("PRD_NAME in", values, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameNotIn(List<String> values) {
            addCriterion("PRD_NAME not in", values, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameBetween(String value1, String value2) {
            addCriterion("PRD_NAME between", value1, value2, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameNotBetween(String value1, String value2) {
            addCriterion("PRD_NAME not between", value1, value2, "prdName");
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

        public Criteria andWhIsNull() {
            addCriterion("WH is null");
            return (Criteria) this;
        }

        public Criteria andWhIsNotNull() {
            addCriterion("WH is not null");
            return (Criteria) this;
        }

        public Criteria andWhEqualTo(String value) {
            addCriterion("WH =", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotEqualTo(String value) {
            addCriterion("WH <>", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhGreaterThan(String value) {
            addCriterion("WH >", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhGreaterThanOrEqualTo(String value) {
            addCriterion("WH >=", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhLessThan(String value) {
            addCriterion("WH <", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhLessThanOrEqualTo(String value) {
            addCriterion("WH <=", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhLike(String value) {
            addCriterion("WH like", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotLike(String value) {
            addCriterion("WH not like", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhIn(List<String> values) {
            addCriterion("WH in", values, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotIn(List<String> values) {
            addCriterion("WH not in", values, "wh");
            return (Criteria) this;
        }

        public Criteria andWhBetween(String value1, String value2) {
            addCriterion("WH between", value1, value2, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotBetween(String value1, String value2) {
            addCriterion("WH not between", value1, value2, "wh");
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

        public Criteria andOsDdIsNull() {
            addCriterion("OS_DD is null");
            return (Criteria) this;
        }

        public Criteria andOsDdIsNotNull() {
            addCriterion("OS_DD is not null");
            return (Criteria) this;
        }

        public Criteria andOsDdEqualTo(Date value) {
            addCriterion("OS_DD =", value, "osDd");
            return (Criteria) this;
        }

        public Criteria andOsDdNotEqualTo(Date value) {
            addCriterion("OS_DD <>", value, "osDd");
            return (Criteria) this;
        }

        public Criteria andOsDdGreaterThan(Date value) {
            addCriterion("OS_DD >", value, "osDd");
            return (Criteria) this;
        }

        public Criteria andOsDdGreaterThanOrEqualTo(Date value) {
            addCriterion("OS_DD >=", value, "osDd");
            return (Criteria) this;
        }

        public Criteria andOsDdLessThan(Date value) {
            addCriterion("OS_DD <", value, "osDd");
            return (Criteria) this;
        }

        public Criteria andOsDdLessThanOrEqualTo(Date value) {
            addCriterion("OS_DD <=", value, "osDd");
            return (Criteria) this;
        }

        public Criteria andOsDdIn(List<Date> values) {
            addCriterion("OS_DD in", values, "osDd");
            return (Criteria) this;
        }

        public Criteria andOsDdNotIn(List<Date> values) {
            addCriterion("OS_DD not in", values, "osDd");
            return (Criteria) this;
        }

        public Criteria andOsDdBetween(Date value1, Date value2) {
            addCriterion("OS_DD between", value1, value2, "osDd");
            return (Criteria) this;
        }

        public Criteria andOsDdNotBetween(Date value1, Date value2) {
            addCriterion("OS_DD not between", value1, value2, "osDd");
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

        public Criteria andAmtIsNull() {
            addCriterion("AMT is null");
            return (Criteria) this;
        }

        public Criteria andAmtIsNotNull() {
            addCriterion("AMT is not null");
            return (Criteria) this;
        }

        public Criteria andAmtEqualTo(BigDecimal value) {
            addCriterion("AMT =", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotEqualTo(BigDecimal value) {
            addCriterion("AMT <>", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtGreaterThan(BigDecimal value) {
            addCriterion("AMT >", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT >=", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtLessThan(BigDecimal value) {
            addCriterion("AMT <", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT <=", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtIn(List<BigDecimal> values) {
            addCriterion("AMT in", values, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotIn(List<BigDecimal> values) {
            addCriterion("AMT not in", values, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT between", value1, value2, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT not between", value1, value2, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtnIsNull() {
            addCriterion("AMTN is null");
            return (Criteria) this;
        }

        public Criteria andAmtnIsNotNull() {
            addCriterion("AMTN is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnEqualTo(BigDecimal value) {
            addCriterion("AMTN =", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnNotEqualTo(BigDecimal value) {
            addCriterion("AMTN <>", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnGreaterThan(BigDecimal value) {
            addCriterion("AMTN >", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN >=", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnLessThan(BigDecimal value) {
            addCriterion("AMTN <", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN <=", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnIn(List<BigDecimal> values) {
            addCriterion("AMTN in", values, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnNotIn(List<BigDecimal> values) {
            addCriterion("AMTN not in", values, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN between", value1, value2, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN not between", value1, value2, "amtn");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("TAX is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("TAX is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(BigDecimal value) {
            addCriterion("TAX =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(BigDecimal value) {
            addCriterion("TAX <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(BigDecimal value) {
            addCriterion("TAX >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(BigDecimal value) {
            addCriterion("TAX <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<BigDecimal> values) {
            addCriterion("TAX in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<BigDecimal> values) {
            addCriterion("TAX not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andQty1IsNull() {
            addCriterion("QTY1 is null");
            return (Criteria) this;
        }

        public Criteria andQty1IsNotNull() {
            addCriterion("QTY1 is not null");
            return (Criteria) this;
        }

        public Criteria andQty1EqualTo(BigDecimal value) {
            addCriterion("QTY1 =", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1NotEqualTo(BigDecimal value) {
            addCriterion("QTY1 <>", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1GreaterThan(BigDecimal value) {
            addCriterion("QTY1 >", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1 >=", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1LessThan(BigDecimal value) {
            addCriterion("QTY1 <", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1 <=", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1In(List<BigDecimal> values) {
            addCriterion("QTY1 in", values, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1NotIn(List<BigDecimal> values) {
            addCriterion("QTY1 not in", values, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1 between", value1, value2, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1 not between", value1, value2, "qty1");
            return (Criteria) this;
        }

        public Criteria andQtyPsIsNull() {
            addCriterion("QTY_PS is null");
            return (Criteria) this;
        }

        public Criteria andQtyPsIsNotNull() {
            addCriterion("QTY_PS is not null");
            return (Criteria) this;
        }

        public Criteria andQtyPsEqualTo(BigDecimal value) {
            addCriterion("QTY_PS =", value, "qtyPs");
            return (Criteria) this;
        }

        public Criteria andQtyPsNotEqualTo(BigDecimal value) {
            addCriterion("QTY_PS <>", value, "qtyPs");
            return (Criteria) this;
        }

        public Criteria andQtyPsGreaterThan(BigDecimal value) {
            addCriterion("QTY_PS >", value, "qtyPs");
            return (Criteria) this;
        }

        public Criteria andQtyPsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_PS >=", value, "qtyPs");
            return (Criteria) this;
        }

        public Criteria andQtyPsLessThan(BigDecimal value) {
            addCriterion("QTY_PS <", value, "qtyPs");
            return (Criteria) this;
        }

        public Criteria andQtyPsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_PS <=", value, "qtyPs");
            return (Criteria) this;
        }

        public Criteria andQtyPsIn(List<BigDecimal> values) {
            addCriterion("QTY_PS in", values, "qtyPs");
            return (Criteria) this;
        }

        public Criteria andQtyPsNotIn(List<BigDecimal> values) {
            addCriterion("QTY_PS not in", values, "qtyPs");
            return (Criteria) this;
        }

        public Criteria andQtyPsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_PS between", value1, value2, "qtyPs");
            return (Criteria) this;
        }

        public Criteria andQtyPsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_PS not between", value1, value2, "qtyPs");
            return (Criteria) this;
        }

        public Criteria andQtyPsUnshIsNull() {
            addCriterion("QTY_PS_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyPsUnshIsNotNull() {
            addCriterion("QTY_PS_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyPsUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_PS_UNSH =", value, "qtyPsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPsUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_PS_UNSH <>", value, "qtyPsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPsUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_PS_UNSH >", value, "qtyPsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPsUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_PS_UNSH >=", value, "qtyPsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPsUnshLessThan(BigDecimal value) {
            addCriterion("QTY_PS_UNSH <", value, "qtyPsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPsUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_PS_UNSH <=", value, "qtyPsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPsUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_PS_UNSH in", values, "qtyPsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPsUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_PS_UNSH not in", values, "qtyPsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPsUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_PS_UNSH between", value1, value2, "qtyPsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPsUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_PS_UNSH not between", value1, value2, "qtyPsUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PsIsNull() {
            addCriterion("QTY1_PS is null");
            return (Criteria) this;
        }

        public Criteria andQty1PsIsNotNull() {
            addCriterion("QTY1_PS is not null");
            return (Criteria) this;
        }

        public Criteria andQty1PsEqualTo(BigDecimal value) {
            addCriterion("QTY1_PS =", value, "qty1Ps");
            return (Criteria) this;
        }

        public Criteria andQty1PsNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_PS <>", value, "qty1Ps");
            return (Criteria) this;
        }

        public Criteria andQty1PsGreaterThan(BigDecimal value) {
            addCriterion("QTY1_PS >", value, "qty1Ps");
            return (Criteria) this;
        }

        public Criteria andQty1PsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_PS >=", value, "qty1Ps");
            return (Criteria) this;
        }

        public Criteria andQty1PsLessThan(BigDecimal value) {
            addCriterion("QTY1_PS <", value, "qty1Ps");
            return (Criteria) this;
        }

        public Criteria andQty1PsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_PS <=", value, "qty1Ps");
            return (Criteria) this;
        }

        public Criteria andQty1PsIn(List<BigDecimal> values) {
            addCriterion("QTY1_PS in", values, "qty1Ps");
            return (Criteria) this;
        }

        public Criteria andQty1PsNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_PS not in", values, "qty1Ps");
            return (Criteria) this;
        }

        public Criteria andQty1PsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_PS between", value1, value2, "qty1Ps");
            return (Criteria) this;
        }

        public Criteria andQty1PsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_PS not between", value1, value2, "qty1Ps");
            return (Criteria) this;
        }

        public Criteria andQty1PsUnshIsNull() {
            addCriterion("QTY1_PS_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQty1PsUnshIsNotNull() {
            addCriterion("QTY1_PS_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQty1PsUnshEqualTo(BigDecimal value) {
            addCriterion("QTY1_PS_UNSH =", value, "qty1PsUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PsUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_PS_UNSH <>", value, "qty1PsUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PsUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY1_PS_UNSH >", value, "qty1PsUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PsUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_PS_UNSH >=", value, "qty1PsUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PsUnshLessThan(BigDecimal value) {
            addCriterion("QTY1_PS_UNSH <", value, "qty1PsUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PsUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_PS_UNSH <=", value, "qty1PsUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PsUnshIn(List<BigDecimal> values) {
            addCriterion("QTY1_PS_UNSH in", values, "qty1PsUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PsUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_PS_UNSH not in", values, "qty1PsUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PsUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_PS_UNSH between", value1, value2, "qty1PsUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PsUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_PS_UNSH not between", value1, value2, "qty1PsUnsh");
            return (Criteria) this;
        }

        public Criteria andEstDdIsNull() {
            addCriterion("EST_DD is null");
            return (Criteria) this;
        }

        public Criteria andEstDdIsNotNull() {
            addCriterion("EST_DD is not null");
            return (Criteria) this;
        }

        public Criteria andEstDdEqualTo(Date value) {
            addCriterion("EST_DD =", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdNotEqualTo(Date value) {
            addCriterion("EST_DD <>", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdGreaterThan(Date value) {
            addCriterion("EST_DD >", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdGreaterThanOrEqualTo(Date value) {
            addCriterion("EST_DD >=", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdLessThan(Date value) {
            addCriterion("EST_DD <", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdLessThanOrEqualTo(Date value) {
            addCriterion("EST_DD <=", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdIn(List<Date> values) {
            addCriterion("EST_DD in", values, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdNotIn(List<Date> values) {
            addCriterion("EST_DD not in", values, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdBetween(Date value1, Date value2) {
            addCriterion("EST_DD between", value1, value2, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdNotBetween(Date value1, Date value2) {
            addCriterion("EST_DD not between", value1, value2, "estDd");
            return (Criteria) this;
        }

        public Criteria andPakUnitIsNull() {
            addCriterion("PAK_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPakUnitIsNotNull() {
            addCriterion("PAK_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPakUnitEqualTo(String value) {
            addCriterion("PAK_UNIT =", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitNotEqualTo(String value) {
            addCriterion("PAK_UNIT <>", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitGreaterThan(String value) {
            addCriterion("PAK_UNIT >", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PAK_UNIT >=", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitLessThan(String value) {
            addCriterion("PAK_UNIT <", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitLessThanOrEqualTo(String value) {
            addCriterion("PAK_UNIT <=", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitLike(String value) {
            addCriterion("PAK_UNIT like", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitNotLike(String value) {
            addCriterion("PAK_UNIT not like", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitIn(List<String> values) {
            addCriterion("PAK_UNIT in", values, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitNotIn(List<String> values) {
            addCriterion("PAK_UNIT not in", values, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitBetween(String value1, String value2) {
            addCriterion("PAK_UNIT between", value1, value2, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitNotBetween(String value1, String value2) {
            addCriterion("PAK_UNIT not between", value1, value2, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakExcIsNull() {
            addCriterion("PAK_EXC is null");
            return (Criteria) this;
        }

        public Criteria andPakExcIsNotNull() {
            addCriterion("PAK_EXC is not null");
            return (Criteria) this;
        }

        public Criteria andPakExcEqualTo(BigDecimal value) {
            addCriterion("PAK_EXC =", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcNotEqualTo(BigDecimal value) {
            addCriterion("PAK_EXC <>", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcGreaterThan(BigDecimal value) {
            addCriterion("PAK_EXC >", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_EXC >=", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcLessThan(BigDecimal value) {
            addCriterion("PAK_EXC <", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_EXC <=", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcIn(List<BigDecimal> values) {
            addCriterion("PAK_EXC in", values, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcNotIn(List<BigDecimal> values) {
            addCriterion("PAK_EXC not in", values, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_EXC between", value1, value2, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_EXC not between", value1, value2, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakNwIsNull() {
            addCriterion("PAK_NW is null");
            return (Criteria) this;
        }

        public Criteria andPakNwIsNotNull() {
            addCriterion("PAK_NW is not null");
            return (Criteria) this;
        }

        public Criteria andPakNwEqualTo(BigDecimal value) {
            addCriterion("PAK_NW =", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwNotEqualTo(BigDecimal value) {
            addCriterion("PAK_NW <>", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwGreaterThan(BigDecimal value) {
            addCriterion("PAK_NW >", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_NW >=", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwLessThan(BigDecimal value) {
            addCriterion("PAK_NW <", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_NW <=", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwIn(List<BigDecimal> values) {
            addCriterion("PAK_NW in", values, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwNotIn(List<BigDecimal> values) {
            addCriterion("PAK_NW not in", values, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_NW between", value1, value2, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_NW not between", value1, value2, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitIsNull() {
            addCriterion("PAK_WEIGHT_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitIsNotNull() {
            addCriterion("PAK_WEIGHT_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitEqualTo(String value) {
            addCriterion("PAK_WEIGHT_UNIT =", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitNotEqualTo(String value) {
            addCriterion("PAK_WEIGHT_UNIT <>", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitGreaterThan(String value) {
            addCriterion("PAK_WEIGHT_UNIT >", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PAK_WEIGHT_UNIT >=", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitLessThan(String value) {
            addCriterion("PAK_WEIGHT_UNIT <", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitLessThanOrEqualTo(String value) {
            addCriterion("PAK_WEIGHT_UNIT <=", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitLike(String value) {
            addCriterion("PAK_WEIGHT_UNIT like", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitNotLike(String value) {
            addCriterion("PAK_WEIGHT_UNIT not like", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitIn(List<String> values) {
            addCriterion("PAK_WEIGHT_UNIT in", values, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitNotIn(List<String> values) {
            addCriterion("PAK_WEIGHT_UNIT not in", values, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitBetween(String value1, String value2) {
            addCriterion("PAK_WEIGHT_UNIT between", value1, value2, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitNotBetween(String value1, String value2) {
            addCriterion("PAK_WEIGHT_UNIT not between", value1, value2, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakGwIsNull() {
            addCriterion("PAK_GW is null");
            return (Criteria) this;
        }

        public Criteria andPakGwIsNotNull() {
            addCriterion("PAK_GW is not null");
            return (Criteria) this;
        }

        public Criteria andPakGwEqualTo(BigDecimal value) {
            addCriterion("PAK_GW =", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwNotEqualTo(BigDecimal value) {
            addCriterion("PAK_GW <>", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwGreaterThan(BigDecimal value) {
            addCriterion("PAK_GW >", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_GW >=", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwLessThan(BigDecimal value) {
            addCriterion("PAK_GW <", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_GW <=", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwIn(List<BigDecimal> values) {
            addCriterion("PAK_GW in", values, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwNotIn(List<BigDecimal> values) {
            addCriterion("PAK_GW not in", values, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_GW between", value1, value2, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_GW not between", value1, value2, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakMeastIsNull() {
            addCriterion("PAK_MEAST is null");
            return (Criteria) this;
        }

        public Criteria andPakMeastIsNotNull() {
            addCriterion("PAK_MEAST is not null");
            return (Criteria) this;
        }

        public Criteria andPakMeastEqualTo(BigDecimal value) {
            addCriterion("PAK_MEAST =", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastNotEqualTo(BigDecimal value) {
            addCriterion("PAK_MEAST <>", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastGreaterThan(BigDecimal value) {
            addCriterion("PAK_MEAST >", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_MEAST >=", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastLessThan(BigDecimal value) {
            addCriterion("PAK_MEAST <", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_MEAST <=", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastIn(List<BigDecimal> values) {
            addCriterion("PAK_MEAST in", values, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastNotIn(List<BigDecimal> values) {
            addCriterion("PAK_MEAST not in", values, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_MEAST between", value1, value2, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_MEAST not between", value1, value2, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitIsNull() {
            addCriterion("PAK_MEAST_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitIsNotNull() {
            addCriterion("PAK_MEAST_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitEqualTo(String value) {
            addCriterion("PAK_MEAST_UNIT =", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitNotEqualTo(String value) {
            addCriterion("PAK_MEAST_UNIT <>", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitGreaterThan(String value) {
            addCriterion("PAK_MEAST_UNIT >", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PAK_MEAST_UNIT >=", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitLessThan(String value) {
            addCriterion("PAK_MEAST_UNIT <", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitLessThanOrEqualTo(String value) {
            addCriterion("PAK_MEAST_UNIT <=", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitLike(String value) {
            addCriterion("PAK_MEAST_UNIT like", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitNotLike(String value) {
            addCriterion("PAK_MEAST_UNIT not like", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitIn(List<String> values) {
            addCriterion("PAK_MEAST_UNIT in", values, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitNotIn(List<String> values) {
            addCriterion("PAK_MEAST_UNIT not in", values, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitBetween(String value1, String value2) {
            addCriterion("PAK_MEAST_UNIT between", value1, value2, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitNotBetween(String value1, String value2) {
            addCriterion("PAK_MEAST_UNIT not between", value1, value2, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andValidDdIsNull() {
            addCriterion("VALID_DD is null");
            return (Criteria) this;
        }

        public Criteria andValidDdIsNotNull() {
            addCriterion("VALID_DD is not null");
            return (Criteria) this;
        }

        public Criteria andValidDdEqualTo(Date value) {
            addCriterion("VALID_DD =", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdNotEqualTo(Date value) {
            addCriterion("VALID_DD <>", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdGreaterThan(Date value) {
            addCriterion("VALID_DD >", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdGreaterThanOrEqualTo(Date value) {
            addCriterion("VALID_DD >=", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdLessThan(Date value) {
            addCriterion("VALID_DD <", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdLessThanOrEqualTo(Date value) {
            addCriterion("VALID_DD <=", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdIn(List<Date> values) {
            addCriterion("VALID_DD in", values, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdNotIn(List<Date> values) {
            addCriterion("VALID_DD not in", values, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdBetween(Date value1, Date value2) {
            addCriterion("VALID_DD between", value1, value2, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdNotBetween(Date value1, Date value2) {
            addCriterion("VALID_DD not between", value1, value2, "validDd");
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

        public Criteria andAmtnComIsNull() {
            addCriterion("AMTN_COM is null");
            return (Criteria) this;
        }

        public Criteria andAmtnComIsNotNull() {
            addCriterion("AMTN_COM is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnComEqualTo(BigDecimal value) {
            addCriterion("AMTN_COM =", value, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_COM <>", value, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComGreaterThan(BigDecimal value) {
            addCriterion("AMTN_COM >", value, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_COM >=", value, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComLessThan(BigDecimal value) {
            addCriterion("AMTN_COM <", value, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_COM <=", value, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComIn(List<BigDecimal> values) {
            addCriterion("AMTN_COM in", values, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_COM not in", values, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_COM between", value1, value2, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_COM not between", value1, value2, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andClsMpIdIsNull() {
            addCriterion("CLS_MP_ID is null");
            return (Criteria) this;
        }

        public Criteria andClsMpIdIsNotNull() {
            addCriterion("CLS_MP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClsMpIdEqualTo(String value) {
            addCriterion("CLS_MP_ID =", value, "clsMpId");
            return (Criteria) this;
        }

        public Criteria andClsMpIdNotEqualTo(String value) {
            addCriterion("CLS_MP_ID <>", value, "clsMpId");
            return (Criteria) this;
        }

        public Criteria andClsMpIdGreaterThan(String value) {
            addCriterion("CLS_MP_ID >", value, "clsMpId");
            return (Criteria) this;
        }

        public Criteria andClsMpIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLS_MP_ID >=", value, "clsMpId");
            return (Criteria) this;
        }

        public Criteria andClsMpIdLessThan(String value) {
            addCriterion("CLS_MP_ID <", value, "clsMpId");
            return (Criteria) this;
        }

        public Criteria andClsMpIdLessThanOrEqualTo(String value) {
            addCriterion("CLS_MP_ID <=", value, "clsMpId");
            return (Criteria) this;
        }

        public Criteria andClsMpIdLike(String value) {
            addCriterion("CLS_MP_ID like", value, "clsMpId");
            return (Criteria) this;
        }

        public Criteria andClsMpIdNotLike(String value) {
            addCriterion("CLS_MP_ID not like", value, "clsMpId");
            return (Criteria) this;
        }

        public Criteria andClsMpIdIn(List<String> values) {
            addCriterion("CLS_MP_ID in", values, "clsMpId");
            return (Criteria) this;
        }

        public Criteria andClsMpIdNotIn(List<String> values) {
            addCriterion("CLS_MP_ID not in", values, "clsMpId");
            return (Criteria) this;
        }

        public Criteria andClsMpIdBetween(String value1, String value2) {
            addCriterion("CLS_MP_ID between", value1, value2, "clsMpId");
            return (Criteria) this;
        }

        public Criteria andClsMpIdNotBetween(String value1, String value2) {
            addCriterion("CLS_MP_ID not between", value1, value2, "clsMpId");
            return (Criteria) this;
        }

        public Criteria andCstStdIsNull() {
            addCriterion("CST_STD is null");
            return (Criteria) this;
        }

        public Criteria andCstStdIsNotNull() {
            addCriterion("CST_STD is not null");
            return (Criteria) this;
        }

        public Criteria andCstStdEqualTo(BigDecimal value) {
            addCriterion("CST_STD =", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdNotEqualTo(BigDecimal value) {
            addCriterion("CST_STD <>", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdGreaterThan(BigDecimal value) {
            addCriterion("CST_STD >", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_STD >=", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdLessThan(BigDecimal value) {
            addCriterion("CST_STD <", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_STD <=", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdIn(List<BigDecimal> values) {
            addCriterion("CST_STD in", values, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdNotIn(List<BigDecimal> values) {
            addCriterion("CST_STD not in", values, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_STD between", value1, value2, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_STD not between", value1, value2, "cstStd");
            return (Criteria) this;
        }

        public Criteria andUpQty1IsNull() {
            addCriterion("UP_QTY1 is null");
            return (Criteria) this;
        }

        public Criteria andUpQty1IsNotNull() {
            addCriterion("UP_QTY1 is not null");
            return (Criteria) this;
        }

        public Criteria andUpQty1EqualTo(BigDecimal value) {
            addCriterion("UP_QTY1 =", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1NotEqualTo(BigDecimal value) {
            addCriterion("UP_QTY1 <>", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1GreaterThan(BigDecimal value) {
            addCriterion("UP_QTY1 >", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_QTY1 >=", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1LessThan(BigDecimal value) {
            addCriterion("UP_QTY1 <", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_QTY1 <=", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1In(List<BigDecimal> values) {
            addCriterion("UP_QTY1 in", values, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1NotIn(List<BigDecimal> values) {
            addCriterion("UP_QTY1 not in", values, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_QTY1 between", value1, value2, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_QTY1 not between", value1, value2, "upQty1");
            return (Criteria) this;
        }

        public Criteria andEstItmIsNull() {
            addCriterion("EST_ITM is null");
            return (Criteria) this;
        }

        public Criteria andEstItmIsNotNull() {
            addCriterion("EST_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andEstItmEqualTo(Integer value) {
            addCriterion("EST_ITM =", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmNotEqualTo(Integer value) {
            addCriterion("EST_ITM <>", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmGreaterThan(Integer value) {
            addCriterion("EST_ITM >", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("EST_ITM >=", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmLessThan(Integer value) {
            addCriterion("EST_ITM <", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmLessThanOrEqualTo(Integer value) {
            addCriterion("EST_ITM <=", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmIn(List<Integer> values) {
            addCriterion("EST_ITM in", values, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmNotIn(List<Integer> values) {
            addCriterion("EST_ITM not in", values, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmBetween(Integer value1, Integer value2) {
            addCriterion("EST_ITM between", value1, value2, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmNotBetween(Integer value1, Integer value2) {
            addCriterion("EST_ITM not between", value1, value2, "estItm");
            return (Criteria) this;
        }

        public Criteria andSendWhIsNull() {
            addCriterion("SEND_WH is null");
            return (Criteria) this;
        }

        public Criteria andSendWhIsNotNull() {
            addCriterion("SEND_WH is not null");
            return (Criteria) this;
        }

        public Criteria andSendWhEqualTo(String value) {
            addCriterion("SEND_WH =", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhNotEqualTo(String value) {
            addCriterion("SEND_WH <>", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhGreaterThan(String value) {
            addCriterion("SEND_WH >", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_WH >=", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhLessThan(String value) {
            addCriterion("SEND_WH <", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhLessThanOrEqualTo(String value) {
            addCriterion("SEND_WH <=", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhLike(String value) {
            addCriterion("SEND_WH like", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhNotLike(String value) {
            addCriterion("SEND_WH not like", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhIn(List<String> values) {
            addCriterion("SEND_WH in", values, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhNotIn(List<String> values) {
            addCriterion("SEND_WH not in", values, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhBetween(String value1, String value2) {
            addCriterion("SEND_WH between", value1, value2, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhNotBetween(String value1, String value2) {
            addCriterion("SEND_WH not between", value1, value2, "sendWh");
            return (Criteria) this;
        }

        public Criteria andUtIsNull() {
            addCriterion("UT is null");
            return (Criteria) this;
        }

        public Criteria andUtIsNotNull() {
            addCriterion("UT is not null");
            return (Criteria) this;
        }

        public Criteria andUtEqualTo(String value) {
            addCriterion("UT =", value, "ut");
            return (Criteria) this;
        }

        public Criteria andUtNotEqualTo(String value) {
            addCriterion("UT <>", value, "ut");
            return (Criteria) this;
        }

        public Criteria andUtGreaterThan(String value) {
            addCriterion("UT >", value, "ut");
            return (Criteria) this;
        }

        public Criteria andUtGreaterThanOrEqualTo(String value) {
            addCriterion("UT >=", value, "ut");
            return (Criteria) this;
        }

        public Criteria andUtLessThan(String value) {
            addCriterion("UT <", value, "ut");
            return (Criteria) this;
        }

        public Criteria andUtLessThanOrEqualTo(String value) {
            addCriterion("UT <=", value, "ut");
            return (Criteria) this;
        }

        public Criteria andUtLike(String value) {
            addCriterion("UT like", value, "ut");
            return (Criteria) this;
        }

        public Criteria andUtNotLike(String value) {
            addCriterion("UT not like", value, "ut");
            return (Criteria) this;
        }

        public Criteria andUtIn(List<String> values) {
            addCriterion("UT in", values, "ut");
            return (Criteria) this;
        }

        public Criteria andUtNotIn(List<String> values) {
            addCriterion("UT not in", values, "ut");
            return (Criteria) this;
        }

        public Criteria andUtBetween(String value1, String value2) {
            addCriterion("UT between", value1, value2, "ut");
            return (Criteria) this;
        }

        public Criteria andUtNotBetween(String value1, String value2) {
            addCriterion("UT not between", value1, value2, "ut");
            return (Criteria) this;
        }

        public Criteria andCodeNoIsNull() {
            addCriterion("CODE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCodeNoIsNotNull() {
            addCriterion("CODE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCodeNoEqualTo(String value) {
            addCriterion("CODE_NO =", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoNotEqualTo(String value) {
            addCriterion("CODE_NO <>", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoGreaterThan(String value) {
            addCriterion("CODE_NO >", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoGreaterThanOrEqualTo(String value) {
            addCriterion("CODE_NO >=", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoLessThan(String value) {
            addCriterion("CODE_NO <", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoLessThanOrEqualTo(String value) {
            addCriterion("CODE_NO <=", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoLike(String value) {
            addCriterion("CODE_NO like", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoNotLike(String value) {
            addCriterion("CODE_NO not like", value, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoIn(List<String> values) {
            addCriterion("CODE_NO in", values, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoNotIn(List<String> values) {
            addCriterion("CODE_NO not in", values, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoBetween(String value1, String value2) {
            addCriterion("CODE_NO between", value1, value2, "codeNo");
            return (Criteria) this;
        }

        public Criteria andCodeNoNotBetween(String value1, String value2) {
            addCriterion("CODE_NO not between", value1, value2, "codeNo");
            return (Criteria) this;
        }

        public Criteria andAttrIsNull() {
            addCriterion("ATTR is null");
            return (Criteria) this;
        }

        public Criteria andAttrIsNotNull() {
            addCriterion("ATTR is not null");
            return (Criteria) this;
        }

        public Criteria andAttrEqualTo(String value) {
            addCriterion("ATTR =", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrNotEqualTo(String value) {
            addCriterion("ATTR <>", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrGreaterThan(String value) {
            addCriterion("ATTR >", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR >=", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrLessThan(String value) {
            addCriterion("ATTR <", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrLessThanOrEqualTo(String value) {
            addCriterion("ATTR <=", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrLike(String value) {
            addCriterion("ATTR like", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrNotLike(String value) {
            addCriterion("ATTR not like", value, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrIn(List<String> values) {
            addCriterion("ATTR in", values, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrNotIn(List<String> values) {
            addCriterion("ATTR not in", values, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrBetween(String value1, String value2) {
            addCriterion("ATTR between", value1, value2, "attr");
            return (Criteria) this;
        }

        public Criteria andAttrNotBetween(String value1, String value2) {
            addCriterion("ATTR not between", value1, value2, "attr");
            return (Criteria) this;
        }

        public Criteria andQtyRkIsNull() {
            addCriterion("QTY_RK is null");
            return (Criteria) this;
        }

        public Criteria andQtyRkIsNotNull() {
            addCriterion("QTY_RK is not null");
            return (Criteria) this;
        }

        public Criteria andQtyRkEqualTo(BigDecimal value) {
            addCriterion("QTY_RK =", value, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkNotEqualTo(BigDecimal value) {
            addCriterion("QTY_RK <>", value, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkGreaterThan(BigDecimal value) {
            addCriterion("QTY_RK >", value, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_RK >=", value, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkLessThan(BigDecimal value) {
            addCriterion("QTY_RK <", value, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_RK <=", value, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkIn(List<BigDecimal> values) {
            addCriterion("QTY_RK in", values, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkNotIn(List<BigDecimal> values) {
            addCriterion("QTY_RK not in", values, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_RK between", value1, value2, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_RK not between", value1, value2, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkUnshIsNull() {
            addCriterion("QTY_RK_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyRkUnshIsNotNull() {
            addCriterion("QTY_RK_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyRkUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_RK_UNSH =", value, "qtyRkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRkUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_RK_UNSH <>", value, "qtyRkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRkUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_RK_UNSH >", value, "qtyRkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRkUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_RK_UNSH >=", value, "qtyRkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRkUnshLessThan(BigDecimal value) {
            addCriterion("QTY_RK_UNSH <", value, "qtyRkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRkUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_RK_UNSH <=", value, "qtyRkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRkUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_RK_UNSH in", values, "qtyRkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRkUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_RK_UNSH not in", values, "qtyRkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRkUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_RK_UNSH between", value1, value2, "qtyRkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRkUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_RK_UNSH not between", value1, value2, "qtyRkUnsh");
            return (Criteria) this;
        }

        public Criteria andBatNoIsNull() {
            addCriterion("BAT_NO is null");
            return (Criteria) this;
        }

        public Criteria andBatNoIsNotNull() {
            addCriterion("BAT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBatNoEqualTo(String value) {
            addCriterion("BAT_NO =", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoNotEqualTo(String value) {
            addCriterion("BAT_NO <>", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoGreaterThan(String value) {
            addCriterion("BAT_NO >", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoGreaterThanOrEqualTo(String value) {
            addCriterion("BAT_NO >=", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoLessThan(String value) {
            addCriterion("BAT_NO <", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoLessThanOrEqualTo(String value) {
            addCriterion("BAT_NO <=", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoLike(String value) {
            addCriterion("BAT_NO like", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoNotLike(String value) {
            addCriterion("BAT_NO not like", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoIn(List<String> values) {
            addCriterion("BAT_NO in", values, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoNotIn(List<String> values) {
            addCriterion("BAT_NO not in", values, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoBetween(String value1, String value2) {
            addCriterion("BAT_NO between", value1, value2, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoNotBetween(String value1, String value2) {
            addCriterion("BAT_NO not between", value1, value2, "batNo");
            return (Criteria) this;
        }

        public Criteria andPreEstDdIsNull() {
            addCriterion("PRE_EST_DD is null");
            return (Criteria) this;
        }

        public Criteria andPreEstDdIsNotNull() {
            addCriterion("PRE_EST_DD is not null");
            return (Criteria) this;
        }

        public Criteria andPreEstDdEqualTo(Date value) {
            addCriterion("PRE_EST_DD =", value, "preEstDd");
            return (Criteria) this;
        }

        public Criteria andPreEstDdNotEqualTo(Date value) {
            addCriterion("PRE_EST_DD <>", value, "preEstDd");
            return (Criteria) this;
        }

        public Criteria andPreEstDdGreaterThan(Date value) {
            addCriterion("PRE_EST_DD >", value, "preEstDd");
            return (Criteria) this;
        }

        public Criteria andPreEstDdGreaterThanOrEqualTo(Date value) {
            addCriterion("PRE_EST_DD >=", value, "preEstDd");
            return (Criteria) this;
        }

        public Criteria andPreEstDdLessThan(Date value) {
            addCriterion("PRE_EST_DD <", value, "preEstDd");
            return (Criteria) this;
        }

        public Criteria andPreEstDdLessThanOrEqualTo(Date value) {
            addCriterion("PRE_EST_DD <=", value, "preEstDd");
            return (Criteria) this;
        }

        public Criteria andPreEstDdIn(List<Date> values) {
            addCriterion("PRE_EST_DD in", values, "preEstDd");
            return (Criteria) this;
        }

        public Criteria andPreEstDdNotIn(List<Date> values) {
            addCriterion("PRE_EST_DD not in", values, "preEstDd");
            return (Criteria) this;
        }

        public Criteria andPreEstDdBetween(Date value1, Date value2) {
            addCriterion("PRE_EST_DD between", value1, value2, "preEstDd");
            return (Criteria) this;
        }

        public Criteria andPreEstDdNotBetween(Date value1, Date value2) {
            addCriterion("PRE_EST_DD not between", value1, value2, "preEstDd");
            return (Criteria) this;
        }

        public Criteria andQtyPoIsNull() {
            addCriterion("QTY_PO is null");
            return (Criteria) this;
        }

        public Criteria andQtyPoIsNotNull() {
            addCriterion("QTY_PO is not null");
            return (Criteria) this;
        }

        public Criteria andQtyPoEqualTo(BigDecimal value) {
            addCriterion("QTY_PO =", value, "qtyPo");
            return (Criteria) this;
        }

        public Criteria andQtyPoNotEqualTo(BigDecimal value) {
            addCriterion("QTY_PO <>", value, "qtyPo");
            return (Criteria) this;
        }

        public Criteria andQtyPoGreaterThan(BigDecimal value) {
            addCriterion("QTY_PO >", value, "qtyPo");
            return (Criteria) this;
        }

        public Criteria andQtyPoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_PO >=", value, "qtyPo");
            return (Criteria) this;
        }

        public Criteria andQtyPoLessThan(BigDecimal value) {
            addCriterion("QTY_PO <", value, "qtyPo");
            return (Criteria) this;
        }

        public Criteria andQtyPoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_PO <=", value, "qtyPo");
            return (Criteria) this;
        }

        public Criteria andQtyPoIn(List<BigDecimal> values) {
            addCriterion("QTY_PO in", values, "qtyPo");
            return (Criteria) this;
        }

        public Criteria andQtyPoNotIn(List<BigDecimal> values) {
            addCriterion("QTY_PO not in", values, "qtyPo");
            return (Criteria) this;
        }

        public Criteria andQtyPoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_PO between", value1, value2, "qtyPo");
            return (Criteria) this;
        }

        public Criteria andQtyPoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_PO not between", value1, value2, "qtyPo");
            return (Criteria) this;
        }

        public Criteria andQtyPoUnshIsNull() {
            addCriterion("QTY_PO_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyPoUnshIsNotNull() {
            addCriterion("QTY_PO_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyPoUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_PO_UNSH =", value, "qtyPoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPoUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_PO_UNSH <>", value, "qtyPoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPoUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_PO_UNSH >", value, "qtyPoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPoUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_PO_UNSH >=", value, "qtyPoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPoUnshLessThan(BigDecimal value) {
            addCriterion("QTY_PO_UNSH <", value, "qtyPoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPoUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_PO_UNSH <=", value, "qtyPoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPoUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_PO_UNSH in", values, "qtyPoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPoUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_PO_UNSH not in", values, "qtyPoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPoUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_PO_UNSH between", value1, value2, "qtyPoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPoUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_PO_UNSH not between", value1, value2, "qtyPoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPreIsNull() {
            addCriterion("QTY_PRE is null");
            return (Criteria) this;
        }

        public Criteria andQtyPreIsNotNull() {
            addCriterion("QTY_PRE is not null");
            return (Criteria) this;
        }

        public Criteria andQtyPreEqualTo(BigDecimal value) {
            addCriterion("QTY_PRE =", value, "qtyPre");
            return (Criteria) this;
        }

        public Criteria andQtyPreNotEqualTo(BigDecimal value) {
            addCriterion("QTY_PRE <>", value, "qtyPre");
            return (Criteria) this;
        }

        public Criteria andQtyPreGreaterThan(BigDecimal value) {
            addCriterion("QTY_PRE >", value, "qtyPre");
            return (Criteria) this;
        }

        public Criteria andQtyPreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_PRE >=", value, "qtyPre");
            return (Criteria) this;
        }

        public Criteria andQtyPreLessThan(BigDecimal value) {
            addCriterion("QTY_PRE <", value, "qtyPre");
            return (Criteria) this;
        }

        public Criteria andQtyPreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_PRE <=", value, "qtyPre");
            return (Criteria) this;
        }

        public Criteria andQtyPreIn(List<BigDecimal> values) {
            addCriterion("QTY_PRE in", values, "qtyPre");
            return (Criteria) this;
        }

        public Criteria andQtyPreNotIn(List<BigDecimal> values) {
            addCriterion("QTY_PRE not in", values, "qtyPre");
            return (Criteria) this;
        }

        public Criteria andQtyPreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_PRE between", value1, value2, "qtyPre");
            return (Criteria) this;
        }

        public Criteria andQtyPreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_PRE not between", value1, value2, "qtyPre");
            return (Criteria) this;
        }

        public Criteria andQtyPreUnshIsNull() {
            addCriterion("QTY_PRE_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyPreUnshIsNotNull() {
            addCriterion("QTY_PRE_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyPreUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_PRE_UNSH =", value, "qtyPreUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPreUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_PRE_UNSH <>", value, "qtyPreUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPreUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_PRE_UNSH >", value, "qtyPreUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPreUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_PRE_UNSH >=", value, "qtyPreUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPreUnshLessThan(BigDecimal value) {
            addCriterion("QTY_PRE_UNSH <", value, "qtyPreUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPreUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_PRE_UNSH <=", value, "qtyPreUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPreUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_PRE_UNSH in", values, "qtyPreUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPreUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_PRE_UNSH not in", values, "qtyPreUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPreUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_PRE_UNSH between", value1, value2, "qtyPreUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyPreUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_PRE_UNSH not between", value1, value2, "qtyPreUnsh");
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

        public Criteria andIdNoIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("ID_NO =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("ID_NO >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("ID_NO <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("ID_NO like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("ID_NO not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("ID_NO in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andQtyYsIsNull() {
            addCriterion("QTY_YS is null");
            return (Criteria) this;
        }

        public Criteria andQtyYsIsNotNull() {
            addCriterion("QTY_YS is not null");
            return (Criteria) this;
        }

        public Criteria andQtyYsEqualTo(BigDecimal value) {
            addCriterion("QTY_YS =", value, "qtyYs");
            return (Criteria) this;
        }

        public Criteria andQtyYsNotEqualTo(BigDecimal value) {
            addCriterion("QTY_YS <>", value, "qtyYs");
            return (Criteria) this;
        }

        public Criteria andQtyYsGreaterThan(BigDecimal value) {
            addCriterion("QTY_YS >", value, "qtyYs");
            return (Criteria) this;
        }

        public Criteria andQtyYsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_YS >=", value, "qtyYs");
            return (Criteria) this;
        }

        public Criteria andQtyYsLessThan(BigDecimal value) {
            addCriterion("QTY_YS <", value, "qtyYs");
            return (Criteria) this;
        }

        public Criteria andQtyYsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_YS <=", value, "qtyYs");
            return (Criteria) this;
        }

        public Criteria andQtyYsIn(List<BigDecimal> values) {
            addCriterion("QTY_YS in", values, "qtyYs");
            return (Criteria) this;
        }

        public Criteria andQtyYsNotIn(List<BigDecimal> values) {
            addCriterion("QTY_YS not in", values, "qtyYs");
            return (Criteria) this;
        }

        public Criteria andQtyYsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_YS between", value1, value2, "qtyYs");
            return (Criteria) this;
        }

        public Criteria andQtyYsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_YS not between", value1, value2, "qtyYs");
            return (Criteria) this;
        }

        public Criteria andQtyYsUnshIsNull() {
            addCriterion("QTY_YS_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyYsUnshIsNotNull() {
            addCriterion("QTY_YS_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyYsUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_YS_UNSH =", value, "qtyYsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyYsUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_YS_UNSH <>", value, "qtyYsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyYsUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_YS_UNSH >", value, "qtyYsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyYsUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_YS_UNSH >=", value, "qtyYsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyYsUnshLessThan(BigDecimal value) {
            addCriterion("QTY_YS_UNSH <", value, "qtyYsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyYsUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_YS_UNSH <=", value, "qtyYsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyYsUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_YS_UNSH in", values, "qtyYsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyYsUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_YS_UNSH not in", values, "qtyYsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyYsUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_YS_UNSH between", value1, value2, "qtyYsUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyYsUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_YS_UNSH not between", value1, value2, "qtyYsUnsh");
            return (Criteria) this;
        }

        public Criteria andFreeIdIsNull() {
            addCriterion("FREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFreeIdIsNotNull() {
            addCriterion("FREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFreeIdEqualTo(String value) {
            addCriterion("FREE_ID =", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdNotEqualTo(String value) {
            addCriterion("FREE_ID <>", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdGreaterThan(String value) {
            addCriterion("FREE_ID >", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdGreaterThanOrEqualTo(String value) {
            addCriterion("FREE_ID >=", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdLessThan(String value) {
            addCriterion("FREE_ID <", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdLessThanOrEqualTo(String value) {
            addCriterion("FREE_ID <=", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdLike(String value) {
            addCriterion("FREE_ID like", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdNotLike(String value) {
            addCriterion("FREE_ID not like", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdIn(List<String> values) {
            addCriterion("FREE_ID in", values, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdNotIn(List<String> values) {
            addCriterion("FREE_ID not in", values, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdBetween(String value1, String value2) {
            addCriterion("FREE_ID between", value1, value2, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdNotBetween(String value1, String value2) {
            addCriterion("FREE_ID not between", value1, value2, "freeId");
            return (Criteria) this;
        }

        public Criteria andBilIdIsNull() {
            addCriterion("BIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBilIdIsNotNull() {
            addCriterion("BIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBilIdEqualTo(String value) {
            addCriterion("BIL_ID =", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdNotEqualTo(String value) {
            addCriterion("BIL_ID <>", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdGreaterThan(String value) {
            addCriterion("BIL_ID >", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdGreaterThanOrEqualTo(String value) {
            addCriterion("BIL_ID >=", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdLessThan(String value) {
            addCriterion("BIL_ID <", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdLessThanOrEqualTo(String value) {
            addCriterion("BIL_ID <=", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdLike(String value) {
            addCriterion("BIL_ID like", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdNotLike(String value) {
            addCriterion("BIL_ID not like", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdIn(List<String> values) {
            addCriterion("BIL_ID in", values, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdNotIn(List<String> values) {
            addCriterion("BIL_ID not in", values, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdBetween(String value1, String value2) {
            addCriterion("BIL_ID between", value1, value2, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdNotBetween(String value1, String value2) {
            addCriterion("BIL_ID not between", value1, value2, "bilId");
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

        public Criteria andOthItmIsNull() {
            addCriterion("OTH_ITM is null");
            return (Criteria) this;
        }

        public Criteria andOthItmIsNotNull() {
            addCriterion("OTH_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andOthItmEqualTo(Integer value) {
            addCriterion("OTH_ITM =", value, "othItm");
            return (Criteria) this;
        }

        public Criteria andOthItmNotEqualTo(Integer value) {
            addCriterion("OTH_ITM <>", value, "othItm");
            return (Criteria) this;
        }

        public Criteria andOthItmGreaterThan(Integer value) {
            addCriterion("OTH_ITM >", value, "othItm");
            return (Criteria) this;
        }

        public Criteria andOthItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("OTH_ITM >=", value, "othItm");
            return (Criteria) this;
        }

        public Criteria andOthItmLessThan(Integer value) {
            addCriterion("OTH_ITM <", value, "othItm");
            return (Criteria) this;
        }

        public Criteria andOthItmLessThanOrEqualTo(Integer value) {
            addCriterion("OTH_ITM <=", value, "othItm");
            return (Criteria) this;
        }

        public Criteria andOthItmIn(List<Integer> values) {
            addCriterion("OTH_ITM in", values, "othItm");
            return (Criteria) this;
        }

        public Criteria andOthItmNotIn(List<Integer> values) {
            addCriterion("OTH_ITM not in", values, "othItm");
            return (Criteria) this;
        }

        public Criteria andOthItmBetween(Integer value1, Integer value2) {
            addCriterion("OTH_ITM between", value1, value2, "othItm");
            return (Criteria) this;
        }

        public Criteria andOthItmNotBetween(Integer value1, Integer value2) {
            addCriterion("OTH_ITM not between", value1, value2, "othItm");
            return (Criteria) this;
        }

        public Criteria andTaxRtoIsNull() {
            addCriterion("TAX_RTO is null");
            return (Criteria) this;
        }

        public Criteria andTaxRtoIsNotNull() {
            addCriterion("TAX_RTO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRtoEqualTo(BigDecimal value) {
            addCriterion("TAX_RTO =", value, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoNotEqualTo(BigDecimal value) {
            addCriterion("TAX_RTO <>", value, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoGreaterThan(BigDecimal value) {
            addCriterion("TAX_RTO >", value, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_RTO >=", value, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoLessThan(BigDecimal value) {
            addCriterion("TAX_RTO <", value, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_RTO <=", value, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoIn(List<BigDecimal> values) {
            addCriterion("TAX_RTO in", values, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoNotIn(List<BigDecimal> values) {
            addCriterion("TAX_RTO not in", values, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_RTO between", value1, value2, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_RTO not between", value1, value2, "taxRto");
            return (Criteria) this;
        }

        public Criteria andAmtLcIsNull() {
            addCriterion("AMT_LC is null");
            return (Criteria) this;
        }

        public Criteria andAmtLcIsNotNull() {
            addCriterion("AMT_LC is not null");
            return (Criteria) this;
        }

        public Criteria andAmtLcEqualTo(BigDecimal value) {
            addCriterion("AMT_LC =", value, "amtLc");
            return (Criteria) this;
        }

        public Criteria andAmtLcNotEqualTo(BigDecimal value) {
            addCriterion("AMT_LC <>", value, "amtLc");
            return (Criteria) this;
        }

        public Criteria andAmtLcGreaterThan(BigDecimal value) {
            addCriterion("AMT_LC >", value, "amtLc");
            return (Criteria) this;
        }

        public Criteria andAmtLcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_LC >=", value, "amtLc");
            return (Criteria) this;
        }

        public Criteria andAmtLcLessThan(BigDecimal value) {
            addCriterion("AMT_LC <", value, "amtLc");
            return (Criteria) this;
        }

        public Criteria andAmtLcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_LC <=", value, "amtLc");
            return (Criteria) this;
        }

        public Criteria andAmtLcIn(List<BigDecimal> values) {
            addCriterion("AMT_LC in", values, "amtLc");
            return (Criteria) this;
        }

        public Criteria andAmtLcNotIn(List<BigDecimal> values) {
            addCriterion("AMT_LC not in", values, "amtLc");
            return (Criteria) this;
        }

        public Criteria andAmtLcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_LC between", value1, value2, "amtLc");
            return (Criteria) this;
        }

        public Criteria andAmtLcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_LC not between", value1, value2, "amtLc");
            return (Criteria) this;
        }

        public Criteria andQtyBackIsNull() {
            addCriterion("QTY_BACK is null");
            return (Criteria) this;
        }

        public Criteria andQtyBackIsNotNull() {
            addCriterion("QTY_BACK is not null");
            return (Criteria) this;
        }

        public Criteria andQtyBackEqualTo(BigDecimal value) {
            addCriterion("QTY_BACK =", value, "qtyBack");
            return (Criteria) this;
        }

        public Criteria andQtyBackNotEqualTo(BigDecimal value) {
            addCriterion("QTY_BACK <>", value, "qtyBack");
            return (Criteria) this;
        }

        public Criteria andQtyBackGreaterThan(BigDecimal value) {
            addCriterion("QTY_BACK >", value, "qtyBack");
            return (Criteria) this;
        }

        public Criteria andQtyBackGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_BACK >=", value, "qtyBack");
            return (Criteria) this;
        }

        public Criteria andQtyBackLessThan(BigDecimal value) {
            addCriterion("QTY_BACK <", value, "qtyBack");
            return (Criteria) this;
        }

        public Criteria andQtyBackLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_BACK <=", value, "qtyBack");
            return (Criteria) this;
        }

        public Criteria andQtyBackIn(List<BigDecimal> values) {
            addCriterion("QTY_BACK in", values, "qtyBack");
            return (Criteria) this;
        }

        public Criteria andQtyBackNotIn(List<BigDecimal> values) {
            addCriterion("QTY_BACK not in", values, "qtyBack");
            return (Criteria) this;
        }

        public Criteria andQtyBackBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_BACK between", value1, value2, "qtyBack");
            return (Criteria) this;
        }

        public Criteria andQtyBackNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_BACK not between", value1, value2, "qtyBack");
            return (Criteria) this;
        }

        public Criteria andChkTaxIsNull() {
            addCriterion("CHK_TAX is null");
            return (Criteria) this;
        }

        public Criteria andChkTaxIsNotNull() {
            addCriterion("CHK_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andChkTaxEqualTo(String value) {
            addCriterion("CHK_TAX =", value, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxNotEqualTo(String value) {
            addCriterion("CHK_TAX <>", value, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxGreaterThan(String value) {
            addCriterion("CHK_TAX >", value, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_TAX >=", value, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxLessThan(String value) {
            addCriterion("CHK_TAX <", value, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxLessThanOrEqualTo(String value) {
            addCriterion("CHK_TAX <=", value, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxLike(String value) {
            addCriterion("CHK_TAX like", value, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxNotLike(String value) {
            addCriterion("CHK_TAX not like", value, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxIn(List<String> values) {
            addCriterion("CHK_TAX in", values, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxNotIn(List<String> values) {
            addCriterion("CHK_TAX not in", values, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxBetween(String value1, String value2) {
            addCriterion("CHK_TAX between", value1, value2, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxNotBetween(String value1, String value2) {
            addCriterion("CHK_TAX not between", value1, value2, "chkTax");
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

        public Criteria andComposeIdnoIsNull() {
            addCriterion("COMPOSE_IDNO is null");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoIsNotNull() {
            addCriterion("COMPOSE_IDNO is not null");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoEqualTo(String value) {
            addCriterion("COMPOSE_IDNO =", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoNotEqualTo(String value) {
            addCriterion("COMPOSE_IDNO <>", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoGreaterThan(String value) {
            addCriterion("COMPOSE_IDNO >", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("COMPOSE_IDNO >=", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoLessThan(String value) {
            addCriterion("COMPOSE_IDNO <", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoLessThanOrEqualTo(String value) {
            addCriterion("COMPOSE_IDNO <=", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoLike(String value) {
            addCriterion("COMPOSE_IDNO like", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoNotLike(String value) {
            addCriterion("COMPOSE_IDNO not like", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoIn(List<String> values) {
            addCriterion("COMPOSE_IDNO in", values, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoNotIn(List<String> values) {
            addCriterion("COMPOSE_IDNO not in", values, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoBetween(String value1, String value2) {
            addCriterion("COMPOSE_IDNO between", value1, value2, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoNotBetween(String value1, String value2) {
            addCriterion("COMPOSE_IDNO not between", value1, value2, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andQtySlIsNull() {
            addCriterion("QTY_SL is null");
            return (Criteria) this;
        }

        public Criteria andQtySlIsNotNull() {
            addCriterion("QTY_SL is not null");
            return (Criteria) this;
        }

        public Criteria andQtySlEqualTo(BigDecimal value) {
            addCriterion("QTY_SL =", value, "qtySl");
            return (Criteria) this;
        }

        public Criteria andQtySlNotEqualTo(BigDecimal value) {
            addCriterion("QTY_SL <>", value, "qtySl");
            return (Criteria) this;
        }

        public Criteria andQtySlGreaterThan(BigDecimal value) {
            addCriterion("QTY_SL >", value, "qtySl");
            return (Criteria) this;
        }

        public Criteria andQtySlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SL >=", value, "qtySl");
            return (Criteria) this;
        }

        public Criteria andQtySlLessThan(BigDecimal value) {
            addCriterion("QTY_SL <", value, "qtySl");
            return (Criteria) this;
        }

        public Criteria andQtySlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SL <=", value, "qtySl");
            return (Criteria) this;
        }

        public Criteria andQtySlIn(List<BigDecimal> values) {
            addCriterion("QTY_SL in", values, "qtySl");
            return (Criteria) this;
        }

        public Criteria andQtySlNotIn(List<BigDecimal> values) {
            addCriterion("QTY_SL not in", values, "qtySl");
            return (Criteria) this;
        }

        public Criteria andQtySlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SL between", value1, value2, "qtySl");
            return (Criteria) this;
        }

        public Criteria andQtySlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SL not between", value1, value2, "qtySl");
            return (Criteria) this;
        }

        public Criteria andQtySlUnshIsNull() {
            addCriterion("QTY_SL_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtySlUnshIsNotNull() {
            addCriterion("QTY_SL_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtySlUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_SL_UNSH =", value, "qtySlUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySlUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_SL_UNSH <>", value, "qtySlUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySlUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_SL_UNSH >", value, "qtySlUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySlUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SL_UNSH >=", value, "qtySlUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySlUnshLessThan(BigDecimal value) {
            addCriterion("QTY_SL_UNSH <", value, "qtySlUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySlUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SL_UNSH <=", value, "qtySlUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySlUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_SL_UNSH in", values, "qtySlUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySlUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_SL_UNSH not in", values, "qtySlUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySlUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SL_UNSH between", value1, value2, "qtySlUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySlUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SL_UNSH not between", value1, value2, "qtySlUnsh");
            return (Criteria) this;
        }

        public Criteria andCusOsNoIsNull() {
            addCriterion("CUS_OS_NO is null");
            return (Criteria) this;
        }

        public Criteria andCusOsNoIsNotNull() {
            addCriterion("CUS_OS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCusOsNoEqualTo(String value) {
            addCriterion("CUS_OS_NO =", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoNotEqualTo(String value) {
            addCriterion("CUS_OS_NO <>", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoGreaterThan(String value) {
            addCriterion("CUS_OS_NO >", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_OS_NO >=", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoLessThan(String value) {
            addCriterion("CUS_OS_NO <", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoLessThanOrEqualTo(String value) {
            addCriterion("CUS_OS_NO <=", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoLike(String value) {
            addCriterion("CUS_OS_NO like", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoNotLike(String value) {
            addCriterion("CUS_OS_NO not like", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoIn(List<String> values) {
            addCriterion("CUS_OS_NO in", values, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoNotIn(List<String> values) {
            addCriterion("CUS_OS_NO not in", values, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoBetween(String value1, String value2) {
            addCriterion("CUS_OS_NO between", value1, value2, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoNotBetween(String value1, String value2) {
            addCriterion("CUS_OS_NO not between", value1, value2, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andOthIdIsNull() {
            addCriterion("OTH_ID is null");
            return (Criteria) this;
        }

        public Criteria andOthIdIsNotNull() {
            addCriterion("OTH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOthIdEqualTo(String value) {
            addCriterion("OTH_ID =", value, "othId");
            return (Criteria) this;
        }

        public Criteria andOthIdNotEqualTo(String value) {
            addCriterion("OTH_ID <>", value, "othId");
            return (Criteria) this;
        }

        public Criteria andOthIdGreaterThan(String value) {
            addCriterion("OTH_ID >", value, "othId");
            return (Criteria) this;
        }

        public Criteria andOthIdGreaterThanOrEqualTo(String value) {
            addCriterion("OTH_ID >=", value, "othId");
            return (Criteria) this;
        }

        public Criteria andOthIdLessThan(String value) {
            addCriterion("OTH_ID <", value, "othId");
            return (Criteria) this;
        }

        public Criteria andOthIdLessThanOrEqualTo(String value) {
            addCriterion("OTH_ID <=", value, "othId");
            return (Criteria) this;
        }

        public Criteria andOthIdLike(String value) {
            addCriterion("OTH_ID like", value, "othId");
            return (Criteria) this;
        }

        public Criteria andOthIdNotLike(String value) {
            addCriterion("OTH_ID not like", value, "othId");
            return (Criteria) this;
        }

        public Criteria andOthIdIn(List<String> values) {
            addCriterion("OTH_ID in", values, "othId");
            return (Criteria) this;
        }

        public Criteria andOthIdNotIn(List<String> values) {
            addCriterion("OTH_ID not in", values, "othId");
            return (Criteria) this;
        }

        public Criteria andOthIdBetween(String value1, String value2) {
            addCriterion("OTH_ID between", value1, value2, "othId");
            return (Criteria) this;
        }

        public Criteria andOthIdNotBetween(String value1, String value2) {
            addCriterion("OTH_ID not between", value1, value2, "othId");
            return (Criteria) this;
        }

        public Criteria andOthNoIsNull() {
            addCriterion("OTH_NO is null");
            return (Criteria) this;
        }

        public Criteria andOthNoIsNotNull() {
            addCriterion("OTH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOthNoEqualTo(String value) {
            addCriterion("OTH_NO =", value, "othNo");
            return (Criteria) this;
        }

        public Criteria andOthNoNotEqualTo(String value) {
            addCriterion("OTH_NO <>", value, "othNo");
            return (Criteria) this;
        }

        public Criteria andOthNoGreaterThan(String value) {
            addCriterion("OTH_NO >", value, "othNo");
            return (Criteria) this;
        }

        public Criteria andOthNoGreaterThanOrEqualTo(String value) {
            addCriterion("OTH_NO >=", value, "othNo");
            return (Criteria) this;
        }

        public Criteria andOthNoLessThan(String value) {
            addCriterion("OTH_NO <", value, "othNo");
            return (Criteria) this;
        }

        public Criteria andOthNoLessThanOrEqualTo(String value) {
            addCriterion("OTH_NO <=", value, "othNo");
            return (Criteria) this;
        }

        public Criteria andOthNoLike(String value) {
            addCriterion("OTH_NO like", value, "othNo");
            return (Criteria) this;
        }

        public Criteria andOthNoNotLike(String value) {
            addCriterion("OTH_NO not like", value, "othNo");
            return (Criteria) this;
        }

        public Criteria andOthNoIn(List<String> values) {
            addCriterion("OTH_NO in", values, "othNo");
            return (Criteria) this;
        }

        public Criteria andOthNoNotIn(List<String> values) {
            addCriterion("OTH_NO not in", values, "othNo");
            return (Criteria) this;
        }

        public Criteria andOthNoBetween(String value1, String value2) {
            addCriterion("OTH_NO between", value1, value2, "othNo");
            return (Criteria) this;
        }

        public Criteria andOthNoNotBetween(String value1, String value2) {
            addCriterion("OTH_NO not between", value1, value2, "othNo");
            return (Criteria) this;
        }

        public Criteria andIsvirIsNull() {
            addCriterion("ISVIR is null");
            return (Criteria) this;
        }

        public Criteria andIsvirIsNotNull() {
            addCriterion("ISVIR is not null");
            return (Criteria) this;
        }

        public Criteria andIsvirEqualTo(String value) {
            addCriterion("ISVIR =", value, "isvir");
            return (Criteria) this;
        }

        public Criteria andIsvirNotEqualTo(String value) {
            addCriterion("ISVIR <>", value, "isvir");
            return (Criteria) this;
        }

        public Criteria andIsvirGreaterThan(String value) {
            addCriterion("ISVIR >", value, "isvir");
            return (Criteria) this;
        }

        public Criteria andIsvirGreaterThanOrEqualTo(String value) {
            addCriterion("ISVIR >=", value, "isvir");
            return (Criteria) this;
        }

        public Criteria andIsvirLessThan(String value) {
            addCriterion("ISVIR <", value, "isvir");
            return (Criteria) this;
        }

        public Criteria andIsvirLessThanOrEqualTo(String value) {
            addCriterion("ISVIR <=", value, "isvir");
            return (Criteria) this;
        }

        public Criteria andIsvirLike(String value) {
            addCriterion("ISVIR like", value, "isvir");
            return (Criteria) this;
        }

        public Criteria andIsvirNotLike(String value) {
            addCriterion("ISVIR not like", value, "isvir");
            return (Criteria) this;
        }

        public Criteria andIsvirIn(List<String> values) {
            addCriterion("ISVIR in", values, "isvir");
            return (Criteria) this;
        }

        public Criteria andIsvirNotIn(List<String> values) {
            addCriterion("ISVIR not in", values, "isvir");
            return (Criteria) this;
        }

        public Criteria andIsvirBetween(String value1, String value2) {
            addCriterion("ISVIR between", value1, value2, "isvir");
            return (Criteria) this;
        }

        public Criteria andIsvirNotBetween(String value1, String value2) {
            addCriterion("ISVIR not between", value1, value2, "isvir");
            return (Criteria) this;
        }

        public Criteria andJhIdIsNull() {
            addCriterion("JH_ID is null");
            return (Criteria) this;
        }

        public Criteria andJhIdIsNotNull() {
            addCriterion("JH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJhIdEqualTo(String value) {
            addCriterion("JH_ID =", value, "jhId");
            return (Criteria) this;
        }

        public Criteria andJhIdNotEqualTo(String value) {
            addCriterion("JH_ID <>", value, "jhId");
            return (Criteria) this;
        }

        public Criteria andJhIdGreaterThan(String value) {
            addCriterion("JH_ID >", value, "jhId");
            return (Criteria) this;
        }

        public Criteria andJhIdGreaterThanOrEqualTo(String value) {
            addCriterion("JH_ID >=", value, "jhId");
            return (Criteria) this;
        }

        public Criteria andJhIdLessThan(String value) {
            addCriterion("JH_ID <", value, "jhId");
            return (Criteria) this;
        }

        public Criteria andJhIdLessThanOrEqualTo(String value) {
            addCriterion("JH_ID <=", value, "jhId");
            return (Criteria) this;
        }

        public Criteria andJhIdLike(String value) {
            addCriterion("JH_ID like", value, "jhId");
            return (Criteria) this;
        }

        public Criteria andJhIdNotLike(String value) {
            addCriterion("JH_ID not like", value, "jhId");
            return (Criteria) this;
        }

        public Criteria andJhIdIn(List<String> values) {
            addCriterion("JH_ID in", values, "jhId");
            return (Criteria) this;
        }

        public Criteria andJhIdNotIn(List<String> values) {
            addCriterion("JH_ID not in", values, "jhId");
            return (Criteria) this;
        }

        public Criteria andJhIdBetween(String value1, String value2) {
            addCriterion("JH_ID between", value1, value2, "jhId");
            return (Criteria) this;
        }

        public Criteria andJhIdNotBetween(String value1, String value2) {
            addCriterion("JH_ID not between", value1, value2, "jhId");
            return (Criteria) this;
        }

        public Criteria andQtyFhIsNull() {
            addCriterion("QTY_FH is null");
            return (Criteria) this;
        }

        public Criteria andQtyFhIsNotNull() {
            addCriterion("QTY_FH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyFhEqualTo(BigDecimal value) {
            addCriterion("QTY_FH =", value, "qtyFh");
            return (Criteria) this;
        }

        public Criteria andQtyFhNotEqualTo(BigDecimal value) {
            addCriterion("QTY_FH <>", value, "qtyFh");
            return (Criteria) this;
        }

        public Criteria andQtyFhGreaterThan(BigDecimal value) {
            addCriterion("QTY_FH >", value, "qtyFh");
            return (Criteria) this;
        }

        public Criteria andQtyFhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FH >=", value, "qtyFh");
            return (Criteria) this;
        }

        public Criteria andQtyFhLessThan(BigDecimal value) {
            addCriterion("QTY_FH <", value, "qtyFh");
            return (Criteria) this;
        }

        public Criteria andQtyFhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FH <=", value, "qtyFh");
            return (Criteria) this;
        }

        public Criteria andQtyFhIn(List<BigDecimal> values) {
            addCriterion("QTY_FH in", values, "qtyFh");
            return (Criteria) this;
        }

        public Criteria andQtyFhNotIn(List<BigDecimal> values) {
            addCriterion("QTY_FH not in", values, "qtyFh");
            return (Criteria) this;
        }

        public Criteria andQtyFhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FH between", value1, value2, "qtyFh");
            return (Criteria) this;
        }

        public Criteria andQtyFhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FH not between", value1, value2, "qtyFh");
            return (Criteria) this;
        }

        public Criteria andQtyFhUnshIsNull() {
            addCriterion("QTY_FH_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyFhUnshIsNotNull() {
            addCriterion("QTY_FH_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyFhUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_FH_UNSH =", value, "qtyFhUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFhUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_FH_UNSH <>", value, "qtyFhUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFhUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_FH_UNSH >", value, "qtyFhUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFhUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FH_UNSH >=", value, "qtyFhUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFhUnshLessThan(BigDecimal value) {
            addCriterion("QTY_FH_UNSH <", value, "qtyFhUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFhUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FH_UNSH <=", value, "qtyFhUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFhUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_FH_UNSH in", values, "qtyFhUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFhUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_FH_UNSH not in", values, "qtyFhUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFhUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FH_UNSH between", value1, value2, "qtyFhUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFhUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FH_UNSH not between", value1, value2, "qtyFhUnsh");
            return (Criteria) this;
        }

        public Criteria andPrdNoSoResIsNull() {
            addCriterion("PRD_NO_SO_RES is null");
            return (Criteria) this;
        }

        public Criteria andPrdNoSoResIsNotNull() {
            addCriterion("PRD_NO_SO_RES is not null");
            return (Criteria) this;
        }

        public Criteria andPrdNoSoResEqualTo(String value) {
            addCriterion("PRD_NO_SO_RES =", value, "prdNoSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNoSoResNotEqualTo(String value) {
            addCriterion("PRD_NO_SO_RES <>", value, "prdNoSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNoSoResGreaterThan(String value) {
            addCriterion("PRD_NO_SO_RES >", value, "prdNoSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNoSoResGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_NO_SO_RES >=", value, "prdNoSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNoSoResLessThan(String value) {
            addCriterion("PRD_NO_SO_RES <", value, "prdNoSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNoSoResLessThanOrEqualTo(String value) {
            addCriterion("PRD_NO_SO_RES <=", value, "prdNoSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNoSoResLike(String value) {
            addCriterion("PRD_NO_SO_RES like", value, "prdNoSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNoSoResNotLike(String value) {
            addCriterion("PRD_NO_SO_RES not like", value, "prdNoSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNoSoResIn(List<String> values) {
            addCriterion("PRD_NO_SO_RES in", values, "prdNoSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNoSoResNotIn(List<String> values) {
            addCriterion("PRD_NO_SO_RES not in", values, "prdNoSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNoSoResBetween(String value1, String value2) {
            addCriterion("PRD_NO_SO_RES between", value1, value2, "prdNoSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNoSoResNotBetween(String value1, String value2) {
            addCriterion("PRD_NO_SO_RES not between", value1, value2, "prdNoSoRes");
            return (Criteria) this;
        }

        public Criteria andFhNoIsNull() {
            addCriterion("FH_NO is null");
            return (Criteria) this;
        }

        public Criteria andFhNoIsNotNull() {
            addCriterion("FH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andFhNoEqualTo(String value) {
            addCriterion("FH_NO =", value, "fhNo");
            return (Criteria) this;
        }

        public Criteria andFhNoNotEqualTo(String value) {
            addCriterion("FH_NO <>", value, "fhNo");
            return (Criteria) this;
        }

        public Criteria andFhNoGreaterThan(String value) {
            addCriterion("FH_NO >", value, "fhNo");
            return (Criteria) this;
        }

        public Criteria andFhNoGreaterThanOrEqualTo(String value) {
            addCriterion("FH_NO >=", value, "fhNo");
            return (Criteria) this;
        }

        public Criteria andFhNoLessThan(String value) {
            addCriterion("FH_NO <", value, "fhNo");
            return (Criteria) this;
        }

        public Criteria andFhNoLessThanOrEqualTo(String value) {
            addCriterion("FH_NO <=", value, "fhNo");
            return (Criteria) this;
        }

        public Criteria andFhNoLike(String value) {
            addCriterion("FH_NO like", value, "fhNo");
            return (Criteria) this;
        }

        public Criteria andFhNoNotLike(String value) {
            addCriterion("FH_NO not like", value, "fhNo");
            return (Criteria) this;
        }

        public Criteria andFhNoIn(List<String> values) {
            addCriterion("FH_NO in", values, "fhNo");
            return (Criteria) this;
        }

        public Criteria andFhNoNotIn(List<String> values) {
            addCriterion("FH_NO not in", values, "fhNo");
            return (Criteria) this;
        }

        public Criteria andFhNoBetween(String value1, String value2) {
            addCriterion("FH_NO between", value1, value2, "fhNo");
            return (Criteria) this;
        }

        public Criteria andFhNoNotBetween(String value1, String value2) {
            addCriterion("FH_NO not between", value1, value2, "fhNo");
            return (Criteria) this;
        }

        public Criteria andFhDdIsNull() {
            addCriterion("FH_DD is null");
            return (Criteria) this;
        }

        public Criteria andFhDdIsNotNull() {
            addCriterion("FH_DD is not null");
            return (Criteria) this;
        }

        public Criteria andFhDdEqualTo(Date value) {
            addCriterion("FH_DD =", value, "fhDd");
            return (Criteria) this;
        }

        public Criteria andFhDdNotEqualTo(Date value) {
            addCriterion("FH_DD <>", value, "fhDd");
            return (Criteria) this;
        }

        public Criteria andFhDdGreaterThan(Date value) {
            addCriterion("FH_DD >", value, "fhDd");
            return (Criteria) this;
        }

        public Criteria andFhDdGreaterThanOrEqualTo(Date value) {
            addCriterion("FH_DD >=", value, "fhDd");
            return (Criteria) this;
        }

        public Criteria andFhDdLessThan(Date value) {
            addCriterion("FH_DD <", value, "fhDd");
            return (Criteria) this;
        }

        public Criteria andFhDdLessThanOrEqualTo(Date value) {
            addCriterion("FH_DD <=", value, "fhDd");
            return (Criteria) this;
        }

        public Criteria andFhDdIn(List<Date> values) {
            addCriterion("FH_DD in", values, "fhDd");
            return (Criteria) this;
        }

        public Criteria andFhDdNotIn(List<Date> values) {
            addCriterion("FH_DD not in", values, "fhDd");
            return (Criteria) this;
        }

        public Criteria andFhDdBetween(Date value1, Date value2) {
            addCriterion("FH_DD between", value1, value2, "fhDd");
            return (Criteria) this;
        }

        public Criteria andFhDdNotBetween(Date value1, Date value2) {
            addCriterion("FH_DD not between", value1, value2, "fhDd");
            return (Criteria) this;
        }

        public Criteria andQtyIcIsNull() {
            addCriterion("QTY_IC is null");
            return (Criteria) this;
        }

        public Criteria andQtyIcIsNotNull() {
            addCriterion("QTY_IC is not null");
            return (Criteria) this;
        }

        public Criteria andQtyIcEqualTo(BigDecimal value) {
            addCriterion("QTY_IC =", value, "qtyIc");
            return (Criteria) this;
        }

        public Criteria andQtyIcNotEqualTo(BigDecimal value) {
            addCriterion("QTY_IC <>", value, "qtyIc");
            return (Criteria) this;
        }

        public Criteria andQtyIcGreaterThan(BigDecimal value) {
            addCriterion("QTY_IC >", value, "qtyIc");
            return (Criteria) this;
        }

        public Criteria andQtyIcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_IC >=", value, "qtyIc");
            return (Criteria) this;
        }

        public Criteria andQtyIcLessThan(BigDecimal value) {
            addCriterion("QTY_IC <", value, "qtyIc");
            return (Criteria) this;
        }

        public Criteria andQtyIcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_IC <=", value, "qtyIc");
            return (Criteria) this;
        }

        public Criteria andQtyIcIn(List<BigDecimal> values) {
            addCriterion("QTY_IC in", values, "qtyIc");
            return (Criteria) this;
        }

        public Criteria andQtyIcNotIn(List<BigDecimal> values) {
            addCriterion("QTY_IC not in", values, "qtyIc");
            return (Criteria) this;
        }

        public Criteria andQtyIcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_IC between", value1, value2, "qtyIc");
            return (Criteria) this;
        }

        public Criteria andQtyIcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_IC not between", value1, value2, "qtyIc");
            return (Criteria) this;
        }

        public Criteria andQtyIcUnshIsNull() {
            addCriterion("QTY_IC_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyIcUnshIsNotNull() {
            addCriterion("QTY_IC_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyIcUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_IC_UNSH =", value, "qtyIcUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIcUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_IC_UNSH <>", value, "qtyIcUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIcUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_IC_UNSH >", value, "qtyIcUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIcUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_IC_UNSH >=", value, "qtyIcUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIcUnshLessThan(BigDecimal value) {
            addCriterion("QTY_IC_UNSH <", value, "qtyIcUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIcUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_IC_UNSH <=", value, "qtyIcUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIcUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_IC_UNSH in", values, "qtyIcUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIcUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_IC_UNSH not in", values, "qtyIcUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIcUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_IC_UNSH between", value1, value2, "qtyIcUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIcUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_IC_UNSH not between", value1, value2, "qtyIcUnsh");
            return (Criteria) this;
        }

        public Criteria andBoxItmIsNull() {
            addCriterion("BOX_ITM is null");
            return (Criteria) this;
        }

        public Criteria andBoxItmIsNotNull() {
            addCriterion("BOX_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andBoxItmEqualTo(Integer value) {
            addCriterion("BOX_ITM =", value, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmNotEqualTo(Integer value) {
            addCriterion("BOX_ITM <>", value, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmGreaterThan(Integer value) {
            addCriterion("BOX_ITM >", value, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("BOX_ITM >=", value, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmLessThan(Integer value) {
            addCriterion("BOX_ITM <", value, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmLessThanOrEqualTo(Integer value) {
            addCriterion("BOX_ITM <=", value, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmIn(List<Integer> values) {
            addCriterion("BOX_ITM in", values, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmNotIn(List<Integer> values) {
            addCriterion("BOX_ITM not in", values, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmBetween(Integer value1, Integer value2) {
            addCriterion("BOX_ITM between", value1, value2, "boxItm");
            return (Criteria) this;
        }

        public Criteria andBoxItmNotBetween(Integer value1, Integer value2) {
            addCriterion("BOX_ITM not between", value1, value2, "boxItm");
            return (Criteria) this;
        }

        public Criteria andQtyArkIsNull() {
            addCriterion("QTY_ARK is null");
            return (Criteria) this;
        }

        public Criteria andQtyArkIsNotNull() {
            addCriterion("QTY_ARK is not null");
            return (Criteria) this;
        }

        public Criteria andQtyArkEqualTo(BigDecimal value) {
            addCriterion("QTY_ARK =", value, "qtyArk");
            return (Criteria) this;
        }

        public Criteria andQtyArkNotEqualTo(BigDecimal value) {
            addCriterion("QTY_ARK <>", value, "qtyArk");
            return (Criteria) this;
        }

        public Criteria andQtyArkGreaterThan(BigDecimal value) {
            addCriterion("QTY_ARK >", value, "qtyArk");
            return (Criteria) this;
        }

        public Criteria andQtyArkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_ARK >=", value, "qtyArk");
            return (Criteria) this;
        }

        public Criteria andQtyArkLessThan(BigDecimal value) {
            addCriterion("QTY_ARK <", value, "qtyArk");
            return (Criteria) this;
        }

        public Criteria andQtyArkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_ARK <=", value, "qtyArk");
            return (Criteria) this;
        }

        public Criteria andQtyArkIn(List<BigDecimal> values) {
            addCriterion("QTY_ARK in", values, "qtyArk");
            return (Criteria) this;
        }

        public Criteria andQtyArkNotIn(List<BigDecimal> values) {
            addCriterion("QTY_ARK not in", values, "qtyArk");
            return (Criteria) this;
        }

        public Criteria andQtyArkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_ARK between", value1, value2, "qtyArk");
            return (Criteria) this;
        }

        public Criteria andQtyArkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_ARK not between", value1, value2, "qtyArk");
            return (Criteria) this;
        }

        public Criteria andQtyPsArkIsNull() {
            addCriterion("QTY_PS_ARK is null");
            return (Criteria) this;
        }

        public Criteria andQtyPsArkIsNotNull() {
            addCriterion("QTY_PS_ARK is not null");
            return (Criteria) this;
        }

        public Criteria andQtyPsArkEqualTo(BigDecimal value) {
            addCriterion("QTY_PS_ARK =", value, "qtyPsArk");
            return (Criteria) this;
        }

        public Criteria andQtyPsArkNotEqualTo(BigDecimal value) {
            addCriterion("QTY_PS_ARK <>", value, "qtyPsArk");
            return (Criteria) this;
        }

        public Criteria andQtyPsArkGreaterThan(BigDecimal value) {
            addCriterion("QTY_PS_ARK >", value, "qtyPsArk");
            return (Criteria) this;
        }

        public Criteria andQtyPsArkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_PS_ARK >=", value, "qtyPsArk");
            return (Criteria) this;
        }

        public Criteria andQtyPsArkLessThan(BigDecimal value) {
            addCriterion("QTY_PS_ARK <", value, "qtyPsArk");
            return (Criteria) this;
        }

        public Criteria andQtyPsArkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_PS_ARK <=", value, "qtyPsArk");
            return (Criteria) this;
        }

        public Criteria andQtyPsArkIn(List<BigDecimal> values) {
            addCriterion("QTY_PS_ARK in", values, "qtyPsArk");
            return (Criteria) this;
        }

        public Criteria andQtyPsArkNotIn(List<BigDecimal> values) {
            addCriterion("QTY_PS_ARK not in", values, "qtyPsArk");
            return (Criteria) this;
        }

        public Criteria andQtyPsArkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_PS_ARK between", value1, value2, "qtyPsArk");
            return (Criteria) this;
        }

        public Criteria andQtyPsArkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_PS_ARK not between", value1, value2, "qtyPsArk");
            return (Criteria) this;
        }

        public Criteria andQtyPreArkIsNull() {
            addCriterion("QTY_PRE_ARK is null");
            return (Criteria) this;
        }

        public Criteria andQtyPreArkIsNotNull() {
            addCriterion("QTY_PRE_ARK is not null");
            return (Criteria) this;
        }

        public Criteria andQtyPreArkEqualTo(BigDecimal value) {
            addCriterion("QTY_PRE_ARK =", value, "qtyPreArk");
            return (Criteria) this;
        }

        public Criteria andQtyPreArkNotEqualTo(BigDecimal value) {
            addCriterion("QTY_PRE_ARK <>", value, "qtyPreArk");
            return (Criteria) this;
        }

        public Criteria andQtyPreArkGreaterThan(BigDecimal value) {
            addCriterion("QTY_PRE_ARK >", value, "qtyPreArk");
            return (Criteria) this;
        }

        public Criteria andQtyPreArkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_PRE_ARK >=", value, "qtyPreArk");
            return (Criteria) this;
        }

        public Criteria andQtyPreArkLessThan(BigDecimal value) {
            addCriterion("QTY_PRE_ARK <", value, "qtyPreArk");
            return (Criteria) this;
        }

        public Criteria andQtyPreArkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_PRE_ARK <=", value, "qtyPreArk");
            return (Criteria) this;
        }

        public Criteria andQtyPreArkIn(List<BigDecimal> values) {
            addCriterion("QTY_PRE_ARK in", values, "qtyPreArk");
            return (Criteria) this;
        }

        public Criteria andQtyPreArkNotIn(List<BigDecimal> values) {
            addCriterion("QTY_PRE_ARK not in", values, "qtyPreArk");
            return (Criteria) this;
        }

        public Criteria andQtyPreArkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_PRE_ARK between", value1, value2, "qtyPreArk");
            return (Criteria) this;
        }

        public Criteria andQtyPreArkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_PRE_ARK not between", value1, value2, "qtyPreArk");
            return (Criteria) this;
        }

        public Criteria andQtyCkArkIsNull() {
            addCriterion("QTY_CK_ARK is null");
            return (Criteria) this;
        }

        public Criteria andQtyCkArkIsNotNull() {
            addCriterion("QTY_CK_ARK is not null");
            return (Criteria) this;
        }

        public Criteria andQtyCkArkEqualTo(BigDecimal value) {
            addCriterion("QTY_CK_ARK =", value, "qtyCkArk");
            return (Criteria) this;
        }

        public Criteria andQtyCkArkNotEqualTo(BigDecimal value) {
            addCriterion("QTY_CK_ARK <>", value, "qtyCkArk");
            return (Criteria) this;
        }

        public Criteria andQtyCkArkGreaterThan(BigDecimal value) {
            addCriterion("QTY_CK_ARK >", value, "qtyCkArk");
            return (Criteria) this;
        }

        public Criteria andQtyCkArkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CK_ARK >=", value, "qtyCkArk");
            return (Criteria) this;
        }

        public Criteria andQtyCkArkLessThan(BigDecimal value) {
            addCriterion("QTY_CK_ARK <", value, "qtyCkArk");
            return (Criteria) this;
        }

        public Criteria andQtyCkArkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CK_ARK <=", value, "qtyCkArk");
            return (Criteria) this;
        }

        public Criteria andQtyCkArkIn(List<BigDecimal> values) {
            addCriterion("QTY_CK_ARK in", values, "qtyCkArk");
            return (Criteria) this;
        }

        public Criteria andQtyCkArkNotIn(List<BigDecimal> values) {
            addCriterion("QTY_CK_ARK not in", values, "qtyCkArk");
            return (Criteria) this;
        }

        public Criteria andQtyCkArkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CK_ARK between", value1, value2, "qtyCkArk");
            return (Criteria) this;
        }

        public Criteria andQtyCkArkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CK_ARK not between", value1, value2, "qtyCkArk");
            return (Criteria) this;
        }

        public Criteria andMaiNoIsNull() {
            addCriterion("MAI_NO is null");
            return (Criteria) this;
        }

        public Criteria andMaiNoIsNotNull() {
            addCriterion("MAI_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMaiNoEqualTo(String value) {
            addCriterion("MAI_NO =", value, "maiNo");
            return (Criteria) this;
        }

        public Criteria andMaiNoNotEqualTo(String value) {
            addCriterion("MAI_NO <>", value, "maiNo");
            return (Criteria) this;
        }

        public Criteria andMaiNoGreaterThan(String value) {
            addCriterion("MAI_NO >", value, "maiNo");
            return (Criteria) this;
        }

        public Criteria andMaiNoGreaterThanOrEqualTo(String value) {
            addCriterion("MAI_NO >=", value, "maiNo");
            return (Criteria) this;
        }

        public Criteria andMaiNoLessThan(String value) {
            addCriterion("MAI_NO <", value, "maiNo");
            return (Criteria) this;
        }

        public Criteria andMaiNoLessThanOrEqualTo(String value) {
            addCriterion("MAI_NO <=", value, "maiNo");
            return (Criteria) this;
        }

        public Criteria andMaiNoLike(String value) {
            addCriterion("MAI_NO like", value, "maiNo");
            return (Criteria) this;
        }

        public Criteria andMaiNoNotLike(String value) {
            addCriterion("MAI_NO not like", value, "maiNo");
            return (Criteria) this;
        }

        public Criteria andMaiNoIn(List<String> values) {
            addCriterion("MAI_NO in", values, "maiNo");
            return (Criteria) this;
        }

        public Criteria andMaiNoNotIn(List<String> values) {
            addCriterion("MAI_NO not in", values, "maiNo");
            return (Criteria) this;
        }

        public Criteria andMaiNoBetween(String value1, String value2) {
            addCriterion("MAI_NO between", value1, value2, "maiNo");
            return (Criteria) this;
        }

        public Criteria andMaiNoNotBetween(String value1, String value2) {
            addCriterion("MAI_NO not between", value1, value2, "maiNo");
            return (Criteria) this;
        }

        public Criteria andScmUsrIsNull() {
            addCriterion("SCM_USR is null");
            return (Criteria) this;
        }

        public Criteria andScmUsrIsNotNull() {
            addCriterion("SCM_USR is not null");
            return (Criteria) this;
        }

        public Criteria andScmUsrEqualTo(String value) {
            addCriterion("SCM_USR =", value, "scmUsr");
            return (Criteria) this;
        }

        public Criteria andScmUsrNotEqualTo(String value) {
            addCriterion("SCM_USR <>", value, "scmUsr");
            return (Criteria) this;
        }

        public Criteria andScmUsrGreaterThan(String value) {
            addCriterion("SCM_USR >", value, "scmUsr");
            return (Criteria) this;
        }

        public Criteria andScmUsrGreaterThanOrEqualTo(String value) {
            addCriterion("SCM_USR >=", value, "scmUsr");
            return (Criteria) this;
        }

        public Criteria andScmUsrLessThan(String value) {
            addCriterion("SCM_USR <", value, "scmUsr");
            return (Criteria) this;
        }

        public Criteria andScmUsrLessThanOrEqualTo(String value) {
            addCriterion("SCM_USR <=", value, "scmUsr");
            return (Criteria) this;
        }

        public Criteria andScmUsrLike(String value) {
            addCriterion("SCM_USR like", value, "scmUsr");
            return (Criteria) this;
        }

        public Criteria andScmUsrNotLike(String value) {
            addCriterion("SCM_USR not like", value, "scmUsr");
            return (Criteria) this;
        }

        public Criteria andScmUsrIn(List<String> values) {
            addCriterion("SCM_USR in", values, "scmUsr");
            return (Criteria) this;
        }

        public Criteria andScmUsrNotIn(List<String> values) {
            addCriterion("SCM_USR not in", values, "scmUsr");
            return (Criteria) this;
        }

        public Criteria andScmUsrBetween(String value1, String value2) {
            addCriterion("SCM_USR between", value1, value2, "scmUsr");
            return (Criteria) this;
        }

        public Criteria andScmUsrNotBetween(String value1, String value2) {
            addCriterion("SCM_USR not between", value1, value2, "scmUsr");
            return (Criteria) this;
        }

        public Criteria andScmDdIsNull() {
            addCriterion("SCM_DD is null");
            return (Criteria) this;
        }

        public Criteria andScmDdIsNotNull() {
            addCriterion("SCM_DD is not null");
            return (Criteria) this;
        }

        public Criteria andScmDdEqualTo(Date value) {
            addCriterion("SCM_DD =", value, "scmDd");
            return (Criteria) this;
        }

        public Criteria andScmDdNotEqualTo(Date value) {
            addCriterion("SCM_DD <>", value, "scmDd");
            return (Criteria) this;
        }

        public Criteria andScmDdGreaterThan(Date value) {
            addCriterion("SCM_DD >", value, "scmDd");
            return (Criteria) this;
        }

        public Criteria andScmDdGreaterThanOrEqualTo(Date value) {
            addCriterion("SCM_DD >=", value, "scmDd");
            return (Criteria) this;
        }

        public Criteria andScmDdLessThan(Date value) {
            addCriterion("SCM_DD <", value, "scmDd");
            return (Criteria) this;
        }

        public Criteria andScmDdLessThanOrEqualTo(Date value) {
            addCriterion("SCM_DD <=", value, "scmDd");
            return (Criteria) this;
        }

        public Criteria andScmDdIn(List<Date> values) {
            addCriterion("SCM_DD in", values, "scmDd");
            return (Criteria) this;
        }

        public Criteria andScmDdNotIn(List<Date> values) {
            addCriterion("SCM_DD not in", values, "scmDd");
            return (Criteria) this;
        }

        public Criteria andScmDdBetween(Date value1, Date value2) {
            addCriterion("SCM_DD between", value1, value2, "scmDd");
            return (Criteria) this;
        }

        public Criteria andScmDdNotBetween(Date value1, Date value2) {
            addCriterion("SCM_DD not between", value1, value2, "scmDd");
            return (Criteria) this;
        }

        public Criteria andQtySqIsNull() {
            addCriterion("QTY_SQ is null");
            return (Criteria) this;
        }

        public Criteria andQtySqIsNotNull() {
            addCriterion("QTY_SQ is not null");
            return (Criteria) this;
        }

        public Criteria andQtySqEqualTo(BigDecimal value) {
            addCriterion("QTY_SQ =", value, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqNotEqualTo(BigDecimal value) {
            addCriterion("QTY_SQ <>", value, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqGreaterThan(BigDecimal value) {
            addCriterion("QTY_SQ >", value, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SQ >=", value, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqLessThan(BigDecimal value) {
            addCriterion("QTY_SQ <", value, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SQ <=", value, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqIn(List<BigDecimal> values) {
            addCriterion("QTY_SQ in", values, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqNotIn(List<BigDecimal> values) {
            addCriterion("QTY_SQ not in", values, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SQ between", value1, value2, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SQ not between", value1, value2, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqUnshIsNull() {
            addCriterion("QTY_SQ_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtySqUnshIsNotNull() {
            addCriterion("QTY_SQ_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtySqUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_SQ_UNSH =", value, "qtySqUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySqUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_SQ_UNSH <>", value, "qtySqUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySqUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_SQ_UNSH >", value, "qtySqUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySqUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SQ_UNSH >=", value, "qtySqUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySqUnshLessThan(BigDecimal value) {
            addCriterion("QTY_SQ_UNSH <", value, "qtySqUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySqUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SQ_UNSH <=", value, "qtySqUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySqUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_SQ_UNSH in", values, "qtySqUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySqUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_SQ_UNSH not in", values, "qtySqUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySqUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SQ_UNSH between", value1, value2, "qtySqUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySqUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SQ_UNSH not between", value1, value2, "qtySqUnsh");
            return (Criteria) this;
        }

        public Criteria andUpPoIsNull() {
            addCriterion("UP_PO is null");
            return (Criteria) this;
        }

        public Criteria andUpPoIsNotNull() {
            addCriterion("UP_PO is not null");
            return (Criteria) this;
        }

        public Criteria andUpPoEqualTo(BigDecimal value) {
            addCriterion("UP_PO =", value, "upPo");
            return (Criteria) this;
        }

        public Criteria andUpPoNotEqualTo(BigDecimal value) {
            addCriterion("UP_PO <>", value, "upPo");
            return (Criteria) this;
        }

        public Criteria andUpPoGreaterThan(BigDecimal value) {
            addCriterion("UP_PO >", value, "upPo");
            return (Criteria) this;
        }

        public Criteria andUpPoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_PO >=", value, "upPo");
            return (Criteria) this;
        }

        public Criteria andUpPoLessThan(BigDecimal value) {
            addCriterion("UP_PO <", value, "upPo");
            return (Criteria) this;
        }

        public Criteria andUpPoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_PO <=", value, "upPo");
            return (Criteria) this;
        }

        public Criteria andUpPoIn(List<BigDecimal> values) {
            addCriterion("UP_PO in", values, "upPo");
            return (Criteria) this;
        }

        public Criteria andUpPoNotIn(List<BigDecimal> values) {
            addCriterion("UP_PO not in", values, "upPo");
            return (Criteria) this;
        }

        public Criteria andUpPoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_PO between", value1, value2, "upPo");
            return (Criteria) this;
        }

        public Criteria andUpPoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_PO not between", value1, value2, "upPo");
            return (Criteria) this;
        }

        public Criteria andSqIdIsNull() {
            addCriterion("SQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andSqIdIsNotNull() {
            addCriterion("SQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSqIdEqualTo(String value) {
            addCriterion("SQ_ID =", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdNotEqualTo(String value) {
            addCriterion("SQ_ID <>", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdGreaterThan(String value) {
            addCriterion("SQ_ID >", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdGreaterThanOrEqualTo(String value) {
            addCriterion("SQ_ID >=", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdLessThan(String value) {
            addCriterion("SQ_ID <", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdLessThanOrEqualTo(String value) {
            addCriterion("SQ_ID <=", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdLike(String value) {
            addCriterion("SQ_ID like", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdNotLike(String value) {
            addCriterion("SQ_ID not like", value, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdIn(List<String> values) {
            addCriterion("SQ_ID in", values, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdNotIn(List<String> values) {
            addCriterion("SQ_ID not in", values, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdBetween(String value1, String value2) {
            addCriterion("SQ_ID between", value1, value2, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqIdNotBetween(String value1, String value2) {
            addCriterion("SQ_ID not between", value1, value2, "sqId");
            return (Criteria) this;
        }

        public Criteria andSqNoIsNull() {
            addCriterion("SQ_NO is null");
            return (Criteria) this;
        }

        public Criteria andSqNoIsNotNull() {
            addCriterion("SQ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSqNoEqualTo(String value) {
            addCriterion("SQ_NO =", value, "sqNo");
            return (Criteria) this;
        }

        public Criteria andSqNoNotEqualTo(String value) {
            addCriterion("SQ_NO <>", value, "sqNo");
            return (Criteria) this;
        }

        public Criteria andSqNoGreaterThan(String value) {
            addCriterion("SQ_NO >", value, "sqNo");
            return (Criteria) this;
        }

        public Criteria andSqNoGreaterThanOrEqualTo(String value) {
            addCriterion("SQ_NO >=", value, "sqNo");
            return (Criteria) this;
        }

        public Criteria andSqNoLessThan(String value) {
            addCriterion("SQ_NO <", value, "sqNo");
            return (Criteria) this;
        }

        public Criteria andSqNoLessThanOrEqualTo(String value) {
            addCriterion("SQ_NO <=", value, "sqNo");
            return (Criteria) this;
        }

        public Criteria andSqNoLike(String value) {
            addCriterion("SQ_NO like", value, "sqNo");
            return (Criteria) this;
        }

        public Criteria andSqNoNotLike(String value) {
            addCriterion("SQ_NO not like", value, "sqNo");
            return (Criteria) this;
        }

        public Criteria andSqNoIn(List<String> values) {
            addCriterion("SQ_NO in", values, "sqNo");
            return (Criteria) this;
        }

        public Criteria andSqNoNotIn(List<String> values) {
            addCriterion("SQ_NO not in", values, "sqNo");
            return (Criteria) this;
        }

        public Criteria andSqNoBetween(String value1, String value2) {
            addCriterion("SQ_NO between", value1, value2, "sqNo");
            return (Criteria) this;
        }

        public Criteria andSqNoNotBetween(String value1, String value2) {
            addCriterion("SQ_NO not between", value1, value2, "sqNo");
            return (Criteria) this;
        }

        public Criteria andSqItmIsNull() {
            addCriterion("SQ_ITM is null");
            return (Criteria) this;
        }

        public Criteria andSqItmIsNotNull() {
            addCriterion("SQ_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andSqItmEqualTo(Integer value) {
            addCriterion("SQ_ITM =", value, "sqItm");
            return (Criteria) this;
        }

        public Criteria andSqItmNotEqualTo(Integer value) {
            addCriterion("SQ_ITM <>", value, "sqItm");
            return (Criteria) this;
        }

        public Criteria andSqItmGreaterThan(Integer value) {
            addCriterion("SQ_ITM >", value, "sqItm");
            return (Criteria) this;
        }

        public Criteria andSqItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("SQ_ITM >=", value, "sqItm");
            return (Criteria) this;
        }

        public Criteria andSqItmLessThan(Integer value) {
            addCriterion("SQ_ITM <", value, "sqItm");
            return (Criteria) this;
        }

        public Criteria andSqItmLessThanOrEqualTo(Integer value) {
            addCriterion("SQ_ITM <=", value, "sqItm");
            return (Criteria) this;
        }

        public Criteria andSqItmIn(List<Integer> values) {
            addCriterion("SQ_ITM in", values, "sqItm");
            return (Criteria) this;
        }

        public Criteria andSqItmNotIn(List<Integer> values) {
            addCriterion("SQ_ITM not in", values, "sqItm");
            return (Criteria) this;
        }

        public Criteria andSqItmBetween(Integer value1, Integer value2) {
            addCriterion("SQ_ITM between", value1, value2, "sqItm");
            return (Criteria) this;
        }

        public Criteria andSqItmNotBetween(Integer value1, Integer value2) {
            addCriterion("SQ_ITM not between", value1, value2, "sqItm");
            return (Criteria) this;
        }

        public Criteria andQtyFrac1IsNull() {
            addCriterion("QTY_FRAC1 is null");
            return (Criteria) this;
        }

        public Criteria andQtyFrac1IsNotNull() {
            addCriterion("QTY_FRAC1 is not null");
            return (Criteria) this;
        }

        public Criteria andQtyFrac1EqualTo(BigDecimal value) {
            addCriterion("QTY_FRAC1 =", value, "qtyFrac1");
            return (Criteria) this;
        }

        public Criteria andQtyFrac1NotEqualTo(BigDecimal value) {
            addCriterion("QTY_FRAC1 <>", value, "qtyFrac1");
            return (Criteria) this;
        }

        public Criteria andQtyFrac1GreaterThan(BigDecimal value) {
            addCriterion("QTY_FRAC1 >", value, "qtyFrac1");
            return (Criteria) this;
        }

        public Criteria andQtyFrac1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FRAC1 >=", value, "qtyFrac1");
            return (Criteria) this;
        }

        public Criteria andQtyFrac1LessThan(BigDecimal value) {
            addCriterion("QTY_FRAC1 <", value, "qtyFrac1");
            return (Criteria) this;
        }

        public Criteria andQtyFrac1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FRAC1 <=", value, "qtyFrac1");
            return (Criteria) this;
        }

        public Criteria andQtyFrac1In(List<BigDecimal> values) {
            addCriterion("QTY_FRAC1 in", values, "qtyFrac1");
            return (Criteria) this;
        }

        public Criteria andQtyFrac1NotIn(List<BigDecimal> values) {
            addCriterion("QTY_FRAC1 not in", values, "qtyFrac1");
            return (Criteria) this;
        }

        public Criteria andQtyFrac1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FRAC1 between", value1, value2, "qtyFrac1");
            return (Criteria) this;
        }

        public Criteria andQtyFrac1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FRAC1 not between", value1, value2, "qtyFrac1");
            return (Criteria) this;
        }

        public Criteria andQtyFrac2IsNull() {
            addCriterion("QTY_FRAC2 is null");
            return (Criteria) this;
        }

        public Criteria andQtyFrac2IsNotNull() {
            addCriterion("QTY_FRAC2 is not null");
            return (Criteria) this;
        }

        public Criteria andQtyFrac2EqualTo(BigDecimal value) {
            addCriterion("QTY_FRAC2 =", value, "qtyFrac2");
            return (Criteria) this;
        }

        public Criteria andQtyFrac2NotEqualTo(BigDecimal value) {
            addCriterion("QTY_FRAC2 <>", value, "qtyFrac2");
            return (Criteria) this;
        }

        public Criteria andQtyFrac2GreaterThan(BigDecimal value) {
            addCriterion("QTY_FRAC2 >", value, "qtyFrac2");
            return (Criteria) this;
        }

        public Criteria andQtyFrac2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FRAC2 >=", value, "qtyFrac2");
            return (Criteria) this;
        }

        public Criteria andQtyFrac2LessThan(BigDecimal value) {
            addCriterion("QTY_FRAC2 <", value, "qtyFrac2");
            return (Criteria) this;
        }

        public Criteria andQtyFrac2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FRAC2 <=", value, "qtyFrac2");
            return (Criteria) this;
        }

        public Criteria andQtyFrac2In(List<BigDecimal> values) {
            addCriterion("QTY_FRAC2 in", values, "qtyFrac2");
            return (Criteria) this;
        }

        public Criteria andQtyFrac2NotIn(List<BigDecimal> values) {
            addCriterion("QTY_FRAC2 not in", values, "qtyFrac2");
            return (Criteria) this;
        }

        public Criteria andQtyFrac2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FRAC2 between", value1, value2, "qtyFrac2");
            return (Criteria) this;
        }

        public Criteria andQtyFrac2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FRAC2 not between", value1, value2, "qtyFrac2");
            return (Criteria) this;
        }

        public Criteria andQtyFrac3IsNull() {
            addCriterion("QTY_FRAC3 is null");
            return (Criteria) this;
        }

        public Criteria andQtyFrac3IsNotNull() {
            addCriterion("QTY_FRAC3 is not null");
            return (Criteria) this;
        }

        public Criteria andQtyFrac3EqualTo(BigDecimal value) {
            addCriterion("QTY_FRAC3 =", value, "qtyFrac3");
            return (Criteria) this;
        }

        public Criteria andQtyFrac3NotEqualTo(BigDecimal value) {
            addCriterion("QTY_FRAC3 <>", value, "qtyFrac3");
            return (Criteria) this;
        }

        public Criteria andQtyFrac3GreaterThan(BigDecimal value) {
            addCriterion("QTY_FRAC3 >", value, "qtyFrac3");
            return (Criteria) this;
        }

        public Criteria andQtyFrac3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FRAC3 >=", value, "qtyFrac3");
            return (Criteria) this;
        }

        public Criteria andQtyFrac3LessThan(BigDecimal value) {
            addCriterion("QTY_FRAC3 <", value, "qtyFrac3");
            return (Criteria) this;
        }

        public Criteria andQtyFrac3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FRAC3 <=", value, "qtyFrac3");
            return (Criteria) this;
        }

        public Criteria andQtyFrac3In(List<BigDecimal> values) {
            addCriterion("QTY_FRAC3 in", values, "qtyFrac3");
            return (Criteria) this;
        }

        public Criteria andQtyFrac3NotIn(List<BigDecimal> values) {
            addCriterion("QTY_FRAC3 not in", values, "qtyFrac3");
            return (Criteria) this;
        }

        public Criteria andQtyFrac3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FRAC3 between", value1, value2, "qtyFrac3");
            return (Criteria) this;
        }

        public Criteria andQtyFrac3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FRAC3 not between", value1, value2, "qtyFrac3");
            return (Criteria) this;
        }

        public Criteria andQtyFrac4IsNull() {
            addCriterion("QTY_FRAC4 is null");
            return (Criteria) this;
        }

        public Criteria andQtyFrac4IsNotNull() {
            addCriterion("QTY_FRAC4 is not null");
            return (Criteria) this;
        }

        public Criteria andQtyFrac4EqualTo(BigDecimal value) {
            addCriterion("QTY_FRAC4 =", value, "qtyFrac4");
            return (Criteria) this;
        }

        public Criteria andQtyFrac4NotEqualTo(BigDecimal value) {
            addCriterion("QTY_FRAC4 <>", value, "qtyFrac4");
            return (Criteria) this;
        }

        public Criteria andQtyFrac4GreaterThan(BigDecimal value) {
            addCriterion("QTY_FRAC4 >", value, "qtyFrac4");
            return (Criteria) this;
        }

        public Criteria andQtyFrac4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FRAC4 >=", value, "qtyFrac4");
            return (Criteria) this;
        }

        public Criteria andQtyFrac4LessThan(BigDecimal value) {
            addCriterion("QTY_FRAC4 <", value, "qtyFrac4");
            return (Criteria) this;
        }

        public Criteria andQtyFrac4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FRAC4 <=", value, "qtyFrac4");
            return (Criteria) this;
        }

        public Criteria andQtyFrac4In(List<BigDecimal> values) {
            addCriterion("QTY_FRAC4 in", values, "qtyFrac4");
            return (Criteria) this;
        }

        public Criteria andQtyFrac4NotIn(List<BigDecimal> values) {
            addCriterion("QTY_FRAC4 not in", values, "qtyFrac4");
            return (Criteria) this;
        }

        public Criteria andQtyFrac4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FRAC4 between", value1, value2, "qtyFrac4");
            return (Criteria) this;
        }

        public Criteria andQtyFrac4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FRAC4 not between", value1, value2, "qtyFrac4");
            return (Criteria) this;
        }

        public Criteria andQtyUseWhIsNull() {
            addCriterion("QTY_USE_WH is null");
            return (Criteria) this;
        }

        public Criteria andQtyUseWhIsNotNull() {
            addCriterion("QTY_USE_WH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyUseWhEqualTo(BigDecimal value) {
            addCriterion("QTY_USE_WH =", value, "qtyUseWh");
            return (Criteria) this;
        }

        public Criteria andQtyUseWhNotEqualTo(BigDecimal value) {
            addCriterion("QTY_USE_WH <>", value, "qtyUseWh");
            return (Criteria) this;
        }

        public Criteria andQtyUseWhGreaterThan(BigDecimal value) {
            addCriterion("QTY_USE_WH >", value, "qtyUseWh");
            return (Criteria) this;
        }

        public Criteria andQtyUseWhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_USE_WH >=", value, "qtyUseWh");
            return (Criteria) this;
        }

        public Criteria andQtyUseWhLessThan(BigDecimal value) {
            addCriterion("QTY_USE_WH <", value, "qtyUseWh");
            return (Criteria) this;
        }

        public Criteria andQtyUseWhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_USE_WH <=", value, "qtyUseWh");
            return (Criteria) this;
        }

        public Criteria andQtyUseWhIn(List<BigDecimal> values) {
            addCriterion("QTY_USE_WH in", values, "qtyUseWh");
            return (Criteria) this;
        }

        public Criteria andQtyUseWhNotIn(List<BigDecimal> values) {
            addCriterion("QTY_USE_WH not in", values, "qtyUseWh");
            return (Criteria) this;
        }

        public Criteria andQtyUseWhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_USE_WH between", value1, value2, "qtyUseWh");
            return (Criteria) this;
        }

        public Criteria andQtyUseWhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_USE_WH not between", value1, value2, "qtyUseWh");
            return (Criteria) this;
        }

        public Criteria andTrdIdIsNull() {
            addCriterion("TRD_ID is null");
            return (Criteria) this;
        }

        public Criteria andTrdIdIsNotNull() {
            addCriterion("TRD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTrdIdEqualTo(String value) {
            addCriterion("TRD_ID =", value, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdNotEqualTo(String value) {
            addCriterion("TRD_ID <>", value, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdGreaterThan(String value) {
            addCriterion("TRD_ID >", value, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRD_ID >=", value, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdLessThan(String value) {
            addCriterion("TRD_ID <", value, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdLessThanOrEqualTo(String value) {
            addCriterion("TRD_ID <=", value, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdLike(String value) {
            addCriterion("TRD_ID like", value, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdNotLike(String value) {
            addCriterion("TRD_ID not like", value, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdIn(List<String> values) {
            addCriterion("TRD_ID in", values, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdNotIn(List<String> values) {
            addCriterion("TRD_ID not in", values, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdBetween(String value1, String value2) {
            addCriterion("TRD_ID between", value1, value2, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdNotBetween(String value1, String value2) {
            addCriterion("TRD_ID not between", value1, value2, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdNoIsNull() {
            addCriterion("TRD_NO is null");
            return (Criteria) this;
        }

        public Criteria andTrdNoIsNotNull() {
            addCriterion("TRD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTrdNoEqualTo(String value) {
            addCriterion("TRD_NO =", value, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoNotEqualTo(String value) {
            addCriterion("TRD_NO <>", value, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoGreaterThan(String value) {
            addCriterion("TRD_NO >", value, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoGreaterThanOrEqualTo(String value) {
            addCriterion("TRD_NO >=", value, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoLessThan(String value) {
            addCriterion("TRD_NO <", value, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoLessThanOrEqualTo(String value) {
            addCriterion("TRD_NO <=", value, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoLike(String value) {
            addCriterion("TRD_NO like", value, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoNotLike(String value) {
            addCriterion("TRD_NO not like", value, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoIn(List<String> values) {
            addCriterion("TRD_NO in", values, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoNotIn(List<String> values) {
            addCriterion("TRD_NO not in", values, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoBetween(String value1, String value2) {
            addCriterion("TRD_NO between", value1, value2, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoNotBetween(String value1, String value2) {
            addCriterion("TRD_NO not between", value1, value2, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdItmIsNull() {
            addCriterion("TRD_ITM is null");
            return (Criteria) this;
        }

        public Criteria andTrdItmIsNotNull() {
            addCriterion("TRD_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andTrdItmEqualTo(Integer value) {
            addCriterion("TRD_ITM =", value, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmNotEqualTo(Integer value) {
            addCriterion("TRD_ITM <>", value, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmGreaterThan(Integer value) {
            addCriterion("TRD_ITM >", value, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRD_ITM >=", value, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmLessThan(Integer value) {
            addCriterion("TRD_ITM <", value, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmLessThanOrEqualTo(Integer value) {
            addCriterion("TRD_ITM <=", value, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmIn(List<Integer> values) {
            addCriterion("TRD_ITM in", values, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmNotIn(List<Integer> values) {
            addCriterion("TRD_ITM not in", values, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmBetween(Integer value1, Integer value2) {
            addCriterion("TRD_ITM between", value1, value2, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmNotBetween(Integer value1, Integer value2) {
            addCriterion("TRD_ITM not between", value1, value2, "trdItm");
            return (Criteria) this;
        }

        public Criteria andPrdNameSoResIsNull() {
            addCriterion("PRD_NAME_SO_RES is null");
            return (Criteria) this;
        }

        public Criteria andPrdNameSoResIsNotNull() {
            addCriterion("PRD_NAME_SO_RES is not null");
            return (Criteria) this;
        }

        public Criteria andPrdNameSoResEqualTo(String value) {
            addCriterion("PRD_NAME_SO_RES =", value, "prdNameSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNameSoResNotEqualTo(String value) {
            addCriterion("PRD_NAME_SO_RES <>", value, "prdNameSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNameSoResGreaterThan(String value) {
            addCriterion("PRD_NAME_SO_RES >", value, "prdNameSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNameSoResGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_NAME_SO_RES >=", value, "prdNameSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNameSoResLessThan(String value) {
            addCriterion("PRD_NAME_SO_RES <", value, "prdNameSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNameSoResLessThanOrEqualTo(String value) {
            addCriterion("PRD_NAME_SO_RES <=", value, "prdNameSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNameSoResLike(String value) {
            addCriterion("PRD_NAME_SO_RES like", value, "prdNameSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNameSoResNotLike(String value) {
            addCriterion("PRD_NAME_SO_RES not like", value, "prdNameSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNameSoResIn(List<String> values) {
            addCriterion("PRD_NAME_SO_RES in", values, "prdNameSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNameSoResNotIn(List<String> values) {
            addCriterion("PRD_NAME_SO_RES not in", values, "prdNameSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNameSoResBetween(String value1, String value2) {
            addCriterion("PRD_NAME_SO_RES between", value1, value2, "prdNameSoRes");
            return (Criteria) this;
        }

        public Criteria andPrdNameSoResNotBetween(String value1, String value2) {
            addCriterion("PRD_NAME_SO_RES not between", value1, value2, "prdNameSoRes");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNull() {
            addCriterion("PICPATH is null");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNotNull() {
            addCriterion("PICPATH is not null");
            return (Criteria) this;
        }

        public Criteria andPicpathEqualTo(String value) {
            addCriterion("PICPATH =", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotEqualTo(String value) {
            addCriterion("PICPATH <>", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThan(String value) {
            addCriterion("PICPATH >", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThanOrEqualTo(String value) {
            addCriterion("PICPATH >=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThan(String value) {
            addCriterion("PICPATH <", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThanOrEqualTo(String value) {
            addCriterion("PICPATH <=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLike(String value) {
            addCriterion("PICPATH like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotLike(String value) {
            addCriterion("PICPATH not like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathIn(List<String> values) {
            addCriterion("PICPATH in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotIn(List<String> values) {
            addCriterion("PICPATH not in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathBetween(String value1, String value2) {
            addCriterion("PICPATH between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotBetween(String value1, String value2) {
            addCriterion("PICPATH not between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andChkRtnIsNull() {
            addCriterion("CHK_RTN is null");
            return (Criteria) this;
        }

        public Criteria andChkRtnIsNotNull() {
            addCriterion("CHK_RTN is not null");
            return (Criteria) this;
        }

        public Criteria andChkRtnEqualTo(String value) {
            addCriterion("CHK_RTN =", value, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnNotEqualTo(String value) {
            addCriterion("CHK_RTN <>", value, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnGreaterThan(String value) {
            addCriterion("CHK_RTN >", value, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_RTN >=", value, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnLessThan(String value) {
            addCriterion("CHK_RTN <", value, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnLessThanOrEqualTo(String value) {
            addCriterion("CHK_RTN <=", value, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnLike(String value) {
            addCriterion("CHK_RTN like", value, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnNotLike(String value) {
            addCriterion("CHK_RTN not like", value, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnIn(List<String> values) {
            addCriterion("CHK_RTN in", values, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnNotIn(List<String> values) {
            addCriterion("CHK_RTN not in", values, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnBetween(String value1, String value2) {
            addCriterion("CHK_RTN between", value1, value2, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnNotBetween(String value1, String value2) {
            addCriterion("CHK_RTN not between", value1, value2, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andMoNoIsNull() {
            addCriterion("MO_NO is null");
            return (Criteria) this;
        }

        public Criteria andMoNoIsNotNull() {
            addCriterion("MO_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMoNoEqualTo(String value) {
            addCriterion("MO_NO =", value, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoNotEqualTo(String value) {
            addCriterion("MO_NO <>", value, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoGreaterThan(String value) {
            addCriterion("MO_NO >", value, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoGreaterThanOrEqualTo(String value) {
            addCriterion("MO_NO >=", value, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoLessThan(String value) {
            addCriterion("MO_NO <", value, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoLessThanOrEqualTo(String value) {
            addCriterion("MO_NO <=", value, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoLike(String value) {
            addCriterion("MO_NO like", value, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoNotLike(String value) {
            addCriterion("MO_NO not like", value, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoIn(List<String> values) {
            addCriterion("MO_NO in", values, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoNotIn(List<String> values) {
            addCriterion("MO_NO not in", values, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoBetween(String value1, String value2) {
            addCriterion("MO_NO between", value1, value2, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoNoNotBetween(String value1, String value2) {
            addCriterion("MO_NO not between", value1, value2, "moNo");
            return (Criteria) this;
        }

        public Criteria andMoIdIsNull() {
            addCriterion("MO_ID is null");
            return (Criteria) this;
        }

        public Criteria andMoIdIsNotNull() {
            addCriterion("MO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMoIdEqualTo(String value) {
            addCriterion("MO_ID =", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdNotEqualTo(String value) {
            addCriterion("MO_ID <>", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdGreaterThan(String value) {
            addCriterion("MO_ID >", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdGreaterThanOrEqualTo(String value) {
            addCriterion("MO_ID >=", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdLessThan(String value) {
            addCriterion("MO_ID <", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdLessThanOrEqualTo(String value) {
            addCriterion("MO_ID <=", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdLike(String value) {
            addCriterion("MO_ID like", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdNotLike(String value) {
            addCriterion("MO_ID not like", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdIn(List<String> values) {
            addCriterion("MO_ID in", values, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdNotIn(List<String> values) {
            addCriterion("MO_ID not in", values, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdBetween(String value1, String value2) {
            addCriterion("MO_ID between", value1, value2, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdNotBetween(String value1, String value2) {
            addCriterion("MO_ID not between", value1, value2, "moId");
            return (Criteria) this;
        }

        public Criteria andWcNoIsNull() {
            addCriterion("WC_NO is null");
            return (Criteria) this;
        }

        public Criteria andWcNoIsNotNull() {
            addCriterion("WC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andWcNoEqualTo(String value) {
            addCriterion("WC_NO =", value, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoNotEqualTo(String value) {
            addCriterion("WC_NO <>", value, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoGreaterThan(String value) {
            addCriterion("WC_NO >", value, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoGreaterThanOrEqualTo(String value) {
            addCriterion("WC_NO >=", value, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoLessThan(String value) {
            addCriterion("WC_NO <", value, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoLessThanOrEqualTo(String value) {
            addCriterion("WC_NO <=", value, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoLike(String value) {
            addCriterion("WC_NO like", value, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoNotLike(String value) {
            addCriterion("WC_NO not like", value, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoIn(List<String> values) {
            addCriterion("WC_NO in", values, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoNotIn(List<String> values) {
            addCriterion("WC_NO not in", values, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoBetween(String value1, String value2) {
            addCriterion("WC_NO between", value1, value2, "wcNo");
            return (Criteria) this;
        }

        public Criteria andWcNoNotBetween(String value1, String value2) {
            addCriterion("WC_NO not between", value1, value2, "wcNo");
            return (Criteria) this;
        }

        public Criteria andMtnTypeIsNull() {
            addCriterion("MTN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMtnTypeIsNotNull() {
            addCriterion("MTN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMtnTypeEqualTo(String value) {
            addCriterion("MTN_TYPE =", value, "mtnType");
            return (Criteria) this;
        }

        public Criteria andMtnTypeNotEqualTo(String value) {
            addCriterion("MTN_TYPE <>", value, "mtnType");
            return (Criteria) this;
        }

        public Criteria andMtnTypeGreaterThan(String value) {
            addCriterion("MTN_TYPE >", value, "mtnType");
            return (Criteria) this;
        }

        public Criteria andMtnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MTN_TYPE >=", value, "mtnType");
            return (Criteria) this;
        }

        public Criteria andMtnTypeLessThan(String value) {
            addCriterion("MTN_TYPE <", value, "mtnType");
            return (Criteria) this;
        }

        public Criteria andMtnTypeLessThanOrEqualTo(String value) {
            addCriterion("MTN_TYPE <=", value, "mtnType");
            return (Criteria) this;
        }

        public Criteria andMtnTypeLike(String value) {
            addCriterion("MTN_TYPE like", value, "mtnType");
            return (Criteria) this;
        }

        public Criteria andMtnTypeNotLike(String value) {
            addCriterion("MTN_TYPE not like", value, "mtnType");
            return (Criteria) this;
        }

        public Criteria andMtnTypeIn(List<String> values) {
            addCriterion("MTN_TYPE in", values, "mtnType");
            return (Criteria) this;
        }

        public Criteria andMtnTypeNotIn(List<String> values) {
            addCriterion("MTN_TYPE not in", values, "mtnType");
            return (Criteria) this;
        }

        public Criteria andMtnTypeBetween(String value1, String value2) {
            addCriterion("MTN_TYPE between", value1, value2, "mtnType");
            return (Criteria) this;
        }

        public Criteria andMtnTypeNotBetween(String value1, String value2) {
            addCriterion("MTN_TYPE not between", value1, value2, "mtnType");
            return (Criteria) this;
        }

        public Criteria andMtnAllIdIsNull() {
            addCriterion("MTN_ALL_ID is null");
            return (Criteria) this;
        }

        public Criteria andMtnAllIdIsNotNull() {
            addCriterion("MTN_ALL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMtnAllIdEqualTo(String value) {
            addCriterion("MTN_ALL_ID =", value, "mtnAllId");
            return (Criteria) this;
        }

        public Criteria andMtnAllIdNotEqualTo(String value) {
            addCriterion("MTN_ALL_ID <>", value, "mtnAllId");
            return (Criteria) this;
        }

        public Criteria andMtnAllIdGreaterThan(String value) {
            addCriterion("MTN_ALL_ID >", value, "mtnAllId");
            return (Criteria) this;
        }

        public Criteria andMtnAllIdGreaterThanOrEqualTo(String value) {
            addCriterion("MTN_ALL_ID >=", value, "mtnAllId");
            return (Criteria) this;
        }

        public Criteria andMtnAllIdLessThan(String value) {
            addCriterion("MTN_ALL_ID <", value, "mtnAllId");
            return (Criteria) this;
        }

        public Criteria andMtnAllIdLessThanOrEqualTo(String value) {
            addCriterion("MTN_ALL_ID <=", value, "mtnAllId");
            return (Criteria) this;
        }

        public Criteria andMtnAllIdLike(String value) {
            addCriterion("MTN_ALL_ID like", value, "mtnAllId");
            return (Criteria) this;
        }

        public Criteria andMtnAllIdNotLike(String value) {
            addCriterion("MTN_ALL_ID not like", value, "mtnAllId");
            return (Criteria) this;
        }

        public Criteria andMtnAllIdIn(List<String> values) {
            addCriterion("MTN_ALL_ID in", values, "mtnAllId");
            return (Criteria) this;
        }

        public Criteria andMtnAllIdNotIn(List<String> values) {
            addCriterion("MTN_ALL_ID not in", values, "mtnAllId");
            return (Criteria) this;
        }

        public Criteria andMtnAllIdBetween(String value1, String value2) {
            addCriterion("MTN_ALL_ID between", value1, value2, "mtnAllId");
            return (Criteria) this;
        }

        public Criteria andMtnAllIdNotBetween(String value1, String value2) {
            addCriterion("MTN_ALL_ID not between", value1, value2, "mtnAllId");
            return (Criteria) this;
        }

        public Criteria andMtnDdIsNull() {
            addCriterion("MTN_DD is null");
            return (Criteria) this;
        }

        public Criteria andMtnDdIsNotNull() {
            addCriterion("MTN_DD is not null");
            return (Criteria) this;
        }

        public Criteria andMtnDdEqualTo(Date value) {
            addCriterion("MTN_DD =", value, "mtnDd");
            return (Criteria) this;
        }

        public Criteria andMtnDdNotEqualTo(Date value) {
            addCriterion("MTN_DD <>", value, "mtnDd");
            return (Criteria) this;
        }

        public Criteria andMtnDdGreaterThan(Date value) {
            addCriterion("MTN_DD >", value, "mtnDd");
            return (Criteria) this;
        }

        public Criteria andMtnDdGreaterThanOrEqualTo(Date value) {
            addCriterion("MTN_DD >=", value, "mtnDd");
            return (Criteria) this;
        }

        public Criteria andMtnDdLessThan(Date value) {
            addCriterion("MTN_DD <", value, "mtnDd");
            return (Criteria) this;
        }

        public Criteria andMtnDdLessThanOrEqualTo(Date value) {
            addCriterion("MTN_DD <=", value, "mtnDd");
            return (Criteria) this;
        }

        public Criteria andMtnDdIn(List<Date> values) {
            addCriterion("MTN_DD in", values, "mtnDd");
            return (Criteria) this;
        }

        public Criteria andMtnDdNotIn(List<Date> values) {
            addCriterion("MTN_DD not in", values, "mtnDd");
            return (Criteria) this;
        }

        public Criteria andMtnDdBetween(Date value1, Date value2) {
            addCriterion("MTN_DD between", value1, value2, "mtnDd");
            return (Criteria) this;
        }

        public Criteria andMtnDdNotBetween(Date value1, Date value2) {
            addCriterion("MTN_DD not between", value1, value2, "mtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdIsNull() {
            addCriterion("RTN_DD is null");
            return (Criteria) this;
        }

        public Criteria andRtnDdIsNotNull() {
            addCriterion("RTN_DD is not null");
            return (Criteria) this;
        }

        public Criteria andRtnDdEqualTo(Date value) {
            addCriterion("RTN_DD =", value, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdNotEqualTo(Date value) {
            addCriterion("RTN_DD <>", value, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdGreaterThan(Date value) {
            addCriterion("RTN_DD >", value, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdGreaterThanOrEqualTo(Date value) {
            addCriterion("RTN_DD >=", value, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdLessThan(Date value) {
            addCriterion("RTN_DD <", value, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdLessThanOrEqualTo(Date value) {
            addCriterion("RTN_DD <=", value, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdIn(List<Date> values) {
            addCriterion("RTN_DD in", values, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdNotIn(List<Date> values) {
            addCriterion("RTN_DD not in", values, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdBetween(Date value1, Date value2) {
            addCriterion("RTN_DD between", value1, value2, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdNotBetween(Date value1, Date value2) {
            addCriterion("RTN_DD not between", value1, value2, "rtnDd");
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

        public Criteria andOthItm1IsNull() {
            addCriterion("OTH_ITM1 is null");
            return (Criteria) this;
        }

        public Criteria andOthItm1IsNotNull() {
            addCriterion("OTH_ITM1 is not null");
            return (Criteria) this;
        }

        public Criteria andOthItm1EqualTo(Integer value) {
            addCriterion("OTH_ITM1 =", value, "othItm1");
            return (Criteria) this;
        }

        public Criteria andOthItm1NotEqualTo(Integer value) {
            addCriterion("OTH_ITM1 <>", value, "othItm1");
            return (Criteria) this;
        }

        public Criteria andOthItm1GreaterThan(Integer value) {
            addCriterion("OTH_ITM1 >", value, "othItm1");
            return (Criteria) this;
        }

        public Criteria andOthItm1GreaterThanOrEqualTo(Integer value) {
            addCriterion("OTH_ITM1 >=", value, "othItm1");
            return (Criteria) this;
        }

        public Criteria andOthItm1LessThan(Integer value) {
            addCriterion("OTH_ITM1 <", value, "othItm1");
            return (Criteria) this;
        }

        public Criteria andOthItm1LessThanOrEqualTo(Integer value) {
            addCriterion("OTH_ITM1 <=", value, "othItm1");
            return (Criteria) this;
        }

        public Criteria andOthItm1In(List<Integer> values) {
            addCriterion("OTH_ITM1 in", values, "othItm1");
            return (Criteria) this;
        }

        public Criteria andOthItm1NotIn(List<Integer> values) {
            addCriterion("OTH_ITM1 not in", values, "othItm1");
            return (Criteria) this;
        }

        public Criteria andOthItm1Between(Integer value1, Integer value2) {
            addCriterion("OTH_ITM1 between", value1, value2, "othItm1");
            return (Criteria) this;
        }

        public Criteria andOthItm1NotBetween(Integer value1, Integer value2) {
            addCriterion("OTH_ITM1 not between", value1, value2, "othItm1");
            return (Criteria) this;
        }

        public Criteria andFreeIdDefIsNull() {
            addCriterion("FREE_ID_DEF is null");
            return (Criteria) this;
        }

        public Criteria andFreeIdDefIsNotNull() {
            addCriterion("FREE_ID_DEF is not null");
            return (Criteria) this;
        }

        public Criteria andFreeIdDefEqualTo(String value) {
            addCriterion("FREE_ID_DEF =", value, "freeIdDef");
            return (Criteria) this;
        }

        public Criteria andFreeIdDefNotEqualTo(String value) {
            addCriterion("FREE_ID_DEF <>", value, "freeIdDef");
            return (Criteria) this;
        }

        public Criteria andFreeIdDefGreaterThan(String value) {
            addCriterion("FREE_ID_DEF >", value, "freeIdDef");
            return (Criteria) this;
        }

        public Criteria andFreeIdDefGreaterThanOrEqualTo(String value) {
            addCriterion("FREE_ID_DEF >=", value, "freeIdDef");
            return (Criteria) this;
        }

        public Criteria andFreeIdDefLessThan(String value) {
            addCriterion("FREE_ID_DEF <", value, "freeIdDef");
            return (Criteria) this;
        }

        public Criteria andFreeIdDefLessThanOrEqualTo(String value) {
            addCriterion("FREE_ID_DEF <=", value, "freeIdDef");
            return (Criteria) this;
        }

        public Criteria andFreeIdDefLike(String value) {
            addCriterion("FREE_ID_DEF like", value, "freeIdDef");
            return (Criteria) this;
        }

        public Criteria andFreeIdDefNotLike(String value) {
            addCriterion("FREE_ID_DEF not like", value, "freeIdDef");
            return (Criteria) this;
        }

        public Criteria andFreeIdDefIn(List<String> values) {
            addCriterion("FREE_ID_DEF in", values, "freeIdDef");
            return (Criteria) this;
        }

        public Criteria andFreeIdDefNotIn(List<String> values) {
            addCriterion("FREE_ID_DEF not in", values, "freeIdDef");
            return (Criteria) this;
        }

        public Criteria andFreeIdDefBetween(String value1, String value2) {
            addCriterion("FREE_ID_DEF between", value1, value2, "freeIdDef");
            return (Criteria) this;
        }

        public Criteria andFreeIdDefNotBetween(String value1, String value2) {
            addCriterion("FREE_ID_DEF not between", value1, value2, "freeIdDef");
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

        public Criteria andQtyAeIsNull() {
            addCriterion("QTY_AE is null");
            return (Criteria) this;
        }

        public Criteria andQtyAeIsNotNull() {
            addCriterion("QTY_AE is not null");
            return (Criteria) this;
        }

        public Criteria andQtyAeEqualTo(BigDecimal value) {
            addCriterion("QTY_AE =", value, "qtyAe");
            return (Criteria) this;
        }

        public Criteria andQtyAeNotEqualTo(BigDecimal value) {
            addCriterion("QTY_AE <>", value, "qtyAe");
            return (Criteria) this;
        }

        public Criteria andQtyAeGreaterThan(BigDecimal value) {
            addCriterion("QTY_AE >", value, "qtyAe");
            return (Criteria) this;
        }

        public Criteria andQtyAeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_AE >=", value, "qtyAe");
            return (Criteria) this;
        }

        public Criteria andQtyAeLessThan(BigDecimal value) {
            addCriterion("QTY_AE <", value, "qtyAe");
            return (Criteria) this;
        }

        public Criteria andQtyAeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_AE <=", value, "qtyAe");
            return (Criteria) this;
        }

        public Criteria andQtyAeIn(List<BigDecimal> values) {
            addCriterion("QTY_AE in", values, "qtyAe");
            return (Criteria) this;
        }

        public Criteria andQtyAeNotIn(List<BigDecimal> values) {
            addCriterion("QTY_AE not in", values, "qtyAe");
            return (Criteria) this;
        }

        public Criteria andQtyAeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_AE between", value1, value2, "qtyAe");
            return (Criteria) this;
        }

        public Criteria andQtyAeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_AE not between", value1, value2, "qtyAe");
            return (Criteria) this;
        }

        public Criteria andSupPrdNmIsNull() {
            addCriterion("SUP_PRD_NM is null");
            return (Criteria) this;
        }

        public Criteria andSupPrdNmIsNotNull() {
            addCriterion("SUP_PRD_NM is not null");
            return (Criteria) this;
        }

        public Criteria andSupPrdNmEqualTo(String value) {
            addCriterion("SUP_PRD_NM =", value, "supPrdNm");
            return (Criteria) this;
        }

        public Criteria andSupPrdNmNotEqualTo(String value) {
            addCriterion("SUP_PRD_NM <>", value, "supPrdNm");
            return (Criteria) this;
        }

        public Criteria andSupPrdNmGreaterThan(String value) {
            addCriterion("SUP_PRD_NM >", value, "supPrdNm");
            return (Criteria) this;
        }

        public Criteria andSupPrdNmGreaterThanOrEqualTo(String value) {
            addCriterion("SUP_PRD_NM >=", value, "supPrdNm");
            return (Criteria) this;
        }

        public Criteria andSupPrdNmLessThan(String value) {
            addCriterion("SUP_PRD_NM <", value, "supPrdNm");
            return (Criteria) this;
        }

        public Criteria andSupPrdNmLessThanOrEqualTo(String value) {
            addCriterion("SUP_PRD_NM <=", value, "supPrdNm");
            return (Criteria) this;
        }

        public Criteria andSupPrdNmLike(String value) {
            addCriterion("SUP_PRD_NM like", value, "supPrdNm");
            return (Criteria) this;
        }

        public Criteria andSupPrdNmNotLike(String value) {
            addCriterion("SUP_PRD_NM not like", value, "supPrdNm");
            return (Criteria) this;
        }

        public Criteria andSupPrdNmIn(List<String> values) {
            addCriterion("SUP_PRD_NM in", values, "supPrdNm");
            return (Criteria) this;
        }

        public Criteria andSupPrdNmNotIn(List<String> values) {
            addCriterion("SUP_PRD_NM not in", values, "supPrdNm");
            return (Criteria) this;
        }

        public Criteria andSupPrdNmBetween(String value1, String value2) {
            addCriterion("SUP_PRD_NM between", value1, value2, "supPrdNm");
            return (Criteria) this;
        }

        public Criteria andSupPrdNmNotBetween(String value1, String value2) {
            addCriterion("SUP_PRD_NM not between", value1, value2, "supPrdNm");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("DETAIL =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("DETAIL <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("DETAIL >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("DETAIL <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("DETAIL <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("DETAIL like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("DETAIL not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("DETAIL in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("DETAIL not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("DETAIL between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("DETAIL not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andTbOidIsNull() {
            addCriterion("TB_OID is null");
            return (Criteria) this;
        }

        public Criteria andTbOidIsNotNull() {
            addCriterion("TB_OID is not null");
            return (Criteria) this;
        }

        public Criteria andTbOidEqualTo(String value) {
            addCriterion("TB_OID =", value, "tbOid");
            return (Criteria) this;
        }

        public Criteria andTbOidNotEqualTo(String value) {
            addCriterion("TB_OID <>", value, "tbOid");
            return (Criteria) this;
        }

        public Criteria andTbOidGreaterThan(String value) {
            addCriterion("TB_OID >", value, "tbOid");
            return (Criteria) this;
        }

        public Criteria andTbOidGreaterThanOrEqualTo(String value) {
            addCriterion("TB_OID >=", value, "tbOid");
            return (Criteria) this;
        }

        public Criteria andTbOidLessThan(String value) {
            addCriterion("TB_OID <", value, "tbOid");
            return (Criteria) this;
        }

        public Criteria andTbOidLessThanOrEqualTo(String value) {
            addCriterion("TB_OID <=", value, "tbOid");
            return (Criteria) this;
        }

        public Criteria andTbOidLike(String value) {
            addCriterion("TB_OID like", value, "tbOid");
            return (Criteria) this;
        }

        public Criteria andTbOidNotLike(String value) {
            addCriterion("TB_OID not like", value, "tbOid");
            return (Criteria) this;
        }

        public Criteria andTbOidIn(List<String> values) {
            addCriterion("TB_OID in", values, "tbOid");
            return (Criteria) this;
        }

        public Criteria andTbOidNotIn(List<String> values) {
            addCriterion("TB_OID not in", values, "tbOid");
            return (Criteria) this;
        }

        public Criteria andTbOidBetween(String value1, String value2) {
            addCriterion("TB_OID between", value1, value2, "tbOid");
            return (Criteria) this;
        }

        public Criteria andTbOidNotBetween(String value1, String value2) {
            addCriterion("TB_OID not between", value1, value2, "tbOid");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkIsNull() {
            addCriterion("SUP_PRD_MARK is null");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkIsNotNull() {
            addCriterion("SUP_PRD_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkEqualTo(String value) {
            addCriterion("SUP_PRD_MARK =", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkNotEqualTo(String value) {
            addCriterion("SUP_PRD_MARK <>", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkGreaterThan(String value) {
            addCriterion("SUP_PRD_MARK >", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkGreaterThanOrEqualTo(String value) {
            addCriterion("SUP_PRD_MARK >=", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkLessThan(String value) {
            addCriterion("SUP_PRD_MARK <", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkLessThanOrEqualTo(String value) {
            addCriterion("SUP_PRD_MARK <=", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkLike(String value) {
            addCriterion("SUP_PRD_MARK like", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkNotLike(String value) {
            addCriterion("SUP_PRD_MARK not like", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkIn(List<String> values) {
            addCriterion("SUP_PRD_MARK in", values, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkNotIn(List<String> values) {
            addCriterion("SUP_PRD_MARK not in", values, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkBetween(String value1, String value2) {
            addCriterion("SUP_PRD_MARK between", value1, value2, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkNotBetween(String value1, String value2) {
            addCriterion("SUP_PRD_MARK not between", value1, value2, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andDefNoIsNull() {
            addCriterion("DEF_NO is null");
            return (Criteria) this;
        }

        public Criteria andDefNoIsNotNull() {
            addCriterion("DEF_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDefNoEqualTo(String value) {
            addCriterion("DEF_NO =", value, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoNotEqualTo(String value) {
            addCriterion("DEF_NO <>", value, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoGreaterThan(String value) {
            addCriterion("DEF_NO >", value, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEF_NO >=", value, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoLessThan(String value) {
            addCriterion("DEF_NO <", value, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoLessThanOrEqualTo(String value) {
            addCriterion("DEF_NO <=", value, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoLike(String value) {
            addCriterion("DEF_NO like", value, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoNotLike(String value) {
            addCriterion("DEF_NO not like", value, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoIn(List<String> values) {
            addCriterion("DEF_NO in", values, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoNotIn(List<String> values) {
            addCriterion("DEF_NO not in", values, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoBetween(String value1, String value2) {
            addCriterion("DEF_NO between", value1, value2, "defNo");
            return (Criteria) this;
        }

        public Criteria andDefNoNotBetween(String value1, String value2) {
            addCriterion("DEF_NO not between", value1, value2, "defNo");
            return (Criteria) this;
        }

        public Criteria andMatrixItmIsNull() {
            addCriterion("MATRIX_ITM is null");
            return (Criteria) this;
        }

        public Criteria andMatrixItmIsNotNull() {
            addCriterion("MATRIX_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andMatrixItmEqualTo(Integer value) {
            addCriterion("MATRIX_ITM =", value, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmNotEqualTo(Integer value) {
            addCriterion("MATRIX_ITM <>", value, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmGreaterThan(Integer value) {
            addCriterion("MATRIX_ITM >", value, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("MATRIX_ITM >=", value, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmLessThan(Integer value) {
            addCriterion("MATRIX_ITM <", value, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmLessThanOrEqualTo(Integer value) {
            addCriterion("MATRIX_ITM <=", value, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmIn(List<Integer> values) {
            addCriterion("MATRIX_ITM in", values, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmNotIn(List<Integer> values) {
            addCriterion("MATRIX_ITM not in", values, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmBetween(Integer value1, Integer value2) {
            addCriterion("MATRIX_ITM between", value1, value2, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andMatrixItmNotBetween(Integer value1, Integer value2) {
            addCriterion("MATRIX_ITM not between", value1, value2, "matrixItm");
            return (Criteria) this;
        }

        public Criteria andCfIdIsNull() {
            addCriterion("CF_ID is null");
            return (Criteria) this;
        }

        public Criteria andCfIdIsNotNull() {
            addCriterion("CF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCfIdEqualTo(String value) {
            addCriterion("CF_ID =", value, "cfId");
            return (Criteria) this;
        }

        public Criteria andCfIdNotEqualTo(String value) {
            addCriterion("CF_ID <>", value, "cfId");
            return (Criteria) this;
        }

        public Criteria andCfIdGreaterThan(String value) {
            addCriterion("CF_ID >", value, "cfId");
            return (Criteria) this;
        }

        public Criteria andCfIdGreaterThanOrEqualTo(String value) {
            addCriterion("CF_ID >=", value, "cfId");
            return (Criteria) this;
        }

        public Criteria andCfIdLessThan(String value) {
            addCriterion("CF_ID <", value, "cfId");
            return (Criteria) this;
        }

        public Criteria andCfIdLessThanOrEqualTo(String value) {
            addCriterion("CF_ID <=", value, "cfId");
            return (Criteria) this;
        }

        public Criteria andCfIdLike(String value) {
            addCriterion("CF_ID like", value, "cfId");
            return (Criteria) this;
        }

        public Criteria andCfIdNotLike(String value) {
            addCriterion("CF_ID not like", value, "cfId");
            return (Criteria) this;
        }

        public Criteria andCfIdIn(List<String> values) {
            addCriterion("CF_ID in", values, "cfId");
            return (Criteria) this;
        }

        public Criteria andCfIdNotIn(List<String> values) {
            addCriterion("CF_ID not in", values, "cfId");
            return (Criteria) this;
        }

        public Criteria andCfIdBetween(String value1, String value2) {
            addCriterion("CF_ID between", value1, value2, "cfId");
            return (Criteria) this;
        }

        public Criteria andCfIdNotBetween(String value1, String value2) {
            addCriterion("CF_ID not between", value1, value2, "cfId");
            return (Criteria) this;
        }

        public Criteria andTtRngIsNull() {
            addCriterion("TT_RNG is null");
            return (Criteria) this;
        }

        public Criteria andTtRngIsNotNull() {
            addCriterion("TT_RNG is not null");
            return (Criteria) this;
        }

        public Criteria andTtRngEqualTo(Integer value) {
            addCriterion("TT_RNG =", value, "ttRng");
            return (Criteria) this;
        }

        public Criteria andTtRngNotEqualTo(Integer value) {
            addCriterion("TT_RNG <>", value, "ttRng");
            return (Criteria) this;
        }

        public Criteria andTtRngGreaterThan(Integer value) {
            addCriterion("TT_RNG >", value, "ttRng");
            return (Criteria) this;
        }

        public Criteria andTtRngGreaterThanOrEqualTo(Integer value) {
            addCriterion("TT_RNG >=", value, "ttRng");
            return (Criteria) this;
        }

        public Criteria andTtRngLessThan(Integer value) {
            addCriterion("TT_RNG <", value, "ttRng");
            return (Criteria) this;
        }

        public Criteria andTtRngLessThanOrEqualTo(Integer value) {
            addCriterion("TT_RNG <=", value, "ttRng");
            return (Criteria) this;
        }

        public Criteria andTtRngIn(List<Integer> values) {
            addCriterion("TT_RNG in", values, "ttRng");
            return (Criteria) this;
        }

        public Criteria andTtRngNotIn(List<Integer> values) {
            addCriterion("TT_RNG not in", values, "ttRng");
            return (Criteria) this;
        }

        public Criteria andTtRngBetween(Integer value1, Integer value2) {
            addCriterion("TT_RNG between", value1, value2, "ttRng");
            return (Criteria) this;
        }

        public Criteria andTtRngNotBetween(Integer value1, Integer value2) {
            addCriterion("TT_RNG not between", value1, value2, "ttRng");
            return (Criteria) this;
        }

        public Criteria andTtTypeIfrsIsNull() {
            addCriterion("TT_TYPE_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andTtTypeIfrsIsNotNull() {
            addCriterion("TT_TYPE_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andTtTypeIfrsEqualTo(String value) {
            addCriterion("TT_TYPE_IFRS =", value, "ttTypeIfrs");
            return (Criteria) this;
        }

        public Criteria andTtTypeIfrsNotEqualTo(String value) {
            addCriterion("TT_TYPE_IFRS <>", value, "ttTypeIfrs");
            return (Criteria) this;
        }

        public Criteria andTtTypeIfrsGreaterThan(String value) {
            addCriterion("TT_TYPE_IFRS >", value, "ttTypeIfrs");
            return (Criteria) this;
        }

        public Criteria andTtTypeIfrsGreaterThanOrEqualTo(String value) {
            addCriterion("TT_TYPE_IFRS >=", value, "ttTypeIfrs");
            return (Criteria) this;
        }

        public Criteria andTtTypeIfrsLessThan(String value) {
            addCriterion("TT_TYPE_IFRS <", value, "ttTypeIfrs");
            return (Criteria) this;
        }

        public Criteria andTtTypeIfrsLessThanOrEqualTo(String value) {
            addCriterion("TT_TYPE_IFRS <=", value, "ttTypeIfrs");
            return (Criteria) this;
        }

        public Criteria andTtTypeIfrsLike(String value) {
            addCriterion("TT_TYPE_IFRS like", value, "ttTypeIfrs");
            return (Criteria) this;
        }

        public Criteria andTtTypeIfrsNotLike(String value) {
            addCriterion("TT_TYPE_IFRS not like", value, "ttTypeIfrs");
            return (Criteria) this;
        }

        public Criteria andTtTypeIfrsIn(List<String> values) {
            addCriterion("TT_TYPE_IFRS in", values, "ttTypeIfrs");
            return (Criteria) this;
        }

        public Criteria andTtTypeIfrsNotIn(List<String> values) {
            addCriterion("TT_TYPE_IFRS not in", values, "ttTypeIfrs");
            return (Criteria) this;
        }

        public Criteria andTtTypeIfrsBetween(String value1, String value2) {
            addCriterion("TT_TYPE_IFRS between", value1, value2, "ttTypeIfrs");
            return (Criteria) this;
        }

        public Criteria andTtTypeIfrsNotBetween(String value1, String value2) {
            addCriterion("TT_TYPE_IFRS not between", value1, value2, "ttTypeIfrs");
            return (Criteria) this;
        }

        public Criteria andTtYmEIsNull() {
            addCriterion("TT_YM_E is null");
            return (Criteria) this;
        }

        public Criteria andTtYmEIsNotNull() {
            addCriterion("TT_YM_E is not null");
            return (Criteria) this;
        }

        public Criteria andTtYmEEqualTo(Date value) {
            addCriterion("TT_YM_E =", value, "ttYmE");
            return (Criteria) this;
        }

        public Criteria andTtYmENotEqualTo(Date value) {
            addCriterion("TT_YM_E <>", value, "ttYmE");
            return (Criteria) this;
        }

        public Criteria andTtYmEGreaterThan(Date value) {
            addCriterion("TT_YM_E >", value, "ttYmE");
            return (Criteria) this;
        }

        public Criteria andTtYmEGreaterThanOrEqualTo(Date value) {
            addCriterion("TT_YM_E >=", value, "ttYmE");
            return (Criteria) this;
        }

        public Criteria andTtYmELessThan(Date value) {
            addCriterion("TT_YM_E <", value, "ttYmE");
            return (Criteria) this;
        }

        public Criteria andTtYmELessThanOrEqualTo(Date value) {
            addCriterion("TT_YM_E <=", value, "ttYmE");
            return (Criteria) this;
        }

        public Criteria andTtYmEIn(List<Date> values) {
            addCriterion("TT_YM_E in", values, "ttYmE");
            return (Criteria) this;
        }

        public Criteria andTtYmENotIn(List<Date> values) {
            addCriterion("TT_YM_E not in", values, "ttYmE");
            return (Criteria) this;
        }

        public Criteria andTtYmEBetween(Date value1, Date value2) {
            addCriterion("TT_YM_E between", value1, value2, "ttYmE");
            return (Criteria) this;
        }

        public Criteria andTtYmENotBetween(Date value1, Date value2) {
            addCriterion("TT_YM_E not between", value1, value2, "ttYmE");
            return (Criteria) this;
        }

        public Criteria andQtyIoIsNull() {
            addCriterion("QTY_IO is null");
            return (Criteria) this;
        }

        public Criteria andQtyIoIsNotNull() {
            addCriterion("QTY_IO is not null");
            return (Criteria) this;
        }

        public Criteria andQtyIoEqualTo(BigDecimal value) {
            addCriterion("QTY_IO =", value, "qtyIo");
            return (Criteria) this;
        }

        public Criteria andQtyIoNotEqualTo(BigDecimal value) {
            addCriterion("QTY_IO <>", value, "qtyIo");
            return (Criteria) this;
        }

        public Criteria andQtyIoGreaterThan(BigDecimal value) {
            addCriterion("QTY_IO >", value, "qtyIo");
            return (Criteria) this;
        }

        public Criteria andQtyIoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_IO >=", value, "qtyIo");
            return (Criteria) this;
        }

        public Criteria andQtyIoLessThan(BigDecimal value) {
            addCriterion("QTY_IO <", value, "qtyIo");
            return (Criteria) this;
        }

        public Criteria andQtyIoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_IO <=", value, "qtyIo");
            return (Criteria) this;
        }

        public Criteria andQtyIoIn(List<BigDecimal> values) {
            addCriterion("QTY_IO in", values, "qtyIo");
            return (Criteria) this;
        }

        public Criteria andQtyIoNotIn(List<BigDecimal> values) {
            addCriterion("QTY_IO not in", values, "qtyIo");
            return (Criteria) this;
        }

        public Criteria andQtyIoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_IO between", value1, value2, "qtyIo");
            return (Criteria) this;
        }

        public Criteria andQtyIoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_IO not between", value1, value2, "qtyIo");
            return (Criteria) this;
        }

        public Criteria andQtyIoUnshIsNull() {
            addCriterion("QTY_IO_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyIoUnshIsNotNull() {
            addCriterion("QTY_IO_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyIoUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_IO_UNSH =", value, "qtyIoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIoUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_IO_UNSH <>", value, "qtyIoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIoUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_IO_UNSH >", value, "qtyIoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIoUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_IO_UNSH >=", value, "qtyIoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIoUnshLessThan(BigDecimal value) {
            addCriterion("QTY_IO_UNSH <", value, "qtyIoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIoUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_IO_UNSH <=", value, "qtyIoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIoUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_IO_UNSH in", values, "qtyIoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIoUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_IO_UNSH not in", values, "qtyIoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIoUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_IO_UNSH between", value1, value2, "qtyIoUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyIoUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_IO_UNSH not between", value1, value2, "qtyIoUnsh");
            return (Criteria) this;
        }

        public Criteria andIsSpIsNull() {
            addCriterion("IS_SP is null");
            return (Criteria) this;
        }

        public Criteria andIsSpIsNotNull() {
            addCriterion("IS_SP is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpEqualTo(String value) {
            addCriterion("IS_SP =", value, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpNotEqualTo(String value) {
            addCriterion("IS_SP <>", value, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpGreaterThan(String value) {
            addCriterion("IS_SP >", value, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SP >=", value, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpLessThan(String value) {
            addCriterion("IS_SP <", value, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpLessThanOrEqualTo(String value) {
            addCriterion("IS_SP <=", value, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpLike(String value) {
            addCriterion("IS_SP like", value, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpNotLike(String value) {
            addCriterion("IS_SP not like", value, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpIn(List<String> values) {
            addCriterion("IS_SP in", values, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpNotIn(List<String> values) {
            addCriterion("IS_SP not in", values, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpBetween(String value1, String value2) {
            addCriterion("IS_SP between", value1, value2, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpNotBetween(String value1, String value2) {
            addCriterion("IS_SP not between", value1, value2, "isSp");
            return (Criteria) this;
        }

        public Criteria andMrpNosIsNull() {
            addCriterion("MRP_NOS is null");
            return (Criteria) this;
        }

        public Criteria andMrpNosIsNotNull() {
            addCriterion("MRP_NOS is not null");
            return (Criteria) this;
        }

        public Criteria andMrpNosEqualTo(String value) {
            addCriterion("MRP_NOS =", value, "mrpNos");
            return (Criteria) this;
        }

        public Criteria andMrpNosNotEqualTo(String value) {
            addCriterion("MRP_NOS <>", value, "mrpNos");
            return (Criteria) this;
        }

        public Criteria andMrpNosGreaterThan(String value) {
            addCriterion("MRP_NOS >", value, "mrpNos");
            return (Criteria) this;
        }

        public Criteria andMrpNosGreaterThanOrEqualTo(String value) {
            addCriterion("MRP_NOS >=", value, "mrpNos");
            return (Criteria) this;
        }

        public Criteria andMrpNosLessThan(String value) {
            addCriterion("MRP_NOS <", value, "mrpNos");
            return (Criteria) this;
        }

        public Criteria andMrpNosLessThanOrEqualTo(String value) {
            addCriterion("MRP_NOS <=", value, "mrpNos");
            return (Criteria) this;
        }

        public Criteria andMrpNosLike(String value) {
            addCriterion("MRP_NOS like", value, "mrpNos");
            return (Criteria) this;
        }

        public Criteria andMrpNosNotLike(String value) {
            addCriterion("MRP_NOS not like", value, "mrpNos");
            return (Criteria) this;
        }

        public Criteria andMrpNosIn(List<String> values) {
            addCriterion("MRP_NOS in", values, "mrpNos");
            return (Criteria) this;
        }

        public Criteria andMrpNosNotIn(List<String> values) {
            addCriterion("MRP_NOS not in", values, "mrpNos");
            return (Criteria) this;
        }

        public Criteria andMrpNosBetween(String value1, String value2) {
            addCriterion("MRP_NOS between", value1, value2, "mrpNos");
            return (Criteria) this;
        }

        public Criteria andMrpNosNotBetween(String value1, String value2) {
            addCriterion("MRP_NOS not between", value1, value2, "mrpNos");
            return (Criteria) this;
        }

        public Criteria andOrItmIsNull() {
            addCriterion("OR_ITM is null");
            return (Criteria) this;
        }

        public Criteria andOrItmIsNotNull() {
            addCriterion("OR_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andOrItmEqualTo(Integer value) {
            addCriterion("OR_ITM =", value, "orItm");
            return (Criteria) this;
        }

        public Criteria andOrItmNotEqualTo(Integer value) {
            addCriterion("OR_ITM <>", value, "orItm");
            return (Criteria) this;
        }

        public Criteria andOrItmGreaterThan(Integer value) {
            addCriterion("OR_ITM >", value, "orItm");
            return (Criteria) this;
        }

        public Criteria andOrItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("OR_ITM >=", value, "orItm");
            return (Criteria) this;
        }

        public Criteria andOrItmLessThan(Integer value) {
            addCriterion("OR_ITM <", value, "orItm");
            return (Criteria) this;
        }

        public Criteria andOrItmLessThanOrEqualTo(Integer value) {
            addCriterion("OR_ITM <=", value, "orItm");
            return (Criteria) this;
        }

        public Criteria andOrItmIn(List<Integer> values) {
            addCriterion("OR_ITM in", values, "orItm");
            return (Criteria) this;
        }

        public Criteria andOrItmNotIn(List<Integer> values) {
            addCriterion("OR_ITM not in", values, "orItm");
            return (Criteria) this;
        }

        public Criteria andOrItmBetween(Integer value1, Integer value2) {
            addCriterion("OR_ITM between", value1, value2, "orItm");
            return (Criteria) this;
        }

        public Criteria andOrItmNotBetween(Integer value1, Integer value2) {
            addCriterion("OR_ITM not between", value1, value2, "orItm");
            return (Criteria) this;
        }

        public Criteria andKindNoIsNull() {
            addCriterion("KIND_NO is null");
            return (Criteria) this;
        }

        public Criteria andKindNoIsNotNull() {
            addCriterion("KIND_NO is not null");
            return (Criteria) this;
        }

        public Criteria andKindNoEqualTo(String value) {
            addCriterion("KIND_NO =", value, "kindNo");
            return (Criteria) this;
        }

        public Criteria andKindNoNotEqualTo(String value) {
            addCriterion("KIND_NO <>", value, "kindNo");
            return (Criteria) this;
        }

        public Criteria andKindNoGreaterThan(String value) {
            addCriterion("KIND_NO >", value, "kindNo");
            return (Criteria) this;
        }

        public Criteria andKindNoGreaterThanOrEqualTo(String value) {
            addCriterion("KIND_NO >=", value, "kindNo");
            return (Criteria) this;
        }

        public Criteria andKindNoLessThan(String value) {
            addCriterion("KIND_NO <", value, "kindNo");
            return (Criteria) this;
        }

        public Criteria andKindNoLessThanOrEqualTo(String value) {
            addCriterion("KIND_NO <=", value, "kindNo");
            return (Criteria) this;
        }

        public Criteria andKindNoLike(String value) {
            addCriterion("KIND_NO like", value, "kindNo");
            return (Criteria) this;
        }

        public Criteria andKindNoNotLike(String value) {
            addCriterion("KIND_NO not like", value, "kindNo");
            return (Criteria) this;
        }

        public Criteria andKindNoIn(List<String> values) {
            addCriterion("KIND_NO in", values, "kindNo");
            return (Criteria) this;
        }

        public Criteria andKindNoNotIn(List<String> values) {
            addCriterion("KIND_NO not in", values, "kindNo");
            return (Criteria) this;
        }

        public Criteria andKindNoBetween(String value1, String value2) {
            addCriterion("KIND_NO between", value1, value2, "kindNo");
            return (Criteria) this;
        }

        public Criteria andKindNoNotBetween(String value1, String value2) {
            addCriterion("KIND_NO not between", value1, value2, "kindNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoIsNull() {
            addCriterion("XPM_NO is null");
            return (Criteria) this;
        }

        public Criteria andXpmNoIsNotNull() {
            addCriterion("XPM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andXpmNoEqualTo(String value) {
            addCriterion("XPM_NO =", value, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoNotEqualTo(String value) {
            addCriterion("XPM_NO <>", value, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoGreaterThan(String value) {
            addCriterion("XPM_NO >", value, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoGreaterThanOrEqualTo(String value) {
            addCriterion("XPM_NO >=", value, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoLessThan(String value) {
            addCriterion("XPM_NO <", value, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoLessThanOrEqualTo(String value) {
            addCriterion("XPM_NO <=", value, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoLike(String value) {
            addCriterion("XPM_NO like", value, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoNotLike(String value) {
            addCriterion("XPM_NO not like", value, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoIn(List<String> values) {
            addCriterion("XPM_NO in", values, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoNotIn(List<String> values) {
            addCriterion("XPM_NO not in", values, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoBetween(String value1, String value2) {
            addCriterion("XPM_NO between", value1, value2, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoNotBetween(String value1, String value2) {
            addCriterion("XPM_NO not between", value1, value2, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNo1IsNull() {
            addCriterion("XPM_NO1 is null");
            return (Criteria) this;
        }

        public Criteria andXpmNo1IsNotNull() {
            addCriterion("XPM_NO1 is not null");
            return (Criteria) this;
        }

        public Criteria andXpmNo1EqualTo(String value) {
            addCriterion("XPM_NO1 =", value, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1NotEqualTo(String value) {
            addCriterion("XPM_NO1 <>", value, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1GreaterThan(String value) {
            addCriterion("XPM_NO1 >", value, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1GreaterThanOrEqualTo(String value) {
            addCriterion("XPM_NO1 >=", value, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1LessThan(String value) {
            addCriterion("XPM_NO1 <", value, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1LessThanOrEqualTo(String value) {
            addCriterion("XPM_NO1 <=", value, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1Like(String value) {
            addCriterion("XPM_NO1 like", value, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1NotLike(String value) {
            addCriterion("XPM_NO1 not like", value, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1In(List<String> values) {
            addCriterion("XPM_NO1 in", values, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1NotIn(List<String> values) {
            addCriterion("XPM_NO1 not in", values, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1Between(String value1, String value2) {
            addCriterion("XPM_NO1 between", value1, value2, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1NotBetween(String value1, String value2) {
            addCriterion("XPM_NO1 not between", value1, value2, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpprdItmIsNull() {
            addCriterion("XPPRD_ITM is null");
            return (Criteria) this;
        }

        public Criteria andXpprdItmIsNotNull() {
            addCriterion("XPPRD_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andXpprdItmEqualTo(Integer value) {
            addCriterion("XPPRD_ITM =", value, "xpprdItm");
            return (Criteria) this;
        }

        public Criteria andXpprdItmNotEqualTo(Integer value) {
            addCriterion("XPPRD_ITM <>", value, "xpprdItm");
            return (Criteria) this;
        }

        public Criteria andXpprdItmGreaterThan(Integer value) {
            addCriterion("XPPRD_ITM >", value, "xpprdItm");
            return (Criteria) this;
        }

        public Criteria andXpprdItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("XPPRD_ITM >=", value, "xpprdItm");
            return (Criteria) this;
        }

        public Criteria andXpprdItmLessThan(Integer value) {
            addCriterion("XPPRD_ITM <", value, "xpprdItm");
            return (Criteria) this;
        }

        public Criteria andXpprdItmLessThanOrEqualTo(Integer value) {
            addCriterion("XPPRD_ITM <=", value, "xpprdItm");
            return (Criteria) this;
        }

        public Criteria andXpprdItmIn(List<Integer> values) {
            addCriterion("XPPRD_ITM in", values, "xpprdItm");
            return (Criteria) this;
        }

        public Criteria andXpprdItmNotIn(List<Integer> values) {
            addCriterion("XPPRD_ITM not in", values, "xpprdItm");
            return (Criteria) this;
        }

        public Criteria andXpprdItmBetween(Integer value1, Integer value2) {
            addCriterion("XPPRD_ITM between", value1, value2, "xpprdItm");
            return (Criteria) this;
        }

        public Criteria andXpprdItmNotBetween(Integer value1, Integer value2) {
            addCriterion("XPPRD_ITM not between", value1, value2, "xpprdItm");
            return (Criteria) this;
        }

        public Criteria andXpprdItm1IsNull() {
            addCriterion("XPPRD_ITM1 is null");
            return (Criteria) this;
        }

        public Criteria andXpprdItm1IsNotNull() {
            addCriterion("XPPRD_ITM1 is not null");
            return (Criteria) this;
        }

        public Criteria andXpprdItm1EqualTo(Integer value) {
            addCriterion("XPPRD_ITM1 =", value, "xpprdItm1");
            return (Criteria) this;
        }

        public Criteria andXpprdItm1NotEqualTo(Integer value) {
            addCriterion("XPPRD_ITM1 <>", value, "xpprdItm1");
            return (Criteria) this;
        }

        public Criteria andXpprdItm1GreaterThan(Integer value) {
            addCriterion("XPPRD_ITM1 >", value, "xpprdItm1");
            return (Criteria) this;
        }

        public Criteria andXpprdItm1GreaterThanOrEqualTo(Integer value) {
            addCriterion("XPPRD_ITM1 >=", value, "xpprdItm1");
            return (Criteria) this;
        }

        public Criteria andXpprdItm1LessThan(Integer value) {
            addCriterion("XPPRD_ITM1 <", value, "xpprdItm1");
            return (Criteria) this;
        }

        public Criteria andXpprdItm1LessThanOrEqualTo(Integer value) {
            addCriterion("XPPRD_ITM1 <=", value, "xpprdItm1");
            return (Criteria) this;
        }

        public Criteria andXpprdItm1In(List<Integer> values) {
            addCriterion("XPPRD_ITM1 in", values, "xpprdItm1");
            return (Criteria) this;
        }

        public Criteria andXpprdItm1NotIn(List<Integer> values) {
            addCriterion("XPPRD_ITM1 not in", values, "xpprdItm1");
            return (Criteria) this;
        }

        public Criteria andXpprdItm1Between(Integer value1, Integer value2) {
            addCriterion("XPPRD_ITM1 between", value1, value2, "xpprdItm1");
            return (Criteria) this;
        }

        public Criteria andXpprdItm1NotBetween(Integer value1, Integer value2) {
            addCriterion("XPPRD_ITM1 not between", value1, value2, "xpprdItm1");
            return (Criteria) this;
        }

        public Criteria andClsMeIdIsNull() {
            addCriterion("CLS_ME_ID is null");
            return (Criteria) this;
        }

        public Criteria andClsMeIdIsNotNull() {
            addCriterion("CLS_ME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClsMeIdEqualTo(String value) {
            addCriterion("CLS_ME_ID =", value, "clsMeId");
            return (Criteria) this;
        }

        public Criteria andClsMeIdNotEqualTo(String value) {
            addCriterion("CLS_ME_ID <>", value, "clsMeId");
            return (Criteria) this;
        }

        public Criteria andClsMeIdGreaterThan(String value) {
            addCriterion("CLS_ME_ID >", value, "clsMeId");
            return (Criteria) this;
        }

        public Criteria andClsMeIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLS_ME_ID >=", value, "clsMeId");
            return (Criteria) this;
        }

        public Criteria andClsMeIdLessThan(String value) {
            addCriterion("CLS_ME_ID <", value, "clsMeId");
            return (Criteria) this;
        }

        public Criteria andClsMeIdLessThanOrEqualTo(String value) {
            addCriterion("CLS_ME_ID <=", value, "clsMeId");
            return (Criteria) this;
        }

        public Criteria andClsMeIdLike(String value) {
            addCriterion("CLS_ME_ID like", value, "clsMeId");
            return (Criteria) this;
        }

        public Criteria andClsMeIdNotLike(String value) {
            addCriterion("CLS_ME_ID not like", value, "clsMeId");
            return (Criteria) this;
        }

        public Criteria andClsMeIdIn(List<String> values) {
            addCriterion("CLS_ME_ID in", values, "clsMeId");
            return (Criteria) this;
        }

        public Criteria andClsMeIdNotIn(List<String> values) {
            addCriterion("CLS_ME_ID not in", values, "clsMeId");
            return (Criteria) this;
        }

        public Criteria andClsMeIdBetween(String value1, String value2) {
            addCriterion("CLS_ME_ID between", value1, value2, "clsMeId");
            return (Criteria) this;
        }

        public Criteria andClsMeIdNotBetween(String value1, String value2) {
            addCriterion("CLS_ME_ID not between", value1, value2, "clsMeId");
            return (Criteria) this;
        }

        public Criteria andUpSalIsNull() {
            addCriterion("UP_SAL is null");
            return (Criteria) this;
        }

        public Criteria andUpSalIsNotNull() {
            addCriterion("UP_SAL is not null");
            return (Criteria) this;
        }

        public Criteria andUpSalEqualTo(BigDecimal value) {
            addCriterion("UP_SAL =", value, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalNotEqualTo(BigDecimal value) {
            addCriterion("UP_SAL <>", value, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalGreaterThan(BigDecimal value) {
            addCriterion("UP_SAL >", value, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_SAL >=", value, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalLessThan(BigDecimal value) {
            addCriterion("UP_SAL <", value, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_SAL <=", value, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalIn(List<BigDecimal> values) {
            addCriterion("UP_SAL in", values, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalNotIn(List<BigDecimal> values) {
            addCriterion("UP_SAL not in", values, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_SAL between", value1, value2, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_SAL not between", value1, value2, "upSal");
            return (Criteria) this;
        }

        public Criteria andAmtnSalIsNull() {
            addCriterion("AMTN_SAL is null");
            return (Criteria) this;
        }

        public Criteria andAmtnSalIsNotNull() {
            addCriterion("AMTN_SAL is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnSalEqualTo(BigDecimal value) {
            addCriterion("AMTN_SAL =", value, "amtnSal");
            return (Criteria) this;
        }

        public Criteria andAmtnSalNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_SAL <>", value, "amtnSal");
            return (Criteria) this;
        }

        public Criteria andAmtnSalGreaterThan(BigDecimal value) {
            addCriterion("AMTN_SAL >", value, "amtnSal");
            return (Criteria) this;
        }

        public Criteria andAmtnSalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_SAL >=", value, "amtnSal");
            return (Criteria) this;
        }

        public Criteria andAmtnSalLessThan(BigDecimal value) {
            addCriterion("AMTN_SAL <", value, "amtnSal");
            return (Criteria) this;
        }

        public Criteria andAmtnSalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_SAL <=", value, "amtnSal");
            return (Criteria) this;
        }

        public Criteria andAmtnSalIn(List<BigDecimal> values) {
            addCriterion("AMTN_SAL in", values, "amtnSal");
            return (Criteria) this;
        }

        public Criteria andAmtnSalNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_SAL not in", values, "amtnSal");
            return (Criteria) this;
        }

        public Criteria andAmtnSalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_SAL between", value1, value2, "amtnSal");
            return (Criteria) this;
        }

        public Criteria andAmtnSalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_SAL not between", value1, value2, "amtnSal");
            return (Criteria) this;
        }

        public Criteria andTaskNoIsNull() {
            addCriterion("TASK_NO is null");
            return (Criteria) this;
        }

        public Criteria andTaskNoIsNotNull() {
            addCriterion("TASK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNoEqualTo(String value) {
            addCriterion("TASK_NO =", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotEqualTo(String value) {
            addCriterion("TASK_NO <>", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoGreaterThan(String value) {
            addCriterion("TASK_NO >", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_NO >=", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoLessThan(String value) {
            addCriterion("TASK_NO <", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoLessThanOrEqualTo(String value) {
            addCriterion("TASK_NO <=", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoLike(String value) {
            addCriterion("TASK_NO like", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotLike(String value) {
            addCriterion("TASK_NO not like", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoIn(List<String> values) {
            addCriterion("TASK_NO in", values, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotIn(List<String> values) {
            addCriterion("TASK_NO not in", values, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoBetween(String value1, String value2) {
            addCriterion("TASK_NO between", value1, value2, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotBetween(String value1, String value2) {
            addCriterion("TASK_NO not between", value1, value2, "taskNo");
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

        public Criteria andQtyLockIsNull() {
            addCriterion("QTY_LOCK is null");
            return (Criteria) this;
        }

        public Criteria andQtyLockIsNotNull() {
            addCriterion("QTY_LOCK is not null");
            return (Criteria) this;
        }

        public Criteria andQtyLockEqualTo(BigDecimal value) {
            addCriterion("QTY_LOCK =", value, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockNotEqualTo(BigDecimal value) {
            addCriterion("QTY_LOCK <>", value, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockGreaterThan(BigDecimal value) {
            addCriterion("QTY_LOCK >", value, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOCK >=", value, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockLessThan(BigDecimal value) {
            addCriterion("QTY_LOCK <", value, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOCK <=", value, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockIn(List<BigDecimal> values) {
            addCriterion("QTY_LOCK in", values, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockNotIn(List<BigDecimal> values) {
            addCriterion("QTY_LOCK not in", values, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOCK between", value1, value2, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOCK not between", value1, value2, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkIsNull() {
            addCriterion("QTY_LOCK_CK is null");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkIsNotNull() {
            addCriterion("QTY_LOCK_CK is not null");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkEqualTo(BigDecimal value) {
            addCriterion("QTY_LOCK_CK =", value, "qtyLockCk");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkNotEqualTo(BigDecimal value) {
            addCriterion("QTY_LOCK_CK <>", value, "qtyLockCk");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkGreaterThan(BigDecimal value) {
            addCriterion("QTY_LOCK_CK >", value, "qtyLockCk");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOCK_CK >=", value, "qtyLockCk");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkLessThan(BigDecimal value) {
            addCriterion("QTY_LOCK_CK <", value, "qtyLockCk");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOCK_CK <=", value, "qtyLockCk");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkIn(List<BigDecimal> values) {
            addCriterion("QTY_LOCK_CK in", values, "qtyLockCk");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkNotIn(List<BigDecimal> values) {
            addCriterion("QTY_LOCK_CK not in", values, "qtyLockCk");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOCK_CK between", value1, value2, "qtyLockCk");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOCK_CK not between", value1, value2, "qtyLockCk");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkUnshIsNull() {
            addCriterion("QTY_LOCK_CK_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkUnshIsNotNull() {
            addCriterion("QTY_LOCK_CK_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_LOCK_CK_UNSH =", value, "qtyLockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_LOCK_CK_UNSH <>", value, "qtyLockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_LOCK_CK_UNSH >", value, "qtyLockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOCK_CK_UNSH >=", value, "qtyLockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkUnshLessThan(BigDecimal value) {
            addCriterion("QTY_LOCK_CK_UNSH <", value, "qtyLockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOCK_CK_UNSH <=", value, "qtyLockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_LOCK_CK_UNSH in", values, "qtyLockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_LOCK_CK_UNSH not in", values, "qtyLockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOCK_CK_UNSH between", value1, value2, "qtyLockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyLockCkUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOCK_CK_UNSH not between", value1, value2, "qtyLockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andChkRepIsNull() {
            addCriterion("CHK_REP is null");
            return (Criteria) this;
        }

        public Criteria andChkRepIsNotNull() {
            addCriterion("CHK_REP is not null");
            return (Criteria) this;
        }

        public Criteria andChkRepEqualTo(String value) {
            addCriterion("CHK_REP =", value, "chkRep");
            return (Criteria) this;
        }

        public Criteria andChkRepNotEqualTo(String value) {
            addCriterion("CHK_REP <>", value, "chkRep");
            return (Criteria) this;
        }

        public Criteria andChkRepGreaterThan(String value) {
            addCriterion("CHK_REP >", value, "chkRep");
            return (Criteria) this;
        }

        public Criteria andChkRepGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_REP >=", value, "chkRep");
            return (Criteria) this;
        }

        public Criteria andChkRepLessThan(String value) {
            addCriterion("CHK_REP <", value, "chkRep");
            return (Criteria) this;
        }

        public Criteria andChkRepLessThanOrEqualTo(String value) {
            addCriterion("CHK_REP <=", value, "chkRep");
            return (Criteria) this;
        }

        public Criteria andChkRepLike(String value) {
            addCriterion("CHK_REP like", value, "chkRep");
            return (Criteria) this;
        }

        public Criteria andChkRepNotLike(String value) {
            addCriterion("CHK_REP not like", value, "chkRep");
            return (Criteria) this;
        }

        public Criteria andChkRepIn(List<String> values) {
            addCriterion("CHK_REP in", values, "chkRep");
            return (Criteria) this;
        }

        public Criteria andChkRepNotIn(List<String> values) {
            addCriterion("CHK_REP not in", values, "chkRep");
            return (Criteria) this;
        }

        public Criteria andChkRepBetween(String value1, String value2) {
            addCriterion("CHK_REP between", value1, value2, "chkRep");
            return (Criteria) this;
        }

        public Criteria andChkRepNotBetween(String value1, String value2) {
            addCriterion("CHK_REP not between", value1, value2, "chkRep");
            return (Criteria) this;
        }

        public Criteria andRemXpIsNull() {
            addCriterion("REM_XP is null");
            return (Criteria) this;
        }

        public Criteria andRemXpIsNotNull() {
            addCriterion("REM_XP is not null");
            return (Criteria) this;
        }

        public Criteria andRemXpEqualTo(String value) {
            addCriterion("REM_XP =", value, "remXp");
            return (Criteria) this;
        }

        public Criteria andRemXpNotEqualTo(String value) {
            addCriterion("REM_XP <>", value, "remXp");
            return (Criteria) this;
        }

        public Criteria andRemXpGreaterThan(String value) {
            addCriterion("REM_XP >", value, "remXp");
            return (Criteria) this;
        }

        public Criteria andRemXpGreaterThanOrEqualTo(String value) {
            addCriterion("REM_XP >=", value, "remXp");
            return (Criteria) this;
        }

        public Criteria andRemXpLessThan(String value) {
            addCriterion("REM_XP <", value, "remXp");
            return (Criteria) this;
        }

        public Criteria andRemXpLessThanOrEqualTo(String value) {
            addCriterion("REM_XP <=", value, "remXp");
            return (Criteria) this;
        }

        public Criteria andRemXpLike(String value) {
            addCriterion("REM_XP like", value, "remXp");
            return (Criteria) this;
        }

        public Criteria andRemXpNotLike(String value) {
            addCriterion("REM_XP not like", value, "remXp");
            return (Criteria) this;
        }

        public Criteria andRemXpIn(List<String> values) {
            addCriterion("REM_XP in", values, "remXp");
            return (Criteria) this;
        }

        public Criteria andRemXpNotIn(List<String> values) {
            addCriterion("REM_XP not in", values, "remXp");
            return (Criteria) this;
        }

        public Criteria andRemXpBetween(String value1, String value2) {
            addCriterion("REM_XP between", value1, value2, "remXp");
            return (Criteria) this;
        }

        public Criteria andRemXpNotBetween(String value1, String value2) {
            addCriterion("REM_XP not between", value1, value2, "remXp");
            return (Criteria) this;
        }

        public Criteria andPromoIdIsNull() {
            addCriterion("PROMO_ID is null");
            return (Criteria) this;
        }

        public Criteria andPromoIdIsNotNull() {
            addCriterion("PROMO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPromoIdEqualTo(String value) {
            addCriterion("PROMO_ID =", value, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdNotEqualTo(String value) {
            addCriterion("PROMO_ID <>", value, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdGreaterThan(String value) {
            addCriterion("PROMO_ID >", value, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROMO_ID >=", value, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdLessThan(String value) {
            addCriterion("PROMO_ID <", value, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdLessThanOrEqualTo(String value) {
            addCriterion("PROMO_ID <=", value, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdLike(String value) {
            addCriterion("PROMO_ID like", value, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdNotLike(String value) {
            addCriterion("PROMO_ID not like", value, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdIn(List<String> values) {
            addCriterion("PROMO_ID in", values, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdNotIn(List<String> values) {
            addCriterion("PROMO_ID not in", values, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdBetween(String value1, String value2) {
            addCriterion("PROMO_ID between", value1, value2, "promoId");
            return (Criteria) this;
        }

        public Criteria andPromoIdNotBetween(String value1, String value2) {
            addCriterion("PROMO_ID not between", value1, value2, "promoId");
            return (Criteria) this;
        }

        public Criteria andFrelationIsNull() {
            addCriterion("FRELATION is null");
            return (Criteria) this;
        }

        public Criteria andFrelationIsNotNull() {
            addCriterion("FRELATION is not null");
            return (Criteria) this;
        }

        public Criteria andFrelationEqualTo(String value) {
            addCriterion("FRELATION =", value, "frelation");
            return (Criteria) this;
        }

        public Criteria andFrelationNotEqualTo(String value) {
            addCriterion("FRELATION <>", value, "frelation");
            return (Criteria) this;
        }

        public Criteria andFrelationGreaterThan(String value) {
            addCriterion("FRELATION >", value, "frelation");
            return (Criteria) this;
        }

        public Criteria andFrelationGreaterThanOrEqualTo(String value) {
            addCriterion("FRELATION >=", value, "frelation");
            return (Criteria) this;
        }

        public Criteria andFrelationLessThan(String value) {
            addCriterion("FRELATION <", value, "frelation");
            return (Criteria) this;
        }

        public Criteria andFrelationLessThanOrEqualTo(String value) {
            addCriterion("FRELATION <=", value, "frelation");
            return (Criteria) this;
        }

        public Criteria andFrelationLike(String value) {
            addCriterion("FRELATION like", value, "frelation");
            return (Criteria) this;
        }

        public Criteria andFrelationNotLike(String value) {
            addCriterion("FRELATION not like", value, "frelation");
            return (Criteria) this;
        }

        public Criteria andFrelationIn(List<String> values) {
            addCriterion("FRELATION in", values, "frelation");
            return (Criteria) this;
        }

        public Criteria andFrelationNotIn(List<String> values) {
            addCriterion("FRELATION not in", values, "frelation");
            return (Criteria) this;
        }

        public Criteria andFrelationBetween(String value1, String value2) {
            addCriterion("FRELATION between", value1, value2, "frelation");
            return (Criteria) this;
        }

        public Criteria andFrelationNotBetween(String value1, String value2) {
            addCriterion("FRELATION not between", value1, value2, "frelation");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIsNull() {
            addCriterion("RECORD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIsNotNull() {
            addCriterion("RECORD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTypeEqualTo(Short value) {
            addCriterion("RECORD_TYPE =", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotEqualTo(Short value) {
            addCriterion("RECORD_TYPE <>", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeGreaterThan(Short value) {
            addCriterion("RECORD_TYPE >", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("RECORD_TYPE >=", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLessThan(Short value) {
            addCriterion("RECORD_TYPE <", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLessThanOrEqualTo(Short value) {
            addCriterion("RECORD_TYPE <=", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIn(List<Short> values) {
            addCriterion("RECORD_TYPE in", values, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotIn(List<Short> values) {
            addCriterion("RECORD_TYPE not in", values, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeBetween(Short value1, Short value2) {
            addCriterion("RECORD_TYPE between", value1, value2, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotBetween(Short value1, Short value2) {
            addCriterion("RECORD_TYPE not between", value1, value2, "recordType");
            return (Criteria) this;
        }

        public Criteria andZpBeizsmmIsNull() {
            addCriterion("ZP_BEIZSMM is null");
            return (Criteria) this;
        }

        public Criteria andZpBeizsmmIsNotNull() {
            addCriterion("ZP_BEIZSMM is not null");
            return (Criteria) this;
        }

        public Criteria andZpBeizsmmEqualTo(String value) {
            addCriterion("ZP_BEIZSMM =", value, "zpBeizsmm");
            return (Criteria) this;
        }

        public Criteria andZpBeizsmmNotEqualTo(String value) {
            addCriterion("ZP_BEIZSMM <>", value, "zpBeizsmm");
            return (Criteria) this;
        }

        public Criteria andZpBeizsmmGreaterThan(String value) {
            addCriterion("ZP_BEIZSMM >", value, "zpBeizsmm");
            return (Criteria) this;
        }

        public Criteria andZpBeizsmmGreaterThanOrEqualTo(String value) {
            addCriterion("ZP_BEIZSMM >=", value, "zpBeizsmm");
            return (Criteria) this;
        }

        public Criteria andZpBeizsmmLessThan(String value) {
            addCriterion("ZP_BEIZSMM <", value, "zpBeizsmm");
            return (Criteria) this;
        }

        public Criteria andZpBeizsmmLessThanOrEqualTo(String value) {
            addCriterion("ZP_BEIZSMM <=", value, "zpBeizsmm");
            return (Criteria) this;
        }

        public Criteria andZpBeizsmmLike(String value) {
            addCriterion("ZP_BEIZSMM like", value, "zpBeizsmm");
            return (Criteria) this;
        }

        public Criteria andZpBeizsmmNotLike(String value) {
            addCriterion("ZP_BEIZSMM not like", value, "zpBeizsmm");
            return (Criteria) this;
        }

        public Criteria andZpBeizsmmIn(List<String> values) {
            addCriterion("ZP_BEIZSMM in", values, "zpBeizsmm");
            return (Criteria) this;
        }

        public Criteria andZpBeizsmmNotIn(List<String> values) {
            addCriterion("ZP_BEIZSMM not in", values, "zpBeizsmm");
            return (Criteria) this;
        }

        public Criteria andZpBeizsmmBetween(String value1, String value2) {
            addCriterion("ZP_BEIZSMM between", value1, value2, "zpBeizsmm");
            return (Criteria) this;
        }

        public Criteria andZpBeizsmmNotBetween(String value1, String value2) {
            addCriterion("ZP_BEIZSMM not between", value1, value2, "zpBeizsmm");
            return (Criteria) this;
        }

        public Criteria andZpChkvalIsNull() {
            addCriterion("ZP_CHKVAL is null");
            return (Criteria) this;
        }

        public Criteria andZpChkvalIsNotNull() {
            addCriterion("ZP_CHKVAL is not null");
            return (Criteria) this;
        }

        public Criteria andZpChkvalEqualTo(String value) {
            addCriterion("ZP_CHKVAL =", value, "zpChkval");
            return (Criteria) this;
        }

        public Criteria andZpChkvalNotEqualTo(String value) {
            addCriterion("ZP_CHKVAL <>", value, "zpChkval");
            return (Criteria) this;
        }

        public Criteria andZpChkvalGreaterThan(String value) {
            addCriterion("ZP_CHKVAL >", value, "zpChkval");
            return (Criteria) this;
        }

        public Criteria andZpChkvalGreaterThanOrEqualTo(String value) {
            addCriterion("ZP_CHKVAL >=", value, "zpChkval");
            return (Criteria) this;
        }

        public Criteria andZpChkvalLessThan(String value) {
            addCriterion("ZP_CHKVAL <", value, "zpChkval");
            return (Criteria) this;
        }

        public Criteria andZpChkvalLessThanOrEqualTo(String value) {
            addCriterion("ZP_CHKVAL <=", value, "zpChkval");
            return (Criteria) this;
        }

        public Criteria andZpChkvalLike(String value) {
            addCriterion("ZP_CHKVAL like", value, "zpChkval");
            return (Criteria) this;
        }

        public Criteria andZpChkvalNotLike(String value) {
            addCriterion("ZP_CHKVAL not like", value, "zpChkval");
            return (Criteria) this;
        }

        public Criteria andZpChkvalIn(List<String> values) {
            addCriterion("ZP_CHKVAL in", values, "zpChkval");
            return (Criteria) this;
        }

        public Criteria andZpChkvalNotIn(List<String> values) {
            addCriterion("ZP_CHKVAL not in", values, "zpChkval");
            return (Criteria) this;
        }

        public Criteria andZpChkvalBetween(String value1, String value2) {
            addCriterion("ZP_CHKVAL between", value1, value2, "zpChkval");
            return (Criteria) this;
        }

        public Criteria andZpChkvalNotBetween(String value1, String value2) {
            addCriterion("ZP_CHKVAL not between", value1, value2, "zpChkval");
            return (Criteria) this;
        }

        public Criteria andKeyItmIsNull() {
            addCriterion("KEY_ITM is null");
            return (Criteria) this;
        }

        public Criteria andKeyItmIsNotNull() {
            addCriterion("KEY_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andKeyItmEqualTo(Integer value) {
            addCriterion("KEY_ITM =", value, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmNotEqualTo(Integer value) {
            addCriterion("KEY_ITM <>", value, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmGreaterThan(Integer value) {
            addCriterion("KEY_ITM >", value, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("KEY_ITM >=", value, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmLessThan(Integer value) {
            addCriterion("KEY_ITM <", value, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmLessThanOrEqualTo(Integer value) {
            addCriterion("KEY_ITM <=", value, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmIn(List<Integer> values) {
            addCriterion("KEY_ITM in", values, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmNotIn(List<Integer> values) {
            addCriterion("KEY_ITM not in", values, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmBetween(Integer value1, Integer value2) {
            addCriterion("KEY_ITM between", value1, value2, "keyItm");
            return (Criteria) this;
        }

        public Criteria andKeyItmNotBetween(Integer value1, Integer value2) {
            addCriterion("KEY_ITM not between", value1, value2, "keyItm");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkEngIsNull() {
            addCriterion("REMARK_ENG is null");
            return (Criteria) this;
        }

        public Criteria andRemarkEngIsNotNull() {
            addCriterion("REMARK_ENG is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEngEqualTo(String value) {
            addCriterion("REMARK_ENG =", value, "remarkEng");
            return (Criteria) this;
        }

        public Criteria andRemarkEngNotEqualTo(String value) {
            addCriterion("REMARK_ENG <>", value, "remarkEng");
            return (Criteria) this;
        }

        public Criteria andRemarkEngGreaterThan(String value) {
            addCriterion("REMARK_ENG >", value, "remarkEng");
            return (Criteria) this;
        }

        public Criteria andRemarkEngGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK_ENG >=", value, "remarkEng");
            return (Criteria) this;
        }

        public Criteria andRemarkEngLessThan(String value) {
            addCriterion("REMARK_ENG <", value, "remarkEng");
            return (Criteria) this;
        }

        public Criteria andRemarkEngLessThanOrEqualTo(String value) {
            addCriterion("REMARK_ENG <=", value, "remarkEng");
            return (Criteria) this;
        }

        public Criteria andRemarkEngLike(String value) {
            addCriterion("REMARK_ENG like", value, "remarkEng");
            return (Criteria) this;
        }

        public Criteria andRemarkEngNotLike(String value) {
            addCriterion("REMARK_ENG not like", value, "remarkEng");
            return (Criteria) this;
        }

        public Criteria andRemarkEngIn(List<String> values) {
            addCriterion("REMARK_ENG in", values, "remarkEng");
            return (Criteria) this;
        }

        public Criteria andRemarkEngNotIn(List<String> values) {
            addCriterion("REMARK_ENG not in", values, "remarkEng");
            return (Criteria) this;
        }

        public Criteria andRemarkEngBetween(String value1, String value2) {
            addCriterion("REMARK_ENG between", value1, value2, "remarkEng");
            return (Criteria) this;
        }

        public Criteria andRemarkEngNotBetween(String value1, String value2) {
            addCriterion("REMARK_ENG not between", value1, value2, "remarkEng");
            return (Criteria) this;
        }

        public Criteria andCusKhNoIsNull() {
            addCriterion("CUS_KH_NO is null");
            return (Criteria) this;
        }

        public Criteria andCusKhNoIsNotNull() {
            addCriterion("CUS_KH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCusKhNoEqualTo(String value) {
            addCriterion("CUS_KH_NO =", value, "cusKhNo");
            return (Criteria) this;
        }

        public Criteria andCusKhNoNotEqualTo(String value) {
            addCriterion("CUS_KH_NO <>", value, "cusKhNo");
            return (Criteria) this;
        }

        public Criteria andCusKhNoGreaterThan(String value) {
            addCriterion("CUS_KH_NO >", value, "cusKhNo");
            return (Criteria) this;
        }

        public Criteria andCusKhNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_KH_NO >=", value, "cusKhNo");
            return (Criteria) this;
        }

        public Criteria andCusKhNoLessThan(String value) {
            addCriterion("CUS_KH_NO <", value, "cusKhNo");
            return (Criteria) this;
        }

        public Criteria andCusKhNoLessThanOrEqualTo(String value) {
            addCriterion("CUS_KH_NO <=", value, "cusKhNo");
            return (Criteria) this;
        }

        public Criteria andCusKhNoLike(String value) {
            addCriterion("CUS_KH_NO like", value, "cusKhNo");
            return (Criteria) this;
        }

        public Criteria andCusKhNoNotLike(String value) {
            addCriterion("CUS_KH_NO not like", value, "cusKhNo");
            return (Criteria) this;
        }

        public Criteria andCusKhNoIn(List<String> values) {
            addCriterion("CUS_KH_NO in", values, "cusKhNo");
            return (Criteria) this;
        }

        public Criteria andCusKhNoNotIn(List<String> values) {
            addCriterion("CUS_KH_NO not in", values, "cusKhNo");
            return (Criteria) this;
        }

        public Criteria andCusKhNoBetween(String value1, String value2) {
            addCriterion("CUS_KH_NO between", value1, value2, "cusKhNo");
            return (Criteria) this;
        }

        public Criteria andCusKhNoNotBetween(String value1, String value2) {
            addCriterion("CUS_KH_NO not between", value1, value2, "cusKhNo");
            return (Criteria) this;
        }

        public Criteria andGroupDepIsNull() {
            addCriterion("GROUP_DEP is null");
            return (Criteria) this;
        }

        public Criteria andGroupDepIsNotNull() {
            addCriterion("GROUP_DEP is not null");
            return (Criteria) this;
        }

        public Criteria andGroupDepEqualTo(String value) {
            addCriterion("GROUP_DEP =", value, "groupDep");
            return (Criteria) this;
        }

        public Criteria andGroupDepNotEqualTo(String value) {
            addCriterion("GROUP_DEP <>", value, "groupDep");
            return (Criteria) this;
        }

        public Criteria andGroupDepGreaterThan(String value) {
            addCriterion("GROUP_DEP >", value, "groupDep");
            return (Criteria) this;
        }

        public Criteria andGroupDepGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_DEP >=", value, "groupDep");
            return (Criteria) this;
        }

        public Criteria andGroupDepLessThan(String value) {
            addCriterion("GROUP_DEP <", value, "groupDep");
            return (Criteria) this;
        }

        public Criteria andGroupDepLessThanOrEqualTo(String value) {
            addCriterion("GROUP_DEP <=", value, "groupDep");
            return (Criteria) this;
        }

        public Criteria andGroupDepLike(String value) {
            addCriterion("GROUP_DEP like", value, "groupDep");
            return (Criteria) this;
        }

        public Criteria andGroupDepNotLike(String value) {
            addCriterion("GROUP_DEP not like", value, "groupDep");
            return (Criteria) this;
        }

        public Criteria andGroupDepIn(List<String> values) {
            addCriterion("GROUP_DEP in", values, "groupDep");
            return (Criteria) this;
        }

        public Criteria andGroupDepNotIn(List<String> values) {
            addCriterion("GROUP_DEP not in", values, "groupDep");
            return (Criteria) this;
        }

        public Criteria andGroupDepBetween(String value1, String value2) {
            addCriterion("GROUP_DEP between", value1, value2, "groupDep");
            return (Criteria) this;
        }

        public Criteria andGroupDepNotBetween(String value1, String value2) {
            addCriterion("GROUP_DEP not between", value1, value2, "groupDep");
            return (Criteria) this;
        }

        public Criteria andQty1PreIsNull() {
            addCriterion("QTY1_PRE is null");
            return (Criteria) this;
        }

        public Criteria andQty1PreIsNotNull() {
            addCriterion("QTY1_PRE is not null");
            return (Criteria) this;
        }

        public Criteria andQty1PreEqualTo(BigDecimal value) {
            addCriterion("QTY1_PRE =", value, "qty1Pre");
            return (Criteria) this;
        }

        public Criteria andQty1PreNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_PRE <>", value, "qty1Pre");
            return (Criteria) this;
        }

        public Criteria andQty1PreGreaterThan(BigDecimal value) {
            addCriterion("QTY1_PRE >", value, "qty1Pre");
            return (Criteria) this;
        }

        public Criteria andQty1PreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_PRE >=", value, "qty1Pre");
            return (Criteria) this;
        }

        public Criteria andQty1PreLessThan(BigDecimal value) {
            addCriterion("QTY1_PRE <", value, "qty1Pre");
            return (Criteria) this;
        }

        public Criteria andQty1PreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_PRE <=", value, "qty1Pre");
            return (Criteria) this;
        }

        public Criteria andQty1PreIn(List<BigDecimal> values) {
            addCriterion("QTY1_PRE in", values, "qty1Pre");
            return (Criteria) this;
        }

        public Criteria andQty1PreNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_PRE not in", values, "qty1Pre");
            return (Criteria) this;
        }

        public Criteria andQty1PreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_PRE between", value1, value2, "qty1Pre");
            return (Criteria) this;
        }

        public Criteria andQty1PreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_PRE not between", value1, value2, "qty1Pre");
            return (Criteria) this;
        }

        public Criteria andQty1PreUnshIsNull() {
            addCriterion("QTY1_PRE_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQty1PreUnshIsNotNull() {
            addCriterion("QTY1_PRE_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQty1PreUnshEqualTo(BigDecimal value) {
            addCriterion("QTY1_PRE_UNSH =", value, "qty1PreUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PreUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_PRE_UNSH <>", value, "qty1PreUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PreUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY1_PRE_UNSH >", value, "qty1PreUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PreUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_PRE_UNSH >=", value, "qty1PreUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PreUnshLessThan(BigDecimal value) {
            addCriterion("QTY1_PRE_UNSH <", value, "qty1PreUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PreUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_PRE_UNSH <=", value, "qty1PreUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PreUnshIn(List<BigDecimal> values) {
            addCriterion("QTY1_PRE_UNSH in", values, "qty1PreUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PreUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_PRE_UNSH not in", values, "qty1PreUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PreUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_PRE_UNSH between", value1, value2, "qty1PreUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1PreUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_PRE_UNSH not between", value1, value2, "qty1PreUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1LockIsNull() {
            addCriterion("QTY1_LOCK is null");
            return (Criteria) this;
        }

        public Criteria andQty1LockIsNotNull() {
            addCriterion("QTY1_LOCK is not null");
            return (Criteria) this;
        }

        public Criteria andQty1LockEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOCK =", value, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOCK <>", value, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockGreaterThan(BigDecimal value) {
            addCriterion("QTY1_LOCK >", value, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOCK >=", value, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockLessThan(BigDecimal value) {
            addCriterion("QTY1_LOCK <", value, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOCK <=", value, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockIn(List<BigDecimal> values) {
            addCriterion("QTY1_LOCK in", values, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_LOCK not in", values, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_LOCK between", value1, value2, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_LOCK not between", value1, value2, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkIsNull() {
            addCriterion("QTY1_LOCK_CK is null");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkIsNotNull() {
            addCriterion("QTY1_LOCK_CK is not null");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOCK_CK =", value, "qty1LockCk");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOCK_CK <>", value, "qty1LockCk");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkGreaterThan(BigDecimal value) {
            addCriterion("QTY1_LOCK_CK >", value, "qty1LockCk");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOCK_CK >=", value, "qty1LockCk");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkLessThan(BigDecimal value) {
            addCriterion("QTY1_LOCK_CK <", value, "qty1LockCk");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOCK_CK <=", value, "qty1LockCk");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkIn(List<BigDecimal> values) {
            addCriterion("QTY1_LOCK_CK in", values, "qty1LockCk");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_LOCK_CK not in", values, "qty1LockCk");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_LOCK_CK between", value1, value2, "qty1LockCk");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_LOCK_CK not between", value1, value2, "qty1LockCk");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkUnshIsNull() {
            addCriterion("QTY1_LOCK_CK_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkUnshIsNotNull() {
            addCriterion("QTY1_LOCK_CK_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkUnshEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOCK_CK_UNSH =", value, "qty1LockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOCK_CK_UNSH <>", value, "qty1LockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY1_LOCK_CK_UNSH >", value, "qty1LockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOCK_CK_UNSH >=", value, "qty1LockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkUnshLessThan(BigDecimal value) {
            addCriterion("QTY1_LOCK_CK_UNSH <", value, "qty1LockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOCK_CK_UNSH <=", value, "qty1LockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkUnshIn(List<BigDecimal> values) {
            addCriterion("QTY1_LOCK_CK_UNSH in", values, "qty1LockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_LOCK_CK_UNSH not in", values, "qty1LockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_LOCK_CK_UNSH between", value1, value2, "qty1LockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1LockCkUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_LOCK_CK_UNSH not between", value1, value2, "qty1LockCkUnsh");
            return (Criteria) this;
        }

        public Criteria andMallTidIsNull() {
            addCriterion("MALL_TID is null");
            return (Criteria) this;
        }

        public Criteria andMallTidIsNotNull() {
            addCriterion("MALL_TID is not null");
            return (Criteria) this;
        }

        public Criteria andMallTidEqualTo(String value) {
            addCriterion("MALL_TID =", value, "mallTid");
            return (Criteria) this;
        }

        public Criteria andMallTidNotEqualTo(String value) {
            addCriterion("MALL_TID <>", value, "mallTid");
            return (Criteria) this;
        }

        public Criteria andMallTidGreaterThan(String value) {
            addCriterion("MALL_TID >", value, "mallTid");
            return (Criteria) this;
        }

        public Criteria andMallTidGreaterThanOrEqualTo(String value) {
            addCriterion("MALL_TID >=", value, "mallTid");
            return (Criteria) this;
        }

        public Criteria andMallTidLessThan(String value) {
            addCriterion("MALL_TID <", value, "mallTid");
            return (Criteria) this;
        }

        public Criteria andMallTidLessThanOrEqualTo(String value) {
            addCriterion("MALL_TID <=", value, "mallTid");
            return (Criteria) this;
        }

        public Criteria andMallTidLike(String value) {
            addCriterion("MALL_TID like", value, "mallTid");
            return (Criteria) this;
        }

        public Criteria andMallTidNotLike(String value) {
            addCriterion("MALL_TID not like", value, "mallTid");
            return (Criteria) this;
        }

        public Criteria andMallTidIn(List<String> values) {
            addCriterion("MALL_TID in", values, "mallTid");
            return (Criteria) this;
        }

        public Criteria andMallTidNotIn(List<String> values) {
            addCriterion("MALL_TID not in", values, "mallTid");
            return (Criteria) this;
        }

        public Criteria andMallTidBetween(String value1, String value2) {
            addCriterion("MALL_TID between", value1, value2, "mallTid");
            return (Criteria) this;
        }

        public Criteria andMallTidNotBetween(String value1, String value2) {
            addCriterion("MALL_TID not between", value1, value2, "mallTid");
            return (Criteria) this;
        }

        public Criteria andIssplitIsNull() {
            addCriterion("ISSPLIT is null");
            return (Criteria) this;
        }

        public Criteria andIssplitIsNotNull() {
            addCriterion("ISSPLIT is not null");
            return (Criteria) this;
        }

        public Criteria andIssplitEqualTo(String value) {
            addCriterion("ISSPLIT =", value, "issplit");
            return (Criteria) this;
        }

        public Criteria andIssplitNotEqualTo(String value) {
            addCriterion("ISSPLIT <>", value, "issplit");
            return (Criteria) this;
        }

        public Criteria andIssplitGreaterThan(String value) {
            addCriterion("ISSPLIT >", value, "issplit");
            return (Criteria) this;
        }

        public Criteria andIssplitGreaterThanOrEqualTo(String value) {
            addCriterion("ISSPLIT >=", value, "issplit");
            return (Criteria) this;
        }

        public Criteria andIssplitLessThan(String value) {
            addCriterion("ISSPLIT <", value, "issplit");
            return (Criteria) this;
        }

        public Criteria andIssplitLessThanOrEqualTo(String value) {
            addCriterion("ISSPLIT <=", value, "issplit");
            return (Criteria) this;
        }

        public Criteria andIssplitLike(String value) {
            addCriterion("ISSPLIT like", value, "issplit");
            return (Criteria) this;
        }

        public Criteria andIssplitNotLike(String value) {
            addCriterion("ISSPLIT not like", value, "issplit");
            return (Criteria) this;
        }

        public Criteria andIssplitIn(List<String> values) {
            addCriterion("ISSPLIT in", values, "issplit");
            return (Criteria) this;
        }

        public Criteria andIssplitNotIn(List<String> values) {
            addCriterion("ISSPLIT not in", values, "issplit");
            return (Criteria) this;
        }

        public Criteria andIssplitBetween(String value1, String value2) {
            addCriterion("ISSPLIT between", value1, value2, "issplit");
            return (Criteria) this;
        }

        public Criteria andIssplitNotBetween(String value1, String value2) {
            addCriterion("ISSPLIT not between", value1, value2, "issplit");
            return (Criteria) this;
        }

        public Criteria andChkXzlIsNull() {
            addCriterion("CHK_XZL is null");
            return (Criteria) this;
        }

        public Criteria andChkXzlIsNotNull() {
            addCriterion("CHK_XZL is not null");
            return (Criteria) this;
        }

        public Criteria andChkXzlEqualTo(String value) {
            addCriterion("CHK_XZL =", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlNotEqualTo(String value) {
            addCriterion("CHK_XZL <>", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlGreaterThan(String value) {
            addCriterion("CHK_XZL >", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_XZL >=", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlLessThan(String value) {
            addCriterion("CHK_XZL <", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlLessThanOrEqualTo(String value) {
            addCriterion("CHK_XZL <=", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlLike(String value) {
            addCriterion("CHK_XZL like", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlNotLike(String value) {
            addCriterion("CHK_XZL not like", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlIn(List<String> values) {
            addCriterion("CHK_XZL in", values, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlNotIn(List<String> values) {
            addCriterion("CHK_XZL not in", values, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlBetween(String value1, String value2) {
            addCriterion("CHK_XZL between", value1, value2, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlNotBetween(String value1, String value2) {
            addCriterion("CHK_XZL not between", value1, value2, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andUncfmIdIsNull() {
            addCriterion("UNCFM_ID is null");
            return (Criteria) this;
        }

        public Criteria andUncfmIdIsNotNull() {
            addCriterion("UNCFM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUncfmIdEqualTo(String value) {
            addCriterion("UNCFM_ID =", value, "uncfmId");
            return (Criteria) this;
        }

        public Criteria andUncfmIdNotEqualTo(String value) {
            addCriterion("UNCFM_ID <>", value, "uncfmId");
            return (Criteria) this;
        }

        public Criteria andUncfmIdGreaterThan(String value) {
            addCriterion("UNCFM_ID >", value, "uncfmId");
            return (Criteria) this;
        }

        public Criteria andUncfmIdGreaterThanOrEqualTo(String value) {
            addCriterion("UNCFM_ID >=", value, "uncfmId");
            return (Criteria) this;
        }

        public Criteria andUncfmIdLessThan(String value) {
            addCriterion("UNCFM_ID <", value, "uncfmId");
            return (Criteria) this;
        }

        public Criteria andUncfmIdLessThanOrEqualTo(String value) {
            addCriterion("UNCFM_ID <=", value, "uncfmId");
            return (Criteria) this;
        }

        public Criteria andUncfmIdLike(String value) {
            addCriterion("UNCFM_ID like", value, "uncfmId");
            return (Criteria) this;
        }

        public Criteria andUncfmIdNotLike(String value) {
            addCriterion("UNCFM_ID not like", value, "uncfmId");
            return (Criteria) this;
        }

        public Criteria andUncfmIdIn(List<String> values) {
            addCriterion("UNCFM_ID in", values, "uncfmId");
            return (Criteria) this;
        }

        public Criteria andUncfmIdNotIn(List<String> values) {
            addCriterion("UNCFM_ID not in", values, "uncfmId");
            return (Criteria) this;
        }

        public Criteria andUncfmIdBetween(String value1, String value2) {
            addCriterion("UNCFM_ID between", value1, value2, "uncfmId");
            return (Criteria) this;
        }

        public Criteria andUncfmIdNotBetween(String value1, String value2) {
            addCriterion("UNCFM_ID not between", value1, value2, "uncfmId");
            return (Criteria) this;
        }

        public Criteria andUncfmUsrIsNull() {
            addCriterion("UNCFM_USR is null");
            return (Criteria) this;
        }

        public Criteria andUncfmUsrIsNotNull() {
            addCriterion("UNCFM_USR is not null");
            return (Criteria) this;
        }

        public Criteria andUncfmUsrEqualTo(String value) {
            addCriterion("UNCFM_USR =", value, "uncfmUsr");
            return (Criteria) this;
        }

        public Criteria andUncfmUsrNotEqualTo(String value) {
            addCriterion("UNCFM_USR <>", value, "uncfmUsr");
            return (Criteria) this;
        }

        public Criteria andUncfmUsrGreaterThan(String value) {
            addCriterion("UNCFM_USR >", value, "uncfmUsr");
            return (Criteria) this;
        }

        public Criteria andUncfmUsrGreaterThanOrEqualTo(String value) {
            addCriterion("UNCFM_USR >=", value, "uncfmUsr");
            return (Criteria) this;
        }

        public Criteria andUncfmUsrLessThan(String value) {
            addCriterion("UNCFM_USR <", value, "uncfmUsr");
            return (Criteria) this;
        }

        public Criteria andUncfmUsrLessThanOrEqualTo(String value) {
            addCriterion("UNCFM_USR <=", value, "uncfmUsr");
            return (Criteria) this;
        }

        public Criteria andUncfmUsrLike(String value) {
            addCriterion("UNCFM_USR like", value, "uncfmUsr");
            return (Criteria) this;
        }

        public Criteria andUncfmUsrNotLike(String value) {
            addCriterion("UNCFM_USR not like", value, "uncfmUsr");
            return (Criteria) this;
        }

        public Criteria andUncfmUsrIn(List<String> values) {
            addCriterion("UNCFM_USR in", values, "uncfmUsr");
            return (Criteria) this;
        }

        public Criteria andUncfmUsrNotIn(List<String> values) {
            addCriterion("UNCFM_USR not in", values, "uncfmUsr");
            return (Criteria) this;
        }

        public Criteria andUncfmUsrBetween(String value1, String value2) {
            addCriterion("UNCFM_USR between", value1, value2, "uncfmUsr");
            return (Criteria) this;
        }

        public Criteria andUncfmUsrNotBetween(String value1, String value2) {
            addCriterion("UNCFM_USR not between", value1, value2, "uncfmUsr");
            return (Criteria) this;
        }

        public Criteria andUncfmDateIsNull() {
            addCriterion("UNCFM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUncfmDateIsNotNull() {
            addCriterion("UNCFM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUncfmDateEqualTo(Date value) {
            addCriterion("UNCFM_DATE =", value, "uncfmDate");
            return (Criteria) this;
        }

        public Criteria andUncfmDateNotEqualTo(Date value) {
            addCriterion("UNCFM_DATE <>", value, "uncfmDate");
            return (Criteria) this;
        }

        public Criteria andUncfmDateGreaterThan(Date value) {
            addCriterion("UNCFM_DATE >", value, "uncfmDate");
            return (Criteria) this;
        }

        public Criteria andUncfmDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UNCFM_DATE >=", value, "uncfmDate");
            return (Criteria) this;
        }

        public Criteria andUncfmDateLessThan(Date value) {
            addCriterion("UNCFM_DATE <", value, "uncfmDate");
            return (Criteria) this;
        }

        public Criteria andUncfmDateLessThanOrEqualTo(Date value) {
            addCriterion("UNCFM_DATE <=", value, "uncfmDate");
            return (Criteria) this;
        }

        public Criteria andUncfmDateIn(List<Date> values) {
            addCriterion("UNCFM_DATE in", values, "uncfmDate");
            return (Criteria) this;
        }

        public Criteria andUncfmDateNotIn(List<Date> values) {
            addCriterion("UNCFM_DATE not in", values, "uncfmDate");
            return (Criteria) this;
        }

        public Criteria andUncfmDateBetween(Date value1, Date value2) {
            addCriterion("UNCFM_DATE between", value1, value2, "uncfmDate");
            return (Criteria) this;
        }

        public Criteria andUncfmDateNotBetween(Date value1, Date value2) {
            addCriterion("UNCFM_DATE not between", value1, value2, "uncfmDate");
            return (Criteria) this;
        }

        public Criteria andScTbNoIsNull() {
            addCriterion("SC_TB_NO is null");
            return (Criteria) this;
        }

        public Criteria andScTbNoIsNotNull() {
            addCriterion("SC_TB_NO is not null");
            return (Criteria) this;
        }

        public Criteria andScTbNoEqualTo(String value) {
            addCriterion("SC_TB_NO =", value, "scTbNo");
            return (Criteria) this;
        }

        public Criteria andScTbNoNotEqualTo(String value) {
            addCriterion("SC_TB_NO <>", value, "scTbNo");
            return (Criteria) this;
        }

        public Criteria andScTbNoGreaterThan(String value) {
            addCriterion("SC_TB_NO >", value, "scTbNo");
            return (Criteria) this;
        }

        public Criteria andScTbNoGreaterThanOrEqualTo(String value) {
            addCriterion("SC_TB_NO >=", value, "scTbNo");
            return (Criteria) this;
        }

        public Criteria andScTbNoLessThan(String value) {
            addCriterion("SC_TB_NO <", value, "scTbNo");
            return (Criteria) this;
        }

        public Criteria andScTbNoLessThanOrEqualTo(String value) {
            addCriterion("SC_TB_NO <=", value, "scTbNo");
            return (Criteria) this;
        }

        public Criteria andScTbNoLike(String value) {
            addCriterion("SC_TB_NO like", value, "scTbNo");
            return (Criteria) this;
        }

        public Criteria andScTbNoNotLike(String value) {
            addCriterion("SC_TB_NO not like", value, "scTbNo");
            return (Criteria) this;
        }

        public Criteria andScTbNoIn(List<String> values) {
            addCriterion("SC_TB_NO in", values, "scTbNo");
            return (Criteria) this;
        }

        public Criteria andScTbNoNotIn(List<String> values) {
            addCriterion("SC_TB_NO not in", values, "scTbNo");
            return (Criteria) this;
        }

        public Criteria andScTbNoBetween(String value1, String value2) {
            addCriterion("SC_TB_NO between", value1, value2, "scTbNo");
            return (Criteria) this;
        }

        public Criteria andScTbNoNotBetween(String value1, String value2) {
            addCriterion("SC_TB_NO not between", value1, value2, "scTbNo");
            return (Criteria) this;
        }

        public Criteria andSupRepDate1IsNull() {
            addCriterion("SUP_REP_DATE1 is null");
            return (Criteria) this;
        }

        public Criteria andSupRepDate1IsNotNull() {
            addCriterion("SUP_REP_DATE1 is not null");
            return (Criteria) this;
        }

        public Criteria andSupRepDate1EqualTo(Date value) {
            addCriterion("SUP_REP_DATE1 =", value, "supRepDate1");
            return (Criteria) this;
        }

        public Criteria andSupRepDate1NotEqualTo(Date value) {
            addCriterion("SUP_REP_DATE1 <>", value, "supRepDate1");
            return (Criteria) this;
        }

        public Criteria andSupRepDate1GreaterThan(Date value) {
            addCriterion("SUP_REP_DATE1 >", value, "supRepDate1");
            return (Criteria) this;
        }

        public Criteria andSupRepDate1GreaterThanOrEqualTo(Date value) {
            addCriterion("SUP_REP_DATE1 >=", value, "supRepDate1");
            return (Criteria) this;
        }

        public Criteria andSupRepDate1LessThan(Date value) {
            addCriterion("SUP_REP_DATE1 <", value, "supRepDate1");
            return (Criteria) this;
        }

        public Criteria andSupRepDate1LessThanOrEqualTo(Date value) {
            addCriterion("SUP_REP_DATE1 <=", value, "supRepDate1");
            return (Criteria) this;
        }

        public Criteria andSupRepDate1In(List<Date> values) {
            addCriterion("SUP_REP_DATE1 in", values, "supRepDate1");
            return (Criteria) this;
        }

        public Criteria andSupRepDate1NotIn(List<Date> values) {
            addCriterion("SUP_REP_DATE1 not in", values, "supRepDate1");
            return (Criteria) this;
        }

        public Criteria andSupRepDate1Between(Date value1, Date value2) {
            addCriterion("SUP_REP_DATE1 between", value1, value2, "supRepDate1");
            return (Criteria) this;
        }

        public Criteria andSupRepDate1NotBetween(Date value1, Date value2) {
            addCriterion("SUP_REP_DATE1 not between", value1, value2, "supRepDate1");
            return (Criteria) this;
        }

        public Criteria andSupRepDate2IsNull() {
            addCriterion("SUP_REP_DATE2 is null");
            return (Criteria) this;
        }

        public Criteria andSupRepDate2IsNotNull() {
            addCriterion("SUP_REP_DATE2 is not null");
            return (Criteria) this;
        }

        public Criteria andSupRepDate2EqualTo(Date value) {
            addCriterion("SUP_REP_DATE2 =", value, "supRepDate2");
            return (Criteria) this;
        }

        public Criteria andSupRepDate2NotEqualTo(Date value) {
            addCriterion("SUP_REP_DATE2 <>", value, "supRepDate2");
            return (Criteria) this;
        }

        public Criteria andSupRepDate2GreaterThan(Date value) {
            addCriterion("SUP_REP_DATE2 >", value, "supRepDate2");
            return (Criteria) this;
        }

        public Criteria andSupRepDate2GreaterThanOrEqualTo(Date value) {
            addCriterion("SUP_REP_DATE2 >=", value, "supRepDate2");
            return (Criteria) this;
        }

        public Criteria andSupRepDate2LessThan(Date value) {
            addCriterion("SUP_REP_DATE2 <", value, "supRepDate2");
            return (Criteria) this;
        }

        public Criteria andSupRepDate2LessThanOrEqualTo(Date value) {
            addCriterion("SUP_REP_DATE2 <=", value, "supRepDate2");
            return (Criteria) this;
        }

        public Criteria andSupRepDate2In(List<Date> values) {
            addCriterion("SUP_REP_DATE2 in", values, "supRepDate2");
            return (Criteria) this;
        }

        public Criteria andSupRepDate2NotIn(List<Date> values) {
            addCriterion("SUP_REP_DATE2 not in", values, "supRepDate2");
            return (Criteria) this;
        }

        public Criteria andSupRepDate2Between(Date value1, Date value2) {
            addCriterion("SUP_REP_DATE2 between", value1, value2, "supRepDate2");
            return (Criteria) this;
        }

        public Criteria andSupRepDate2NotBetween(Date value1, Date value2) {
            addCriterion("SUP_REP_DATE2 not between", value1, value2, "supRepDate2");
            return (Criteria) this;
        }

        public Criteria andSupRepDate3IsNull() {
            addCriterion("SUP_REP_DATE3 is null");
            return (Criteria) this;
        }

        public Criteria andSupRepDate3IsNotNull() {
            addCriterion("SUP_REP_DATE3 is not null");
            return (Criteria) this;
        }

        public Criteria andSupRepDate3EqualTo(Date value) {
            addCriterion("SUP_REP_DATE3 =", value, "supRepDate3");
            return (Criteria) this;
        }

        public Criteria andSupRepDate3NotEqualTo(Date value) {
            addCriterion("SUP_REP_DATE3 <>", value, "supRepDate3");
            return (Criteria) this;
        }

        public Criteria andSupRepDate3GreaterThan(Date value) {
            addCriterion("SUP_REP_DATE3 >", value, "supRepDate3");
            return (Criteria) this;
        }

        public Criteria andSupRepDate3GreaterThanOrEqualTo(Date value) {
            addCriterion("SUP_REP_DATE3 >=", value, "supRepDate3");
            return (Criteria) this;
        }

        public Criteria andSupRepDate3LessThan(Date value) {
            addCriterion("SUP_REP_DATE3 <", value, "supRepDate3");
            return (Criteria) this;
        }

        public Criteria andSupRepDate3LessThanOrEqualTo(Date value) {
            addCriterion("SUP_REP_DATE3 <=", value, "supRepDate3");
            return (Criteria) this;
        }

        public Criteria andSupRepDate3In(List<Date> values) {
            addCriterion("SUP_REP_DATE3 in", values, "supRepDate3");
            return (Criteria) this;
        }

        public Criteria andSupRepDate3NotIn(List<Date> values) {
            addCriterion("SUP_REP_DATE3 not in", values, "supRepDate3");
            return (Criteria) this;
        }

        public Criteria andSupRepDate3Between(Date value1, Date value2) {
            addCriterion("SUP_REP_DATE3 between", value1, value2, "supRepDate3");
            return (Criteria) this;
        }

        public Criteria andSupRepDate3NotBetween(Date value1, Date value2) {
            addCriterion("SUP_REP_DATE3 not between", value1, value2, "supRepDate3");
            return (Criteria) this;
        }

        public Criteria andRepRemIsNull() {
            addCriterion("REP_REM is null");
            return (Criteria) this;
        }

        public Criteria andRepRemIsNotNull() {
            addCriterion("REP_REM is not null");
            return (Criteria) this;
        }

        public Criteria andRepRemEqualTo(String value) {
            addCriterion("REP_REM =", value, "repRem");
            return (Criteria) this;
        }

        public Criteria andRepRemNotEqualTo(String value) {
            addCriterion("REP_REM <>", value, "repRem");
            return (Criteria) this;
        }

        public Criteria andRepRemGreaterThan(String value) {
            addCriterion("REP_REM >", value, "repRem");
            return (Criteria) this;
        }

        public Criteria andRepRemGreaterThanOrEqualTo(String value) {
            addCriterion("REP_REM >=", value, "repRem");
            return (Criteria) this;
        }

        public Criteria andRepRemLessThan(String value) {
            addCriterion("REP_REM <", value, "repRem");
            return (Criteria) this;
        }

        public Criteria andRepRemLessThanOrEqualTo(String value) {
            addCriterion("REP_REM <=", value, "repRem");
            return (Criteria) this;
        }

        public Criteria andRepRemLike(String value) {
            addCriterion("REP_REM like", value, "repRem");
            return (Criteria) this;
        }

        public Criteria andRepRemNotLike(String value) {
            addCriterion("REP_REM not like", value, "repRem");
            return (Criteria) this;
        }

        public Criteria andRepRemIn(List<String> values) {
            addCriterion("REP_REM in", values, "repRem");
            return (Criteria) this;
        }

        public Criteria andRepRemNotIn(List<String> values) {
            addCriterion("REP_REM not in", values, "repRem");
            return (Criteria) this;
        }

        public Criteria andRepRemBetween(String value1, String value2) {
            addCriterion("REP_REM between", value1, value2, "repRem");
            return (Criteria) this;
        }

        public Criteria andRepRemNotBetween(String value1, String value2) {
            addCriterion("REP_REM not between", value1, value2, "repRem");
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