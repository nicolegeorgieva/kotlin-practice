import function.animalGroupLifespan
import function.priceAfterTax
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class ExampleTest : FreeSpec({

    "example" {
        priceAfterTax(10.0) shouldBe 12.0
    }

    "animal group lifespan" - {
        "cats live 15 years" {
            animalGroupLifespan("cats") shouldBe 15
        }
        "dogs live 10 years" {
            animalGroupLifespan("dogs") shouldBe 10
        }
        "mice live 2 years" {
            animalGroupLifespan("mice") shouldBe 2
        }
    }
})