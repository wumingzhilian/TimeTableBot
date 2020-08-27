/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables;


import io.github.mzdluo123.timetablebot.gen.information_schema.InformationSchema;
import io.github.mzdluo123.timetablebot.gen.information_schema.tables.records.SessionVariablesRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SessionVariables extends TableImpl<SessionVariablesRecord> {

    private static final long serialVersionUID = 293777976;

    /**
     * The reference instance of <code>information_schema.SESSION_VARIABLES</code>
     */
    public static final SessionVariables SESSION_VARIABLES = new SessionVariables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionVariablesRecord> getRecordType() {
        return SessionVariablesRecord.class;
    }

    /**
     * The column <code>information_schema.SESSION_VARIABLES.VARIABLE_NAME</code>.
     */
    public final TableField<SessionVariablesRecord, String> VARIABLE_NAME = createField(DSL.name("VARIABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.SESSION_VARIABLES.VARIABLE_VALUE</code>.
     */
    public final TableField<SessionVariablesRecord, String> VARIABLE_VALUE = createField(DSL.name("VARIABLE_VALUE"), org.jooq.impl.SQLDataType.VARCHAR(2048).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.SESSION_VARIABLES</code> table reference
     */
    public SessionVariables() {
        this(DSL.name("SESSION_VARIABLES"), null);
    }

    /**
     * Create an aliased <code>information_schema.SESSION_VARIABLES</code> table reference
     */
    public SessionVariables(String alias) {
        this(DSL.name(alias), SESSION_VARIABLES);
    }

    /**
     * Create an aliased <code>information_schema.SESSION_VARIABLES</code> table reference
     */
    public SessionVariables(Name alias) {
        this(alias, SESSION_VARIABLES);
    }

    private SessionVariables(Name alias, Table<SessionVariablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SessionVariables(Name alias, Table<SessionVariablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> SessionVariables(Table<O> child, ForeignKey<O, SessionVariablesRecord> key) {
        super(child, key, SESSION_VARIABLES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public SessionVariables as(String alias) {
        return new SessionVariables(DSL.name(alias), this);
    }

    @Override
    public SessionVariables as(Name alias) {
        return new SessionVariables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionVariables rename(String name) {
        return new SessionVariables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionVariables rename(Name name) {
        return new SessionVariables(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}