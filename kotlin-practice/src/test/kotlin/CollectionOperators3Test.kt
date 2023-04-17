import exercise.collection.*
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class CollectionOperators3Test : FreeSpec({
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

    "find employee by id" - {
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

    "sort employees by name" {
        sortEmployeesByName(employees) shouldBe listOf(
            Employee(126, "Amy", "Customer support", 1500.0),
            Employee(124, "Kayla", "HR", 2000.0),
            Employee(125, "Lulu", "IT", 5600.0)
        )
    }

    "filter employees by department" {
        filterEmployeesByDepartment(employees) shouldBe mapOf(
            "HR" to listOf(Employee(124, "Kayla", "HR", 2000.0)),
            "IT" to listOf(Employee(125, "Lulu", "IT", 5600.0)),
            "Customer support" to listOf(Employee(126, "Amy", "Customer support", 1500.0))
        )
    }

    "filter employees by given department" - {
        "IT" {
            filterEmployeesByGivenDepartment(employees, "IT") shouldBe listOf(
                Employee(125, "Lulu", "IT", 5600.00)
            )
        }

        "HR" {
            filterEmployeesByGivenDepartment(employees, "HR") shouldBe listOf(
                Employee(124, "Kayla", "HR", 2000.00)
            )
        }
    }

    "find top n salaries" - {
        "top 1" {
            findTopNSalaries(employees, 1) shouldBe TopNSalariesResult.Success(
                list = listOf(Employee(125, "Lulu", "IT", 5600.0))
            )
        }

        "top 0" {
            findTopNSalaries(employees, 0) shouldBe TopNSalariesResult.Error(message = "Invalid criteria")
        }
    }
})