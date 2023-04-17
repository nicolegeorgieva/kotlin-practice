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

    println(calculateAverageSalaryByDepartment(employees))
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

// sorts the list of employees alphabetically by their names
fun sortEmployeesByName(employees: List<Employee>): List<Employee> {
    return employees.sortedBy { it.name }
}

fun filterEmployeesByDepartment(employees: List<Employee>): Map<String, List<Employee>> {
    return employees.groupBy { it.department }
}

fun filterEmployeesByGivenDepartment(employees: List<Employee>, department: String): List<Employee> {
    return employees.filter { it.department == department }
}

sealed interface TopNSalariesResult {
    data class Error(val message: String) : TopNSalariesResult
    data class Success(val list: List<Employee>) : TopNSalariesResult
}

fun findTopNSalaries(employees: List<Employee>, topN: Int): TopNSalariesResult {
    if (topN <= 0 || topN > employees.size) return TopNSalariesResult.Error("Invalid criteria")

    val res = employees.sortedByDescending { it.salary }.take(topN)

    return TopNSalariesResult.Success(res)
}

// Pair(IT, 5600), Pair(HR, 2000)
fun calculateAverageSalaryByDepartment(employees: List<Employee>): Map<String, Double> {
    val filtered = filterEmployeesByDepartment(employees)

    return filtered.mapValues { (_, filtered) ->
        filtered.map { it.salary }.average()
    }
}


