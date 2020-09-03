/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables;


import io.github.mzdluo123.timetablebot.gen.information_schema.InformationSchema;
import io.github.mzdluo123.timetablebot.gen.information_schema.tables.records.ViewsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class Views extends TableImpl<ViewsRecord> {

    private static final long serialVersionUID = -116564428;

    /**
     * The reference instance of <code>information_schema.VIEWS</code>
     */
    public static final Views VIEWS = new Views();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewsRecord> getRecordType() {
        return ViewsRecord.class;
    }

    /**
     * The column <code>information_schema.VIEWS.TABLE_CATALOG</code>.
     */
    public final TableField<ViewsRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.VIEWS.TABLE_SCHEMA</code>.
     */
    public final TableField<ViewsRecord, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.VIEWS.TABLE_NAME</code>.
     */
    public final TableField<ViewsRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.VIEWS.VIEW_DEFINITION</code>.
     */
    public final TableField<ViewsRecord, String> VIEW_DEFINITION = createField(DSL.name("VIEW_DEFINITION"), org.jooq.impl.SQLDataType.CLOB.nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>information_schema.VIEWS.CHECK_OPTION</code>.
     */
    public final TableField<ViewsRecord, String> CHECK_OPTION = createField(DSL.name("CHECK_OPTION"), org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.VIEWS.IS_UPDATABLE</code>.
     */
    public final TableField<ViewsRecord, String> IS_UPDATABLE = createField(DSL.name("IS_UPDATABLE"), org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.VIEWS.DEFINER</code>.
     */
    public final TableField<ViewsRecord, String> DEFINER = createField(DSL.name("DEFINER"), org.jooq.impl.SQLDataType.VARCHAR(189).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.VIEWS.SECURITY_TYPE</code>.
     */
    public final TableField<ViewsRecord, String> SECURITY_TYPE = createField(DSL.name("SECURITY_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(7).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.VIEWS.CHARACTER_SET_CLIENT</code>.
     */
    public final TableField<ViewsRecord, String> CHARACTER_SET_CLIENT = createField(DSL.name("CHARACTER_SET_CLIENT"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.VIEWS.COLLATION_CONNECTION</code>.
     */
    public final TableField<ViewsRecord, String> COLLATION_CONNECTION = createField(DSL.name("COLLATION_CONNECTION"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.VIEWS.ALGORITHM</code>.
     */
    public final TableField<ViewsRecord, String> ALGORITHM = createField(DSL.name("ALGORITHM"), org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.VIEWS</code> table reference
     */
    public Views() {
        this(DSL.name("VIEWS"), null);
    }

    /**
     * Create an aliased <code>information_schema.VIEWS</code> table reference
     */
    public Views(String alias) {
        this(DSL.name(alias), VIEWS);
    }

    /**
     * Create an aliased <code>information_schema.VIEWS</code> table reference
     */
    public Views(Name alias) {
        this(alias, VIEWS);
    }

    private Views(Name alias, Table<ViewsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Views(Name alias, Table<ViewsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Views(Table<O> child, ForeignKey<O, ViewsRecord> key) {
        super(child, key, VIEWS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Views as(String alias) {
        return new Views(DSL.name(alias), this);
    }

    @Override
    public Views as(Name alias) {
        return new Views(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Views rename(String name) {
        return new Views(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Views rename(Name name) {
        return new Views(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
