package com.flagwind.persistent;

public class AggregateField {
    private String column;
    private String alias;
    private AggregateType type;
    private Class<?> javaType;

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public AggregateType getType() {
        return type;
    }

    public void setType(AggregateType type) {
        this.type = type;
    }

    public Class<?> getJavaType() {
        return javaType;
    }

    public void setJavaType(Class<?> javaType) {
        this.javaType = javaType;
    }
}
