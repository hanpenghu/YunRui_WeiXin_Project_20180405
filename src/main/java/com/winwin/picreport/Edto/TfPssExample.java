package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TfPssExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TfPssExample() {
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

        public Criteria andPsIdIsNull() {
            addCriterion("PS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPsIdIsNotNull() {
            addCriterion("PS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPsIdEqualTo(String value) {
            addCriterion("PS_ID =", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotEqualTo(String value) {
            addCriterion("PS_ID <>", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThan(String value) {
            addCriterion("PS_ID >", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThanOrEqualTo(String value) {
            addCriterion("PS_ID >=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThan(String value) {
            addCriterion("PS_ID <", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThanOrEqualTo(String value) {
            addCriterion("PS_ID <=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLike(String value) {
            addCriterion("PS_ID like", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotLike(String value) {
            addCriterion("PS_ID not like", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdIn(List<String> values) {
            addCriterion("PS_ID in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotIn(List<String> values) {
            addCriterion("PS_ID not in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdBetween(String value1, String value2) {
            addCriterion("PS_ID between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotBetween(String value1, String value2) {
            addCriterion("PS_ID not between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsNoIsNull() {
            addCriterion("PS_NO is null");
            return (Criteria) this;
        }

        public Criteria andPsNoIsNotNull() {
            addCriterion("PS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPsNoEqualTo(String value) {
            addCriterion("PS_NO =", value, "psNo");
            return (Criteria) this;
        }

        public Criteria andPsNoNotEqualTo(String value) {
            addCriterion("PS_NO <>", value, "psNo");
            return (Criteria) this;
        }

        public Criteria andPsNoGreaterThan(String value) {
            addCriterion("PS_NO >", value, "psNo");
            return (Criteria) this;
        }

        public Criteria andPsNoGreaterThanOrEqualTo(String value) {
            addCriterion("PS_NO >=", value, "psNo");
            return (Criteria) this;
        }

        public Criteria andPsNoLessThan(String value) {
            addCriterion("PS_NO <", value, "psNo");
            return (Criteria) this;
        }

        public Criteria andPsNoLessThanOrEqualTo(String value) {
            addCriterion("PS_NO <=", value, "psNo");
            return (Criteria) this;
        }

        public Criteria andPsNoLike(String value) {
            addCriterion("PS_NO like", value, "psNo");
            return (Criteria) this;
        }

        public Criteria andPsNoNotLike(String value) {
            addCriterion("PS_NO not like", value, "psNo");
            return (Criteria) this;
        }

        public Criteria andPsNoIn(List<String> values) {
            addCriterion("PS_NO in", values, "psNo");
            return (Criteria) this;
        }

        public Criteria andPsNoNotIn(List<String> values) {
            addCriterion("PS_NO not in", values, "psNo");
            return (Criteria) this;
        }

        public Criteria andPsNoBetween(String value1, String value2) {
            addCriterion("PS_NO between", value1, value2, "psNo");
            return (Criteria) this;
        }

        public Criteria andPsNoNotBetween(String value1, String value2) {
            addCriterion("PS_NO not between", value1, value2, "psNo");
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

        public Criteria andPsDdIsNull() {
            addCriterion("PS_DD is null");
            return (Criteria) this;
        }

        public Criteria andPsDdIsNotNull() {
            addCriterion("PS_DD is not null");
            return (Criteria) this;
        }

        public Criteria andPsDdEqualTo(Date value) {
            addCriterion("PS_DD =", value, "psDd");
            return (Criteria) this;
        }

        public Criteria andPsDdNotEqualTo(Date value) {
            addCriterion("PS_DD <>", value, "psDd");
            return (Criteria) this;
        }

        public Criteria andPsDdGreaterThan(Date value) {
            addCriterion("PS_DD >", value, "psDd");
            return (Criteria) this;
        }

        public Criteria andPsDdGreaterThanOrEqualTo(Date value) {
            addCriterion("PS_DD >=", value, "psDd");
            return (Criteria) this;
        }

        public Criteria andPsDdLessThan(Date value) {
            addCriterion("PS_DD <", value, "psDd");
            return (Criteria) this;
        }

        public Criteria andPsDdLessThanOrEqualTo(Date value) {
            addCriterion("PS_DD <=", value, "psDd");
            return (Criteria) this;
        }

        public Criteria andPsDdIn(List<Date> values) {
            addCriterion("PS_DD in", values, "psDd");
            return (Criteria) this;
        }

        public Criteria andPsDdNotIn(List<Date> values) {
            addCriterion("PS_DD not in", values, "psDd");
            return (Criteria) this;
        }

        public Criteria andPsDdBetween(Date value1, Date value2) {
            addCriterion("PS_DD between", value1, value2, "psDd");
            return (Criteria) this;
        }

        public Criteria andPsDdNotBetween(Date value1, Date value2) {
            addCriterion("PS_DD not between", value1, value2, "psDd");
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

        public Criteria andCstSalIsNull() {
            addCriterion("CST_SAL is null");
            return (Criteria) this;
        }

        public Criteria andCstSalIsNotNull() {
            addCriterion("CST_SAL is not null");
            return (Criteria) this;
        }

        public Criteria andCstSalEqualTo(BigDecimal value) {
            addCriterion("CST_SAL =", value, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalNotEqualTo(BigDecimal value) {
            addCriterion("CST_SAL <>", value, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalGreaterThan(BigDecimal value) {
            addCriterion("CST_SAL >", value, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_SAL >=", value, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalLessThan(BigDecimal value) {
            addCriterion("CST_SAL <", value, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_SAL <=", value, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalIn(List<BigDecimal> values) {
            addCriterion("CST_SAL in", values, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalNotIn(List<BigDecimal> values) {
            addCriterion("CST_SAL not in", values, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_SAL between", value1, value2, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_SAL not between", value1, value2, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstnSalIsNull() {
            addCriterion("CSTN_SAL is null");
            return (Criteria) this;
        }

        public Criteria andCstnSalIsNotNull() {
            addCriterion("CSTN_SAL is not null");
            return (Criteria) this;
        }

        public Criteria andCstnSalEqualTo(BigDecimal value) {
            addCriterion("CSTN_SAL =", value, "cstnSal");
            return (Criteria) this;
        }

        public Criteria andCstnSalNotEqualTo(BigDecimal value) {
            addCriterion("CSTN_SAL <>", value, "cstnSal");
            return (Criteria) this;
        }

        public Criteria andCstnSalGreaterThan(BigDecimal value) {
            addCriterion("CSTN_SAL >", value, "cstnSal");
            return (Criteria) this;
        }

        public Criteria andCstnSalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CSTN_SAL >=", value, "cstnSal");
            return (Criteria) this;
        }

        public Criteria andCstnSalLessThan(BigDecimal value) {
            addCriterion("CSTN_SAL <", value, "cstnSal");
            return (Criteria) this;
        }

        public Criteria andCstnSalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CSTN_SAL <=", value, "cstnSal");
            return (Criteria) this;
        }

        public Criteria andCstnSalIn(List<BigDecimal> values) {
            addCriterion("CSTN_SAL in", values, "cstnSal");
            return (Criteria) this;
        }

        public Criteria andCstnSalNotIn(List<BigDecimal> values) {
            addCriterion("CSTN_SAL not in", values, "cstnSal");
            return (Criteria) this;
        }

        public Criteria andCstnSalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSTN_SAL between", value1, value2, "cstnSal");
            return (Criteria) this;
        }

        public Criteria andCstnSalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSTN_SAL not between", value1, value2, "cstnSal");
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

        public Criteria andAmtnNetIsNull() {
            addCriterion("AMTN_NET is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIsNotNull() {
            addCriterion("AMTN_NET is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET =", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET <>", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetGreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET >", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET >=", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetLessThan(BigDecimal value) {
            addCriterion("AMTN_NET <", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET <=", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET in", values, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET not in", values, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET between", value1, value2, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET not between", value1, value2, "amtnNet");
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

        public Criteria andQtyRtnIsNull() {
            addCriterion("QTY_RTN is null");
            return (Criteria) this;
        }

        public Criteria andQtyRtnIsNotNull() {
            addCriterion("QTY_RTN is not null");
            return (Criteria) this;
        }

        public Criteria andQtyRtnEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN =", value, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnNotEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN <>", value, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnGreaterThan(BigDecimal value) {
            addCriterion("QTY_RTN >", value, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN >=", value, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnLessThan(BigDecimal value) {
            addCriterion("QTY_RTN <", value, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN <=", value, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnIn(List<BigDecimal> values) {
            addCriterion("QTY_RTN in", values, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnNotIn(List<BigDecimal> values) {
            addCriterion("QTY_RTN not in", values, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_RTN between", value1, value2, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_RTN not between", value1, value2, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshIsNull() {
            addCriterion("QTY_RTN_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshIsNotNull() {
            addCriterion("QTY_RTN_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN_UNSH =", value, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN_UNSH <>", value, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_RTN_UNSH >", value, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN_UNSH >=", value, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshLessThan(BigDecimal value) {
            addCriterion("QTY_RTN_UNSH <", value, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN_UNSH <=", value, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_RTN_UNSH in", values, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_RTN_UNSH not in", values, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_RTN_UNSH between", value1, value2, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_RTN_UNSH not between", value1, value2, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIsNull() {
            addCriterion("AMTN_EP is null");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIsNotNull() {
            addCriterion("AMTN_EP is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnEpEqualTo(BigDecimal value) {
            addCriterion("AMTN_EP =", value, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_EP <>", value, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpGreaterThan(BigDecimal value) {
            addCriterion("AMTN_EP >", value, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_EP >=", value, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpLessThan(BigDecimal value) {
            addCriterion("AMTN_EP <", value, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_EP <=", value, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIn(List<BigDecimal> values) {
            addCriterion("AMTN_EP in", values, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_EP not in", values, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_EP between", value1, value2, "amtnEp");
            return (Criteria) this;
        }

        public Criteria andAmtnEpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_EP not between", value1, value2, "amtnEp");
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

        public Criteria andPakNwNIsNull() {
            addCriterion("PAK_NW_N is null");
            return (Criteria) this;
        }

        public Criteria andPakNwNIsNotNull() {
            addCriterion("PAK_NW_N is not null");
            return (Criteria) this;
        }

        public Criteria andPakNwNEqualTo(BigDecimal value) {
            addCriterion("PAK_NW_N =", value, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNNotEqualTo(BigDecimal value) {
            addCriterion("PAK_NW_N <>", value, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNGreaterThan(BigDecimal value) {
            addCriterion("PAK_NW_N >", value, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_NW_N >=", value, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNLessThan(BigDecimal value) {
            addCriterion("PAK_NW_N <", value, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_NW_N <=", value, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNIn(List<BigDecimal> values) {
            addCriterion("PAK_NW_N in", values, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNNotIn(List<BigDecimal> values) {
            addCriterion("PAK_NW_N not in", values, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_NW_N between", value1, value2, "pakNwN");
            return (Criteria) this;
        }

        public Criteria andPakNwNNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_NW_N not between", value1, value2, "pakNwN");
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

        public Criteria andPakGwNIsNull() {
            addCriterion("PAK_GW_N is null");
            return (Criteria) this;
        }

        public Criteria andPakGwNIsNotNull() {
            addCriterion("PAK_GW_N is not null");
            return (Criteria) this;
        }

        public Criteria andPakGwNEqualTo(BigDecimal value) {
            addCriterion("PAK_GW_N =", value, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNNotEqualTo(BigDecimal value) {
            addCriterion("PAK_GW_N <>", value, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNGreaterThan(BigDecimal value) {
            addCriterion("PAK_GW_N >", value, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_GW_N >=", value, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNLessThan(BigDecimal value) {
            addCriterion("PAK_GW_N <", value, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_GW_N <=", value, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNIn(List<BigDecimal> values) {
            addCriterion("PAK_GW_N in", values, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNNotIn(List<BigDecimal> values) {
            addCriterion("PAK_GW_N not in", values, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_GW_N between", value1, value2, "pakGwN");
            return (Criteria) this;
        }

        public Criteria andPakGwNNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_GW_N not between", value1, value2, "pakGwN");
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

        public Criteria andQtyLossIsNull() {
            addCriterion("QTY_LOSS is null");
            return (Criteria) this;
        }

        public Criteria andQtyLossIsNotNull() {
            addCriterion("QTY_LOSS is not null");
            return (Criteria) this;
        }

        public Criteria andQtyLossEqualTo(BigDecimal value) {
            addCriterion("QTY_LOSS =", value, "qtyLoss");
            return (Criteria) this;
        }

        public Criteria andQtyLossNotEqualTo(BigDecimal value) {
            addCriterion("QTY_LOSS <>", value, "qtyLoss");
            return (Criteria) this;
        }

        public Criteria andQtyLossGreaterThan(BigDecimal value) {
            addCriterion("QTY_LOSS >", value, "qtyLoss");
            return (Criteria) this;
        }

        public Criteria andQtyLossGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOSS >=", value, "qtyLoss");
            return (Criteria) this;
        }

        public Criteria andQtyLossLessThan(BigDecimal value) {
            addCriterion("QTY_LOSS <", value, "qtyLoss");
            return (Criteria) this;
        }

        public Criteria andQtyLossLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOSS <=", value, "qtyLoss");
            return (Criteria) this;
        }

        public Criteria andQtyLossIn(List<BigDecimal> values) {
            addCriterion("QTY_LOSS in", values, "qtyLoss");
            return (Criteria) this;
        }

        public Criteria andQtyLossNotIn(List<BigDecimal> values) {
            addCriterion("QTY_LOSS not in", values, "qtyLoss");
            return (Criteria) this;
        }

        public Criteria andQtyLossBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOSS between", value1, value2, "qtyLoss");
            return (Criteria) this;
        }

        public Criteria andQtyLossNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOSS not between", value1, value2, "qtyLoss");
            return (Criteria) this;
        }

        public Criteria andQty1LossIsNull() {
            addCriterion("QTY1_LOSS is null");
            return (Criteria) this;
        }

        public Criteria andQty1LossIsNotNull() {
            addCriterion("QTY1_LOSS is not null");
            return (Criteria) this;
        }

        public Criteria andQty1LossEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOSS =", value, "qty1Loss");
            return (Criteria) this;
        }

        public Criteria andQty1LossNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOSS <>", value, "qty1Loss");
            return (Criteria) this;
        }

        public Criteria andQty1LossGreaterThan(BigDecimal value) {
            addCriterion("QTY1_LOSS >", value, "qty1Loss");
            return (Criteria) this;
        }

        public Criteria andQty1LossGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOSS >=", value, "qty1Loss");
            return (Criteria) this;
        }

        public Criteria andQty1LossLessThan(BigDecimal value) {
            addCriterion("QTY1_LOSS <", value, "qty1Loss");
            return (Criteria) this;
        }

        public Criteria andQty1LossLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOSS <=", value, "qty1Loss");
            return (Criteria) this;
        }

        public Criteria andQty1LossIn(List<BigDecimal> values) {
            addCriterion("QTY1_LOSS in", values, "qty1Loss");
            return (Criteria) this;
        }

        public Criteria andQty1LossNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_LOSS not in", values, "qty1Loss");
            return (Criteria) this;
        }

        public Criteria andQty1LossBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_LOSS between", value1, value2, "qty1Loss");
            return (Criteria) this;
        }

        public Criteria andQty1LossNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_LOSS not between", value1, value2, "qty1Loss");
            return (Criteria) this;
        }

        public Criteria andQtysIsNull() {
            addCriterion("QTYS is null");
            return (Criteria) this;
        }

        public Criteria andQtysIsNotNull() {
            addCriterion("QTYS is not null");
            return (Criteria) this;
        }

        public Criteria andQtysEqualTo(BigDecimal value) {
            addCriterion("QTYS =", value, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysNotEqualTo(BigDecimal value) {
            addCriterion("QTYS <>", value, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysGreaterThan(BigDecimal value) {
            addCriterion("QTYS >", value, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTYS >=", value, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysLessThan(BigDecimal value) {
            addCriterion("QTYS <", value, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTYS <=", value, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysIn(List<BigDecimal> values) {
            addCriterion("QTYS in", values, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysNotIn(List<BigDecimal> values) {
            addCriterion("QTYS not in", values, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTYS between", value1, value2, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTYS not between", value1, value2, "qtys");
            return (Criteria) this;
        }

        public Criteria andAmtnSnetIsNull() {
            addCriterion("AMTN_SNET is null");
            return (Criteria) this;
        }

        public Criteria andAmtnSnetIsNotNull() {
            addCriterion("AMTN_SNET is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnSnetEqualTo(BigDecimal value) {
            addCriterion("AMTN_SNET =", value, "amtnSnet");
            return (Criteria) this;
        }

        public Criteria andAmtnSnetNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_SNET <>", value, "amtnSnet");
            return (Criteria) this;
        }

        public Criteria andAmtnSnetGreaterThan(BigDecimal value) {
            addCriterion("AMTN_SNET >", value, "amtnSnet");
            return (Criteria) this;
        }

        public Criteria andAmtnSnetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_SNET >=", value, "amtnSnet");
            return (Criteria) this;
        }

        public Criteria andAmtnSnetLessThan(BigDecimal value) {
            addCriterion("AMTN_SNET <", value, "amtnSnet");
            return (Criteria) this;
        }

        public Criteria andAmtnSnetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_SNET <=", value, "amtnSnet");
            return (Criteria) this;
        }

        public Criteria andAmtnSnetIn(List<BigDecimal> values) {
            addCriterion("AMTN_SNET in", values, "amtnSnet");
            return (Criteria) this;
        }

        public Criteria andAmtnSnetNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_SNET not in", values, "amtnSnet");
            return (Criteria) this;
        }

        public Criteria andAmtnSnetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_SNET between", value1, value2, "amtnSnet");
            return (Criteria) this;
        }

        public Criteria andAmtnSnetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_SNET not between", value1, value2, "amtnSnet");
            return (Criteria) this;
        }

        public Criteria andTaxsIsNull() {
            addCriterion("TAXS is null");
            return (Criteria) this;
        }

        public Criteria andTaxsIsNotNull() {
            addCriterion("TAXS is not null");
            return (Criteria) this;
        }

        public Criteria andTaxsEqualTo(BigDecimal value) {
            addCriterion("TAXS =", value, "taxs");
            return (Criteria) this;
        }

        public Criteria andTaxsNotEqualTo(BigDecimal value) {
            addCriterion("TAXS <>", value, "taxs");
            return (Criteria) this;
        }

        public Criteria andTaxsGreaterThan(BigDecimal value) {
            addCriterion("TAXS >", value, "taxs");
            return (Criteria) this;
        }

        public Criteria andTaxsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXS >=", value, "taxs");
            return (Criteria) this;
        }

        public Criteria andTaxsLessThan(BigDecimal value) {
            addCriterion("TAXS <", value, "taxs");
            return (Criteria) this;
        }

        public Criteria andTaxsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXS <=", value, "taxs");
            return (Criteria) this;
        }

        public Criteria andTaxsIn(List<BigDecimal> values) {
            addCriterion("TAXS in", values, "taxs");
            return (Criteria) this;
        }

        public Criteria andTaxsNotIn(List<BigDecimal> values) {
            addCriterion("TAXS not in", values, "taxs");
            return (Criteria) this;
        }

        public Criteria andTaxsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXS between", value1, value2, "taxs");
            return (Criteria) this;
        }

        public Criteria andTaxsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXS not between", value1, value2, "taxs");
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

        public Criteria andWtIsNull() {
            addCriterion("WT is null");
            return (Criteria) this;
        }

        public Criteria andWtIsNotNull() {
            addCriterion("WT is not null");
            return (Criteria) this;
        }

        public Criteria andWtEqualTo(BigDecimal value) {
            addCriterion("WT =", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtNotEqualTo(BigDecimal value) {
            addCriterion("WT <>", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtGreaterThan(BigDecimal value) {
            addCriterion("WT >", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WT >=", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtLessThan(BigDecimal value) {
            addCriterion("WT <", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WT <=", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtIn(List<BigDecimal> values) {
            addCriterion("WT in", values, "wt");
            return (Criteria) this;
        }

        public Criteria andWtNotIn(List<BigDecimal> values) {
            addCriterion("WT not in", values, "wt");
            return (Criteria) this;
        }

        public Criteria andWtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WT between", value1, value2, "wt");
            return (Criteria) this;
        }

        public Criteria andWtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WT not between", value1, value2, "wt");
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

        public Criteria andQtyFxIsNull() {
            addCriterion("QTY_FX is null");
            return (Criteria) this;
        }

        public Criteria andQtyFxIsNotNull() {
            addCriterion("QTY_FX is not null");
            return (Criteria) this;
        }

        public Criteria andQtyFxEqualTo(BigDecimal value) {
            addCriterion("QTY_FX =", value, "qtyFx");
            return (Criteria) this;
        }

        public Criteria andQtyFxNotEqualTo(BigDecimal value) {
            addCriterion("QTY_FX <>", value, "qtyFx");
            return (Criteria) this;
        }

        public Criteria andQtyFxGreaterThan(BigDecimal value) {
            addCriterion("QTY_FX >", value, "qtyFx");
            return (Criteria) this;
        }

        public Criteria andQtyFxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FX >=", value, "qtyFx");
            return (Criteria) this;
        }

        public Criteria andQtyFxLessThan(BigDecimal value) {
            addCriterion("QTY_FX <", value, "qtyFx");
            return (Criteria) this;
        }

        public Criteria andQtyFxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FX <=", value, "qtyFx");
            return (Criteria) this;
        }

        public Criteria andQtyFxIn(List<BigDecimal> values) {
            addCriterion("QTY_FX in", values, "qtyFx");
            return (Criteria) this;
        }

        public Criteria andQtyFxNotIn(List<BigDecimal> values) {
            addCriterion("QTY_FX not in", values, "qtyFx");
            return (Criteria) this;
        }

        public Criteria andQtyFxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FX between", value1, value2, "qtyFx");
            return (Criteria) this;
        }

        public Criteria andQtyFxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FX not between", value1, value2, "qtyFx");
            return (Criteria) this;
        }

        public Criteria andQtyFxUnshIsNull() {
            addCriterion("QTY_FX_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyFxUnshIsNotNull() {
            addCriterion("QTY_FX_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyFxUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_FX_UNSH =", value, "qtyFxUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFxUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_FX_UNSH <>", value, "qtyFxUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFxUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_FX_UNSH >", value, "qtyFxUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFxUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FX_UNSH >=", value, "qtyFxUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFxUnshLessThan(BigDecimal value) {
            addCriterion("QTY_FX_UNSH <", value, "qtyFxUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFxUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FX_UNSH <=", value, "qtyFxUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFxUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_FX_UNSH in", values, "qtyFxUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFxUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_FX_UNSH not in", values, "qtyFxUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFxUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FX_UNSH between", value1, value2, "qtyFxUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFxUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FX_UNSH not between", value1, value2, "qtyFxUnsh");
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

        public Criteria andCkNoIsNull() {
            addCriterion("CK_NO is null");
            return (Criteria) this;
        }

        public Criteria andCkNoIsNotNull() {
            addCriterion("CK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCkNoEqualTo(String value) {
            addCriterion("CK_NO =", value, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoNotEqualTo(String value) {
            addCriterion("CK_NO <>", value, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoGreaterThan(String value) {
            addCriterion("CK_NO >", value, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoGreaterThanOrEqualTo(String value) {
            addCriterion("CK_NO >=", value, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoLessThan(String value) {
            addCriterion("CK_NO <", value, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoLessThanOrEqualTo(String value) {
            addCriterion("CK_NO <=", value, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoLike(String value) {
            addCriterion("CK_NO like", value, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoNotLike(String value) {
            addCriterion("CK_NO not like", value, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoIn(List<String> values) {
            addCriterion("CK_NO in", values, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoNotIn(List<String> values) {
            addCriterion("CK_NO not in", values, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoBetween(String value1, String value2) {
            addCriterion("CK_NO between", value1, value2, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoNotBetween(String value1, String value2) {
            addCriterion("CK_NO not between", value1, value2, "ckNo");
            return (Criteria) this;
        }

        public Criteria andMmIdIsNull() {
            addCriterion("MM_ID is null");
            return (Criteria) this;
        }

        public Criteria andMmIdIsNotNull() {
            addCriterion("MM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMmIdEqualTo(String value) {
            addCriterion("MM_ID =", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdNotEqualTo(String value) {
            addCriterion("MM_ID <>", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdGreaterThan(String value) {
            addCriterion("MM_ID >", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdGreaterThanOrEqualTo(String value) {
            addCriterion("MM_ID >=", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdLessThan(String value) {
            addCriterion("MM_ID <", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdLessThanOrEqualTo(String value) {
            addCriterion("MM_ID <=", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdLike(String value) {
            addCriterion("MM_ID like", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdNotLike(String value) {
            addCriterion("MM_ID not like", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdIn(List<String> values) {
            addCriterion("MM_ID in", values, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdNotIn(List<String> values) {
            addCriterion("MM_ID not in", values, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdBetween(String value1, String value2) {
            addCriterion("MM_ID between", value1, value2, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdNotBetween(String value1, String value2) {
            addCriterion("MM_ID not between", value1, value2, "mmId");
            return (Criteria) this;
        }

        public Criteria andAmtFpIsNull() {
            addCriterion("AMT_FP is null");
            return (Criteria) this;
        }

        public Criteria andAmtFpIsNotNull() {
            addCriterion("AMT_FP is not null");
            return (Criteria) this;
        }

        public Criteria andAmtFpEqualTo(BigDecimal value) {
            addCriterion("AMT_FP =", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpNotEqualTo(BigDecimal value) {
            addCriterion("AMT_FP <>", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpGreaterThan(BigDecimal value) {
            addCriterion("AMT_FP >", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_FP >=", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpLessThan(BigDecimal value) {
            addCriterion("AMT_FP <", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_FP <=", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpIn(List<BigDecimal> values) {
            addCriterion("AMT_FP in", values, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpNotIn(List<BigDecimal> values) {
            addCriterion("AMT_FP not in", values, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_FP between", value1, value2, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_FP not between", value1, value2, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpIsNull() {
            addCriterion("AMTN_NET_FP is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpIsNotNull() {
            addCriterion("AMTN_NET_FP is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_FP =", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_FP <>", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpGreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET_FP >", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_FP >=", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpLessThan(BigDecimal value) {
            addCriterion("AMTN_NET_FP <", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_FP <=", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_FP in", values, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_FP not in", values, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_FP between", value1, value2, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_FP not between", value1, value2, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpIsNull() {
            addCriterion("TAX_FP is null");
            return (Criteria) this;
        }

        public Criteria andTaxFpIsNotNull() {
            addCriterion("TAX_FP is not null");
            return (Criteria) this;
        }

        public Criteria andTaxFpEqualTo(BigDecimal value) {
            addCriterion("TAX_FP =", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpNotEqualTo(BigDecimal value) {
            addCriterion("TAX_FP <>", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpGreaterThan(BigDecimal value) {
            addCriterion("TAX_FP >", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_FP >=", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpLessThan(BigDecimal value) {
            addCriterion("TAX_FP <", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_FP <=", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpIn(List<BigDecimal> values) {
            addCriterion("TAX_FP in", values, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpNotIn(List<BigDecimal> values) {
            addCriterion("TAX_FP not in", values, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_FP between", value1, value2, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_FP not between", value1, value2, "taxFp");
            return (Criteria) this;
        }

        public Criteria andQtyCkIsNull() {
            addCriterion("QTY_CK is null");
            return (Criteria) this;
        }

        public Criteria andQtyCkIsNotNull() {
            addCriterion("QTY_CK is not null");
            return (Criteria) this;
        }

        public Criteria andQtyCkEqualTo(BigDecimal value) {
            addCriterion("QTY_CK =", value, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkNotEqualTo(BigDecimal value) {
            addCriterion("QTY_CK <>", value, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkGreaterThan(BigDecimal value) {
            addCriterion("QTY_CK >", value, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CK >=", value, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkLessThan(BigDecimal value) {
            addCriterion("QTY_CK <", value, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CK <=", value, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkIn(List<BigDecimal> values) {
            addCriterion("QTY_CK in", values, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkNotIn(List<BigDecimal> values) {
            addCriterion("QTY_CK not in", values, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CK between", value1, value2, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CK not between", value1, value2, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshIsNull() {
            addCriterion("QTY_CK_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshIsNotNull() {
            addCriterion("QTY_CK_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_CK_UNSH =", value, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_CK_UNSH <>", value, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_CK_UNSH >", value, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CK_UNSH >=", value, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshLessThan(BigDecimal value) {
            addCriterion("QTY_CK_UNSH <", value, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CK_UNSH <=", value, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_CK_UNSH in", values, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_CK_UNSH not in", values, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CK_UNSH between", value1, value2, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CK_UNSH not between", value1, value2, "qtyCkUnsh");
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

        public Criteria andAmtnFtIsNull() {
            addCriterion("AMTN_FT is null");
            return (Criteria) this;
        }

        public Criteria andAmtnFtIsNotNull() {
            addCriterion("AMTN_FT is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnFtEqualTo(BigDecimal value) {
            addCriterion("AMTN_FT =", value, "amtnFt");
            return (Criteria) this;
        }

        public Criteria andAmtnFtNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_FT <>", value, "amtnFt");
            return (Criteria) this;
        }

        public Criteria andAmtnFtGreaterThan(BigDecimal value) {
            addCriterion("AMTN_FT >", value, "amtnFt");
            return (Criteria) this;
        }

        public Criteria andAmtnFtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_FT >=", value, "amtnFt");
            return (Criteria) this;
        }

        public Criteria andAmtnFtLessThan(BigDecimal value) {
            addCriterion("AMTN_FT <", value, "amtnFt");
            return (Criteria) this;
        }

        public Criteria andAmtnFtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_FT <=", value, "amtnFt");
            return (Criteria) this;
        }

        public Criteria andAmtnFtIn(List<BigDecimal> values) {
            addCriterion("AMTN_FT in", values, "amtnFt");
            return (Criteria) this;
        }

        public Criteria andAmtnFtNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_FT not in", values, "amtnFt");
            return (Criteria) this;
        }

        public Criteria andAmtnFtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_FT between", value1, value2, "amtnFt");
            return (Criteria) this;
        }

        public Criteria andAmtnFtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_FT not between", value1, value2, "amtnFt");
            return (Criteria) this;
        }

        public Criteria andRkNoIsNull() {
            addCriterion("RK_NO is null");
            return (Criteria) this;
        }

        public Criteria andRkNoIsNotNull() {
            addCriterion("RK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRkNoEqualTo(String value) {
            addCriterion("RK_NO =", value, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoNotEqualTo(String value) {
            addCriterion("RK_NO <>", value, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoGreaterThan(String value) {
            addCriterion("RK_NO >", value, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoGreaterThanOrEqualTo(String value) {
            addCriterion("RK_NO >=", value, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoLessThan(String value) {
            addCriterion("RK_NO <", value, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoLessThanOrEqualTo(String value) {
            addCriterion("RK_NO <=", value, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoLike(String value) {
            addCriterion("RK_NO like", value, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoNotLike(String value) {
            addCriterion("RK_NO not like", value, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoIn(List<String> values) {
            addCriterion("RK_NO in", values, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoNotIn(List<String> values) {
            addCriterion("RK_NO not in", values, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoBetween(String value1, String value2) {
            addCriterion("RK_NO between", value1, value2, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoNotBetween(String value1, String value2) {
            addCriterion("RK_NO not between", value1, value2, "rkNo");
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

        public Criteria andCnttNoIsNull() {
            addCriterion("CNTT_NO is null");
            return (Criteria) this;
        }

        public Criteria andCnttNoIsNotNull() {
            addCriterion("CNTT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCnttNoEqualTo(String value) {
            addCriterion("CNTT_NO =", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoNotEqualTo(String value) {
            addCriterion("CNTT_NO <>", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoGreaterThan(String value) {
            addCriterion("CNTT_NO >", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoGreaterThanOrEqualTo(String value) {
            addCriterion("CNTT_NO >=", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoLessThan(String value) {
            addCriterion("CNTT_NO <", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoLessThanOrEqualTo(String value) {
            addCriterion("CNTT_NO <=", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoLike(String value) {
            addCriterion("CNTT_NO like", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoNotLike(String value) {
            addCriterion("CNTT_NO not like", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoIn(List<String> values) {
            addCriterion("CNTT_NO in", values, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoNotIn(List<String> values) {
            addCriterion("CNTT_NO not in", values, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoBetween(String value1, String value2) {
            addCriterion("CNTT_NO between", value1, value2, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoNotBetween(String value1, String value2) {
            addCriterion("CNTT_NO not between", value1, value2, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andTypeSgtIsNull() {
            addCriterion("TYPE_SGT is null");
            return (Criteria) this;
        }

        public Criteria andTypeSgtIsNotNull() {
            addCriterion("TYPE_SGT is not null");
            return (Criteria) this;
        }

        public Criteria andTypeSgtEqualTo(String value) {
            addCriterion("TYPE_SGT =", value, "typeSgt");
            return (Criteria) this;
        }

        public Criteria andTypeSgtNotEqualTo(String value) {
            addCriterion("TYPE_SGT <>", value, "typeSgt");
            return (Criteria) this;
        }

        public Criteria andTypeSgtGreaterThan(String value) {
            addCriterion("TYPE_SGT >", value, "typeSgt");
            return (Criteria) this;
        }

        public Criteria andTypeSgtGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_SGT >=", value, "typeSgt");
            return (Criteria) this;
        }

        public Criteria andTypeSgtLessThan(String value) {
            addCriterion("TYPE_SGT <", value, "typeSgt");
            return (Criteria) this;
        }

        public Criteria andTypeSgtLessThanOrEqualTo(String value) {
            addCriterion("TYPE_SGT <=", value, "typeSgt");
            return (Criteria) this;
        }

        public Criteria andTypeSgtLike(String value) {
            addCriterion("TYPE_SGT like", value, "typeSgt");
            return (Criteria) this;
        }

        public Criteria andTypeSgtNotLike(String value) {
            addCriterion("TYPE_SGT not like", value, "typeSgt");
            return (Criteria) this;
        }

        public Criteria andTypeSgtIn(List<String> values) {
            addCriterion("TYPE_SGT in", values, "typeSgt");
            return (Criteria) this;
        }

        public Criteria andTypeSgtNotIn(List<String> values) {
            addCriterion("TYPE_SGT not in", values, "typeSgt");
            return (Criteria) this;
        }

        public Criteria andTypeSgtBetween(String value1, String value2) {
            addCriterion("TYPE_SGT between", value1, value2, "typeSgt");
            return (Criteria) this;
        }

        public Criteria andTypeSgtNotBetween(String value1, String value2) {
            addCriterion("TYPE_SGT not between", value1, value2, "typeSgt");
            return (Criteria) this;
        }

        public Criteria andGfNoIsNull() {
            addCriterion("GF_NO is null");
            return (Criteria) this;
        }

        public Criteria andGfNoIsNotNull() {
            addCriterion("GF_NO is not null");
            return (Criteria) this;
        }

        public Criteria andGfNoEqualTo(String value) {
            addCriterion("GF_NO =", value, "gfNo");
            return (Criteria) this;
        }

        public Criteria andGfNoNotEqualTo(String value) {
            addCriterion("GF_NO <>", value, "gfNo");
            return (Criteria) this;
        }

        public Criteria andGfNoGreaterThan(String value) {
            addCriterion("GF_NO >", value, "gfNo");
            return (Criteria) this;
        }

        public Criteria andGfNoGreaterThanOrEqualTo(String value) {
            addCriterion("GF_NO >=", value, "gfNo");
            return (Criteria) this;
        }

        public Criteria andGfNoLessThan(String value) {
            addCriterion("GF_NO <", value, "gfNo");
            return (Criteria) this;
        }

        public Criteria andGfNoLessThanOrEqualTo(String value) {
            addCriterion("GF_NO <=", value, "gfNo");
            return (Criteria) this;
        }

        public Criteria andGfNoLike(String value) {
            addCriterion("GF_NO like", value, "gfNo");
            return (Criteria) this;
        }

        public Criteria andGfNoNotLike(String value) {
            addCriterion("GF_NO not like", value, "gfNo");
            return (Criteria) this;
        }

        public Criteria andGfNoIn(List<String> values) {
            addCriterion("GF_NO in", values, "gfNo");
            return (Criteria) this;
        }

        public Criteria andGfNoNotIn(List<String> values) {
            addCriterion("GF_NO not in", values, "gfNo");
            return (Criteria) this;
        }

        public Criteria andGfNoBetween(String value1, String value2) {
            addCriterion("GF_NO between", value1, value2, "gfNo");
            return (Criteria) this;
        }

        public Criteria andGfNoNotBetween(String value1, String value2) {
            addCriterion("GF_NO not between", value1, value2, "gfNo");
            return (Criteria) this;
        }

        public Criteria andPkNoIsNull() {
            addCriterion("PK_NO is null");
            return (Criteria) this;
        }

        public Criteria andPkNoIsNotNull() {
            addCriterion("PK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPkNoEqualTo(String value) {
            addCriterion("PK_NO =", value, "pkNo");
            return (Criteria) this;
        }

        public Criteria andPkNoNotEqualTo(String value) {
            addCriterion("PK_NO <>", value, "pkNo");
            return (Criteria) this;
        }

        public Criteria andPkNoGreaterThan(String value) {
            addCriterion("PK_NO >", value, "pkNo");
            return (Criteria) this;
        }

        public Criteria andPkNoGreaterThanOrEqualTo(String value) {
            addCriterion("PK_NO >=", value, "pkNo");
            return (Criteria) this;
        }

        public Criteria andPkNoLessThan(String value) {
            addCriterion("PK_NO <", value, "pkNo");
            return (Criteria) this;
        }

        public Criteria andPkNoLessThanOrEqualTo(String value) {
            addCriterion("PK_NO <=", value, "pkNo");
            return (Criteria) this;
        }

        public Criteria andPkNoLike(String value) {
            addCriterion("PK_NO like", value, "pkNo");
            return (Criteria) this;
        }

        public Criteria andPkNoNotLike(String value) {
            addCriterion("PK_NO not like", value, "pkNo");
            return (Criteria) this;
        }

        public Criteria andPkNoIn(List<String> values) {
            addCriterion("PK_NO in", values, "pkNo");
            return (Criteria) this;
        }

        public Criteria andPkNoNotIn(List<String> values) {
            addCriterion("PK_NO not in", values, "pkNo");
            return (Criteria) this;
        }

        public Criteria andPkNoBetween(String value1, String value2) {
            addCriterion("PK_NO between", value1, value2, "pkNo");
            return (Criteria) this;
        }

        public Criteria andPkNoNotBetween(String value1, String value2) {
            addCriterion("PK_NO not between", value1, value2, "pkNo");
            return (Criteria) this;
        }

        public Criteria andSpNoIsNull() {
            addCriterion("SP_NO is null");
            return (Criteria) this;
        }

        public Criteria andSpNoIsNotNull() {
            addCriterion("SP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSpNoEqualTo(String value) {
            addCriterion("SP_NO =", value, "spNo");
            return (Criteria) this;
        }

        public Criteria andSpNoNotEqualTo(String value) {
            addCriterion("SP_NO <>", value, "spNo");
            return (Criteria) this;
        }

        public Criteria andSpNoGreaterThan(String value) {
            addCriterion("SP_NO >", value, "spNo");
            return (Criteria) this;
        }

        public Criteria andSpNoGreaterThanOrEqualTo(String value) {
            addCriterion("SP_NO >=", value, "spNo");
            return (Criteria) this;
        }

        public Criteria andSpNoLessThan(String value) {
            addCriterion("SP_NO <", value, "spNo");
            return (Criteria) this;
        }

        public Criteria andSpNoLessThanOrEqualTo(String value) {
            addCriterion("SP_NO <=", value, "spNo");
            return (Criteria) this;
        }

        public Criteria andSpNoLike(String value) {
            addCriterion("SP_NO like", value, "spNo");
            return (Criteria) this;
        }

        public Criteria andSpNoNotLike(String value) {
            addCriterion("SP_NO not like", value, "spNo");
            return (Criteria) this;
        }

        public Criteria andSpNoIn(List<String> values) {
            addCriterion("SP_NO in", values, "spNo");
            return (Criteria) this;
        }

        public Criteria andSpNoNotIn(List<String> values) {
            addCriterion("SP_NO not in", values, "spNo");
            return (Criteria) this;
        }

        public Criteria andSpNoBetween(String value1, String value2) {
            addCriterion("SP_NO between", value1, value2, "spNo");
            return (Criteria) this;
        }

        public Criteria andSpNoNotBetween(String value1, String value2) {
            addCriterion("SP_NO not between", value1, value2, "spNo");
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

        public Criteria andBDdIsNull() {
            addCriterion("B_DD is null");
            return (Criteria) this;
        }

        public Criteria andBDdIsNotNull() {
            addCriterion("B_DD is not null");
            return (Criteria) this;
        }

        public Criteria andBDdEqualTo(Date value) {
            addCriterion("B_DD =", value, "bDd");
            return (Criteria) this;
        }

        public Criteria andBDdNotEqualTo(Date value) {
            addCriterion("B_DD <>", value, "bDd");
            return (Criteria) this;
        }

        public Criteria andBDdGreaterThan(Date value) {
            addCriterion("B_DD >", value, "bDd");
            return (Criteria) this;
        }

        public Criteria andBDdGreaterThanOrEqualTo(Date value) {
            addCriterion("B_DD >=", value, "bDd");
            return (Criteria) this;
        }

        public Criteria andBDdLessThan(Date value) {
            addCriterion("B_DD <", value, "bDd");
            return (Criteria) this;
        }

        public Criteria andBDdLessThanOrEqualTo(Date value) {
            addCriterion("B_DD <=", value, "bDd");
            return (Criteria) this;
        }

        public Criteria andBDdIn(List<Date> values) {
            addCriterion("B_DD in", values, "bDd");
            return (Criteria) this;
        }

        public Criteria andBDdNotIn(List<Date> values) {
            addCriterion("B_DD not in", values, "bDd");
            return (Criteria) this;
        }

        public Criteria andBDdBetween(Date value1, Date value2) {
            addCriterion("B_DD between", value1, value2, "bDd");
            return (Criteria) this;
        }

        public Criteria andBDdNotBetween(Date value1, Date value2) {
            addCriterion("B_DD not between", value1, value2, "bDd");
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

        public Criteria andQtySbIsNull() {
            addCriterion("QTY_SB is null");
            return (Criteria) this;
        }

        public Criteria andQtySbIsNotNull() {
            addCriterion("QTY_SB is not null");
            return (Criteria) this;
        }

        public Criteria andQtySbEqualTo(BigDecimal value) {
            addCriterion("QTY_SB =", value, "qtySb");
            return (Criteria) this;
        }

        public Criteria andQtySbNotEqualTo(BigDecimal value) {
            addCriterion("QTY_SB <>", value, "qtySb");
            return (Criteria) this;
        }

        public Criteria andQtySbGreaterThan(BigDecimal value) {
            addCriterion("QTY_SB >", value, "qtySb");
            return (Criteria) this;
        }

        public Criteria andQtySbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SB >=", value, "qtySb");
            return (Criteria) this;
        }

        public Criteria andQtySbLessThan(BigDecimal value) {
            addCriterion("QTY_SB <", value, "qtySb");
            return (Criteria) this;
        }

        public Criteria andQtySbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SB <=", value, "qtySb");
            return (Criteria) this;
        }

        public Criteria andQtySbIn(List<BigDecimal> values) {
            addCriterion("QTY_SB in", values, "qtySb");
            return (Criteria) this;
        }

        public Criteria andQtySbNotIn(List<BigDecimal> values) {
            addCriterion("QTY_SB not in", values, "qtySb");
            return (Criteria) this;
        }

        public Criteria andQtySbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SB between", value1, value2, "qtySb");
            return (Criteria) this;
        }

        public Criteria andQtySbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SB not between", value1, value2, "qtySb");
            return (Criteria) this;
        }

        public Criteria andQtySbUnshIsNull() {
            addCriterion("QTY_SB_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtySbUnshIsNotNull() {
            addCriterion("QTY_SB_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtySbUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_SB_UNSH =", value, "qtySbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySbUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_SB_UNSH <>", value, "qtySbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySbUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_SB_UNSH >", value, "qtySbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySbUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SB_UNSH >=", value, "qtySbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySbUnshLessThan(BigDecimal value) {
            addCriterion("QTY_SB_UNSH <", value, "qtySbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySbUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SB_UNSH <=", value, "qtySbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySbUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_SB_UNSH in", values, "qtySbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySbUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_SB_UNSH not in", values, "qtySbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySbUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SB_UNSH between", value1, value2, "qtySbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtySbUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SB_UNSH not between", value1, value2, "qtySbUnsh");
            return (Criteria) this;
        }

        public Criteria andTiItmIsNull() {
            addCriterion("TI_ITM is null");
            return (Criteria) this;
        }

        public Criteria andTiItmIsNotNull() {
            addCriterion("TI_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andTiItmEqualTo(Integer value) {
            addCriterion("TI_ITM =", value, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmNotEqualTo(Integer value) {
            addCriterion("TI_ITM <>", value, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmGreaterThan(Integer value) {
            addCriterion("TI_ITM >", value, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("TI_ITM >=", value, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmLessThan(Integer value) {
            addCriterion("TI_ITM <", value, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmLessThanOrEqualTo(Integer value) {
            addCriterion("TI_ITM <=", value, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmIn(List<Integer> values) {
            addCriterion("TI_ITM in", values, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmNotIn(List<Integer> values) {
            addCriterion("TI_ITM not in", values, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmBetween(Integer value1, Integer value2) {
            addCriterion("TI_ITM between", value1, value2, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmNotBetween(Integer value1, Integer value2) {
            addCriterion("TI_ITM not between", value1, value2, "tiItm");
            return (Criteria) this;
        }

        public Criteria andQtyFpIsNull() {
            addCriterion("QTY_FP is null");
            return (Criteria) this;
        }

        public Criteria andQtyFpIsNotNull() {
            addCriterion("QTY_FP is not null");
            return (Criteria) this;
        }

        public Criteria andQtyFpEqualTo(BigDecimal value) {
            addCriterion("QTY_FP =", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpNotEqualTo(BigDecimal value) {
            addCriterion("QTY_FP <>", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpGreaterThan(BigDecimal value) {
            addCriterion("QTY_FP >", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FP >=", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpLessThan(BigDecimal value) {
            addCriterion("QTY_FP <", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FP <=", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpIn(List<BigDecimal> values) {
            addCriterion("QTY_FP in", values, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpNotIn(List<BigDecimal> values) {
            addCriterion("QTY_FP not in", values, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FP between", value1, value2, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FP not between", value1, value2, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andSlNoIsNull() {
            addCriterion("SL_NO is null");
            return (Criteria) this;
        }

        public Criteria andSlNoIsNotNull() {
            addCriterion("SL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSlNoEqualTo(String value) {
            addCriterion("SL_NO =", value, "slNo");
            return (Criteria) this;
        }

        public Criteria andSlNoNotEqualTo(String value) {
            addCriterion("SL_NO <>", value, "slNo");
            return (Criteria) this;
        }

        public Criteria andSlNoGreaterThan(String value) {
            addCriterion("SL_NO >", value, "slNo");
            return (Criteria) this;
        }

        public Criteria andSlNoGreaterThanOrEqualTo(String value) {
            addCriterion("SL_NO >=", value, "slNo");
            return (Criteria) this;
        }

        public Criteria andSlNoLessThan(String value) {
            addCriterion("SL_NO <", value, "slNo");
            return (Criteria) this;
        }

        public Criteria andSlNoLessThanOrEqualTo(String value) {
            addCriterion("SL_NO <=", value, "slNo");
            return (Criteria) this;
        }

        public Criteria andSlNoLike(String value) {
            addCriterion("SL_NO like", value, "slNo");
            return (Criteria) this;
        }

        public Criteria andSlNoNotLike(String value) {
            addCriterion("SL_NO not like", value, "slNo");
            return (Criteria) this;
        }

        public Criteria andSlNoIn(List<String> values) {
            addCriterion("SL_NO in", values, "slNo");
            return (Criteria) this;
        }

        public Criteria andSlNoNotIn(List<String> values) {
            addCriterion("SL_NO not in", values, "slNo");
            return (Criteria) this;
        }

        public Criteria andSlNoBetween(String value1, String value2) {
            addCriterion("SL_NO between", value1, value2, "slNo");
            return (Criteria) this;
        }

        public Criteria andSlNoNotBetween(String value1, String value2) {
            addCriterion("SL_NO not between", value1, value2, "slNo");
            return (Criteria) this;
        }

        public Criteria andShNoCusIsNull() {
            addCriterion("SH_NO_CUS is null");
            return (Criteria) this;
        }

        public Criteria andShNoCusIsNotNull() {
            addCriterion("SH_NO_CUS is not null");
            return (Criteria) this;
        }

        public Criteria andShNoCusEqualTo(String value) {
            addCriterion("SH_NO_CUS =", value, "shNoCus");
            return (Criteria) this;
        }

        public Criteria andShNoCusNotEqualTo(String value) {
            addCriterion("SH_NO_CUS <>", value, "shNoCus");
            return (Criteria) this;
        }

        public Criteria andShNoCusGreaterThan(String value) {
            addCriterion("SH_NO_CUS >", value, "shNoCus");
            return (Criteria) this;
        }

        public Criteria andShNoCusGreaterThanOrEqualTo(String value) {
            addCriterion("SH_NO_CUS >=", value, "shNoCus");
            return (Criteria) this;
        }

        public Criteria andShNoCusLessThan(String value) {
            addCriterion("SH_NO_CUS <", value, "shNoCus");
            return (Criteria) this;
        }

        public Criteria andShNoCusLessThanOrEqualTo(String value) {
            addCriterion("SH_NO_CUS <=", value, "shNoCus");
            return (Criteria) this;
        }

        public Criteria andShNoCusLike(String value) {
            addCriterion("SH_NO_CUS like", value, "shNoCus");
            return (Criteria) this;
        }

        public Criteria andShNoCusNotLike(String value) {
            addCriterion("SH_NO_CUS not like", value, "shNoCus");
            return (Criteria) this;
        }

        public Criteria andShNoCusIn(List<String> values) {
            addCriterion("SH_NO_CUS in", values, "shNoCus");
            return (Criteria) this;
        }

        public Criteria andShNoCusNotIn(List<String> values) {
            addCriterion("SH_NO_CUS not in", values, "shNoCus");
            return (Criteria) this;
        }

        public Criteria andShNoCusBetween(String value1, String value2) {
            addCriterion("SH_NO_CUS between", value1, value2, "shNoCus");
            return (Criteria) this;
        }

        public Criteria andShNoCusNotBetween(String value1, String value2) {
            addCriterion("SH_NO_CUS not between", value1, value2, "shNoCus");
            return (Criteria) this;
        }

        public Criteria andAmtnEp1IsNull() {
            addCriterion("AMTN_EP1 is null");
            return (Criteria) this;
        }

        public Criteria andAmtnEp1IsNotNull() {
            addCriterion("AMTN_EP1 is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnEp1EqualTo(BigDecimal value) {
            addCriterion("AMTN_EP1 =", value, "amtnEp1");
            return (Criteria) this;
        }

        public Criteria andAmtnEp1NotEqualTo(BigDecimal value) {
            addCriterion("AMTN_EP1 <>", value, "amtnEp1");
            return (Criteria) this;
        }

        public Criteria andAmtnEp1GreaterThan(BigDecimal value) {
            addCriterion("AMTN_EP1 >", value, "amtnEp1");
            return (Criteria) this;
        }

        public Criteria andAmtnEp1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_EP1 >=", value, "amtnEp1");
            return (Criteria) this;
        }

        public Criteria andAmtnEp1LessThan(BigDecimal value) {
            addCriterion("AMTN_EP1 <", value, "amtnEp1");
            return (Criteria) this;
        }

        public Criteria andAmtnEp1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_EP1 <=", value, "amtnEp1");
            return (Criteria) this;
        }

        public Criteria andAmtnEp1In(List<BigDecimal> values) {
            addCriterion("AMTN_EP1 in", values, "amtnEp1");
            return (Criteria) this;
        }

        public Criteria andAmtnEp1NotIn(List<BigDecimal> values) {
            addCriterion("AMTN_EP1 not in", values, "amtnEp1");
            return (Criteria) this;
        }

        public Criteria andAmtnEp1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_EP1 between", value1, value2, "amtnEp1");
            return (Criteria) this;
        }

        public Criteria andAmtnEp1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_EP1 not between", value1, value2, "amtnEp1");
            return (Criteria) this;
        }

        public Criteria andRtoEpIsNull() {
            addCriterion("RTO_EP is null");
            return (Criteria) this;
        }

        public Criteria andRtoEpIsNotNull() {
            addCriterion("RTO_EP is not null");
            return (Criteria) this;
        }

        public Criteria andRtoEpEqualTo(BigDecimal value) {
            addCriterion("RTO_EP =", value, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpNotEqualTo(BigDecimal value) {
            addCriterion("RTO_EP <>", value, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpGreaterThan(BigDecimal value) {
            addCriterion("RTO_EP >", value, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_EP >=", value, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpLessThan(BigDecimal value) {
            addCriterion("RTO_EP <", value, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_EP <=", value, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpIn(List<BigDecimal> values) {
            addCriterion("RTO_EP in", values, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpNotIn(List<BigDecimal> values) {
            addCriterion("RTO_EP not in", values, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_EP between", value1, value2, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_EP not between", value1, value2, "rtoEp");
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

        public Criteria andAmtnFlIsNull() {
            addCriterion("AMTN_FL is null");
            return (Criteria) this;
        }

        public Criteria andAmtnFlIsNotNull() {
            addCriterion("AMTN_FL is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnFlEqualTo(BigDecimal value) {
            addCriterion("AMTN_FL =", value, "amtnFl");
            return (Criteria) this;
        }

        public Criteria andAmtnFlNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_FL <>", value, "amtnFl");
            return (Criteria) this;
        }

        public Criteria andAmtnFlGreaterThan(BigDecimal value) {
            addCriterion("AMTN_FL >", value, "amtnFl");
            return (Criteria) this;
        }

        public Criteria andAmtnFlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_FL >=", value, "amtnFl");
            return (Criteria) this;
        }

        public Criteria andAmtnFlLessThan(BigDecimal value) {
            addCriterion("AMTN_FL <", value, "amtnFl");
            return (Criteria) this;
        }

        public Criteria andAmtnFlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_FL <=", value, "amtnFl");
            return (Criteria) this;
        }

        public Criteria andAmtnFlIn(List<BigDecimal> values) {
            addCriterion("AMTN_FL in", values, "amtnFl");
            return (Criteria) this;
        }

        public Criteria andAmtnFlNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_FL not in", values, "amtnFl");
            return (Criteria) this;
        }

        public Criteria andAmtnFlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_FL between", value1, value2, "amtnFl");
            return (Criteria) this;
        }

        public Criteria andAmtnFlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_FL not between", value1, value2, "amtnFl");
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

        public Criteria andAmtnSaleIsNull() {
            addCriterion("AMTN_SALE is null");
            return (Criteria) this;
        }

        public Criteria andAmtnSaleIsNotNull() {
            addCriterion("AMTN_SALE is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnSaleEqualTo(BigDecimal value) {
            addCriterion("AMTN_SALE =", value, "amtnSale");
            return (Criteria) this;
        }

        public Criteria andAmtnSaleNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_SALE <>", value, "amtnSale");
            return (Criteria) this;
        }

        public Criteria andAmtnSaleGreaterThan(BigDecimal value) {
            addCriterion("AMTN_SALE >", value, "amtnSale");
            return (Criteria) this;
        }

        public Criteria andAmtnSaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_SALE >=", value, "amtnSale");
            return (Criteria) this;
        }

        public Criteria andAmtnSaleLessThan(BigDecimal value) {
            addCriterion("AMTN_SALE <", value, "amtnSale");
            return (Criteria) this;
        }

        public Criteria andAmtnSaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_SALE <=", value, "amtnSale");
            return (Criteria) this;
        }

        public Criteria andAmtnSaleIn(List<BigDecimal> values) {
            addCriterion("AMTN_SALE in", values, "amtnSale");
            return (Criteria) this;
        }

        public Criteria andAmtnSaleNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_SALE not in", values, "amtnSale");
            return (Criteria) this;
        }

        public Criteria andAmtnSaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_SALE between", value1, value2, "amtnSale");
            return (Criteria) this;
        }

        public Criteria andAmtnSaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_SALE not between", value1, value2, "amtnSale");
            return (Criteria) this;
        }

        public Criteria andUpSaleIsNull() {
            addCriterion("UP_SALE is null");
            return (Criteria) this;
        }

        public Criteria andUpSaleIsNotNull() {
            addCriterion("UP_SALE is not null");
            return (Criteria) this;
        }

        public Criteria andUpSaleEqualTo(BigDecimal value) {
            addCriterion("UP_SALE =", value, "upSale");
            return (Criteria) this;
        }

        public Criteria andUpSaleNotEqualTo(BigDecimal value) {
            addCriterion("UP_SALE <>", value, "upSale");
            return (Criteria) this;
        }

        public Criteria andUpSaleGreaterThan(BigDecimal value) {
            addCriterion("UP_SALE >", value, "upSale");
            return (Criteria) this;
        }

        public Criteria andUpSaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_SALE >=", value, "upSale");
            return (Criteria) this;
        }

        public Criteria andUpSaleLessThan(BigDecimal value) {
            addCriterion("UP_SALE <", value, "upSale");
            return (Criteria) this;
        }

        public Criteria andUpSaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_SALE <=", value, "upSale");
            return (Criteria) this;
        }

        public Criteria andUpSaleIn(List<BigDecimal> values) {
            addCriterion("UP_SALE in", values, "upSale");
            return (Criteria) this;
        }

        public Criteria andUpSaleNotIn(List<BigDecimal> values) {
            addCriterion("UP_SALE not in", values, "upSale");
            return (Criteria) this;
        }

        public Criteria andUpSaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_SALE between", value1, value2, "upSale");
            return (Criteria) this;
        }

        public Criteria andUpSaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_SALE not between", value1, value2, "upSale");
            return (Criteria) this;
        }

        public Criteria andQcFlagIsNull() {
            addCriterion("QC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andQcFlagIsNotNull() {
            addCriterion("QC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andQcFlagEqualTo(String value) {
            addCriterion("QC_FLAG =", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagNotEqualTo(String value) {
            addCriterion("QC_FLAG <>", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagGreaterThan(String value) {
            addCriterion("QC_FLAG >", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagGreaterThanOrEqualTo(String value) {
            addCriterion("QC_FLAG >=", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagLessThan(String value) {
            addCriterion("QC_FLAG <", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagLessThanOrEqualTo(String value) {
            addCriterion("QC_FLAG <=", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagLike(String value) {
            addCriterion("QC_FLAG like", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagNotLike(String value) {
            addCriterion("QC_FLAG not like", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagIn(List<String> values) {
            addCriterion("QC_FLAG in", values, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagNotIn(List<String> values) {
            addCriterion("QC_FLAG not in", values, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagBetween(String value1, String value2) {
            addCriterion("QC_FLAG between", value1, value2, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagNotBetween(String value1, String value2) {
            addCriterion("QC_FLAG not between", value1, value2, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andSlItmIsNull() {
            addCriterion("SL_ITM is null");
            return (Criteria) this;
        }

        public Criteria andSlItmIsNotNull() {
            addCriterion("SL_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andSlItmEqualTo(Integer value) {
            addCriterion("SL_ITM =", value, "slItm");
            return (Criteria) this;
        }

        public Criteria andSlItmNotEqualTo(Integer value) {
            addCriterion("SL_ITM <>", value, "slItm");
            return (Criteria) this;
        }

        public Criteria andSlItmGreaterThan(Integer value) {
            addCriterion("SL_ITM >", value, "slItm");
            return (Criteria) this;
        }

        public Criteria andSlItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("SL_ITM >=", value, "slItm");
            return (Criteria) this;
        }

        public Criteria andSlItmLessThan(Integer value) {
            addCriterion("SL_ITM <", value, "slItm");
            return (Criteria) this;
        }

        public Criteria andSlItmLessThanOrEqualTo(Integer value) {
            addCriterion("SL_ITM <=", value, "slItm");
            return (Criteria) this;
        }

        public Criteria andSlItmIn(List<Integer> values) {
            addCriterion("SL_ITM in", values, "slItm");
            return (Criteria) this;
        }

        public Criteria andSlItmNotIn(List<Integer> values) {
            addCriterion("SL_ITM not in", values, "slItm");
            return (Criteria) this;
        }

        public Criteria andSlItmBetween(Integer value1, Integer value2) {
            addCriterion("SL_ITM between", value1, value2, "slItm");
            return (Criteria) this;
        }

        public Criteria andSlItmNotBetween(Integer value1, Integer value2) {
            addCriterion("SL_ITM not between", value1, value2, "slItm");
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

        public Criteria andQtyRtnArkIsNull() {
            addCriterion("QTY_RTN_ARK is null");
            return (Criteria) this;
        }

        public Criteria andQtyRtnArkIsNotNull() {
            addCriterion("QTY_RTN_ARK is not null");
            return (Criteria) this;
        }

        public Criteria andQtyRtnArkEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN_ARK =", value, "qtyRtnArk");
            return (Criteria) this;
        }

        public Criteria andQtyRtnArkNotEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN_ARK <>", value, "qtyRtnArk");
            return (Criteria) this;
        }

        public Criteria andQtyRtnArkGreaterThan(BigDecimal value) {
            addCriterion("QTY_RTN_ARK >", value, "qtyRtnArk");
            return (Criteria) this;
        }

        public Criteria andQtyRtnArkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN_ARK >=", value, "qtyRtnArk");
            return (Criteria) this;
        }

        public Criteria andQtyRtnArkLessThan(BigDecimal value) {
            addCriterion("QTY_RTN_ARK <", value, "qtyRtnArk");
            return (Criteria) this;
        }

        public Criteria andQtyRtnArkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN_ARK <=", value, "qtyRtnArk");
            return (Criteria) this;
        }

        public Criteria andQtyRtnArkIn(List<BigDecimal> values) {
            addCriterion("QTY_RTN_ARK in", values, "qtyRtnArk");
            return (Criteria) this;
        }

        public Criteria andQtyRtnArkNotIn(List<BigDecimal> values) {
            addCriterion("QTY_RTN_ARK not in", values, "qtyRtnArk");
            return (Criteria) this;
        }

        public Criteria andQtyRtnArkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_RTN_ARK between", value1, value2, "qtyRtnArk");
            return (Criteria) this;
        }

        public Criteria andQtyRtnArkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_RTN_ARK not between", value1, value2, "qtyRtnArk");
            return (Criteria) this;
        }

        public Criteria andQcItmIsNull() {
            addCriterion("QC_ITM is null");
            return (Criteria) this;
        }

        public Criteria andQcItmIsNotNull() {
            addCriterion("QC_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andQcItmEqualTo(Integer value) {
            addCriterion("QC_ITM =", value, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmNotEqualTo(Integer value) {
            addCriterion("QC_ITM <>", value, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmGreaterThan(Integer value) {
            addCriterion("QC_ITM >", value, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("QC_ITM >=", value, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmLessThan(Integer value) {
            addCriterion("QC_ITM <", value, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmLessThanOrEqualTo(Integer value) {
            addCriterion("QC_ITM <=", value, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmIn(List<Integer> values) {
            addCriterion("QC_ITM in", values, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmNotIn(List<Integer> values) {
            addCriterion("QC_ITM not in", values, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmBetween(Integer value1, Integer value2) {
            addCriterion("QC_ITM between", value1, value2, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmNotBetween(Integer value1, Integer value2) {
            addCriterion("QC_ITM not between", value1, value2, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQtyOutIsNull() {
            addCriterion("QTY_OUT is null");
            return (Criteria) this;
        }

        public Criteria andQtyOutIsNotNull() {
            addCriterion("QTY_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andQtyOutEqualTo(BigDecimal value) {
            addCriterion("QTY_OUT =", value, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutNotEqualTo(BigDecimal value) {
            addCriterion("QTY_OUT <>", value, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutGreaterThan(BigDecimal value) {
            addCriterion("QTY_OUT >", value, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_OUT >=", value, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutLessThan(BigDecimal value) {
            addCriterion("QTY_OUT <", value, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_OUT <=", value, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutIn(List<BigDecimal> values) {
            addCriterion("QTY_OUT in", values, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutNotIn(List<BigDecimal> values) {
            addCriterion("QTY_OUT not in", values, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_OUT between", value1, value2, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_OUT not between", value1, value2, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyZqIsNull() {
            addCriterion("QTY_ZQ is null");
            return (Criteria) this;
        }

        public Criteria andQtyZqIsNotNull() {
            addCriterion("QTY_ZQ is not null");
            return (Criteria) this;
        }

        public Criteria andQtyZqEqualTo(BigDecimal value) {
            addCriterion("QTY_ZQ =", value, "qtyZq");
            return (Criteria) this;
        }

        public Criteria andQtyZqNotEqualTo(BigDecimal value) {
            addCriterion("QTY_ZQ <>", value, "qtyZq");
            return (Criteria) this;
        }

        public Criteria andQtyZqGreaterThan(BigDecimal value) {
            addCriterion("QTY_ZQ >", value, "qtyZq");
            return (Criteria) this;
        }

        public Criteria andQtyZqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_ZQ >=", value, "qtyZq");
            return (Criteria) this;
        }

        public Criteria andQtyZqLessThan(BigDecimal value) {
            addCriterion("QTY_ZQ <", value, "qtyZq");
            return (Criteria) this;
        }

        public Criteria andQtyZqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_ZQ <=", value, "qtyZq");
            return (Criteria) this;
        }

        public Criteria andQtyZqIn(List<BigDecimal> values) {
            addCriterion("QTY_ZQ in", values, "qtyZq");
            return (Criteria) this;
        }

        public Criteria andQtyZqNotIn(List<BigDecimal> values) {
            addCriterion("QTY_ZQ not in", values, "qtyZq");
            return (Criteria) this;
        }

        public Criteria andQtyZqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_ZQ between", value1, value2, "qtyZq");
            return (Criteria) this;
        }

        public Criteria andQtyZqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_ZQ not between", value1, value2, "qtyZq");
            return (Criteria) this;
        }

        public Criteria andBlOsIdIsNull() {
            addCriterion("BL_OS_ID is null");
            return (Criteria) this;
        }

        public Criteria andBlOsIdIsNotNull() {
            addCriterion("BL_OS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBlOsIdEqualTo(String value) {
            addCriterion("BL_OS_ID =", value, "blOsId");
            return (Criteria) this;
        }

        public Criteria andBlOsIdNotEqualTo(String value) {
            addCriterion("BL_OS_ID <>", value, "blOsId");
            return (Criteria) this;
        }

        public Criteria andBlOsIdGreaterThan(String value) {
            addCriterion("BL_OS_ID >", value, "blOsId");
            return (Criteria) this;
        }

        public Criteria andBlOsIdGreaterThanOrEqualTo(String value) {
            addCriterion("BL_OS_ID >=", value, "blOsId");
            return (Criteria) this;
        }

        public Criteria andBlOsIdLessThan(String value) {
            addCriterion("BL_OS_ID <", value, "blOsId");
            return (Criteria) this;
        }

        public Criteria andBlOsIdLessThanOrEqualTo(String value) {
            addCriterion("BL_OS_ID <=", value, "blOsId");
            return (Criteria) this;
        }

        public Criteria andBlOsIdLike(String value) {
            addCriterion("BL_OS_ID like", value, "blOsId");
            return (Criteria) this;
        }

        public Criteria andBlOsIdNotLike(String value) {
            addCriterion("BL_OS_ID not like", value, "blOsId");
            return (Criteria) this;
        }

        public Criteria andBlOsIdIn(List<String> values) {
            addCriterion("BL_OS_ID in", values, "blOsId");
            return (Criteria) this;
        }

        public Criteria andBlOsIdNotIn(List<String> values) {
            addCriterion("BL_OS_ID not in", values, "blOsId");
            return (Criteria) this;
        }

        public Criteria andBlOsIdBetween(String value1, String value2) {
            addCriterion("BL_OS_ID between", value1, value2, "blOsId");
            return (Criteria) this;
        }

        public Criteria andBlOsIdNotBetween(String value1, String value2) {
            addCriterion("BL_OS_ID not between", value1, value2, "blOsId");
            return (Criteria) this;
        }

        public Criteria andBlOsNoIsNull() {
            addCriterion("BL_OS_NO is null");
            return (Criteria) this;
        }

        public Criteria andBlOsNoIsNotNull() {
            addCriterion("BL_OS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBlOsNoEqualTo(String value) {
            addCriterion("BL_OS_NO =", value, "blOsNo");
            return (Criteria) this;
        }

        public Criteria andBlOsNoNotEqualTo(String value) {
            addCriterion("BL_OS_NO <>", value, "blOsNo");
            return (Criteria) this;
        }

        public Criteria andBlOsNoGreaterThan(String value) {
            addCriterion("BL_OS_NO >", value, "blOsNo");
            return (Criteria) this;
        }

        public Criteria andBlOsNoGreaterThanOrEqualTo(String value) {
            addCriterion("BL_OS_NO >=", value, "blOsNo");
            return (Criteria) this;
        }

        public Criteria andBlOsNoLessThan(String value) {
            addCriterion("BL_OS_NO <", value, "blOsNo");
            return (Criteria) this;
        }

        public Criteria andBlOsNoLessThanOrEqualTo(String value) {
            addCriterion("BL_OS_NO <=", value, "blOsNo");
            return (Criteria) this;
        }

        public Criteria andBlOsNoLike(String value) {
            addCriterion("BL_OS_NO like", value, "blOsNo");
            return (Criteria) this;
        }

        public Criteria andBlOsNoNotLike(String value) {
            addCriterion("BL_OS_NO not like", value, "blOsNo");
            return (Criteria) this;
        }

        public Criteria andBlOsNoIn(List<String> values) {
            addCriterion("BL_OS_NO in", values, "blOsNo");
            return (Criteria) this;
        }

        public Criteria andBlOsNoNotIn(List<String> values) {
            addCriterion("BL_OS_NO not in", values, "blOsNo");
            return (Criteria) this;
        }

        public Criteria andBlOsNoBetween(String value1, String value2) {
            addCriterion("BL_OS_NO between", value1, value2, "blOsNo");
            return (Criteria) this;
        }

        public Criteria andBlOsNoNotBetween(String value1, String value2) {
            addCriterion("BL_OS_NO not between", value1, value2, "blOsNo");
            return (Criteria) this;
        }

        public Criteria andBlOsItmIsNull() {
            addCriterion("BL_OS_ITM is null");
            return (Criteria) this;
        }

        public Criteria andBlOsItmIsNotNull() {
            addCriterion("BL_OS_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andBlOsItmEqualTo(Integer value) {
            addCriterion("BL_OS_ITM =", value, "blOsItm");
            return (Criteria) this;
        }

        public Criteria andBlOsItmNotEqualTo(Integer value) {
            addCriterion("BL_OS_ITM <>", value, "blOsItm");
            return (Criteria) this;
        }

        public Criteria andBlOsItmGreaterThan(Integer value) {
            addCriterion("BL_OS_ITM >", value, "blOsItm");
            return (Criteria) this;
        }

        public Criteria andBlOsItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("BL_OS_ITM >=", value, "blOsItm");
            return (Criteria) this;
        }

        public Criteria andBlOsItmLessThan(Integer value) {
            addCriterion("BL_OS_ITM <", value, "blOsItm");
            return (Criteria) this;
        }

        public Criteria andBlOsItmLessThanOrEqualTo(Integer value) {
            addCriterion("BL_OS_ITM <=", value, "blOsItm");
            return (Criteria) this;
        }

        public Criteria andBlOsItmIn(List<Integer> values) {
            addCriterion("BL_OS_ITM in", values, "blOsItm");
            return (Criteria) this;
        }

        public Criteria andBlOsItmNotIn(List<Integer> values) {
            addCriterion("BL_OS_ITM not in", values, "blOsItm");
            return (Criteria) this;
        }

        public Criteria andBlOsItmBetween(Integer value1, Integer value2) {
            addCriterion("BL_OS_ITM between", value1, value2, "blOsItm");
            return (Criteria) this;
        }

        public Criteria andBlOsItmNotBetween(Integer value1, Integer value2) {
            addCriterion("BL_OS_ITM not between", value1, value2, "blOsItm");
            return (Criteria) this;
        }

        public Criteria andRkDdIsNull() {
            addCriterion("RK_DD is null");
            return (Criteria) this;
        }

        public Criteria andRkDdIsNotNull() {
            addCriterion("RK_DD is not null");
            return (Criteria) this;
        }

        public Criteria andRkDdEqualTo(Date value) {
            addCriterion("RK_DD =", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdNotEqualTo(Date value) {
            addCriterion("RK_DD <>", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdGreaterThan(Date value) {
            addCriterion("RK_DD >", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdGreaterThanOrEqualTo(Date value) {
            addCriterion("RK_DD >=", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdLessThan(Date value) {
            addCriterion("RK_DD <", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdLessThanOrEqualTo(Date value) {
            addCriterion("RK_DD <=", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdIn(List<Date> values) {
            addCriterion("RK_DD in", values, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdNotIn(List<Date> values) {
            addCriterion("RK_DD not in", values, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdBetween(Date value1, Date value2) {
            addCriterion("RK_DD between", value1, value2, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdNotBetween(Date value1, Date value2) {
            addCriterion("RK_DD not between", value1, value2, "rkDd");
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

        public Criteria andDepRkIsNull() {
            addCriterion("DEP_RK is null");
            return (Criteria) this;
        }

        public Criteria andDepRkIsNotNull() {
            addCriterion("DEP_RK is not null");
            return (Criteria) this;
        }

        public Criteria andDepRkEqualTo(String value) {
            addCriterion("DEP_RK =", value, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkNotEqualTo(String value) {
            addCriterion("DEP_RK <>", value, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkGreaterThan(String value) {
            addCriterion("DEP_RK >", value, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkGreaterThanOrEqualTo(String value) {
            addCriterion("DEP_RK >=", value, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkLessThan(String value) {
            addCriterion("DEP_RK <", value, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkLessThanOrEqualTo(String value) {
            addCriterion("DEP_RK <=", value, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkLike(String value) {
            addCriterion("DEP_RK like", value, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkNotLike(String value) {
            addCriterion("DEP_RK not like", value, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkIn(List<String> values) {
            addCriterion("DEP_RK in", values, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkNotIn(List<String> values) {
            addCriterion("DEP_RK not in", values, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkBetween(String value1, String value2) {
            addCriterion("DEP_RK between", value1, value2, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkNotBetween(String value1, String value2) {
            addCriterion("DEP_RK not between", value1, value2, "depRk");
            return (Criteria) this;
        }

        public Criteria andQtyXbIsNull() {
            addCriterion("QTY_XB is null");
            return (Criteria) this;
        }

        public Criteria andQtyXbIsNotNull() {
            addCriterion("QTY_XB is not null");
            return (Criteria) this;
        }

        public Criteria andQtyXbEqualTo(BigDecimal value) {
            addCriterion("QTY_XB =", value, "qtyXb");
            return (Criteria) this;
        }

        public Criteria andQtyXbNotEqualTo(BigDecimal value) {
            addCriterion("QTY_XB <>", value, "qtyXb");
            return (Criteria) this;
        }

        public Criteria andQtyXbGreaterThan(BigDecimal value) {
            addCriterion("QTY_XB >", value, "qtyXb");
            return (Criteria) this;
        }

        public Criteria andQtyXbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_XB >=", value, "qtyXb");
            return (Criteria) this;
        }

        public Criteria andQtyXbLessThan(BigDecimal value) {
            addCriterion("QTY_XB <", value, "qtyXb");
            return (Criteria) this;
        }

        public Criteria andQtyXbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_XB <=", value, "qtyXb");
            return (Criteria) this;
        }

        public Criteria andQtyXbIn(List<BigDecimal> values) {
            addCriterion("QTY_XB in", values, "qtyXb");
            return (Criteria) this;
        }

        public Criteria andQtyXbNotIn(List<BigDecimal> values) {
            addCriterion("QTY_XB not in", values, "qtyXb");
            return (Criteria) this;
        }

        public Criteria andQtyXbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_XB between", value1, value2, "qtyXb");
            return (Criteria) this;
        }

        public Criteria andQtyXbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_XB not between", value1, value2, "qtyXb");
            return (Criteria) this;
        }

        public Criteria andQtyXbUnshIsNull() {
            addCriterion("QTY_XB_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyXbUnshIsNotNull() {
            addCriterion("QTY_XB_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyXbUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_XB_UNSH =", value, "qtyXbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyXbUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_XB_UNSH <>", value, "qtyXbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyXbUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_XB_UNSH >", value, "qtyXbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyXbUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_XB_UNSH >=", value, "qtyXbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyXbUnshLessThan(BigDecimal value) {
            addCriterion("QTY_XB_UNSH <", value, "qtyXbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyXbUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_XB_UNSH <=", value, "qtyXbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyXbUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_XB_UNSH in", values, "qtyXbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyXbUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_XB_UNSH not in", values, "qtyXbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyXbUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_XB_UNSH between", value1, value2, "qtyXbUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyXbUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_XB_UNSH not between", value1, value2, "qtyXbUnsh");
            return (Criteria) this;
        }

        public Criteria andPwItmIsNull() {
            addCriterion("PW_ITM is null");
            return (Criteria) this;
        }

        public Criteria andPwItmIsNotNull() {
            addCriterion("PW_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andPwItmEqualTo(Integer value) {
            addCriterion("PW_ITM =", value, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmNotEqualTo(Integer value) {
            addCriterion("PW_ITM <>", value, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmGreaterThan(Integer value) {
            addCriterion("PW_ITM >", value, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("PW_ITM >=", value, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmLessThan(Integer value) {
            addCriterion("PW_ITM <", value, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmLessThanOrEqualTo(Integer value) {
            addCriterion("PW_ITM <=", value, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmIn(List<Integer> values) {
            addCriterion("PW_ITM in", values, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmNotIn(List<Integer> values) {
            addCriterion("PW_ITM not in", values, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmBetween(Integer value1, Integer value2) {
            addCriterion("PW_ITM between", value1, value2, "pwItm");
            return (Criteria) this;
        }

        public Criteria andPwItmNotBetween(Integer value1, Integer value2) {
            addCriterion("PW_ITM not between", value1, value2, "pwItm");
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

        public Criteria andMmNoIsNull() {
            addCriterion("MM_NO is null");
            return (Criteria) this;
        }

        public Criteria andMmNoIsNotNull() {
            addCriterion("MM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMmNoEqualTo(String value) {
            addCriterion("MM_NO =", value, "mmNo");
            return (Criteria) this;
        }

        public Criteria andMmNoNotEqualTo(String value) {
            addCriterion("MM_NO <>", value, "mmNo");
            return (Criteria) this;
        }

        public Criteria andMmNoGreaterThan(String value) {
            addCriterion("MM_NO >", value, "mmNo");
            return (Criteria) this;
        }

        public Criteria andMmNoGreaterThanOrEqualTo(String value) {
            addCriterion("MM_NO >=", value, "mmNo");
            return (Criteria) this;
        }

        public Criteria andMmNoLessThan(String value) {
            addCriterion("MM_NO <", value, "mmNo");
            return (Criteria) this;
        }

        public Criteria andMmNoLessThanOrEqualTo(String value) {
            addCriterion("MM_NO <=", value, "mmNo");
            return (Criteria) this;
        }

        public Criteria andMmNoLike(String value) {
            addCriterion("MM_NO like", value, "mmNo");
            return (Criteria) this;
        }

        public Criteria andMmNoNotLike(String value) {
            addCriterion("MM_NO not like", value, "mmNo");
            return (Criteria) this;
        }

        public Criteria andMmNoIn(List<String> values) {
            addCriterion("MM_NO in", values, "mmNo");
            return (Criteria) this;
        }

        public Criteria andMmNoNotIn(List<String> values) {
            addCriterion("MM_NO not in", values, "mmNo");
            return (Criteria) this;
        }

        public Criteria andMmNoBetween(String value1, String value2) {
            addCriterion("MM_NO between", value1, value2, "mmNo");
            return (Criteria) this;
        }

        public Criteria andMmNoNotBetween(String value1, String value2) {
            addCriterion("MM_NO not between", value1, value2, "mmNo");
            return (Criteria) this;
        }

        public Criteria andMmItmIsNull() {
            addCriterion("MM_ITM is null");
            return (Criteria) this;
        }

        public Criteria andMmItmIsNotNull() {
            addCriterion("MM_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andMmItmEqualTo(Integer value) {
            addCriterion("MM_ITM =", value, "mmItm");
            return (Criteria) this;
        }

        public Criteria andMmItmNotEqualTo(Integer value) {
            addCriterion("MM_ITM <>", value, "mmItm");
            return (Criteria) this;
        }

        public Criteria andMmItmGreaterThan(Integer value) {
            addCriterion("MM_ITM >", value, "mmItm");
            return (Criteria) this;
        }

        public Criteria andMmItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("MM_ITM >=", value, "mmItm");
            return (Criteria) this;
        }

        public Criteria andMmItmLessThan(Integer value) {
            addCriterion("MM_ITM <", value, "mmItm");
            return (Criteria) this;
        }

        public Criteria andMmItmLessThanOrEqualTo(Integer value) {
            addCriterion("MM_ITM <=", value, "mmItm");
            return (Criteria) this;
        }

        public Criteria andMmItmIn(List<Integer> values) {
            addCriterion("MM_ITM in", values, "mmItm");
            return (Criteria) this;
        }

        public Criteria andMmItmNotIn(List<Integer> values) {
            addCriterion("MM_ITM not in", values, "mmItm");
            return (Criteria) this;
        }

        public Criteria andMmItmBetween(Integer value1, Integer value2) {
            addCriterion("MM_ITM between", value1, value2, "mmItm");
            return (Criteria) this;
        }

        public Criteria andMmItmNotBetween(Integer value1, Integer value2) {
            addCriterion("MM_ITM not between", value1, value2, "mmItm");
            return (Criteria) this;
        }

        public Criteria andFwFlagIsNull() {
            addCriterion("FW_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFwFlagIsNotNull() {
            addCriterion("FW_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFwFlagEqualTo(String value) {
            addCriterion("FW_FLAG =", value, "fwFlag");
            return (Criteria) this;
        }

        public Criteria andFwFlagNotEqualTo(String value) {
            addCriterion("FW_FLAG <>", value, "fwFlag");
            return (Criteria) this;
        }

        public Criteria andFwFlagGreaterThan(String value) {
            addCriterion("FW_FLAG >", value, "fwFlag");
            return (Criteria) this;
        }

        public Criteria andFwFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FW_FLAG >=", value, "fwFlag");
            return (Criteria) this;
        }

        public Criteria andFwFlagLessThan(String value) {
            addCriterion("FW_FLAG <", value, "fwFlag");
            return (Criteria) this;
        }

        public Criteria andFwFlagLessThanOrEqualTo(String value) {
            addCriterion("FW_FLAG <=", value, "fwFlag");
            return (Criteria) this;
        }

        public Criteria andFwFlagLike(String value) {
            addCriterion("FW_FLAG like", value, "fwFlag");
            return (Criteria) this;
        }

        public Criteria andFwFlagNotLike(String value) {
            addCriterion("FW_FLAG not like", value, "fwFlag");
            return (Criteria) this;
        }

        public Criteria andFwFlagIn(List<String> values) {
            addCriterion("FW_FLAG in", values, "fwFlag");
            return (Criteria) this;
        }

        public Criteria andFwFlagNotIn(List<String> values) {
            addCriterion("FW_FLAG not in", values, "fwFlag");
            return (Criteria) this;
        }

        public Criteria andFwFlagBetween(String value1, String value2) {
            addCriterion("FW_FLAG between", value1, value2, "fwFlag");
            return (Criteria) this;
        }

        public Criteria andFwFlagNotBetween(String value1, String value2) {
            addCriterion("FW_FLAG not between", value1, value2, "fwFlag");
            return (Criteria) this;
        }

        public Criteria andZdzzIsNull() {
            addCriterion("ZDZZ is null");
            return (Criteria) this;
        }

        public Criteria andZdzzIsNotNull() {
            addCriterion("ZDZZ is not null");
            return (Criteria) this;
        }

        public Criteria andZdzzEqualTo(String value) {
            addCriterion("ZDZZ =", value, "zdzz");
            return (Criteria) this;
        }

        public Criteria andZdzzNotEqualTo(String value) {
            addCriterion("ZDZZ <>", value, "zdzz");
            return (Criteria) this;
        }

        public Criteria andZdzzGreaterThan(String value) {
            addCriterion("ZDZZ >", value, "zdzz");
            return (Criteria) this;
        }

        public Criteria andZdzzGreaterThanOrEqualTo(String value) {
            addCriterion("ZDZZ >=", value, "zdzz");
            return (Criteria) this;
        }

        public Criteria andZdzzLessThan(String value) {
            addCriterion("ZDZZ <", value, "zdzz");
            return (Criteria) this;
        }

        public Criteria andZdzzLessThanOrEqualTo(String value) {
            addCriterion("ZDZZ <=", value, "zdzz");
            return (Criteria) this;
        }

        public Criteria andZdzzLike(String value) {
            addCriterion("ZDZZ like", value, "zdzz");
            return (Criteria) this;
        }

        public Criteria andZdzzNotLike(String value) {
            addCriterion("ZDZZ not like", value, "zdzz");
            return (Criteria) this;
        }

        public Criteria andZdzzIn(List<String> values) {
            addCriterion("ZDZZ in", values, "zdzz");
            return (Criteria) this;
        }

        public Criteria andZdzzNotIn(List<String> values) {
            addCriterion("ZDZZ not in", values, "zdzz");
            return (Criteria) this;
        }

        public Criteria andZdzzBetween(String value1, String value2) {
            addCriterion("ZDZZ between", value1, value2, "zdzz");
            return (Criteria) this;
        }

        public Criteria andZdzzNotBetween(String value1, String value2) {
            addCriterion("ZDZZ not between", value1, value2, "zdzz");
            return (Criteria) this;
        }

        public Criteria andMbNoIsNull() {
            addCriterion("MB_NO is null");
            return (Criteria) this;
        }

        public Criteria andMbNoIsNotNull() {
            addCriterion("MB_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMbNoEqualTo(String value) {
            addCriterion("MB_NO =", value, "mbNo");
            return (Criteria) this;
        }

        public Criteria andMbNoNotEqualTo(String value) {
            addCriterion("MB_NO <>", value, "mbNo");
            return (Criteria) this;
        }

        public Criteria andMbNoGreaterThan(String value) {
            addCriterion("MB_NO >", value, "mbNo");
            return (Criteria) this;
        }

        public Criteria andMbNoGreaterThanOrEqualTo(String value) {
            addCriterion("MB_NO >=", value, "mbNo");
            return (Criteria) this;
        }

        public Criteria andMbNoLessThan(String value) {
            addCriterion("MB_NO <", value, "mbNo");
            return (Criteria) this;
        }

        public Criteria andMbNoLessThanOrEqualTo(String value) {
            addCriterion("MB_NO <=", value, "mbNo");
            return (Criteria) this;
        }

        public Criteria andMbNoLike(String value) {
            addCriterion("MB_NO like", value, "mbNo");
            return (Criteria) this;
        }

        public Criteria andMbNoNotLike(String value) {
            addCriterion("MB_NO not like", value, "mbNo");
            return (Criteria) this;
        }

        public Criteria andMbNoIn(List<String> values) {
            addCriterion("MB_NO in", values, "mbNo");
            return (Criteria) this;
        }

        public Criteria andMbNoNotIn(List<String> values) {
            addCriterion("MB_NO not in", values, "mbNo");
            return (Criteria) this;
        }

        public Criteria andMbNoBetween(String value1, String value2) {
            addCriterion("MB_NO between", value1, value2, "mbNo");
            return (Criteria) this;
        }

        public Criteria andMbNoNotBetween(String value1, String value2) {
            addCriterion("MB_NO not between", value1, value2, "mbNo");
            return (Criteria) this;
        }

        public Criteria andUpMainIsNull() {
            addCriterion("UP_MAIN is null");
            return (Criteria) this;
        }

        public Criteria andUpMainIsNotNull() {
            addCriterion("UP_MAIN is not null");
            return (Criteria) this;
        }

        public Criteria andUpMainEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN =", value, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainNotEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN <>", value, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainGreaterThan(BigDecimal value) {
            addCriterion("UP_MAIN >", value, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN >=", value, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainLessThan(BigDecimal value) {
            addCriterion("UP_MAIN <", value, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN <=", value, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN in", values, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainNotIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN not in", values, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN between", value1, value2, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN not between", value1, value2, "upMain");
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

        public Criteria andQtyOiIsNull() {
            addCriterion("QTY_OI is null");
            return (Criteria) this;
        }

        public Criteria andQtyOiIsNotNull() {
            addCriterion("QTY_OI is not null");
            return (Criteria) this;
        }

        public Criteria andQtyOiEqualTo(BigDecimal value) {
            addCriterion("QTY_OI =", value, "qtyOi");
            return (Criteria) this;
        }

        public Criteria andQtyOiNotEqualTo(BigDecimal value) {
            addCriterion("QTY_OI <>", value, "qtyOi");
            return (Criteria) this;
        }

        public Criteria andQtyOiGreaterThan(BigDecimal value) {
            addCriterion("QTY_OI >", value, "qtyOi");
            return (Criteria) this;
        }

        public Criteria andQtyOiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_OI >=", value, "qtyOi");
            return (Criteria) this;
        }

        public Criteria andQtyOiLessThan(BigDecimal value) {
            addCriterion("QTY_OI <", value, "qtyOi");
            return (Criteria) this;
        }

        public Criteria andQtyOiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_OI <=", value, "qtyOi");
            return (Criteria) this;
        }

        public Criteria andQtyOiIn(List<BigDecimal> values) {
            addCriterion("QTY_OI in", values, "qtyOi");
            return (Criteria) this;
        }

        public Criteria andQtyOiNotIn(List<BigDecimal> values) {
            addCriterion("QTY_OI not in", values, "qtyOi");
            return (Criteria) this;
        }

        public Criteria andQtyOiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_OI between", value1, value2, "qtyOi");
            return (Criteria) this;
        }

        public Criteria andQtyOiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_OI not between", value1, value2, "qtyOi");
            return (Criteria) this;
        }

        public Criteria andMeFlagIsNull() {
            addCriterion("ME_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andMeFlagIsNotNull() {
            addCriterion("ME_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMeFlagEqualTo(String value) {
            addCriterion("ME_FLAG =", value, "meFlag");
            return (Criteria) this;
        }

        public Criteria andMeFlagNotEqualTo(String value) {
            addCriterion("ME_FLAG <>", value, "meFlag");
            return (Criteria) this;
        }

        public Criteria andMeFlagGreaterThan(String value) {
            addCriterion("ME_FLAG >", value, "meFlag");
            return (Criteria) this;
        }

        public Criteria andMeFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ME_FLAG >=", value, "meFlag");
            return (Criteria) this;
        }

        public Criteria andMeFlagLessThan(String value) {
            addCriterion("ME_FLAG <", value, "meFlag");
            return (Criteria) this;
        }

        public Criteria andMeFlagLessThanOrEqualTo(String value) {
            addCriterion("ME_FLAG <=", value, "meFlag");
            return (Criteria) this;
        }

        public Criteria andMeFlagLike(String value) {
            addCriterion("ME_FLAG like", value, "meFlag");
            return (Criteria) this;
        }

        public Criteria andMeFlagNotLike(String value) {
            addCriterion("ME_FLAG not like", value, "meFlag");
            return (Criteria) this;
        }

        public Criteria andMeFlagIn(List<String> values) {
            addCriterion("ME_FLAG in", values, "meFlag");
            return (Criteria) this;
        }

        public Criteria andMeFlagNotIn(List<String> values) {
            addCriterion("ME_FLAG not in", values, "meFlag");
            return (Criteria) this;
        }

        public Criteria andMeFlagBetween(String value1, String value2) {
            addCriterion("ME_FLAG between", value1, value2, "meFlag");
            return (Criteria) this;
        }

        public Criteria andMeFlagNotBetween(String value1, String value2) {
            addCriterion("ME_FLAG not between", value1, value2, "meFlag");
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

        public Criteria andSpcNoIsNull() {
            addCriterion("SPC_NO is null");
            return (Criteria) this;
        }

        public Criteria andSpcNoIsNotNull() {
            addCriterion("SPC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSpcNoEqualTo(String value) {
            addCriterion("SPC_NO =", value, "spcNo");
            return (Criteria) this;
        }

        public Criteria andSpcNoNotEqualTo(String value) {
            addCriterion("SPC_NO <>", value, "spcNo");
            return (Criteria) this;
        }

        public Criteria andSpcNoGreaterThan(String value) {
            addCriterion("SPC_NO >", value, "spcNo");
            return (Criteria) this;
        }

        public Criteria andSpcNoGreaterThanOrEqualTo(String value) {
            addCriterion("SPC_NO >=", value, "spcNo");
            return (Criteria) this;
        }

        public Criteria andSpcNoLessThan(String value) {
            addCriterion("SPC_NO <", value, "spcNo");
            return (Criteria) this;
        }

        public Criteria andSpcNoLessThanOrEqualTo(String value) {
            addCriterion("SPC_NO <=", value, "spcNo");
            return (Criteria) this;
        }

        public Criteria andSpcNoLike(String value) {
            addCriterion("SPC_NO like", value, "spcNo");
            return (Criteria) this;
        }

        public Criteria andSpcNoNotLike(String value) {
            addCriterion("SPC_NO not like", value, "spcNo");
            return (Criteria) this;
        }

        public Criteria andSpcNoIn(List<String> values) {
            addCriterion("SPC_NO in", values, "spcNo");
            return (Criteria) this;
        }

        public Criteria andSpcNoNotIn(List<String> values) {
            addCriterion("SPC_NO not in", values, "spcNo");
            return (Criteria) this;
        }

        public Criteria andSpcNoBetween(String value1, String value2) {
            addCriterion("SPC_NO between", value1, value2, "spcNo");
            return (Criteria) this;
        }

        public Criteria andSpcNoNotBetween(String value1, String value2) {
            addCriterion("SPC_NO not between", value1, value2, "spcNo");
            return (Criteria) this;
        }

        public Criteria andInvB2cIsNull() {
            addCriterion("INV_B2C is null");
            return (Criteria) this;
        }

        public Criteria andInvB2cIsNotNull() {
            addCriterion("INV_B2C is not null");
            return (Criteria) this;
        }

        public Criteria andInvB2cEqualTo(String value) {
            addCriterion("INV_B2C =", value, "invB2c");
            return (Criteria) this;
        }

        public Criteria andInvB2cNotEqualTo(String value) {
            addCriterion("INV_B2C <>", value, "invB2c");
            return (Criteria) this;
        }

        public Criteria andInvB2cGreaterThan(String value) {
            addCriterion("INV_B2C >", value, "invB2c");
            return (Criteria) this;
        }

        public Criteria andInvB2cGreaterThanOrEqualTo(String value) {
            addCriterion("INV_B2C >=", value, "invB2c");
            return (Criteria) this;
        }

        public Criteria andInvB2cLessThan(String value) {
            addCriterion("INV_B2C <", value, "invB2c");
            return (Criteria) this;
        }

        public Criteria andInvB2cLessThanOrEqualTo(String value) {
            addCriterion("INV_B2C <=", value, "invB2c");
            return (Criteria) this;
        }

        public Criteria andInvB2cLike(String value) {
            addCriterion("INV_B2C like", value, "invB2c");
            return (Criteria) this;
        }

        public Criteria andInvB2cNotLike(String value) {
            addCriterion("INV_B2C not like", value, "invB2c");
            return (Criteria) this;
        }

        public Criteria andInvB2cIn(List<String> values) {
            addCriterion("INV_B2C in", values, "invB2c");
            return (Criteria) this;
        }

        public Criteria andInvB2cNotIn(List<String> values) {
            addCriterion("INV_B2C not in", values, "invB2c");
            return (Criteria) this;
        }

        public Criteria andInvB2cBetween(String value1, String value2) {
            addCriterion("INV_B2C between", value1, value2, "invB2c");
            return (Criteria) this;
        }

        public Criteria andInvB2cNotBetween(String value1, String value2) {
            addCriterion("INV_B2C not between", value1, value2, "invB2c");
            return (Criteria) this;
        }

        public Criteria andSbacChkIsNull() {
            addCriterion("SBAC_CHK is null");
            return (Criteria) this;
        }

        public Criteria andSbacChkIsNotNull() {
            addCriterion("SBAC_CHK is not null");
            return (Criteria) this;
        }

        public Criteria andSbacChkEqualTo(String value) {
            addCriterion("SBAC_CHK =", value, "sbacChk");
            return (Criteria) this;
        }

        public Criteria andSbacChkNotEqualTo(String value) {
            addCriterion("SBAC_CHK <>", value, "sbacChk");
            return (Criteria) this;
        }

        public Criteria andSbacChkGreaterThan(String value) {
            addCriterion("SBAC_CHK >", value, "sbacChk");
            return (Criteria) this;
        }

        public Criteria andSbacChkGreaterThanOrEqualTo(String value) {
            addCriterion("SBAC_CHK >=", value, "sbacChk");
            return (Criteria) this;
        }

        public Criteria andSbacChkLessThan(String value) {
            addCriterion("SBAC_CHK <", value, "sbacChk");
            return (Criteria) this;
        }

        public Criteria andSbacChkLessThanOrEqualTo(String value) {
            addCriterion("SBAC_CHK <=", value, "sbacChk");
            return (Criteria) this;
        }

        public Criteria andSbacChkLike(String value) {
            addCriterion("SBAC_CHK like", value, "sbacChk");
            return (Criteria) this;
        }

        public Criteria andSbacChkNotLike(String value) {
            addCriterion("SBAC_CHK not like", value, "sbacChk");
            return (Criteria) this;
        }

        public Criteria andSbacChkIn(List<String> values) {
            addCriterion("SBAC_CHK in", values, "sbacChk");
            return (Criteria) this;
        }

        public Criteria andSbacChkNotIn(List<String> values) {
            addCriterion("SBAC_CHK not in", values, "sbacChk");
            return (Criteria) this;
        }

        public Criteria andSbacChkBetween(String value1, String value2) {
            addCriterion("SBAC_CHK between", value1, value2, "sbacChk");
            return (Criteria) this;
        }

        public Criteria andSbacChkNotBetween(String value1, String value2) {
            addCriterion("SBAC_CHK not between", value1, value2, "sbacChk");
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

        public Criteria andSalNoIsNull() {
            addCriterion("SAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andSalNoIsNotNull() {
            addCriterion("SAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSalNoEqualTo(String value) {
            addCriterion("SAL_NO =", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotEqualTo(String value) {
            addCriterion("SAL_NO <>", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoGreaterThan(String value) {
            addCriterion("SAL_NO >", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoGreaterThanOrEqualTo(String value) {
            addCriterion("SAL_NO >=", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLessThan(String value) {
            addCriterion("SAL_NO <", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLessThanOrEqualTo(String value) {
            addCriterion("SAL_NO <=", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLike(String value) {
            addCriterion("SAL_NO like", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotLike(String value) {
            addCriterion("SAL_NO not like", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoIn(List<String> values) {
            addCriterion("SAL_NO in", values, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotIn(List<String> values) {
            addCriterion("SAL_NO not in", values, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoBetween(String value1, String value2) {
            addCriterion("SAL_NO between", value1, value2, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotBetween(String value1, String value2) {
            addCriterion("SAL_NO not between", value1, value2, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNo1IsNull() {
            addCriterion("SAL_NO1 is null");
            return (Criteria) this;
        }

        public Criteria andSalNo1IsNotNull() {
            addCriterion("SAL_NO1 is not null");
            return (Criteria) this;
        }

        public Criteria andSalNo1EqualTo(String value) {
            addCriterion("SAL_NO1 =", value, "salNo1");
            return (Criteria) this;
        }

        public Criteria andSalNo1NotEqualTo(String value) {
            addCriterion("SAL_NO1 <>", value, "salNo1");
            return (Criteria) this;
        }

        public Criteria andSalNo1GreaterThan(String value) {
            addCriterion("SAL_NO1 >", value, "salNo1");
            return (Criteria) this;
        }

        public Criteria andSalNo1GreaterThanOrEqualTo(String value) {
            addCriterion("SAL_NO1 >=", value, "salNo1");
            return (Criteria) this;
        }

        public Criteria andSalNo1LessThan(String value) {
            addCriterion("SAL_NO1 <", value, "salNo1");
            return (Criteria) this;
        }

        public Criteria andSalNo1LessThanOrEqualTo(String value) {
            addCriterion("SAL_NO1 <=", value, "salNo1");
            return (Criteria) this;
        }

        public Criteria andSalNo1Like(String value) {
            addCriterion("SAL_NO1 like", value, "salNo1");
            return (Criteria) this;
        }

        public Criteria andSalNo1NotLike(String value) {
            addCriterion("SAL_NO1 not like", value, "salNo1");
            return (Criteria) this;
        }

        public Criteria andSalNo1In(List<String> values) {
            addCriterion("SAL_NO1 in", values, "salNo1");
            return (Criteria) this;
        }

        public Criteria andSalNo1NotIn(List<String> values) {
            addCriterion("SAL_NO1 not in", values, "salNo1");
            return (Criteria) this;
        }

        public Criteria andSalNo1Between(String value1, String value2) {
            addCriterion("SAL_NO1 between", value1, value2, "salNo1");
            return (Criteria) this;
        }

        public Criteria andSalNo1NotBetween(String value1, String value2) {
            addCriterion("SAL_NO1 not between", value1, value2, "salNo1");
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

        public Criteria andAmtnRsvIsNull() {
            addCriterion("AMTN_RSV is null");
            return (Criteria) this;
        }

        public Criteria andAmtnRsvIsNotNull() {
            addCriterion("AMTN_RSV is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnRsvEqualTo(BigDecimal value) {
            addCriterion("AMTN_RSV =", value, "amtnRsv");
            return (Criteria) this;
        }

        public Criteria andAmtnRsvNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_RSV <>", value, "amtnRsv");
            return (Criteria) this;
        }

        public Criteria andAmtnRsvGreaterThan(BigDecimal value) {
            addCriterion("AMTN_RSV >", value, "amtnRsv");
            return (Criteria) this;
        }

        public Criteria andAmtnRsvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_RSV >=", value, "amtnRsv");
            return (Criteria) this;
        }

        public Criteria andAmtnRsvLessThan(BigDecimal value) {
            addCriterion("AMTN_RSV <", value, "amtnRsv");
            return (Criteria) this;
        }

        public Criteria andAmtnRsvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_RSV <=", value, "amtnRsv");
            return (Criteria) this;
        }

        public Criteria andAmtnRsvIn(List<BigDecimal> values) {
            addCriterion("AMTN_RSV in", values, "amtnRsv");
            return (Criteria) this;
        }

        public Criteria andAmtnRsvNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_RSV not in", values, "amtnRsv");
            return (Criteria) this;
        }

        public Criteria andAmtnRsvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_RSV between", value1, value2, "amtnRsv");
            return (Criteria) this;
        }

        public Criteria andAmtnRsvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_RSV not between", value1, value2, "amtnRsv");
            return (Criteria) this;
        }

        public Criteria andAmtZgFpIsNull() {
            addCriterion("AMT_ZG_FP is null");
            return (Criteria) this;
        }

        public Criteria andAmtZgFpIsNotNull() {
            addCriterion("AMT_ZG_FP is not null");
            return (Criteria) this;
        }

        public Criteria andAmtZgFpEqualTo(BigDecimal value) {
            addCriterion("AMT_ZG_FP =", value, "amtZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtZgFpNotEqualTo(BigDecimal value) {
            addCriterion("AMT_ZG_FP <>", value, "amtZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtZgFpGreaterThan(BigDecimal value) {
            addCriterion("AMT_ZG_FP >", value, "amtZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtZgFpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_ZG_FP >=", value, "amtZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtZgFpLessThan(BigDecimal value) {
            addCriterion("AMT_ZG_FP <", value, "amtZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtZgFpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_ZG_FP <=", value, "amtZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtZgFpIn(List<BigDecimal> values) {
            addCriterion("AMT_ZG_FP in", values, "amtZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtZgFpNotIn(List<BigDecimal> values) {
            addCriterion("AMT_ZG_FP not in", values, "amtZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtZgFpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_ZG_FP between", value1, value2, "amtZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtZgFpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_ZG_FP not between", value1, value2, "amtZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZgFpIsNull() {
            addCriterion("AMTN_NET_ZG_FP is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZgFpIsNotNull() {
            addCriterion("AMTN_NET_ZG_FP is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZgFpEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_ZG_FP =", value, "amtnNetZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZgFpNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_ZG_FP <>", value, "amtnNetZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZgFpGreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET_ZG_FP >", value, "amtnNetZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZgFpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_ZG_FP >=", value, "amtnNetZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZgFpLessThan(BigDecimal value) {
            addCriterion("AMTN_NET_ZG_FP <", value, "amtnNetZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZgFpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_ZG_FP <=", value, "amtnNetZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZgFpIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_ZG_FP in", values, "amtnNetZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZgFpNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_ZG_FP not in", values, "amtnNetZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZgFpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_ZG_FP between", value1, value2, "amtnNetZgFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZgFpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_ZG_FP not between", value1, value2, "amtnNetZgFp");
            return (Criteria) this;
        }

        public Criteria andTaxZgFpIsNull() {
            addCriterion("TAX_ZG_FP is null");
            return (Criteria) this;
        }

        public Criteria andTaxZgFpIsNotNull() {
            addCriterion("TAX_ZG_FP is not null");
            return (Criteria) this;
        }

        public Criteria andTaxZgFpEqualTo(BigDecimal value) {
            addCriterion("TAX_ZG_FP =", value, "taxZgFp");
            return (Criteria) this;
        }

        public Criteria andTaxZgFpNotEqualTo(BigDecimal value) {
            addCriterion("TAX_ZG_FP <>", value, "taxZgFp");
            return (Criteria) this;
        }

        public Criteria andTaxZgFpGreaterThan(BigDecimal value) {
            addCriterion("TAX_ZG_FP >", value, "taxZgFp");
            return (Criteria) this;
        }

        public Criteria andTaxZgFpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_ZG_FP >=", value, "taxZgFp");
            return (Criteria) this;
        }

        public Criteria andTaxZgFpLessThan(BigDecimal value) {
            addCriterion("TAX_ZG_FP <", value, "taxZgFp");
            return (Criteria) this;
        }

        public Criteria andTaxZgFpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_ZG_FP <=", value, "taxZgFp");
            return (Criteria) this;
        }

        public Criteria andTaxZgFpIn(List<BigDecimal> values) {
            addCriterion("TAX_ZG_FP in", values, "taxZgFp");
            return (Criteria) this;
        }

        public Criteria andTaxZgFpNotIn(List<BigDecimal> values) {
            addCriterion("TAX_ZG_FP not in", values, "taxZgFp");
            return (Criteria) this;
        }

        public Criteria andTaxZgFpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_ZG_FP between", value1, value2, "taxZgFp");
            return (Criteria) this;
        }

        public Criteria andTaxZgFpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_ZG_FP not between", value1, value2, "taxZgFp");
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

        public Criteria andAmtnIfrsIsNull() {
            addCriterion("AMTN_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsIsNotNull() {
            addCriterion("AMTN_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsEqualTo(BigDecimal value) {
            addCriterion("AMTN_IFRS =", value, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_IFRS <>", value, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsGreaterThan(BigDecimal value) {
            addCriterion("AMTN_IFRS >", value, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_IFRS >=", value, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsLessThan(BigDecimal value) {
            addCriterion("AMTN_IFRS <", value, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_IFRS <=", value, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsIn(List<BigDecimal> values) {
            addCriterion("AMTN_IFRS in", values, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_IFRS not in", values, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_IFRS between", value1, value2, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_IFRS not between", value1, value2, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsIsNull() {
            addCriterion("AMTN_NET_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsIsNotNull() {
            addCriterion("AMTN_NET_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS =", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS <>", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsGreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS >", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS >=", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsLessThan(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS <", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS <=", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_IFRS in", values, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_IFRS not in", values, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_IFRS between", value1, value2, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_IFRS not between", value1, value2, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsIsNull() {
            addCriterion("CSTN_SAL_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsIsNotNull() {
            addCriterion("CSTN_SAL_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsEqualTo(BigDecimal value) {
            addCriterion("CSTN_SAL_IFRS =", value, "cstnSalIfrs");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsNotEqualTo(BigDecimal value) {
            addCriterion("CSTN_SAL_IFRS <>", value, "cstnSalIfrs");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsGreaterThan(BigDecimal value) {
            addCriterion("CSTN_SAL_IFRS >", value, "cstnSalIfrs");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CSTN_SAL_IFRS >=", value, "cstnSalIfrs");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsLessThan(BigDecimal value) {
            addCriterion("CSTN_SAL_IFRS <", value, "cstnSalIfrs");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CSTN_SAL_IFRS <=", value, "cstnSalIfrs");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsIn(List<BigDecimal> values) {
            addCriterion("CSTN_SAL_IFRS in", values, "cstnSalIfrs");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsNotIn(List<BigDecimal> values) {
            addCriterion("CSTN_SAL_IFRS not in", values, "cstnSalIfrs");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSTN_SAL_IFRS between", value1, value2, "cstnSalIfrs");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSTN_SAL_IFRS not between", value1, value2, "cstnSalIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIfrsIsNull() {
            addCriterion("AMTN_EP_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIfrsIsNotNull() {
            addCriterion("AMTN_EP_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIfrsEqualTo(BigDecimal value) {
            addCriterion("AMTN_EP_IFRS =", value, "amtnEpIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIfrsNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_EP_IFRS <>", value, "amtnEpIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIfrsGreaterThan(BigDecimal value) {
            addCriterion("AMTN_EP_IFRS >", value, "amtnEpIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_EP_IFRS >=", value, "amtnEpIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIfrsLessThan(BigDecimal value) {
            addCriterion("AMTN_EP_IFRS <", value, "amtnEpIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_EP_IFRS <=", value, "amtnEpIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIfrsIn(List<BigDecimal> values) {
            addCriterion("AMTN_EP_IFRS in", values, "amtnEpIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIfrsNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_EP_IFRS not in", values, "amtnEpIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_EP_IFRS between", value1, value2, "amtnEpIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnEpIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_EP_IFRS not between", value1, value2, "amtnEpIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsIsNull() {
            addCriterion("CST_STD_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsIsNotNull() {
            addCriterion("CST_STD_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsEqualTo(BigDecimal value) {
            addCriterion("CST_STD_IFRS =", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsNotEqualTo(BigDecimal value) {
            addCriterion("CST_STD_IFRS <>", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsGreaterThan(BigDecimal value) {
            addCriterion("CST_STD_IFRS >", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_STD_IFRS >=", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsLessThan(BigDecimal value) {
            addCriterion("CST_STD_IFRS <", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_STD_IFRS <=", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsIn(List<BigDecimal> values) {
            addCriterion("CST_STD_IFRS in", values, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsNotIn(List<BigDecimal> values) {
            addCriterion("CST_STD_IFRS not in", values, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_STD_IFRS between", value1, value2, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_STD_IFRS not between", value1, value2, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsIsNull() {
            addCriterion("TAX_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsIsNotNull() {
            addCriterion("TAX_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsEqualTo(BigDecimal value) {
            addCriterion("TAX_IFRS =", value, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsNotEqualTo(BigDecimal value) {
            addCriterion("TAX_IFRS <>", value, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsGreaterThan(BigDecimal value) {
            addCriterion("TAX_IFRS >", value, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_IFRS >=", value, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsLessThan(BigDecimal value) {
            addCriterion("TAX_IFRS <", value, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_IFRS <=", value, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsIn(List<BigDecimal> values) {
            addCriterion("TAX_IFRS in", values, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsNotIn(List<BigDecimal> values) {
            addCriterion("TAX_IFRS not in", values, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_IFRS between", value1, value2, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_IFRS not between", value1, value2, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsIsNull() {
            addCriterion("UP_MAIN_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsIsNotNull() {
            addCriterion("UP_MAIN_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS =", value, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsNotEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS <>", value, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsGreaterThan(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS >", value, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS >=", value, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsLessThan(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS <", value, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS <=", value, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_IFRS in", values, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsNotIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_IFRS not in", values, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_IFRS between", value1, value2, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_IFRS not between", value1, value2, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsIsNull() {
            addCriterion("UP_STD_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsIsNotNull() {
            addCriterion("UP_STD_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsEqualTo(BigDecimal value) {
            addCriterion("UP_STD_IFRS =", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsNotEqualTo(BigDecimal value) {
            addCriterion("UP_STD_IFRS <>", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsGreaterThan(BigDecimal value) {
            addCriterion("UP_STD_IFRS >", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_STD_IFRS >=", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsLessThan(BigDecimal value) {
            addCriterion("UP_STD_IFRS <", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_STD_IFRS <=", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsIn(List<BigDecimal> values) {
            addCriterion("UP_STD_IFRS in", values, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsNotIn(List<BigDecimal> values) {
            addCriterion("UP_STD_IFRS not in", values, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_STD_IFRS between", value1, value2, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_STD_IFRS not between", value1, value2, "upStdIfrs");
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

        public Criteria andQty1FpIsNull() {
            addCriterion("QTY1_FP is null");
            return (Criteria) this;
        }

        public Criteria andQty1FpIsNotNull() {
            addCriterion("QTY1_FP is not null");
            return (Criteria) this;
        }

        public Criteria andQty1FpEqualTo(BigDecimal value) {
            addCriterion("QTY1_FP =", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_FP <>", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpGreaterThan(BigDecimal value) {
            addCriterion("QTY1_FP >", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_FP >=", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpLessThan(BigDecimal value) {
            addCriterion("QTY1_FP <", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_FP <=", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpIn(List<BigDecimal> values) {
            addCriterion("QTY1_FP in", values, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_FP not in", values, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_FP between", value1, value2, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_FP not between", value1, value2, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQtyPosSoIsNull() {
            addCriterion("QTY_POS_SO is null");
            return (Criteria) this;
        }

        public Criteria andQtyPosSoIsNotNull() {
            addCriterion("QTY_POS_SO is not null");
            return (Criteria) this;
        }

        public Criteria andQtyPosSoEqualTo(BigDecimal value) {
            addCriterion("QTY_POS_SO =", value, "qtyPosSo");
            return (Criteria) this;
        }

        public Criteria andQtyPosSoNotEqualTo(BigDecimal value) {
            addCriterion("QTY_POS_SO <>", value, "qtyPosSo");
            return (Criteria) this;
        }

        public Criteria andQtyPosSoGreaterThan(BigDecimal value) {
            addCriterion("QTY_POS_SO >", value, "qtyPosSo");
            return (Criteria) this;
        }

        public Criteria andQtyPosSoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_POS_SO >=", value, "qtyPosSo");
            return (Criteria) this;
        }

        public Criteria andQtyPosSoLessThan(BigDecimal value) {
            addCriterion("QTY_POS_SO <", value, "qtyPosSo");
            return (Criteria) this;
        }

        public Criteria andQtyPosSoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_POS_SO <=", value, "qtyPosSo");
            return (Criteria) this;
        }

        public Criteria andQtyPosSoIn(List<BigDecimal> values) {
            addCriterion("QTY_POS_SO in", values, "qtyPosSo");
            return (Criteria) this;
        }

        public Criteria andQtyPosSoNotIn(List<BigDecimal> values) {
            addCriterion("QTY_POS_SO not in", values, "qtyPosSo");
            return (Criteria) this;
        }

        public Criteria andQtyPosSoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_POS_SO between", value1, value2, "qtyPosSo");
            return (Criteria) this;
        }

        public Criteria andQtyPosSoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_POS_SO not between", value1, value2, "qtyPosSo");
            return (Criteria) this;
        }

        public Criteria andItmPosupIsNull() {
            addCriterion("ITM_POSUP is null");
            return (Criteria) this;
        }

        public Criteria andItmPosupIsNotNull() {
            addCriterion("ITM_POSUP is not null");
            return (Criteria) this;
        }

        public Criteria andItmPosupEqualTo(Integer value) {
            addCriterion("ITM_POSUP =", value, "itmPosup");
            return (Criteria) this;
        }

        public Criteria andItmPosupNotEqualTo(Integer value) {
            addCriterion("ITM_POSUP <>", value, "itmPosup");
            return (Criteria) this;
        }

        public Criteria andItmPosupGreaterThan(Integer value) {
            addCriterion("ITM_POSUP >", value, "itmPosup");
            return (Criteria) this;
        }

        public Criteria andItmPosupGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITM_POSUP >=", value, "itmPosup");
            return (Criteria) this;
        }

        public Criteria andItmPosupLessThan(Integer value) {
            addCriterion("ITM_POSUP <", value, "itmPosup");
            return (Criteria) this;
        }

        public Criteria andItmPosupLessThanOrEqualTo(Integer value) {
            addCriterion("ITM_POSUP <=", value, "itmPosup");
            return (Criteria) this;
        }

        public Criteria andItmPosupIn(List<Integer> values) {
            addCriterion("ITM_POSUP in", values, "itmPosup");
            return (Criteria) this;
        }

        public Criteria andItmPosupNotIn(List<Integer> values) {
            addCriterion("ITM_POSUP not in", values, "itmPosup");
            return (Criteria) this;
        }

        public Criteria andItmPosupBetween(Integer value1, Integer value2) {
            addCriterion("ITM_POSUP between", value1, value2, "itmPosup");
            return (Criteria) this;
        }

        public Criteria andItmPosupNotBetween(Integer value1, Integer value2) {
            addCriterion("ITM_POSUP not between", value1, value2, "itmPosup");
            return (Criteria) this;
        }

        public Criteria andOmIdIsNull() {
            addCriterion("OM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOmIdIsNotNull() {
            addCriterion("OM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOmIdEqualTo(String value) {
            addCriterion("OM_ID =", value, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdNotEqualTo(String value) {
            addCriterion("OM_ID <>", value, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdGreaterThan(String value) {
            addCriterion("OM_ID >", value, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdGreaterThanOrEqualTo(String value) {
            addCriterion("OM_ID >=", value, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdLessThan(String value) {
            addCriterion("OM_ID <", value, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdLessThanOrEqualTo(String value) {
            addCriterion("OM_ID <=", value, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdLike(String value) {
            addCriterion("OM_ID like", value, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdNotLike(String value) {
            addCriterion("OM_ID not like", value, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdIn(List<String> values) {
            addCriterion("OM_ID in", values, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdNotIn(List<String> values) {
            addCriterion("OM_ID not in", values, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdBetween(String value1, String value2) {
            addCriterion("OM_ID between", value1, value2, "omId");
            return (Criteria) this;
        }

        public Criteria andOmIdNotBetween(String value1, String value2) {
            addCriterion("OM_ID not between", value1, value2, "omId");
            return (Criteria) this;
        }

        public Criteria andOmNoIsNull() {
            addCriterion("OM_NO is null");
            return (Criteria) this;
        }

        public Criteria andOmNoIsNotNull() {
            addCriterion("OM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOmNoEqualTo(String value) {
            addCriterion("OM_NO =", value, "omNo");
            return (Criteria) this;
        }

        public Criteria andOmNoNotEqualTo(String value) {
            addCriterion("OM_NO <>", value, "omNo");
            return (Criteria) this;
        }

        public Criteria andOmNoGreaterThan(String value) {
            addCriterion("OM_NO >", value, "omNo");
            return (Criteria) this;
        }

        public Criteria andOmNoGreaterThanOrEqualTo(String value) {
            addCriterion("OM_NO >=", value, "omNo");
            return (Criteria) this;
        }

        public Criteria andOmNoLessThan(String value) {
            addCriterion("OM_NO <", value, "omNo");
            return (Criteria) this;
        }

        public Criteria andOmNoLessThanOrEqualTo(String value) {
            addCriterion("OM_NO <=", value, "omNo");
            return (Criteria) this;
        }

        public Criteria andOmNoLike(String value) {
            addCriterion("OM_NO like", value, "omNo");
            return (Criteria) this;
        }

        public Criteria andOmNoNotLike(String value) {
            addCriterion("OM_NO not like", value, "omNo");
            return (Criteria) this;
        }

        public Criteria andOmNoIn(List<String> values) {
            addCriterion("OM_NO in", values, "omNo");
            return (Criteria) this;
        }

        public Criteria andOmNoNotIn(List<String> values) {
            addCriterion("OM_NO not in", values, "omNo");
            return (Criteria) this;
        }

        public Criteria andOmNoBetween(String value1, String value2) {
            addCriterion("OM_NO between", value1, value2, "omNo");
            return (Criteria) this;
        }

        public Criteria andOmNoNotBetween(String value1, String value2) {
            addCriterion("OM_NO not between", value1, value2, "omNo");
            return (Criteria) this;
        }

        public Criteria andOmItmIsNull() {
            addCriterion("OM_ITM is null");
            return (Criteria) this;
        }

        public Criteria andOmItmIsNotNull() {
            addCriterion("OM_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andOmItmEqualTo(Integer value) {
            addCriterion("OM_ITM =", value, "omItm");
            return (Criteria) this;
        }

        public Criteria andOmItmNotEqualTo(Integer value) {
            addCriterion("OM_ITM <>", value, "omItm");
            return (Criteria) this;
        }

        public Criteria andOmItmGreaterThan(Integer value) {
            addCriterion("OM_ITM >", value, "omItm");
            return (Criteria) this;
        }

        public Criteria andOmItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("OM_ITM >=", value, "omItm");
            return (Criteria) this;
        }

        public Criteria andOmItmLessThan(Integer value) {
            addCriterion("OM_ITM <", value, "omItm");
            return (Criteria) this;
        }

        public Criteria andOmItmLessThanOrEqualTo(Integer value) {
            addCriterion("OM_ITM <=", value, "omItm");
            return (Criteria) this;
        }

        public Criteria andOmItmIn(List<Integer> values) {
            addCriterion("OM_ITM in", values, "omItm");
            return (Criteria) this;
        }

        public Criteria andOmItmNotIn(List<Integer> values) {
            addCriterion("OM_ITM not in", values, "omItm");
            return (Criteria) this;
        }

        public Criteria andOmItmBetween(Integer value1, Integer value2) {
            addCriterion("OM_ITM between", value1, value2, "omItm");
            return (Criteria) this;
        }

        public Criteria andOmItmNotBetween(Integer value1, Integer value2) {
            addCriterion("OM_ITM not between", value1, value2, "omItm");
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

        public Criteria andNojfIdIsNull() {
            addCriterion("NOJF_ID is null");
            return (Criteria) this;
        }

        public Criteria andNojfIdIsNotNull() {
            addCriterion("NOJF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNojfIdEqualTo(String value) {
            addCriterion("NOJF_ID =", value, "nojfId");
            return (Criteria) this;
        }

        public Criteria andNojfIdNotEqualTo(String value) {
            addCriterion("NOJF_ID <>", value, "nojfId");
            return (Criteria) this;
        }

        public Criteria andNojfIdGreaterThan(String value) {
            addCriterion("NOJF_ID >", value, "nojfId");
            return (Criteria) this;
        }

        public Criteria andNojfIdGreaterThanOrEqualTo(String value) {
            addCriterion("NOJF_ID >=", value, "nojfId");
            return (Criteria) this;
        }

        public Criteria andNojfIdLessThan(String value) {
            addCriterion("NOJF_ID <", value, "nojfId");
            return (Criteria) this;
        }

        public Criteria andNojfIdLessThanOrEqualTo(String value) {
            addCriterion("NOJF_ID <=", value, "nojfId");
            return (Criteria) this;
        }

        public Criteria andNojfIdLike(String value) {
            addCriterion("NOJF_ID like", value, "nojfId");
            return (Criteria) this;
        }

        public Criteria andNojfIdNotLike(String value) {
            addCriterion("NOJF_ID not like", value, "nojfId");
            return (Criteria) this;
        }

        public Criteria andNojfIdIn(List<String> values) {
            addCriterion("NOJF_ID in", values, "nojfId");
            return (Criteria) this;
        }

        public Criteria andNojfIdNotIn(List<String> values) {
            addCriterion("NOJF_ID not in", values, "nojfId");
            return (Criteria) this;
        }

        public Criteria andNojfIdBetween(String value1, String value2) {
            addCriterion("NOJF_ID between", value1, value2, "nojfId");
            return (Criteria) this;
        }

        public Criteria andNojfIdNotBetween(String value1, String value2) {
            addCriterion("NOJF_ID not between", value1, value2, "nojfId");
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

        public Criteria andYhIdIsNull() {
            addCriterion("YH_ID is null");
            return (Criteria) this;
        }

        public Criteria andYhIdIsNotNull() {
            addCriterion("YH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andYhIdEqualTo(String value) {
            addCriterion("YH_ID =", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotEqualTo(String value) {
            addCriterion("YH_ID <>", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdGreaterThan(String value) {
            addCriterion("YH_ID >", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdGreaterThanOrEqualTo(String value) {
            addCriterion("YH_ID >=", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdLessThan(String value) {
            addCriterion("YH_ID <", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdLessThanOrEqualTo(String value) {
            addCriterion("YH_ID <=", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdLike(String value) {
            addCriterion("YH_ID like", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotLike(String value) {
            addCriterion("YH_ID not like", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdIn(List<String> values) {
            addCriterion("YH_ID in", values, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotIn(List<String> values) {
            addCriterion("YH_ID not in", values, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdBetween(String value1, String value2) {
            addCriterion("YH_ID between", value1, value2, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotBetween(String value1, String value2) {
            addCriterion("YH_ID not between", value1, value2, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhNoIsNull() {
            addCriterion("YH_NO is null");
            return (Criteria) this;
        }

        public Criteria andYhNoIsNotNull() {
            addCriterion("YH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andYhNoEqualTo(String value) {
            addCriterion("YH_NO =", value, "yhNo");
            return (Criteria) this;
        }

        public Criteria andYhNoNotEqualTo(String value) {
            addCriterion("YH_NO <>", value, "yhNo");
            return (Criteria) this;
        }

        public Criteria andYhNoGreaterThan(String value) {
            addCriterion("YH_NO >", value, "yhNo");
            return (Criteria) this;
        }

        public Criteria andYhNoGreaterThanOrEqualTo(String value) {
            addCriterion("YH_NO >=", value, "yhNo");
            return (Criteria) this;
        }

        public Criteria andYhNoLessThan(String value) {
            addCriterion("YH_NO <", value, "yhNo");
            return (Criteria) this;
        }

        public Criteria andYhNoLessThanOrEqualTo(String value) {
            addCriterion("YH_NO <=", value, "yhNo");
            return (Criteria) this;
        }

        public Criteria andYhNoLike(String value) {
            addCriterion("YH_NO like", value, "yhNo");
            return (Criteria) this;
        }

        public Criteria andYhNoNotLike(String value) {
            addCriterion("YH_NO not like", value, "yhNo");
            return (Criteria) this;
        }

        public Criteria andYhNoIn(List<String> values) {
            addCriterion("YH_NO in", values, "yhNo");
            return (Criteria) this;
        }

        public Criteria andYhNoNotIn(List<String> values) {
            addCriterion("YH_NO not in", values, "yhNo");
            return (Criteria) this;
        }

        public Criteria andYhNoBetween(String value1, String value2) {
            addCriterion("YH_NO between", value1, value2, "yhNo");
            return (Criteria) this;
        }

        public Criteria andYhNoNotBetween(String value1, String value2) {
            addCriterion("YH_NO not between", value1, value2, "yhNo");
            return (Criteria) this;
        }

        public Criteria andItmYhIsNull() {
            addCriterion("ITM_YH is null");
            return (Criteria) this;
        }

        public Criteria andItmYhIsNotNull() {
            addCriterion("ITM_YH is not null");
            return (Criteria) this;
        }

        public Criteria andItmYhEqualTo(Integer value) {
            addCriterion("ITM_YH =", value, "itmYh");
            return (Criteria) this;
        }

        public Criteria andItmYhNotEqualTo(Integer value) {
            addCriterion("ITM_YH <>", value, "itmYh");
            return (Criteria) this;
        }

        public Criteria andItmYhGreaterThan(Integer value) {
            addCriterion("ITM_YH >", value, "itmYh");
            return (Criteria) this;
        }

        public Criteria andItmYhGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITM_YH >=", value, "itmYh");
            return (Criteria) this;
        }

        public Criteria andItmYhLessThan(Integer value) {
            addCriterion("ITM_YH <", value, "itmYh");
            return (Criteria) this;
        }

        public Criteria andItmYhLessThanOrEqualTo(Integer value) {
            addCriterion("ITM_YH <=", value, "itmYh");
            return (Criteria) this;
        }

        public Criteria andItmYhIn(List<Integer> values) {
            addCriterion("ITM_YH in", values, "itmYh");
            return (Criteria) this;
        }

        public Criteria andItmYhNotIn(List<Integer> values) {
            addCriterion("ITM_YH not in", values, "itmYh");
            return (Criteria) this;
        }

        public Criteria andItmYhBetween(Integer value1, Integer value2) {
            addCriterion("ITM_YH between", value1, value2, "itmYh");
            return (Criteria) this;
        }

        public Criteria andItmYhNotBetween(Integer value1, Integer value2) {
            addCriterion("ITM_YH not between", value1, value2, "itmYh");
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

        public Criteria andTtYmBIsNull() {
            addCriterion("TT_YM_B is null");
            return (Criteria) this;
        }

        public Criteria andTtYmBIsNotNull() {
            addCriterion("TT_YM_B is not null");
            return (Criteria) this;
        }

        public Criteria andTtYmBEqualTo(Date value) {
            addCriterion("TT_YM_B =", value, "ttYmB");
            return (Criteria) this;
        }

        public Criteria andTtYmBNotEqualTo(Date value) {
            addCriterion("TT_YM_B <>", value, "ttYmB");
            return (Criteria) this;
        }

        public Criteria andTtYmBGreaterThan(Date value) {
            addCriterion("TT_YM_B >", value, "ttYmB");
            return (Criteria) this;
        }

        public Criteria andTtYmBGreaterThanOrEqualTo(Date value) {
            addCriterion("TT_YM_B >=", value, "ttYmB");
            return (Criteria) this;
        }

        public Criteria andTtYmBLessThan(Date value) {
            addCriterion("TT_YM_B <", value, "ttYmB");
            return (Criteria) this;
        }

        public Criteria andTtYmBLessThanOrEqualTo(Date value) {
            addCriterion("TT_YM_B <=", value, "ttYmB");
            return (Criteria) this;
        }

        public Criteria andTtYmBIn(List<Date> values) {
            addCriterion("TT_YM_B in", values, "ttYmB");
            return (Criteria) this;
        }

        public Criteria andTtYmBNotIn(List<Date> values) {
            addCriterion("TT_YM_B not in", values, "ttYmB");
            return (Criteria) this;
        }

        public Criteria andTtYmBBetween(Date value1, Date value2) {
            addCriterion("TT_YM_B between", value1, value2, "ttYmB");
            return (Criteria) this;
        }

        public Criteria andTtYmBNotBetween(Date value1, Date value2) {
            addCriterion("TT_YM_B not between", value1, value2, "ttYmB");
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

        public Criteria andUpMainBxIsNull() {
            addCriterion("UP_MAIN_BX is null");
            return (Criteria) this;
        }

        public Criteria andUpMainBxIsNotNull() {
            addCriterion("UP_MAIN_BX is not null");
            return (Criteria) this;
        }

        public Criteria andUpMainBxEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_BX =", value, "upMainBx");
            return (Criteria) this;
        }

        public Criteria andUpMainBxNotEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_BX <>", value, "upMainBx");
            return (Criteria) this;
        }

        public Criteria andUpMainBxGreaterThan(BigDecimal value) {
            addCriterion("UP_MAIN_BX >", value, "upMainBx");
            return (Criteria) this;
        }

        public Criteria andUpMainBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_BX >=", value, "upMainBx");
            return (Criteria) this;
        }

        public Criteria andUpMainBxLessThan(BigDecimal value) {
            addCriterion("UP_MAIN_BX <", value, "upMainBx");
            return (Criteria) this;
        }

        public Criteria andUpMainBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_BX <=", value, "upMainBx");
            return (Criteria) this;
        }

        public Criteria andUpMainBxIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_BX in", values, "upMainBx");
            return (Criteria) this;
        }

        public Criteria andUpMainBxNotIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_BX not in", values, "upMainBx");
            return (Criteria) this;
        }

        public Criteria andUpMainBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_BX between", value1, value2, "upMainBx");
            return (Criteria) this;
        }

        public Criteria andUpMainBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_BX not between", value1, value2, "upMainBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalBxIsNull() {
            addCriterion("CSTN_SAL_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstnSalBxIsNotNull() {
            addCriterion("CSTN_SAL_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstnSalBxEqualTo(BigDecimal value) {
            addCriterion("CSTN_SAL_BX =", value, "cstnSalBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalBxNotEqualTo(BigDecimal value) {
            addCriterion("CSTN_SAL_BX <>", value, "cstnSalBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalBxGreaterThan(BigDecimal value) {
            addCriterion("CSTN_SAL_BX >", value, "cstnSalBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CSTN_SAL_BX >=", value, "cstnSalBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalBxLessThan(BigDecimal value) {
            addCriterion("CSTN_SAL_BX <", value, "cstnSalBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CSTN_SAL_BX <=", value, "cstnSalBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalBxIn(List<BigDecimal> values) {
            addCriterion("CSTN_SAL_BX in", values, "cstnSalBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalBxNotIn(List<BigDecimal> values) {
            addCriterion("CSTN_SAL_BX not in", values, "cstnSalBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSTN_SAL_BX between", value1, value2, "cstnSalBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSTN_SAL_BX not between", value1, value2, "cstnSalBx");
            return (Criteria) this;
        }

        public Criteria andCstMlBxIsNull() {
            addCriterion("CST_ML_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstMlBxIsNotNull() {
            addCriterion("CST_ML_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstMlBxEqualTo(BigDecimal value) {
            addCriterion("CST_ML_BX =", value, "cstMlBx");
            return (Criteria) this;
        }

        public Criteria andCstMlBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_ML_BX <>", value, "cstMlBx");
            return (Criteria) this;
        }

        public Criteria andCstMlBxGreaterThan(BigDecimal value) {
            addCriterion("CST_ML_BX >", value, "cstMlBx");
            return (Criteria) this;
        }

        public Criteria andCstMlBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_ML_BX >=", value, "cstMlBx");
            return (Criteria) this;
        }

        public Criteria andCstMlBxLessThan(BigDecimal value) {
            addCriterion("CST_ML_BX <", value, "cstMlBx");
            return (Criteria) this;
        }

        public Criteria andCstMlBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_ML_BX <=", value, "cstMlBx");
            return (Criteria) this;
        }

        public Criteria andCstMlBxIn(List<BigDecimal> values) {
            addCriterion("CST_ML_BX in", values, "cstMlBx");
            return (Criteria) this;
        }

        public Criteria andCstMlBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_ML_BX not in", values, "cstMlBx");
            return (Criteria) this;
        }

        public Criteria andCstMlBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_ML_BX between", value1, value2, "cstMlBx");
            return (Criteria) this;
        }

        public Criteria andCstMlBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_ML_BX not between", value1, value2, "cstMlBx");
            return (Criteria) this;
        }

        public Criteria andCstManBxIsNull() {
            addCriterion("CST_MAN_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstManBxIsNotNull() {
            addCriterion("CST_MAN_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstManBxEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_BX =", value, "cstManBx");
            return (Criteria) this;
        }

        public Criteria andCstManBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_BX <>", value, "cstManBx");
            return (Criteria) this;
        }

        public Criteria andCstManBxGreaterThan(BigDecimal value) {
            addCriterion("CST_MAN_BX >", value, "cstManBx");
            return (Criteria) this;
        }

        public Criteria andCstManBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_BX >=", value, "cstManBx");
            return (Criteria) this;
        }

        public Criteria andCstManBxLessThan(BigDecimal value) {
            addCriterion("CST_MAN_BX <", value, "cstManBx");
            return (Criteria) this;
        }

        public Criteria andCstManBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_BX <=", value, "cstManBx");
            return (Criteria) this;
        }

        public Criteria andCstManBxIn(List<BigDecimal> values) {
            addCriterion("CST_MAN_BX in", values, "cstManBx");
            return (Criteria) this;
        }

        public Criteria andCstManBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_MAN_BX not in", values, "cstManBx");
            return (Criteria) this;
        }

        public Criteria andCstManBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAN_BX between", value1, value2, "cstManBx");
            return (Criteria) this;
        }

        public Criteria andCstManBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAN_BX not between", value1, value2, "cstManBx");
            return (Criteria) this;
        }

        public Criteria andCstMakBxIsNull() {
            addCriterion("CST_MAK_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstMakBxIsNotNull() {
            addCriterion("CST_MAK_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstMakBxEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_BX =", value, "cstMakBx");
            return (Criteria) this;
        }

        public Criteria andCstMakBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_BX <>", value, "cstMakBx");
            return (Criteria) this;
        }

        public Criteria andCstMakBxGreaterThan(BigDecimal value) {
            addCriterion("CST_MAK_BX >", value, "cstMakBx");
            return (Criteria) this;
        }

        public Criteria andCstMakBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_BX >=", value, "cstMakBx");
            return (Criteria) this;
        }

        public Criteria andCstMakBxLessThan(BigDecimal value) {
            addCriterion("CST_MAK_BX <", value, "cstMakBx");
            return (Criteria) this;
        }

        public Criteria andCstMakBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_BX <=", value, "cstMakBx");
            return (Criteria) this;
        }

        public Criteria andCstMakBxIn(List<BigDecimal> values) {
            addCriterion("CST_MAK_BX in", values, "cstMakBx");
            return (Criteria) this;
        }

        public Criteria andCstMakBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_MAK_BX not in", values, "cstMakBx");
            return (Criteria) this;
        }

        public Criteria andCstMakBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAK_BX between", value1, value2, "cstMakBx");
            return (Criteria) this;
        }

        public Criteria andCstMakBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAK_BX not between", value1, value2, "cstMakBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdBxIsNull() {
            addCriterion("CST_PRD_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstPrdBxIsNotNull() {
            addCriterion("CST_PRD_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstPrdBxEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_BX =", value, "cstPrdBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_BX <>", value, "cstPrdBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdBxGreaterThan(BigDecimal value) {
            addCriterion("CST_PRD_BX >", value, "cstPrdBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_BX >=", value, "cstPrdBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdBxLessThan(BigDecimal value) {
            addCriterion("CST_PRD_BX <", value, "cstPrdBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_BX <=", value, "cstPrdBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdBxIn(List<BigDecimal> values) {
            addCriterion("CST_PRD_BX in", values, "cstPrdBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_PRD_BX not in", values, "cstPrdBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_PRD_BX between", value1, value2, "cstPrdBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_PRD_BX not between", value1, value2, "cstPrdBx");
            return (Criteria) this;
        }

        public Criteria andCstOutBxIsNull() {
            addCriterion("CST_OUT_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstOutBxIsNotNull() {
            addCriterion("CST_OUT_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstOutBxEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_BX =", value, "cstOutBx");
            return (Criteria) this;
        }

        public Criteria andCstOutBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_BX <>", value, "cstOutBx");
            return (Criteria) this;
        }

        public Criteria andCstOutBxGreaterThan(BigDecimal value) {
            addCriterion("CST_OUT_BX >", value, "cstOutBx");
            return (Criteria) this;
        }

        public Criteria andCstOutBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_BX >=", value, "cstOutBx");
            return (Criteria) this;
        }

        public Criteria andCstOutBxLessThan(BigDecimal value) {
            addCriterion("CST_OUT_BX <", value, "cstOutBx");
            return (Criteria) this;
        }

        public Criteria andCstOutBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_BX <=", value, "cstOutBx");
            return (Criteria) this;
        }

        public Criteria andCstOutBxIn(List<BigDecimal> values) {
            addCriterion("CST_OUT_BX in", values, "cstOutBx");
            return (Criteria) this;
        }

        public Criteria andCstOutBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_OUT_BX not in", values, "cstOutBx");
            return (Criteria) this;
        }

        public Criteria andCstOutBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_OUT_BX between", value1, value2, "cstOutBx");
            return (Criteria) this;
        }

        public Criteria andCstOutBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_OUT_BX not between", value1, value2, "cstOutBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsBxIsNull() {
            addCriterion("UP_MAIN_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsBxIsNotNull() {
            addCriterion("UP_MAIN_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsBxEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS_BX =", value, "upMainIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS_BX <>", value, "upMainIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS_BX >", value, "upMainIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS_BX >=", value, "upMainIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsBxLessThan(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS_BX <", value, "upMainIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS_BX <=", value, "upMainIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsBxIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_IFRS_BX in", values, "upMainIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_IFRS_BX not in", values, "upMainIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_IFRS_BX between", value1, value2, "upMainIfrsBx");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_IFRS_BX not between", value1, value2, "upMainIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsBxIsNull() {
            addCriterion("CSTN_SAL_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsBxIsNotNull() {
            addCriterion("CSTN_SAL_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsBxEqualTo(BigDecimal value) {
            addCriterion("CSTN_SAL_IFRS_BX =", value, "cstnSalIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("CSTN_SAL_IFRS_BX <>", value, "cstnSalIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("CSTN_SAL_IFRS_BX >", value, "cstnSalIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CSTN_SAL_IFRS_BX >=", value, "cstnSalIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsBxLessThan(BigDecimal value) {
            addCriterion("CSTN_SAL_IFRS_BX <", value, "cstnSalIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CSTN_SAL_IFRS_BX <=", value, "cstnSalIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsBxIn(List<BigDecimal> values) {
            addCriterion("CSTN_SAL_IFRS_BX in", values, "cstnSalIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("CSTN_SAL_IFRS_BX not in", values, "cstnSalIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSTN_SAL_IFRS_BX between", value1, value2, "cstnSalIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstnSalIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSTN_SAL_IFRS_BX not between", value1, value2, "cstnSalIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIfrsBxIsNull() {
            addCriterion("CST_ML_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstMlIfrsBxIsNotNull() {
            addCriterion("CST_ML_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstMlIfrsBxEqualTo(BigDecimal value) {
            addCriterion("CST_ML_IFRS_BX =", value, "cstMlIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_ML_IFRS_BX <>", value, "cstMlIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("CST_ML_IFRS_BX >", value, "cstMlIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_ML_IFRS_BX >=", value, "cstMlIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIfrsBxLessThan(BigDecimal value) {
            addCriterion("CST_ML_IFRS_BX <", value, "cstMlIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_ML_IFRS_BX <=", value, "cstMlIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIfrsBxIn(List<BigDecimal> values) {
            addCriterion("CST_ML_IFRS_BX in", values, "cstMlIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_ML_IFRS_BX not in", values, "cstMlIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_ML_IFRS_BX between", value1, value2, "cstMlIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMlIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_ML_IFRS_BX not between", value1, value2, "cstMlIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIfrsBxIsNull() {
            addCriterion("CST_MAN_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstManIfrsBxIsNotNull() {
            addCriterion("CST_MAN_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstManIfrsBxEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_IFRS_BX =", value, "cstManIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_IFRS_BX <>", value, "cstManIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("CST_MAN_IFRS_BX >", value, "cstManIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_IFRS_BX >=", value, "cstManIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIfrsBxLessThan(BigDecimal value) {
            addCriterion("CST_MAN_IFRS_BX <", value, "cstManIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAN_IFRS_BX <=", value, "cstManIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIfrsBxIn(List<BigDecimal> values) {
            addCriterion("CST_MAN_IFRS_BX in", values, "cstManIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_MAN_IFRS_BX not in", values, "cstManIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAN_IFRS_BX between", value1, value2, "cstManIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstManIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAN_IFRS_BX not between", value1, value2, "cstManIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIfrsBxIsNull() {
            addCriterion("CST_MAK_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstMakIfrsBxIsNotNull() {
            addCriterion("CST_MAK_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstMakIfrsBxEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_IFRS_BX =", value, "cstMakIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_IFRS_BX <>", value, "cstMakIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("CST_MAK_IFRS_BX >", value, "cstMakIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_IFRS_BX >=", value, "cstMakIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIfrsBxLessThan(BigDecimal value) {
            addCriterion("CST_MAK_IFRS_BX <", value, "cstMakIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_MAK_IFRS_BX <=", value, "cstMakIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIfrsBxIn(List<BigDecimal> values) {
            addCriterion("CST_MAK_IFRS_BX in", values, "cstMakIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_MAK_IFRS_BX not in", values, "cstMakIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAK_IFRS_BX between", value1, value2, "cstMakIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstMakIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_MAK_IFRS_BX not between", value1, value2, "cstMakIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIfrsBxIsNull() {
            addCriterion("CST_PRD_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstPrdIfrsBxIsNotNull() {
            addCriterion("CST_PRD_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstPrdIfrsBxEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_IFRS_BX =", value, "cstPrdIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_IFRS_BX <>", value, "cstPrdIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("CST_PRD_IFRS_BX >", value, "cstPrdIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_IFRS_BX >=", value, "cstPrdIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIfrsBxLessThan(BigDecimal value) {
            addCriterion("CST_PRD_IFRS_BX <", value, "cstPrdIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_PRD_IFRS_BX <=", value, "cstPrdIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIfrsBxIn(List<BigDecimal> values) {
            addCriterion("CST_PRD_IFRS_BX in", values, "cstPrdIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_PRD_IFRS_BX not in", values, "cstPrdIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_PRD_IFRS_BX between", value1, value2, "cstPrdIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstPrdIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_PRD_IFRS_BX not between", value1, value2, "cstPrdIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIfrsBxIsNull() {
            addCriterion("CST_OUT_IFRS_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstOutIfrsBxIsNotNull() {
            addCriterion("CST_OUT_IFRS_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstOutIfrsBxEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_IFRS_BX =", value, "cstOutIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIfrsBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_IFRS_BX <>", value, "cstOutIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIfrsBxGreaterThan(BigDecimal value) {
            addCriterion("CST_OUT_IFRS_BX >", value, "cstOutIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIfrsBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_IFRS_BX >=", value, "cstOutIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIfrsBxLessThan(BigDecimal value) {
            addCriterion("CST_OUT_IFRS_BX <", value, "cstOutIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIfrsBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_OUT_IFRS_BX <=", value, "cstOutIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIfrsBxIn(List<BigDecimal> values) {
            addCriterion("CST_OUT_IFRS_BX in", values, "cstOutIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIfrsBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_OUT_IFRS_BX not in", values, "cstOutIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIfrsBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_OUT_IFRS_BX between", value1, value2, "cstOutIfrsBx");
            return (Criteria) this;
        }

        public Criteria andCstOutIfrsBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_OUT_IFRS_BX not between", value1, value2, "cstOutIfrsBx");
            return (Criteria) this;
        }

        public Criteria andSpcNo1IsNull() {
            addCriterion("SPC_NO1 is null");
            return (Criteria) this;
        }

        public Criteria andSpcNo1IsNotNull() {
            addCriterion("SPC_NO1 is not null");
            return (Criteria) this;
        }

        public Criteria andSpcNo1EqualTo(String value) {
            addCriterion("SPC_NO1 =", value, "spcNo1");
            return (Criteria) this;
        }

        public Criteria andSpcNo1NotEqualTo(String value) {
            addCriterion("SPC_NO1 <>", value, "spcNo1");
            return (Criteria) this;
        }

        public Criteria andSpcNo1GreaterThan(String value) {
            addCriterion("SPC_NO1 >", value, "spcNo1");
            return (Criteria) this;
        }

        public Criteria andSpcNo1GreaterThanOrEqualTo(String value) {
            addCriterion("SPC_NO1 >=", value, "spcNo1");
            return (Criteria) this;
        }

        public Criteria andSpcNo1LessThan(String value) {
            addCriterion("SPC_NO1 <", value, "spcNo1");
            return (Criteria) this;
        }

        public Criteria andSpcNo1LessThanOrEqualTo(String value) {
            addCriterion("SPC_NO1 <=", value, "spcNo1");
            return (Criteria) this;
        }

        public Criteria andSpcNo1Like(String value) {
            addCriterion("SPC_NO1 like", value, "spcNo1");
            return (Criteria) this;
        }

        public Criteria andSpcNo1NotLike(String value) {
            addCriterion("SPC_NO1 not like", value, "spcNo1");
            return (Criteria) this;
        }

        public Criteria andSpcNo1In(List<String> values) {
            addCriterion("SPC_NO1 in", values, "spcNo1");
            return (Criteria) this;
        }

        public Criteria andSpcNo1NotIn(List<String> values) {
            addCriterion("SPC_NO1 not in", values, "spcNo1");
            return (Criteria) this;
        }

        public Criteria andSpcNo1Between(String value1, String value2) {
            addCriterion("SPC_NO1 between", value1, value2, "spcNo1");
            return (Criteria) this;
        }

        public Criteria andSpcNo1NotBetween(String value1, String value2) {
            addCriterion("SPC_NO1 not between", value1, value2, "spcNo1");
            return (Criteria) this;
        }

        public Criteria andWcDdIsNull() {
            addCriterion("WC_DD is null");
            return (Criteria) this;
        }

        public Criteria andWcDdIsNotNull() {
            addCriterion("WC_DD is not null");
            return (Criteria) this;
        }

        public Criteria andWcDdEqualTo(Date value) {
            addCriterion("WC_DD =", value, "wcDd");
            return (Criteria) this;
        }

        public Criteria andWcDdNotEqualTo(Date value) {
            addCriterion("WC_DD <>", value, "wcDd");
            return (Criteria) this;
        }

        public Criteria andWcDdGreaterThan(Date value) {
            addCriterion("WC_DD >", value, "wcDd");
            return (Criteria) this;
        }

        public Criteria andWcDdGreaterThanOrEqualTo(Date value) {
            addCriterion("WC_DD >=", value, "wcDd");
            return (Criteria) this;
        }

        public Criteria andWcDdLessThan(Date value) {
            addCriterion("WC_DD <", value, "wcDd");
            return (Criteria) this;
        }

        public Criteria andWcDdLessThanOrEqualTo(Date value) {
            addCriterion("WC_DD <=", value, "wcDd");
            return (Criteria) this;
        }

        public Criteria andWcDdIn(List<Date> values) {
            addCriterion("WC_DD in", values, "wcDd");
            return (Criteria) this;
        }

        public Criteria andWcDdNotIn(List<Date> values) {
            addCriterion("WC_DD not in", values, "wcDd");
            return (Criteria) this;
        }

        public Criteria andWcDdBetween(Date value1, Date value2) {
            addCriterion("WC_DD between", value1, value2, "wcDd");
            return (Criteria) this;
        }

        public Criteria andWcDdNotBetween(Date value1, Date value2) {
            addCriterion("WC_DD not between", value1, value2, "wcDd");
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

        public Criteria andNbBoxNoIsNull() {
            addCriterion("NB_BOX_NO is null");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoIsNotNull() {
            addCriterion("NB_BOX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoEqualTo(String value) {
            addCriterion("NB_BOX_NO =", value, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoNotEqualTo(String value) {
            addCriterion("NB_BOX_NO <>", value, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoGreaterThan(String value) {
            addCriterion("NB_BOX_NO >", value, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoGreaterThanOrEqualTo(String value) {
            addCriterion("NB_BOX_NO >=", value, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoLessThan(String value) {
            addCriterion("NB_BOX_NO <", value, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoLessThanOrEqualTo(String value) {
            addCriterion("NB_BOX_NO <=", value, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoLike(String value) {
            addCriterion("NB_BOX_NO like", value, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoNotLike(String value) {
            addCriterion("NB_BOX_NO not like", value, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoIn(List<String> values) {
            addCriterion("NB_BOX_NO in", values, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoNotIn(List<String> values) {
            addCriterion("NB_BOX_NO not in", values, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoBetween(String value1, String value2) {
            addCriterion("NB_BOX_NO between", value1, value2, "nbBoxNo");
            return (Criteria) this;
        }

        public Criteria andNbBoxNoNotBetween(String value1, String value2) {
            addCriterion("NB_BOX_NO not between", value1, value2, "nbBoxNo");
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

        public Criteria andUpOldIsNull() {
            addCriterion("UP_OLD is null");
            return (Criteria) this;
        }

        public Criteria andUpOldIsNotNull() {
            addCriterion("UP_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andUpOldEqualTo(BigDecimal value) {
            addCriterion("UP_OLD =", value, "upOld");
            return (Criteria) this;
        }

        public Criteria andUpOldNotEqualTo(BigDecimal value) {
            addCriterion("UP_OLD <>", value, "upOld");
            return (Criteria) this;
        }

        public Criteria andUpOldGreaterThan(BigDecimal value) {
            addCriterion("UP_OLD >", value, "upOld");
            return (Criteria) this;
        }

        public Criteria andUpOldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_OLD >=", value, "upOld");
            return (Criteria) this;
        }

        public Criteria andUpOldLessThan(BigDecimal value) {
            addCriterion("UP_OLD <", value, "upOld");
            return (Criteria) this;
        }

        public Criteria andUpOldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_OLD <=", value, "upOld");
            return (Criteria) this;
        }

        public Criteria andUpOldIn(List<BigDecimal> values) {
            addCriterion("UP_OLD in", values, "upOld");
            return (Criteria) this;
        }

        public Criteria andUpOldNotIn(List<BigDecimal> values) {
            addCriterion("UP_OLD not in", values, "upOld");
            return (Criteria) this;
        }

        public Criteria andUpOldBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_OLD between", value1, value2, "upOld");
            return (Criteria) this;
        }

        public Criteria andUpOldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_OLD not between", value1, value2, "upOld");
            return (Criteria) this;
        }

        public Criteria andAmtnOldIsNull() {
            addCriterion("AMTN_OLD is null");
            return (Criteria) this;
        }

        public Criteria andAmtnOldIsNotNull() {
            addCriterion("AMTN_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnOldEqualTo(BigDecimal value) {
            addCriterion("AMTN_OLD =", value, "amtnOld");
            return (Criteria) this;
        }

        public Criteria andAmtnOldNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_OLD <>", value, "amtnOld");
            return (Criteria) this;
        }

        public Criteria andAmtnOldGreaterThan(BigDecimal value) {
            addCriterion("AMTN_OLD >", value, "amtnOld");
            return (Criteria) this;
        }

        public Criteria andAmtnOldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_OLD >=", value, "amtnOld");
            return (Criteria) this;
        }

        public Criteria andAmtnOldLessThan(BigDecimal value) {
            addCriterion("AMTN_OLD <", value, "amtnOld");
            return (Criteria) this;
        }

        public Criteria andAmtnOldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_OLD <=", value, "amtnOld");
            return (Criteria) this;
        }

        public Criteria andAmtnOldIn(List<BigDecimal> values) {
            addCriterion("AMTN_OLD in", values, "amtnOld");
            return (Criteria) this;
        }

        public Criteria andAmtnOldNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_OLD not in", values, "amtnOld");
            return (Criteria) this;
        }

        public Criteria andAmtnOldBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_OLD between", value1, value2, "amtnOld");
            return (Criteria) this;
        }

        public Criteria andAmtnOldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_OLD not between", value1, value2, "amtnOld");
            return (Criteria) this;
        }

        public Criteria andUpSpSwIsNull() {
            addCriterion("UP_SP_SW is null");
            return (Criteria) this;
        }

        public Criteria andUpSpSwIsNotNull() {
            addCriterion("UP_SP_SW is not null");
            return (Criteria) this;
        }

        public Criteria andUpSpSwEqualTo(String value) {
            addCriterion("UP_SP_SW =", value, "upSpSw");
            return (Criteria) this;
        }

        public Criteria andUpSpSwNotEqualTo(String value) {
            addCriterion("UP_SP_SW <>", value, "upSpSw");
            return (Criteria) this;
        }

        public Criteria andUpSpSwGreaterThan(String value) {
            addCriterion("UP_SP_SW >", value, "upSpSw");
            return (Criteria) this;
        }

        public Criteria andUpSpSwGreaterThanOrEqualTo(String value) {
            addCriterion("UP_SP_SW >=", value, "upSpSw");
            return (Criteria) this;
        }

        public Criteria andUpSpSwLessThan(String value) {
            addCriterion("UP_SP_SW <", value, "upSpSw");
            return (Criteria) this;
        }

        public Criteria andUpSpSwLessThanOrEqualTo(String value) {
            addCriterion("UP_SP_SW <=", value, "upSpSw");
            return (Criteria) this;
        }

        public Criteria andUpSpSwLike(String value) {
            addCriterion("UP_SP_SW like", value, "upSpSw");
            return (Criteria) this;
        }

        public Criteria andUpSpSwNotLike(String value) {
            addCriterion("UP_SP_SW not like", value, "upSpSw");
            return (Criteria) this;
        }

        public Criteria andUpSpSwIn(List<String> values) {
            addCriterion("UP_SP_SW in", values, "upSpSw");
            return (Criteria) this;
        }

        public Criteria andUpSpSwNotIn(List<String> values) {
            addCriterion("UP_SP_SW not in", values, "upSpSw");
            return (Criteria) this;
        }

        public Criteria andUpSpSwBetween(String value1, String value2) {
            addCriterion("UP_SP_SW between", value1, value2, "upSpSw");
            return (Criteria) this;
        }

        public Criteria andUpSpSwNotBetween(String value1, String value2) {
            addCriterion("UP_SP_SW not between", value1, value2, "upSpSw");
            return (Criteria) this;
        }

        public Criteria andMbdisIdIsNull() {
            addCriterion("MBDIS_ID is null");
            return (Criteria) this;
        }

        public Criteria andMbdisIdIsNotNull() {
            addCriterion("MBDIS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMbdisIdEqualTo(String value) {
            addCriterion("MBDIS_ID =", value, "mbdisId");
            return (Criteria) this;
        }

        public Criteria andMbdisIdNotEqualTo(String value) {
            addCriterion("MBDIS_ID <>", value, "mbdisId");
            return (Criteria) this;
        }

        public Criteria andMbdisIdGreaterThan(String value) {
            addCriterion("MBDIS_ID >", value, "mbdisId");
            return (Criteria) this;
        }

        public Criteria andMbdisIdGreaterThanOrEqualTo(String value) {
            addCriterion("MBDIS_ID >=", value, "mbdisId");
            return (Criteria) this;
        }

        public Criteria andMbdisIdLessThan(String value) {
            addCriterion("MBDIS_ID <", value, "mbdisId");
            return (Criteria) this;
        }

        public Criteria andMbdisIdLessThanOrEqualTo(String value) {
            addCriterion("MBDIS_ID <=", value, "mbdisId");
            return (Criteria) this;
        }

        public Criteria andMbdisIdLike(String value) {
            addCriterion("MBDIS_ID like", value, "mbdisId");
            return (Criteria) this;
        }

        public Criteria andMbdisIdNotLike(String value) {
            addCriterion("MBDIS_ID not like", value, "mbdisId");
            return (Criteria) this;
        }

        public Criteria andMbdisIdIn(List<String> values) {
            addCriterion("MBDIS_ID in", values, "mbdisId");
            return (Criteria) this;
        }

        public Criteria andMbdisIdNotIn(List<String> values) {
            addCriterion("MBDIS_ID not in", values, "mbdisId");
            return (Criteria) this;
        }

        public Criteria andMbdisIdBetween(String value1, String value2) {
            addCriterion("MBDIS_ID between", value1, value2, "mbdisId");
            return (Criteria) this;
        }

        public Criteria andMbdisIdNotBetween(String value1, String value2) {
            addCriterion("MBDIS_ID not between", value1, value2, "mbdisId");
            return (Criteria) this;
        }

        public Criteria andDzUsrIsNull() {
            addCriterion("DZ_USR is null");
            return (Criteria) this;
        }

        public Criteria andDzUsrIsNotNull() {
            addCriterion("DZ_USR is not null");
            return (Criteria) this;
        }

        public Criteria andDzUsrEqualTo(String value) {
            addCriterion("DZ_USR =", value, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrNotEqualTo(String value) {
            addCriterion("DZ_USR <>", value, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrGreaterThan(String value) {
            addCriterion("DZ_USR >", value, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrGreaterThanOrEqualTo(String value) {
            addCriterion("DZ_USR >=", value, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrLessThan(String value) {
            addCriterion("DZ_USR <", value, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrLessThanOrEqualTo(String value) {
            addCriterion("DZ_USR <=", value, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrLike(String value) {
            addCriterion("DZ_USR like", value, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrNotLike(String value) {
            addCriterion("DZ_USR not like", value, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrIn(List<String> values) {
            addCriterion("DZ_USR in", values, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrNotIn(List<String> values) {
            addCriterion("DZ_USR not in", values, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrBetween(String value1, String value2) {
            addCriterion("DZ_USR between", value1, value2, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrNotBetween(String value1, String value2) {
            addCriterion("DZ_USR not between", value1, value2, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzDateIsNull() {
            addCriterion("DZ_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDzDateIsNotNull() {
            addCriterion("DZ_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDzDateEqualTo(Date value) {
            addCriterion("DZ_DATE =", value, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateNotEqualTo(Date value) {
            addCriterion("DZ_DATE <>", value, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateGreaterThan(Date value) {
            addCriterion("DZ_DATE >", value, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DZ_DATE >=", value, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateLessThan(Date value) {
            addCriterion("DZ_DATE <", value, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateLessThanOrEqualTo(Date value) {
            addCriterion("DZ_DATE <=", value, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateIn(List<Date> values) {
            addCriterion("DZ_DATE in", values, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateNotIn(List<Date> values) {
            addCriterion("DZ_DATE not in", values, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateBetween(Date value1, Date value2) {
            addCriterion("DZ_DATE between", value1, value2, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateNotBetween(Date value1, Date value2) {
            addCriterion("DZ_DATE not between", value1, value2, "dzDate");
            return (Criteria) this;
        }

        public Criteria andPrdmoNoIsNull() {
            addCriterion("PRDMO_NO is null");
            return (Criteria) this;
        }

        public Criteria andPrdmoNoIsNotNull() {
            addCriterion("PRDMO_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPrdmoNoEqualTo(String value) {
            addCriterion("PRDMO_NO =", value, "prdmoNo");
            return (Criteria) this;
        }

        public Criteria andPrdmoNoNotEqualTo(String value) {
            addCriterion("PRDMO_NO <>", value, "prdmoNo");
            return (Criteria) this;
        }

        public Criteria andPrdmoNoGreaterThan(String value) {
            addCriterion("PRDMO_NO >", value, "prdmoNo");
            return (Criteria) this;
        }

        public Criteria andPrdmoNoGreaterThanOrEqualTo(String value) {
            addCriterion("PRDMO_NO >=", value, "prdmoNo");
            return (Criteria) this;
        }

        public Criteria andPrdmoNoLessThan(String value) {
            addCriterion("PRDMO_NO <", value, "prdmoNo");
            return (Criteria) this;
        }

        public Criteria andPrdmoNoLessThanOrEqualTo(String value) {
            addCriterion("PRDMO_NO <=", value, "prdmoNo");
            return (Criteria) this;
        }

        public Criteria andPrdmoNoLike(String value) {
            addCriterion("PRDMO_NO like", value, "prdmoNo");
            return (Criteria) this;
        }

        public Criteria andPrdmoNoNotLike(String value) {
            addCriterion("PRDMO_NO not like", value, "prdmoNo");
            return (Criteria) this;
        }

        public Criteria andPrdmoNoIn(List<String> values) {
            addCriterion("PRDMO_NO in", values, "prdmoNo");
            return (Criteria) this;
        }

        public Criteria andPrdmoNoNotIn(List<String> values) {
            addCriterion("PRDMO_NO not in", values, "prdmoNo");
            return (Criteria) this;
        }

        public Criteria andPrdmoNoBetween(String value1, String value2) {
            addCriterion("PRDMO_NO between", value1, value2, "prdmoNo");
            return (Criteria) this;
        }

        public Criteria andPrdmoNoNotBetween(String value1, String value2) {
            addCriterion("PRDMO_NO not between", value1, value2, "prdmoNo");
            return (Criteria) this;
        }

        public Criteria andClsIdIsNull() {
            addCriterion("CLS_ID is null");
            return (Criteria) this;
        }

        public Criteria andClsIdIsNotNull() {
            addCriterion("CLS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClsIdEqualTo(String value) {
            addCriterion("CLS_ID =", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotEqualTo(String value) {
            addCriterion("CLS_ID <>", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdGreaterThan(String value) {
            addCriterion("CLS_ID >", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLS_ID >=", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdLessThan(String value) {
            addCriterion("CLS_ID <", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdLessThanOrEqualTo(String value) {
            addCriterion("CLS_ID <=", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdLike(String value) {
            addCriterion("CLS_ID like", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotLike(String value) {
            addCriterion("CLS_ID not like", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdIn(List<String> values) {
            addCriterion("CLS_ID in", values, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotIn(List<String> values) {
            addCriterion("CLS_ID not in", values, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdBetween(String value1, String value2) {
            addCriterion("CLS_ID between", value1, value2, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotBetween(String value1, String value2) {
            addCriterion("CLS_ID not between", value1, value2, "clsId");
            return (Criteria) this;
        }

        public Criteria andScDdIsNull() {
            addCriterion("SC_DD is null");
            return (Criteria) this;
        }

        public Criteria andScDdIsNotNull() {
            addCriterion("SC_DD is not null");
            return (Criteria) this;
        }

        public Criteria andScDdEqualTo(Date value) {
            addCriterion("SC_DD =", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdNotEqualTo(Date value) {
            addCriterion("SC_DD <>", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdGreaterThan(Date value) {
            addCriterion("SC_DD >", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdGreaterThanOrEqualTo(Date value) {
            addCriterion("SC_DD >=", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdLessThan(Date value) {
            addCriterion("SC_DD <", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdLessThanOrEqualTo(Date value) {
            addCriterion("SC_DD <=", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdIn(List<Date> values) {
            addCriterion("SC_DD in", values, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdNotIn(List<Date> values) {
            addCriterion("SC_DD not in", values, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdBetween(Date value1, Date value2) {
            addCriterion("SC_DD between", value1, value2, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdNotBetween(Date value1, Date value2) {
            addCriterion("SC_DD not between", value1, value2, "scDd");
            return (Criteria) this;
        }

        public Criteria andQtyCfmIsNull() {
            addCriterion("QTY_CFM is null");
            return (Criteria) this;
        }

        public Criteria andQtyCfmIsNotNull() {
            addCriterion("QTY_CFM is not null");
            return (Criteria) this;
        }

        public Criteria andQtyCfmEqualTo(BigDecimal value) {
            addCriterion("QTY_CFM =", value, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmNotEqualTo(BigDecimal value) {
            addCriterion("QTY_CFM <>", value, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmGreaterThan(BigDecimal value) {
            addCriterion("QTY_CFM >", value, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CFM >=", value, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmLessThan(BigDecimal value) {
            addCriterion("QTY_CFM <", value, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CFM <=", value, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmIn(List<BigDecimal> values) {
            addCriterion("QTY_CFM in", values, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmNotIn(List<BigDecimal> values) {
            addCriterion("QTY_CFM not in", values, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CFM between", value1, value2, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyCfmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CFM not between", value1, value2, "qtyCfm");
            return (Criteria) this;
        }

        public Criteria andQtyLostIsNull() {
            addCriterion("QTY_LOST is null");
            return (Criteria) this;
        }

        public Criteria andQtyLostIsNotNull() {
            addCriterion("QTY_LOST is not null");
            return (Criteria) this;
        }

        public Criteria andQtyLostEqualTo(BigDecimal value) {
            addCriterion("QTY_LOST =", value, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostNotEqualTo(BigDecimal value) {
            addCriterion("QTY_LOST <>", value, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostGreaterThan(BigDecimal value) {
            addCriterion("QTY_LOST >", value, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOST >=", value, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostLessThan(BigDecimal value) {
            addCriterion("QTY_LOST <", value, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOST <=", value, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostIn(List<BigDecimal> values) {
            addCriterion("QTY_LOST in", values, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostNotIn(List<BigDecimal> values) {
            addCriterion("QTY_LOST not in", values, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOST between", value1, value2, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andQtyLostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOST not between", value1, value2, "qtyLost");
            return (Criteria) this;
        }

        public Criteria andCfmManIsNull() {
            addCriterion("CFM_MAN is null");
            return (Criteria) this;
        }

        public Criteria andCfmManIsNotNull() {
            addCriterion("CFM_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andCfmManEqualTo(String value) {
            addCriterion("CFM_MAN =", value, "cfmMan");
            return (Criteria) this;
        }

        public Criteria andCfmManNotEqualTo(String value) {
            addCriterion("CFM_MAN <>", value, "cfmMan");
            return (Criteria) this;
        }

        public Criteria andCfmManGreaterThan(String value) {
            addCriterion("CFM_MAN >", value, "cfmMan");
            return (Criteria) this;
        }

        public Criteria andCfmManGreaterThanOrEqualTo(String value) {
            addCriterion("CFM_MAN >=", value, "cfmMan");
            return (Criteria) this;
        }

        public Criteria andCfmManLessThan(String value) {
            addCriterion("CFM_MAN <", value, "cfmMan");
            return (Criteria) this;
        }

        public Criteria andCfmManLessThanOrEqualTo(String value) {
            addCriterion("CFM_MAN <=", value, "cfmMan");
            return (Criteria) this;
        }

        public Criteria andCfmManLike(String value) {
            addCriterion("CFM_MAN like", value, "cfmMan");
            return (Criteria) this;
        }

        public Criteria andCfmManNotLike(String value) {
            addCriterion("CFM_MAN not like", value, "cfmMan");
            return (Criteria) this;
        }

        public Criteria andCfmManIn(List<String> values) {
            addCriterion("CFM_MAN in", values, "cfmMan");
            return (Criteria) this;
        }

        public Criteria andCfmManNotIn(List<String> values) {
            addCriterion("CFM_MAN not in", values, "cfmMan");
            return (Criteria) this;
        }

        public Criteria andCfmManBetween(String value1, String value2) {
            addCriterion("CFM_MAN between", value1, value2, "cfmMan");
            return (Criteria) this;
        }

        public Criteria andCfmManNotBetween(String value1, String value2) {
            addCriterion("CFM_MAN not between", value1, value2, "cfmMan");
            return (Criteria) this;
        }

        public Criteria andCfmDdIsNull() {
            addCriterion("CFM_DD is null");
            return (Criteria) this;
        }

        public Criteria andCfmDdIsNotNull() {
            addCriterion("CFM_DD is not null");
            return (Criteria) this;
        }

        public Criteria andCfmDdEqualTo(Date value) {
            addCriterion("CFM_DD =", value, "cfmDd");
            return (Criteria) this;
        }

        public Criteria andCfmDdNotEqualTo(Date value) {
            addCriterion("CFM_DD <>", value, "cfmDd");
            return (Criteria) this;
        }

        public Criteria andCfmDdGreaterThan(Date value) {
            addCriterion("CFM_DD >", value, "cfmDd");
            return (Criteria) this;
        }

        public Criteria andCfmDdGreaterThanOrEqualTo(Date value) {
            addCriterion("CFM_DD >=", value, "cfmDd");
            return (Criteria) this;
        }

        public Criteria andCfmDdLessThan(Date value) {
            addCriterion("CFM_DD <", value, "cfmDd");
            return (Criteria) this;
        }

        public Criteria andCfmDdLessThanOrEqualTo(Date value) {
            addCriterion("CFM_DD <=", value, "cfmDd");
            return (Criteria) this;
        }

        public Criteria andCfmDdIn(List<Date> values) {
            addCriterion("CFM_DD in", values, "cfmDd");
            return (Criteria) this;
        }

        public Criteria andCfmDdNotIn(List<Date> values) {
            addCriterion("CFM_DD not in", values, "cfmDd");
            return (Criteria) this;
        }

        public Criteria andCfmDdBetween(Date value1, Date value2) {
            addCriterion("CFM_DD between", value1, value2, "cfmDd");
            return (Criteria) this;
        }

        public Criteria andCfmDdNotBetween(Date value1, Date value2) {
            addCriterion("CFM_DD not between", value1, value2, "cfmDd");
            return (Criteria) this;
        }

        public Criteria andZlLevelIsNull() {
            addCriterion("ZL_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andZlLevelIsNotNull() {
            addCriterion("ZL_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andZlLevelEqualTo(String value) {
            addCriterion("ZL_LEVEL =", value, "zlLevel");
            return (Criteria) this;
        }

        public Criteria andZlLevelNotEqualTo(String value) {
            addCriterion("ZL_LEVEL <>", value, "zlLevel");
            return (Criteria) this;
        }

        public Criteria andZlLevelGreaterThan(String value) {
            addCriterion("ZL_LEVEL >", value, "zlLevel");
            return (Criteria) this;
        }

        public Criteria andZlLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ZL_LEVEL >=", value, "zlLevel");
            return (Criteria) this;
        }

        public Criteria andZlLevelLessThan(String value) {
            addCriterion("ZL_LEVEL <", value, "zlLevel");
            return (Criteria) this;
        }

        public Criteria andZlLevelLessThanOrEqualTo(String value) {
            addCriterion("ZL_LEVEL <=", value, "zlLevel");
            return (Criteria) this;
        }

        public Criteria andZlLevelLike(String value) {
            addCriterion("ZL_LEVEL like", value, "zlLevel");
            return (Criteria) this;
        }

        public Criteria andZlLevelNotLike(String value) {
            addCriterion("ZL_LEVEL not like", value, "zlLevel");
            return (Criteria) this;
        }

        public Criteria andZlLevelIn(List<String> values) {
            addCriterion("ZL_LEVEL in", values, "zlLevel");
            return (Criteria) this;
        }

        public Criteria andZlLevelNotIn(List<String> values) {
            addCriterion("ZL_LEVEL not in", values, "zlLevel");
            return (Criteria) this;
        }

        public Criteria andZlLevelBetween(String value1, String value2) {
            addCriterion("ZL_LEVEL between", value1, value2, "zlLevel");
            return (Criteria) this;
        }

        public Criteria andZlLevelNotBetween(String value1, String value2) {
            addCriterion("ZL_LEVEL not between", value1, value2, "zlLevel");
            return (Criteria) this;
        }

        public Criteria andAddRemsIsNull() {
            addCriterion("ADD_REMS is null");
            return (Criteria) this;
        }

        public Criteria andAddRemsIsNotNull() {
            addCriterion("ADD_REMS is not null");
            return (Criteria) this;
        }

        public Criteria andAddRemsEqualTo(String value) {
            addCriterion("ADD_REMS =", value, "addRems");
            return (Criteria) this;
        }

        public Criteria andAddRemsNotEqualTo(String value) {
            addCriterion("ADD_REMS <>", value, "addRems");
            return (Criteria) this;
        }

        public Criteria andAddRemsGreaterThan(String value) {
            addCriterion("ADD_REMS >", value, "addRems");
            return (Criteria) this;
        }

        public Criteria andAddRemsGreaterThanOrEqualTo(String value) {
            addCriterion("ADD_REMS >=", value, "addRems");
            return (Criteria) this;
        }

        public Criteria andAddRemsLessThan(String value) {
            addCriterion("ADD_REMS <", value, "addRems");
            return (Criteria) this;
        }

        public Criteria andAddRemsLessThanOrEqualTo(String value) {
            addCriterion("ADD_REMS <=", value, "addRems");
            return (Criteria) this;
        }

        public Criteria andAddRemsLike(String value) {
            addCriterion("ADD_REMS like", value, "addRems");
            return (Criteria) this;
        }

        public Criteria andAddRemsNotLike(String value) {
            addCriterion("ADD_REMS not like", value, "addRems");
            return (Criteria) this;
        }

        public Criteria andAddRemsIn(List<String> values) {
            addCriterion("ADD_REMS in", values, "addRems");
            return (Criteria) this;
        }

        public Criteria andAddRemsNotIn(List<String> values) {
            addCriterion("ADD_REMS not in", values, "addRems");
            return (Criteria) this;
        }

        public Criteria andAddRemsBetween(String value1, String value2) {
            addCriterion("ADD_REMS between", value1, value2, "addRems");
            return (Criteria) this;
        }

        public Criteria andAddRemsNotBetween(String value1, String value2) {
            addCriterion("ADD_REMS not between", value1, value2, "addRems");
            return (Criteria) this;
        }

        public Criteria andCfmBilIdIsNull() {
            addCriterion("CFM_BIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCfmBilIdIsNotNull() {
            addCriterion("CFM_BIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCfmBilIdEqualTo(String value) {
            addCriterion("CFM_BIL_ID =", value, "cfmBilId");
            return (Criteria) this;
        }

        public Criteria andCfmBilIdNotEqualTo(String value) {
            addCriterion("CFM_BIL_ID <>", value, "cfmBilId");
            return (Criteria) this;
        }

        public Criteria andCfmBilIdGreaterThan(String value) {
            addCriterion("CFM_BIL_ID >", value, "cfmBilId");
            return (Criteria) this;
        }

        public Criteria andCfmBilIdGreaterThanOrEqualTo(String value) {
            addCriterion("CFM_BIL_ID >=", value, "cfmBilId");
            return (Criteria) this;
        }

        public Criteria andCfmBilIdLessThan(String value) {
            addCriterion("CFM_BIL_ID <", value, "cfmBilId");
            return (Criteria) this;
        }

        public Criteria andCfmBilIdLessThanOrEqualTo(String value) {
            addCriterion("CFM_BIL_ID <=", value, "cfmBilId");
            return (Criteria) this;
        }

        public Criteria andCfmBilIdLike(String value) {
            addCriterion("CFM_BIL_ID like", value, "cfmBilId");
            return (Criteria) this;
        }

        public Criteria andCfmBilIdNotLike(String value) {
            addCriterion("CFM_BIL_ID not like", value, "cfmBilId");
            return (Criteria) this;
        }

        public Criteria andCfmBilIdIn(List<String> values) {
            addCriterion("CFM_BIL_ID in", values, "cfmBilId");
            return (Criteria) this;
        }

        public Criteria andCfmBilIdNotIn(List<String> values) {
            addCriterion("CFM_BIL_ID not in", values, "cfmBilId");
            return (Criteria) this;
        }

        public Criteria andCfmBilIdBetween(String value1, String value2) {
            addCriterion("CFM_BIL_ID between", value1, value2, "cfmBilId");
            return (Criteria) this;
        }

        public Criteria andCfmBilIdNotBetween(String value1, String value2) {
            addCriterion("CFM_BIL_ID not between", value1, value2, "cfmBilId");
            return (Criteria) this;
        }

        public Criteria andCfmBilNoIsNull() {
            addCriterion("CFM_BIL_NO is null");
            return (Criteria) this;
        }

        public Criteria andCfmBilNoIsNotNull() {
            addCriterion("CFM_BIL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCfmBilNoEqualTo(String value) {
            addCriterion("CFM_BIL_NO =", value, "cfmBilNo");
            return (Criteria) this;
        }

        public Criteria andCfmBilNoNotEqualTo(String value) {
            addCriterion("CFM_BIL_NO <>", value, "cfmBilNo");
            return (Criteria) this;
        }

        public Criteria andCfmBilNoGreaterThan(String value) {
            addCriterion("CFM_BIL_NO >", value, "cfmBilNo");
            return (Criteria) this;
        }

        public Criteria andCfmBilNoGreaterThanOrEqualTo(String value) {
            addCriterion("CFM_BIL_NO >=", value, "cfmBilNo");
            return (Criteria) this;
        }

        public Criteria andCfmBilNoLessThan(String value) {
            addCriterion("CFM_BIL_NO <", value, "cfmBilNo");
            return (Criteria) this;
        }

        public Criteria andCfmBilNoLessThanOrEqualTo(String value) {
            addCriterion("CFM_BIL_NO <=", value, "cfmBilNo");
            return (Criteria) this;
        }

        public Criteria andCfmBilNoLike(String value) {
            addCriterion("CFM_BIL_NO like", value, "cfmBilNo");
            return (Criteria) this;
        }

        public Criteria andCfmBilNoNotLike(String value) {
            addCriterion("CFM_BIL_NO not like", value, "cfmBilNo");
            return (Criteria) this;
        }

        public Criteria andCfmBilNoIn(List<String> values) {
            addCriterion("CFM_BIL_NO in", values, "cfmBilNo");
            return (Criteria) this;
        }

        public Criteria andCfmBilNoNotIn(List<String> values) {
            addCriterion("CFM_BIL_NO not in", values, "cfmBilNo");
            return (Criteria) this;
        }

        public Criteria andCfmBilNoBetween(String value1, String value2) {
            addCriterion("CFM_BIL_NO between", value1, value2, "cfmBilNo");
            return (Criteria) this;
        }

        public Criteria andCfmBilNoNotBetween(String value1, String value2) {
            addCriterion("CFM_BIL_NO not between", value1, value2, "cfmBilNo");
            return (Criteria) this;
        }

        public Criteria andCfmBilItmIsNull() {
            addCriterion("CFM_BIL_ITM is null");
            return (Criteria) this;
        }

        public Criteria andCfmBilItmIsNotNull() {
            addCriterion("CFM_BIL_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andCfmBilItmEqualTo(Integer value) {
            addCriterion("CFM_BIL_ITM =", value, "cfmBilItm");
            return (Criteria) this;
        }

        public Criteria andCfmBilItmNotEqualTo(Integer value) {
            addCriterion("CFM_BIL_ITM <>", value, "cfmBilItm");
            return (Criteria) this;
        }

        public Criteria andCfmBilItmGreaterThan(Integer value) {
            addCriterion("CFM_BIL_ITM >", value, "cfmBilItm");
            return (Criteria) this;
        }

        public Criteria andCfmBilItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("CFM_BIL_ITM >=", value, "cfmBilItm");
            return (Criteria) this;
        }

        public Criteria andCfmBilItmLessThan(Integer value) {
            addCriterion("CFM_BIL_ITM <", value, "cfmBilItm");
            return (Criteria) this;
        }

        public Criteria andCfmBilItmLessThanOrEqualTo(Integer value) {
            addCriterion("CFM_BIL_ITM <=", value, "cfmBilItm");
            return (Criteria) this;
        }

        public Criteria andCfmBilItmIn(List<Integer> values) {
            addCriterion("CFM_BIL_ITM in", values, "cfmBilItm");
            return (Criteria) this;
        }

        public Criteria andCfmBilItmNotIn(List<Integer> values) {
            addCriterion("CFM_BIL_ITM not in", values, "cfmBilItm");
            return (Criteria) this;
        }

        public Criteria andCfmBilItmBetween(Integer value1, Integer value2) {
            addCriterion("CFM_BIL_ITM between", value1, value2, "cfmBilItm");
            return (Criteria) this;
        }

        public Criteria andCfmBilItmNotBetween(Integer value1, Integer value2) {
            addCriterion("CFM_BIL_ITM not between", value1, value2, "cfmBilItm");
            return (Criteria) this;
        }

        public Criteria andGroupHdlDxIsNull() {
            addCriterion("GROUP_HDL_DX is null");
            return (Criteria) this;
        }

        public Criteria andGroupHdlDxIsNotNull() {
            addCriterion("GROUP_HDL_DX is not null");
            return (Criteria) this;
        }

        public Criteria andGroupHdlDxEqualTo(String value) {
            addCriterion("GROUP_HDL_DX =", value, "groupHdlDx");
            return (Criteria) this;
        }

        public Criteria andGroupHdlDxNotEqualTo(String value) {
            addCriterion("GROUP_HDL_DX <>", value, "groupHdlDx");
            return (Criteria) this;
        }

        public Criteria andGroupHdlDxGreaterThan(String value) {
            addCriterion("GROUP_HDL_DX >", value, "groupHdlDx");
            return (Criteria) this;
        }

        public Criteria andGroupHdlDxGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_HDL_DX >=", value, "groupHdlDx");
            return (Criteria) this;
        }

        public Criteria andGroupHdlDxLessThan(String value) {
            addCriterion("GROUP_HDL_DX <", value, "groupHdlDx");
            return (Criteria) this;
        }

        public Criteria andGroupHdlDxLessThanOrEqualTo(String value) {
            addCriterion("GROUP_HDL_DX <=", value, "groupHdlDx");
            return (Criteria) this;
        }

        public Criteria andGroupHdlDxLike(String value) {
            addCriterion("GROUP_HDL_DX like", value, "groupHdlDx");
            return (Criteria) this;
        }

        public Criteria andGroupHdlDxNotLike(String value) {
            addCriterion("GROUP_HDL_DX not like", value, "groupHdlDx");
            return (Criteria) this;
        }

        public Criteria andGroupHdlDxIn(List<String> values) {
            addCriterion("GROUP_HDL_DX in", values, "groupHdlDx");
            return (Criteria) this;
        }

        public Criteria andGroupHdlDxNotIn(List<String> values) {
            addCriterion("GROUP_HDL_DX not in", values, "groupHdlDx");
            return (Criteria) this;
        }

        public Criteria andGroupHdlDxBetween(String value1, String value2) {
            addCriterion("GROUP_HDL_DX between", value1, value2, "groupHdlDx");
            return (Criteria) this;
        }

        public Criteria andGroupHdlDxNotBetween(String value1, String value2) {
            addCriterion("GROUP_HDL_DX not between", value1, value2, "groupHdlDx");
            return (Criteria) this;
        }

        public Criteria andYmNoIsNull() {
            addCriterion("YM_NO is null");
            return (Criteria) this;
        }

        public Criteria andYmNoIsNotNull() {
            addCriterion("YM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andYmNoEqualTo(String value) {
            addCriterion("YM_NO =", value, "ymNo");
            return (Criteria) this;
        }

        public Criteria andYmNoNotEqualTo(String value) {
            addCriterion("YM_NO <>", value, "ymNo");
            return (Criteria) this;
        }

        public Criteria andYmNoGreaterThan(String value) {
            addCriterion("YM_NO >", value, "ymNo");
            return (Criteria) this;
        }

        public Criteria andYmNoGreaterThanOrEqualTo(String value) {
            addCriterion("YM_NO >=", value, "ymNo");
            return (Criteria) this;
        }

        public Criteria andYmNoLessThan(String value) {
            addCriterion("YM_NO <", value, "ymNo");
            return (Criteria) this;
        }

        public Criteria andYmNoLessThanOrEqualTo(String value) {
            addCriterion("YM_NO <=", value, "ymNo");
            return (Criteria) this;
        }

        public Criteria andYmNoLike(String value) {
            addCriterion("YM_NO like", value, "ymNo");
            return (Criteria) this;
        }

        public Criteria andYmNoNotLike(String value) {
            addCriterion("YM_NO not like", value, "ymNo");
            return (Criteria) this;
        }

        public Criteria andYmNoIn(List<String> values) {
            addCriterion("YM_NO in", values, "ymNo");
            return (Criteria) this;
        }

        public Criteria andYmNoNotIn(List<String> values) {
            addCriterion("YM_NO not in", values, "ymNo");
            return (Criteria) this;
        }

        public Criteria andYmNoBetween(String value1, String value2) {
            addCriterion("YM_NO between", value1, value2, "ymNo");
            return (Criteria) this;
        }

        public Criteria andYmNoNotBetween(String value1, String value2) {
            addCriterion("YM_NO not between", value1, value2, "ymNo");
            return (Criteria) this;
        }

        public Criteria andYmItmIsNull() {
            addCriterion("YM_ITM is null");
            return (Criteria) this;
        }

        public Criteria andYmItmIsNotNull() {
            addCriterion("YM_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andYmItmEqualTo(Integer value) {
            addCriterion("YM_ITM =", value, "ymItm");
            return (Criteria) this;
        }

        public Criteria andYmItmNotEqualTo(Integer value) {
            addCriterion("YM_ITM <>", value, "ymItm");
            return (Criteria) this;
        }

        public Criteria andYmItmGreaterThan(Integer value) {
            addCriterion("YM_ITM >", value, "ymItm");
            return (Criteria) this;
        }

        public Criteria andYmItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("YM_ITM >=", value, "ymItm");
            return (Criteria) this;
        }

        public Criteria andYmItmLessThan(Integer value) {
            addCriterion("YM_ITM <", value, "ymItm");
            return (Criteria) this;
        }

        public Criteria andYmItmLessThanOrEqualTo(Integer value) {
            addCriterion("YM_ITM <=", value, "ymItm");
            return (Criteria) this;
        }

        public Criteria andYmItmIn(List<Integer> values) {
            addCriterion("YM_ITM in", values, "ymItm");
            return (Criteria) this;
        }

        public Criteria andYmItmNotIn(List<Integer> values) {
            addCriterion("YM_ITM not in", values, "ymItm");
            return (Criteria) this;
        }

        public Criteria andYmItmBetween(Integer value1, Integer value2) {
            addCriterion("YM_ITM between", value1, value2, "ymItm");
            return (Criteria) this;
        }

        public Criteria andYmItmNotBetween(Integer value1, Integer value2) {
            addCriterion("YM_ITM not between", value1, value2, "ymItm");
            return (Criteria) this;
        }

        public Criteria andGroupCyHdlIsNull() {
            addCriterion("GROUP_CY_HDL is null");
            return (Criteria) this;
        }

        public Criteria andGroupCyHdlIsNotNull() {
            addCriterion("GROUP_CY_HDL is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCyHdlEqualTo(String value) {
            addCriterion("GROUP_CY_HDL =", value, "groupCyHdl");
            return (Criteria) this;
        }

        public Criteria andGroupCyHdlNotEqualTo(String value) {
            addCriterion("GROUP_CY_HDL <>", value, "groupCyHdl");
            return (Criteria) this;
        }

        public Criteria andGroupCyHdlGreaterThan(String value) {
            addCriterion("GROUP_CY_HDL >", value, "groupCyHdl");
            return (Criteria) this;
        }

        public Criteria andGroupCyHdlGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_CY_HDL >=", value, "groupCyHdl");
            return (Criteria) this;
        }

        public Criteria andGroupCyHdlLessThan(String value) {
            addCriterion("GROUP_CY_HDL <", value, "groupCyHdl");
            return (Criteria) this;
        }

        public Criteria andGroupCyHdlLessThanOrEqualTo(String value) {
            addCriterion("GROUP_CY_HDL <=", value, "groupCyHdl");
            return (Criteria) this;
        }

        public Criteria andGroupCyHdlLike(String value) {
            addCriterion("GROUP_CY_HDL like", value, "groupCyHdl");
            return (Criteria) this;
        }

        public Criteria andGroupCyHdlNotLike(String value) {
            addCriterion("GROUP_CY_HDL not like", value, "groupCyHdl");
            return (Criteria) this;
        }

        public Criteria andGroupCyHdlIn(List<String> values) {
            addCriterion("GROUP_CY_HDL in", values, "groupCyHdl");
            return (Criteria) this;
        }

        public Criteria andGroupCyHdlNotIn(List<String> values) {
            addCriterion("GROUP_CY_HDL not in", values, "groupCyHdl");
            return (Criteria) this;
        }

        public Criteria andGroupCyHdlBetween(String value1, String value2) {
            addCriterion("GROUP_CY_HDL between", value1, value2, "groupCyHdl");
            return (Criteria) this;
        }

        public Criteria andGroupCyHdlNotBetween(String value1, String value2) {
            addCriterion("GROUP_CY_HDL not between", value1, value2, "groupCyHdl");
            return (Criteria) this;
        }

        public Criteria andGroupCyIdIsNull() {
            addCriterion("GROUP_CY_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupCyIdIsNotNull() {
            addCriterion("GROUP_CY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCyIdEqualTo(String value) {
            addCriterion("GROUP_CY_ID =", value, "groupCyId");
            return (Criteria) this;
        }

        public Criteria andGroupCyIdNotEqualTo(String value) {
            addCriterion("GROUP_CY_ID <>", value, "groupCyId");
            return (Criteria) this;
        }

        public Criteria andGroupCyIdGreaterThan(String value) {
            addCriterion("GROUP_CY_ID >", value, "groupCyId");
            return (Criteria) this;
        }

        public Criteria andGroupCyIdGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_CY_ID >=", value, "groupCyId");
            return (Criteria) this;
        }

        public Criteria andGroupCyIdLessThan(String value) {
            addCriterion("GROUP_CY_ID <", value, "groupCyId");
            return (Criteria) this;
        }

        public Criteria andGroupCyIdLessThanOrEqualTo(String value) {
            addCriterion("GROUP_CY_ID <=", value, "groupCyId");
            return (Criteria) this;
        }

        public Criteria andGroupCyIdLike(String value) {
            addCriterion("GROUP_CY_ID like", value, "groupCyId");
            return (Criteria) this;
        }

        public Criteria andGroupCyIdNotLike(String value) {
            addCriterion("GROUP_CY_ID not like", value, "groupCyId");
            return (Criteria) this;
        }

        public Criteria andGroupCyIdIn(List<String> values) {
            addCriterion("GROUP_CY_ID in", values, "groupCyId");
            return (Criteria) this;
        }

        public Criteria andGroupCyIdNotIn(List<String> values) {
            addCriterion("GROUP_CY_ID not in", values, "groupCyId");
            return (Criteria) this;
        }

        public Criteria andGroupCyIdBetween(String value1, String value2) {
            addCriterion("GROUP_CY_ID between", value1, value2, "groupCyId");
            return (Criteria) this;
        }

        public Criteria andGroupCyIdNotBetween(String value1, String value2) {
            addCriterion("GROUP_CY_ID not between", value1, value2, "groupCyId");
            return (Criteria) this;
        }

        public Criteria andGroupCyNoIsNull() {
            addCriterion("GROUP_CY_NO is null");
            return (Criteria) this;
        }

        public Criteria andGroupCyNoIsNotNull() {
            addCriterion("GROUP_CY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCyNoEqualTo(String value) {
            addCriterion("GROUP_CY_NO =", value, "groupCyNo");
            return (Criteria) this;
        }

        public Criteria andGroupCyNoNotEqualTo(String value) {
            addCriterion("GROUP_CY_NO <>", value, "groupCyNo");
            return (Criteria) this;
        }

        public Criteria andGroupCyNoGreaterThan(String value) {
            addCriterion("GROUP_CY_NO >", value, "groupCyNo");
            return (Criteria) this;
        }

        public Criteria andGroupCyNoGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_CY_NO >=", value, "groupCyNo");
            return (Criteria) this;
        }

        public Criteria andGroupCyNoLessThan(String value) {
            addCriterion("GROUP_CY_NO <", value, "groupCyNo");
            return (Criteria) this;
        }

        public Criteria andGroupCyNoLessThanOrEqualTo(String value) {
            addCriterion("GROUP_CY_NO <=", value, "groupCyNo");
            return (Criteria) this;
        }

        public Criteria andGroupCyNoLike(String value) {
            addCriterion("GROUP_CY_NO like", value, "groupCyNo");
            return (Criteria) this;
        }

        public Criteria andGroupCyNoNotLike(String value) {
            addCriterion("GROUP_CY_NO not like", value, "groupCyNo");
            return (Criteria) this;
        }

        public Criteria andGroupCyNoIn(List<String> values) {
            addCriterion("GROUP_CY_NO in", values, "groupCyNo");
            return (Criteria) this;
        }

        public Criteria andGroupCyNoNotIn(List<String> values) {
            addCriterion("GROUP_CY_NO not in", values, "groupCyNo");
            return (Criteria) this;
        }

        public Criteria andGroupCyNoBetween(String value1, String value2) {
            addCriterion("GROUP_CY_NO between", value1, value2, "groupCyNo");
            return (Criteria) this;
        }

        public Criteria andGroupCyNoNotBetween(String value1, String value2) {
            addCriterion("GROUP_CY_NO not between", value1, value2, "groupCyNo");
            return (Criteria) this;
        }

        public Criteria andGroupCyItmIsNull() {
            addCriterion("GROUP_CY_ITM is null");
            return (Criteria) this;
        }

        public Criteria andGroupCyItmIsNotNull() {
            addCriterion("GROUP_CY_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCyItmEqualTo(Integer value) {
            addCriterion("GROUP_CY_ITM =", value, "groupCyItm");
            return (Criteria) this;
        }

        public Criteria andGroupCyItmNotEqualTo(Integer value) {
            addCriterion("GROUP_CY_ITM <>", value, "groupCyItm");
            return (Criteria) this;
        }

        public Criteria andGroupCyItmGreaterThan(Integer value) {
            addCriterion("GROUP_CY_ITM >", value, "groupCyItm");
            return (Criteria) this;
        }

        public Criteria andGroupCyItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("GROUP_CY_ITM >=", value, "groupCyItm");
            return (Criteria) this;
        }

        public Criteria andGroupCyItmLessThan(Integer value) {
            addCriterion("GROUP_CY_ITM <", value, "groupCyItm");
            return (Criteria) this;
        }

        public Criteria andGroupCyItmLessThanOrEqualTo(Integer value) {
            addCriterion("GROUP_CY_ITM <=", value, "groupCyItm");
            return (Criteria) this;
        }

        public Criteria andGroupCyItmIn(List<Integer> values) {
            addCriterion("GROUP_CY_ITM in", values, "groupCyItm");
            return (Criteria) this;
        }

        public Criteria andGroupCyItmNotIn(List<Integer> values) {
            addCriterion("GROUP_CY_ITM not in", values, "groupCyItm");
            return (Criteria) this;
        }

        public Criteria andGroupCyItmBetween(Integer value1, Integer value2) {
            addCriterion("GROUP_CY_ITM between", value1, value2, "groupCyItm");
            return (Criteria) this;
        }

        public Criteria andGroupCyItmNotBetween(Integer value1, Integer value2) {
            addCriterion("GROUP_CY_ITM not between", value1, value2, "groupCyItm");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcidIsNull() {
            addCriterion("GROUP_DX_PCID is null");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcidIsNotNull() {
            addCriterion("GROUP_DX_PCID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcidEqualTo(String value) {
            addCriterion("GROUP_DX_PCID =", value, "groupDxPcid");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcidNotEqualTo(String value) {
            addCriterion("GROUP_DX_PCID <>", value, "groupDxPcid");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcidGreaterThan(String value) {
            addCriterion("GROUP_DX_PCID >", value, "groupDxPcid");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcidGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_DX_PCID >=", value, "groupDxPcid");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcidLessThan(String value) {
            addCriterion("GROUP_DX_PCID <", value, "groupDxPcid");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcidLessThanOrEqualTo(String value) {
            addCriterion("GROUP_DX_PCID <=", value, "groupDxPcid");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcidLike(String value) {
            addCriterion("GROUP_DX_PCID like", value, "groupDxPcid");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcidNotLike(String value) {
            addCriterion("GROUP_DX_PCID not like", value, "groupDxPcid");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcidIn(List<String> values) {
            addCriterion("GROUP_DX_PCID in", values, "groupDxPcid");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcidNotIn(List<String> values) {
            addCriterion("GROUP_DX_PCID not in", values, "groupDxPcid");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcidBetween(String value1, String value2) {
            addCriterion("GROUP_DX_PCID between", value1, value2, "groupDxPcid");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcidNotBetween(String value1, String value2) {
            addCriterion("GROUP_DX_PCID not between", value1, value2, "groupDxPcid");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcnoIsNull() {
            addCriterion("GROUP_DX_PCNO is null");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcnoIsNotNull() {
            addCriterion("GROUP_DX_PCNO is not null");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcnoEqualTo(String value) {
            addCriterion("GROUP_DX_PCNO =", value, "groupDxPcno");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcnoNotEqualTo(String value) {
            addCriterion("GROUP_DX_PCNO <>", value, "groupDxPcno");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcnoGreaterThan(String value) {
            addCriterion("GROUP_DX_PCNO >", value, "groupDxPcno");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcnoGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_DX_PCNO >=", value, "groupDxPcno");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcnoLessThan(String value) {
            addCriterion("GROUP_DX_PCNO <", value, "groupDxPcno");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcnoLessThanOrEqualTo(String value) {
            addCriterion("GROUP_DX_PCNO <=", value, "groupDxPcno");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcnoLike(String value) {
            addCriterion("GROUP_DX_PCNO like", value, "groupDxPcno");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcnoNotLike(String value) {
            addCriterion("GROUP_DX_PCNO not like", value, "groupDxPcno");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcnoIn(List<String> values) {
            addCriterion("GROUP_DX_PCNO in", values, "groupDxPcno");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcnoNotIn(List<String> values) {
            addCriterion("GROUP_DX_PCNO not in", values, "groupDxPcno");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcnoBetween(String value1, String value2) {
            addCriterion("GROUP_DX_PCNO between", value1, value2, "groupDxPcno");
            return (Criteria) this;
        }

        public Criteria andGroupDxPcnoNotBetween(String value1, String value2) {
            addCriterion("GROUP_DX_PCNO not between", value1, value2, "groupDxPcno");
            return (Criteria) this;
        }

        public Criteria andQtyGroupDxcyIsNull() {
            addCriterion("QTY_GROUP_DXCY is null");
            return (Criteria) this;
        }

        public Criteria andQtyGroupDxcyIsNotNull() {
            addCriterion("QTY_GROUP_DXCY is not null");
            return (Criteria) this;
        }

        public Criteria andQtyGroupDxcyEqualTo(BigDecimal value) {
            addCriterion("QTY_GROUP_DXCY =", value, "qtyGroupDxcy");
            return (Criteria) this;
        }

        public Criteria andQtyGroupDxcyNotEqualTo(BigDecimal value) {
            addCriterion("QTY_GROUP_DXCY <>", value, "qtyGroupDxcy");
            return (Criteria) this;
        }

        public Criteria andQtyGroupDxcyGreaterThan(BigDecimal value) {
            addCriterion("QTY_GROUP_DXCY >", value, "qtyGroupDxcy");
            return (Criteria) this;
        }

        public Criteria andQtyGroupDxcyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_GROUP_DXCY >=", value, "qtyGroupDxcy");
            return (Criteria) this;
        }

        public Criteria andQtyGroupDxcyLessThan(BigDecimal value) {
            addCriterion("QTY_GROUP_DXCY <", value, "qtyGroupDxcy");
            return (Criteria) this;
        }

        public Criteria andQtyGroupDxcyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_GROUP_DXCY <=", value, "qtyGroupDxcy");
            return (Criteria) this;
        }

        public Criteria andQtyGroupDxcyIn(List<BigDecimal> values) {
            addCriterion("QTY_GROUP_DXCY in", values, "qtyGroupDxcy");
            return (Criteria) this;
        }

        public Criteria andQtyGroupDxcyNotIn(List<BigDecimal> values) {
            addCriterion("QTY_GROUP_DXCY not in", values, "qtyGroupDxcy");
            return (Criteria) this;
        }

        public Criteria andQtyGroupDxcyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_GROUP_DXCY between", value1, value2, "qtyGroupDxcy");
            return (Criteria) this;
        }

        public Criteria andQtyGroupDxcyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_GROUP_DXCY not between", value1, value2, "qtyGroupDxcy");
            return (Criteria) this;
        }

        public Criteria andNbZxNoIsNull() {
            addCriterion("NB_ZX_NO is null");
            return (Criteria) this;
        }

        public Criteria andNbZxNoIsNotNull() {
            addCriterion("NB_ZX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andNbZxNoEqualTo(String value) {
            addCriterion("NB_ZX_NO =", value, "nbZxNo");
            return (Criteria) this;
        }

        public Criteria andNbZxNoNotEqualTo(String value) {
            addCriterion("NB_ZX_NO <>", value, "nbZxNo");
            return (Criteria) this;
        }

        public Criteria andNbZxNoGreaterThan(String value) {
            addCriterion("NB_ZX_NO >", value, "nbZxNo");
            return (Criteria) this;
        }

        public Criteria andNbZxNoGreaterThanOrEqualTo(String value) {
            addCriterion("NB_ZX_NO >=", value, "nbZxNo");
            return (Criteria) this;
        }

        public Criteria andNbZxNoLessThan(String value) {
            addCriterion("NB_ZX_NO <", value, "nbZxNo");
            return (Criteria) this;
        }

        public Criteria andNbZxNoLessThanOrEqualTo(String value) {
            addCriterion("NB_ZX_NO <=", value, "nbZxNo");
            return (Criteria) this;
        }

        public Criteria andNbZxNoLike(String value) {
            addCriterion("NB_ZX_NO like", value, "nbZxNo");
            return (Criteria) this;
        }

        public Criteria andNbZxNoNotLike(String value) {
            addCriterion("NB_ZX_NO not like", value, "nbZxNo");
            return (Criteria) this;
        }

        public Criteria andNbZxNoIn(List<String> values) {
            addCriterion("NB_ZX_NO in", values, "nbZxNo");
            return (Criteria) this;
        }

        public Criteria andNbZxNoNotIn(List<String> values) {
            addCriterion("NB_ZX_NO not in", values, "nbZxNo");
            return (Criteria) this;
        }

        public Criteria andNbZxNoBetween(String value1, String value2) {
            addCriterion("NB_ZX_NO between", value1, value2, "nbZxNo");
            return (Criteria) this;
        }

        public Criteria andNbZxNoNotBetween(String value1, String value2) {
            addCriterion("NB_ZX_NO not between", value1, value2, "nbZxNo");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("ORIGIN is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("ORIGIN is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("ORIGIN =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("ORIGIN <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("ORIGIN >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGIN >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("ORIGIN <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("ORIGIN <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("ORIGIN like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("ORIGIN not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("ORIGIN in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("ORIGIN not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("ORIGIN between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("ORIGIN not between", value1, value2, "origin");
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

        public Criteria andRtnIdIsNull() {
            addCriterion("RTN_ID is null");
            return (Criteria) this;
        }

        public Criteria andRtnIdIsNotNull() {
            addCriterion("RTN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRtnIdEqualTo(String value) {
            addCriterion("RTN_ID =", value, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdNotEqualTo(String value) {
            addCriterion("RTN_ID <>", value, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdGreaterThan(String value) {
            addCriterion("RTN_ID >", value, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdGreaterThanOrEqualTo(String value) {
            addCriterion("RTN_ID >=", value, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdLessThan(String value) {
            addCriterion("RTN_ID <", value, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdLessThanOrEqualTo(String value) {
            addCriterion("RTN_ID <=", value, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdLike(String value) {
            addCriterion("RTN_ID like", value, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdNotLike(String value) {
            addCriterion("RTN_ID not like", value, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdIn(List<String> values) {
            addCriterion("RTN_ID in", values, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdNotIn(List<String> values) {
            addCriterion("RTN_ID not in", values, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdBetween(String value1, String value2) {
            addCriterion("RTN_ID between", value1, value2, "rtnId");
            return (Criteria) this;
        }

        public Criteria andRtnIdNotBetween(String value1, String value2) {
            addCriterion("RTN_ID not between", value1, value2, "rtnId");
            return (Criteria) this;
        }

        public Criteria andLbNoIsNull() {
            addCriterion("LB_NO is null");
            return (Criteria) this;
        }

        public Criteria andLbNoIsNotNull() {
            addCriterion("LB_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLbNoEqualTo(String value) {
            addCriterion("LB_NO =", value, "lbNo");
            return (Criteria) this;
        }

        public Criteria andLbNoNotEqualTo(String value) {
            addCriterion("LB_NO <>", value, "lbNo");
            return (Criteria) this;
        }

        public Criteria andLbNoGreaterThan(String value) {
            addCriterion("LB_NO >", value, "lbNo");
            return (Criteria) this;
        }

        public Criteria andLbNoGreaterThanOrEqualTo(String value) {
            addCriterion("LB_NO >=", value, "lbNo");
            return (Criteria) this;
        }

        public Criteria andLbNoLessThan(String value) {
            addCriterion("LB_NO <", value, "lbNo");
            return (Criteria) this;
        }

        public Criteria andLbNoLessThanOrEqualTo(String value) {
            addCriterion("LB_NO <=", value, "lbNo");
            return (Criteria) this;
        }

        public Criteria andLbNoLike(String value) {
            addCriterion("LB_NO like", value, "lbNo");
            return (Criteria) this;
        }

        public Criteria andLbNoNotLike(String value) {
            addCriterion("LB_NO not like", value, "lbNo");
            return (Criteria) this;
        }

        public Criteria andLbNoIn(List<String> values) {
            addCriterion("LB_NO in", values, "lbNo");
            return (Criteria) this;
        }

        public Criteria andLbNoNotIn(List<String> values) {
            addCriterion("LB_NO not in", values, "lbNo");
            return (Criteria) this;
        }

        public Criteria andLbNoBetween(String value1, String value2) {
            addCriterion("LB_NO between", value1, value2, "lbNo");
            return (Criteria) this;
        }

        public Criteria andLbNoNotBetween(String value1, String value2) {
            addCriterion("LB_NO not between", value1, value2, "lbNo");
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

        public Criteria andUpZgFlagIsNull() {
            addCriterion("UP_ZG_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andUpZgFlagIsNotNull() {
            addCriterion("UP_ZG_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andUpZgFlagEqualTo(String value) {
            addCriterion("UP_ZG_FLAG =", value, "upZgFlag");
            return (Criteria) this;
        }

        public Criteria andUpZgFlagNotEqualTo(String value) {
            addCriterion("UP_ZG_FLAG <>", value, "upZgFlag");
            return (Criteria) this;
        }

        public Criteria andUpZgFlagGreaterThan(String value) {
            addCriterion("UP_ZG_FLAG >", value, "upZgFlag");
            return (Criteria) this;
        }

        public Criteria andUpZgFlagGreaterThanOrEqualTo(String value) {
            addCriterion("UP_ZG_FLAG >=", value, "upZgFlag");
            return (Criteria) this;
        }

        public Criteria andUpZgFlagLessThan(String value) {
            addCriterion("UP_ZG_FLAG <", value, "upZgFlag");
            return (Criteria) this;
        }

        public Criteria andUpZgFlagLessThanOrEqualTo(String value) {
            addCriterion("UP_ZG_FLAG <=", value, "upZgFlag");
            return (Criteria) this;
        }

        public Criteria andUpZgFlagLike(String value) {
            addCriterion("UP_ZG_FLAG like", value, "upZgFlag");
            return (Criteria) this;
        }

        public Criteria andUpZgFlagNotLike(String value) {
            addCriterion("UP_ZG_FLAG not like", value, "upZgFlag");
            return (Criteria) this;
        }

        public Criteria andUpZgFlagIn(List<String> values) {
            addCriterion("UP_ZG_FLAG in", values, "upZgFlag");
            return (Criteria) this;
        }

        public Criteria andUpZgFlagNotIn(List<String> values) {
            addCriterion("UP_ZG_FLAG not in", values, "upZgFlag");
            return (Criteria) this;
        }

        public Criteria andUpZgFlagBetween(String value1, String value2) {
            addCriterion("UP_ZG_FLAG between", value1, value2, "upZgFlag");
            return (Criteria) this;
        }

        public Criteria andUpZgFlagNotBetween(String value1, String value2) {
            addCriterion("UP_ZG_FLAG not between", value1, value2, "upZgFlag");
            return (Criteria) this;
        }

        public Criteria andCfmSplItmIsNull() {
            addCriterion("CFM_SPL_ITM is null");
            return (Criteria) this;
        }

        public Criteria andCfmSplItmIsNotNull() {
            addCriterion("CFM_SPL_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andCfmSplItmEqualTo(String value) {
            addCriterion("CFM_SPL_ITM =", value, "cfmSplItm");
            return (Criteria) this;
        }

        public Criteria andCfmSplItmNotEqualTo(String value) {
            addCriterion("CFM_SPL_ITM <>", value, "cfmSplItm");
            return (Criteria) this;
        }

        public Criteria andCfmSplItmGreaterThan(String value) {
            addCriterion("CFM_SPL_ITM >", value, "cfmSplItm");
            return (Criteria) this;
        }

        public Criteria andCfmSplItmGreaterThanOrEqualTo(String value) {
            addCriterion("CFM_SPL_ITM >=", value, "cfmSplItm");
            return (Criteria) this;
        }

        public Criteria andCfmSplItmLessThan(String value) {
            addCriterion("CFM_SPL_ITM <", value, "cfmSplItm");
            return (Criteria) this;
        }

        public Criteria andCfmSplItmLessThanOrEqualTo(String value) {
            addCriterion("CFM_SPL_ITM <=", value, "cfmSplItm");
            return (Criteria) this;
        }

        public Criteria andCfmSplItmLike(String value) {
            addCriterion("CFM_SPL_ITM like", value, "cfmSplItm");
            return (Criteria) this;
        }

        public Criteria andCfmSplItmNotLike(String value) {
            addCriterion("CFM_SPL_ITM not like", value, "cfmSplItm");
            return (Criteria) this;
        }

        public Criteria andCfmSplItmIn(List<String> values) {
            addCriterion("CFM_SPL_ITM in", values, "cfmSplItm");
            return (Criteria) this;
        }

        public Criteria andCfmSplItmNotIn(List<String> values) {
            addCriterion("CFM_SPL_ITM not in", values, "cfmSplItm");
            return (Criteria) this;
        }

        public Criteria andCfmSplItmBetween(String value1, String value2) {
            addCriterion("CFM_SPL_ITM between", value1, value2, "cfmSplItm");
            return (Criteria) this;
        }

        public Criteria andCfmSplItmNotBetween(String value1, String value2) {
            addCriterion("CFM_SPL_ITM not between", value1, value2, "cfmSplItm");
            return (Criteria) this;
        }

        public Criteria andYmNo1IsNull() {
            addCriterion("YM_NO1 is null");
            return (Criteria) this;
        }

        public Criteria andYmNo1IsNotNull() {
            addCriterion("YM_NO1 is not null");
            return (Criteria) this;
        }

        public Criteria andYmNo1EqualTo(String value) {
            addCriterion("YM_NO1 =", value, "ymNo1");
            return (Criteria) this;
        }

        public Criteria andYmNo1NotEqualTo(String value) {
            addCriterion("YM_NO1 <>", value, "ymNo1");
            return (Criteria) this;
        }

        public Criteria andYmNo1GreaterThan(String value) {
            addCriterion("YM_NO1 >", value, "ymNo1");
            return (Criteria) this;
        }

        public Criteria andYmNo1GreaterThanOrEqualTo(String value) {
            addCriterion("YM_NO1 >=", value, "ymNo1");
            return (Criteria) this;
        }

        public Criteria andYmNo1LessThan(String value) {
            addCriterion("YM_NO1 <", value, "ymNo1");
            return (Criteria) this;
        }

        public Criteria andYmNo1LessThanOrEqualTo(String value) {
            addCriterion("YM_NO1 <=", value, "ymNo1");
            return (Criteria) this;
        }

        public Criteria andYmNo1Like(String value) {
            addCriterion("YM_NO1 like", value, "ymNo1");
            return (Criteria) this;
        }

        public Criteria andYmNo1NotLike(String value) {
            addCriterion("YM_NO1 not like", value, "ymNo1");
            return (Criteria) this;
        }

        public Criteria andYmNo1In(List<String> values) {
            addCriterion("YM_NO1 in", values, "ymNo1");
            return (Criteria) this;
        }

        public Criteria andYmNo1NotIn(List<String> values) {
            addCriterion("YM_NO1 not in", values, "ymNo1");
            return (Criteria) this;
        }

        public Criteria andYmNo1Between(String value1, String value2) {
            addCriterion("YM_NO1 between", value1, value2, "ymNo1");
            return (Criteria) this;
        }

        public Criteria andYmNo1NotBetween(String value1, String value2) {
            addCriterion("YM_NO1 not between", value1, value2, "ymNo1");
            return (Criteria) this;
        }

        public Criteria andYmItm1IsNull() {
            addCriterion("YM_ITM1 is null");
            return (Criteria) this;
        }

        public Criteria andYmItm1IsNotNull() {
            addCriterion("YM_ITM1 is not null");
            return (Criteria) this;
        }

        public Criteria andYmItm1EqualTo(Integer value) {
            addCriterion("YM_ITM1 =", value, "ymItm1");
            return (Criteria) this;
        }

        public Criteria andYmItm1NotEqualTo(Integer value) {
            addCriterion("YM_ITM1 <>", value, "ymItm1");
            return (Criteria) this;
        }

        public Criteria andYmItm1GreaterThan(Integer value) {
            addCriterion("YM_ITM1 >", value, "ymItm1");
            return (Criteria) this;
        }

        public Criteria andYmItm1GreaterThanOrEqualTo(Integer value) {
            addCriterion("YM_ITM1 >=", value, "ymItm1");
            return (Criteria) this;
        }

        public Criteria andYmItm1LessThan(Integer value) {
            addCriterion("YM_ITM1 <", value, "ymItm1");
            return (Criteria) this;
        }

        public Criteria andYmItm1LessThanOrEqualTo(Integer value) {
            addCriterion("YM_ITM1 <=", value, "ymItm1");
            return (Criteria) this;
        }

        public Criteria andYmItm1In(List<Integer> values) {
            addCriterion("YM_ITM1 in", values, "ymItm1");
            return (Criteria) this;
        }

        public Criteria andYmItm1NotIn(List<Integer> values) {
            addCriterion("YM_ITM1 not in", values, "ymItm1");
            return (Criteria) this;
        }

        public Criteria andYmItm1Between(Integer value1, Integer value2) {
            addCriterion("YM_ITM1 between", value1, value2, "ymItm1");
            return (Criteria) this;
        }

        public Criteria andYmItm1NotBetween(Integer value1, Integer value2) {
            addCriterion("YM_ITM1 not between", value1, value2, "ymItm1");
            return (Criteria) this;
        }

        public Criteria andAmtZdzkIsNull() {
            addCriterion("AMT_ZDZK is null");
            return (Criteria) this;
        }

        public Criteria andAmtZdzkIsNotNull() {
            addCriterion("AMT_ZDZK is not null");
            return (Criteria) this;
        }

        public Criteria andAmtZdzkEqualTo(BigDecimal value) {
            addCriterion("AMT_ZDZK =", value, "amtZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtZdzkNotEqualTo(BigDecimal value) {
            addCriterion("AMT_ZDZK <>", value, "amtZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtZdzkGreaterThan(BigDecimal value) {
            addCriterion("AMT_ZDZK >", value, "amtZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtZdzkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_ZDZK >=", value, "amtZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtZdzkLessThan(BigDecimal value) {
            addCriterion("AMT_ZDZK <", value, "amtZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtZdzkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_ZDZK <=", value, "amtZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtZdzkIn(List<BigDecimal> values) {
            addCriterion("AMT_ZDZK in", values, "amtZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtZdzkNotIn(List<BigDecimal> values) {
            addCriterion("AMT_ZDZK not in", values, "amtZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtZdzkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_ZDZK between", value1, value2, "amtZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtZdzkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_ZDZK not between", value1, value2, "amtZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZdzkIsNull() {
            addCriterion("AMTN_NET_ZDZK is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZdzkIsNotNull() {
            addCriterion("AMTN_NET_ZDZK is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZdzkEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_ZDZK =", value, "amtnNetZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZdzkNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_ZDZK <>", value, "amtnNetZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZdzkGreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET_ZDZK >", value, "amtnNetZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZdzkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_ZDZK >=", value, "amtnNetZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZdzkLessThan(BigDecimal value) {
            addCriterion("AMTN_NET_ZDZK <", value, "amtnNetZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZdzkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_ZDZK <=", value, "amtnNetZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZdzkIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_ZDZK in", values, "amtnNetZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZdzkNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_ZDZK not in", values, "amtnNetZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZdzkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_ZDZK between", value1, value2, "amtnNetZdzk");
            return (Criteria) this;
        }

        public Criteria andAmtnNetZdzkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_ZDZK not between", value1, value2, "amtnNetZdzk");
            return (Criteria) this;
        }

        public Criteria andTaxZdzkIsNull() {
            addCriterion("TAX_ZDZK is null");
            return (Criteria) this;
        }

        public Criteria andTaxZdzkIsNotNull() {
            addCriterion("TAX_ZDZK is not null");
            return (Criteria) this;
        }

        public Criteria andTaxZdzkEqualTo(BigDecimal value) {
            addCriterion("TAX_ZDZK =", value, "taxZdzk");
            return (Criteria) this;
        }

        public Criteria andTaxZdzkNotEqualTo(BigDecimal value) {
            addCriterion("TAX_ZDZK <>", value, "taxZdzk");
            return (Criteria) this;
        }

        public Criteria andTaxZdzkGreaterThan(BigDecimal value) {
            addCriterion("TAX_ZDZK >", value, "taxZdzk");
            return (Criteria) this;
        }

        public Criteria andTaxZdzkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_ZDZK >=", value, "taxZdzk");
            return (Criteria) this;
        }

        public Criteria andTaxZdzkLessThan(BigDecimal value) {
            addCriterion("TAX_ZDZK <", value, "taxZdzk");
            return (Criteria) this;
        }

        public Criteria andTaxZdzkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_ZDZK <=", value, "taxZdzk");
            return (Criteria) this;
        }

        public Criteria andTaxZdzkIn(List<BigDecimal> values) {
            addCriterion("TAX_ZDZK in", values, "taxZdzk");
            return (Criteria) this;
        }

        public Criteria andTaxZdzkNotIn(List<BigDecimal> values) {
            addCriterion("TAX_ZDZK not in", values, "taxZdzk");
            return (Criteria) this;
        }

        public Criteria andTaxZdzkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_ZDZK between", value1, value2, "taxZdzk");
            return (Criteria) this;
        }

        public Criteria andTaxZdzkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_ZDZK not between", value1, value2, "taxZdzk");
            return (Criteria) this;
        }

        public Criteria andNbBoxSlIsNull() {
            addCriterion("NB_BOX_SL is null");
            return (Criteria) this;
        }

        public Criteria andNbBoxSlIsNotNull() {
            addCriterion("NB_BOX_SL is not null");
            return (Criteria) this;
        }

        public Criteria andNbBoxSlEqualTo(String value) {
            addCriterion("NB_BOX_SL =", value, "nbBoxSl");
            return (Criteria) this;
        }

        public Criteria andNbBoxSlNotEqualTo(String value) {
            addCriterion("NB_BOX_SL <>", value, "nbBoxSl");
            return (Criteria) this;
        }

        public Criteria andNbBoxSlGreaterThan(String value) {
            addCriterion("NB_BOX_SL >", value, "nbBoxSl");
            return (Criteria) this;
        }

        public Criteria andNbBoxSlGreaterThanOrEqualTo(String value) {
            addCriterion("NB_BOX_SL >=", value, "nbBoxSl");
            return (Criteria) this;
        }

        public Criteria andNbBoxSlLessThan(String value) {
            addCriterion("NB_BOX_SL <", value, "nbBoxSl");
            return (Criteria) this;
        }

        public Criteria andNbBoxSlLessThanOrEqualTo(String value) {
            addCriterion("NB_BOX_SL <=", value, "nbBoxSl");
            return (Criteria) this;
        }

        public Criteria andNbBoxSlLike(String value) {
            addCriterion("NB_BOX_SL like", value, "nbBoxSl");
            return (Criteria) this;
        }

        public Criteria andNbBoxSlNotLike(String value) {
            addCriterion("NB_BOX_SL not like", value, "nbBoxSl");
            return (Criteria) this;
        }

        public Criteria andNbBoxSlIn(List<String> values) {
            addCriterion("NB_BOX_SL in", values, "nbBoxSl");
            return (Criteria) this;
        }

        public Criteria andNbBoxSlNotIn(List<String> values) {
            addCriterion("NB_BOX_SL not in", values, "nbBoxSl");
            return (Criteria) this;
        }

        public Criteria andNbBoxSlBetween(String value1, String value2) {
            addCriterion("NB_BOX_SL between", value1, value2, "nbBoxSl");
            return (Criteria) this;
        }

        public Criteria andNbBoxSlNotBetween(String value1, String value2) {
            addCriterion("NB_BOX_SL not between", value1, value2, "nbBoxSl");
            return (Criteria) this;
        }

        public Criteria andAmtAbjFreeIsNull() {
            addCriterion("AMT_ABJ_FREE is null");
            return (Criteria) this;
        }

        public Criteria andAmtAbjFreeIsNotNull() {
            addCriterion("AMT_ABJ_FREE is not null");
            return (Criteria) this;
        }

        public Criteria andAmtAbjFreeEqualTo(BigDecimal value) {
            addCriterion("AMT_ABJ_FREE =", value, "amtAbjFree");
            return (Criteria) this;
        }

        public Criteria andAmtAbjFreeNotEqualTo(BigDecimal value) {
            addCriterion("AMT_ABJ_FREE <>", value, "amtAbjFree");
            return (Criteria) this;
        }

        public Criteria andAmtAbjFreeGreaterThan(BigDecimal value) {
            addCriterion("AMT_ABJ_FREE >", value, "amtAbjFree");
            return (Criteria) this;
        }

        public Criteria andAmtAbjFreeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_ABJ_FREE >=", value, "amtAbjFree");
            return (Criteria) this;
        }

        public Criteria andAmtAbjFreeLessThan(BigDecimal value) {
            addCriterion("AMT_ABJ_FREE <", value, "amtAbjFree");
            return (Criteria) this;
        }

        public Criteria andAmtAbjFreeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_ABJ_FREE <=", value, "amtAbjFree");
            return (Criteria) this;
        }

        public Criteria andAmtAbjFreeIn(List<BigDecimal> values) {
            addCriterion("AMT_ABJ_FREE in", values, "amtAbjFree");
            return (Criteria) this;
        }

        public Criteria andAmtAbjFreeNotIn(List<BigDecimal> values) {
            addCriterion("AMT_ABJ_FREE not in", values, "amtAbjFree");
            return (Criteria) this;
        }

        public Criteria andAmtAbjFreeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_ABJ_FREE between", value1, value2, "amtAbjFree");
            return (Criteria) this;
        }

        public Criteria andAmtAbjFreeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_ABJ_FREE not between", value1, value2, "amtAbjFree");
            return (Criteria) this;
        }

        public Criteria andAmtMjzCntIsNull() {
            addCriterion("AMT_MJZ_CNT is null");
            return (Criteria) this;
        }

        public Criteria andAmtMjzCntIsNotNull() {
            addCriterion("AMT_MJZ_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmtMjzCntEqualTo(BigDecimal value) {
            addCriterion("AMT_MJZ_CNT =", value, "amtMjzCnt");
            return (Criteria) this;
        }

        public Criteria andAmtMjzCntNotEqualTo(BigDecimal value) {
            addCriterion("AMT_MJZ_CNT <>", value, "amtMjzCnt");
            return (Criteria) this;
        }

        public Criteria andAmtMjzCntGreaterThan(BigDecimal value) {
            addCriterion("AMT_MJZ_CNT >", value, "amtMjzCnt");
            return (Criteria) this;
        }

        public Criteria andAmtMjzCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_MJZ_CNT >=", value, "amtMjzCnt");
            return (Criteria) this;
        }

        public Criteria andAmtMjzCntLessThan(BigDecimal value) {
            addCriterion("AMT_MJZ_CNT <", value, "amtMjzCnt");
            return (Criteria) this;
        }

        public Criteria andAmtMjzCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_MJZ_CNT <=", value, "amtMjzCnt");
            return (Criteria) this;
        }

        public Criteria andAmtMjzCntIn(List<BigDecimal> values) {
            addCriterion("AMT_MJZ_CNT in", values, "amtMjzCnt");
            return (Criteria) this;
        }

        public Criteria andAmtMjzCntNotIn(List<BigDecimal> values) {
            addCriterion("AMT_MJZ_CNT not in", values, "amtMjzCnt");
            return (Criteria) this;
        }

        public Criteria andAmtMjzCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_MJZ_CNT between", value1, value2, "amtMjzCnt");
            return (Criteria) this;
        }

        public Criteria andAmtMjzCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_MJZ_CNT not between", value1, value2, "amtMjzCnt");
            return (Criteria) this;
        }

        public Criteria andRgNoIsNull() {
            addCriterion("RG_NO is null");
            return (Criteria) this;
        }

        public Criteria andRgNoIsNotNull() {
            addCriterion("RG_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRgNoEqualTo(String value) {
            addCriterion("RG_NO =", value, "rgNo");
            return (Criteria) this;
        }

        public Criteria andRgNoNotEqualTo(String value) {
            addCriterion("RG_NO <>", value, "rgNo");
            return (Criteria) this;
        }

        public Criteria andRgNoGreaterThan(String value) {
            addCriterion("RG_NO >", value, "rgNo");
            return (Criteria) this;
        }

        public Criteria andRgNoGreaterThanOrEqualTo(String value) {
            addCriterion("RG_NO >=", value, "rgNo");
            return (Criteria) this;
        }

        public Criteria andRgNoLessThan(String value) {
            addCriterion("RG_NO <", value, "rgNo");
            return (Criteria) this;
        }

        public Criteria andRgNoLessThanOrEqualTo(String value) {
            addCriterion("RG_NO <=", value, "rgNo");
            return (Criteria) this;
        }

        public Criteria andRgNoLike(String value) {
            addCriterion("RG_NO like", value, "rgNo");
            return (Criteria) this;
        }

        public Criteria andRgNoNotLike(String value) {
            addCriterion("RG_NO not like", value, "rgNo");
            return (Criteria) this;
        }

        public Criteria andRgNoIn(List<String> values) {
            addCriterion("RG_NO in", values, "rgNo");
            return (Criteria) this;
        }

        public Criteria andRgNoNotIn(List<String> values) {
            addCriterion("RG_NO not in", values, "rgNo");
            return (Criteria) this;
        }

        public Criteria andRgNoBetween(String value1, String value2) {
            addCriterion("RG_NO between", value1, value2, "rgNo");
            return (Criteria) this;
        }

        public Criteria andRgNoNotBetween(String value1, String value2) {
            addCriterion("RG_NO not between", value1, value2, "rgNo");
            return (Criteria) this;
        }

        public Criteria andAmtnKdtcIsNull() {
            addCriterion("AMTN_KDTC is null");
            return (Criteria) this;
        }

        public Criteria andAmtnKdtcIsNotNull() {
            addCriterion("AMTN_KDTC is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnKdtcEqualTo(BigDecimal value) {
            addCriterion("AMTN_KDTC =", value, "amtnKdtc");
            return (Criteria) this;
        }

        public Criteria andAmtnKdtcNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_KDTC <>", value, "amtnKdtc");
            return (Criteria) this;
        }

        public Criteria andAmtnKdtcGreaterThan(BigDecimal value) {
            addCriterion("AMTN_KDTC >", value, "amtnKdtc");
            return (Criteria) this;
        }

        public Criteria andAmtnKdtcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_KDTC >=", value, "amtnKdtc");
            return (Criteria) this;
        }

        public Criteria andAmtnKdtcLessThan(BigDecimal value) {
            addCriterion("AMTN_KDTC <", value, "amtnKdtc");
            return (Criteria) this;
        }

        public Criteria andAmtnKdtcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_KDTC <=", value, "amtnKdtc");
            return (Criteria) this;
        }

        public Criteria andAmtnKdtcIn(List<BigDecimal> values) {
            addCriterion("AMTN_KDTC in", values, "amtnKdtc");
            return (Criteria) this;
        }

        public Criteria andAmtnKdtcNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_KDTC not in", values, "amtnKdtc");
            return (Criteria) this;
        }

        public Criteria andAmtnKdtcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_KDTC between", value1, value2, "amtnKdtc");
            return (Criteria) this;
        }

        public Criteria andAmtnKdtcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_KDTC not between", value1, value2, "amtnKdtc");
            return (Criteria) this;
        }

        public Criteria andAmtnKdjtIsNull() {
            addCriterion("AMTN_KDJT is null");
            return (Criteria) this;
        }

        public Criteria andAmtnKdjtIsNotNull() {
            addCriterion("AMTN_KDJT is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnKdjtEqualTo(BigDecimal value) {
            addCriterion("AMTN_KDJT =", value, "amtnKdjt");
            return (Criteria) this;
        }

        public Criteria andAmtnKdjtNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_KDJT <>", value, "amtnKdjt");
            return (Criteria) this;
        }

        public Criteria andAmtnKdjtGreaterThan(BigDecimal value) {
            addCriterion("AMTN_KDJT >", value, "amtnKdjt");
            return (Criteria) this;
        }

        public Criteria andAmtnKdjtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_KDJT >=", value, "amtnKdjt");
            return (Criteria) this;
        }

        public Criteria andAmtnKdjtLessThan(BigDecimal value) {
            addCriterion("AMTN_KDJT <", value, "amtnKdjt");
            return (Criteria) this;
        }

        public Criteria andAmtnKdjtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_KDJT <=", value, "amtnKdjt");
            return (Criteria) this;
        }

        public Criteria andAmtnKdjtIn(List<BigDecimal> values) {
            addCriterion("AMTN_KDJT in", values, "amtnKdjt");
            return (Criteria) this;
        }

        public Criteria andAmtnKdjtNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_KDJT not in", values, "amtnKdjt");
            return (Criteria) this;
        }

        public Criteria andAmtnKdjtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_KDJT between", value1, value2, "amtnKdjt");
            return (Criteria) this;
        }

        public Criteria andAmtnKdjtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_KDJT not between", value1, value2, "amtnKdjt");
            return (Criteria) this;
        }

        public Criteria andHtNoIsNull() {
            addCriterion("HT_NO is null");
            return (Criteria) this;
        }

        public Criteria andHtNoIsNotNull() {
            addCriterion("HT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andHtNoEqualTo(String value) {
            addCriterion("HT_NO =", value, "htNo");
            return (Criteria) this;
        }

        public Criteria andHtNoNotEqualTo(String value) {
            addCriterion("HT_NO <>", value, "htNo");
            return (Criteria) this;
        }

        public Criteria andHtNoGreaterThan(String value) {
            addCriterion("HT_NO >", value, "htNo");
            return (Criteria) this;
        }

        public Criteria andHtNoGreaterThanOrEqualTo(String value) {
            addCriterion("HT_NO >=", value, "htNo");
            return (Criteria) this;
        }

        public Criteria andHtNoLessThan(String value) {
            addCriterion("HT_NO <", value, "htNo");
            return (Criteria) this;
        }

        public Criteria andHtNoLessThanOrEqualTo(String value) {
            addCriterion("HT_NO <=", value, "htNo");
            return (Criteria) this;
        }

        public Criteria andHtNoLike(String value) {
            addCriterion("HT_NO like", value, "htNo");
            return (Criteria) this;
        }

        public Criteria andHtNoNotLike(String value) {
            addCriterion("HT_NO not like", value, "htNo");
            return (Criteria) this;
        }

        public Criteria andHtNoIn(List<String> values) {
            addCriterion("HT_NO in", values, "htNo");
            return (Criteria) this;
        }

        public Criteria andHtNoNotIn(List<String> values) {
            addCriterion("HT_NO not in", values, "htNo");
            return (Criteria) this;
        }

        public Criteria andHtNoBetween(String value1, String value2) {
            addCriterion("HT_NO between", value1, value2, "htNo");
            return (Criteria) this;
        }

        public Criteria andHtNoNotBetween(String value1, String value2) {
            addCriterion("HT_NO not between", value1, value2, "htNo");
            return (Criteria) this;
        }

        public Criteria andXyNoIsNull() {
            addCriterion("XY_NO is null");
            return (Criteria) this;
        }

        public Criteria andXyNoIsNotNull() {
            addCriterion("XY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andXyNoEqualTo(String value) {
            addCriterion("XY_NO =", value, "xyNo");
            return (Criteria) this;
        }

        public Criteria andXyNoNotEqualTo(String value) {
            addCriterion("XY_NO <>", value, "xyNo");
            return (Criteria) this;
        }

        public Criteria andXyNoGreaterThan(String value) {
            addCriterion("XY_NO >", value, "xyNo");
            return (Criteria) this;
        }

        public Criteria andXyNoGreaterThanOrEqualTo(String value) {
            addCriterion("XY_NO >=", value, "xyNo");
            return (Criteria) this;
        }

        public Criteria andXyNoLessThan(String value) {
            addCriterion("XY_NO <", value, "xyNo");
            return (Criteria) this;
        }

        public Criteria andXyNoLessThanOrEqualTo(String value) {
            addCriterion("XY_NO <=", value, "xyNo");
            return (Criteria) this;
        }

        public Criteria andXyNoLike(String value) {
            addCriterion("XY_NO like", value, "xyNo");
            return (Criteria) this;
        }

        public Criteria andXyNoNotLike(String value) {
            addCriterion("XY_NO not like", value, "xyNo");
            return (Criteria) this;
        }

        public Criteria andXyNoIn(List<String> values) {
            addCriterion("XY_NO in", values, "xyNo");
            return (Criteria) this;
        }

        public Criteria andXyNoNotIn(List<String> values) {
            addCriterion("XY_NO not in", values, "xyNo");
            return (Criteria) this;
        }

        public Criteria andXyNoBetween(String value1, String value2) {
            addCriterion("XY_NO between", value1, value2, "xyNo");
            return (Criteria) this;
        }

        public Criteria andXyNoNotBetween(String value1, String value2) {
            addCriterion("XY_NO not between", value1, value2, "xyNo");
            return (Criteria) this;
        }

        public Criteria andAmtnHqIsNull() {
            addCriterion("AMTN_HQ is null");
            return (Criteria) this;
        }

        public Criteria andAmtnHqIsNotNull() {
            addCriterion("AMTN_HQ is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnHqEqualTo(BigDecimal value) {
            addCriterion("AMTN_HQ =", value, "amtnHq");
            return (Criteria) this;
        }

        public Criteria andAmtnHqNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_HQ <>", value, "amtnHq");
            return (Criteria) this;
        }

        public Criteria andAmtnHqGreaterThan(BigDecimal value) {
            addCriterion("AMTN_HQ >", value, "amtnHq");
            return (Criteria) this;
        }

        public Criteria andAmtnHqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_HQ >=", value, "amtnHq");
            return (Criteria) this;
        }

        public Criteria andAmtnHqLessThan(BigDecimal value) {
            addCriterion("AMTN_HQ <", value, "amtnHq");
            return (Criteria) this;
        }

        public Criteria andAmtnHqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_HQ <=", value, "amtnHq");
            return (Criteria) this;
        }

        public Criteria andAmtnHqIn(List<BigDecimal> values) {
            addCriterion("AMTN_HQ in", values, "amtnHq");
            return (Criteria) this;
        }

        public Criteria andAmtnHqNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_HQ not in", values, "amtnHq");
            return (Criteria) this;
        }

        public Criteria andAmtnHqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_HQ between", value1, value2, "amtnHq");
            return (Criteria) this;
        }

        public Criteria andAmtnHqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_HQ not between", value1, value2, "amtnHq");
            return (Criteria) this;
        }

        public Criteria andAmtnBhqIsNull() {
            addCriterion("AMTN_BHQ is null");
            return (Criteria) this;
        }

        public Criteria andAmtnBhqIsNotNull() {
            addCriterion("AMTN_BHQ is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnBhqEqualTo(BigDecimal value) {
            addCriterion("AMTN_BHQ =", value, "amtnBhq");
            return (Criteria) this;
        }

        public Criteria andAmtnBhqNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_BHQ <>", value, "amtnBhq");
            return (Criteria) this;
        }

        public Criteria andAmtnBhqGreaterThan(BigDecimal value) {
            addCriterion("AMTN_BHQ >", value, "amtnBhq");
            return (Criteria) this;
        }

        public Criteria andAmtnBhqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_BHQ >=", value, "amtnBhq");
            return (Criteria) this;
        }

        public Criteria andAmtnBhqLessThan(BigDecimal value) {
            addCriterion("AMTN_BHQ <", value, "amtnBhq");
            return (Criteria) this;
        }

        public Criteria andAmtnBhqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_BHQ <=", value, "amtnBhq");
            return (Criteria) this;
        }

        public Criteria andAmtnBhqIn(List<BigDecimal> values) {
            addCriterion("AMTN_BHQ in", values, "amtnBhq");
            return (Criteria) this;
        }

        public Criteria andAmtnBhqNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_BHQ not in", values, "amtnBhq");
            return (Criteria) this;
        }

        public Criteria andAmtnBhqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_BHQ between", value1, value2, "amtnBhq");
            return (Criteria) this;
        }

        public Criteria andAmtnBhqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_BHQ not between", value1, value2, "amtnBhq");
            return (Criteria) this;
        }

        public Criteria andAmtnSqIsNull() {
            addCriterion("AMTN_SQ is null");
            return (Criteria) this;
        }

        public Criteria andAmtnSqIsNotNull() {
            addCriterion("AMTN_SQ is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnSqEqualTo(BigDecimal value) {
            addCriterion("AMTN_SQ =", value, "amtnSq");
            return (Criteria) this;
        }

        public Criteria andAmtnSqNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_SQ <>", value, "amtnSq");
            return (Criteria) this;
        }

        public Criteria andAmtnSqGreaterThan(BigDecimal value) {
            addCriterion("AMTN_SQ >", value, "amtnSq");
            return (Criteria) this;
        }

        public Criteria andAmtnSqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_SQ >=", value, "amtnSq");
            return (Criteria) this;
        }

        public Criteria andAmtnSqLessThan(BigDecimal value) {
            addCriterion("AMTN_SQ <", value, "amtnSq");
            return (Criteria) this;
        }

        public Criteria andAmtnSqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_SQ <=", value, "amtnSq");
            return (Criteria) this;
        }

        public Criteria andAmtnSqIn(List<BigDecimal> values) {
            addCriterion("AMTN_SQ in", values, "amtnSq");
            return (Criteria) this;
        }

        public Criteria andAmtnSqNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_SQ not in", values, "amtnSq");
            return (Criteria) this;
        }

        public Criteria andAmtnSqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_SQ between", value1, value2, "amtnSq");
            return (Criteria) this;
        }

        public Criteria andAmtnSqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_SQ not between", value1, value2, "amtnSq");
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

        public Criteria andAmtnDsyIsNull() {
            addCriterion("AMTN_DSY is null");
            return (Criteria) this;
        }

        public Criteria andAmtnDsyIsNotNull() {
            addCriterion("AMTN_DSY is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnDsyEqualTo(BigDecimal value) {
            addCriterion("AMTN_DSY =", value, "amtnDsy");
            return (Criteria) this;
        }

        public Criteria andAmtnDsyNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_DSY <>", value, "amtnDsy");
            return (Criteria) this;
        }

        public Criteria andAmtnDsyGreaterThan(BigDecimal value) {
            addCriterion("AMTN_DSY >", value, "amtnDsy");
            return (Criteria) this;
        }

        public Criteria andAmtnDsyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_DSY >=", value, "amtnDsy");
            return (Criteria) this;
        }

        public Criteria andAmtnDsyLessThan(BigDecimal value) {
            addCriterion("AMTN_DSY <", value, "amtnDsy");
            return (Criteria) this;
        }

        public Criteria andAmtnDsyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_DSY <=", value, "amtnDsy");
            return (Criteria) this;
        }

        public Criteria andAmtnDsyIn(List<BigDecimal> values) {
            addCriterion("AMTN_DSY in", values, "amtnDsy");
            return (Criteria) this;
        }

        public Criteria andAmtnDsyNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_DSY not in", values, "amtnDsy");
            return (Criteria) this;
        }

        public Criteria andAmtnDsyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_DSY between", value1, value2, "amtnDsy");
            return (Criteria) this;
        }

        public Criteria andAmtnDsyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_DSY not between", value1, value2, "amtnDsy");
            return (Criteria) this;
        }

        public Criteria andAmtnXykdIsNull() {
            addCriterion("AMTN_XYKD is null");
            return (Criteria) this;
        }

        public Criteria andAmtnXykdIsNotNull() {
            addCriterion("AMTN_XYKD is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnXykdEqualTo(BigDecimal value) {
            addCriterion("AMTN_XYKD =", value, "amtnXykd");
            return (Criteria) this;
        }

        public Criteria andAmtnXykdNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_XYKD <>", value, "amtnXykd");
            return (Criteria) this;
        }

        public Criteria andAmtnXykdGreaterThan(BigDecimal value) {
            addCriterion("AMTN_XYKD >", value, "amtnXykd");
            return (Criteria) this;
        }

        public Criteria andAmtnXykdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_XYKD >=", value, "amtnXykd");
            return (Criteria) this;
        }

        public Criteria andAmtnXykdLessThan(BigDecimal value) {
            addCriterion("AMTN_XYKD <", value, "amtnXykd");
            return (Criteria) this;
        }

        public Criteria andAmtnXykdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_XYKD <=", value, "amtnXykd");
            return (Criteria) this;
        }

        public Criteria andAmtnXykdIn(List<BigDecimal> values) {
            addCriterion("AMTN_XYKD in", values, "amtnXykd");
            return (Criteria) this;
        }

        public Criteria andAmtnXykdNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_XYKD not in", values, "amtnXykd");
            return (Criteria) this;
        }

        public Criteria andAmtnXykdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_XYKD between", value1, value2, "amtnXykd");
            return (Criteria) this;
        }

        public Criteria andAmtnXykdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_XYKD not between", value1, value2, "amtnXykd");
            return (Criteria) this;
        }

        public Criteria andAmtnBdkdIsNull() {
            addCriterion("AMTN_BDKD is null");
            return (Criteria) this;
        }

        public Criteria andAmtnBdkdIsNotNull() {
            addCriterion("AMTN_BDKD is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnBdkdEqualTo(BigDecimal value) {
            addCriterion("AMTN_BDKD =", value, "amtnBdkd");
            return (Criteria) this;
        }

        public Criteria andAmtnBdkdNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_BDKD <>", value, "amtnBdkd");
            return (Criteria) this;
        }

        public Criteria andAmtnBdkdGreaterThan(BigDecimal value) {
            addCriterion("AMTN_BDKD >", value, "amtnBdkd");
            return (Criteria) this;
        }

        public Criteria andAmtnBdkdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_BDKD >=", value, "amtnBdkd");
            return (Criteria) this;
        }

        public Criteria andAmtnBdkdLessThan(BigDecimal value) {
            addCriterion("AMTN_BDKD <", value, "amtnBdkd");
            return (Criteria) this;
        }

        public Criteria andAmtnBdkdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_BDKD <=", value, "amtnBdkd");
            return (Criteria) this;
        }

        public Criteria andAmtnBdkdIn(List<BigDecimal> values) {
            addCriterion("AMTN_BDKD in", values, "amtnBdkd");
            return (Criteria) this;
        }

        public Criteria andAmtnBdkdNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_BDKD not in", values, "amtnBdkd");
            return (Criteria) this;
        }

        public Criteria andAmtnBdkdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_BDKD between", value1, value2, "amtnBdkd");
            return (Criteria) this;
        }

        public Criteria andAmtnBdkdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_BDKD not between", value1, value2, "amtnBdkd");
            return (Criteria) this;
        }

        public Criteria andAmtnPkfyIsNull() {
            addCriterion("AMTN_PKFY is null");
            return (Criteria) this;
        }

        public Criteria andAmtnPkfyIsNotNull() {
            addCriterion("AMTN_PKFY is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnPkfyEqualTo(BigDecimal value) {
            addCriterion("AMTN_PKFY =", value, "amtnPkfy");
            return (Criteria) this;
        }

        public Criteria andAmtnPkfyNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_PKFY <>", value, "amtnPkfy");
            return (Criteria) this;
        }

        public Criteria andAmtnPkfyGreaterThan(BigDecimal value) {
            addCriterion("AMTN_PKFY >", value, "amtnPkfy");
            return (Criteria) this;
        }

        public Criteria andAmtnPkfyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_PKFY >=", value, "amtnPkfy");
            return (Criteria) this;
        }

        public Criteria andAmtnPkfyLessThan(BigDecimal value) {
            addCriterion("AMTN_PKFY <", value, "amtnPkfy");
            return (Criteria) this;
        }

        public Criteria andAmtnPkfyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_PKFY <=", value, "amtnPkfy");
            return (Criteria) this;
        }

        public Criteria andAmtnPkfyIn(List<BigDecimal> values) {
            addCriterion("AMTN_PKFY in", values, "amtnPkfy");
            return (Criteria) this;
        }

        public Criteria andAmtnPkfyNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_PKFY not in", values, "amtnPkfy");
            return (Criteria) this;
        }

        public Criteria andAmtnPkfyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_PKFY between", value1, value2, "amtnPkfy");
            return (Criteria) this;
        }

        public Criteria andAmtnPkfyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_PKFY not between", value1, value2, "amtnPkfy");
            return (Criteria) this;
        }

        public Criteria andJtNoIsNull() {
            addCriterion("JT_NO is null");
            return (Criteria) this;
        }

        public Criteria andJtNoIsNotNull() {
            addCriterion("JT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andJtNoEqualTo(String value) {
            addCriterion("JT_NO =", value, "jtNo");
            return (Criteria) this;
        }

        public Criteria andJtNoNotEqualTo(String value) {
            addCriterion("JT_NO <>", value, "jtNo");
            return (Criteria) this;
        }

        public Criteria andJtNoGreaterThan(String value) {
            addCriterion("JT_NO >", value, "jtNo");
            return (Criteria) this;
        }

        public Criteria andJtNoGreaterThanOrEqualTo(String value) {
            addCriterion("JT_NO >=", value, "jtNo");
            return (Criteria) this;
        }

        public Criteria andJtNoLessThan(String value) {
            addCriterion("JT_NO <", value, "jtNo");
            return (Criteria) this;
        }

        public Criteria andJtNoLessThanOrEqualTo(String value) {
            addCriterion("JT_NO <=", value, "jtNo");
            return (Criteria) this;
        }

        public Criteria andJtNoLike(String value) {
            addCriterion("JT_NO like", value, "jtNo");
            return (Criteria) this;
        }

        public Criteria andJtNoNotLike(String value) {
            addCriterion("JT_NO not like", value, "jtNo");
            return (Criteria) this;
        }

        public Criteria andJtNoIn(List<String> values) {
            addCriterion("JT_NO in", values, "jtNo");
            return (Criteria) this;
        }

        public Criteria andJtNoNotIn(List<String> values) {
            addCriterion("JT_NO not in", values, "jtNo");
            return (Criteria) this;
        }

        public Criteria andJtNoBetween(String value1, String value2) {
            addCriterion("JT_NO between", value1, value2, "jtNo");
            return (Criteria) this;
        }

        public Criteria andJtNoNotBetween(String value1, String value2) {
            addCriterion("JT_NO not between", value1, value2, "jtNo");
            return (Criteria) this;
        }

        public Criteria andScTypeIdIsNull() {
            addCriterion("SC_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andScTypeIdIsNotNull() {
            addCriterion("SC_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andScTypeIdEqualTo(String value) {
            addCriterion("SC_TYPE_ID =", value, "scTypeId");
            return (Criteria) this;
        }

        public Criteria andScTypeIdNotEqualTo(String value) {
            addCriterion("SC_TYPE_ID <>", value, "scTypeId");
            return (Criteria) this;
        }

        public Criteria andScTypeIdGreaterThan(String value) {
            addCriterion("SC_TYPE_ID >", value, "scTypeId");
            return (Criteria) this;
        }

        public Criteria andScTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("SC_TYPE_ID >=", value, "scTypeId");
            return (Criteria) this;
        }

        public Criteria andScTypeIdLessThan(String value) {
            addCriterion("SC_TYPE_ID <", value, "scTypeId");
            return (Criteria) this;
        }

        public Criteria andScTypeIdLessThanOrEqualTo(String value) {
            addCriterion("SC_TYPE_ID <=", value, "scTypeId");
            return (Criteria) this;
        }

        public Criteria andScTypeIdLike(String value) {
            addCriterion("SC_TYPE_ID like", value, "scTypeId");
            return (Criteria) this;
        }

        public Criteria andScTypeIdNotLike(String value) {
            addCriterion("SC_TYPE_ID not like", value, "scTypeId");
            return (Criteria) this;
        }

        public Criteria andScTypeIdIn(List<String> values) {
            addCriterion("SC_TYPE_ID in", values, "scTypeId");
            return (Criteria) this;
        }

        public Criteria andScTypeIdNotIn(List<String> values) {
            addCriterion("SC_TYPE_ID not in", values, "scTypeId");
            return (Criteria) this;
        }

        public Criteria andScTypeIdBetween(String value1, String value2) {
            addCriterion("SC_TYPE_ID between", value1, value2, "scTypeId");
            return (Criteria) this;
        }

        public Criteria andScTypeIdNotBetween(String value1, String value2) {
            addCriterion("SC_TYPE_ID not between", value1, value2, "scTypeId");
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

        public Criteria andHdCfmItmIsNull() {
            addCriterion("HD_CFM_ITM is null");
            return (Criteria) this;
        }

        public Criteria andHdCfmItmIsNotNull() {
            addCriterion("HD_CFM_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andHdCfmItmEqualTo(Integer value) {
            addCriterion("HD_CFM_ITM =", value, "hdCfmItm");
            return (Criteria) this;
        }

        public Criteria andHdCfmItmNotEqualTo(Integer value) {
            addCriterion("HD_CFM_ITM <>", value, "hdCfmItm");
            return (Criteria) this;
        }

        public Criteria andHdCfmItmGreaterThan(Integer value) {
            addCriterion("HD_CFM_ITM >", value, "hdCfmItm");
            return (Criteria) this;
        }

        public Criteria andHdCfmItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("HD_CFM_ITM >=", value, "hdCfmItm");
            return (Criteria) this;
        }

        public Criteria andHdCfmItmLessThan(Integer value) {
            addCriterion("HD_CFM_ITM <", value, "hdCfmItm");
            return (Criteria) this;
        }

        public Criteria andHdCfmItmLessThanOrEqualTo(Integer value) {
            addCriterion("HD_CFM_ITM <=", value, "hdCfmItm");
            return (Criteria) this;
        }

        public Criteria andHdCfmItmIn(List<Integer> values) {
            addCriterion("HD_CFM_ITM in", values, "hdCfmItm");
            return (Criteria) this;
        }

        public Criteria andHdCfmItmNotIn(List<Integer> values) {
            addCriterion("HD_CFM_ITM not in", values, "hdCfmItm");
            return (Criteria) this;
        }

        public Criteria andHdCfmItmBetween(Integer value1, Integer value2) {
            addCriterion("HD_CFM_ITM between", value1, value2, "hdCfmItm");
            return (Criteria) this;
        }

        public Criteria andHdCfmItmNotBetween(Integer value1, Integer value2) {
            addCriterion("HD_CFM_ITM not between", value1, value2, "hdCfmItm");
            return (Criteria) this;
        }

        public Criteria andDclItmIsNull() {
            addCriterion("DCL_ITM is null");
            return (Criteria) this;
        }

        public Criteria andDclItmIsNotNull() {
            addCriterion("DCL_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andDclItmEqualTo(Integer value) {
            addCriterion("DCL_ITM =", value, "dclItm");
            return (Criteria) this;
        }

        public Criteria andDclItmNotEqualTo(Integer value) {
            addCriterion("DCL_ITM <>", value, "dclItm");
            return (Criteria) this;
        }

        public Criteria andDclItmGreaterThan(Integer value) {
            addCriterion("DCL_ITM >", value, "dclItm");
            return (Criteria) this;
        }

        public Criteria andDclItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("DCL_ITM >=", value, "dclItm");
            return (Criteria) this;
        }

        public Criteria andDclItmLessThan(Integer value) {
            addCriterion("DCL_ITM <", value, "dclItm");
            return (Criteria) this;
        }

        public Criteria andDclItmLessThanOrEqualTo(Integer value) {
            addCriterion("DCL_ITM <=", value, "dclItm");
            return (Criteria) this;
        }

        public Criteria andDclItmIn(List<Integer> values) {
            addCriterion("DCL_ITM in", values, "dclItm");
            return (Criteria) this;
        }

        public Criteria andDclItmNotIn(List<Integer> values) {
            addCriterion("DCL_ITM not in", values, "dclItm");
            return (Criteria) this;
        }

        public Criteria andDclItmBetween(Integer value1, Integer value2) {
            addCriterion("DCL_ITM between", value1, value2, "dclItm");
            return (Criteria) this;
        }

        public Criteria andDclItmNotBetween(Integer value1, Integer value2) {
            addCriterion("DCL_ITM not between", value1, value2, "dclItm");
            return (Criteria) this;
        }

        public Criteria andImportNoIsNull() {
            addCriterion("IMPORT_NO is null");
            return (Criteria) this;
        }

        public Criteria andImportNoIsNotNull() {
            addCriterion("IMPORT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andImportNoEqualTo(String value) {
            addCriterion("IMPORT_NO =", value, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoNotEqualTo(String value) {
            addCriterion("IMPORT_NO <>", value, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoGreaterThan(String value) {
            addCriterion("IMPORT_NO >", value, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORT_NO >=", value, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoLessThan(String value) {
            addCriterion("IMPORT_NO <", value, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoLessThanOrEqualTo(String value) {
            addCriterion("IMPORT_NO <=", value, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoLike(String value) {
            addCriterion("IMPORT_NO like", value, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoNotLike(String value) {
            addCriterion("IMPORT_NO not like", value, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoIn(List<String> values) {
            addCriterion("IMPORT_NO in", values, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoNotIn(List<String> values) {
            addCriterion("IMPORT_NO not in", values, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoBetween(String value1, String value2) {
            addCriterion("IMPORT_NO between", value1, value2, "importNo");
            return (Criteria) this;
        }

        public Criteria andImportNoNotBetween(String value1, String value2) {
            addCriterion("IMPORT_NO not between", value1, value2, "importNo");
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