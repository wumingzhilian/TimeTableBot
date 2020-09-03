/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.timetable.tables.records;


import io.github.mzdluo123.timetablebot.gen.timetable.tables.Course;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CourseRecord extends UpdatableRecordImpl<CourseRecord> implements Record7<Integer, String, String, String, Byte, Byte, Double> {

    private static final long serialVersionUID = -1258968740;

    /**
     * Setter for <code>timetable.course.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>timetable.course.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>timetable.course.name</code>. 课程名字
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>timetable.course.name</code>. 课程名字
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>timetable.course.teacher</code>. 老师名字
     */
    public void setTeacher(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>timetable.course.teacher</code>. 老师名字
     */
    public String getTeacher() {
        return (String) get(2);
    }

    /**
     * Setter for <code>timetable.course.course_id</code>. 课程id
     */
    public void setCourseId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>timetable.course.course_id</code>. 课程id
     */
    public String getCourseId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>timetable.course.week_period</code>. 周学时
     */
    public void setWeekPeriod(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>timetable.course.week_period</code>. 周学时
     */
    public Byte getWeekPeriod() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>timetable.course.period</code>. 学时
     */
    public void setPeriod(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>timetable.course.period</code>. 学时
     */
    public Byte getPeriod() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>timetable.course.score</code>. 学分
     */
    public void setScore(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>timetable.course.score</code>. 学分
     */
    public Double getScore() {
        return (Double) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, String, String, Byte, Byte, Double> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, String, String, String, Byte, Byte, Double> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Course.COURSE.ID;
    }

    @Override
    public Field<String> field2() {
        return Course.COURSE.NAME;
    }

    @Override
    public Field<String> field3() {
        return Course.COURSE.TEACHER;
    }

    @Override
    public Field<String> field4() {
        return Course.COURSE.COURSE_ID;
    }

    @Override
    public Field<Byte> field5() {
        return Course.COURSE.WEEK_PERIOD;
    }

    @Override
    public Field<Byte> field6() {
        return Course.COURSE.PERIOD;
    }

    @Override
    public Field<Double> field7() {
        return Course.COURSE.SCORE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getTeacher();
    }

    @Override
    public String component4() {
        return getCourseId();
    }

    @Override
    public Byte component5() {
        return getWeekPeriod();
    }

    @Override
    public Byte component6() {
        return getPeriod();
    }

    @Override
    public Double component7() {
        return getScore();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getTeacher();
    }

    @Override
    public String value4() {
        return getCourseId();
    }

    @Override
    public Byte value5() {
        return getWeekPeriod();
    }

    @Override
    public Byte value6() {
        return getPeriod();
    }

    @Override
    public Double value7() {
        return getScore();
    }

    @Override
    public CourseRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public CourseRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public CourseRecord value3(String value) {
        setTeacher(value);
        return this;
    }

    @Override
    public CourseRecord value4(String value) {
        setCourseId(value);
        return this;
    }

    @Override
    public CourseRecord value5(Byte value) {
        setWeekPeriod(value);
        return this;
    }

    @Override
    public CourseRecord value6(Byte value) {
        setPeriod(value);
        return this;
    }

    @Override
    public CourseRecord value7(Double value) {
        setScore(value);
        return this;
    }

    @Override
    public CourseRecord values(Integer value1, String value2, String value3, String value4, Byte value5, Byte value6, Double value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CourseRecord
     */
    public CourseRecord() {
        super(Course.COURSE);
    }

    /**
     * Create a detached, initialised CourseRecord
     */
    public CourseRecord(Integer id, String name, String teacher, String courseId, Byte weekPeriod, Byte period, Double score) {
        super(Course.COURSE);

        set(0, id);
        set(1, name);
        set(2, teacher);
        set(3, courseId);
        set(4, weekPeriod);
        set(5, period);
        set(6, score);
    }
}
