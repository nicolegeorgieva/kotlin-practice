package exercise.collection

fun main() {
    val employees = listOf(
        Employee(
            employeeId = 124,
            name = "Kayla",
            department = "HR",
            salary = 2000.00
        ),
        Employee(
            employeeId = 125,
            name = "Lulu",
            department = "IT",
            salary = 5600.00
        ),
        Employee(
            employeeId = 126,
            name = "Amy",
            department = "Customer support",
            salary = 1500.00
        )
    )

    println(findEmployeeById(employees, 126))
}

data class Employee(
    val employeeId: Int,
    val name: String,
    val department: String,
    val salary: Double
)

fun findEmployeeById(employees: List<Employee>, id: Int): Employee? {
    return employees.find { it.employeeId == id }
}
