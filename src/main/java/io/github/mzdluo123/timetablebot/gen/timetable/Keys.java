/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.timetable;


import io.github.mzdluo123.timetablebot.gen.timetable.tables.Classroom;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.Course;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.CourseTime;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.OtherCourse;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.Profile;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.User;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.UserCourse;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.UserOtherCourse;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.records.ClassroomRecord;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.records.CourseRecord;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.records.CourseTimeRecord;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.records.OtherCourseRecord;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.records.ProfileRecord;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.records.UserCourseRecord;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.records.UserOtherCourseRecord;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.records.UserRecord;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>timetable</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ClassroomRecord, Integer> IDENTITY_CLASSROOM = Identities0.IDENTITY_CLASSROOM;
    public static final Identity<CourseRecord, Integer> IDENTITY_COURSE = Identities0.IDENTITY_COURSE;
    public static final Identity<CourseTimeRecord, Integer> IDENTITY_COURSE_TIME = Identities0.IDENTITY_COURSE_TIME;
    public static final Identity<OtherCourseRecord, Integer> IDENTITY_OTHER_COURSE = Identities0.IDENTITY_OTHER_COURSE;
    public static final Identity<ProfileRecord, Integer> IDENTITY_PROFILE = Identities0.IDENTITY_PROFILE;
    public static final Identity<UserRecord, Integer> IDENTITY_USER = Identities0.IDENTITY_USER;
    public static final Identity<UserCourseRecord, Integer> IDENTITY_USER_COURSE = Identities0.IDENTITY_USER_COURSE;
    public static final Identity<UserOtherCourseRecord, Integer> IDENTITY_USER_OTHER_COURSE = Identities0.IDENTITY_USER_OTHER_COURSE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ClassroomRecord> KEY_CLASSROOM_PRIMARY = UniqueKeys0.KEY_CLASSROOM_PRIMARY;
    public static final UniqueKey<ClassroomRecord> KEY_CLASSROOM_CLASSROOM_LOCATION_UNIQUE = UniqueKeys0.KEY_CLASSROOM_CLASSROOM_LOCATION_UNIQUE;
    public static final UniqueKey<CourseRecord> KEY_COURSE_PRIMARY = UniqueKeys0.KEY_COURSE_PRIMARY;
    public static final UniqueKey<CourseRecord> KEY_COURSE_COURSE_ID = UniqueKeys0.KEY_COURSE_COURSE_ID;
    public static final UniqueKey<CourseTimeRecord> KEY_COURSE_TIME_PRIMARY = UniqueKeys0.KEY_COURSE_TIME_PRIMARY;
    public static final UniqueKey<OtherCourseRecord> KEY_OTHER_COURSE_PRIMARY = UniqueKeys0.KEY_OTHER_COURSE_PRIMARY;
    public static final UniqueKey<OtherCourseRecord> KEY_OTHER_COURSE_NAME = UniqueKeys0.KEY_OTHER_COURSE_NAME;
    public static final UniqueKey<ProfileRecord> KEY_PROFILE_PRIMARY = UniqueKeys0.KEY_PROFILE_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_USER_ACCOUNT_UNIQUE = UniqueKeys0.KEY_USER_USER_ACCOUNT_UNIQUE;
    public static final UniqueKey<UserCourseRecord> KEY_USER_COURSE_PRIMARY = UniqueKeys0.KEY_USER_COURSE_PRIMARY;
    public static final UniqueKey<UserOtherCourseRecord> KEY_USER_OTHER_COURSE_PRIMARY = UniqueKeys0.KEY_USER_OTHER_COURSE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CourseTimeRecord, CourseRecord> FK_COURSETIME_COURSE_ID = ForeignKeys0.FK_COURSETIME_COURSE_ID;
    public static final ForeignKey<CourseTimeRecord, ClassroomRecord> FK_COURSETIME_CLASS_ROOM_ID = ForeignKeys0.FK_COURSETIME_CLASS_ROOM_ID;
    public static final ForeignKey<ProfileRecord, UserRecord> FK_PROFILE_USER = ForeignKeys0.FK_PROFILE_USER;
    public static final ForeignKey<UserCourseRecord, UserRecord> FK_USERCOURSE_USER_ID = ForeignKeys0.FK_USERCOURSE_USER_ID;
    public static final ForeignKey<UserCourseRecord, CourseRecord> FK_USERCOURSE_COURSE_ID = ForeignKeys0.FK_USERCOURSE_COURSE_ID;
    public static final ForeignKey<UserOtherCourseRecord, UserRecord> FK_USER_COURSE = ForeignKeys0.FK_USER_COURSE;
    public static final ForeignKey<UserOtherCourseRecord, OtherCourseRecord> FK_OTHER_COURSE = ForeignKeys0.FK_OTHER_COURSE;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<ClassroomRecord, Integer> IDENTITY_CLASSROOM = Internal.createIdentity(Classroom.CLASSROOM, Classroom.CLASSROOM.ID);
        public static Identity<CourseRecord, Integer> IDENTITY_COURSE = Internal.createIdentity(Course.COURSE, Course.COURSE.ID);
        public static Identity<CourseTimeRecord, Integer> IDENTITY_COURSE_TIME = Internal.createIdentity(CourseTime.COURSE_TIME, CourseTime.COURSE_TIME.ID);
        public static Identity<OtherCourseRecord, Integer> IDENTITY_OTHER_COURSE = Internal.createIdentity(OtherCourse.OTHER_COURSE, OtherCourse.OTHER_COURSE.ID);
        public static Identity<ProfileRecord, Integer> IDENTITY_PROFILE = Internal.createIdentity(Profile.PROFILE, Profile.PROFILE.ID);
        public static Identity<UserRecord, Integer> IDENTITY_USER = Internal.createIdentity(User.USER, User.USER.ID);
        public static Identity<UserCourseRecord, Integer> IDENTITY_USER_COURSE = Internal.createIdentity(UserCourse.USER_COURSE, UserCourse.USER_COURSE.ID);
        public static Identity<UserOtherCourseRecord, Integer> IDENTITY_USER_OTHER_COURSE = Internal.createIdentity(UserOtherCourse.USER_OTHER_COURSE, UserOtherCourse.USER_OTHER_COURSE.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<ClassroomRecord> KEY_CLASSROOM_PRIMARY = Internal.createUniqueKey(Classroom.CLASSROOM, "KEY_classroom_PRIMARY", new TableField[] { Classroom.CLASSROOM.ID }, true);
        public static final UniqueKey<ClassroomRecord> KEY_CLASSROOM_CLASSROOM_LOCATION_UNIQUE = Internal.createUniqueKey(Classroom.CLASSROOM, "KEY_classroom_classroom_location_unique", new TableField[] { Classroom.CLASSROOM.LOCATION }, true);
        public static final UniqueKey<CourseRecord> KEY_COURSE_PRIMARY = Internal.createUniqueKey(Course.COURSE, "KEY_course_PRIMARY", new TableField[] { Course.COURSE.ID }, true);
        public static final UniqueKey<CourseRecord> KEY_COURSE_COURSE_ID = Internal.createUniqueKey(Course.COURSE, "KEY_course_course_id", new TableField[] { Course.COURSE.COURSE_ID }, true);
        public static final UniqueKey<CourseTimeRecord> KEY_COURSE_TIME_PRIMARY = Internal.createUniqueKey(CourseTime.COURSE_TIME, "KEY_course_time_PRIMARY", new TableField[] { CourseTime.COURSE_TIME.ID }, true);
        public static final UniqueKey<OtherCourseRecord> KEY_OTHER_COURSE_PRIMARY = Internal.createUniqueKey(OtherCourse.OTHER_COURSE, "KEY_other_course_PRIMARY", new TableField[] { OtherCourse.OTHER_COURSE.ID }, true);
        public static final UniqueKey<OtherCourseRecord> KEY_OTHER_COURSE_NAME = Internal.createUniqueKey(OtherCourse.OTHER_COURSE, "KEY_other_course_name", new TableField[] { OtherCourse.OTHER_COURSE.NAME }, true);
        public static final UniqueKey<ProfileRecord> KEY_PROFILE_PRIMARY = Internal.createUniqueKey(Profile.PROFILE, "KEY_profile_PRIMARY", new TableField[] { Profile.PROFILE.ID }, true);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, "KEY_user_PRIMARY", new TableField[] { User.USER.ID }, true);
        public static final UniqueKey<UserRecord> KEY_USER_USER_ACCOUNT_UNIQUE = Internal.createUniqueKey(User.USER, "KEY_user_user_account_unique", new TableField[] { User.USER.ACCOUNT }, true);
        public static final UniqueKey<UserCourseRecord> KEY_USER_COURSE_PRIMARY = Internal.createUniqueKey(UserCourse.USER_COURSE, "KEY_user_course_PRIMARY", new TableField[] { UserCourse.USER_COURSE.ID }, true);
        public static final UniqueKey<UserOtherCourseRecord> KEY_USER_OTHER_COURSE_PRIMARY = Internal.createUniqueKey(UserOtherCourse.USER_OTHER_COURSE, "KEY_user_other_course_PRIMARY", new TableField[] { UserOtherCourse.USER_OTHER_COURSE.ID }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<CourseTimeRecord, CourseRecord> FK_COURSETIME_COURSE_ID = Internal.createForeignKey(Keys.KEY_COURSE_PRIMARY, CourseTime.COURSE_TIME, "fk_coursetime_course_id", new TableField[] { CourseTime.COURSE_TIME.COURSE }, true);
        public static final ForeignKey<CourseTimeRecord, ClassroomRecord> FK_COURSETIME_CLASS_ROOM_ID = Internal.createForeignKey(Keys.KEY_CLASSROOM_PRIMARY, CourseTime.COURSE_TIME, "fk_coursetime_class_room_id", new TableField[] { CourseTime.COURSE_TIME.CLASS_ROOM }, true);
        public static final ForeignKey<ProfileRecord, UserRecord> FK_PROFILE_USER = Internal.createForeignKey(Keys.KEY_USER_PRIMARY, Profile.PROFILE, "fk_profile_user", new TableField[] { Profile.PROFILE.USER }, true);
        public static final ForeignKey<UserCourseRecord, UserRecord> FK_USERCOURSE_USER_ID = Internal.createForeignKey(Keys.KEY_USER_PRIMARY, UserCourse.USER_COURSE, "fk_usercourse_user_id", new TableField[] { UserCourse.USER_COURSE.USER }, true);
        public static final ForeignKey<UserCourseRecord, CourseRecord> FK_USERCOURSE_COURSE_ID = Internal.createForeignKey(Keys.KEY_COURSE_PRIMARY, UserCourse.USER_COURSE, "fk_usercourse_course_id", new TableField[] { UserCourse.USER_COURSE.COURSE }, true);
        public static final ForeignKey<UserOtherCourseRecord, UserRecord> FK_USER_COURSE = Internal.createForeignKey(Keys.KEY_USER_PRIMARY, UserOtherCourse.USER_OTHER_COURSE, "fk_user_course", new TableField[] { UserOtherCourse.USER_OTHER_COURSE.USER }, true);
        public static final ForeignKey<UserOtherCourseRecord, OtherCourseRecord> FK_OTHER_COURSE = Internal.createForeignKey(Keys.KEY_OTHER_COURSE_PRIMARY, UserOtherCourse.USER_OTHER_COURSE, "fk_other_course", new TableField[] { UserOtherCourse.USER_OTHER_COURSE.OTHER_COURSE }, true);
    }
}
