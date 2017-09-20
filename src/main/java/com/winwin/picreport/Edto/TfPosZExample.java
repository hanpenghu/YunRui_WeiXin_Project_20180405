package com.winwin.picreport.Edto;

import java.util.ArrayList;
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