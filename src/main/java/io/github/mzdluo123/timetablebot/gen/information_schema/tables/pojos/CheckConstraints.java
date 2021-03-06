/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CheckConstraints implements Serializable {

    private static final long serialVersionUID = -1990239648;

    private String constraintCatalog;
    private String constraintSchema;
    private String constraintName;
    private String tableName;
    private String checkClause;

    public CheckConstraints() {}

    public CheckConstraints(CheckConstraints value) {
        this.constraintCatalog = value.constraintCatalog;
        this.constraintSchema = value.constraintSchema;
        this.constraintName = value.constraintName;
        this.tableName = value.tableName;
        this.checkClause = value.checkClause;
    }

    public CheckConstraints(
        String constraintCatalog,
        String constraintSchema,
        String constraintName,
        String tableName,
        String checkClause
    ) {
        this.constraintCatalog = constraintCatalog;
        this.constraintSchema = constraintSchema;
        this.constraintName = constraintName;
        this.tableName = tableName;
        this.checkClause = checkClause;
    }

    public String getConstraintCatalog() {
        return this.constraintCatalog;
    }

    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    public String getConstraintSchema() {
        return this.constraintSchema;
    }

    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    public String getConstraintName() {
        return this.constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getCheckClause() {
        return this.checkClause;
    }

    public void setCheckClause(String checkClause) {
        this.checkClause = checkClause;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CheckConstraints (");

        sb.append(constraintCatalog);
        sb.append(", ").append(constraintSchema);
        sb.append(", ").append(constraintName);
        sb.append(", ").append(tableName);
        sb.append(", ").append(checkClause);

        sb.append(")");
        return sb.toString();
    }
}
