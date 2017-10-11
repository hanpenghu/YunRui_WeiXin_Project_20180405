package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TfPosZExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TfPosZExample() {
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

        public Criteria andCfdm1IsNull() {
            addCriterion("CFDM1 is null");
            return (Criteria) this;
        }

        public Criteria andCfdm1IsNotNull() {
            addCriterion("CFDM1 is not null");
            return (Criteria) this;
        }

        public Criteria andCfdm1EqualTo(String value) {
            addCriterion("CFDM1 =", value, "cfdm1");
            return (Criteria) this;
        }

        public Criteria andCfdm1NotEqualTo(String value) {
            addCriterion("CFDM1 <>", value, "cfdm1");
            return (Criteria) this;
        }

        public Criteria andCfdm1GreaterThan(String value) {
            addCriterion("CFDM1 >", value, "cfdm1");
            return (Criteria) this;
        }

        public Criteria andCfdm1GreaterThanOrEqualTo(String value) {
            addCriterion("CFDM1 >=", value, "cfdm1");
            return (Criteria) this;
        }

        public Criteria andCfdm1LessThan(String value) {
            addCriterion("CFDM1 <", value, "cfdm1");
            return (Criteria) this;
        }

        public Criteria andCfdm1LessThanOrEqualTo(String value) {
            addCriterion("CFDM1 <=", value, "cfdm1");
            return (Criteria) this;
        }

        public Criteria andCfdm1Like(String value) {
            addCriterion("CFDM1 like", value, "cfdm1");
            return (Criteria) this;
        }

        public Criteria andCfdm1NotLike(String value) {
            addCriterion("CFDM1 not like", value, "cfdm1");
            return (Criteria) this;
        }

        public Criteria andCfdm1In(List<String> values) {
            addCriterion("CFDM1 in", values, "cfdm1");
            return (Criteria) this;
        }

        public Criteria andCfdm1NotIn(List<String> values) {
            addCriterion("CFDM1 not in", values, "cfdm1");
            return (Criteria) this;
        }

        public Criteria andCfdm1Between(String value1, String value2) {
            addCriterion("CFDM1 between", value1, value2, "cfdm1");
            return (Criteria) this;
        }

        public Criteria andCfdm1NotBetween(String value1, String value2) {
            addCriterion("CFDM1 not between", value1, value2, "cfdm1");
            return (Criteria) this;
        }

        public Criteria andKhhhIsNull() {
            addCriterion("KHHH is null");
            return (Criteria) this;
        }

        public Criteria andKhhhIsNotNull() {
            addCriterion("KHHH is not null");
            return (Criteria) this;
        }

        public Criteria andKhhhEqualTo(String value) {
            addCriterion("KHHH =", value, "khhh");
            return (Criteria) this;
        }

        public Criteria andKhhhNotEqualTo(String value) {
            addCriterion("KHHH <>", value, "khhh");
            return (Criteria) this;
        }

        public Criteria andKhhhGreaterThan(String value) {
            addCriterion("KHHH >", value, "khhh");
            return (Criteria) this;
        }

        public Criteria andKhhhGreaterThanOrEqualTo(String value) {
            addCriterion("KHHH >=", value, "khhh");
            return (Criteria) this;
        }

        public Criteria andKhhhLessThan(String value) {
            addCriterion("KHHH <", value, "khhh");
            return (Criteria) this;
        }

        public Criteria andKhhhLessThanOrEqualTo(String value) {
            addCriterion("KHHH <=", value, "khhh");
            return (Criteria) this;
        }

        public Criteria andKhhhLike(String value) {
            addCriterion("KHHH like", value, "khhh");
            return (Criteria) this;
        }

        public Criteria andKhhhNotLike(String value) {
            addCriterion("KHHH not like", value, "khhh");
            return (Criteria) this;
        }

        public Criteria andKhhhIn(List<String> values) {
            addCriterion("KHHH in", values, "khhh");
            return (Criteria) this;
        }

        public Criteria andKhhhNotIn(List<String> values) {
            addCriterion("KHHH not in", values, "khhh");
            return (Criteria) this;
        }

        public Criteria andKhhhBetween(String value1, String value2) {
            addCriterion("KHHH between", value1, value2, "khhh");
            return (Criteria) this;
        }

        public Criteria andKhhhNotBetween(String value1, String value2) {
            addCriterion("KHHH not between", value1, value2, "khhh");
            return (Criteria) this;
        }

        public Criteria andKhhpmcIsNull() {
            addCriterion("KHHPMC is null");
            return (Criteria) this;
        }

        public Criteria andKhhpmcIsNotNull() {
            addCriterion("KHHPMC is not null");
            return (Criteria) this;
        }

        public Criteria andKhhpmcEqualTo(String value) {
            addCriterion("KHHPMC =", value, "khhpmc");
            return (Criteria) this;
        }

        public Criteria andKhhpmcNotEqualTo(String value) {
            addCriterion("KHHPMC <>", value, "khhpmc");
            return (Criteria) this;
        }

        public Criteria andKhhpmcGreaterThan(String value) {
            addCriterion("KHHPMC >", value, "khhpmc");
            return (Criteria) this;
        }

        public Criteria andKhhpmcGreaterThanOrEqualTo(String value) {
            addCriterion("KHHPMC >=", value, "khhpmc");
            return (Criteria) this;
        }

        public Criteria andKhhpmcLessThan(String value) {
            addCriterion("KHHPMC <", value, "khhpmc");
            return (Criteria) this;
        }

        public Criteria andKhhpmcLessThanOrEqualTo(String value) {
            addCriterion("KHHPMC <=", value, "khhpmc");
            return (Criteria) this;
        }

        public Criteria andKhhpmcLike(String value) {
            addCriterion("KHHPMC like", value, "khhpmc");
            return (Criteria) this;
        }

        public Criteria andKhhpmcNotLike(String value) {
            addCriterion("KHHPMC not like", value, "khhpmc");
            return (Criteria) this;
        }

        public Criteria andKhhpmcIn(List<String> values) {
            addCriterion("KHHPMC in", values, "khhpmc");
            return (Criteria) this;
        }

        public Criteria andKhhpmcNotIn(List<String> values) {
            addCriterion("KHHPMC not in", values, "khhpmc");
            return (Criteria) this;
        }

        public Criteria andKhhpmcBetween(String value1, String value2) {
            addCriterion("KHHPMC between", value1, value2, "khhpmc");
            return (Criteria) this;
        }

        public Criteria andKhhpmcNotBetween(String value1, String value2) {
            addCriterion("KHHPMC not between", value1, value2, "khhpmc");
            return (Criteria) this;
        }

        public Criteria andKhnbdhIsNull() {
            addCriterion("KHNBDH is null");
            return (Criteria) this;
        }

        public Criteria andKhnbdhIsNotNull() {
            addCriterion("KHNBDH is not null");
            return (Criteria) this;
        }

        public Criteria andKhnbdhEqualTo(String value) {
            addCriterion("KHNBDH =", value, "khnbdh");
            return (Criteria) this;
        }

        public Criteria andKhnbdhNotEqualTo(String value) {
            addCriterion("KHNBDH <>", value, "khnbdh");
            return (Criteria) this;
        }

        public Criteria andKhnbdhGreaterThan(String value) {
            addCriterion("KHNBDH >", value, "khnbdh");
            return (Criteria) this;
        }

        public Criteria andKhnbdhGreaterThanOrEqualTo(String value) {
            addCriterion("KHNBDH >=", value, "khnbdh");
            return (Criteria) this;
        }

        public Criteria andKhnbdhLessThan(String value) {
            addCriterion("KHNBDH <", value, "khnbdh");
            return (Criteria) this;
        }

        public Criteria andKhnbdhLessThanOrEqualTo(String value) {
            addCriterion("KHNBDH <=", value, "khnbdh");
            return (Criteria) this;
        }

        public Criteria andKhnbdhLike(String value) {
            addCriterion("KHNBDH like", value, "khnbdh");
            return (Criteria) this;
        }

        public Criteria andKhnbdhNotLike(String value) {
            addCriterion("KHNBDH not like", value, "khnbdh");
            return (Criteria) this;
        }

        public Criteria andKhnbdhIn(List<String> values) {
            addCriterion("KHNBDH in", values, "khnbdh");
            return (Criteria) this;
        }

        public Criteria andKhnbdhNotIn(List<String> values) {
            addCriterion("KHNBDH not in", values, "khnbdh");
            return (Criteria) this;
        }

        public Criteria andKhnbdhBetween(String value1, String value2) {
            addCriterion("KHNBDH between", value1, value2, "khnbdh");
            return (Criteria) this;
        }

        public Criteria andKhnbdhNotBetween(String value1, String value2) {
            addCriterion("KHNBDH not between", value1, value2, "khnbdh");
            return (Criteria) this;
        }

        public Criteria andSaphhIsNull() {
            addCriterion("SAPHH is null");
            return (Criteria) this;
        }

        public Criteria andSaphhIsNotNull() {
            addCriterion("SAPHH is not null");
            return (Criteria) this;
        }

        public Criteria andSaphhEqualTo(String value) {
            addCriterion("SAPHH =", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhNotEqualTo(String value) {
            addCriterion("SAPHH <>", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhGreaterThan(String value) {
            addCriterion("SAPHH >", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhGreaterThanOrEqualTo(String value) {
            addCriterion("SAPHH >=", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhLessThan(String value) {
            addCriterion("SAPHH <", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhLessThanOrEqualTo(String value) {
            addCriterion("SAPHH <=", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhLike(String value) {
            addCriterion("SAPHH like", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhNotLike(String value) {
            addCriterion("SAPHH not like", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhIn(List<String> values) {
            addCriterion("SAPHH in", values, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhNotIn(List<String> values) {
            addCriterion("SAPHH not in", values, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhBetween(String value1, String value2) {
            addCriterion("SAPHH between", value1, value2, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhNotBetween(String value1, String value2) {
            addCriterion("SAPHH not between", value1, value2, "saphh");
            return (Criteria) this;
        }

        public Criteria andSappmIsNull() {
            addCriterion("SAPPM is null");
            return (Criteria) this;
        }

        public Criteria andSappmIsNotNull() {
            addCriterion("SAPPM is not null");
            return (Criteria) this;
        }

        public Criteria andSappmEqualTo(String value) {
            addCriterion("SAPPM =", value, "sappm");
            return (Criteria) this;
        }

        public Criteria andSappmNotEqualTo(String value) {
            addCriterion("SAPPM <>", value, "sappm");
            return (Criteria) this;
        }

        public Criteria andSappmGreaterThan(String value) {
            addCriterion("SAPPM >", value, "sappm");
            return (Criteria) this;
        }

        public Criteria andSappmGreaterThanOrEqualTo(String value) {
            addCriterion("SAPPM >=", value, "sappm");
            return (Criteria) this;
        }

        public Criteria andSappmLessThan(String value) {
            addCriterion("SAPPM <", value, "sappm");
            return (Criteria) this;
        }

        public Criteria andSappmLessThanOrEqualTo(String value) {
            addCriterion("SAPPM <=", value, "sappm");
            return (Criteria) this;
        }

        public Criteria andSappmLike(String value) {
            addCriterion("SAPPM like", value, "sappm");
            return (Criteria) this;
        }

        public Criteria andSappmNotLike(String value) {
            addCriterion("SAPPM not like", value, "sappm");
            return (Criteria) this;
        }

        public Criteria andSappmIn(List<String> values) {
            addCriterion("SAPPM in", values, "sappm");
            return (Criteria) this;
        }

        public Criteria andSappmNotIn(List<String> values) {
            addCriterion("SAPPM not in", values, "sappm");
            return (Criteria) this;
        }

        public Criteria andSappmBetween(String value1, String value2) {
            addCriterion("SAPPM between", value1, value2, "sappm");
            return (Criteria) this;
        }

        public Criteria andSappmNotBetween(String value1, String value2) {
            addCriterion("SAPPM not between", value1, value2, "sappm");
            return (Criteria) this;
        }

        public Criteria andXqslIsNull() {
            addCriterion("XQSL is null");
            return (Criteria) this;
        }

        public Criteria andXqslIsNotNull() {
            addCriterion("XQSL is not null");
            return (Criteria) this;
        }

        public Criteria andXqslEqualTo(BigDecimal value) {
            addCriterion("XQSL =", value, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslNotEqualTo(BigDecimal value) {
            addCriterion("XQSL <>", value, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslGreaterThan(BigDecimal value) {
            addCriterion("XQSL >", value, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XQSL >=", value, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslLessThan(BigDecimal value) {
            addCriterion("XQSL <", value, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XQSL <=", value, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslIn(List<BigDecimal> values) {
            addCriterion("XQSL in", values, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslNotIn(List<BigDecimal> values) {
            addCriterion("XQSL not in", values, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XQSL between", value1, value2, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XQSL not between", value1, value2, "xqsl");
            return (Criteria) this;
        }

        public Criteria andFhrqIsNull() {
            addCriterion("FHRQ is null");
            return (Criteria) this;
        }

        public Criteria andFhrqIsNotNull() {
            addCriterion("FHRQ is not null");
            return (Criteria) this;
        }

        public Criteria andFhrqEqualTo(Date value) {
            addCriterion("FHRQ =", value, "fhrq");
            return (Criteria) this;
        }

        public Criteria andFhrqNotEqualTo(Date value) {
            addCriterion("FHRQ <>", value, "fhrq");
            return (Criteria) this;
        }

        public Criteria andFhrqGreaterThan(Date value) {
            addCriterion("FHRQ >", value, "fhrq");
            return (Criteria) this;
        }

        public Criteria andFhrqGreaterThanOrEqualTo(Date value) {
            addCriterion("FHRQ >=", value, "fhrq");
            return (Criteria) this;
        }

        public Criteria andFhrqLessThan(Date value) {
            addCriterion("FHRQ <", value, "fhrq");
            return (Criteria) this;
        }

        public Criteria andFhrqLessThanOrEqualTo(Date value) {
            addCriterion("FHRQ <=", value, "fhrq");
            return (Criteria) this;
        }

        public Criteria andFhrqIn(List<Date> values) {
            addCriterion("FHRQ in", values, "fhrq");
            return (Criteria) this;
        }

        public Criteria andFhrqNotIn(List<Date> values) {
            addCriterion("FHRQ not in", values, "fhrq");
            return (Criteria) this;
        }

        public Criteria andFhrqBetween(Date value1, Date value2) {
            addCriterion("FHRQ between", value1, value2, "fhrq");
            return (Criteria) this;
        }

        public Criteria andFhrqNotBetween(Date value1, Date value2) {
            addCriterion("FHRQ not between", value1, value2, "fhrq");
            return (Criteria) this;
        }

        public Criteria andSapwlm1IsNull() {
            addCriterion("SAPWLM1 is null");
            return (Criteria) this;
        }

        public Criteria andSapwlm1IsNotNull() {
            addCriterion("SAPWLM1 is not null");
            return (Criteria) this;
        }

        public Criteria andSapwlm1EqualTo(String value) {
            addCriterion("SAPWLM1 =", value, "sapwlm1");
            return (Criteria) this;
        }

        public Criteria andSapwlm1NotEqualTo(String value) {
            addCriterion("SAPWLM1 <>", value, "sapwlm1");
            return (Criteria) this;
        }

        public Criteria andSapwlm1GreaterThan(String value) {
            addCriterion("SAPWLM1 >", value, "sapwlm1");
            return (Criteria) this;
        }

        public Criteria andSapwlm1GreaterThanOrEqualTo(String value) {
            addCriterion("SAPWLM1 >=", value, "sapwlm1");
            return (Criteria) this;
        }

        public Criteria andSapwlm1LessThan(String value) {
            addCriterion("SAPWLM1 <", value, "sapwlm1");
            return (Criteria) this;
        }

        public Criteria andSapwlm1LessThanOrEqualTo(String value) {
            addCriterion("SAPWLM1 <=", value, "sapwlm1");
            return (Criteria) this;
        }

        public Criteria andSapwlm1Like(String value) {
            addCriterion("SAPWLM1 like", value, "sapwlm1");
            return (Criteria) this;
        }

        public Criteria andSapwlm1NotLike(String value) {
            addCriterion("SAPWLM1 not like", value, "sapwlm1");
            return (Criteria) this;
        }

        public Criteria andSapwlm1In(List<String> values) {
            addCriterion("SAPWLM1 in", values, "sapwlm1");
            return (Criteria) this;
        }

        public Criteria andSapwlm1NotIn(List<String> values) {
            addCriterion("SAPWLM1 not in", values, "sapwlm1");
            return (Criteria) this;
        }

        public Criteria andSapwlm1Between(String value1, String value2) {
            addCriterion("SAPWLM1 between", value1, value2, "sapwlm1");
            return (Criteria) this;
        }

        public Criteria andSapwlm1NotBetween(String value1, String value2) {
            addCriterion("SAPWLM1 not between", value1, value2, "sapwlm1");
            return (Criteria) this;
        }

        public Criteria andQdlIsNull() {
            addCriterion("QDL is null");
            return (Criteria) this;
        }

        public Criteria andQdlIsNotNull() {
            addCriterion("QDL is not null");
            return (Criteria) this;
        }

        public Criteria andQdlEqualTo(String value) {
            addCriterion("QDL =", value, "qdl");
            return (Criteria) this;
        }

        public Criteria andQdlNotEqualTo(String value) {
            addCriterion("QDL <>", value, "qdl");
            return (Criteria) this;
        }

        public Criteria andQdlGreaterThan(String value) {
            addCriterion("QDL >", value, "qdl");
            return (Criteria) this;
        }

        public Criteria andQdlGreaterThanOrEqualTo(String value) {
            addCriterion("QDL >=", value, "qdl");
            return (Criteria) this;
        }

        public Criteria andQdlLessThan(String value) {
            addCriterion("QDL <", value, "qdl");
            return (Criteria) this;
        }

        public Criteria andQdlLessThanOrEqualTo(String value) {
            addCriterion("QDL <=", value, "qdl");
            return (Criteria) this;
        }

        public Criteria andQdlLike(String value) {
            addCriterion("QDL like", value, "qdl");
            return (Criteria) this;
        }

        public Criteria andQdlNotLike(String value) {
            addCriterion("QDL not like", value, "qdl");
            return (Criteria) this;
        }

        public Criteria andQdlIn(List<String> values) {
            addCriterion("QDL in", values, "qdl");
            return (Criteria) this;
        }

        public Criteria andQdlNotIn(List<String> values) {
            addCriterion("QDL not in", values, "qdl");
            return (Criteria) this;
        }

        public Criteria andQdlBetween(String value1, String value2) {
            addCriterion("QDL between", value1, value2, "qdl");
            return (Criteria) this;
        }

        public Criteria andQdlNotBetween(String value1, String value2) {
            addCriterion("QDL not between", value1, value2, "qdl");
            return (Criteria) this;
        }

        public Criteria andSapphIsNull() {
            addCriterion("SAPPH is null");
            return (Criteria) this;
        }

        public Criteria andSapphIsNotNull() {
            addCriterion("SAPPH is not null");
            return (Criteria) this;
        }

        public Criteria andSapphEqualTo(String value) {
            addCriterion("SAPPH =", value, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphNotEqualTo(String value) {
            addCriterion("SAPPH <>", value, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphGreaterThan(String value) {
            addCriterion("SAPPH >", value, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphGreaterThanOrEqualTo(String value) {
            addCriterion("SAPPH >=", value, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphLessThan(String value) {
            addCriterion("SAPPH <", value, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphLessThanOrEqualTo(String value) {
            addCriterion("SAPPH <=", value, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphLike(String value) {
            addCriterion("SAPPH like", value, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphNotLike(String value) {
            addCriterion("SAPPH not like", value, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphIn(List<String> values) {
            addCriterion("SAPPH in", values, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphNotIn(List<String> values) {
            addCriterion("SAPPH not in", values, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphBetween(String value1, String value2) {
            addCriterion("SAPPH between", value1, value2, "sapph");
            return (Criteria) this;
        }

        public Criteria andSapphNotBetween(String value1, String value2) {
            addCriterion("SAPPH not between", value1, value2, "sapph");
            return (Criteria) this;
        }

        public Criteria andKhddhmIsNull() {
            addCriterion("KHDDHM is null");
            return (Criteria) this;
        }

        public Criteria andKhddhmIsNotNull() {
            addCriterion("KHDDHM is not null");
            return (Criteria) this;
        }

        public Criteria andKhddhmEqualTo(String value) {
            addCriterion("KHDDHM =", value, "khddhm");
            return (Criteria) this;
        }

        public Criteria andKhddhmNotEqualTo(String value) {
            addCriterion("KHDDHM <>", value, "khddhm");
            return (Criteria) this;
        }

        public Criteria andKhddhmGreaterThan(String value) {
            addCriterion("KHDDHM >", value, "khddhm");
            return (Criteria) this;
        }

        public Criteria andKhddhmGreaterThanOrEqualTo(String value) {
            addCriterion("KHDDHM >=", value, "khddhm");
            return (Criteria) this;
        }

        public Criteria andKhddhmLessThan(String value) {
            addCriterion("KHDDHM <", value, "khddhm");
            return (Criteria) this;
        }

        public Criteria andKhddhmLessThanOrEqualTo(String value) {
            addCriterion("KHDDHM <=", value, "khddhm");
            return (Criteria) this;
        }

        public Criteria andKhddhmLike(String value) {
            addCriterion("KHDDHM like", value, "khddhm");
            return (Criteria) this;
        }

        public Criteria andKhddhmNotLike(String value) {
            addCriterion("KHDDHM not like", value, "khddhm");
            return (Criteria) this;
        }

        public Criteria andKhddhmIn(List<String> values) {
            addCriterion("KHDDHM in", values, "khddhm");
            return (Criteria) this;
        }

        public Criteria andKhddhmNotIn(List<String> values) {
            addCriterion("KHDDHM not in", values, "khddhm");
            return (Criteria) this;
        }

        public Criteria andKhddhmBetween(String value1, String value2) {
            addCriterion("KHDDHM between", value1, value2, "khddhm");
            return (Criteria) this;
        }

        public Criteria andKhddhmNotBetween(String value1, String value2) {
            addCriterion("KHDDHM not between", value1, value2, "khddhm");
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