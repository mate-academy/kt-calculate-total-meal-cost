// create a function and implement it
const val DISCOUNT_LEVEL: Double = 0.00

fun calculateTotalMealCost(baseCost: Double,
                           taxRate: Double,
                           tipPercentage: Double,
                           discount: Double = DISCOUNT_LEVEL): Double {
    fun calculateTax(baseCost: Double, taxRate: Double): Double {
        return baseCost * taxRate
    }

    fun calculateTip(baseCost: Double, tipPercentage: Double): Double {
        return baseCost * tipPercentage
    }

    val costAfterTax = baseCost + calculateTax(baseCost, taxRate)
    val costAfterTip = costAfterTax + calculateTip(baseCost, tipPercentage)
    val totalCost = costAfterTip

    return if (discount > DISCOUNT_LEVEL) totalCost - discount else totalCost
}
