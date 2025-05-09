const val BASE_COST = 100.0
const val TAX_RATE = 0.1
const val TIP_PERCENTAGE = 0.15
const val DISCOUNT = 10.0

fun main() {
    val totalMealCost = calculateTotalMealCost(BASE_COST, TAX_RATE, TIP_PERCENTAGE, DISCOUNT)
    println("Total meal cost: $totalMealCost")
}

fun calculateTotalMealCost(
    baseCost: Double, taxRate: Double, tipPercentage: Double,
    discount: Double = 0.0
): Double {

    fun applyTax(baseCost: Double, taxRate: Double): Double {
        return baseCost * (1 + taxRate)
    }

    fun applyTip(cost: Double, tipPercentage: Double): Double {
        return cost * (1 + tipPercentage)
    }

    fun applyDiscount(cost: Double, discount: Double): Double {
        return cost - discount
    }

    val costWithTax = applyTax(baseCost, taxRate)
    val costWithTip = applyTip(costWithTax, tipPercentage)
    return applyDiscount(costWithTip, discount)
}
