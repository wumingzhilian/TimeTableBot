/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables;


import io.github.mzdluo123.timetablebot.gen.information_schema.InformationSchema;
import io.github.mzdluo123.timetablebot.gen.information_schema.tables.records.CharacterSetsRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CharacterSets extends TableImpl<CharacterSetsRecord> {

    private static final long serialVersionUID = -712683159;

    /**
     * The reference instance of <code>information_schema.CHARACTER_SETS</code>
     */
    public static final CharacterSets CHARACTER_SETS = new CharacterSets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CharacterSetsRecord> getRecordType() {
        return CharacterSetsRecord.class;
    }

    /**
     * The column <code>information_schema.CHARACTER_SETS.CHARACTER_SET_NAME</code>.
     */
    public final TableField<CharacterSetsRecord, String> CHARACTER_SET_NAME = createField(DSL.name("CHARACTER_SET_NAME"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.CHARACTER_SETS.DEFAULT_COLLATE_NAME</code>.
     */
    public final TableField<CharacterSetsRecord, String> DEFAULT_COLLATE_NAME = createField(DSL.name("DEFAULT_COLLATE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.CHARACTER_SETS.DESCRIPTION</code>.
     */
    public final TableField<CharacterSetsRecord, String> DESCRIPTION = createField(DSL.name("DESCRIPTION"), org.jooq.impl.SQLDataType.VARCHAR(60).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.CHARACTER_SETS.MAXLEN</code>.
     */
    public final TableField<CharacterSetsRecord, Long> MAXLEN = createField(DSL.name("MAXLEN"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>information_schema.CHARACTER_SETS</code> table reference
     */
    public CharacterSets() {
        this(DSL.name("CHARACTER_SETS"), null);
    }

    /**
     * Create an aliased <code>information_schema.CHARACTER_SETS</code> table reference
     */
    public CharacterSets(String alias) {
        this(DSL.name(alias), CHARACTER_SETS);
    }

    /**
     * Create an aliased <code>information_schema.CHARACTER_SETS</code> table reference
     */
    public CharacterSets(Name alias) {
        this(alias, CHARACTER_SETS);
    }

    private CharacterSets(Name alias, Table<CharacterSetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CharacterSets(Name alias, Table<CharacterSetsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> CharacterSets(Table<O> child, ForeignKey<O, CharacterSetsRecord> key) {
        super(child, key, CHARACTER_SETS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public CharacterSets as(String alias) {
        return new CharacterSets(DSL.name(alias), this);
    }

    @Override
    public CharacterSets as(Name alias) {
        return new CharacterSets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CharacterSets rename(String name) {
        return new CharacterSets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CharacterSets rename(Name name) {
        return new CharacterSets(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}