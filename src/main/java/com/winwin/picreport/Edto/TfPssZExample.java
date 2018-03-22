package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TfPssZExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TfPssZExample() {
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

        public Criteria andBcIsNull() {
            addCriterion("BC is null");
            return (Criteria) this;
        }

        public Criteria andBcIsNotNull() {
            addCriterion("BC is not null");
            return (Criteria) this;
        }

        public Criteria andBcEqualTo(BigDecimal value) {
            addCriterion("BC =", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotEqualTo(BigDecimal value) {
            addCriterion("BC <>", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcGreaterThan(BigDecimal value) {
            addCriterion("BC >", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BC >=", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcLessThan(BigDecimal value) {
            addCriterion("BC <", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BC <=", value, "bc");
            return (Criteria) this;
        }

        public Criteria andBcIn(List<BigDecimal> values) {
            addCriterion("BC in", values, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotIn(List<BigDecimal> values) {
            addCriterion("BC not in", values, "bc");
            return (Criteria) this;
        }

        public Criteria andBcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BC between", value1, value2, "bc");
            return (Criteria) this;
        }

        public Criteria andBcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BC not between", value1, value2, "bc");
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

        public Criteria andMzIsNull() {
            addCriterion("MZ is null");
            return (Criteria) this;
        }

        public Criteria andMzIsNotNull() {
            addCriterion("MZ is not null");
            return (Criteria) this;
        }

        public Criteria andMzEqualTo(BigDecimal value) {
            addCriterion("MZ =", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotEqualTo(BigDecimal value) {
            addCriterion("MZ <>", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThan(BigDecimal value) {
            addCriterion("MZ >", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MZ >=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThan(BigDecimal value) {
            addCriterion("MZ <", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MZ <=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzIn(List<BigDecimal> values) {
            addCriterion("MZ in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotIn(List<BigDecimal> values) {
            addCriterion("MZ not in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MZ between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MZ not between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andPzIsNull() {
            addCriterion("PZ is null");
            return (Criteria) this;
        }

        public Criteria andPzIsNotNull() {
            addCriterion("PZ is not null");
            return (Criteria) this;
        }

        public Criteria andPzEqualTo(String value) {
            addCriterion("PZ =", value, "pz");
            return (Criteria) this;
        }

        public Criteria andPzNotEqualTo(String value) {
            addCriterion("PZ <>", value, "pz");
            return (Criteria) this;
        }

        public Criteria andPzGreaterThan(String value) {
            addCriterion("PZ >", value, "pz");
            return (Criteria) this;
        }

        public Criteria andPzGreaterThanOrEqualTo(String value) {
            addCriterion("PZ >=", value, "pz");
            return (Criteria) this;
        }

        public Criteria andPzLessThan(String value) {
            addCriterion("PZ <", value, "pz");
            return (Criteria) this;
        }

        public Criteria andPzLessThanOrEqualTo(String value) {
            addCriterion("PZ <=", value, "pz");
            return (Criteria) this;
        }

        public Criteria andPzLike(String value) {
            addCriterion("PZ like", value, "pz");
            return (Criteria) this;
        }

        public Criteria andPzNotLike(String value) {
            addCriterion("PZ not like", value, "pz");
            return (Criteria) this;
        }

        public Criteria andPzIn(List<String> values) {
            addCriterion("PZ in", values, "pz");
            return (Criteria) this;
        }

        public Criteria andPzNotIn(List<String> values) {
            addCriterion("PZ not in", values, "pz");
            return (Criteria) this;
        }

        public Criteria andPzBetween(String value1, String value2) {
            addCriterion("PZ between", value1, value2, "pz");
            return (Criteria) this;
        }

        public Criteria andPzNotBetween(String value1, String value2) {
            addCriterion("PZ not between", value1, value2, "pz");
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

        public Criteria andXqslIsNull() {
            addCriterion("XQSL is null");
            return (Criteria) this;
        }

        public Criteria andXqslIsNotNull() {
            addCriterion("XQSL is not null");
            return (Criteria) this;
        }

        public Criteria andXqslEqualTo(String value) {
            addCriterion("XQSL =", value, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslNotEqualTo(String value) {
            addCriterion("XQSL <>", value, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslGreaterThan(String value) {
            addCriterion("XQSL >", value, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslGreaterThanOrEqualTo(String value) {
            addCriterion("XQSL >=", value, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslLessThan(String value) {
            addCriterion("XQSL <", value, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslLessThanOrEqualTo(String value) {
            addCriterion("XQSL <=", value, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslLike(String value) {
            addCriterion("XQSL like", value, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslNotLike(String value) {
            addCriterion("XQSL not like", value, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslIn(List<String> values) {
            addCriterion("XQSL in", values, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslNotIn(List<String> values) {
            addCriterion("XQSL not in", values, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslBetween(String value1, String value2) {
            addCriterion("XQSL between", value1, value2, "xqsl");
            return (Criteria) this;
        }

        public Criteria andXqslNotBetween(String value1, String value2) {
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

        public Criteria andFdwIsNull() {
            addCriterion("FDW is null");
            return (Criteria) this;
        }

        public Criteria andFdwIsNotNull() {
            addCriterion("FDW is not null");
            return (Criteria) this;
        }

        public Criteria andFdwEqualTo(String value) {
            addCriterion("FDW =", value, "fdw");
            return (Criteria) this;
        }

        public Criteria andFdwNotEqualTo(String value) {
            addCriterion("FDW <>", value, "fdw");
            return (Criteria) this;
        }

        public Criteria andFdwGreaterThan(String value) {
            addCriterion("FDW >", value, "fdw");
            return (Criteria) this;
        }

        public Criteria andFdwGreaterThanOrEqualTo(String value) {
            addCriterion("FDW >=", value, "fdw");
            return (Criteria) this;
        }

        public Criteria andFdwLessThan(String value) {
            addCriterion("FDW <", value, "fdw");
            return (Criteria) this;
        }

        public Criteria andFdwLessThanOrEqualTo(String value) {
            addCriterion("FDW <=", value, "fdw");
            return (Criteria) this;
        }

        public Criteria andFdwLike(String value) {
            addCriterion("FDW like", value, "fdw");
            return (Criteria) this;
        }

        public Criteria andFdwNotLike(String value) {
            addCriterion("FDW not like", value, "fdw");
            return (Criteria) this;
        }

        public Criteria andFdwIn(List<String> values) {
            addCriterion("FDW in", values, "fdw");
            return (Criteria) this;
        }

        public Criteria andFdwNotIn(List<String> values) {
            addCriterion("FDW not in", values, "fdw");
            return (Criteria) this;
        }

        public Criteria andFdwBetween(String value1, String value2) {
            addCriterion("FDW between", value1, value2, "fdw");
            return (Criteria) this;
        }

        public Criteria andFdwNotBetween(String value1, String value2) {
            addCriterion("FDW not between", value1, value2, "fdw");
            return (Criteria) this;
        }

        public Criteria andCfdmIsNull() {
            addCriterion("CFDM is null");
            return (Criteria) this;
        }

        public Criteria andCfdmIsNotNull() {
            addCriterion("CFDM is not null");
            return (Criteria) this;
        }

        public Criteria andCfdmEqualTo(String value) {
            addCriterion("CFDM =", value, "cfdm");
            return (Criteria) this;
        }

        public Criteria andCfdmNotEqualTo(String value) {
            addCriterion("CFDM <>", value, "cfdm");
            return (Criteria) this;
        }

        public Criteria andCfdmGreaterThan(String value) {
            addCriterion("CFDM >", value, "cfdm");
            return (Criteria) this;
        }

        public Criteria andCfdmGreaterThanOrEqualTo(String value) {
            addCriterion("CFDM >=", value, "cfdm");
            return (Criteria) this;
        }

        public Criteria andCfdmLessThan(String value) {
            addCriterion("CFDM <", value, "cfdm");
            return (Criteria) this;
        }

        public Criteria andCfdmLessThanOrEqualTo(String value) {
            addCriterion("CFDM <=", value, "cfdm");
            return (Criteria) this;
        }

        public Criteria andCfdmLike(String value) {
            addCriterion("CFDM like", value, "cfdm");
            return (Criteria) this;
        }

        public Criteria andCfdmNotLike(String value) {
            addCriterion("CFDM not like", value, "cfdm");
            return (Criteria) this;
        }

        public Criteria andCfdmIn(List<String> values) {
            addCriterion("CFDM in", values, "cfdm");
            return (Criteria) this;
        }

        public Criteria andCfdmNotIn(List<String> values) {
            addCriterion("CFDM not in", values, "cfdm");
            return (Criteria) this;
        }

        public Criteria andCfdmBetween(String value1, String value2) {
            addCriterion("CFDM between", value1, value2, "cfdm");
            return (Criteria) this;
        }

        public Criteria andCfdmNotBetween(String value1, String value2) {
            addCriterion("CFDM not between", value1, value2, "cfdm");
            return (Criteria) this;
        }

        public Criteria andJzIsNull() {
            addCriterion("JZ is null");
            return (Criteria) this;
        }

        public Criteria andJzIsNotNull() {
            addCriterion("JZ is not null");
            return (Criteria) this;
        }

        public Criteria andJzEqualTo(String value) {
            addCriterion("JZ =", value, "jz");
            return (Criteria) this;
        }

        public Criteria andJzNotEqualTo(String value) {
            addCriterion("JZ <>", value, "jz");
            return (Criteria) this;
        }

        public Criteria andJzGreaterThan(String value) {
            addCriterion("JZ >", value, "jz");
            return (Criteria) this;
        }

        public Criteria andJzGreaterThanOrEqualTo(String value) {
            addCriterion("JZ >=", value, "jz");
            return (Criteria) this;
        }

        public Criteria andJzLessThan(String value) {
            addCriterion("JZ <", value, "jz");
            return (Criteria) this;
        }

        public Criteria andJzLessThanOrEqualTo(String value) {
            addCriterion("JZ <=", value, "jz");
            return (Criteria) this;
        }

        public Criteria andJzLike(String value) {
            addCriterion("JZ like", value, "jz");
            return (Criteria) this;
        }

        public Criteria andJzNotLike(String value) {
            addCriterion("JZ not like", value, "jz");
            return (Criteria) this;
        }

        public Criteria andJzIn(List<String> values) {
            addCriterion("JZ in", values, "jz");
            return (Criteria) this;
        }

        public Criteria andJzNotIn(List<String> values) {
            addCriterion("JZ not in", values, "jz");
            return (Criteria) this;
        }

        public Criteria andJzBetween(String value1, String value2) {
            addCriterion("JZ between", value1, value2, "jz");
            return (Criteria) this;
        }

        public Criteria andJzNotBetween(String value1, String value2) {
            addCriterion("JZ not between", value1, value2, "jz");
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

        public Criteria andSapwlmIsNull() {
            addCriterion("SAPWLM is null");
            return (Criteria) this;
        }

        public Criteria andSapwlmIsNotNull() {
            addCriterion("SAPWLM is not null");
            return (Criteria) this;
        }

        public Criteria andSapwlmEqualTo(String value) {
            addCriterion("SAPWLM =", value, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmNotEqualTo(String value) {
            addCriterion("SAPWLM <>", value, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmGreaterThan(String value) {
            addCriterion("SAPWLM >", value, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmGreaterThanOrEqualTo(String value) {
            addCriterion("SAPWLM >=", value, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmLessThan(String value) {
            addCriterion("SAPWLM <", value, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmLessThanOrEqualTo(String value) {
            addCriterion("SAPWLM <=", value, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmLike(String value) {
            addCriterion("SAPWLM like", value, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmNotLike(String value) {
            addCriterion("SAPWLM not like", value, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmIn(List<String> values) {
            addCriterion("SAPWLM in", values, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmNotIn(List<String> values) {
            addCriterion("SAPWLM not in", values, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmBetween(String value1, String value2) {
            addCriterion("SAPWLM between", value1, value2, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andSapwlmNotBetween(String value1, String value2) {
            addCriterion("SAPWLM not between", value1, value2, "sapwlm");
            return (Criteria) this;
        }

        public Criteria andZlmcIsNull() {
            addCriterion("ZLMC is null");
            return (Criteria) this;
        }

        public Criteria andZlmcIsNotNull() {
            addCriterion("ZLMC is not null");
            return (Criteria) this;
        }

        public Criteria andZlmcEqualTo(String value) {
            addCriterion("ZLMC =", value, "zlmc");
            return (Criteria) this;
        }

        public Criteria andZlmcNotEqualTo(String value) {
            addCriterion("ZLMC <>", value, "zlmc");
            return (Criteria) this;
        }

        public Criteria andZlmcGreaterThan(String value) {
            addCriterion("ZLMC >", value, "zlmc");
            return (Criteria) this;
        }

        public Criteria andZlmcGreaterThanOrEqualTo(String value) {
            addCriterion("ZLMC >=", value, "zlmc");
            return (Criteria) this;
        }

        public Criteria andZlmcLessThan(String value) {
            addCriterion("ZLMC <", value, "zlmc");
            return (Criteria) this;
        }

        public Criteria andZlmcLessThanOrEqualTo(String value) {
            addCriterion("ZLMC <=", value, "zlmc");
            return (Criteria) this;
        }

        public Criteria andZlmcLike(String value) {
            addCriterion("ZLMC like", value, "zlmc");
            return (Criteria) this;
        }

        public Criteria andZlmcNotLike(String value) {
            addCriterion("ZLMC not like", value, "zlmc");
            return (Criteria) this;
        }

        public Criteria andZlmcIn(List<String> values) {
            addCriterion("ZLMC in", values, "zlmc");
            return (Criteria) this;
        }

        public Criteria andZlmcNotIn(List<String> values) {
            addCriterion("ZLMC not in", values, "zlmc");
            return (Criteria) this;
        }

        public Criteria andZlmcBetween(String value1, String value2) {
            addCriterion("ZLMC between", value1, value2, "zlmc");
            return (Criteria) this;
        }

        public Criteria andZlmcNotBetween(String value1, String value2) {
            addCriterion("ZLMC not between", value1, value2, "zlmc");
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

        public Criteria andSddhIsNull() {
            addCriterion("SDDH is null");
            return (Criteria) this;
        }

        public Criteria andSddhIsNotNull() {
            addCriterion("SDDH is not null");
            return (Criteria) this;
        }

        public Criteria andSddhEqualTo(String value) {
            addCriterion("SDDH =", value, "sddh");
            return (Criteria) this;
        }

        public Criteria andSddhNotEqualTo(String value) {
            addCriterion("SDDH <>", value, "sddh");
            return (Criteria) this;
        }

        public Criteria andSddhGreaterThan(String value) {
            addCriterion("SDDH >", value, "sddh");
            return (Criteria) this;
        }

        public Criteria andSddhGreaterThanOrEqualTo(String value) {
            addCriterion("SDDH >=", value, "sddh");
            return (Criteria) this;
        }

        public Criteria andSddhLessThan(String value) {
            addCriterion("SDDH <", value, "sddh");
            return (Criteria) this;
        }

        public Criteria andSddhLessThanOrEqualTo(String value) {
            addCriterion("SDDH <=", value, "sddh");
            return (Criteria) this;
        }

        public Criteria andSddhLike(String value) {
            addCriterion("SDDH like", value, "sddh");
            return (Criteria) this;
        }

        public Criteria andSddhNotLike(String value) {
            addCriterion("SDDH not like", value, "sddh");
            return (Criteria) this;
        }

        public Criteria andSddhIn(List<String> values) {
            addCriterion("SDDH in", values, "sddh");
            return (Criteria) this;
        }

        public Criteria andSddhNotIn(List<String> values) {
            addCriterion("SDDH not in", values, "sddh");
            return (Criteria) this;
        }

        public Criteria andSddhBetween(String value1, String value2) {
            addCriterion("SDDH between", value1, value2, "sddh");
            return (Criteria) this;
        }

        public Criteria andSddhNotBetween(String value1, String value2) {
            addCriterion("SDDH not between", value1, value2, "sddh");
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