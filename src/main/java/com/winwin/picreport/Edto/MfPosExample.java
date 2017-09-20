package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MfPosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MfPosExample() {
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

        public Criteria andVohIdIsNull() {
            addCriterion("VOH_ID is null");
            return (Criteria) this;
        }

        public Criteria andVohIdIsNotNull() {
            addCriterion("VOH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVohIdEqualTo(String value) {
            addCriterion("VOH_ID =", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdNotEqualTo(String value) {
            addCriterion("VOH_ID <>", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdGreaterThan(String value) {
            addCriterion("VOH_ID >", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdGreaterThanOrEqualTo(String value) {
            addCriterion("VOH_ID >=", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdLessThan(String value) {
            addCriterion("VOH_ID <", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdLessThanOrEqualTo(String value) {
            addCriterion("VOH_ID <=", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdLike(String value) {
            addCriterion("VOH_ID like", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdNotLike(String value) {
            addCriterion("VOH_ID not like", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdIn(List<String> values) {
            addCriterion("VOH_ID in", values, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdNotIn(List<String> values) {
            addCriterion("VOH_ID not in", values, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdBetween(String value1, String value2) {
            addCriterion("VOH_ID between", value1, value2, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdNotBetween(String value1, String value2) {
            addCriterion("VOH_ID not between", value1, value2, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohNoIsNull() {
            addCriterion("VOH_NO is null");
            return (Criteria) this;
        }

        public Criteria andVohNoIsNotNull() {
            addCriterion("VOH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVohNoEqualTo(String value) {
            addCriterion("VOH_NO =", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoNotEqualTo(String value) {
            addCriterion("VOH_NO <>", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoGreaterThan(String value) {
            addCriterion("VOH_NO >", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoGreaterThanOrEqualTo(String value) {
            addCriterion("VOH_NO >=", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoLessThan(String value) {
            addCriterion("VOH_NO <", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoLessThanOrEqualTo(String value) {
            addCriterion("VOH_NO <=", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoLike(String value) {
            addCriterion("VOH_NO like", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoNotLike(String value) {
            addCriterion("VOH_NO not like", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoIn(List<String> values) {
            addCriterion("VOH_NO in", values, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoNotIn(List<String> values) {
            addCriterion("VOH_NO not in", values, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoBetween(String value1, String value2) {
            addCriterion("VOH_NO between", value1, value2, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoNotBetween(String value1, String value2) {
            addCriterion("VOH_NO not between", value1, value2, "vohNo");
            return (Criteria) this;
        }

        public Criteria andTradMthIsNull() {
            addCriterion("TRAD_MTH is null");
            return (Criteria) this;
        }

        public Criteria andTradMthIsNotNull() {
            addCriterion("TRAD_MTH is not null");
            return (Criteria) this;
        }

        public Criteria andTradMthEqualTo(String value) {
            addCriterion("TRAD_MTH =", value, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthNotEqualTo(String value) {
            addCriterion("TRAD_MTH <>", value, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthGreaterThan(String value) {
            addCriterion("TRAD_MTH >", value, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthGreaterThanOrEqualTo(String value) {
            addCriterion("TRAD_MTH >=", value, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthLessThan(String value) {
            addCriterion("TRAD_MTH <", value, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthLessThanOrEqualTo(String value) {
            addCriterion("TRAD_MTH <=", value, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthLike(String value) {
            addCriterion("TRAD_MTH like", value, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthNotLike(String value) {
            addCriterion("TRAD_MTH not like", value, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthIn(List<String> values) {
            addCriterion("TRAD_MTH in", values, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthNotIn(List<String> values) {
            addCriterion("TRAD_MTH not in", values, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthBetween(String value1, String value2) {
            addCriterion("TRAD_MTH between", value1, value2, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthNotBetween(String value1, String value2) {
            addCriterion("TRAD_MTH not between", value1, value2, "tradMth");
            return (Criteria) this;
        }

        public Criteria andPayMthIsNull() {
            addCriterion("PAY_MTH is null");
            return (Criteria) this;
        }

        public Criteria andPayMthIsNotNull() {
            addCriterion("PAY_MTH is not null");
            return (Criteria) this;
        }

        public Criteria andPayMthEqualTo(String value) {
            addCriterion("PAY_MTH =", value, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthNotEqualTo(String value) {
            addCriterion("PAY_MTH <>", value, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthGreaterThan(String value) {
            addCriterion("PAY_MTH >", value, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_MTH >=", value, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthLessThan(String value) {
            addCriterion("PAY_MTH <", value, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthLessThanOrEqualTo(String value) {
            addCriterion("PAY_MTH <=", value, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthLike(String value) {
            addCriterion("PAY_MTH like", value, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthNotLike(String value) {
            addCriterion("PAY_MTH not like", value, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthIn(List<String> values) {
            addCriterion("PAY_MTH in", values, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthNotIn(List<String> values) {
            addCriterion("PAY_MTH not in", values, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthBetween(String value1, String value2) {
            addCriterion("PAY_MTH between", value1, value2, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthNotBetween(String value1, String value2) {
            addCriterion("PAY_MTH not between", value1, value2, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayDaysIsNull() {
            addCriterion("PAY_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andPayDaysIsNotNull() {
            addCriterion("PAY_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andPayDaysEqualTo(Short value) {
            addCriterion("PAY_DAYS =", value, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysNotEqualTo(Short value) {
            addCriterion("PAY_DAYS <>", value, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysGreaterThan(Short value) {
            addCriterion("PAY_DAYS >", value, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("PAY_DAYS >=", value, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysLessThan(Short value) {
            addCriterion("PAY_DAYS <", value, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysLessThanOrEqualTo(Short value) {
            addCriterion("PAY_DAYS <=", value, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysIn(List<Short> values) {
            addCriterion("PAY_DAYS in", values, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysNotIn(List<Short> values) {
            addCriterion("PAY_DAYS not in", values, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysBetween(Short value1, Short value2) {
            addCriterion("PAY_DAYS between", value1, value2, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysNotBetween(Short value1, Short value2) {
            addCriterion("PAY_DAYS not between", value1, value2, "payDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysIsNull() {
            addCriterion("CHK_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andChkDaysIsNotNull() {
            addCriterion("CHK_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andChkDaysEqualTo(Short value) {
            addCriterion("CHK_DAYS =", value, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysNotEqualTo(Short value) {
            addCriterion("CHK_DAYS <>", value, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysGreaterThan(Short value) {
            addCriterion("CHK_DAYS >", value, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("CHK_DAYS >=", value, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysLessThan(Short value) {
            addCriterion("CHK_DAYS <", value, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysLessThanOrEqualTo(Short value) {
            addCriterion("CHK_DAYS <=", value, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysIn(List<Short> values) {
            addCriterion("CHK_DAYS in", values, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysNotIn(List<Short> values) {
            addCriterion("CHK_DAYS not in", values, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysBetween(Short value1, Short value2) {
            addCriterion("CHK_DAYS between", value1, value2, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysNotBetween(Short value1, Short value2) {
            addCriterion("CHK_DAYS not between", value1, value2, "chkDays");
            return (Criteria) this;
        }

        public Criteria andPayRemIsNull() {
            addCriterion("PAY_REM is null");
            return (Criteria) this;
        }

        public Criteria andPayRemIsNotNull() {
            addCriterion("PAY_REM is not null");
            return (Criteria) this;
        }

        public Criteria andPayRemEqualTo(String value) {
            addCriterion("PAY_REM =", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemNotEqualTo(String value) {
            addCriterion("PAY_REM <>", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemGreaterThan(String value) {
            addCriterion("PAY_REM >", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_REM >=", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemLessThan(String value) {
            addCriterion("PAY_REM <", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemLessThanOrEqualTo(String value) {
            addCriterion("PAY_REM <=", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemLike(String value) {
            addCriterion("PAY_REM like", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemNotLike(String value) {
            addCriterion("PAY_REM not like", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemIn(List<String> values) {
            addCriterion("PAY_REM in", values, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemNotIn(List<String> values) {
            addCriterion("PAY_REM not in", values, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemBetween(String value1, String value2) {
            addCriterion("PAY_REM between", value1, value2, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemNotBetween(String value1, String value2) {
            addCriterion("PAY_REM not between", value1, value2, "payRem");
            return (Criteria) this;
        }

        public Criteria andSendMthIsNull() {
            addCriterion("SEND_MTH is null");
            return (Criteria) this;
        }

        public Criteria andSendMthIsNotNull() {
            addCriterion("SEND_MTH is not null");
            return (Criteria) this;
        }

        public Criteria andSendMthEqualTo(String value) {
            addCriterion("SEND_MTH =", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthNotEqualTo(String value) {
            addCriterion("SEND_MTH <>", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthGreaterThan(String value) {
            addCriterion("SEND_MTH >", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_MTH >=", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthLessThan(String value) {
            addCriterion("SEND_MTH <", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthLessThanOrEqualTo(String value) {
            addCriterion("SEND_MTH <=", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthLike(String value) {
            addCriterion("SEND_MTH like", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthNotLike(String value) {
            addCriterion("SEND_MTH not like", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthIn(List<String> values) {
            addCriterion("SEND_MTH in", values, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthNotIn(List<String> values) {
            addCriterion("SEND_MTH not in", values, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthBetween(String value1, String value2) {
            addCriterion("SEND_MTH between", value1, value2, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthNotBetween(String value1, String value2) {
            addCriterion("SEND_MTH not between", value1, value2, "sendMth");
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

        public Criteria andUseDepIsNull() {
            addCriterion("USE_DEP is null");
            return (Criteria) this;
        }

        public Criteria andUseDepIsNotNull() {
            addCriterion("USE_DEP is not null");
            return (Criteria) this;
        }

        public Criteria andUseDepEqualTo(String value) {
            addCriterion("USE_DEP =", value, "useDep");
            return (Criteria) this;
        }

        public Criteria andUseDepNotEqualTo(String value) {
            addCriterion("USE_DEP <>", value, "useDep");
            return (Criteria) this;
        }

        public Criteria andUseDepGreaterThan(String value) {
            addCriterion("USE_DEP >", value, "useDep");
            return (Criteria) this;
        }

        public Criteria andUseDepGreaterThanOrEqualTo(String value) {
            addCriterion("USE_DEP >=", value, "useDep");
            return (Criteria) this;
        }

        public Criteria andUseDepLessThan(String value) {
            addCriterion("USE_DEP <", value, "useDep");
            return (Criteria) this;
        }

        public Criteria andUseDepLessThanOrEqualTo(String value) {
            addCriterion("USE_DEP <=", value, "useDep");
            return (Criteria) this;
        }

        public Criteria andUseDepLike(String value) {
            addCriterion("USE_DEP like", value, "useDep");
            return (Criteria) this;
        }

        public Criteria andUseDepNotLike(String value) {
            addCriterion("USE_DEP not like", value, "useDep");
            return (Criteria) this;
        }

        public Criteria andUseDepIn(List<String> values) {
            addCriterion("USE_DEP in", values, "useDep");
            return (Criteria) this;
        }

        public Criteria andUseDepNotIn(List<String> values) {
            addCriterion("USE_DEP not in", values, "useDep");
            return (Criteria) this;
        }

        public Criteria andUseDepBetween(String value1, String value2) {
            addCriterion("USE_DEP between", value1, value2, "useDep");
            return (Criteria) this;
        }

        public Criteria andUseDepNotBetween(String value1, String value2) {
            addCriterion("USE_DEP not between", value1, value2, "useDep");
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

        public Criteria andExcRtoIsNull() {
            addCriterion("EXC_RTO is null");
            return (Criteria) this;
        }

        public Criteria andExcRtoIsNotNull() {
            addCriterion("EXC_RTO is not null");
            return (Criteria) this;
        }

        public Criteria andExcRtoEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO =", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoNotEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO <>", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoGreaterThan(BigDecimal value) {
            addCriterion("EXC_RTO >", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO >=", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoLessThan(BigDecimal value) {
            addCriterion("EXC_RTO <", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO <=", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO in", values, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoNotIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO not in", values, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO between", value1, value2, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO not between", value1, value2, "excRto");
            return (Criteria) this;
        }

        public Criteria andAmtnIntIsNull() {
            addCriterion("AMTN_INT is null");
            return (Criteria) this;
        }

        public Criteria andAmtnIntIsNotNull() {
            addCriterion("AMTN_INT is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnIntEqualTo(BigDecimal value) {
            addCriterion("AMTN_INT =", value, "amtnInt");
            return (Criteria) this;
        }

        public Criteria andAmtnIntNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_INT <>", value, "amtnInt");
            return (Criteria) this;
        }

        public Criteria andAmtnIntGreaterThan(BigDecimal value) {
            addCriterion("AMTN_INT >", value, "amtnInt");
            return (Criteria) this;
        }

        public Criteria andAmtnIntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_INT >=", value, "amtnInt");
            return (Criteria) this;
        }

        public Criteria andAmtnIntLessThan(BigDecimal value) {
            addCriterion("AMTN_INT <", value, "amtnInt");
            return (Criteria) this;
        }

        public Criteria andAmtnIntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_INT <=", value, "amtnInt");
            return (Criteria) this;
        }

        public Criteria andAmtnIntIn(List<BigDecimal> values) {
            addCriterion("AMTN_INT in", values, "amtnInt");
            return (Criteria) this;
        }

        public Criteria andAmtnIntNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_INT not in", values, "amtnInt");
            return (Criteria) this;
        }

        public Criteria andAmtnIntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_INT between", value1, value2, "amtnInt");
            return (Criteria) this;
        }

        public Criteria andAmtnIntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_INT not between", value1, value2, "amtnInt");
            return (Criteria) this;
        }

        public Criteria andAmtIntIsNull() {
            addCriterion("AMT_INT is null");
            return (Criteria) this;
        }

        public Criteria andAmtIntIsNotNull() {
            addCriterion("AMT_INT is not null");
            return (Criteria) this;
        }

        public Criteria andAmtIntEqualTo(BigDecimal value) {
            addCriterion("AMT_INT =", value, "amtInt");
            return (Criteria) this;
        }

        public Criteria andAmtIntNotEqualTo(BigDecimal value) {
            addCriterion("AMT_INT <>", value, "amtInt");
            return (Criteria) this;
        }

        public Criteria andAmtIntGreaterThan(BigDecimal value) {
            addCriterion("AMT_INT >", value, "amtInt");
            return (Criteria) this;
        }

        public Criteria andAmtIntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_INT >=", value, "amtInt");
            return (Criteria) this;
        }

        public Criteria andAmtIntLessThan(BigDecimal value) {
            addCriterion("AMT_INT <", value, "amtInt");
            return (Criteria) this;
        }

        public Criteria andAmtIntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_INT <=", value, "amtInt");
            return (Criteria) this;
        }

        public Criteria andAmtIntIn(List<BigDecimal> values) {
            addCriterion("AMT_INT in", values, "amtInt");
            return (Criteria) this;
        }

        public Criteria andAmtIntNotIn(List<BigDecimal> values) {
            addCriterion("AMT_INT not in", values, "amtInt");
            return (Criteria) this;
        }

        public Criteria andAmtIntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_INT between", value1, value2, "amtInt");
            return (Criteria) this;
        }

        public Criteria andAmtIntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_INT not between", value1, value2, "amtInt");
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

        public Criteria andBackIdIsNull() {
            addCriterion("BACK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBackIdIsNotNull() {
            addCriterion("BACK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBackIdEqualTo(String value) {
            addCriterion("BACK_ID =", value, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdNotEqualTo(String value) {
            addCriterion("BACK_ID <>", value, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdGreaterThan(String value) {
            addCriterion("BACK_ID >", value, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdGreaterThanOrEqualTo(String value) {
            addCriterion("BACK_ID >=", value, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdLessThan(String value) {
            addCriterion("BACK_ID <", value, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdLessThanOrEqualTo(String value) {
            addCriterion("BACK_ID <=", value, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdLike(String value) {
            addCriterion("BACK_ID like", value, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdNotLike(String value) {
            addCriterion("BACK_ID not like", value, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdIn(List<String> values) {
            addCriterion("BACK_ID in", values, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdNotIn(List<String> values) {
            addCriterion("BACK_ID not in", values, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdBetween(String value1, String value2) {
            addCriterion("BACK_ID between", value1, value2, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdNotBetween(String value1, String value2) {
            addCriterion("BACK_ID not between", value1, value2, "backId");
            return (Criteria) this;
        }

        public Criteria andHisPriceIsNull() {
            addCriterion("HIS_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andHisPriceIsNotNull() {
            addCriterion("HIS_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andHisPriceEqualTo(String value) {
            addCriterion("HIS_PRICE =", value, "hisPrice");
            return (Criteria) this;
        }

        public Criteria andHisPriceNotEqualTo(String value) {
            addCriterion("HIS_PRICE <>", value, "hisPrice");
            return (Criteria) this;
        }

        public Criteria andHisPriceGreaterThan(String value) {
            addCriterion("HIS_PRICE >", value, "hisPrice");
            return (Criteria) this;
        }

        public Criteria andHisPriceGreaterThanOrEqualTo(String value) {
            addCriterion("HIS_PRICE >=", value, "hisPrice");
            return (Criteria) this;
        }

        public Criteria andHisPriceLessThan(String value) {
            addCriterion("HIS_PRICE <", value, "hisPrice");
            return (Criteria) this;
        }

        public Criteria andHisPriceLessThanOrEqualTo(String value) {
            addCriterion("HIS_PRICE <=", value, "hisPrice");
            return (Criteria) this;
        }

        public Criteria andHisPriceLike(String value) {
            addCriterion("HIS_PRICE like", value, "hisPrice");
            return (Criteria) this;
        }

        public Criteria andHisPriceNotLike(String value) {
            addCriterion("HIS_PRICE not like", value, "hisPrice");
            return (Criteria) this;
        }

        public Criteria andHisPriceIn(List<String> values) {
            addCriterion("HIS_PRICE in", values, "hisPrice");
            return (Criteria) this;
        }

        public Criteria andHisPriceNotIn(List<String> values) {
            addCriterion("HIS_PRICE not in", values, "hisPrice");
            return (Criteria) this;
        }

        public Criteria andHisPriceBetween(String value1, String value2) {
            addCriterion("HIS_PRICE between", value1, value2, "hisPrice");
            return (Criteria) this;
        }

        public Criteria andHisPriceNotBetween(String value1, String value2) {
            addCriterion("HIS_PRICE not between", value1, value2, "hisPrice");
            return (Criteria) this;
        }

        public Criteria andPoDepIsNull() {
            addCriterion("PO_DEP is null");
            return (Criteria) this;
        }

        public Criteria andPoDepIsNotNull() {
            addCriterion("PO_DEP is not null");
            return (Criteria) this;
        }

        public Criteria andPoDepEqualTo(String value) {
            addCriterion("PO_DEP =", value, "poDep");
            return (Criteria) this;
        }

        public Criteria andPoDepNotEqualTo(String value) {
            addCriterion("PO_DEP <>", value, "poDep");
            return (Criteria) this;
        }

        public Criteria andPoDepGreaterThan(String value) {
            addCriterion("PO_DEP >", value, "poDep");
            return (Criteria) this;
        }

        public Criteria andPoDepGreaterThanOrEqualTo(String value) {
            addCriterion("PO_DEP >=", value, "poDep");
            return (Criteria) this;
        }

        public Criteria andPoDepLessThan(String value) {
            addCriterion("PO_DEP <", value, "poDep");
            return (Criteria) this;
        }

        public Criteria andPoDepLessThanOrEqualTo(String value) {
            addCriterion("PO_DEP <=", value, "poDep");
            return (Criteria) this;
        }

        public Criteria andPoDepLike(String value) {
            addCriterion("PO_DEP like", value, "poDep");
            return (Criteria) this;
        }

        public Criteria andPoDepNotLike(String value) {
            addCriterion("PO_DEP not like", value, "poDep");
            return (Criteria) this;
        }

        public Criteria andPoDepIn(List<String> values) {
            addCriterion("PO_DEP in", values, "poDep");
            return (Criteria) this;
        }

        public Criteria andPoDepNotIn(List<String> values) {
            addCriterion("PO_DEP not in", values, "poDep");
            return (Criteria) this;
        }

        public Criteria andPoDepBetween(String value1, String value2) {
            addCriterion("PO_DEP between", value1, value2, "poDep");
            return (Criteria) this;
        }

        public Criteria andPoDepNotBetween(String value1, String value2) {
            addCriterion("PO_DEP not between", value1, value2, "poDep");
            return (Criteria) this;
        }

        public Criteria andPoSoNoIsNull() {
            addCriterion("PO_SO_NO is null");
            return (Criteria) this;
        }

        public Criteria andPoSoNoIsNotNull() {
            addCriterion("PO_SO_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPoSoNoEqualTo(String value) {
            addCriterion("PO_SO_NO =", value, "poSoNo");
            return (Criteria) this;
        }

        public Criteria andPoSoNoNotEqualTo(String value) {
            addCriterion("PO_SO_NO <>", value, "poSoNo");
            return (Criteria) this;
        }

        public Criteria andPoSoNoGreaterThan(String value) {
            addCriterion("PO_SO_NO >", value, "poSoNo");
            return (Criteria) this;
        }

        public Criteria andPoSoNoGreaterThanOrEqualTo(String value) {
            addCriterion("PO_SO_NO >=", value, "poSoNo");
            return (Criteria) this;
        }

        public Criteria andPoSoNoLessThan(String value) {
            addCriterion("PO_SO_NO <", value, "poSoNo");
            return (Criteria) this;
        }

        public Criteria andPoSoNoLessThanOrEqualTo(String value) {
            addCriterion("PO_SO_NO <=", value, "poSoNo");
            return (Criteria) this;
        }

        public Criteria andPoSoNoLike(String value) {
            addCriterion("PO_SO_NO like", value, "poSoNo");
            return (Criteria) this;
        }

        public Criteria andPoSoNoNotLike(String value) {
            addCriterion("PO_SO_NO not like", value, "poSoNo");
            return (Criteria) this;
        }

        public Criteria andPoSoNoIn(List<String> values) {
            addCriterion("PO_SO_NO in", values, "poSoNo");
            return (Criteria) this;
        }

        public Criteria andPoSoNoNotIn(List<String> values) {
            addCriterion("PO_SO_NO not in", values, "poSoNo");
            return (Criteria) this;
        }

        public Criteria andPoSoNoBetween(String value1, String value2) {
            addCriterion("PO_SO_NO between", value1, value2, "poSoNo");
            return (Criteria) this;
        }

        public Criteria andPoSoNoNotBetween(String value1, String value2) {
            addCriterion("PO_SO_NO not between", value1, value2, "poSoNo");
            return (Criteria) this;
        }

        public Criteria andSoByMmIsNull() {
            addCriterion("SO_BY_MM is null");
            return (Criteria) this;
        }

        public Criteria andSoByMmIsNotNull() {
            addCriterion("SO_BY_MM is not null");
            return (Criteria) this;
        }

        public Criteria andSoByMmEqualTo(Short value) {
            addCriterion("SO_BY_MM =", value, "soByMm");
            return (Criteria) this;
        }

        public Criteria andSoByMmNotEqualTo(Short value) {
            addCriterion("SO_BY_MM <>", value, "soByMm");
            return (Criteria) this;
        }

        public Criteria andSoByMmGreaterThan(Short value) {
            addCriterion("SO_BY_MM >", value, "soByMm");
            return (Criteria) this;
        }

        public Criteria andSoByMmGreaterThanOrEqualTo(Short value) {
            addCriterion("SO_BY_MM >=", value, "soByMm");
            return (Criteria) this;
        }

        public Criteria andSoByMmLessThan(Short value) {
            addCriterion("SO_BY_MM <", value, "soByMm");
            return (Criteria) this;
        }

        public Criteria andSoByMmLessThanOrEqualTo(Short value) {
            addCriterion("SO_BY_MM <=", value, "soByMm");
            return (Criteria) this;
        }

        public Criteria andSoByMmIn(List<Short> values) {
            addCriterion("SO_BY_MM in", values, "soByMm");
            return (Criteria) this;
        }

        public Criteria andSoByMmNotIn(List<Short> values) {
            addCriterion("SO_BY_MM not in", values, "soByMm");
            return (Criteria) this;
        }

        public Criteria andSoByMmBetween(Short value1, Short value2) {
            addCriterion("SO_BY_MM between", value1, value2, "soByMm");
            return (Criteria) this;
        }

        public Criteria andSoByMmNotBetween(Short value1, Short value2) {
            addCriterion("SO_BY_MM not between", value1, value2, "soByMm");
            return (Criteria) this;
        }

        public Criteria andSoOtDdIsNull() {
            addCriterion("SO_OT_DD is null");
            return (Criteria) this;
        }

        public Criteria andSoOtDdIsNotNull() {
            addCriterion("SO_OT_DD is not null");
            return (Criteria) this;
        }

        public Criteria andSoOtDdEqualTo(Short value) {
            addCriterion("SO_OT_DD =", value, "soOtDd");
            return (Criteria) this;
        }

        public Criteria andSoOtDdNotEqualTo(Short value) {
            addCriterion("SO_OT_DD <>", value, "soOtDd");
            return (Criteria) this;
        }

        public Criteria andSoOtDdGreaterThan(Short value) {
            addCriterion("SO_OT_DD >", value, "soOtDd");
            return (Criteria) this;
        }

        public Criteria andSoOtDdGreaterThanOrEqualTo(Short value) {
            addCriterion("SO_OT_DD >=", value, "soOtDd");
            return (Criteria) this;
        }

        public Criteria andSoOtDdLessThan(Short value) {
            addCriterion("SO_OT_DD <", value, "soOtDd");
            return (Criteria) this;
        }

        public Criteria andSoOtDdLessThanOrEqualTo(Short value) {
            addCriterion("SO_OT_DD <=", value, "soOtDd");
            return (Criteria) this;
        }

        public Criteria andSoOtDdIn(List<Short> values) {
            addCriterion("SO_OT_DD in", values, "soOtDd");
            return (Criteria) this;
        }

        public Criteria andSoOtDdNotIn(List<Short> values) {
            addCriterion("SO_OT_DD not in", values, "soOtDd");
            return (Criteria) this;
        }

        public Criteria andSoOtDdBetween(Short value1, Short value2) {
            addCriterion("SO_OT_DD between", value1, value2, "soOtDd");
            return (Criteria) this;
        }

        public Criteria andSoOtDdNotBetween(Short value1, Short value2) {
            addCriterion("SO_OT_DD not between", value1, value2, "soOtDd");
            return (Criteria) this;
        }

        public Criteria andSoByDdIsNull() {
            addCriterion("SO_BY_DD is null");
            return (Criteria) this;
        }

        public Criteria andSoByDdIsNotNull() {
            addCriterion("SO_BY_DD is not null");
            return (Criteria) this;
        }

        public Criteria andSoByDdEqualTo(Short value) {
            addCriterion("SO_BY_DD =", value, "soByDd");
            return (Criteria) this;
        }

        public Criteria andSoByDdNotEqualTo(Short value) {
            addCriterion("SO_BY_DD <>", value, "soByDd");
            return (Criteria) this;
        }

        public Criteria andSoByDdGreaterThan(Short value) {
            addCriterion("SO_BY_DD >", value, "soByDd");
            return (Criteria) this;
        }

        public Criteria andSoByDdGreaterThanOrEqualTo(Short value) {
            addCriterion("SO_BY_DD >=", value, "soByDd");
            return (Criteria) this;
        }

        public Criteria andSoByDdLessThan(Short value) {
            addCriterion("SO_BY_DD <", value, "soByDd");
            return (Criteria) this;
        }

        public Criteria andSoByDdLessThanOrEqualTo(Short value) {
            addCriterion("SO_BY_DD <=", value, "soByDd");
            return (Criteria) this;
        }

        public Criteria andSoByDdIn(List<Short> values) {
            addCriterion("SO_BY_DD in", values, "soByDd");
            return (Criteria) this;
        }

        public Criteria andSoByDdNotIn(List<Short> values) {
            addCriterion("SO_BY_DD not in", values, "soByDd");
            return (Criteria) this;
        }

        public Criteria andSoByDdBetween(Short value1, Short value2) {
            addCriterion("SO_BY_DD between", value1, value2, "soByDd");
            return (Criteria) this;
        }

        public Criteria andSoByDdNotBetween(Short value1, Short value2) {
            addCriterion("SO_BY_DD not between", value1, value2, "soByDd");
            return (Criteria) this;
        }

        public Criteria andSoLngCasIsNull() {
            addCriterion("SO_LNG_CAS is null");
            return (Criteria) this;
        }

        public Criteria andSoLngCasIsNotNull() {
            addCriterion("SO_LNG_CAS is not null");
            return (Criteria) this;
        }

        public Criteria andSoLngCasEqualTo(String value) {
            addCriterion("SO_LNG_CAS =", value, "soLngCas");
            return (Criteria) this;
        }

        public Criteria andSoLngCasNotEqualTo(String value) {
            addCriterion("SO_LNG_CAS <>", value, "soLngCas");
            return (Criteria) this;
        }

        public Criteria andSoLngCasGreaterThan(String value) {
            addCriterion("SO_LNG_CAS >", value, "soLngCas");
            return (Criteria) this;
        }

        public Criteria andSoLngCasGreaterThanOrEqualTo(String value) {
            addCriterion("SO_LNG_CAS >=", value, "soLngCas");
            return (Criteria) this;
        }

        public Criteria andSoLngCasLessThan(String value) {
            addCriterion("SO_LNG_CAS <", value, "soLngCas");
            return (Criteria) this;
        }

        public Criteria andSoLngCasLessThanOrEqualTo(String value) {
            addCriterion("SO_LNG_CAS <=", value, "soLngCas");
            return (Criteria) this;
        }

        public Criteria andSoLngCasLike(String value) {
            addCriterion("SO_LNG_CAS like", value, "soLngCas");
            return (Criteria) this;
        }

        public Criteria andSoLngCasNotLike(String value) {
            addCriterion("SO_LNG_CAS not like", value, "soLngCas");
            return (Criteria) this;
        }

        public Criteria andSoLngCasIn(List<String> values) {
            addCriterion("SO_LNG_CAS in", values, "soLngCas");
            return (Criteria) this;
        }

        public Criteria andSoLngCasNotIn(List<String> values) {
            addCriterion("SO_LNG_CAS not in", values, "soLngCas");
            return (Criteria) this;
        }

        public Criteria andSoLngCasBetween(String value1, String value2) {
            addCriterion("SO_LNG_CAS between", value1, value2, "soLngCas");
            return (Criteria) this;
        }

        public Criteria andSoLngCasNotBetween(String value1, String value2) {
            addCriterion("SO_LNG_CAS not between", value1, value2, "soLngCas");
            return (Criteria) this;
        }

        public Criteria andSoEndDdIsNull() {
            addCriterion("SO_END_DD is null");
            return (Criteria) this;
        }

        public Criteria andSoEndDdIsNotNull() {
            addCriterion("SO_END_DD is not null");
            return (Criteria) this;
        }

        public Criteria andSoEndDdEqualTo(Date value) {
            addCriterion("SO_END_DD =", value, "soEndDd");
            return (Criteria) this;
        }

        public Criteria andSoEndDdNotEqualTo(Date value) {
            addCriterion("SO_END_DD <>", value, "soEndDd");
            return (Criteria) this;
        }

        public Criteria andSoEndDdGreaterThan(Date value) {
            addCriterion("SO_END_DD >", value, "soEndDd");
            return (Criteria) this;
        }

        public Criteria andSoEndDdGreaterThanOrEqualTo(Date value) {
            addCriterion("SO_END_DD >=", value, "soEndDd");
            return (Criteria) this;
        }

        public Criteria andSoEndDdLessThan(Date value) {
            addCriterion("SO_END_DD <", value, "soEndDd");
            return (Criteria) this;
        }

        public Criteria andSoEndDdLessThanOrEqualTo(Date value) {
            addCriterion("SO_END_DD <=", value, "soEndDd");
            return (Criteria) this;
        }

        public Criteria andSoEndDdIn(List<Date> values) {
            addCriterion("SO_END_DD in", values, "soEndDd");
            return (Criteria) this;
        }

        public Criteria andSoEndDdNotIn(List<Date> values) {
            addCriterion("SO_END_DD not in", values, "soEndDd");
            return (Criteria) this;
        }

        public Criteria andSoEndDdBetween(Date value1, Date value2) {
            addCriterion("SO_END_DD between", value1, value2, "soEndDd");
            return (Criteria) this;
        }

        public Criteria andSoEndDdNotBetween(Date value1, Date value2) {
            addCriterion("SO_END_DD not between", value1, value2, "soEndDd");
            return (Criteria) this;
        }

        public Criteria andSoLstDdIsNull() {
            addCriterion("SO_LST_DD is null");
            return (Criteria) this;
        }

        public Criteria andSoLstDdIsNotNull() {
            addCriterion("SO_LST_DD is not null");
            return (Criteria) this;
        }

        public Criteria andSoLstDdEqualTo(Date value) {
            addCriterion("SO_LST_DD =", value, "soLstDd");
            return (Criteria) this;
        }

        public Criteria andSoLstDdNotEqualTo(Date value) {
            addCriterion("SO_LST_DD <>", value, "soLstDd");
            return (Criteria) this;
        }

        public Criteria andSoLstDdGreaterThan(Date value) {
            addCriterion("SO_LST_DD >", value, "soLstDd");
            return (Criteria) this;
        }

        public Criteria andSoLstDdGreaterThanOrEqualTo(Date value) {
            addCriterion("SO_LST_DD >=", value, "soLstDd");
            return (Criteria) this;
        }

        public Criteria andSoLstDdLessThan(Date value) {
            addCriterion("SO_LST_DD <", value, "soLstDd");
            return (Criteria) this;
        }

        public Criteria andSoLstDdLessThanOrEqualTo(Date value) {
            addCriterion("SO_LST_DD <=", value, "soLstDd");
            return (Criteria) this;
        }

        public Criteria andSoLstDdIn(List<Date> values) {
            addCriterion("SO_LST_DD in", values, "soLstDd");
            return (Criteria) this;
        }

        public Criteria andSoLstDdNotIn(List<Date> values) {
            addCriterion("SO_LST_DD not in", values, "soLstDd");
            return (Criteria) this;
        }

        public Criteria andSoLstDdBetween(Date value1, Date value2) {
            addCriterion("SO_LST_DD between", value1, value2, "soLstDd");
            return (Criteria) this;
        }

        public Criteria andSoLstDdNotBetween(Date value1, Date value2) {
            addCriterion("SO_LST_DD not between", value1, value2, "soLstDd");
            return (Criteria) this;
        }

        public Criteria andInvDisIdIsNull() {
            addCriterion("INV_DIS_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvDisIdIsNotNull() {
            addCriterion("INV_DIS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvDisIdEqualTo(String value) {
            addCriterion("INV_DIS_ID =", value, "invDisId");
            return (Criteria) this;
        }

        public Criteria andInvDisIdNotEqualTo(String value) {
            addCriterion("INV_DIS_ID <>", value, "invDisId");
            return (Criteria) this;
        }

        public Criteria andInvDisIdGreaterThan(String value) {
            addCriterion("INV_DIS_ID >", value, "invDisId");
            return (Criteria) this;
        }

        public Criteria andInvDisIdGreaterThanOrEqualTo(String value) {
            addCriterion("INV_DIS_ID >=", value, "invDisId");
            return (Criteria) this;
        }

        public Criteria andInvDisIdLessThan(String value) {
            addCriterion("INV_DIS_ID <", value, "invDisId");
            return (Criteria) this;
        }

        public Criteria andInvDisIdLessThanOrEqualTo(String value) {
            addCriterion("INV_DIS_ID <=", value, "invDisId");
            return (Criteria) this;
        }

        public Criteria andInvDisIdLike(String value) {
            addCriterion("INV_DIS_ID like", value, "invDisId");
            return (Criteria) this;
        }

        public Criteria andInvDisIdNotLike(String value) {
            addCriterion("INV_DIS_ID not like", value, "invDisId");
            return (Criteria) this;
        }

        public Criteria andInvDisIdIn(List<String> values) {
            addCriterion("INV_DIS_ID in", values, "invDisId");
            return (Criteria) this;
        }

        public Criteria andInvDisIdNotIn(List<String> values) {
            addCriterion("INV_DIS_ID not in", values, "invDisId");
            return (Criteria) this;
        }

        public Criteria andInvDisIdBetween(String value1, String value2) {
            addCriterion("INV_DIS_ID between", value1, value2, "invDisId");
            return (Criteria) this;
        }

        public Criteria andInvDisIdNotBetween(String value1, String value2) {
            addCriterion("INV_DIS_ID not between", value1, value2, "invDisId");
            return (Criteria) this;
        }

        public Criteria andInvNoIsNull() {
            addCriterion("INV_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvNoIsNotNull() {
            addCriterion("INV_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvNoEqualTo(String value) {
            addCriterion("INV_NO =", value, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoNotEqualTo(String value) {
            addCriterion("INV_NO <>", value, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoGreaterThan(String value) {
            addCriterion("INV_NO >", value, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoGreaterThanOrEqualTo(String value) {
            addCriterion("INV_NO >=", value, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoLessThan(String value) {
            addCriterion("INV_NO <", value, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoLessThanOrEqualTo(String value) {
            addCriterion("INV_NO <=", value, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoLike(String value) {
            addCriterion("INV_NO like", value, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoNotLike(String value) {
            addCriterion("INV_NO not like", value, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoIn(List<String> values) {
            addCriterion("INV_NO in", values, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoNotIn(List<String> values) {
            addCriterion("INV_NO not in", values, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoBetween(String value1, String value2) {
            addCriterion("INV_NO between", value1, value2, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoNotBetween(String value1, String value2) {
            addCriterion("INV_NO not between", value1, value2, "invNo");
            return (Criteria) this;
        }

        public Criteria andTaxIdIsNull() {
            addCriterion("TAX_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaxIdIsNotNull() {
            addCriterion("TAX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxIdEqualTo(String value) {
            addCriterion("TAX_ID =", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotEqualTo(String value) {
            addCriterion("TAX_ID <>", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdGreaterThan(String value) {
            addCriterion("TAX_ID >", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_ID >=", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLessThan(String value) {
            addCriterion("TAX_ID <", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLessThanOrEqualTo(String value) {
            addCriterion("TAX_ID <=", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLike(String value) {
            addCriterion("TAX_ID like", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotLike(String value) {
            addCriterion("TAX_ID not like", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdIn(List<String> values) {
            addCriterion("TAX_ID in", values, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotIn(List<String> values) {
            addCriterion("TAX_ID not in", values, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdBetween(String value1, String value2) {
            addCriterion("TAX_ID between", value1, value2, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotBetween(String value1, String value2) {
            addCriterion("TAX_ID not between", value1, value2, "taxId");
            return (Criteria) this;
        }

        public Criteria andRpNoIsNull() {
            addCriterion("RP_NO is null");
            return (Criteria) this;
        }

        public Criteria andRpNoIsNotNull() {
            addCriterion("RP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRpNoEqualTo(String value) {
            addCriterion("RP_NO =", value, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoNotEqualTo(String value) {
            addCriterion("RP_NO <>", value, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoGreaterThan(String value) {
            addCriterion("RP_NO >", value, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoGreaterThanOrEqualTo(String value) {
            addCriterion("RP_NO >=", value, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoLessThan(String value) {
            addCriterion("RP_NO <", value, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoLessThanOrEqualTo(String value) {
            addCriterion("RP_NO <=", value, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoLike(String value) {
            addCriterion("RP_NO like", value, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoNotLike(String value) {
            addCriterion("RP_NO not like", value, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoIn(List<String> values) {
            addCriterion("RP_NO in", values, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoNotIn(List<String> values) {
            addCriterion("RP_NO not in", values, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoBetween(String value1, String value2) {
            addCriterion("RP_NO between", value1, value2, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoNotBetween(String value1, String value2) {
            addCriterion("RP_NO not between", value1, value2, "rpNo");
            return (Criteria) this;
        }

        public Criteria andOldInvNoIsNull() {
            addCriterion("OLD_INV_NO is null");
            return (Criteria) this;
        }

        public Criteria andOldInvNoIsNotNull() {
            addCriterion("OLD_INV_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOldInvNoEqualTo(String value) {
            addCriterion("OLD_INV_NO =", value, "oldInvNo");
            return (Criteria) this;
        }

        public Criteria andOldInvNoNotEqualTo(String value) {
            addCriterion("OLD_INV_NO <>", value, "oldInvNo");
            return (Criteria) this;
        }

        public Criteria andOldInvNoGreaterThan(String value) {
            addCriterion("OLD_INV_NO >", value, "oldInvNo");
            return (Criteria) this;
        }

        public Criteria andOldInvNoGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_INV_NO >=", value, "oldInvNo");
            return (Criteria) this;
        }

        public Criteria andOldInvNoLessThan(String value) {
            addCriterion("OLD_INV_NO <", value, "oldInvNo");
            return (Criteria) this;
        }

        public Criteria andOldInvNoLessThanOrEqualTo(String value) {
            addCriterion("OLD_INV_NO <=", value, "oldInvNo");
            return (Criteria) this;
        }

        public Criteria andOldInvNoLike(String value) {
            addCriterion("OLD_INV_NO like", value, "oldInvNo");
            return (Criteria) this;
        }

        public Criteria andOldInvNoNotLike(String value) {
            addCriterion("OLD_INV_NO not like", value, "oldInvNo");
            return (Criteria) this;
        }

        public Criteria andOldInvNoIn(List<String> values) {
            addCriterion("OLD_INV_NO in", values, "oldInvNo");
            return (Criteria) this;
        }

        public Criteria andOldInvNoNotIn(List<String> values) {
            addCriterion("OLD_INV_NO not in", values, "oldInvNo");
            return (Criteria) this;
        }

        public Criteria andOldInvNoBetween(String value1, String value2) {
            addCriterion("OLD_INV_NO between", value1, value2, "oldInvNo");
            return (Criteria) this;
        }

        public Criteria andOldInvNoNotBetween(String value1, String value2) {
            addCriterion("OLD_INV_NO not between", value1, value2, "oldInvNo");
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

        public Criteria andPayDdIsNull() {
            addCriterion("PAY_DD is null");
            return (Criteria) this;
        }

        public Criteria andPayDdIsNotNull() {
            addCriterion("PAY_DD is not null");
            return (Criteria) this;
        }

        public Criteria andPayDdEqualTo(Date value) {
            addCriterion("PAY_DD =", value, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdNotEqualTo(Date value) {
            addCriterion("PAY_DD <>", value, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdGreaterThan(Date value) {
            addCriterion("PAY_DD >", value, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdGreaterThanOrEqualTo(Date value) {
            addCriterion("PAY_DD >=", value, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdLessThan(Date value) {
            addCriterion("PAY_DD <", value, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdLessThanOrEqualTo(Date value) {
            addCriterion("PAY_DD <=", value, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdIn(List<Date> values) {
            addCriterion("PAY_DD in", values, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdNotIn(List<Date> values) {
            addCriterion("PAY_DD not in", values, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdBetween(Date value1, Date value2) {
            addCriterion("PAY_DD between", value1, value2, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdNotBetween(Date value1, Date value2) {
            addCriterion("PAY_DD not between", value1, value2, "payDd");
            return (Criteria) this;
        }

        public Criteria andChkDdIsNull() {
            addCriterion("CHK_DD is null");
            return (Criteria) this;
        }

        public Criteria andChkDdIsNotNull() {
            addCriterion("CHK_DD is not null");
            return (Criteria) this;
        }

        public Criteria andChkDdEqualTo(Date value) {
            addCriterion("CHK_DD =", value, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdNotEqualTo(Date value) {
            addCriterion("CHK_DD <>", value, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdGreaterThan(Date value) {
            addCriterion("CHK_DD >", value, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdGreaterThanOrEqualTo(Date value) {
            addCriterion("CHK_DD >=", value, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdLessThan(Date value) {
            addCriterion("CHK_DD <", value, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdLessThanOrEqualTo(Date value) {
            addCriterion("CHK_DD <=", value, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdIn(List<Date> values) {
            addCriterion("CHK_DD in", values, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdNotIn(List<Date> values) {
            addCriterion("CHK_DD not in", values, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdBetween(Date value1, Date value2) {
            addCriterion("CHK_DD between", value1, value2, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdNotBetween(Date value1, Date value2) {
            addCriterion("CHK_DD not between", value1, value2, "chkDd");
            return (Criteria) this;
        }

        public Criteria andIntDaysIsNull() {
            addCriterion("INT_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andIntDaysIsNotNull() {
            addCriterion("INT_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andIntDaysEqualTo(Short value) {
            addCriterion("INT_DAYS =", value, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysNotEqualTo(Short value) {
            addCriterion("INT_DAYS <>", value, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysGreaterThan(Short value) {
            addCriterion("INT_DAYS >", value, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("INT_DAYS >=", value, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysLessThan(Short value) {
            addCriterion("INT_DAYS <", value, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysLessThanOrEqualTo(Short value) {
            addCriterion("INT_DAYS <=", value, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysIn(List<Short> values) {
            addCriterion("INT_DAYS in", values, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysNotIn(List<Short> values) {
            addCriterion("INT_DAYS not in", values, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysBetween(Short value1, Short value2) {
            addCriterion("INT_DAYS between", value1, value2, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysNotBetween(Short value1, Short value2) {
            addCriterion("INT_DAYS not between", value1, value2, "intDays");
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

        public Criteria andContractIsNull() {
            addCriterion("CONTRACT is null");
            return (Criteria) this;
        }

        public Criteria andContractIsNotNull() {
            addCriterion("CONTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andContractEqualTo(String value) {
            addCriterion("CONTRACT =", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotEqualTo(String value) {
            addCriterion("CONTRACT <>", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractGreaterThan(String value) {
            addCriterion("CONTRACT >", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT >=", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLessThan(String value) {
            addCriterion("CONTRACT <", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT <=", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLike(String value) {
            addCriterion("CONTRACT like", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotLike(String value) {
            addCriterion("CONTRACT not like", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractIn(List<String> values) {
            addCriterion("CONTRACT in", values, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotIn(List<String> values) {
            addCriterion("CONTRACT not in", values, "contract");
            return (Criteria) this;
        }

        public Criteria andContractBetween(String value1, String value2) {
            addCriterion("CONTRACT between", value1, value2, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotBetween(String value1, String value2) {
            addCriterion("CONTRACT not between", value1, value2, "contract");
            return (Criteria) this;
        }

        public Criteria andPrtSwIsNull() {
            addCriterion("PRT_SW is null");
            return (Criteria) this;
        }

        public Criteria andPrtSwIsNotNull() {
            addCriterion("PRT_SW is not null");
            return (Criteria) this;
        }

        public Criteria andPrtSwEqualTo(String value) {
            addCriterion("PRT_SW =", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwNotEqualTo(String value) {
            addCriterion("PRT_SW <>", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwGreaterThan(String value) {
            addCriterion("PRT_SW >", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwGreaterThanOrEqualTo(String value) {
            addCriterion("PRT_SW >=", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwLessThan(String value) {
            addCriterion("PRT_SW <", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwLessThanOrEqualTo(String value) {
            addCriterion("PRT_SW <=", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwLike(String value) {
            addCriterion("PRT_SW like", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwNotLike(String value) {
            addCriterion("PRT_SW not like", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwIn(List<String> values) {
            addCriterion("PRT_SW in", values, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwNotIn(List<String> values) {
            addCriterion("PRT_SW not in", values, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwBetween(String value1, String value2) {
            addCriterion("PRT_SW between", value1, value2, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwNotBetween(String value1, String value2) {
            addCriterion("PRT_SW not between", value1, value2, "prtSw");
            return (Criteria) this;
        }

        public Criteria andCpySwIsNull() {
            addCriterion("CPY_SW is null");
            return (Criteria) this;
        }

        public Criteria andCpySwIsNotNull() {
            addCriterion("CPY_SW is not null");
            return (Criteria) this;
        }

        public Criteria andCpySwEqualTo(String value) {
            addCriterion("CPY_SW =", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotEqualTo(String value) {
            addCriterion("CPY_SW <>", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwGreaterThan(String value) {
            addCriterion("CPY_SW >", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwGreaterThanOrEqualTo(String value) {
            addCriterion("CPY_SW >=", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwLessThan(String value) {
            addCriterion("CPY_SW <", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwLessThanOrEqualTo(String value) {
            addCriterion("CPY_SW <=", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwLike(String value) {
            addCriterion("CPY_SW like", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotLike(String value) {
            addCriterion("CPY_SW not like", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwIn(List<String> values) {
            addCriterion("CPY_SW in", values, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotIn(List<String> values) {
            addCriterion("CPY_SW not in", values, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwBetween(String value1, String value2) {
            addCriterion("CPY_SW between", value1, value2, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotBetween(String value1, String value2) {
            addCriterion("CPY_SW not between", value1, value2, "cpySw");
            return (Criteria) this;
        }

        public Criteria andBilNoIsNull() {
            addCriterion("BIL_NO is null");
            return (Criteria) this;
        }

        public Criteria andBilNoIsNotNull() {
            addCriterion("BIL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBilNoEqualTo(String value) {
            addCriterion("BIL_NO =", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoNotEqualTo(String value) {
            addCriterion("BIL_NO <>", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoGreaterThan(String value) {
            addCriterion("BIL_NO >", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoGreaterThanOrEqualTo(String value) {
            addCriterion("BIL_NO >=", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoLessThan(String value) {
            addCriterion("BIL_NO <", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoLessThanOrEqualTo(String value) {
            addCriterion("BIL_NO <=", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoLike(String value) {
            addCriterion("BIL_NO like", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoNotLike(String value) {
            addCriterion("BIL_NO not like", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoIn(List<String> values) {
            addCriterion("BIL_NO in", values, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoNotIn(List<String> values) {
            addCriterion("BIL_NO not in", values, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoBetween(String value1, String value2) {
            addCriterion("BIL_NO between", value1, value2, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoNotBetween(String value1, String value2) {
            addCriterion("BIL_NO not between", value1, value2, "bilNo");
            return (Criteria) this;
        }

        public Criteria andLcNoIsNull() {
            addCriterion("LC_NO is null");
            return (Criteria) this;
        }

        public Criteria andLcNoIsNotNull() {
            addCriterion("LC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLcNoEqualTo(String value) {
            addCriterion("LC_NO =", value, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoNotEqualTo(String value) {
            addCriterion("LC_NO <>", value, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoGreaterThan(String value) {
            addCriterion("LC_NO >", value, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoGreaterThanOrEqualTo(String value) {
            addCriterion("LC_NO >=", value, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoLessThan(String value) {
            addCriterion("LC_NO <", value, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoLessThanOrEqualTo(String value) {
            addCriterion("LC_NO <=", value, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoLike(String value) {
            addCriterion("LC_NO like", value, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoNotLike(String value) {
            addCriterion("LC_NO not like", value, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoIn(List<String> values) {
            addCriterion("LC_NO in", values, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoNotIn(List<String> values) {
            addCriterion("LC_NO not in", values, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoBetween(String value1, String value2) {
            addCriterion("LC_NO between", value1, value2, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoNotBetween(String value1, String value2) {
            addCriterion("LC_NO not between", value1, value2, "lcNo");
            return (Criteria) this;
        }

        public Criteria andAmtnDisIsNull() {
            addCriterion("AMTN_DIS is null");
            return (Criteria) this;
        }

        public Criteria andAmtnDisIsNotNull() {
            addCriterion("AMTN_DIS is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnDisEqualTo(BigDecimal value) {
            addCriterion("AMTN_DIS =", value, "amtnDis");
            return (Criteria) this;
        }

        public Criteria andAmtnDisNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_DIS <>", value, "amtnDis");
            return (Criteria) this;
        }

        public Criteria andAmtnDisGreaterThan(BigDecimal value) {
            addCriterion("AMTN_DIS >", value, "amtnDis");
            return (Criteria) this;
        }

        public Criteria andAmtnDisGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_DIS >=", value, "amtnDis");
            return (Criteria) this;
        }

        public Criteria andAmtnDisLessThan(BigDecimal value) {
            addCriterion("AMTN_DIS <", value, "amtnDis");
            return (Criteria) this;
        }

        public Criteria andAmtnDisLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_DIS <=", value, "amtnDis");
            return (Criteria) this;
        }

        public Criteria andAmtnDisIn(List<BigDecimal> values) {
            addCriterion("AMTN_DIS in", values, "amtnDis");
            return (Criteria) this;
        }

        public Criteria andAmtnDisNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_DIS not in", values, "amtnDis");
            return (Criteria) this;
        }

        public Criteria andAmtnDisBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_DIS between", value1, value2, "amtnDis");
            return (Criteria) this;
        }

        public Criteria andAmtnDisNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_DIS not between", value1, value2, "amtnDis");
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

        public Criteria andClsRemIsNull() {
            addCriterion("CLS_REM is null");
            return (Criteria) this;
        }

        public Criteria andClsRemIsNotNull() {
            addCriterion("CLS_REM is not null");
            return (Criteria) this;
        }

        public Criteria andClsRemEqualTo(String value) {
            addCriterion("CLS_REM =", value, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemNotEqualTo(String value) {
            addCriterion("CLS_REM <>", value, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemGreaterThan(String value) {
            addCriterion("CLS_REM >", value, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemGreaterThanOrEqualTo(String value) {
            addCriterion("CLS_REM >=", value, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemLessThan(String value) {
            addCriterion("CLS_REM <", value, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemLessThanOrEqualTo(String value) {
            addCriterion("CLS_REM <=", value, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemLike(String value) {
            addCriterion("CLS_REM like", value, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemNotLike(String value) {
            addCriterion("CLS_REM not like", value, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemIn(List<String> values) {
            addCriterion("CLS_REM in", values, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemNotIn(List<String> values) {
            addCriterion("CLS_REM not in", values, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemBetween(String value1, String value2) {
            addCriterion("CLS_REM between", value1, value2, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemNotBetween(String value1, String value2) {
            addCriterion("CLS_REM not between", value1, value2, "clsRem");
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

        public Criteria andRkClsIdIsNull() {
            addCriterion("RK_CLS_ID is null");
            return (Criteria) this;
        }

        public Criteria andRkClsIdIsNotNull() {
            addCriterion("RK_CLS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRkClsIdEqualTo(String value) {
            addCriterion("RK_CLS_ID =", value, "rkClsId");
            return (Criteria) this;
        }

        public Criteria andRkClsIdNotEqualTo(String value) {
            addCriterion("RK_CLS_ID <>", value, "rkClsId");
            return (Criteria) this;
        }

        public Criteria andRkClsIdGreaterThan(String value) {
            addCriterion("RK_CLS_ID >", value, "rkClsId");
            return (Criteria) this;
        }

        public Criteria andRkClsIdGreaterThanOrEqualTo(String value) {
            addCriterion("RK_CLS_ID >=", value, "rkClsId");
            return (Criteria) this;
        }

        public Criteria andRkClsIdLessThan(String value) {
            addCriterion("RK_CLS_ID <", value, "rkClsId");
            return (Criteria) this;
        }

        public Criteria andRkClsIdLessThanOrEqualTo(String value) {
            addCriterion("RK_CLS_ID <=", value, "rkClsId");
            return (Criteria) this;
        }

        public Criteria andRkClsIdLike(String value) {
            addCriterion("RK_CLS_ID like", value, "rkClsId");
            return (Criteria) this;
        }

        public Criteria andRkClsIdNotLike(String value) {
            addCriterion("RK_CLS_ID not like", value, "rkClsId");
            return (Criteria) this;
        }

        public Criteria andRkClsIdIn(List<String> values) {
            addCriterion("RK_CLS_ID in", values, "rkClsId");
            return (Criteria) this;
        }

        public Criteria andRkClsIdNotIn(List<String> values) {
            addCriterion("RK_CLS_ID not in", values, "rkClsId");
            return (Criteria) this;
        }

        public Criteria andRkClsIdBetween(String value1, String value2) {
            addCriterion("RK_CLS_ID between", value1, value2, "rkClsId");
            return (Criteria) this;
        }

        public Criteria andRkClsIdNotBetween(String value1, String value2) {
            addCriterion("RK_CLS_ID not between", value1, value2, "rkClsId");
            return (Criteria) this;
        }

        public Criteria andPreIdIsNull() {
            addCriterion("PRE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPreIdIsNotNull() {
            addCriterion("PRE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPreIdEqualTo(String value) {
            addCriterion("PRE_ID =", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdNotEqualTo(String value) {
            addCriterion("PRE_ID <>", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdGreaterThan(String value) {
            addCriterion("PRE_ID >", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_ID >=", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdLessThan(String value) {
            addCriterion("PRE_ID <", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdLessThanOrEqualTo(String value) {
            addCriterion("PRE_ID <=", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdLike(String value) {
            addCriterion("PRE_ID like", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdNotLike(String value) {
            addCriterion("PRE_ID not like", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdIn(List<String> values) {
            addCriterion("PRE_ID in", values, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdNotIn(List<String> values) {
            addCriterion("PRE_ID not in", values, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdBetween(String value1, String value2) {
            addCriterion("PRE_ID between", value1, value2, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdNotBetween(String value1, String value2) {
            addCriterion("PRE_ID not between", value1, value2, "preId");
            return (Criteria) this;
        }

        public Criteria andIsPosIsNull() {
            addCriterion("IS_POS is null");
            return (Criteria) this;
        }

        public Criteria andIsPosIsNotNull() {
            addCriterion("IS_POS is not null");
            return (Criteria) this;
        }

        public Criteria andIsPosEqualTo(String value) {
            addCriterion("IS_POS =", value, "isPos");
            return (Criteria) this;
        }

        public Criteria andIsPosNotEqualTo(String value) {
            addCriterion("IS_POS <>", value, "isPos");
            return (Criteria) this;
        }

        public Criteria andIsPosGreaterThan(String value) {
            addCriterion("IS_POS >", value, "isPos");
            return (Criteria) this;
        }

        public Criteria andIsPosGreaterThanOrEqualTo(String value) {
            addCriterion("IS_POS >=", value, "isPos");
            return (Criteria) this;
        }

        public Criteria andIsPosLessThan(String value) {
            addCriterion("IS_POS <", value, "isPos");
            return (Criteria) this;
        }

        public Criteria andIsPosLessThanOrEqualTo(String value) {
            addCriterion("IS_POS <=", value, "isPos");
            return (Criteria) this;
        }

        public Criteria andIsPosLike(String value) {
            addCriterion("IS_POS like", value, "isPos");
            return (Criteria) this;
        }

        public Criteria andIsPosNotLike(String value) {
            addCriterion("IS_POS not like", value, "isPos");
            return (Criteria) this;
        }

        public Criteria andIsPosIn(List<String> values) {
            addCriterion("IS_POS in", values, "isPos");
            return (Criteria) this;
        }

        public Criteria andIsPosNotIn(List<String> values) {
            addCriterion("IS_POS not in", values, "isPos");
            return (Criteria) this;
        }

        public Criteria andIsPosBetween(String value1, String value2) {
            addCriterion("IS_POS between", value1, value2, "isPos");
            return (Criteria) this;
        }

        public Criteria andIsPosNotBetween(String value1, String value2) {
            addCriterion("IS_POS not between", value1, value2, "isPos");
            return (Criteria) this;
        }

        public Criteria andPosNoIsNull() {
            addCriterion("POS_NO is null");
            return (Criteria) this;
        }

        public Criteria andPosNoIsNotNull() {
            addCriterion("POS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPosNoEqualTo(String value) {
            addCriterion("POS_NO =", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoNotEqualTo(String value) {
            addCriterion("POS_NO <>", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoGreaterThan(String value) {
            addCriterion("POS_NO >", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoGreaterThanOrEqualTo(String value) {
            addCriterion("POS_NO >=", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoLessThan(String value) {
            addCriterion("POS_NO <", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoLessThanOrEqualTo(String value) {
            addCriterion("POS_NO <=", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoLike(String value) {
            addCriterion("POS_NO like", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoNotLike(String value) {
            addCriterion("POS_NO not like", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoIn(List<String> values) {
            addCriterion("POS_NO in", values, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoNotIn(List<String> values) {
            addCriterion("POS_NO not in", values, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoBetween(String value1, String value2) {
            addCriterion("POS_NO between", value1, value2, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoNotBetween(String value1, String value2) {
            addCriterion("POS_NO not between", value1, value2, "posNo");
            return (Criteria) this;
        }

        public Criteria andClsDateIsNull() {
            addCriterion("CLS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andClsDateIsNotNull() {
            addCriterion("CLS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andClsDateEqualTo(Date value) {
            addCriterion("CLS_DATE =", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotEqualTo(Date value) {
            addCriterion("CLS_DATE <>", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateGreaterThan(Date value) {
            addCriterion("CLS_DATE >", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CLS_DATE >=", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateLessThan(Date value) {
            addCriterion("CLS_DATE <", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateLessThanOrEqualTo(Date value) {
            addCriterion("CLS_DATE <=", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateIn(List<Date> values) {
            addCriterion("CLS_DATE in", values, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotIn(List<Date> values) {
            addCriterion("CLS_DATE not in", values, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateBetween(Date value1, Date value2) {
            addCriterion("CLS_DATE between", value1, value2, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotBetween(Date value1, Date value2) {
            addCriterion("CLS_DATE not between", value1, value2, "clsDate");
            return (Criteria) this;
        }

        public Criteria andPclIdIsNull() {
            addCriterion("PCL_ID is null");
            return (Criteria) this;
        }

        public Criteria andPclIdIsNotNull() {
            addCriterion("PCL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPclIdEqualTo(String value) {
            addCriterion("PCL_ID =", value, "pclId");
            return (Criteria) this;
        }

        public Criteria andPclIdNotEqualTo(String value) {
            addCriterion("PCL_ID <>", value, "pclId");
            return (Criteria) this;
        }

        public Criteria andPclIdGreaterThan(String value) {
            addCriterion("PCL_ID >", value, "pclId");
            return (Criteria) this;
        }

        public Criteria andPclIdGreaterThanOrEqualTo(String value) {
            addCriterion("PCL_ID >=", value, "pclId");
            return (Criteria) this;
        }

        public Criteria andPclIdLessThan(String value) {
            addCriterion("PCL_ID <", value, "pclId");
            return (Criteria) this;
        }

        public Criteria andPclIdLessThanOrEqualTo(String value) {
            addCriterion("PCL_ID <=", value, "pclId");
            return (Criteria) this;
        }

        public Criteria andPclIdLike(String value) {
            addCriterion("PCL_ID like", value, "pclId");
            return (Criteria) this;
        }

        public Criteria andPclIdNotLike(String value) {
            addCriterion("PCL_ID not like", value, "pclId");
            return (Criteria) this;
        }

        public Criteria andPclIdIn(List<String> values) {
            addCriterion("PCL_ID in", values, "pclId");
            return (Criteria) this;
        }

        public Criteria andPclIdNotIn(List<String> values) {
            addCriterion("PCL_ID not in", values, "pclId");
            return (Criteria) this;
        }

        public Criteria andPclIdBetween(String value1, String value2) {
            addCriterion("PCL_ID between", value1, value2, "pclId");
            return (Criteria) this;
        }

        public Criteria andPclIdNotBetween(String value1, String value2) {
            addCriterion("PCL_ID not between", value1, value2, "pclId");
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

        public Criteria andBzNoIsNull() {
            addCriterion("BZ_NO is null");
            return (Criteria) this;
        }

        public Criteria andBzNoIsNotNull() {
            addCriterion("BZ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBzNoEqualTo(String value) {
            addCriterion("BZ_NO =", value, "bzNo");
            return (Criteria) this;
        }

        public Criteria andBzNoNotEqualTo(String value) {
            addCriterion("BZ_NO <>", value, "bzNo");
            return (Criteria) this;
        }

        public Criteria andBzNoGreaterThan(String value) {
            addCriterion("BZ_NO >", value, "bzNo");
            return (Criteria) this;
        }

        public Criteria andBzNoGreaterThanOrEqualTo(String value) {
            addCriterion("BZ_NO >=", value, "bzNo");
            return (Criteria) this;
        }

        public Criteria andBzNoLessThan(String value) {
            addCriterion("BZ_NO <", value, "bzNo");
            return (Criteria) this;
        }

        public Criteria andBzNoLessThanOrEqualTo(String value) {
            addCriterion("BZ_NO <=", value, "bzNo");
            return (Criteria) this;
        }

        public Criteria andBzNoLike(String value) {
            addCriterion("BZ_NO like", value, "bzNo");
            return (Criteria) this;
        }

        public Criteria andBzNoNotLike(String value) {
            addCriterion("BZ_NO not like", value, "bzNo");
            return (Criteria) this;
        }

        public Criteria andBzNoIn(List<String> values) {
            addCriterion("BZ_NO in", values, "bzNo");
            return (Criteria) this;
        }

        public Criteria andBzNoNotIn(List<String> values) {
            addCriterion("BZ_NO not in", values, "bzNo");
            return (Criteria) this;
        }

        public Criteria andBzNoBetween(String value1, String value2) {
            addCriterion("BZ_NO between", value1, value2, "bzNo");
            return (Criteria) this;
        }

        public Criteria andBzNoNotBetween(String value1, String value2) {
            addCriterion("BZ_NO not between", value1, value2, "bzNo");
            return (Criteria) this;
        }

        public Criteria andHsIdIsNull() {
            addCriterion("HS_ID is null");
            return (Criteria) this;
        }

        public Criteria andHsIdIsNotNull() {
            addCriterion("HS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHsIdEqualTo(String value) {
            addCriterion("HS_ID =", value, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdNotEqualTo(String value) {
            addCriterion("HS_ID <>", value, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdGreaterThan(String value) {
            addCriterion("HS_ID >", value, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdGreaterThanOrEqualTo(String value) {
            addCriterion("HS_ID >=", value, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdLessThan(String value) {
            addCriterion("HS_ID <", value, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdLessThanOrEqualTo(String value) {
            addCriterion("HS_ID <=", value, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdLike(String value) {
            addCriterion("HS_ID like", value, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdNotLike(String value) {
            addCriterion("HS_ID not like", value, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdIn(List<String> values) {
            addCriterion("HS_ID in", values, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdNotIn(List<String> values) {
            addCriterion("HS_ID not in", values, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdBetween(String value1, String value2) {
            addCriterion("HS_ID between", value1, value2, "hsId");
            return (Criteria) this;
        }

        public Criteria andHsIdNotBetween(String value1, String value2) {
            addCriterion("HS_ID not between", value1, value2, "hsId");
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

        public Criteria andSbNoIsNull() {
            addCriterion("SB_NO is null");
            return (Criteria) this;
        }

        public Criteria andSbNoIsNotNull() {
            addCriterion("SB_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSbNoEqualTo(String value) {
            addCriterion("SB_NO =", value, "sbNo");
            return (Criteria) this;
        }

        public Criteria andSbNoNotEqualTo(String value) {
            addCriterion("SB_NO <>", value, "sbNo");
            return (Criteria) this;
        }

        public Criteria andSbNoGreaterThan(String value) {
            addCriterion("SB_NO >", value, "sbNo");
            return (Criteria) this;
        }

        public Criteria andSbNoGreaterThanOrEqualTo(String value) {
            addCriterion("SB_NO >=", value, "sbNo");
            return (Criteria) this;
        }

        public Criteria andSbNoLessThan(String value) {
            addCriterion("SB_NO <", value, "sbNo");
            return (Criteria) this;
        }

        public Criteria andSbNoLessThanOrEqualTo(String value) {
            addCriterion("SB_NO <=", value, "sbNo");
            return (Criteria) this;
        }

        public Criteria andSbNoLike(String value) {
            addCriterion("SB_NO like", value, "sbNo");
            return (Criteria) this;
        }

        public Criteria andSbNoNotLike(String value) {
            addCriterion("SB_NO not like", value, "sbNo");
            return (Criteria) this;
        }

        public Criteria andSbNoIn(List<String> values) {
            addCriterion("SB_NO in", values, "sbNo");
            return (Criteria) this;
        }

        public Criteria andSbNoNotIn(List<String> values) {
            addCriterion("SB_NO not in", values, "sbNo");
            return (Criteria) this;
        }

        public Criteria andSbNoBetween(String value1, String value2) {
            addCriterion("SB_NO between", value1, value2, "sbNo");
            return (Criteria) this;
        }

        public Criteria andSbNoNotBetween(String value1, String value2) {
            addCriterion("SB_NO not between", value1, value2, "sbNo");
            return (Criteria) this;
        }

        public Criteria andMobIdIsNull() {
            addCriterion("MOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andMobIdIsNotNull() {
            addCriterion("MOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMobIdEqualTo(String value) {
            addCriterion("MOB_ID =", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotEqualTo(String value) {
            addCriterion("MOB_ID <>", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdGreaterThan(String value) {
            addCriterion("MOB_ID >", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdGreaterThanOrEqualTo(String value) {
            addCriterion("MOB_ID >=", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLessThan(String value) {
            addCriterion("MOB_ID <", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLessThanOrEqualTo(String value) {
            addCriterion("MOB_ID <=", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLike(String value) {
            addCriterion("MOB_ID like", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotLike(String value) {
            addCriterion("MOB_ID not like", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdIn(List<String> values) {
            addCriterion("MOB_ID in", values, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotIn(List<String> values) {
            addCriterion("MOB_ID not in", values, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdBetween(String value1, String value2) {
            addCriterion("MOB_ID between", value1, value2, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotBetween(String value1, String value2) {
            addCriterion("MOB_ID not between", value1, value2, "mobId");
            return (Criteria) this;
        }

        public Criteria andLockManIsNull() {
            addCriterion("LOCK_MAN is null");
            return (Criteria) this;
        }

        public Criteria andLockManIsNotNull() {
            addCriterion("LOCK_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andLockManEqualTo(String value) {
            addCriterion("LOCK_MAN =", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotEqualTo(String value) {
            addCriterion("LOCK_MAN <>", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManGreaterThan(String value) {
            addCriterion("LOCK_MAN >", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_MAN >=", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManLessThan(String value) {
            addCriterion("LOCK_MAN <", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManLessThanOrEqualTo(String value) {
            addCriterion("LOCK_MAN <=", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManLike(String value) {
            addCriterion("LOCK_MAN like", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotLike(String value) {
            addCriterion("LOCK_MAN not like", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManIn(List<String> values) {
            addCriterion("LOCK_MAN in", values, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotIn(List<String> values) {
            addCriterion("LOCK_MAN not in", values, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManBetween(String value1, String value2) {
            addCriterion("LOCK_MAN between", value1, value2, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotBetween(String value1, String value2) {
            addCriterion("LOCK_MAN not between", value1, value2, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockDateIsNull() {
            addCriterion("LOCK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLockDateIsNotNull() {
            addCriterion("LOCK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLockDateEqualTo(Date value) {
            addCriterion("LOCK_DATE =", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotEqualTo(Date value) {
            addCriterion("LOCK_DATE <>", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateGreaterThan(Date value) {
            addCriterion("LOCK_DATE >", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LOCK_DATE >=", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateLessThan(Date value) {
            addCriterion("LOCK_DATE <", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateLessThanOrEqualTo(Date value) {
            addCriterion("LOCK_DATE <=", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateIn(List<Date> values) {
            addCriterion("LOCK_DATE in", values, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotIn(List<Date> values) {
            addCriterion("LOCK_DATE not in", values, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateBetween(Date value1, Date value2) {
            addCriterion("LOCK_DATE between", value1, value2, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotBetween(Date value1, Date value2) {
            addCriterion("LOCK_DATE not between", value1, value2, "lockDate");
            return (Criteria) this;
        }

        public Criteria andIsovershIsNull() {
            addCriterion("ISOVERSH is null");
            return (Criteria) this;
        }

        public Criteria andIsovershIsNotNull() {
            addCriterion("ISOVERSH is not null");
            return (Criteria) this;
        }

        public Criteria andIsovershEqualTo(String value) {
            addCriterion("ISOVERSH =", value, "isoversh");
            return (Criteria) this;
        }

        public Criteria andIsovershNotEqualTo(String value) {
            addCriterion("ISOVERSH <>", value, "isoversh");
            return (Criteria) this;
        }

        public Criteria andIsovershGreaterThan(String value) {
            addCriterion("ISOVERSH >", value, "isoversh");
            return (Criteria) this;
        }

        public Criteria andIsovershGreaterThanOrEqualTo(String value) {
            addCriterion("ISOVERSH >=", value, "isoversh");
            return (Criteria) this;
        }

        public Criteria andIsovershLessThan(String value) {
            addCriterion("ISOVERSH <", value, "isoversh");
            return (Criteria) this;
        }

        public Criteria andIsovershLessThanOrEqualTo(String value) {
            addCriterion("ISOVERSH <=", value, "isoversh");
            return (Criteria) this;
        }

        public Criteria andIsovershLike(String value) {
            addCriterion("ISOVERSH like", value, "isoversh");
            return (Criteria) this;
        }

        public Criteria andIsovershNotLike(String value) {
            addCriterion("ISOVERSH not like", value, "isoversh");
            return (Criteria) this;
        }

        public Criteria andIsovershIn(List<String> values) {
            addCriterion("ISOVERSH in", values, "isoversh");
            return (Criteria) this;
        }

        public Criteria andIsovershNotIn(List<String> values) {
            addCriterion("ISOVERSH not in", values, "isoversh");
            return (Criteria) this;
        }

        public Criteria andIsovershBetween(String value1, String value2) {
            addCriterion("ISOVERSH between", value1, value2, "isoversh");
            return (Criteria) this;
        }

        public Criteria andIsovershNotBetween(String value1, String value2) {
            addCriterion("ISOVERSH not between", value1, value2, "isoversh");
            return (Criteria) this;
        }

        public Criteria andDjNoIsNull() {
            addCriterion("DJ_NO is null");
            return (Criteria) this;
        }

        public Criteria andDjNoIsNotNull() {
            addCriterion("DJ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDjNoEqualTo(String value) {
            addCriterion("DJ_NO =", value, "djNo");
            return (Criteria) this;
        }

        public Criteria andDjNoNotEqualTo(String value) {
            addCriterion("DJ_NO <>", value, "djNo");
            return (Criteria) this;
        }

        public Criteria andDjNoGreaterThan(String value) {
            addCriterion("DJ_NO >", value, "djNo");
            return (Criteria) this;
        }

        public Criteria andDjNoGreaterThanOrEqualTo(String value) {
            addCriterion("DJ_NO >=", value, "djNo");
            return (Criteria) this;
        }

        public Criteria andDjNoLessThan(String value) {
            addCriterion("DJ_NO <", value, "djNo");
            return (Criteria) this;
        }

        public Criteria andDjNoLessThanOrEqualTo(String value) {
            addCriterion("DJ_NO <=", value, "djNo");
            return (Criteria) this;
        }

        public Criteria andDjNoLike(String value) {
            addCriterion("DJ_NO like", value, "djNo");
            return (Criteria) this;
        }

        public Criteria andDjNoNotLike(String value) {
            addCriterion("DJ_NO not like", value, "djNo");
            return (Criteria) this;
        }

        public Criteria andDjNoIn(List<String> values) {
            addCriterion("DJ_NO in", values, "djNo");
            return (Criteria) this;
        }

        public Criteria andDjNoNotIn(List<String> values) {
            addCriterion("DJ_NO not in", values, "djNo");
            return (Criteria) this;
        }

        public Criteria andDjNoBetween(String value1, String value2) {
            addCriterion("DJ_NO between", value1, value2, "djNo");
            return (Criteria) this;
        }

        public Criteria andDjNoNotBetween(String value1, String value2) {
            addCriterion("DJ_NO not between", value1, value2, "djNo");
            return (Criteria) this;
        }

        public Criteria andFjNumIsNull() {
            addCriterion("FJ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andFjNumIsNotNull() {
            addCriterion("FJ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFjNumEqualTo(Short value) {
            addCriterion("FJ_NUM =", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumNotEqualTo(Short value) {
            addCriterion("FJ_NUM <>", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumGreaterThan(Short value) {
            addCriterion("FJ_NUM >", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumGreaterThanOrEqualTo(Short value) {
            addCriterion("FJ_NUM >=", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumLessThan(Short value) {
            addCriterion("FJ_NUM <", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumLessThanOrEqualTo(Short value) {
            addCriterion("FJ_NUM <=", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumIn(List<Short> values) {
            addCriterion("FJ_NUM in", values, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumNotIn(List<Short> values) {
            addCriterion("FJ_NUM not in", values, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumBetween(Short value1, Short value2) {
            addCriterion("FJ_NUM between", value1, value2, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumNotBetween(Short value1, Short value2) {
            addCriterion("FJ_NUM not between", value1, value2, "fjNum");
            return (Criteria) this;
        }

        public Criteria andCasNoIsNull() {
            addCriterion("CAS_NO is null");
            return (Criteria) this;
        }

        public Criteria andCasNoIsNotNull() {
            addCriterion("CAS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCasNoEqualTo(String value) {
            addCriterion("CAS_NO =", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoNotEqualTo(String value) {
            addCriterion("CAS_NO <>", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoGreaterThan(String value) {
            addCriterion("CAS_NO >", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoGreaterThanOrEqualTo(String value) {
            addCriterion("CAS_NO >=", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoLessThan(String value) {
            addCriterion("CAS_NO <", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoLessThanOrEqualTo(String value) {
            addCriterion("CAS_NO <=", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoLike(String value) {
            addCriterion("CAS_NO like", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoNotLike(String value) {
            addCriterion("CAS_NO not like", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoIn(List<String> values) {
            addCriterion("CAS_NO in", values, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoNotIn(List<String> values) {
            addCriterion("CAS_NO not in", values, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoBetween(String value1, String value2) {
            addCriterion("CAS_NO between", value1, value2, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoNotBetween(String value1, String value2) {
            addCriterion("CAS_NO not between", value1, value2, "casNo");
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

        public Criteria andInvDdIsNull() {
            addCriterion("INV_DD is null");
            return (Criteria) this;
        }

        public Criteria andInvDdIsNotNull() {
            addCriterion("INV_DD is not null");
            return (Criteria) this;
        }

        public Criteria andInvDdEqualTo(Date value) {
            addCriterion("INV_DD =", value, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdNotEqualTo(Date value) {
            addCriterion("INV_DD <>", value, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdGreaterThan(Date value) {
            addCriterion("INV_DD >", value, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdGreaterThanOrEqualTo(Date value) {
            addCriterion("INV_DD >=", value, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdLessThan(Date value) {
            addCriterion("INV_DD <", value, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdLessThanOrEqualTo(Date value) {
            addCriterion("INV_DD <=", value, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdIn(List<Date> values) {
            addCriterion("INV_DD in", values, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdNotIn(List<Date> values) {
            addCriterion("INV_DD not in", values, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdBetween(Date value1, Date value2) {
            addCriterion("INV_DD between", value1, value2, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdNotBetween(Date value1, Date value2) {
            addCriterion("INV_DD not between", value1, value2, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvYmIsNull() {
            addCriterion("INV_YM is null");
            return (Criteria) this;
        }

        public Criteria andInvYmIsNotNull() {
            addCriterion("INV_YM is not null");
            return (Criteria) this;
        }

        public Criteria andInvYmEqualTo(Integer value) {
            addCriterion("INV_YM =", value, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmNotEqualTo(Integer value) {
            addCriterion("INV_YM <>", value, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmGreaterThan(Integer value) {
            addCriterion("INV_YM >", value, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmGreaterThanOrEqualTo(Integer value) {
            addCriterion("INV_YM >=", value, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmLessThan(Integer value) {
            addCriterion("INV_YM <", value, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmLessThanOrEqualTo(Integer value) {
            addCriterion("INV_YM <=", value, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmIn(List<Integer> values) {
            addCriterion("INV_YM in", values, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmNotIn(List<Integer> values) {
            addCriterion("INV_YM not in", values, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmBetween(Integer value1, Integer value2) {
            addCriterion("INV_YM between", value1, value2, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmNotBetween(Integer value1, Integer value2) {
            addCriterion("INV_YM not between", value1, value2, "invYm");
            return (Criteria) this;
        }

        public Criteria andTitleBuyIsNull() {
            addCriterion("TITLE_BUY is null");
            return (Criteria) this;
        }

        public Criteria andTitleBuyIsNotNull() {
            addCriterion("TITLE_BUY is not null");
            return (Criteria) this;
        }

        public Criteria andTitleBuyEqualTo(String value) {
            addCriterion("TITLE_BUY =", value, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyNotEqualTo(String value) {
            addCriterion("TITLE_BUY <>", value, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyGreaterThan(String value) {
            addCriterion("TITLE_BUY >", value, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE_BUY >=", value, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyLessThan(String value) {
            addCriterion("TITLE_BUY <", value, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyLessThanOrEqualTo(String value) {
            addCriterion("TITLE_BUY <=", value, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyLike(String value) {
            addCriterion("TITLE_BUY like", value, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyNotLike(String value) {
            addCriterion("TITLE_BUY not like", value, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyIn(List<String> values) {
            addCriterion("TITLE_BUY in", values, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyNotIn(List<String> values) {
            addCriterion("TITLE_BUY not in", values, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyBetween(String value1, String value2) {
            addCriterion("TITLE_BUY between", value1, value2, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyNotBetween(String value1, String value2) {
            addCriterion("TITLE_BUY not between", value1, value2, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andMethIdIsNull() {
            addCriterion("METH_ID is null");
            return (Criteria) this;
        }

        public Criteria andMethIdIsNotNull() {
            addCriterion("METH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMethIdEqualTo(String value) {
            addCriterion("METH_ID =", value, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdNotEqualTo(String value) {
            addCriterion("METH_ID <>", value, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdGreaterThan(String value) {
            addCriterion("METH_ID >", value, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdGreaterThanOrEqualTo(String value) {
            addCriterion("METH_ID >=", value, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdLessThan(String value) {
            addCriterion("METH_ID <", value, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdLessThanOrEqualTo(String value) {
            addCriterion("METH_ID <=", value, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdLike(String value) {
            addCriterion("METH_ID like", value, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdNotLike(String value) {
            addCriterion("METH_ID not like", value, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdIn(List<String> values) {
            addCriterion("METH_ID in", values, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdNotIn(List<String> values) {
            addCriterion("METH_ID not in", values, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdBetween(String value1, String value2) {
            addCriterion("METH_ID between", value1, value2, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdNotBetween(String value1, String value2) {
            addCriterion("METH_ID not between", value1, value2, "methId");
            return (Criteria) this;
        }

        public Criteria andAmtInvIsNull() {
            addCriterion("AMT_INV is null");
            return (Criteria) this;
        }

        public Criteria andAmtInvIsNotNull() {
            addCriterion("AMT_INV is not null");
            return (Criteria) this;
        }

        public Criteria andAmtInvEqualTo(BigDecimal value) {
            addCriterion("AMT_INV =", value, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvNotEqualTo(BigDecimal value) {
            addCriterion("AMT_INV <>", value, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvGreaterThan(BigDecimal value) {
            addCriterion("AMT_INV >", value, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_INV >=", value, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvLessThan(BigDecimal value) {
            addCriterion("AMT_INV <", value, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_INV <=", value, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvIn(List<BigDecimal> values) {
            addCriterion("AMT_INV in", values, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvNotIn(List<BigDecimal> values) {
            addCriterion("AMT_INV not in", values, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_INV between", value1, value2, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_INV not between", value1, value2, "amtInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvIsNull() {
            addCriterion("TAX_INV is null");
            return (Criteria) this;
        }

        public Criteria andTaxInvIsNotNull() {
            addCriterion("TAX_INV is not null");
            return (Criteria) this;
        }

        public Criteria andTaxInvEqualTo(BigDecimal value) {
            addCriterion("TAX_INV =", value, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvNotEqualTo(BigDecimal value) {
            addCriterion("TAX_INV <>", value, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvGreaterThan(BigDecimal value) {
            addCriterion("TAX_INV >", value, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_INV >=", value, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvLessThan(BigDecimal value) {
            addCriterion("TAX_INV <", value, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_INV <=", value, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvIn(List<BigDecimal> values) {
            addCriterion("TAX_INV in", values, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvNotIn(List<BigDecimal> values) {
            addCriterion("TAX_INV not in", values, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_INV between", value1, value2, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_INV not between", value1, value2, "taxInv");
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

        public Criteria andFxWhIsNull() {
            addCriterion("FX_WH is null");
            return (Criteria) this;
        }

        public Criteria andFxWhIsNotNull() {
            addCriterion("FX_WH is not null");
            return (Criteria) this;
        }

        public Criteria andFxWhEqualTo(String value) {
            addCriterion("FX_WH =", value, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhNotEqualTo(String value) {
            addCriterion("FX_WH <>", value, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhGreaterThan(String value) {
            addCriterion("FX_WH >", value, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhGreaterThanOrEqualTo(String value) {
            addCriterion("FX_WH >=", value, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhLessThan(String value) {
            addCriterion("FX_WH <", value, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhLessThanOrEqualTo(String value) {
            addCriterion("FX_WH <=", value, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhLike(String value) {
            addCriterion("FX_WH like", value, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhNotLike(String value) {
            addCriterion("FX_WH not like", value, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhIn(List<String> values) {
            addCriterion("FX_WH in", values, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhNotIn(List<String> values) {
            addCriterion("FX_WH not in", values, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhBetween(String value1, String value2) {
            addCriterion("FX_WH between", value1, value2, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhNotBetween(String value1, String value2) {
            addCriterion("FX_WH not between", value1, value2, "fxWh");
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

        public Criteria andByboxIsNull() {
            addCriterion("BYBOX is null");
            return (Criteria) this;
        }

        public Criteria andByboxIsNotNull() {
            addCriterion("BYBOX is not null");
            return (Criteria) this;
        }

        public Criteria andByboxEqualTo(String value) {
            addCriterion("BYBOX =", value, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxNotEqualTo(String value) {
            addCriterion("BYBOX <>", value, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxGreaterThan(String value) {
            addCriterion("BYBOX >", value, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxGreaterThanOrEqualTo(String value) {
            addCriterion("BYBOX >=", value, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxLessThan(String value) {
            addCriterion("BYBOX <", value, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxLessThanOrEqualTo(String value) {
            addCriterion("BYBOX <=", value, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxLike(String value) {
            addCriterion("BYBOX like", value, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxNotLike(String value) {
            addCriterion("BYBOX not like", value, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxIn(List<String> values) {
            addCriterion("BYBOX in", values, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxNotIn(List<String> values) {
            addCriterion("BYBOX not in", values, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxBetween(String value1, String value2) {
            addCriterion("BYBOX between", value1, value2, "bybox");
            return (Criteria) this;
        }

        public Criteria andByboxNotBetween(String value1, String value2) {
            addCriterion("BYBOX not between", value1, value2, "bybox");
            return (Criteria) this;
        }

        public Criteria andTotQtyIsNull() {
            addCriterion("TOT_QTY is null");
            return (Criteria) this;
        }

        public Criteria andTotQtyIsNotNull() {
            addCriterion("TOT_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andTotQtyEqualTo(BigDecimal value) {
            addCriterion("TOT_QTY =", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyNotEqualTo(BigDecimal value) {
            addCriterion("TOT_QTY <>", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyGreaterThan(BigDecimal value) {
            addCriterion("TOT_QTY >", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOT_QTY >=", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyLessThan(BigDecimal value) {
            addCriterion("TOT_QTY <", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOT_QTY <=", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyIn(List<BigDecimal> values) {
            addCriterion("TOT_QTY in", values, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyNotIn(List<BigDecimal> values) {
            addCriterion("TOT_QTY not in", values, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOT_QTY between", value1, value2, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOT_QTY not between", value1, value2, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotBoxIsNull() {
            addCriterion("TOT_BOX is null");
            return (Criteria) this;
        }

        public Criteria andTotBoxIsNotNull() {
            addCriterion("TOT_BOX is not null");
            return (Criteria) this;
        }

        public Criteria andTotBoxEqualTo(BigDecimal value) {
            addCriterion("TOT_BOX =", value, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxNotEqualTo(BigDecimal value) {
            addCriterion("TOT_BOX <>", value, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxGreaterThan(BigDecimal value) {
            addCriterion("TOT_BOX >", value, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOT_BOX >=", value, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxLessThan(BigDecimal value) {
            addCriterion("TOT_BOX <", value, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOT_BOX <=", value, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxIn(List<BigDecimal> values) {
            addCriterion("TOT_BOX in", values, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxNotIn(List<BigDecimal> values) {
            addCriterion("TOT_BOX not in", values, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOT_BOX between", value1, value2, "totBox");
            return (Criteria) this;
        }

        public Criteria andTotBoxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOT_BOX not between", value1, value2, "totBox");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andPrtUsrIsNull() {
            addCriterion("PRT_USR is null");
            return (Criteria) this;
        }

        public Criteria andPrtUsrIsNotNull() {
            addCriterion("PRT_USR is not null");
            return (Criteria) this;
        }

        public Criteria andPrtUsrEqualTo(String value) {
            addCriterion("PRT_USR =", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrNotEqualTo(String value) {
            addCriterion("PRT_USR <>", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrGreaterThan(String value) {
            addCriterion("PRT_USR >", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrGreaterThanOrEqualTo(String value) {
            addCriterion("PRT_USR >=", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrLessThan(String value) {
            addCriterion("PRT_USR <", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrLessThanOrEqualTo(String value) {
            addCriterion("PRT_USR <=", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrLike(String value) {
            addCriterion("PRT_USR like", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrNotLike(String value) {
            addCriterion("PRT_USR not like", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrIn(List<String> values) {
            addCriterion("PRT_USR in", values, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrNotIn(List<String> values) {
            addCriterion("PRT_USR not in", values, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrBetween(String value1, String value2) {
            addCriterion("PRT_USR between", value1, value2, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrNotBetween(String value1, String value2) {
            addCriterion("PRT_USR not between", value1, value2, "prtUsr");
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

        public Criteria andCardNoIsNull() {
            addCriterion("CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("CARD_NO =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("CARD_NO <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("CARD_NO >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NO >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("CARD_NO <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("CARD_NO <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("CARD_NO like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("CARD_NO not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("CARD_NO in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("CARD_NO not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("CARD_NO between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("CARD_NO not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andSendAreaIsNull() {
            addCriterion("SEND_AREA is null");
            return (Criteria) this;
        }

        public Criteria andSendAreaIsNotNull() {
            addCriterion("SEND_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andSendAreaEqualTo(String value) {
            addCriterion("SEND_AREA =", value, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaNotEqualTo(String value) {
            addCriterion("SEND_AREA <>", value, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaGreaterThan(String value) {
            addCriterion("SEND_AREA >", value, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_AREA >=", value, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaLessThan(String value) {
            addCriterion("SEND_AREA <", value, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaLessThanOrEqualTo(String value) {
            addCriterion("SEND_AREA <=", value, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaLike(String value) {
            addCriterion("SEND_AREA like", value, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaNotLike(String value) {
            addCriterion("SEND_AREA not like", value, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaIn(List<String> values) {
            addCriterion("SEND_AREA in", values, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaNotIn(List<String> values) {
            addCriterion("SEND_AREA not in", values, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaBetween(String value1, String value2) {
            addCriterion("SEND_AREA between", value1, value2, "sendArea");
            return (Criteria) this;
        }

        public Criteria andSendAreaNotBetween(String value1, String value2) {
            addCriterion("SEND_AREA not between", value1, value2, "sendArea");
            return (Criteria) this;
        }

        public Criteria andJfendDdIsNull() {
            addCriterion("JFEND_DD is null");
            return (Criteria) this;
        }

        public Criteria andJfendDdIsNotNull() {
            addCriterion("JFEND_DD is not null");
            return (Criteria) this;
        }

        public Criteria andJfendDdEqualTo(Date value) {
            addCriterion("JFEND_DD =", value, "jfendDd");
            return (Criteria) this;
        }

        public Criteria andJfendDdNotEqualTo(Date value) {
            addCriterion("JFEND_DD <>", value, "jfendDd");
            return (Criteria) this;
        }

        public Criteria andJfendDdGreaterThan(Date value) {
            addCriterion("JFEND_DD >", value, "jfendDd");
            return (Criteria) this;
        }

        public Criteria andJfendDdGreaterThanOrEqualTo(Date value) {
            addCriterion("JFEND_DD >=", value, "jfendDd");
            return (Criteria) this;
        }

        public Criteria andJfendDdLessThan(Date value) {
            addCriterion("JFEND_DD <", value, "jfendDd");
            return (Criteria) this;
        }

        public Criteria andJfendDdLessThanOrEqualTo(Date value) {
            addCriterion("JFEND_DD <=", value, "jfendDd");
            return (Criteria) this;
        }

        public Criteria andJfendDdIn(List<Date> values) {
            addCriterion("JFEND_DD in", values, "jfendDd");
            return (Criteria) this;
        }

        public Criteria andJfendDdNotIn(List<Date> values) {
            addCriterion("JFEND_DD not in", values, "jfendDd");
            return (Criteria) this;
        }

        public Criteria andJfendDdBetween(Date value1, Date value2) {
            addCriterion("JFEND_DD between", value1, value2, "jfendDd");
            return (Criteria) this;
        }

        public Criteria andJfendDdNotBetween(Date value1, Date value2) {
            addCriterion("JFEND_DD not between", value1, value2, "jfendDd");
            return (Criteria) this;
        }

        public Criteria andSgIdIsNull() {
            addCriterion("SG_ID is null");
            return (Criteria) this;
        }

        public Criteria andSgIdIsNotNull() {
            addCriterion("SG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSgIdEqualTo(String value) {
            addCriterion("SG_ID =", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdNotEqualTo(String value) {
            addCriterion("SG_ID <>", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdGreaterThan(String value) {
            addCriterion("SG_ID >", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdGreaterThanOrEqualTo(String value) {
            addCriterion("SG_ID >=", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdLessThan(String value) {
            addCriterion("SG_ID <", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdLessThanOrEqualTo(String value) {
            addCriterion("SG_ID <=", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdLike(String value) {
            addCriterion("SG_ID like", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdNotLike(String value) {
            addCriterion("SG_ID not like", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdIn(List<String> values) {
            addCriterion("SG_ID in", values, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdNotIn(List<String> values) {
            addCriterion("SG_ID not in", values, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdBetween(String value1, String value2) {
            addCriterion("SG_ID between", value1, value2, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdNotBetween(String value1, String value2) {
            addCriterion("SG_ID not between", value1, value2, "sgId");
            return (Criteria) this;
        }

        public Criteria andPrtNumIsNull() {
            addCriterion("PRT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPrtNumIsNotNull() {
            addCriterion("PRT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPrtNumEqualTo(Integer value) {
            addCriterion("PRT_NUM =", value, "prtNum");
            return (Criteria) this;
        }

        public Criteria andPrtNumNotEqualTo(Integer value) {
            addCriterion("PRT_NUM <>", value, "prtNum");
            return (Criteria) this;
        }

        public Criteria andPrtNumGreaterThan(Integer value) {
            addCriterion("PRT_NUM >", value, "prtNum");
            return (Criteria) this;
        }

        public Criteria andPrtNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRT_NUM >=", value, "prtNum");
            return (Criteria) this;
        }

        public Criteria andPrtNumLessThan(Integer value) {
            addCriterion("PRT_NUM <", value, "prtNum");
            return (Criteria) this;
        }

        public Criteria andPrtNumLessThanOrEqualTo(Integer value) {
            addCriterion("PRT_NUM <=", value, "prtNum");
            return (Criteria) this;
        }

        public Criteria andPrtNumIn(List<Integer> values) {
            addCriterion("PRT_NUM in", values, "prtNum");
            return (Criteria) this;
        }

        public Criteria andPrtNumNotIn(List<Integer> values) {
            addCriterion("PRT_NUM not in", values, "prtNum");
            return (Criteria) this;
        }

        public Criteria andPrtNumBetween(Integer value1, Integer value2) {
            addCriterion("PRT_NUM between", value1, value2, "prtNum");
            return (Criteria) this;
        }

        public Criteria andPrtNumNotBetween(Integer value1, Integer value2) {
            addCriterion("PRT_NUM not between", value1, value2, "prtNum");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNull() {
            addCriterion("PAY_NO is null");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNotNull() {
            addCriterion("PAY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPayNoEqualTo(String value) {
            addCriterion("PAY_NO =", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotEqualTo(String value) {
            addCriterion("PAY_NO <>", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThan(String value) {
            addCriterion("PAY_NO >", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_NO >=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThan(String value) {
            addCriterion("PAY_NO <", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThanOrEqualTo(String value) {
            addCriterion("PAY_NO <=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLike(String value) {
            addCriterion("PAY_NO like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotLike(String value) {
            addCriterion("PAY_NO not like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoIn(List<String> values) {
            addCriterion("PAY_NO in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotIn(List<String> values) {
            addCriterion("PAY_NO not in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoBetween(String value1, String value2) {
            addCriterion("PAY_NO between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotBetween(String value1, String value2) {
            addCriterion("PAY_NO not between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andAmtnYjbxIsNull() {
            addCriterion("AMTN_YJBX is null");
            return (Criteria) this;
        }

        public Criteria andAmtnYjbxIsNotNull() {
            addCriterion("AMTN_YJBX is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnYjbxEqualTo(BigDecimal value) {
            addCriterion("AMTN_YJBX =", value, "amtnYjbx");
            return (Criteria) this;
        }

        public Criteria andAmtnYjbxNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_YJBX <>", value, "amtnYjbx");
            return (Criteria) this;
        }

        public Criteria andAmtnYjbxGreaterThan(BigDecimal value) {
            addCriterion("AMTN_YJBX >", value, "amtnYjbx");
            return (Criteria) this;
        }

        public Criteria andAmtnYjbxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_YJBX >=", value, "amtnYjbx");
            return (Criteria) this;
        }

        public Criteria andAmtnYjbxLessThan(BigDecimal value) {
            addCriterion("AMTN_YJBX <", value, "amtnYjbx");
            return (Criteria) this;
        }

        public Criteria andAmtnYjbxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_YJBX <=", value, "amtnYjbx");
            return (Criteria) this;
        }

        public Criteria andAmtnYjbxIn(List<BigDecimal> values) {
            addCriterion("AMTN_YJBX in", values, "amtnYjbx");
            return (Criteria) this;
        }

        public Criteria andAmtnYjbxNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_YJBX not in", values, "amtnYjbx");
            return (Criteria) this;
        }

        public Criteria andAmtnYjbxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_YJBX between", value1, value2, "amtnYjbx");
            return (Criteria) this;
        }

        public Criteria andAmtnYjbxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_YJBX not between", value1, value2, "amtnYjbx");
            return (Criteria) this;
        }

        public Criteria andAmtnBxIsNull() {
            addCriterion("AMTN_BX is null");
            return (Criteria) this;
        }

        public Criteria andAmtnBxIsNotNull() {
            addCriterion("AMTN_BX is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnBxEqualTo(BigDecimal value) {
            addCriterion("AMTN_BX =", value, "amtnBx");
            return (Criteria) this;
        }

        public Criteria andAmtnBxNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_BX <>", value, "amtnBx");
            return (Criteria) this;
        }

        public Criteria andAmtnBxGreaterThan(BigDecimal value) {
            addCriterion("AMTN_BX >", value, "amtnBx");
            return (Criteria) this;
        }

        public Criteria andAmtnBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_BX >=", value, "amtnBx");
            return (Criteria) this;
        }

        public Criteria andAmtnBxLessThan(BigDecimal value) {
            addCriterion("AMTN_BX <", value, "amtnBx");
            return (Criteria) this;
        }

        public Criteria andAmtnBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_BX <=", value, "amtnBx");
            return (Criteria) this;
        }

        public Criteria andAmtnBxIn(List<BigDecimal> values) {
            addCriterion("AMTN_BX in", values, "amtnBx");
            return (Criteria) this;
        }

        public Criteria andAmtnBxNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_BX not in", values, "amtnBx");
            return (Criteria) this;
        }

        public Criteria andAmtnBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_BX between", value1, value2, "amtnBx");
            return (Criteria) this;
        }

        public Criteria andAmtnBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_BX not between", value1, value2, "amtnBx");
            return (Criteria) this;
        }

        public Criteria andIssvsIsNull() {
            addCriterion("ISSVS is null");
            return (Criteria) this;
        }

        public Criteria andIssvsIsNotNull() {
            addCriterion("ISSVS is not null");
            return (Criteria) this;
        }

        public Criteria andIssvsEqualTo(String value) {
            addCriterion("ISSVS =", value, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsNotEqualTo(String value) {
            addCriterion("ISSVS <>", value, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsGreaterThan(String value) {
            addCriterion("ISSVS >", value, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsGreaterThanOrEqualTo(String value) {
            addCriterion("ISSVS >=", value, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsLessThan(String value) {
            addCriterion("ISSVS <", value, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsLessThanOrEqualTo(String value) {
            addCriterion("ISSVS <=", value, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsLike(String value) {
            addCriterion("ISSVS like", value, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsNotLike(String value) {
            addCriterion("ISSVS not like", value, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsIn(List<String> values) {
            addCriterion("ISSVS in", values, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsNotIn(List<String> values) {
            addCriterion("ISSVS not in", values, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsBetween(String value1, String value2) {
            addCriterion("ISSVS between", value1, value2, "issvs");
            return (Criteria) this;
        }

        public Criteria andIssvsNotBetween(String value1, String value2) {
            addCriterion("ISSVS not between", value1, value2, "issvs");
            return (Criteria) this;
        }

        public Criteria andBilMarkIsNull() {
            addCriterion("BIL_MARK is null");
            return (Criteria) this;
        }

        public Criteria andBilMarkIsNotNull() {
            addCriterion("BIL_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andBilMarkEqualTo(String value) {
            addCriterion("BIL_MARK =", value, "bilMark");
            return (Criteria) this;
        }

        public Criteria andBilMarkNotEqualTo(String value) {
            addCriterion("BIL_MARK <>", value, "bilMark");
            return (Criteria) this;
        }

        public Criteria andBilMarkGreaterThan(String value) {
            addCriterion("BIL_MARK >", value, "bilMark");
            return (Criteria) this;
        }

        public Criteria andBilMarkGreaterThanOrEqualTo(String value) {
            addCriterion("BIL_MARK >=", value, "bilMark");
            return (Criteria) this;
        }

        public Criteria andBilMarkLessThan(String value) {
            addCriterion("BIL_MARK <", value, "bilMark");
            return (Criteria) this;
        }

        public Criteria andBilMarkLessThanOrEqualTo(String value) {
            addCriterion("BIL_MARK <=", value, "bilMark");
            return (Criteria) this;
        }

        public Criteria andBilMarkLike(String value) {
            addCriterion("BIL_MARK like", value, "bilMark");
            return (Criteria) this;
        }

        public Criteria andBilMarkNotLike(String value) {
            addCriterion("BIL_MARK not like", value, "bilMark");
            return (Criteria) this;
        }

        public Criteria andBilMarkIn(List<String> values) {
            addCriterion("BIL_MARK in", values, "bilMark");
            return (Criteria) this;
        }

        public Criteria andBilMarkNotIn(List<String> values) {
            addCriterion("BIL_MARK not in", values, "bilMark");
            return (Criteria) this;
        }

        public Criteria andBilMarkBetween(String value1, String value2) {
            addCriterion("BIL_MARK between", value1, value2, "bilMark");
            return (Criteria) this;
        }

        public Criteria andBilMarkNotBetween(String value1, String value2) {
            addCriterion("BIL_MARK not between", value1, value2, "bilMark");
            return (Criteria) this;
        }

        public Criteria andChkFxIsNull() {
            addCriterion("CHK_FX is null");
            return (Criteria) this;
        }

        public Criteria andChkFxIsNotNull() {
            addCriterion("CHK_FX is not null");
            return (Criteria) this;
        }

        public Criteria andChkFxEqualTo(String value) {
            addCriterion("CHK_FX =", value, "chkFx");
            return (Criteria) this;
        }

        public Criteria andChkFxNotEqualTo(String value) {
            addCriterion("CHK_FX <>", value, "chkFx");
            return (Criteria) this;
        }

        public Criteria andChkFxGreaterThan(String value) {
            addCriterion("CHK_FX >", value, "chkFx");
            return (Criteria) this;
        }

        public Criteria andChkFxGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_FX >=", value, "chkFx");
            return (Criteria) this;
        }

        public Criteria andChkFxLessThan(String value) {
            addCriterion("CHK_FX <", value, "chkFx");
            return (Criteria) this;
        }

        public Criteria andChkFxLessThanOrEqualTo(String value) {
            addCriterion("CHK_FX <=", value, "chkFx");
            return (Criteria) this;
        }

        public Criteria andChkFxLike(String value) {
            addCriterion("CHK_FX like", value, "chkFx");
            return (Criteria) this;
        }

        public Criteria andChkFxNotLike(String value) {
            addCriterion("CHK_FX not like", value, "chkFx");
            return (Criteria) this;
        }

        public Criteria andChkFxIn(List<String> values) {
            addCriterion("CHK_FX in", values, "chkFx");
            return (Criteria) this;
        }

        public Criteria andChkFxNotIn(List<String> values) {
            addCriterion("CHK_FX not in", values, "chkFx");
            return (Criteria) this;
        }

        public Criteria andChkFxBetween(String value1, String value2) {
            addCriterion("CHK_FX between", value1, value2, "chkFx");
            return (Criteria) this;
        }

        public Criteria andChkFxNotBetween(String value1, String value2) {
            addCriterion("CHK_FX not between", value1, value2, "chkFx");
            return (Criteria) this;
        }

        public Criteria andHasFxIsNull() {
            addCriterion("HAS_FX is null");
            return (Criteria) this;
        }

        public Criteria andHasFxIsNotNull() {
            addCriterion("HAS_FX is not null");
            return (Criteria) this;
        }

        public Criteria andHasFxEqualTo(String value) {
            addCriterion("HAS_FX =", value, "hasFx");
            return (Criteria) this;
        }

        public Criteria andHasFxNotEqualTo(String value) {
            addCriterion("HAS_FX <>", value, "hasFx");
            return (Criteria) this;
        }

        public Criteria andHasFxGreaterThan(String value) {
            addCriterion("HAS_FX >", value, "hasFx");
            return (Criteria) this;
        }

        public Criteria andHasFxGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_FX >=", value, "hasFx");
            return (Criteria) this;
        }

        public Criteria andHasFxLessThan(String value) {
            addCriterion("HAS_FX <", value, "hasFx");
            return (Criteria) this;
        }

        public Criteria andHasFxLessThanOrEqualTo(String value) {
            addCriterion("HAS_FX <=", value, "hasFx");
            return (Criteria) this;
        }

        public Criteria andHasFxLike(String value) {
            addCriterion("HAS_FX like", value, "hasFx");
            return (Criteria) this;
        }

        public Criteria andHasFxNotLike(String value) {
            addCriterion("HAS_FX not like", value, "hasFx");
            return (Criteria) this;
        }

        public Criteria andHasFxIn(List<String> values) {
            addCriterion("HAS_FX in", values, "hasFx");
            return (Criteria) this;
        }

        public Criteria andHasFxNotIn(List<String> values) {
            addCriterion("HAS_FX not in", values, "hasFx");
            return (Criteria) this;
        }

        public Criteria andHasFxBetween(String value1, String value2) {
            addCriterion("HAS_FX between", value1, value2, "hasFx");
            return (Criteria) this;
        }

        public Criteria andHasFxNotBetween(String value1, String value2) {
            addCriterion("HAS_FX not between", value1, value2, "hasFx");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacIsNull() {
            addCriterion("AMTN_CBAC is null");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacIsNotNull() {
            addCriterion("AMTN_CBAC is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacEqualTo(BigDecimal value) {
            addCriterion("AMTN_CBAC =", value, "amtnCbac");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_CBAC <>", value, "amtnCbac");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacGreaterThan(BigDecimal value) {
            addCriterion("AMTN_CBAC >", value, "amtnCbac");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_CBAC >=", value, "amtnCbac");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacLessThan(BigDecimal value) {
            addCriterion("AMTN_CBAC <", value, "amtnCbac");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_CBAC <=", value, "amtnCbac");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacIn(List<BigDecimal> values) {
            addCriterion("AMTN_CBAC in", values, "amtnCbac");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_CBAC not in", values, "amtnCbac");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_CBAC between", value1, value2, "amtnCbac");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_CBAC not between", value1, value2, "amtnCbac");
            return (Criteria) this;
        }

        public Criteria andCbacClsIsNull() {
            addCriterion("CBAC_CLS is null");
            return (Criteria) this;
        }

        public Criteria andCbacClsIsNotNull() {
            addCriterion("CBAC_CLS is not null");
            return (Criteria) this;
        }

        public Criteria andCbacClsEqualTo(String value) {
            addCriterion("CBAC_CLS =", value, "cbacCls");
            return (Criteria) this;
        }

        public Criteria andCbacClsNotEqualTo(String value) {
            addCriterion("CBAC_CLS <>", value, "cbacCls");
            return (Criteria) this;
        }

        public Criteria andCbacClsGreaterThan(String value) {
            addCriterion("CBAC_CLS >", value, "cbacCls");
            return (Criteria) this;
        }

        public Criteria andCbacClsGreaterThanOrEqualTo(String value) {
            addCriterion("CBAC_CLS >=", value, "cbacCls");
            return (Criteria) this;
        }

        public Criteria andCbacClsLessThan(String value) {
            addCriterion("CBAC_CLS <", value, "cbacCls");
            return (Criteria) this;
        }

        public Criteria andCbacClsLessThanOrEqualTo(String value) {
            addCriterion("CBAC_CLS <=", value, "cbacCls");
            return (Criteria) this;
        }

        public Criteria andCbacClsLike(String value) {
            addCriterion("CBAC_CLS like", value, "cbacCls");
            return (Criteria) this;
        }

        public Criteria andCbacClsNotLike(String value) {
            addCriterion("CBAC_CLS not like", value, "cbacCls");
            return (Criteria) this;
        }

        public Criteria andCbacClsIn(List<String> values) {
            addCriterion("CBAC_CLS in", values, "cbacCls");
            return (Criteria) this;
        }

        public Criteria andCbacClsNotIn(List<String> values) {
            addCriterion("CBAC_CLS not in", values, "cbacCls");
            return (Criteria) this;
        }

        public Criteria andCbacClsBetween(String value1, String value2) {
            addCriterion("CBAC_CLS between", value1, value2, "cbacCls");
            return (Criteria) this;
        }

        public Criteria andCbacClsNotBetween(String value1, String value2) {
            addCriterion("CBAC_CLS not between", value1, value2, "cbacCls");
            return (Criteria) this;
        }

        public Criteria andInvChkIsNull() {
            addCriterion("INV_CHK is null");
            return (Criteria) this;
        }

        public Criteria andInvChkIsNotNull() {
            addCriterion("INV_CHK is not null");
            return (Criteria) this;
        }

        public Criteria andInvChkEqualTo(String value) {
            addCriterion("INV_CHK =", value, "invChk");
            return (Criteria) this;
        }

        public Criteria andInvChkNotEqualTo(String value) {
            addCriterion("INV_CHK <>", value, "invChk");
            return (Criteria) this;
        }

        public Criteria andInvChkGreaterThan(String value) {
            addCriterion("INV_CHK >", value, "invChk");
            return (Criteria) this;
        }

        public Criteria andInvChkGreaterThanOrEqualTo(String value) {
            addCriterion("INV_CHK >=", value, "invChk");
            return (Criteria) this;
        }

        public Criteria andInvChkLessThan(String value) {
            addCriterion("INV_CHK <", value, "invChk");
            return (Criteria) this;
        }

        public Criteria andInvChkLessThanOrEqualTo(String value) {
            addCriterion("INV_CHK <=", value, "invChk");
            return (Criteria) this;
        }

        public Criteria andInvChkLike(String value) {
            addCriterion("INV_CHK like", value, "invChk");
            return (Criteria) this;
        }

        public Criteria andInvChkNotLike(String value) {
            addCriterion("INV_CHK not like", value, "invChk");
            return (Criteria) this;
        }

        public Criteria andInvChkIn(List<String> values) {
            addCriterion("INV_CHK in", values, "invChk");
            return (Criteria) this;
        }

        public Criteria andInvChkNotIn(List<String> values) {
            addCriterion("INV_CHK not in", values, "invChk");
            return (Criteria) this;
        }

        public Criteria andInvChkBetween(String value1, String value2) {
            addCriterion("INV_CHK between", value1, value2, "invChk");
            return (Criteria) this;
        }

        public Criteria andInvChkNotBetween(String value1, String value2) {
            addCriterion("INV_CHK not between", value1, value2, "invChk");
            return (Criteria) this;
        }

        public Criteria andInvUniNoIsNull() {
            addCriterion("INV_UNI_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvUniNoIsNotNull() {
            addCriterion("INV_UNI_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvUniNoEqualTo(String value) {
            addCriterion("INV_UNI_NO =", value, "invUniNo");
            return (Criteria) this;
        }

        public Criteria andInvUniNoNotEqualTo(String value) {
            addCriterion("INV_UNI_NO <>", value, "invUniNo");
            return (Criteria) this;
        }

        public Criteria andInvUniNoGreaterThan(String value) {
            addCriterion("INV_UNI_NO >", value, "invUniNo");
            return (Criteria) this;
        }

        public Criteria andInvUniNoGreaterThanOrEqualTo(String value) {
            addCriterion("INV_UNI_NO >=", value, "invUniNo");
            return (Criteria) this;
        }

        public Criteria andInvUniNoLessThan(String value) {
            addCriterion("INV_UNI_NO <", value, "invUniNo");
            return (Criteria) this;
        }

        public Criteria andInvUniNoLessThanOrEqualTo(String value) {
            addCriterion("INV_UNI_NO <=", value, "invUniNo");
            return (Criteria) this;
        }

        public Criteria andInvUniNoLike(String value) {
            addCriterion("INV_UNI_NO like", value, "invUniNo");
            return (Criteria) this;
        }

        public Criteria andInvUniNoNotLike(String value) {
            addCriterion("INV_UNI_NO not like", value, "invUniNo");
            return (Criteria) this;
        }

        public Criteria andInvUniNoIn(List<String> values) {
            addCriterion("INV_UNI_NO in", values, "invUniNo");
            return (Criteria) this;
        }

        public Criteria andInvUniNoNotIn(List<String> values) {
            addCriterion("INV_UNI_NO not in", values, "invUniNo");
            return (Criteria) this;
        }

        public Criteria andInvUniNoBetween(String value1, String value2) {
            addCriterion("INV_UNI_NO between", value1, value2, "invUniNo");
            return (Criteria) this;
        }

        public Criteria andInvUniNoNotBetween(String value1, String value2) {
            addCriterion("INV_UNI_NO not between", value1, value2, "invUniNo");
            return (Criteria) this;
        }

        public Criteria andInvTitleIsNull() {
            addCriterion("INV_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andInvTitleIsNotNull() {
            addCriterion("INV_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andInvTitleEqualTo(String value) {
            addCriterion("INV_TITLE =", value, "invTitle");
            return (Criteria) this;
        }

        public Criteria andInvTitleNotEqualTo(String value) {
            addCriterion("INV_TITLE <>", value, "invTitle");
            return (Criteria) this;
        }

        public Criteria andInvTitleGreaterThan(String value) {
            addCriterion("INV_TITLE >", value, "invTitle");
            return (Criteria) this;
        }

        public Criteria andInvTitleGreaterThanOrEqualTo(String value) {
            addCriterion("INV_TITLE >=", value, "invTitle");
            return (Criteria) this;
        }

        public Criteria andInvTitleLessThan(String value) {
            addCriterion("INV_TITLE <", value, "invTitle");
            return (Criteria) this;
        }

        public Criteria andInvTitleLessThanOrEqualTo(String value) {
            addCriterion("INV_TITLE <=", value, "invTitle");
            return (Criteria) this;
        }

        public Criteria andInvTitleLike(String value) {
            addCriterion("INV_TITLE like", value, "invTitle");
            return (Criteria) this;
        }

        public Criteria andInvTitleNotLike(String value) {
            addCriterion("INV_TITLE not like", value, "invTitle");
            return (Criteria) this;
        }

        public Criteria andInvTitleIn(List<String> values) {
            addCriterion("INV_TITLE in", values, "invTitle");
            return (Criteria) this;
        }

        public Criteria andInvTitleNotIn(List<String> values) {
            addCriterion("INV_TITLE not in", values, "invTitle");
            return (Criteria) this;
        }

        public Criteria andInvTitleBetween(String value1, String value2) {
            addCriterion("INV_TITLE between", value1, value2, "invTitle");
            return (Criteria) this;
        }

        public Criteria andInvTitleNotBetween(String value1, String value2) {
            addCriterion("INV_TITLE not between", value1, value2, "invTitle");
            return (Criteria) this;
        }

        public Criteria andInvAmtIsNull() {
            addCriterion("INV_AMT is null");
            return (Criteria) this;
        }

        public Criteria andInvAmtIsNotNull() {
            addCriterion("INV_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andInvAmtEqualTo(BigDecimal value) {
            addCriterion("INV_AMT =", value, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtNotEqualTo(BigDecimal value) {
            addCriterion("INV_AMT <>", value, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtGreaterThan(BigDecimal value) {
            addCriterion("INV_AMT >", value, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INV_AMT >=", value, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtLessThan(BigDecimal value) {
            addCriterion("INV_AMT <", value, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INV_AMT <=", value, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtIn(List<BigDecimal> values) {
            addCriterion("INV_AMT in", values, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtNotIn(List<BigDecimal> values) {
            addCriterion("INV_AMT not in", values, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INV_AMT between", value1, value2, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INV_AMT not between", value1, value2, "invAmt");
            return (Criteria) this;
        }

        public Criteria andPayB2cIsNull() {
            addCriterion("PAY_B2C is null");
            return (Criteria) this;
        }

        public Criteria andPayB2cIsNotNull() {
            addCriterion("PAY_B2C is not null");
            return (Criteria) this;
        }

        public Criteria andPayB2cEqualTo(String value) {
            addCriterion("PAY_B2C =", value, "payB2c");
            return (Criteria) this;
        }

        public Criteria andPayB2cNotEqualTo(String value) {
            addCriterion("PAY_B2C <>", value, "payB2c");
            return (Criteria) this;
        }

        public Criteria andPayB2cGreaterThan(String value) {
            addCriterion("PAY_B2C >", value, "payB2c");
            return (Criteria) this;
        }

        public Criteria andPayB2cGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_B2C >=", value, "payB2c");
            return (Criteria) this;
        }

        public Criteria andPayB2cLessThan(String value) {
            addCriterion("PAY_B2C <", value, "payB2c");
            return (Criteria) this;
        }

        public Criteria andPayB2cLessThanOrEqualTo(String value) {
            addCriterion("PAY_B2C <=", value, "payB2c");
            return (Criteria) this;
        }

        public Criteria andPayB2cLike(String value) {
            addCriterion("PAY_B2C like", value, "payB2c");
            return (Criteria) this;
        }

        public Criteria andPayB2cNotLike(String value) {
            addCriterion("PAY_B2C not like", value, "payB2c");
            return (Criteria) this;
        }

        public Criteria andPayB2cIn(List<String> values) {
            addCriterion("PAY_B2C in", values, "payB2c");
            return (Criteria) this;
        }

        public Criteria andPayB2cNotIn(List<String> values) {
            addCriterion("PAY_B2C not in", values, "payB2c");
            return (Criteria) this;
        }

        public Criteria andPayB2cBetween(String value1, String value2) {
            addCriterion("PAY_B2C between", value1, value2, "payB2c");
            return (Criteria) this;
        }

        public Criteria andPayB2cNotBetween(String value1, String value2) {
            addCriterion("PAY_B2C not between", value1, value2, "payB2c");
            return (Criteria) this;
        }

        public Criteria andCancelIdIsNull() {
            addCriterion("CANCEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCancelIdIsNotNull() {
            addCriterion("CANCEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCancelIdEqualTo(String value) {
            addCriterion("CANCEL_ID =", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotEqualTo(String value) {
            addCriterion("CANCEL_ID <>", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdGreaterThan(String value) {
            addCriterion("CANCEL_ID >", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_ID >=", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdLessThan(String value) {
            addCriterion("CANCEL_ID <", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_ID <=", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdLike(String value) {
            addCriterion("CANCEL_ID like", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotLike(String value) {
            addCriterion("CANCEL_ID not like", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdIn(List<String> values) {
            addCriterion("CANCEL_ID in", values, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotIn(List<String> values) {
            addCriterion("CANCEL_ID not in", values, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdBetween(String value1, String value2) {
            addCriterion("CANCEL_ID between", value1, value2, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotBetween(String value1, String value2) {
            addCriterion("CANCEL_ID not between", value1, value2, "cancelId");
            return (Criteria) this;
        }

        public Criteria andSgId1IsNull() {
            addCriterion("SG_ID1 is null");
            return (Criteria) this;
        }

        public Criteria andSgId1IsNotNull() {
            addCriterion("SG_ID1 is not null");
            return (Criteria) this;
        }

        public Criteria andSgId1EqualTo(String value) {
            addCriterion("SG_ID1 =", value, "sgId1");
            return (Criteria) this;
        }

        public Criteria andSgId1NotEqualTo(String value) {
            addCriterion("SG_ID1 <>", value, "sgId1");
            return (Criteria) this;
        }

        public Criteria andSgId1GreaterThan(String value) {
            addCriterion("SG_ID1 >", value, "sgId1");
            return (Criteria) this;
        }

        public Criteria andSgId1GreaterThanOrEqualTo(String value) {
            addCriterion("SG_ID1 >=", value, "sgId1");
            return (Criteria) this;
        }

        public Criteria andSgId1LessThan(String value) {
            addCriterion("SG_ID1 <", value, "sgId1");
            return (Criteria) this;
        }

        public Criteria andSgId1LessThanOrEqualTo(String value) {
            addCriterion("SG_ID1 <=", value, "sgId1");
            return (Criteria) this;
        }

        public Criteria andSgId1Like(String value) {
            addCriterion("SG_ID1 like", value, "sgId1");
            return (Criteria) this;
        }

        public Criteria andSgId1NotLike(String value) {
            addCriterion("SG_ID1 not like", value, "sgId1");
            return (Criteria) this;
        }

        public Criteria andSgId1In(List<String> values) {
            addCriterion("SG_ID1 in", values, "sgId1");
            return (Criteria) this;
        }

        public Criteria andSgId1NotIn(List<String> values) {
            addCriterion("SG_ID1 not in", values, "sgId1");
            return (Criteria) this;
        }

        public Criteria andSgId1Between(String value1, String value2) {
            addCriterion("SG_ID1 between", value1, value2, "sgId1");
            return (Criteria) this;
        }

        public Criteria andSgId1NotBetween(String value1, String value2) {
            addCriterion("SG_ID1 not between", value1, value2, "sgId1");
            return (Criteria) this;
        }

        public Criteria andBilCompIsNull() {
            addCriterion("BIL_COMP is null");
            return (Criteria) this;
        }

        public Criteria andBilCompIsNotNull() {
            addCriterion("BIL_COMP is not null");
            return (Criteria) this;
        }

        public Criteria andBilCompEqualTo(String value) {
            addCriterion("BIL_COMP =", value, "bilComp");
            return (Criteria) this;
        }

        public Criteria andBilCompNotEqualTo(String value) {
            addCriterion("BIL_COMP <>", value, "bilComp");
            return (Criteria) this;
        }

        public Criteria andBilCompGreaterThan(String value) {
            addCriterion("BIL_COMP >", value, "bilComp");
            return (Criteria) this;
        }

        public Criteria andBilCompGreaterThanOrEqualTo(String value) {
            addCriterion("BIL_COMP >=", value, "bilComp");
            return (Criteria) this;
        }

        public Criteria andBilCompLessThan(String value) {
            addCriterion("BIL_COMP <", value, "bilComp");
            return (Criteria) this;
        }

        public Criteria andBilCompLessThanOrEqualTo(String value) {
            addCriterion("BIL_COMP <=", value, "bilComp");
            return (Criteria) this;
        }

        public Criteria andBilCompLike(String value) {
            addCriterion("BIL_COMP like", value, "bilComp");
            return (Criteria) this;
        }

        public Criteria andBilCompNotLike(String value) {
            addCriterion("BIL_COMP not like", value, "bilComp");
            return (Criteria) this;
        }

        public Criteria andBilCompIn(List<String> values) {
            addCriterion("BIL_COMP in", values, "bilComp");
            return (Criteria) this;
        }

        public Criteria andBilCompNotIn(List<String> values) {
            addCriterion("BIL_COMP not in", values, "bilComp");
            return (Criteria) this;
        }

        public Criteria andBilCompBetween(String value1, String value2) {
            addCriterion("BIL_COMP between", value1, value2, "bilComp");
            return (Criteria) this;
        }

        public Criteria andBilCompNotBetween(String value1, String value2) {
            addCriterion("BIL_COMP not between", value1, value2, "bilComp");
            return (Criteria) this;
        }

        public Criteria andRtoFqskIsNull() {
            addCriterion("RTO_FQSK is null");
            return (Criteria) this;
        }

        public Criteria andRtoFqskIsNotNull() {
            addCriterion("RTO_FQSK is not null");
            return (Criteria) this;
        }

        public Criteria andRtoFqskEqualTo(BigDecimal value) {
            addCriterion("RTO_FQSK =", value, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskNotEqualTo(BigDecimal value) {
            addCriterion("RTO_FQSK <>", value, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskGreaterThan(BigDecimal value) {
            addCriterion("RTO_FQSK >", value, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_FQSK >=", value, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskLessThan(BigDecimal value) {
            addCriterion("RTO_FQSK <", value, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_FQSK <=", value, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskIn(List<BigDecimal> values) {
            addCriterion("RTO_FQSK in", values, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskNotIn(List<BigDecimal> values) {
            addCriterion("RTO_FQSK not in", values, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_FQSK between", value1, value2, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_FQSK not between", value1, value2, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskIsNull() {
            addCriterion("DATEFLAG_FQSK is null");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskIsNotNull() {
            addCriterion("DATEFLAG_FQSK is not null");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskEqualTo(String value) {
            addCriterion("DATEFLAG_FQSK =", value, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskNotEqualTo(String value) {
            addCriterion("DATEFLAG_FQSK <>", value, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskGreaterThan(String value) {
            addCriterion("DATEFLAG_FQSK >", value, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskGreaterThanOrEqualTo(String value) {
            addCriterion("DATEFLAG_FQSK >=", value, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskLessThan(String value) {
            addCriterion("DATEFLAG_FQSK <", value, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskLessThanOrEqualTo(String value) {
            addCriterion("DATEFLAG_FQSK <=", value, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskLike(String value) {
            addCriterion("DATEFLAG_FQSK like", value, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskNotLike(String value) {
            addCriterion("DATEFLAG_FQSK not like", value, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskIn(List<String> values) {
            addCriterion("DATEFLAG_FQSK in", values, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskNotIn(List<String> values) {
            addCriterion("DATEFLAG_FQSK not in", values, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskBetween(String value1, String value2) {
            addCriterion("DATEFLAG_FQSK between", value1, value2, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskNotBetween(String value1, String value2) {
            addCriterion("DATEFLAG_FQSK not between", value1, value2, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskIsNull() {
            addCriterion("DATE_FQSK is null");
            return (Criteria) this;
        }

        public Criteria andDateFqskIsNotNull() {
            addCriterion("DATE_FQSK is not null");
            return (Criteria) this;
        }

        public Criteria andDateFqskEqualTo(Date value) {
            addCriterion("DATE_FQSK =", value, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskNotEqualTo(Date value) {
            addCriterion("DATE_FQSK <>", value, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskGreaterThan(Date value) {
            addCriterion("DATE_FQSK >", value, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_FQSK >=", value, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskLessThan(Date value) {
            addCriterion("DATE_FQSK <", value, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskLessThanOrEqualTo(Date value) {
            addCriterion("DATE_FQSK <=", value, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskIn(List<Date> values) {
            addCriterion("DATE_FQSK in", values, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskNotIn(List<Date> values) {
            addCriterion("DATE_FQSK not in", values, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskBetween(Date value1, Date value2) {
            addCriterion("DATE_FQSK between", value1, value2, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskNotBetween(Date value1, Date value2) {
            addCriterion("DATE_FQSK not between", value1, value2, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskIsNull() {
            addCriterion("QS_FQSK is null");
            return (Criteria) this;
        }

        public Criteria andQsFqskIsNotNull() {
            addCriterion("QS_FQSK is not null");
            return (Criteria) this;
        }

        public Criteria andQsFqskEqualTo(Integer value) {
            addCriterion("QS_FQSK =", value, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskNotEqualTo(Integer value) {
            addCriterion("QS_FQSK <>", value, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskGreaterThan(Integer value) {
            addCriterion("QS_FQSK >", value, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskGreaterThanOrEqualTo(Integer value) {
            addCriterion("QS_FQSK >=", value, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskLessThan(Integer value) {
            addCriterion("QS_FQSK <", value, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskLessThanOrEqualTo(Integer value) {
            addCriterion("QS_FQSK <=", value, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskIn(List<Integer> values) {
            addCriterion("QS_FQSK in", values, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskNotIn(List<Integer> values) {
            addCriterion("QS_FQSK not in", values, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskBetween(Integer value1, Integer value2) {
            addCriterion("QS_FQSK between", value1, value2, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskNotBetween(Integer value1, Integer value2) {
            addCriterion("QS_FQSK not between", value1, value2, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andCusNoPosIsNull() {
            addCriterion("CUS_NO_POS is null");
            return (Criteria) this;
        }

        public Criteria andCusNoPosIsNotNull() {
            addCriterion("CUS_NO_POS is not null");
            return (Criteria) this;
        }

        public Criteria andCusNoPosEqualTo(String value) {
            addCriterion("CUS_NO_POS =", value, "cusNoPos");
            return (Criteria) this;
        }

        public Criteria andCusNoPosNotEqualTo(String value) {
            addCriterion("CUS_NO_POS <>", value, "cusNoPos");
            return (Criteria) this;
        }

        public Criteria andCusNoPosGreaterThan(String value) {
            addCriterion("CUS_NO_POS >", value, "cusNoPos");
            return (Criteria) this;
        }

        public Criteria andCusNoPosGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_NO_POS >=", value, "cusNoPos");
            return (Criteria) this;
        }

        public Criteria andCusNoPosLessThan(String value) {
            addCriterion("CUS_NO_POS <", value, "cusNoPos");
            return (Criteria) this;
        }

        public Criteria andCusNoPosLessThanOrEqualTo(String value) {
            addCriterion("CUS_NO_POS <=", value, "cusNoPos");
            return (Criteria) this;
        }

        public Criteria andCusNoPosLike(String value) {
            addCriterion("CUS_NO_POS like", value, "cusNoPos");
            return (Criteria) this;
        }

        public Criteria andCusNoPosNotLike(String value) {
            addCriterion("CUS_NO_POS not like", value, "cusNoPos");
            return (Criteria) this;
        }

        public Criteria andCusNoPosIn(List<String> values) {
            addCriterion("CUS_NO_POS in", values, "cusNoPos");
            return (Criteria) this;
        }

        public Criteria andCusNoPosNotIn(List<String> values) {
            addCriterion("CUS_NO_POS not in", values, "cusNoPos");
            return (Criteria) this;
        }

        public Criteria andCusNoPosBetween(String value1, String value2) {
            addCriterion("CUS_NO_POS between", value1, value2, "cusNoPos");
            return (Criteria) this;
        }

        public Criteria andCusNoPosNotBetween(String value1, String value2) {
            addCriterion("CUS_NO_POS not between", value1, value2, "cusNoPos");
            return (Criteria) this;
        }

        public Criteria andInstTeamIsNull() {
            addCriterion("INST_TEAM is null");
            return (Criteria) this;
        }

        public Criteria andInstTeamIsNotNull() {
            addCriterion("INST_TEAM is not null");
            return (Criteria) this;
        }

        public Criteria andInstTeamEqualTo(String value) {
            addCriterion("INST_TEAM =", value, "instTeam");
            return (Criteria) this;
        }

        public Criteria andInstTeamNotEqualTo(String value) {
            addCriterion("INST_TEAM <>", value, "instTeam");
            return (Criteria) this;
        }

        public Criteria andInstTeamGreaterThan(String value) {
            addCriterion("INST_TEAM >", value, "instTeam");
            return (Criteria) this;
        }

        public Criteria andInstTeamGreaterThanOrEqualTo(String value) {
            addCriterion("INST_TEAM >=", value, "instTeam");
            return (Criteria) this;
        }

        public Criteria andInstTeamLessThan(String value) {
            addCriterion("INST_TEAM <", value, "instTeam");
            return (Criteria) this;
        }

        public Criteria andInstTeamLessThanOrEqualTo(String value) {
            addCriterion("INST_TEAM <=", value, "instTeam");
            return (Criteria) this;
        }

        public Criteria andInstTeamLike(String value) {
            addCriterion("INST_TEAM like", value, "instTeam");
            return (Criteria) this;
        }

        public Criteria andInstTeamNotLike(String value) {
            addCriterion("INST_TEAM not like", value, "instTeam");
            return (Criteria) this;
        }

        public Criteria andInstTeamIn(List<String> values) {
            addCriterion("INST_TEAM in", values, "instTeam");
            return (Criteria) this;
        }

        public Criteria andInstTeamNotIn(List<String> values) {
            addCriterion("INST_TEAM not in", values, "instTeam");
            return (Criteria) this;
        }

        public Criteria andInstTeamBetween(String value1, String value2) {
            addCriterion("INST_TEAM between", value1, value2, "instTeam");
            return (Criteria) this;
        }

        public Criteria andInstTeamNotBetween(String value1, String value2) {
            addCriterion("INST_TEAM not between", value1, value2, "instTeam");
            return (Criteria) this;
        }

        public Criteria andAmtnDsIsNull() {
            addCriterion("AMTN_DS is null");
            return (Criteria) this;
        }

        public Criteria andAmtnDsIsNotNull() {
            addCriterion("AMTN_DS is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnDsEqualTo(BigDecimal value) {
            addCriterion("AMTN_DS =", value, "amtnDs");
            return (Criteria) this;
        }

        public Criteria andAmtnDsNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_DS <>", value, "amtnDs");
            return (Criteria) this;
        }

        public Criteria andAmtnDsGreaterThan(BigDecimal value) {
            addCriterion("AMTN_DS >", value, "amtnDs");
            return (Criteria) this;
        }

        public Criteria andAmtnDsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_DS >=", value, "amtnDs");
            return (Criteria) this;
        }

        public Criteria andAmtnDsLessThan(BigDecimal value) {
            addCriterion("AMTN_DS <", value, "amtnDs");
            return (Criteria) this;
        }

        public Criteria andAmtnDsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_DS <=", value, "amtnDs");
            return (Criteria) this;
        }

        public Criteria andAmtnDsIn(List<BigDecimal> values) {
            addCriterion("AMTN_DS in", values, "amtnDs");
            return (Criteria) this;
        }

        public Criteria andAmtnDsNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_DS not in", values, "amtnDs");
            return (Criteria) this;
        }

        public Criteria andAmtnDsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_DS between", value1, value2, "amtnDs");
            return (Criteria) this;
        }

        public Criteria andAmtnDsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_DS not between", value1, value2, "amtnDs");
            return (Criteria) this;
        }

        public Criteria andCfmSwIsNull() {
            addCriterion("CFM_SW is null");
            return (Criteria) this;
        }

        public Criteria andCfmSwIsNotNull() {
            addCriterion("CFM_SW is not null");
            return (Criteria) this;
        }

        public Criteria andCfmSwEqualTo(String value) {
            addCriterion("CFM_SW =", value, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwNotEqualTo(String value) {
            addCriterion("CFM_SW <>", value, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwGreaterThan(String value) {
            addCriterion("CFM_SW >", value, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwGreaterThanOrEqualTo(String value) {
            addCriterion("CFM_SW >=", value, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwLessThan(String value) {
            addCriterion("CFM_SW <", value, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwLessThanOrEqualTo(String value) {
            addCriterion("CFM_SW <=", value, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwLike(String value) {
            addCriterion("CFM_SW like", value, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwNotLike(String value) {
            addCriterion("CFM_SW not like", value, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwIn(List<String> values) {
            addCriterion("CFM_SW in", values, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwNotIn(List<String> values) {
            addCriterion("CFM_SW not in", values, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwBetween(String value1, String value2) {
            addCriterion("CFM_SW between", value1, value2, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andCfmSwNotBetween(String value1, String value2) {
            addCriterion("CFM_SW not between", value1, value2, "cfmSw");
            return (Criteria) this;
        }

        public Criteria andInvIdIsNull() {
            addCriterion("INV_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvIdIsNotNull() {
            addCriterion("INV_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvIdEqualTo(String value) {
            addCriterion("INV_ID =", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdNotEqualTo(String value) {
            addCriterion("INV_ID <>", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdGreaterThan(String value) {
            addCriterion("INV_ID >", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdGreaterThanOrEqualTo(String value) {
            addCriterion("INV_ID >=", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdLessThan(String value) {
            addCriterion("INV_ID <", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdLessThanOrEqualTo(String value) {
            addCriterion("INV_ID <=", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdLike(String value) {
            addCriterion("INV_ID like", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdNotLike(String value) {
            addCriterion("INV_ID not like", value, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdIn(List<String> values) {
            addCriterion("INV_ID in", values, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdNotIn(List<String> values) {
            addCriterion("INV_ID not in", values, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdBetween(String value1, String value2) {
            addCriterion("INV_ID between", value1, value2, "invId");
            return (Criteria) this;
        }

        public Criteria andInvIdNotBetween(String value1, String value2) {
            addCriterion("INV_ID not between", value1, value2, "invId");
            return (Criteria) this;
        }

        public Criteria andPrtDateIsNull() {
            addCriterion("PRT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPrtDateIsNotNull() {
            addCriterion("PRT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrtDateEqualTo(Date value) {
            addCriterion("PRT_DATE =", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateNotEqualTo(Date value) {
            addCriterion("PRT_DATE <>", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateGreaterThan(Date value) {
            addCriterion("PRT_DATE >", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PRT_DATE >=", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateLessThan(Date value) {
            addCriterion("PRT_DATE <", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateLessThanOrEqualTo(Date value) {
            addCriterion("PRT_DATE <=", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateIn(List<Date> values) {
            addCriterion("PRT_DATE in", values, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateNotIn(List<Date> values) {
            addCriterion("PRT_DATE not in", values, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateBetween(Date value1, Date value2) {
            addCriterion("PRT_DATE between", value1, value2, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateNotBetween(Date value1, Date value2) {
            addCriterion("PRT_DATE not between", value1, value2, "prtDate");
            return (Criteria) this;
        }

        public Criteria andInvBilIdIsNull() {
            addCriterion("INV_BIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvBilIdIsNotNull() {
            addCriterion("INV_BIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvBilIdEqualTo(String value) {
            addCriterion("INV_BIL_ID =", value, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdNotEqualTo(String value) {
            addCriterion("INV_BIL_ID <>", value, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdGreaterThan(String value) {
            addCriterion("INV_BIL_ID >", value, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdGreaterThanOrEqualTo(String value) {
            addCriterion("INV_BIL_ID >=", value, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdLessThan(String value) {
            addCriterion("INV_BIL_ID <", value, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdLessThanOrEqualTo(String value) {
            addCriterion("INV_BIL_ID <=", value, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdLike(String value) {
            addCriterion("INV_BIL_ID like", value, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdNotLike(String value) {
            addCriterion("INV_BIL_ID not like", value, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdIn(List<String> values) {
            addCriterion("INV_BIL_ID in", values, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdNotIn(List<String> values) {
            addCriterion("INV_BIL_ID not in", values, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdBetween(String value1, String value2) {
            addCriterion("INV_BIL_ID between", value1, value2, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdNotBetween(String value1, String value2) {
            addCriterion("INV_BIL_ID not between", value1, value2, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilNoIsNull() {
            addCriterion("INV_BIL_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvBilNoIsNotNull() {
            addCriterion("INV_BIL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvBilNoEqualTo(String value) {
            addCriterion("INV_BIL_NO =", value, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoNotEqualTo(String value) {
            addCriterion("INV_BIL_NO <>", value, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoGreaterThan(String value) {
            addCriterion("INV_BIL_NO >", value, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoGreaterThanOrEqualTo(String value) {
            addCriterion("INV_BIL_NO >=", value, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoLessThan(String value) {
            addCriterion("INV_BIL_NO <", value, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoLessThanOrEqualTo(String value) {
            addCriterion("INV_BIL_NO <=", value, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoLike(String value) {
            addCriterion("INV_BIL_NO like", value, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoNotLike(String value) {
            addCriterion("INV_BIL_NO not like", value, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoIn(List<String> values) {
            addCriterion("INV_BIL_NO in", values, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoNotIn(List<String> values) {
            addCriterion("INV_BIL_NO not in", values, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoBetween(String value1, String value2) {
            addCriterion("INV_BIL_NO between", value1, value2, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoNotBetween(String value1, String value2) {
            addCriterion("INV_BIL_NO not between", value1, value2, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andOffOsNoIsNull() {
            addCriterion("OFF_OS_NO is null");
            return (Criteria) this;
        }

        public Criteria andOffOsNoIsNotNull() {
            addCriterion("OFF_OS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOffOsNoEqualTo(String value) {
            addCriterion("OFF_OS_NO =", value, "offOsNo");
            return (Criteria) this;
        }

        public Criteria andOffOsNoNotEqualTo(String value) {
            addCriterion("OFF_OS_NO <>", value, "offOsNo");
            return (Criteria) this;
        }

        public Criteria andOffOsNoGreaterThan(String value) {
            addCriterion("OFF_OS_NO >", value, "offOsNo");
            return (Criteria) this;
        }

        public Criteria andOffOsNoGreaterThanOrEqualTo(String value) {
            addCriterion("OFF_OS_NO >=", value, "offOsNo");
            return (Criteria) this;
        }

        public Criteria andOffOsNoLessThan(String value) {
            addCriterion("OFF_OS_NO <", value, "offOsNo");
            return (Criteria) this;
        }

        public Criteria andOffOsNoLessThanOrEqualTo(String value) {
            addCriterion("OFF_OS_NO <=", value, "offOsNo");
            return (Criteria) this;
        }

        public Criteria andOffOsNoLike(String value) {
            addCriterion("OFF_OS_NO like", value, "offOsNo");
            return (Criteria) this;
        }

        public Criteria andOffOsNoNotLike(String value) {
            addCriterion("OFF_OS_NO not like", value, "offOsNo");
            return (Criteria) this;
        }

        public Criteria andOffOsNoIn(List<String> values) {
            addCriterion("OFF_OS_NO in", values, "offOsNo");
            return (Criteria) this;
        }

        public Criteria andOffOsNoNotIn(List<String> values) {
            addCriterion("OFF_OS_NO not in", values, "offOsNo");
            return (Criteria) this;
        }

        public Criteria andOffOsNoBetween(String value1, String value2) {
            addCriterion("OFF_OS_NO between", value1, value2, "offOsNo");
            return (Criteria) this;
        }

        public Criteria andOffOsNoNotBetween(String value1, String value2) {
            addCriterion("OFF_OS_NO not between", value1, value2, "offOsNo");
            return (Criteria) this;
        }

        public Criteria andInvBcodeNoIsNull() {
            addCriterion("INV_BCODE_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvBcodeNoIsNotNull() {
            addCriterion("INV_BCODE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvBcodeNoEqualTo(String value) {
            addCriterion("INV_BCODE_NO =", value, "invBcodeNo");
            return (Criteria) this;
        }

        public Criteria andInvBcodeNoNotEqualTo(String value) {
            addCriterion("INV_BCODE_NO <>", value, "invBcodeNo");
            return (Criteria) this;
        }

        public Criteria andInvBcodeNoGreaterThan(String value) {
            addCriterion("INV_BCODE_NO >", value, "invBcodeNo");
            return (Criteria) this;
        }

        public Criteria andInvBcodeNoGreaterThanOrEqualTo(String value) {
            addCriterion("INV_BCODE_NO >=", value, "invBcodeNo");
            return (Criteria) this;
        }

        public Criteria andInvBcodeNoLessThan(String value) {
            addCriterion("INV_BCODE_NO <", value, "invBcodeNo");
            return (Criteria) this;
        }

        public Criteria andInvBcodeNoLessThanOrEqualTo(String value) {
            addCriterion("INV_BCODE_NO <=", value, "invBcodeNo");
            return (Criteria) this;
        }

        public Criteria andInvBcodeNoLike(String value) {
            addCriterion("INV_BCODE_NO like", value, "invBcodeNo");
            return (Criteria) this;
        }

        public Criteria andInvBcodeNoNotLike(String value) {
            addCriterion("INV_BCODE_NO not like", value, "invBcodeNo");
            return (Criteria) this;
        }

        public Criteria andInvBcodeNoIn(List<String> values) {
            addCriterion("INV_BCODE_NO in", values, "invBcodeNo");
            return (Criteria) this;
        }

        public Criteria andInvBcodeNoNotIn(List<String> values) {
            addCriterion("INV_BCODE_NO not in", values, "invBcodeNo");
            return (Criteria) this;
        }

        public Criteria andInvBcodeNoBetween(String value1, String value2) {
            addCriterion("INV_BCODE_NO between", value1, value2, "invBcodeNo");
            return (Criteria) this;
        }

        public Criteria andInvBcodeNoNotBetween(String value1, String value2) {
            addCriterion("INV_BCODE_NO not between", value1, value2, "invBcodeNo");
            return (Criteria) this;
        }

        public Criteria andZhangIdIsNull() {
            addCriterion("ZHANG_ID is null");
            return (Criteria) this;
        }

        public Criteria andZhangIdIsNotNull() {
            addCriterion("ZHANG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andZhangIdEqualTo(String value) {
            addCriterion("ZHANG_ID =", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdNotEqualTo(String value) {
            addCriterion("ZHANG_ID <>", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdGreaterThan(String value) {
            addCriterion("ZHANG_ID >", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdGreaterThanOrEqualTo(String value) {
            addCriterion("ZHANG_ID >=", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdLessThan(String value) {
            addCriterion("ZHANG_ID <", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdLessThanOrEqualTo(String value) {
            addCriterion("ZHANG_ID <=", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdLike(String value) {
            addCriterion("ZHANG_ID like", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdNotLike(String value) {
            addCriterion("ZHANG_ID not like", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdIn(List<String> values) {
            addCriterion("ZHANG_ID in", values, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdNotIn(List<String> values) {
            addCriterion("ZHANG_ID not in", values, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdBetween(String value1, String value2) {
            addCriterion("ZHANG_ID between", value1, value2, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdNotBetween(String value1, String value2) {
            addCriterion("ZHANG_ID not between", value1, value2, "zhangId");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacPsIsNull() {
            addCriterion("AMTN_CBAC_PS is null");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacPsIsNotNull() {
            addCriterion("AMTN_CBAC_PS is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacPsEqualTo(BigDecimal value) {
            addCriterion("AMTN_CBAC_PS =", value, "amtnCbacPs");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacPsNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_CBAC_PS <>", value, "amtnCbacPs");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacPsGreaterThan(BigDecimal value) {
            addCriterion("AMTN_CBAC_PS >", value, "amtnCbacPs");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacPsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_CBAC_PS >=", value, "amtnCbacPs");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacPsLessThan(BigDecimal value) {
            addCriterion("AMTN_CBAC_PS <", value, "amtnCbacPs");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacPsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_CBAC_PS <=", value, "amtnCbacPs");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacPsIn(List<BigDecimal> values) {
            addCriterion("AMTN_CBAC_PS in", values, "amtnCbacPs");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacPsNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_CBAC_PS not in", values, "amtnCbacPs");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacPsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_CBAC_PS between", value1, value2, "amtnCbacPs");
            return (Criteria) this;
        }

        public Criteria andAmtnCbacPsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_CBAC_PS not between", value1, value2, "amtnCbacPs");
            return (Criteria) this;
        }

        public Criteria andActNoIsNull() {
            addCriterion("ACT_NO is null");
            return (Criteria) this;
        }

        public Criteria andActNoIsNotNull() {
            addCriterion("ACT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andActNoEqualTo(String value) {
            addCriterion("ACT_NO =", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoNotEqualTo(String value) {
            addCriterion("ACT_NO <>", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoGreaterThan(String value) {
            addCriterion("ACT_NO >", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_NO >=", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoLessThan(String value) {
            addCriterion("ACT_NO <", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoLessThanOrEqualTo(String value) {
            addCriterion("ACT_NO <=", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoLike(String value) {
            addCriterion("ACT_NO like", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoNotLike(String value) {
            addCriterion("ACT_NO not like", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoIn(List<String> values) {
            addCriterion("ACT_NO in", values, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoNotIn(List<String> values) {
            addCriterion("ACT_NO not in", values, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoBetween(String value1, String value2) {
            addCriterion("ACT_NO between", value1, value2, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoNotBetween(String value1, String value2) {
            addCriterion("ACT_NO not between", value1, value2, "actNo");
            return (Criteria) this;
        }

        public Criteria andTtTypeSetIsNull() {
            addCriterion("TT_TYPE_SET is null");
            return (Criteria) this;
        }

        public Criteria andTtTypeSetIsNotNull() {
            addCriterion("TT_TYPE_SET is not null");
            return (Criteria) this;
        }

        public Criteria andTtTypeSetEqualTo(String value) {
            addCriterion("TT_TYPE_SET =", value, "ttTypeSet");
            return (Criteria) this;
        }

        public Criteria andTtTypeSetNotEqualTo(String value) {
            addCriterion("TT_TYPE_SET <>", value, "ttTypeSet");
            return (Criteria) this;
        }

        public Criteria andTtTypeSetGreaterThan(String value) {
            addCriterion("TT_TYPE_SET >", value, "ttTypeSet");
            return (Criteria) this;
        }

        public Criteria andTtTypeSetGreaterThanOrEqualTo(String value) {
            addCriterion("TT_TYPE_SET >=", value, "ttTypeSet");
            return (Criteria) this;
        }

        public Criteria andTtTypeSetLessThan(String value) {
            addCriterion("TT_TYPE_SET <", value, "ttTypeSet");
            return (Criteria) this;
        }

        public Criteria andTtTypeSetLessThanOrEqualTo(String value) {
            addCriterion("TT_TYPE_SET <=", value, "ttTypeSet");
            return (Criteria) this;
        }

        public Criteria andTtTypeSetLike(String value) {
            addCriterion("TT_TYPE_SET like", value, "ttTypeSet");
            return (Criteria) this;
        }

        public Criteria andTtTypeSetNotLike(String value) {
            addCriterion("TT_TYPE_SET not like", value, "ttTypeSet");
            return (Criteria) this;
        }

        public Criteria andTtTypeSetIn(List<String> values) {
            addCriterion("TT_TYPE_SET in", values, "ttTypeSet");
            return (Criteria) this;
        }

        public Criteria andTtTypeSetNotIn(List<String> values) {
            addCriterion("TT_TYPE_SET not in", values, "ttTypeSet");
            return (Criteria) this;
        }

        public Criteria andTtTypeSetBetween(String value1, String value2) {
            addCriterion("TT_TYPE_SET between", value1, value2, "ttTypeSet");
            return (Criteria) this;
        }

        public Criteria andTtTypeSetNotBetween(String value1, String value2) {
            addCriterion("TT_TYPE_SET not between", value1, value2, "ttTypeSet");
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

        public Criteria andIcosIdIsNull() {
            addCriterion("ICOS_ID is null");
            return (Criteria) this;
        }

        public Criteria andIcosIdIsNotNull() {
            addCriterion("ICOS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIcosIdEqualTo(String value) {
            addCriterion("ICOS_ID =", value, "icosId");
            return (Criteria) this;
        }

        public Criteria andIcosIdNotEqualTo(String value) {
            addCriterion("ICOS_ID <>", value, "icosId");
            return (Criteria) this;
        }

        public Criteria andIcosIdGreaterThan(String value) {
            addCriterion("ICOS_ID >", value, "icosId");
            return (Criteria) this;
        }

        public Criteria andIcosIdGreaterThanOrEqualTo(String value) {
            addCriterion("ICOS_ID >=", value, "icosId");
            return (Criteria) this;
        }

        public Criteria andIcosIdLessThan(String value) {
            addCriterion("ICOS_ID <", value, "icosId");
            return (Criteria) this;
        }

        public Criteria andIcosIdLessThanOrEqualTo(String value) {
            addCriterion("ICOS_ID <=", value, "icosId");
            return (Criteria) this;
        }

        public Criteria andIcosIdLike(String value) {
            addCriterion("ICOS_ID like", value, "icosId");
            return (Criteria) this;
        }

        public Criteria andIcosIdNotLike(String value) {
            addCriterion("ICOS_ID not like", value, "icosId");
            return (Criteria) this;
        }

        public Criteria andIcosIdIn(List<String> values) {
            addCriterion("ICOS_ID in", values, "icosId");
            return (Criteria) this;
        }

        public Criteria andIcosIdNotIn(List<String> values) {
            addCriterion("ICOS_ID not in", values, "icosId");
            return (Criteria) this;
        }

        public Criteria andIcosIdBetween(String value1, String value2) {
            addCriterion("ICOS_ID between", value1, value2, "icosId");
            return (Criteria) this;
        }

        public Criteria andIcosIdNotBetween(String value1, String value2) {
            addCriterion("ICOS_ID not between", value1, value2, "icosId");
            return (Criteria) this;
        }

        public Criteria andCntMan1IsNull() {
            addCriterion("CNT_MAN1 is null");
            return (Criteria) this;
        }

        public Criteria andCntMan1IsNotNull() {
            addCriterion("CNT_MAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andCntMan1EqualTo(String value) {
            addCriterion("CNT_MAN1 =", value, "cntMan1");
            return (Criteria) this;
        }

        public Criteria andCntMan1NotEqualTo(String value) {
            addCriterion("CNT_MAN1 <>", value, "cntMan1");
            return (Criteria) this;
        }

        public Criteria andCntMan1GreaterThan(String value) {
            addCriterion("CNT_MAN1 >", value, "cntMan1");
            return (Criteria) this;
        }

        public Criteria andCntMan1GreaterThanOrEqualTo(String value) {
            addCriterion("CNT_MAN1 >=", value, "cntMan1");
            return (Criteria) this;
        }

        public Criteria andCntMan1LessThan(String value) {
            addCriterion("CNT_MAN1 <", value, "cntMan1");
            return (Criteria) this;
        }

        public Criteria andCntMan1LessThanOrEqualTo(String value) {
            addCriterion("CNT_MAN1 <=", value, "cntMan1");
            return (Criteria) this;
        }

        public Criteria andCntMan1Like(String value) {
            addCriterion("CNT_MAN1 like", value, "cntMan1");
            return (Criteria) this;
        }

        public Criteria andCntMan1NotLike(String value) {
            addCriterion("CNT_MAN1 not like", value, "cntMan1");
            return (Criteria) this;
        }

        public Criteria andCntMan1In(List<String> values) {
            addCriterion("CNT_MAN1 in", values, "cntMan1");
            return (Criteria) this;
        }

        public Criteria andCntMan1NotIn(List<String> values) {
            addCriterion("CNT_MAN1 not in", values, "cntMan1");
            return (Criteria) this;
        }

        public Criteria andCntMan1Between(String value1, String value2) {
            addCriterion("CNT_MAN1 between", value1, value2, "cntMan1");
            return (Criteria) this;
        }

        public Criteria andCntMan1NotBetween(String value1, String value2) {
            addCriterion("CNT_MAN1 not between", value1, value2, "cntMan1");
            return (Criteria) this;
        }

        public Criteria andModifyDdIsNull() {
            addCriterion("MODIFY_DD is null");
            return (Criteria) this;
        }

        public Criteria andModifyDdIsNotNull() {
            addCriterion("MODIFY_DD is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDdEqualTo(Date value) {
            addCriterion("MODIFY_DD =", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdNotEqualTo(Date value) {
            addCriterion("MODIFY_DD <>", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdGreaterThan(Date value) {
            addCriterion("MODIFY_DD >", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DD >=", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdLessThan(Date value) {
            addCriterion("MODIFY_DD <", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DD <=", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdIn(List<Date> values) {
            addCriterion("MODIFY_DD in", values, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdNotIn(List<Date> values) {
            addCriterion("MODIFY_DD not in", values, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DD between", value1, value2, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DD not between", value1, value2, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyManIsNull() {
            addCriterion("MODIFY_MAN is null");
            return (Criteria) this;
        }

        public Criteria andModifyManIsNotNull() {
            addCriterion("MODIFY_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andModifyManEqualTo(String value) {
            addCriterion("MODIFY_MAN =", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotEqualTo(String value) {
            addCriterion("MODIFY_MAN <>", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManGreaterThan(String value) {
            addCriterion("MODIFY_MAN >", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_MAN >=", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManLessThan(String value) {
            addCriterion("MODIFY_MAN <", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_MAN <=", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManLike(String value) {
            addCriterion("MODIFY_MAN like", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotLike(String value) {
            addCriterion("MODIFY_MAN not like", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManIn(List<String> values) {
            addCriterion("MODIFY_MAN in", values, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotIn(List<String> values) {
            addCriterion("MODIFY_MAN not in", values, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManBetween(String value1, String value2) {
            addCriterion("MODIFY_MAN between", value1, value2, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotBetween(String value1, String value2) {
            addCriterion("MODIFY_MAN not between", value1, value2, "modifyMan");
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

        public Criteria andMrkIsNull() {
            addCriterion("MRK is null");
            return (Criteria) this;
        }

        public Criteria andMrkIsNotNull() {
            addCriterion("MRK is not null");
            return (Criteria) this;
        }

        public Criteria andMrkEqualTo(String value) {
            addCriterion("MRK =", value, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkNotEqualTo(String value) {
            addCriterion("MRK <>", value, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkGreaterThan(String value) {
            addCriterion("MRK >", value, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkGreaterThanOrEqualTo(String value) {
            addCriterion("MRK >=", value, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkLessThan(String value) {
            addCriterion("MRK <", value, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkLessThanOrEqualTo(String value) {
            addCriterion("MRK <=", value, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkLike(String value) {
            addCriterion("MRK like", value, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkNotLike(String value) {
            addCriterion("MRK not like", value, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkIn(List<String> values) {
            addCriterion("MRK in", values, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkNotIn(List<String> values) {
            addCriterion("MRK not in", values, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkBetween(String value1, String value2) {
            addCriterion("MRK between", value1, value2, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkNotBetween(String value1, String value2) {
            addCriterion("MRK not between", value1, value2, "mrk");
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

        public Criteria andCxIdIsNull() {
            addCriterion("CX_ID is null");
            return (Criteria) this;
        }

        public Criteria andCxIdIsNotNull() {
            addCriterion("CX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCxIdEqualTo(String value) {
            addCriterion("CX_ID =", value, "cxId");
            return (Criteria) this;
        }

        public Criteria andCxIdNotEqualTo(String value) {
            addCriterion("CX_ID <>", value, "cxId");
            return (Criteria) this;
        }

        public Criteria andCxIdGreaterThan(String value) {
            addCriterion("CX_ID >", value, "cxId");
            return (Criteria) this;
        }

        public Criteria andCxIdGreaterThanOrEqualTo(String value) {
            addCriterion("CX_ID >=", value, "cxId");
            return (Criteria) this;
        }

        public Criteria andCxIdLessThan(String value) {
            addCriterion("CX_ID <", value, "cxId");
            return (Criteria) this;
        }

        public Criteria andCxIdLessThanOrEqualTo(String value) {
            addCriterion("CX_ID <=", value, "cxId");
            return (Criteria) this;
        }

        public Criteria andCxIdLike(String value) {
            addCriterion("CX_ID like", value, "cxId");
            return (Criteria) this;
        }

        public Criteria andCxIdNotLike(String value) {
            addCriterion("CX_ID not like", value, "cxId");
            return (Criteria) this;
        }

        public Criteria andCxIdIn(List<String> values) {
            addCriterion("CX_ID in", values, "cxId");
            return (Criteria) this;
        }

        public Criteria andCxIdNotIn(List<String> values) {
            addCriterion("CX_ID not in", values, "cxId");
            return (Criteria) this;
        }

        public Criteria andCxIdBetween(String value1, String value2) {
            addCriterion("CX_ID between", value1, value2, "cxId");
            return (Criteria) this;
        }

        public Criteria andCxIdNotBetween(String value1, String value2) {
            addCriterion("CX_ID not between", value1, value2, "cxId");
            return (Criteria) this;
        }

        public Criteria andCxNoIsNull() {
            addCriterion("CX_NO is null");
            return (Criteria) this;
        }

        public Criteria andCxNoIsNotNull() {
            addCriterion("CX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCxNoEqualTo(String value) {
            addCriterion("CX_NO =", value, "cxNo");
            return (Criteria) this;
        }

        public Criteria andCxNoNotEqualTo(String value) {
            addCriterion("CX_NO <>", value, "cxNo");
            return (Criteria) this;
        }

        public Criteria andCxNoGreaterThan(String value) {
            addCriterion("CX_NO >", value, "cxNo");
            return (Criteria) this;
        }

        public Criteria andCxNoGreaterThanOrEqualTo(String value) {
            addCriterion("CX_NO >=", value, "cxNo");
            return (Criteria) this;
        }

        public Criteria andCxNoLessThan(String value) {
            addCriterion("CX_NO <", value, "cxNo");
            return (Criteria) this;
        }

        public Criteria andCxNoLessThanOrEqualTo(String value) {
            addCriterion("CX_NO <=", value, "cxNo");
            return (Criteria) this;
        }

        public Criteria andCxNoLike(String value) {
            addCriterion("CX_NO like", value, "cxNo");
            return (Criteria) this;
        }

        public Criteria andCxNoNotLike(String value) {
            addCriterion("CX_NO not like", value, "cxNo");
            return (Criteria) this;
        }

        public Criteria andCxNoIn(List<String> values) {
            addCriterion("CX_NO in", values, "cxNo");
            return (Criteria) this;
        }

        public Criteria andCxNoNotIn(List<String> values) {
            addCriterion("CX_NO not in", values, "cxNo");
            return (Criteria) this;
        }

        public Criteria andCxNoBetween(String value1, String value2) {
            addCriterion("CX_NO between", value1, value2, "cxNo");
            return (Criteria) this;
        }

        public Criteria andCxNoNotBetween(String value1, String value2) {
            addCriterion("CX_NO not between", value1, value2, "cxNo");
            return (Criteria) this;
        }

        public Criteria andChkLatestIsNull() {
            addCriterion("CHK_LATEST is null");
            return (Criteria) this;
        }

        public Criteria andChkLatestIsNotNull() {
            addCriterion("CHK_LATEST is not null");
            return (Criteria) this;
        }

        public Criteria andChkLatestEqualTo(String value) {
            addCriterion("CHK_LATEST =", value, "chkLatest");
            return (Criteria) this;
        }

        public Criteria andChkLatestNotEqualTo(String value) {
            addCriterion("CHK_LATEST <>", value, "chkLatest");
            return (Criteria) this;
        }

        public Criteria andChkLatestGreaterThan(String value) {
            addCriterion("CHK_LATEST >", value, "chkLatest");
            return (Criteria) this;
        }

        public Criteria andChkLatestGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_LATEST >=", value, "chkLatest");
            return (Criteria) this;
        }

        public Criteria andChkLatestLessThan(String value) {
            addCriterion("CHK_LATEST <", value, "chkLatest");
            return (Criteria) this;
        }

        public Criteria andChkLatestLessThanOrEqualTo(String value) {
            addCriterion("CHK_LATEST <=", value, "chkLatest");
            return (Criteria) this;
        }

        public Criteria andChkLatestLike(String value) {
            addCriterion("CHK_LATEST like", value, "chkLatest");
            return (Criteria) this;
        }

        public Criteria andChkLatestNotLike(String value) {
            addCriterion("CHK_LATEST not like", value, "chkLatest");
            return (Criteria) this;
        }

        public Criteria andChkLatestIn(List<String> values) {
            addCriterion("CHK_LATEST in", values, "chkLatest");
            return (Criteria) this;
        }

        public Criteria andChkLatestNotIn(List<String> values) {
            addCriterion("CHK_LATEST not in", values, "chkLatest");
            return (Criteria) this;
        }

        public Criteria andChkLatestBetween(String value1, String value2) {
            addCriterion("CHK_LATEST between", value1, value2, "chkLatest");
            return (Criteria) this;
        }

        public Criteria andChkLatestNotBetween(String value1, String value2) {
            addCriterion("CHK_LATEST not between", value1, value2, "chkLatest");
            return (Criteria) this;
        }

        public Criteria andSrcIdIsNull() {
            addCriterion("SRC_ID is null");
            return (Criteria) this;
        }

        public Criteria andSrcIdIsNotNull() {
            addCriterion("SRC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSrcIdEqualTo(String value) {
            addCriterion("SRC_ID =", value, "srcId");
            return (Criteria) this;
        }

        public Criteria andSrcIdNotEqualTo(String value) {
            addCriterion("SRC_ID <>", value, "srcId");
            return (Criteria) this;
        }

        public Criteria andSrcIdGreaterThan(String value) {
            addCriterion("SRC_ID >", value, "srcId");
            return (Criteria) this;
        }

        public Criteria andSrcIdGreaterThanOrEqualTo(String value) {
            addCriterion("SRC_ID >=", value, "srcId");
            return (Criteria) this;
        }

        public Criteria andSrcIdLessThan(String value) {
            addCriterion("SRC_ID <", value, "srcId");
            return (Criteria) this;
        }

        public Criteria andSrcIdLessThanOrEqualTo(String value) {
            addCriterion("SRC_ID <=", value, "srcId");
            return (Criteria) this;
        }

        public Criteria andSrcIdLike(String value) {
            addCriterion("SRC_ID like", value, "srcId");
            return (Criteria) this;
        }

        public Criteria andSrcIdNotLike(String value) {
            addCriterion("SRC_ID not like", value, "srcId");
            return (Criteria) this;
        }

        public Criteria andSrcIdIn(List<String> values) {
            addCriterion("SRC_ID in", values, "srcId");
            return (Criteria) this;
        }

        public Criteria andSrcIdNotIn(List<String> values) {
            addCriterion("SRC_ID not in", values, "srcId");
            return (Criteria) this;
        }

        public Criteria andSrcIdBetween(String value1, String value2) {
            addCriterion("SRC_ID between", value1, value2, "srcId");
            return (Criteria) this;
        }

        public Criteria andSrcIdNotBetween(String value1, String value2) {
            addCriterion("SRC_ID not between", value1, value2, "srcId");
            return (Criteria) this;
        }

        public Criteria andSgBilCompIsNull() {
            addCriterion("SG_BIL_COMP is null");
            return (Criteria) this;
        }

        public Criteria andSgBilCompIsNotNull() {
            addCriterion("SG_BIL_COMP is not null");
            return (Criteria) this;
        }

        public Criteria andSgBilCompEqualTo(String value) {
            addCriterion("SG_BIL_COMP =", value, "sgBilComp");
            return (Criteria) this;
        }

        public Criteria andSgBilCompNotEqualTo(String value) {
            addCriterion("SG_BIL_COMP <>", value, "sgBilComp");
            return (Criteria) this;
        }

        public Criteria andSgBilCompGreaterThan(String value) {
            addCriterion("SG_BIL_COMP >", value, "sgBilComp");
            return (Criteria) this;
        }

        public Criteria andSgBilCompGreaterThanOrEqualTo(String value) {
            addCriterion("SG_BIL_COMP >=", value, "sgBilComp");
            return (Criteria) this;
        }

        public Criteria andSgBilCompLessThan(String value) {
            addCriterion("SG_BIL_COMP <", value, "sgBilComp");
            return (Criteria) this;
        }

        public Criteria andSgBilCompLessThanOrEqualTo(String value) {
            addCriterion("SG_BIL_COMP <=", value, "sgBilComp");
            return (Criteria) this;
        }

        public Criteria andSgBilCompLike(String value) {
            addCriterion("SG_BIL_COMP like", value, "sgBilComp");
            return (Criteria) this;
        }

        public Criteria andSgBilCompNotLike(String value) {
            addCriterion("SG_BIL_COMP not like", value, "sgBilComp");
            return (Criteria) this;
        }

        public Criteria andSgBilCompIn(List<String> values) {
            addCriterion("SG_BIL_COMP in", values, "sgBilComp");
            return (Criteria) this;
        }

        public Criteria andSgBilCompNotIn(List<String> values) {
            addCriterion("SG_BIL_COMP not in", values, "sgBilComp");
            return (Criteria) this;
        }

        public Criteria andSgBilCompBetween(String value1, String value2) {
            addCriterion("SG_BIL_COMP between", value1, value2, "sgBilComp");
            return (Criteria) this;
        }

        public Criteria andSgBilCompNotBetween(String value1, String value2) {
            addCriterion("SG_BIL_COMP not between", value1, value2, "sgBilComp");
            return (Criteria) this;
        }

        public Criteria andSokpIsNull() {
            addCriterion("SOKP is null");
            return (Criteria) this;
        }

        public Criteria andSokpIsNotNull() {
            addCriterion("SOKP is not null");
            return (Criteria) this;
        }

        public Criteria andSokpEqualTo(String value) {
            addCriterion("SOKP =", value, "sokp");
            return (Criteria) this;
        }

        public Criteria andSokpNotEqualTo(String value) {
            addCriterion("SOKP <>", value, "sokp");
            return (Criteria) this;
        }

        public Criteria andSokpGreaterThan(String value) {
            addCriterion("SOKP >", value, "sokp");
            return (Criteria) this;
        }

        public Criteria andSokpGreaterThanOrEqualTo(String value) {
            addCriterion("SOKP >=", value, "sokp");
            return (Criteria) this;
        }

        public Criteria andSokpLessThan(String value) {
            addCriterion("SOKP <", value, "sokp");
            return (Criteria) this;
        }

        public Criteria andSokpLessThanOrEqualTo(String value) {
            addCriterion("SOKP <=", value, "sokp");
            return (Criteria) this;
        }

        public Criteria andSokpLike(String value) {
            addCriterion("SOKP like", value, "sokp");
            return (Criteria) this;
        }

        public Criteria andSokpNotLike(String value) {
            addCriterion("SOKP not like", value, "sokp");
            return (Criteria) this;
        }

        public Criteria andSokpIn(List<String> values) {
            addCriterion("SOKP in", values, "sokp");
            return (Criteria) this;
        }

        public Criteria andSokpNotIn(List<String> values) {
            addCriterion("SOKP not in", values, "sokp");
            return (Criteria) this;
        }

        public Criteria andSokpBetween(String value1, String value2) {
            addCriterion("SOKP between", value1, value2, "sokp");
            return (Criteria) this;
        }

        public Criteria andSokpNotBetween(String value1, String value2) {
            addCriterion("SOKP not between", value1, value2, "sokp");
            return (Criteria) this;
        }

        public Criteria andCusFhIsNull() {
            addCriterion("CUS_FH is null");
            return (Criteria) this;
        }

        public Criteria andCusFhIsNotNull() {
            addCriterion("CUS_FH is not null");
            return (Criteria) this;
        }

        public Criteria andCusFhEqualTo(String value) {
            addCriterion("CUS_FH =", value, "cusFh");
            return (Criteria) this;
        }

        public Criteria andCusFhNotEqualTo(String value) {
            addCriterion("CUS_FH <>", value, "cusFh");
            return (Criteria) this;
        }

        public Criteria andCusFhGreaterThan(String value) {
            addCriterion("CUS_FH >", value, "cusFh");
            return (Criteria) this;
        }

        public Criteria andCusFhGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_FH >=", value, "cusFh");
            return (Criteria) this;
        }

        public Criteria andCusFhLessThan(String value) {
            addCriterion("CUS_FH <", value, "cusFh");
            return (Criteria) this;
        }

        public Criteria andCusFhLessThanOrEqualTo(String value) {
            addCriterion("CUS_FH <=", value, "cusFh");
            return (Criteria) this;
        }

        public Criteria andCusFhLike(String value) {
            addCriterion("CUS_FH like", value, "cusFh");
            return (Criteria) this;
        }

        public Criteria andCusFhNotLike(String value) {
            addCriterion("CUS_FH not like", value, "cusFh");
            return (Criteria) this;
        }

        public Criteria andCusFhIn(List<String> values) {
            addCriterion("CUS_FH in", values, "cusFh");
            return (Criteria) this;
        }

        public Criteria andCusFhNotIn(List<String> values) {
            addCriterion("CUS_FH not in", values, "cusFh");
            return (Criteria) this;
        }

        public Criteria andCusFhBetween(String value1, String value2) {
            addCriterion("CUS_FH between", value1, value2, "cusFh");
            return (Criteria) this;
        }

        public Criteria andCusFhNotBetween(String value1, String value2) {
            addCriterion("CUS_FH not between", value1, value2, "cusFh");
            return (Criteria) this;
        }

        public Criteria andDepFhIsNull() {
            addCriterion("DEP_FH is null");
            return (Criteria) this;
        }

        public Criteria andDepFhIsNotNull() {
            addCriterion("DEP_FH is not null");
            return (Criteria) this;
        }

        public Criteria andDepFhEqualTo(String value) {
            addCriterion("DEP_FH =", value, "depFh");
            return (Criteria) this;
        }

        public Criteria andDepFhNotEqualTo(String value) {
            addCriterion("DEP_FH <>", value, "depFh");
            return (Criteria) this;
        }

        public Criteria andDepFhGreaterThan(String value) {
            addCriterion("DEP_FH >", value, "depFh");
            return (Criteria) this;
        }

        public Criteria andDepFhGreaterThanOrEqualTo(String value) {
            addCriterion("DEP_FH >=", value, "depFh");
            return (Criteria) this;
        }

        public Criteria andDepFhLessThan(String value) {
            addCriterion("DEP_FH <", value, "depFh");
            return (Criteria) this;
        }

        public Criteria andDepFhLessThanOrEqualTo(String value) {
            addCriterion("DEP_FH <=", value, "depFh");
            return (Criteria) this;
        }

        public Criteria andDepFhLike(String value) {
            addCriterion("DEP_FH like", value, "depFh");
            return (Criteria) this;
        }

        public Criteria andDepFhNotLike(String value) {
            addCriterion("DEP_FH not like", value, "depFh");
            return (Criteria) this;
        }

        public Criteria andDepFhIn(List<String> values) {
            addCriterion("DEP_FH in", values, "depFh");
            return (Criteria) this;
        }

        public Criteria andDepFhNotIn(List<String> values) {
            addCriterion("DEP_FH not in", values, "depFh");
            return (Criteria) this;
        }

        public Criteria andDepFhBetween(String value1, String value2) {
            addCriterion("DEP_FH between", value1, value2, "depFh");
            return (Criteria) this;
        }

        public Criteria andDepFhNotBetween(String value1, String value2) {
            addCriterion("DEP_FH not between", value1, value2, "depFh");
            return (Criteria) this;
        }

        public Criteria andCusFxIsNull() {
            addCriterion("CUS_FX is null");
            return (Criteria) this;
        }

        public Criteria andCusFxIsNotNull() {
            addCriterion("CUS_FX is not null");
            return (Criteria) this;
        }

        public Criteria andCusFxEqualTo(String value) {
            addCriterion("CUS_FX =", value, "cusFx");
            return (Criteria) this;
        }

        public Criteria andCusFxNotEqualTo(String value) {
            addCriterion("CUS_FX <>", value, "cusFx");
            return (Criteria) this;
        }

        public Criteria andCusFxGreaterThan(String value) {
            addCriterion("CUS_FX >", value, "cusFx");
            return (Criteria) this;
        }

        public Criteria andCusFxGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_FX >=", value, "cusFx");
            return (Criteria) this;
        }

        public Criteria andCusFxLessThan(String value) {
            addCriterion("CUS_FX <", value, "cusFx");
            return (Criteria) this;
        }

        public Criteria andCusFxLessThanOrEqualTo(String value) {
            addCriterion("CUS_FX <=", value, "cusFx");
            return (Criteria) this;
        }

        public Criteria andCusFxLike(String value) {
            addCriterion("CUS_FX like", value, "cusFx");
            return (Criteria) this;
        }

        public Criteria andCusFxNotLike(String value) {
            addCriterion("CUS_FX not like", value, "cusFx");
            return (Criteria) this;
        }

        public Criteria andCusFxIn(List<String> values) {
            addCriterion("CUS_FX in", values, "cusFx");
            return (Criteria) this;
        }

        public Criteria andCusFxNotIn(List<String> values) {
            addCriterion("CUS_FX not in", values, "cusFx");
            return (Criteria) this;
        }

        public Criteria andCusFxBetween(String value1, String value2) {
            addCriterion("CUS_FX between", value1, value2, "cusFx");
            return (Criteria) this;
        }

        public Criteria andCusFxNotBetween(String value1, String value2) {
            addCriterion("CUS_FX not between", value1, value2, "cusFx");
            return (Criteria) this;
        }

        public Criteria andAmtnHxIsNull() {
            addCriterion("AMTN_HX is null");
            return (Criteria) this;
        }

        public Criteria andAmtnHxIsNotNull() {
            addCriterion("AMTN_HX is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnHxEqualTo(BigDecimal value) {
            addCriterion("AMTN_HX =", value, "amtnHx");
            return (Criteria) this;
        }

        public Criteria andAmtnHxNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_HX <>", value, "amtnHx");
            return (Criteria) this;
        }

        public Criteria andAmtnHxGreaterThan(BigDecimal value) {
            addCriterion("AMTN_HX >", value, "amtnHx");
            return (Criteria) this;
        }

        public Criteria andAmtnHxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_HX >=", value, "amtnHx");
            return (Criteria) this;
        }

        public Criteria andAmtnHxLessThan(BigDecimal value) {
            addCriterion("AMTN_HX <", value, "amtnHx");
            return (Criteria) this;
        }

        public Criteria andAmtnHxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_HX <=", value, "amtnHx");
            return (Criteria) this;
        }

        public Criteria andAmtnHxIn(List<BigDecimal> values) {
            addCriterion("AMTN_HX in", values, "amtnHx");
            return (Criteria) this;
        }

        public Criteria andAmtnHxNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_HX not in", values, "amtnHx");
            return (Criteria) this;
        }

        public Criteria andAmtnHxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_HX between", value1, value2, "amtnHx");
            return (Criteria) this;
        }

        public Criteria andAmtnHxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_HX not between", value1, value2, "amtnHx");
            return (Criteria) this;
        }

        public Criteria andAmtnHxMaxIsNull() {
            addCriterion("AMTN_HX_MAX is null");
            return (Criteria) this;
        }

        public Criteria andAmtnHxMaxIsNotNull() {
            addCriterion("AMTN_HX_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnHxMaxEqualTo(BigDecimal value) {
            addCriterion("AMTN_HX_MAX =", value, "amtnHxMax");
            return (Criteria) this;
        }

        public Criteria andAmtnHxMaxNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_HX_MAX <>", value, "amtnHxMax");
            return (Criteria) this;
        }

        public Criteria andAmtnHxMaxGreaterThan(BigDecimal value) {
            addCriterion("AMTN_HX_MAX >", value, "amtnHxMax");
            return (Criteria) this;
        }

        public Criteria andAmtnHxMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_HX_MAX >=", value, "amtnHxMax");
            return (Criteria) this;
        }

        public Criteria andAmtnHxMaxLessThan(BigDecimal value) {
            addCriterion("AMTN_HX_MAX <", value, "amtnHxMax");
            return (Criteria) this;
        }

        public Criteria andAmtnHxMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_HX_MAX <=", value, "amtnHxMax");
            return (Criteria) this;
        }

        public Criteria andAmtnHxMaxIn(List<BigDecimal> values) {
            addCriterion("AMTN_HX_MAX in", values, "amtnHxMax");
            return (Criteria) this;
        }

        public Criteria andAmtnHxMaxNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_HX_MAX not in", values, "amtnHxMax");
            return (Criteria) this;
        }

        public Criteria andAmtnHxMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_HX_MAX between", value1, value2, "amtnHxMax");
            return (Criteria) this;
        }

        public Criteria andAmtnHxMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_HX_MAX not between", value1, value2, "amtnHxMax");
            return (Criteria) this;
        }

        public Criteria andHxjsIdIsNull() {
            addCriterion("HXJS_ID is null");
            return (Criteria) this;
        }

        public Criteria andHxjsIdIsNotNull() {
            addCriterion("HXJS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHxjsIdEqualTo(String value) {
            addCriterion("HXJS_ID =", value, "hxjsId");
            return (Criteria) this;
        }

        public Criteria andHxjsIdNotEqualTo(String value) {
            addCriterion("HXJS_ID <>", value, "hxjsId");
            return (Criteria) this;
        }

        public Criteria andHxjsIdGreaterThan(String value) {
            addCriterion("HXJS_ID >", value, "hxjsId");
            return (Criteria) this;
        }

        public Criteria andHxjsIdGreaterThanOrEqualTo(String value) {
            addCriterion("HXJS_ID >=", value, "hxjsId");
            return (Criteria) this;
        }

        public Criteria andHxjsIdLessThan(String value) {
            addCriterion("HXJS_ID <", value, "hxjsId");
            return (Criteria) this;
        }

        public Criteria andHxjsIdLessThanOrEqualTo(String value) {
            addCriterion("HXJS_ID <=", value, "hxjsId");
            return (Criteria) this;
        }

        public Criteria andHxjsIdLike(String value) {
            addCriterion("HXJS_ID like", value, "hxjsId");
            return (Criteria) this;
        }

        public Criteria andHxjsIdNotLike(String value) {
            addCriterion("HXJS_ID not like", value, "hxjsId");
            return (Criteria) this;
        }

        public Criteria andHxjsIdIn(List<String> values) {
            addCriterion("HXJS_ID in", values, "hxjsId");
            return (Criteria) this;
        }

        public Criteria andHxjsIdNotIn(List<String> values) {
            addCriterion("HXJS_ID not in", values, "hxjsId");
            return (Criteria) this;
        }

        public Criteria andHxjsIdBetween(String value1, String value2) {
            addCriterion("HXJS_ID between", value1, value2, "hxjsId");
            return (Criteria) this;
        }

        public Criteria andHxjsIdNotBetween(String value1, String value2) {
            addCriterion("HXJS_ID not between", value1, value2, "hxjsId");
            return (Criteria) this;
        }

        public Criteria andChkCacheIsNull() {
            addCriterion("CHK_CACHE is null");
            return (Criteria) this;
        }

        public Criteria andChkCacheIsNotNull() {
            addCriterion("CHK_CACHE is not null");
            return (Criteria) this;
        }

        public Criteria andChkCacheEqualTo(String value) {
            addCriterion("CHK_CACHE =", value, "chkCache");
            return (Criteria) this;
        }

        public Criteria andChkCacheNotEqualTo(String value) {
            addCriterion("CHK_CACHE <>", value, "chkCache");
            return (Criteria) this;
        }

        public Criteria andChkCacheGreaterThan(String value) {
            addCriterion("CHK_CACHE >", value, "chkCache");
            return (Criteria) this;
        }

        public Criteria andChkCacheGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_CACHE >=", value, "chkCache");
            return (Criteria) this;
        }

        public Criteria andChkCacheLessThan(String value) {
            addCriterion("CHK_CACHE <", value, "chkCache");
            return (Criteria) this;
        }

        public Criteria andChkCacheLessThanOrEqualTo(String value) {
            addCriterion("CHK_CACHE <=", value, "chkCache");
            return (Criteria) this;
        }

        public Criteria andChkCacheLike(String value) {
            addCriterion("CHK_CACHE like", value, "chkCache");
            return (Criteria) this;
        }

        public Criteria andChkCacheNotLike(String value) {
            addCriterion("CHK_CACHE not like", value, "chkCache");
            return (Criteria) this;
        }

        public Criteria andChkCacheIn(List<String> values) {
            addCriterion("CHK_CACHE in", values, "chkCache");
            return (Criteria) this;
        }

        public Criteria andChkCacheNotIn(List<String> values) {
            addCriterion("CHK_CACHE not in", values, "chkCache");
            return (Criteria) this;
        }

        public Criteria andChkCacheBetween(String value1, String value2) {
            addCriterion("CHK_CACHE between", value1, value2, "chkCache");
            return (Criteria) this;
        }

        public Criteria andChkCacheNotBetween(String value1, String value2) {
            addCriterion("CHK_CACHE not between", value1, value2, "chkCache");
            return (Criteria) this;
        }

        public Criteria andChkFullPayIsNull() {
            addCriterion("CHK_FULL_PAY is null");
            return (Criteria) this;
        }

        public Criteria andChkFullPayIsNotNull() {
            addCriterion("CHK_FULL_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andChkFullPayEqualTo(String value) {
            addCriterion("CHK_FULL_PAY =", value, "chkFullPay");
            return (Criteria) this;
        }

        public Criteria andChkFullPayNotEqualTo(String value) {
            addCriterion("CHK_FULL_PAY <>", value, "chkFullPay");
            return (Criteria) this;
        }

        public Criteria andChkFullPayGreaterThan(String value) {
            addCriterion("CHK_FULL_PAY >", value, "chkFullPay");
            return (Criteria) this;
        }

        public Criteria andChkFullPayGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_FULL_PAY >=", value, "chkFullPay");
            return (Criteria) this;
        }

        public Criteria andChkFullPayLessThan(String value) {
            addCriterion("CHK_FULL_PAY <", value, "chkFullPay");
            return (Criteria) this;
        }

        public Criteria andChkFullPayLessThanOrEqualTo(String value) {
            addCriterion("CHK_FULL_PAY <=", value, "chkFullPay");
            return (Criteria) this;
        }

        public Criteria andChkFullPayLike(String value) {
            addCriterion("CHK_FULL_PAY like", value, "chkFullPay");
            return (Criteria) this;
        }

        public Criteria andChkFullPayNotLike(String value) {
            addCriterion("CHK_FULL_PAY not like", value, "chkFullPay");
            return (Criteria) this;
        }

        public Criteria andChkFullPayIn(List<String> values) {
            addCriterion("CHK_FULL_PAY in", values, "chkFullPay");
            return (Criteria) this;
        }

        public Criteria andChkFullPayNotIn(List<String> values) {
            addCriterion("CHK_FULL_PAY not in", values, "chkFullPay");
            return (Criteria) this;
        }

        public Criteria andChkFullPayBetween(String value1, String value2) {
            addCriterion("CHK_FULL_PAY between", value1, value2, "chkFullPay");
            return (Criteria) this;
        }

        public Criteria andChkFullPayNotBetween(String value1, String value2) {
            addCriterion("CHK_FULL_PAY not between", value1, value2, "chkFullPay");
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

        public Criteria andChkFullPaidIsNull() {
            addCriterion("CHK_FULL_PAID is null");
            return (Criteria) this;
        }

        public Criteria andChkFullPaidIsNotNull() {
            addCriterion("CHK_FULL_PAID is not null");
            return (Criteria) this;
        }

        public Criteria andChkFullPaidEqualTo(String value) {
            addCriterion("CHK_FULL_PAID =", value, "chkFullPaid");
            return (Criteria) this;
        }

        public Criteria andChkFullPaidNotEqualTo(String value) {
            addCriterion("CHK_FULL_PAID <>", value, "chkFullPaid");
            return (Criteria) this;
        }

        public Criteria andChkFullPaidGreaterThan(String value) {
            addCriterion("CHK_FULL_PAID >", value, "chkFullPaid");
            return (Criteria) this;
        }

        public Criteria andChkFullPaidGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_FULL_PAID >=", value, "chkFullPaid");
            return (Criteria) this;
        }

        public Criteria andChkFullPaidLessThan(String value) {
            addCriterion("CHK_FULL_PAID <", value, "chkFullPaid");
            return (Criteria) this;
        }

        public Criteria andChkFullPaidLessThanOrEqualTo(String value) {
            addCriterion("CHK_FULL_PAID <=", value, "chkFullPaid");
            return (Criteria) this;
        }

        public Criteria andChkFullPaidLike(String value) {
            addCriterion("CHK_FULL_PAID like", value, "chkFullPaid");
            return (Criteria) this;
        }

        public Criteria andChkFullPaidNotLike(String value) {
            addCriterion("CHK_FULL_PAID not like", value, "chkFullPaid");
            return (Criteria) this;
        }

        public Criteria andChkFullPaidIn(List<String> values) {
            addCriterion("CHK_FULL_PAID in", values, "chkFullPaid");
            return (Criteria) this;
        }

        public Criteria andChkFullPaidNotIn(List<String> values) {
            addCriterion("CHK_FULL_PAID not in", values, "chkFullPaid");
            return (Criteria) this;
        }

        public Criteria andChkFullPaidBetween(String value1, String value2) {
            addCriterion("CHK_FULL_PAID between", value1, value2, "chkFullPaid");
            return (Criteria) this;
        }

        public Criteria andChkFullPaidNotBetween(String value1, String value2) {
            addCriterion("CHK_FULL_PAID not between", value1, value2, "chkFullPaid");
            return (Criteria) this;
        }

        public Criteria andEcNoIsNull() {
            addCriterion("EC_NO is null");
            return (Criteria) this;
        }

        public Criteria andEcNoIsNotNull() {
            addCriterion("EC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEcNoEqualTo(String value) {
            addCriterion("EC_NO =", value, "ecNo");
            return (Criteria) this;
        }

        public Criteria andEcNoNotEqualTo(String value) {
            addCriterion("EC_NO <>", value, "ecNo");
            return (Criteria) this;
        }

        public Criteria andEcNoGreaterThan(String value) {
            addCriterion("EC_NO >", value, "ecNo");
            return (Criteria) this;
        }

        public Criteria andEcNoGreaterThanOrEqualTo(String value) {
            addCriterion("EC_NO >=", value, "ecNo");
            return (Criteria) this;
        }

        public Criteria andEcNoLessThan(String value) {
            addCriterion("EC_NO <", value, "ecNo");
            return (Criteria) this;
        }

        public Criteria andEcNoLessThanOrEqualTo(String value) {
            addCriterion("EC_NO <=", value, "ecNo");
            return (Criteria) this;
        }

        public Criteria andEcNoLike(String value) {
            addCriterion("EC_NO like", value, "ecNo");
            return (Criteria) this;
        }

        public Criteria andEcNoNotLike(String value) {
            addCriterion("EC_NO not like", value, "ecNo");
            return (Criteria) this;
        }

        public Criteria andEcNoIn(List<String> values) {
            addCriterion("EC_NO in", values, "ecNo");
            return (Criteria) this;
        }

        public Criteria andEcNoNotIn(List<String> values) {
            addCriterion("EC_NO not in", values, "ecNo");
            return (Criteria) this;
        }

        public Criteria andEcNoBetween(String value1, String value2) {
            addCriterion("EC_NO between", value1, value2, "ecNo");
            return (Criteria) this;
        }

        public Criteria andEcNoNotBetween(String value1, String value2) {
            addCriterion("EC_NO not between", value1, value2, "ecNo");
            return (Criteria) this;
        }

        public Criteria andFlgRushIsNull() {
            addCriterion("FLG_RUSH is null");
            return (Criteria) this;
        }

        public Criteria andFlgRushIsNotNull() {
            addCriterion("FLG_RUSH is not null");
            return (Criteria) this;
        }

        public Criteria andFlgRushEqualTo(String value) {
            addCriterion("FLG_RUSH =", value, "flgRush");
            return (Criteria) this;
        }

        public Criteria andFlgRushNotEqualTo(String value) {
            addCriterion("FLG_RUSH <>", value, "flgRush");
            return (Criteria) this;
        }

        public Criteria andFlgRushGreaterThan(String value) {
            addCriterion("FLG_RUSH >", value, "flgRush");
            return (Criteria) this;
        }

        public Criteria andFlgRushGreaterThanOrEqualTo(String value) {
            addCriterion("FLG_RUSH >=", value, "flgRush");
            return (Criteria) this;
        }

        public Criteria andFlgRushLessThan(String value) {
            addCriterion("FLG_RUSH <", value, "flgRush");
            return (Criteria) this;
        }

        public Criteria andFlgRushLessThanOrEqualTo(String value) {
            addCriterion("FLG_RUSH <=", value, "flgRush");
            return (Criteria) this;
        }

        public Criteria andFlgRushLike(String value) {
            addCriterion("FLG_RUSH like", value, "flgRush");
            return (Criteria) this;
        }

        public Criteria andFlgRushNotLike(String value) {
            addCriterion("FLG_RUSH not like", value, "flgRush");
            return (Criteria) this;
        }

        public Criteria andFlgRushIn(List<String> values) {
            addCriterion("FLG_RUSH in", values, "flgRush");
            return (Criteria) this;
        }

        public Criteria andFlgRushNotIn(List<String> values) {
            addCriterion("FLG_RUSH not in", values, "flgRush");
            return (Criteria) this;
        }

        public Criteria andFlgRushBetween(String value1, String value2) {
            addCriterion("FLG_RUSH between", value1, value2, "flgRush");
            return (Criteria) this;
        }

        public Criteria andFlgRushNotBetween(String value1, String value2) {
            addCriterion("FLG_RUSH not between", value1, value2, "flgRush");
            return (Criteria) this;
        }

        public Criteria andSendWayIsNull() {
            addCriterion("SEND_WAY is null");
            return (Criteria) this;
        }

        public Criteria andSendWayIsNotNull() {
            addCriterion("SEND_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andSendWayEqualTo(String value) {
            addCriterion("SEND_WAY =", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayNotEqualTo(String value) {
            addCriterion("SEND_WAY <>", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayGreaterThan(String value) {
            addCriterion("SEND_WAY >", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_WAY >=", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayLessThan(String value) {
            addCriterion("SEND_WAY <", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayLessThanOrEqualTo(String value) {
            addCriterion("SEND_WAY <=", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayLike(String value) {
            addCriterion("SEND_WAY like", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayNotLike(String value) {
            addCriterion("SEND_WAY not like", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayIn(List<String> values) {
            addCriterion("SEND_WAY in", values, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayNotIn(List<String> values) {
            addCriterion("SEND_WAY not in", values, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayBetween(String value1, String value2) {
            addCriterion("SEND_WAY between", value1, value2, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayNotBetween(String value1, String value2) {
            addCriterion("SEND_WAY not between", value1, value2, "sendWay");
            return (Criteria) this;
        }

        public Criteria andGroupDxIsNull() {
            addCriterion("GROUP_DX is null");
            return (Criteria) this;
        }

        public Criteria andGroupDxIsNotNull() {
            addCriterion("GROUP_DX is not null");
            return (Criteria) this;
        }

        public Criteria andGroupDxEqualTo(String value) {
            addCriterion("GROUP_DX =", value, "groupDx");
            return (Criteria) this;
        }

        public Criteria andGroupDxNotEqualTo(String value) {
            addCriterion("GROUP_DX <>", value, "groupDx");
            return (Criteria) this;
        }

        public Criteria andGroupDxGreaterThan(String value) {
            addCriterion("GROUP_DX >", value, "groupDx");
            return (Criteria) this;
        }

        public Criteria andGroupDxGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_DX >=", value, "groupDx");
            return (Criteria) this;
        }

        public Criteria andGroupDxLessThan(String value) {
            addCriterion("GROUP_DX <", value, "groupDx");
            return (Criteria) this;
        }

        public Criteria andGroupDxLessThanOrEqualTo(String value) {
            addCriterion("GROUP_DX <=", value, "groupDx");
            return (Criteria) this;
        }

        public Criteria andGroupDxLike(String value) {
            addCriterion("GROUP_DX like", value, "groupDx");
            return (Criteria) this;
        }

        public Criteria andGroupDxNotLike(String value) {
            addCriterion("GROUP_DX not like", value, "groupDx");
            return (Criteria) this;
        }

        public Criteria andGroupDxIn(List<String> values) {
            addCriterion("GROUP_DX in", values, "groupDx");
            return (Criteria) this;
        }

        public Criteria andGroupDxNotIn(List<String> values) {
            addCriterion("GROUP_DX not in", values, "groupDx");
            return (Criteria) this;
        }

        public Criteria andGroupDxBetween(String value1, String value2) {
            addCriterion("GROUP_DX between", value1, value2, "groupDx");
            return (Criteria) this;
        }

        public Criteria andGroupDxNotBetween(String value1, String value2) {
            addCriterion("GROUP_DX not between", value1, value2, "groupDx");
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