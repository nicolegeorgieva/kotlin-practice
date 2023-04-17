import exercise.collection.Employee
import exercise.collection.findEmployeeById
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class CollectionOperators3Test : FreeSpec({
    "find employee by id" - {
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

        "id exist in the list" {
            findEmployeeById(employees, 126) shouldBe Employee(
                126, "Amy",
                "Customer support", 1500.00
            )
        }

        "id doesn't exist in the list" {
            findEmployeeById(employees, 220) shouldBe null
        }
    }
})