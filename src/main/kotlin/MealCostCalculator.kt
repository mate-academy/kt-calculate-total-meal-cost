private const val BASE_COST = 100.0
private const val TAX_RATE = 0.1
private const val TIP_PERCENTAGE = 0.15
private const val DISCOUNT = 10.0

fun main() {
    val totalMealCost = calculateTotalMealCost(
        BASE_COST,
        TAX_RATE,
        TIP_PERCENTAGE,
        DISCOUNT
    )

    println("Total meal cost: $totalMealCost")
}

fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {

    fun applyTax(cost: Double): Double {
        return cost + cost * taxRate
    }

    fun applyTip(cost: Double): Double {
        return cost + cost * tipPercentage
    }

    fun applyDiscount(cost: Double): Double {
        return cost - discount
    }

    val costWithTax = applyTax(baseCost)
    val costWithTip = applyTip(costWithTax)

    return applyDiscount(costWithTip)
}
