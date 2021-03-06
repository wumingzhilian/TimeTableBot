/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableStatistics implements Serializable {

    private static final long serialVersionUID = 760501321;

    private String tableSchema;
    private String tableName;
    private Long   rowsRead;
    private Long   rowsChanged;
    private Long   rowsChangedXIndexes;

    public TableStatistics() {}

    public TableStatistics(TableStatistics value) {
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.rowsRead = value.rowsRead;
        this.rowsChanged = value.rowsChanged;
        this.rowsChangedXIndexes = value.rowsChangedXIndexes;
    }

    public TableStatistics(
        String tableSchema,
        String tableName,
        Long   rowsRead,
        Long   rowsChanged,
        Long   rowsChangedXIndexes
    ) {
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.rowsRead = rowsRead;
        this.rowsChanged = rowsChanged;
        this.rowsChangedXIndexes = rowsChangedXIndexes;
    }

    public String getTableSchema() {
        return this.tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Long getRowsRead() {
        return this.rowsRead;
    }

    public void setRowsRead(Long rowsRead) {
        this.rowsRead = rowsRead;
    }

    public Long getRowsChanged() {
        return this.rowsChanged;
    }

    public void setRowsChanged(Long rowsChanged) {
        this.rowsChanged = rowsChanged;
    }

    public Long getRowsChangedXIndexes() {
        return this.rowsChangedXIndexes;
    }

    public void setRowsChangedXIndexes(Long rowsChangedXIndexes) {
        this.rowsChangedXIndexes = rowsChangedXIndexes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TableStatistics (");

        sb.append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(rowsRead);
        sb.append(", ").append(rowsChanged);
        sb.append(", ").append(rowsChangedXIndexes);

        sb.append(")");
        return sb.toString();
    }
}
