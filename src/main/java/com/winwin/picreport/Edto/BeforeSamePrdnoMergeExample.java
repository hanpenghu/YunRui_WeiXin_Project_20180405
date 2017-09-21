package com.winwin.picreport.Edto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BeforeSamePrdnoMergeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BeforeSamePrdnoMergeExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchIsNull() {
            addCriterion("timeSameBatch is null");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchIsNotNull() {
            addCriterion("timeSameBatch is not null");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchEqualTo(String value) {
            addCriterion("timeSameBatch =", value, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchNotEqualTo(String value) {
            addCriterion("timeSameBatch <>", value, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchGreaterThan(String value) {
            addCriterion("timeSameBatch >", value, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchGreaterThanOrEqualTo(String value) {
            addCriterion("timeSameBatch >=", value, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchLessThan(String value) {
            addCriterion("timeSameBatch <", value, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchLessThanOrEqualTo(String value) {
            addCriterion("timeSameBatch <=", value, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchLike(String value) {
            addCriterion("timeSameBatch like", value, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchNotLike(String value) {
            addCriterion("timeSameBatch not like", value, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchIn(List<String> values) {
            addCriterion("timeSameBatch in", values, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchNotIn(List<String> values) {
            addCriterion("timeSameBatch not in", values, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchBetween(String value1, String value2) {
            addCriterion("timeSameBatch between", value1, value2, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andTimesamebatchNotBetween(String value1, String value2) {
            addCriterion("timeSameBatch not between", value1, value2, "timesamebatch");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andOsnoIsNull() {
            addCriterion("osNo is null");
            return (Criteria) this;
        }

        public Criteria andOsnoIsNotNull() {
            addCriterion("osNo is not null");
            return (Criteria) this;
        }

        public Criteria andOsnoEqualTo(String value) {
            addCriterion("osNo =", value, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoNotEqualTo(String value) {
            addCriterion("osNo <>", value, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoGreaterThan(String value) {
            addCriterion("osNo >", value, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoGreaterThanOrEqualTo(String value) {
            addCriterion("osNo >=", value, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoLessThan(String value) {
            addCriterion("osNo <", value, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoLessThanOrEqualTo(String value) {
            addCriterion("osNo <=", value, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoLike(String value) {
            addCriterion("osNo like", value, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoNotLike(String value) {
            addCriterion("osNo not like", value, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoIn(List<String> values) {
            addCriterion("osNo in", values, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoNotIn(List<String> values) {
            addCriterion("osNo not in", values, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoBetween(String value1, String value2) {
            addCriterion("osNo between", value1, value2, "osno");
            return (Criteria) this;
        }

        public Criteria andOsnoNotBetween(String value1, String value2) {
            addCriterion("osNo not between", value1, value2, "osno");
            return (Criteria) this;
        }

        public Criteria andPrdnoIsNull() {
            addCriterion("prdNo is null");
            return (Criteria) this;
        }

        public Criteria andPrdnoIsNotNull() {
            addCriterion("prdNo is not null");
            return (Criteria) this;
        }

        public Criteria andPrdnoEqualTo(String value) {
            addCriterion("prdNo =", value, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoNotEqualTo(String value) {
            addCriterion("prdNo <>", value, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoGreaterThan(String value) {
            addCriterion("prdNo >", value, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoGreaterThanOrEqualTo(String value) {
            addCriterion("prdNo >=", value, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoLessThan(String value) {
            addCriterion("prdNo <", value, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoLessThanOrEqualTo(String value) {
            addCriterion("prdNo <=", value, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoLike(String value) {
            addCriterion("prdNo like", value, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoNotLike(String value) {
            addCriterion("prdNo not like", value, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoIn(List<String> values) {
            addCriterion("prdNo in", values, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoNotIn(List<String> values) {
            addCriterion("prdNo not in", values, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoBetween(String value1, String value2) {
            addCriterion("prdNo between", value1, value2, "prdno");
            return (Criteria) this;
        }

        public Criteria andPrdnoNotBetween(String value1, String value2) {
            addCriterion("prdNo not between", value1, value2, "prdno");
            return (Criteria) this;
        }

        public Criteria andSaphhIsNull() {
            addCriterion("saphh is null");
            return (Criteria) this;
        }

        public Criteria andSaphhIsNotNull() {
            addCriterion("saphh is not null");
            return (Criteria) this;
        }

        public Criteria andSaphhEqualTo(String value) {
            addCriterion("saphh =", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhNotEqualTo(String value) {
            addCriterion("saphh <>", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhGreaterThan(String value) {
            addCriterion("saphh >", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhGreaterThanOrEqualTo(String value) {
            addCriterion("saphh >=", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhLessThan(String value) {
            addCriterion("saphh <", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhLessThanOrEqualTo(String value) {
            addCriterion("saphh <=", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhLike(String value) {
            addCriterion("saphh like", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhNotLike(String value) {
            addCriterion("saphh not like", value, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhIn(List<String> values) {
            addCriterion("saphh in", values, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhNotIn(List<String> values) {
            addCriterion("saphh not in", values, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhBetween(String value1, String value2) {
            addCriterion("saphh between", value1, value2, "saphh");
            return (Criteria) this;
        }

        public Criteria andSaphhNotBetween(String value1, String value2) {
            addCriterion("saphh not between", value1, value2, "saphh");
            return (Criteria) this;
        }

        public Criteria andQtyIsNull() {
            addCriterion("qty is null");
            return (Criteria) this;
        }

        public Criteria andQtyIsNotNull() {
            addCriterion("qty is not null");
            return (Criteria) this;
        }

        public Criteria andQtyEqualTo(BigDecimal value) {
            addCriterion("qty =", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualTo(BigDecimal value) {
            addCriterion("qty <>", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThan(BigDecimal value) {
            addCriterion("qty >", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("qty >=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThan(BigDecimal value) {
            addCriterion("qty <", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("qty <=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyIn(List<BigDecimal> values) {
            addCriterion("qty in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotIn(List<BigDecimal> values) {
            addCriterion("qty not in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qty between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qty not between", value1, value2, "qty");
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