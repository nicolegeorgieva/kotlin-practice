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

    println(findTopNSalaries(employees, 2))
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

//sorts the list of employees alphabetically by their names
fun sortEmployeesByName(employees: List<Employee>): List<Employee> {
    return employees.sortedBy { it.name }
}

fun filterEmployeesByDepartment(employees: List<Employee>): Map<String, List<Employee>> {
    return employees.groupBy { it.department }
}

fun filterEmployeesByGivenDepartment(employees: List<Employee>, department: String): List<Employee> {
    return employees.filter { it.department == department }
}

fun findTopNSalaries(employees: List<Employee>, topN: Int): List<Employee> {
    return employees.sortedByDescending { it.salary }.take(topN)
}
