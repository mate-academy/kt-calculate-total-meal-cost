const val BASE_COST = 50.0
const val TAX_RATE = 0.1
const val TIP_PERCENTAGE = 0.15

fun main() {
    println(
        calculateTotalMealCost(
            BASE_COST,
            TAX_RATE,
            TIP_PERCENTAGE,
            0.0
        )
    )
}

fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {
    fun applyTax(baseCost: Double): Double {
        return baseCost + baseCost * taxRate
    }

    fun applyTip(costAfterTax: Double): Double {
        return costAfterTax + costAfterTax * tipPercentage
    }

    fun applyDiscount(totalCost: Double): Double {
        return if (discount > 0.0) return totalCost.minus(discount) else totalCost
    }

    val costAfterTax = applyTax(baseCost)
    val costAfterTip = applyTip(costAfterTax)
    return applyDiscount(costAfterTip)
}
