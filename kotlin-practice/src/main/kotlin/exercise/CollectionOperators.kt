package exercise

fun main() {
    val students = listOf<Student>(
        Student("John", 20, 3.5),
        Student("Jane", 21, 3.8),
        Student("Jack", 22, 3.2),
        Student("J", 20, 6.0),
        Student("JC", 20, 4.5)
    )

    println(studentsInfo(students))
}

data class Student(
    val name: String,
    val age: Int,
    val grade: Double
)

fun sortStudentsByName(students: List<Student>): List<Student> {
    return students.sortedBy { it.name }
}

fun sortStudentsByGradeDescending(students: List<Student>): List<Student> {
    return students.sortedByDescending { it.grade }
}

fun filterStudentsByAgeRange(students: List<Student>, minAge: Int, maxAge: Int): List<Student> {
    return students.filter { it.age in minAge..maxAge }
}

fun findTopStudents(students: List<Student>, topN: Int): List<Student> {
    return students.sortedByDescending { it.grade }.take(topN)
}

fun groupByGradeRange(students: List<Student>): Map<GradeLetter, List<Student>> {
    return students.groupBy { gradeDoubleToLetter(it.grade) }
}

enum class GradeLetter {
    A,
    B,
    C,
    D,
    F
}

fun gradeDoubleToLetter(grade: Double): GradeLetter {
    return when (grade) {
        in 2.0..2.49 -> GradeLetter.F
        in 2.5..3.49 -> GradeLetter.D
        in 3.5..4.49 -> GradeLetter.C
        in 4.5..5.49 -> GradeLetter.B
        else -> {
            GradeLetter.A
        }
    }
}

fun calculateAverageGrade(students: List<Student>): Double {
    return students.map { it.grade }.average()
}

// students with grade >= 2.5 , sortedBy grade, uppercase name

fun passedStudents(students: List<Student>): List<Student> {
    return students.filter { it.grade >= 2.5 }.map { it ->
        Student(it.name.uppercase(), it.age, it.grade)
    }
}

/*
new data class StudentInfo (1 student, belowAvg: Boolean (true if grade < avg), gradeLetter: Char)
fun studentsInfo(students: List<Student>) : List<StudentInfo>
Use fun calculateAverageGrade
Use fun gradeDoubleToLetter
 */

data class StudentInfo(
    val student: Student,
    val belowAverage: Boolean,
    val gradeLetter: GradeLetter
)

fun studentsInfo(students: List<Student>): List<StudentInfo> {
    val averageGrade = calculateAverageGrade(students)

    return students.map { student ->
        StudentInfo(
            student = student,
            belowAverage = student.grade < averageGrade,
            gradeLetter = gradeDoubleToLetter(student.grade)
        )
    }
}



