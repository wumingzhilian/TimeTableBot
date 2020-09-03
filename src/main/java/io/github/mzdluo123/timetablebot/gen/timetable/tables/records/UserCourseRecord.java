/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.timetable.tables.records;


import io.github.mzdluo123.timetablebot.gen.timetable.tables.UserCourse;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserCourseRecord extends UpdatableRecordImpl<UserCourseRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 473939484;

    /**
     * Setter for <code>timetable.user_course.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>timetable.user_course.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>timetable.user_course.user</code>.
     */
    public void setUser(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>timetable.user_course.user</code>.
     */
    public Integer getUser() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>timetable.user_course.course</code>.
     */
    public void setCourse(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>timetable.user_course.course</code>.
     */
    public Integer getCourse() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return UserCourse.USER_COURSE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return UserCourse.USER_COURSE.USER;
    }

    @Override
    public Field<Integer> field3() {
        return UserCourse.USER_COURSE.COURSE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getUser();
    }

    @Override
    public Integer component3() {
        return getCourse();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getUser();
    }

    @Override
    public Integer value3() {
        return getCourse();
    }

    @Override
    public UserCourseRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public UserCourseRecord value2(Integer value) {
        setUser(value);
        return this;
    }

    @Override
    public UserCourseRecord value3(Integer value) {
        setCourse(value);
        return this;
    }

    @Override
    public UserCourseRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserCourseRecord
     */
    public UserCourseRecord() {
        super(UserCourse.USER_COURSE);
    }

    /**
     * Create a detached, initialised UserCourseRecord
     */
    public UserCourseRecord(Integer id, Integer user, Integer course) {
        super(UserCourse.USER_COURSE);

        set(0, id);
        set(1, user);
        set(2, course);
    }
}
