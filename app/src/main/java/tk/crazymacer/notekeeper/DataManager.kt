package tk.crazymacer.notekeeper

import java.util.HashMap

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init{
        initializeCourses()
    }

    private fun initializeCourses()
    {
        var course= CourseInfo("android_intents","Android Programming with Intents")
        courses.set(course.courseId,course)

        course= CourseInfo("android_async","Android Async Programming and Services")
        courses.set(course.courseId,course)

        course= CourseInfo("java_lang","Java Fundamentals")
        courses.set(course.courseId,course)

    }
}