/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.pojos;


import java.io.Serializable;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbSysForeignCols implements Serializable {

    private static final long serialVersionUID = -51800464;

    private String   id;
    private String   forColName;
    private String   refColName;
    private UInteger pos;

    public InnodbSysForeignCols() {}

    public InnodbSysForeignCols(InnodbSysForeignCols value) {
        this.id = value.id;
        this.forColName = value.forColName;
        this.refColName = value.refColName;
        this.pos = value.pos;
    }

    public InnodbSysForeignCols(
        String   id,
        String   forColName,
        String   refColName,
        UInteger pos
    ) {
        this.id = id;
        this.forColName = forColName;
        this.refColName = refColName;
        this.pos = pos;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getForColName() {
        return this.forColName;
    }

    public void setForColName(String forColName) {
        this.forColName = forColName;
    }

    public String getRefColName() {
        return this.refColName;
    }

    public void setRefColName(String refColName) {
        this.refColName = refColName;
    }

    public UInteger getPos() {
        return this.pos;
    }

    public void setPos(UInteger pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbSysForeignCols (");

        sb.append(id);
        sb.append(", ").append(forColName);
        sb.append(", ").append(refColName);
        sb.append(", ").append(pos);

        sb.append(")");
        return sb.toString();
    }
}
