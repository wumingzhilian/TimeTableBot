/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables;


import io.github.mzdluo123.timetablebot.gen.information_schema.InformationSchema;
import io.github.mzdluo123.timetablebot.gen.information_schema.tables.records.InnodbSysTablestatsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbSysTablestats extends TableImpl<InnodbSysTablestatsRecord> {

    private static final long serialVersionUID = -1808287651;

    /**
     * The reference instance of <code>information_schema.INNODB_SYS_TABLESTATS</code>
     */
    public static final InnodbSysTablestats INNODB_SYS_TABLESTATS = new InnodbSysTablestats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbSysTablestatsRecord> getRecordType() {
        return InnodbSysTablestatsRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.TABLE_ID</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> TABLE_ID = createField(DSL.name("TABLE_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.NAME</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, String> NAME = createField(DSL.name("NAME"), org.jooq.impl.SQLDataType.VARCHAR(193).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.STATS_INITIALIZED</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, String> STATS_INITIALIZED = createField(DSL.name("STATS_INITIALIZED"), org.jooq.impl.SQLDataType.VARCHAR(193).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.NUM_ROWS</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> NUM_ROWS = createField(DSL.name("NUM_ROWS"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.CLUST_INDEX_SIZE</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> CLUST_INDEX_SIZE = createField(DSL.name("CLUST_INDEX_SIZE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.OTHER_INDEX_SIZE</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> OTHER_INDEX_SIZE = createField(DSL.name("OTHER_INDEX_SIZE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.MODIFIED_COUNTER</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> MODIFIED_COUNTER = createField(DSL.name("MODIFIED_COUNTER"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.AUTOINC</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> AUTOINC = createField(DSL.name("AUTOINC"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.REF_COUNT</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, Integer> REF_COUNT = createField(DSL.name("REF_COUNT"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>information_schema.INNODB_SYS_TABLESTATS</code> table reference
     */
    public InnodbSysTablestats() {
        this(DSL.name("INNODB_SYS_TABLESTATS"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_TABLESTATS</code> table reference
     */
    public InnodbSysTablestats(String alias) {
        this(DSL.name(alias), INNODB_SYS_TABLESTATS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_TABLESTATS</code> table reference
     */
    public InnodbSysTablestats(Name alias) {
        this(alias, INNODB_SYS_TABLESTATS);
    }

    private InnodbSysTablestats(Name alias, Table<InnodbSysTablestatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbSysTablestats(Name alias, Table<InnodbSysTablestatsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> InnodbSysTablestats(Table<O> child, ForeignKey<O, InnodbSysTablestatsRecord> key) {
        super(child, key, INNODB_SYS_TABLESTATS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbSysTablestats as(String alias) {
        return new InnodbSysTablestats(DSL.name(alias), this);
    }

    @Override
    public InnodbSysTablestats as(Name alias) {
        return new InnodbSysTablestats(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysTablestats rename(String name) {
        return new InnodbSysTablestats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysTablestats rename(Name name) {
        return new InnodbSysTablestats(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, String, String, ULong, ULong, ULong, ULong, ULong, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
