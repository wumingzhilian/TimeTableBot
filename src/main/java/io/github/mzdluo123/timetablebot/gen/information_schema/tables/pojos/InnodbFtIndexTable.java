/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.pojos;


import java.io.Serializable;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbFtIndexTable implements Serializable {

    private static final long serialVersionUID = 1192640008;

    private String word;
    private ULong  firstDocId;
    private ULong  lastDocId;
    private ULong  docCount;
    private ULong  docId;
    private ULong  position;

    public InnodbFtIndexTable() {}

    public InnodbFtIndexTable(InnodbFtIndexTable value) {
        this.word = value.word;
        this.firstDocId = value.firstDocId;
        this.lastDocId = value.lastDocId;
        this.docCount = value.docCount;
        this.docId = value.docId;
        this.position = value.position;
    }

    public InnodbFtIndexTable(
        String word,
        ULong  firstDocId,
        ULong  lastDocId,
        ULong  docCount,
        ULong  docId,
        ULong  position
    ) {
        this.word = word;
        this.firstDocId = firstDocId;
        this.lastDocId = lastDocId;
        this.docCount = docCount;
        this.docId = docId;
        this.position = position;
    }

    public String getWord() {
        return this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public ULong getFirstDocId() {
        return this.firstDocId;
    }

    public void setFirstDocId(ULong firstDocId) {
        this.firstDocId = firstDocId;
    }

    public ULong getLastDocId() {
        return this.lastDocId;
    }

    public void setLastDocId(ULong lastDocId) {
        this.lastDocId = lastDocId;
    }

    public ULong getDocCount() {
        return this.docCount;
    }

    public void setDocCount(ULong docCount) {
        this.docCount = docCount;
    }

    public ULong getDocId() {
        return this.docId;
    }

    public void setDocId(ULong docId) {
        this.docId = docId;
    }

    public ULong getPosition() {
        return this.position;
    }

    public void setPosition(ULong position) {
        this.position = position;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbFtIndexTable (");

        sb.append(word);
        sb.append(", ").append(firstDocId);
        sb.append(", ").append(lastDocId);
        sb.append(", ").append(docCount);
        sb.append(", ").append(docId);
        sb.append(", ").append(position);

        sb.append(")");
        return sb.toString();
    }
}
