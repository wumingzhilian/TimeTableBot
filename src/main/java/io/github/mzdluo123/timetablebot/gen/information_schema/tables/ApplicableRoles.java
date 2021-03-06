/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables;


import io.github.mzdluo123.timetablebot.gen.information_schema.InformationSchema;
import io.github.mzdluo123.timetablebot.gen.information_schema.tables.records.ApplicableRolesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class ApplicableRoles extends TableImpl<ApplicableRolesRecord> {

    private static final long serialVersionUID = -132612419;

    /**
     * The reference instance of <code>information_schema.APPLICABLE_ROLES</code>
     */
    public static final ApplicableRoles APPLICABLE_ROLES = new ApplicableRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ApplicableRolesRecord> getRecordType() {
        return ApplicableRolesRecord.class;
    }

    /**
     * The column <code>information_schema.APPLICABLE_ROLES.GRANTEE</code>.
     */
    public final TableField<ApplicableRolesRecord, String> GRANTEE = createField(DSL.name("GRANTEE"), org.jooq.impl.SQLDataType.VARCHAR(190).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.APPLICABLE_ROLES.ROLE_NAME</code>.
     */
    public final TableField<ApplicableRolesRecord, String> ROLE_NAME = createField(DSL.name("ROLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.APPLICABLE_ROLES.IS_GRANTABLE</code>.
     */
    public final TableField<ApplicableRolesRecord, String> IS_GRANTABLE = createField(DSL.name("IS_GRANTABLE"), org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.APPLICABLE_ROLES.IS_DEFAULT</code>.
     */
    public final TableField<ApplicableRolesRecord, String> IS_DEFAULT = createField(DSL.name("IS_DEFAULT"), org.jooq.impl.SQLDataType.VARCHAR(3).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.APPLICABLE_ROLES</code> table reference
     */
    public ApplicableRoles() {
        this(DSL.name("APPLICABLE_ROLES"), null);
    }

    /**
     * Create an aliased <code>information_schema.APPLICABLE_ROLES</code> table reference
     */
    public ApplicableRoles(String alias) {
        this(DSL.name(alias), APPLICABLE_ROLES);
    }

    /**
     * Create an aliased <code>information_schema.APPLICABLE_ROLES</code> table reference
     */
    public ApplicableRoles(Name alias) {
        this(alias, APPLICABLE_ROLES);
    }

    private ApplicableRoles(Name alias, Table<ApplicableRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ApplicableRoles(Name alias, Table<ApplicableRolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> ApplicableRoles(Table<O> child, ForeignKey<O, ApplicableRolesRecord> key) {
        super(child, key, APPLICABLE_ROLES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ApplicableRoles as(String alias) {
        return new ApplicableRoles(DSL.name(alias), this);
    }

    @Override
    public ApplicableRoles as(Name alias) {
        return new ApplicableRoles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ApplicableRoles rename(String name) {
        return new ApplicableRoles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ApplicableRoles rename(Name name) {
        return new ApplicableRoles(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
