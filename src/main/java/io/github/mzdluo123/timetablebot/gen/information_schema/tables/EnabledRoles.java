/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables;


import io.github.mzdluo123.timetablebot.gen.information_schema.InformationSchema;
import io.github.mzdluo123.timetablebot.gen.information_schema.tables.records.EnabledRolesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row1;
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
public class EnabledRoles extends TableImpl<EnabledRolesRecord> {

    private static final long serialVersionUID = -848134634;

    /**
     * The reference instance of <code>information_schema.ENABLED_ROLES</code>
     */
    public static final EnabledRoles ENABLED_ROLES = new EnabledRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EnabledRolesRecord> getRecordType() {
        return EnabledRolesRecord.class;
    }

    /**
     * The column <code>information_schema.ENABLED_ROLES.ROLE_NAME</code>.
     */
    public final TableField<EnabledRolesRecord, String> ROLE_NAME = createField(DSL.name("ROLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(128).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.ENABLED_ROLES</code> table reference
     */
    public EnabledRoles() {
        this(DSL.name("ENABLED_ROLES"), null);
    }

    /**
     * Create an aliased <code>information_schema.ENABLED_ROLES</code> table reference
     */
    public EnabledRoles(String alias) {
        this(DSL.name(alias), ENABLED_ROLES);
    }

    /**
     * Create an aliased <code>information_schema.ENABLED_ROLES</code> table reference
     */
    public EnabledRoles(Name alias) {
        this(alias, ENABLED_ROLES);
    }

    private EnabledRoles(Name alias, Table<EnabledRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private EnabledRoles(Name alias, Table<EnabledRolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> EnabledRoles(Table<O> child, ForeignKey<O, EnabledRolesRecord> key) {
        super(child, key, ENABLED_ROLES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public EnabledRoles as(String alias) {
        return new EnabledRoles(DSL.name(alias), this);
    }

    @Override
    public EnabledRoles as(Name alias) {
        return new EnabledRoles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EnabledRoles rename(String name) {
        return new EnabledRoles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EnabledRoles rename(Name name) {
        return new EnabledRoles(name, null);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }
}
