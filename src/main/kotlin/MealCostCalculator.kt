fun main() {
    println(calculateTotalMealCost(50.0, 0.1, 0.15, 0.0))
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
