/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables;


import io.github.mzdluo123.timetablebot.gen.information_schema.InformationSchema;
import io.github.mzdluo123.timetablebot.gen.information_schema.tables.records.TableStatisticsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableStatistics extends TableImpl<TableStatisticsRecord> {

    private static final long serialVersionUID = 1595937169;

    /**
     * The reference instance of <code>information_schema.TABLE_STATISTICS</code>
     */
    public static final TableStatistics TABLE_STATISTICS = new TableStatistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TableStatisticsRecord> getRecordType() {
        return TableStatisticsRecord.class;
    }

    /**
     * The column <code>information_schema.TABLE_STATISTICS.TABLE_SCHEMA</code>.
     */
    public final TableField<TableStatisticsRecord, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(192).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.TABLE_STATISTICS.TABLE_NAME</code>.
     */
    public final TableField<TableStatisticsRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(192).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.TABLE_STATISTICS.ROWS_READ</code>.
     */
    public final TableField<TableStatisticsRecord, Long> ROWS_READ = createField(DSL.name("ROWS_READ"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.TABLE_STATISTICS.ROWS_CHANGED</code>.
     */
    public final TableField<TableStatisticsRecord, Long> ROWS_CHANGED = createField(DSL.name("ROWS_CHANGED"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.TABLE_STATISTICS.ROWS_CHANGED_X_INDEXES</code>.
     */
    public final TableField<TableStatisticsRecord, Long> ROWS_CHANGED_X_INDEXES = createField(DSL.name("ROWS_CHANGED_X_INDEXES"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>information_schema.TABLE_STATISTICS</code> table reference
     */
    public TableStatistics() {
        this(DSL.name("TABLE_STATISTICS"), null);
    }

    /**
     * Create an aliased <code>information_schema.TABLE_STATISTICS</code> table reference
     */
    public TableStatistics(String alias) {
        this(DSL.name(alias), TABLE_STATISTICS);
    }

    /**
     * Create an aliased <code>information_schema.TABLE_STATISTICS</code> table reference
     */
    public TableStatistics(Name alias) {
        this(alias, TABLE_STATISTICS);
    }

    private TableStatistics(Name alias, Table<TableStatisticsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TableStatistics(Name alias, Table<TableStatisticsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> TableStatistics(Table<O> child, ForeignKey<O, TableStatisticsRecord> key) {
        super(child, key, TABLE_STATISTICS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public TableStatistics as(String alias) {
        return new TableStatistics(DSL.name(alias), this);
    }

    @Override
    public TableStatistics as(Name alias) {
        return new TableStatistics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TableStatistics rename(String name) {
        return new TableStatistics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TableStatistics rename(Name name) {
        return new TableStatistics(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, Long, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
