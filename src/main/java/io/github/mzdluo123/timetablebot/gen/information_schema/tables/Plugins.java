/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables;


import io.github.mzdluo123.timetablebot.gen.information_schema.InformationSchema;
import io.github.mzdluo123.timetablebot.gen.information_schema.tables.records.PluginsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class Plugins extends TableImpl<PluginsRecord> {

    private static final long serialVersionUID = 1971416381;

    /**
     * The reference instance of <code>information_schema.PLUGINS</code>
     */
    public static final Plugins PLUGINS = new Plugins();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PluginsRecord> getRecordType() {
        return PluginsRecord.class;
    }

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_NAME</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_NAME = createField(DSL.name("PLUGIN_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_VERSION</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_VERSION = createField(DSL.name("PLUGIN_VERSION"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_STATUS</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_STATUS = createField(DSL.name("PLUGIN_STATUS"), org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_TYPE</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_TYPE = createField(DSL.name("PLUGIN_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(80).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_TYPE_VERSION</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_TYPE_VERSION = createField(DSL.name("PLUGIN_TYPE_VERSION"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_LIBRARY</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_LIBRARY = createField(DSL.name("PLUGIN_LIBRARY"), org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_LIBRARY_VERSION</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_LIBRARY_VERSION = createField(DSL.name("PLUGIN_LIBRARY_VERSION"), org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_AUTHOR</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_AUTHOR = createField(DSL.name("PLUGIN_AUTHOR"), org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_DESCRIPTION</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_DESCRIPTION = createField(DSL.name("PLUGIN_DESCRIPTION"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_LICENSE</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_LICENSE = createField(DSL.name("PLUGIN_LICENSE"), org.jooq.impl.SQLDataType.VARCHAR(80).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.LOAD_OPTION</code>.
     */
    public final TableField<PluginsRecord, String> LOAD_OPTION = createField(DSL.name("LOAD_OPTION"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_MATURITY</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_MATURITY = createField(DSL.name("PLUGIN_MATURITY"), org.jooq.impl.SQLDataType.VARCHAR(12).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PLUGINS.PLUGIN_AUTH_VERSION</code>.
     */
    public final TableField<PluginsRecord, String> PLUGIN_AUTH_VERSION = createField(DSL.name("PLUGIN_AUTH_VERSION"), org.jooq.impl.SQLDataType.VARCHAR(80).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.PLUGINS</code> table reference
     */
    public Plugins() {
        this(DSL.name("PLUGINS"), null);
    }

    /**
     * Create an aliased <code>information_schema.PLUGINS</code> table reference
     */
    public Plugins(String alias) {
        this(DSL.name(alias), PLUGINS);
    }

    /**
     * Create an aliased <code>information_schema.PLUGINS</code> table reference
     */
    public Plugins(Name alias) {
        this(alias, PLUGINS);
    }

    private Plugins(Name alias, Table<PluginsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Plugins(Name alias, Table<PluginsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Plugins(Table<O> child, ForeignKey<O, PluginsRecord> key) {
        super(child, key, PLUGINS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Plugins as(String alias) {
        return new Plugins(DSL.name(alias), this);
    }

    @Override
    public Plugins as(Name alias) {
        return new Plugins(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Plugins rename(String name) {
        return new Plugins(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Plugins rename(Name name) {
        return new Plugins(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
