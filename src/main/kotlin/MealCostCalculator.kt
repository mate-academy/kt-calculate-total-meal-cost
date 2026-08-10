
const val BASE_CONST = 100.0
const val TAX_RATE = 0.1
const val TIP_PERCENTAGE = 0.15
const val DISCOUNT = 10.0

fun calculateTotalMealCost(
    baseCost: Double, taxRate: Double,
    tipPercentage: Double, discount: Double = 0.0
): Double {

    fun applyTax(cost: Double): Double {

        return cost + (cost * taxRate)
    }

    fun applyTip(cost: Double): Double {

        return cost + (cost * tipPercentage)
    }

    fun applyDiscount(cost: Double): Double {

        return if (discount > 0.0) {
            cost - discount
        } else {
            cost
        }
    }

    val costWithTax = applyTax(baseCost)
    val costWithTip = applyTip(costWithTax)

    return applyDiscount(costWithTip)
}

fun main() {

    val totalMealCost = calculateTotalMealCost(BASE_CONST, TAX_RATE,
        TIP_PERCENTAGE,  DISCOUNT)

    println("Total meal cost: $totalMealCost")
}
