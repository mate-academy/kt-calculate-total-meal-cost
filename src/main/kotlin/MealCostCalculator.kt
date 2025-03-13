const val NO_DISCOUNT = 0.0
const val BASE_MULTIPLIER = 1.0

fun calculateTotalMealCost(baseCost: Double, taxRate: Double,
                           tipPercentage: Double, discount: Double = NO_DISCOUNT): Double {
    fun applyTax(baseCost: Double, taxRate: Double): Double
    = baseCost * (BASE_MULTIPLIER + taxRate)

    fun applyTip(costAfterTax: Double, tipPercentage: Double): Double
    = costAfterTax * (BASE_MULTIPLIER + tipPercentage)

    fun applyDiscount(finalCost: Double, discount: Double): Double = finalCost - discount

    val costAfterTax = applyTax(baseCost, taxRate)
    val finalCost = applyTip(costAfterTax, tipPercentage)
    return if (discount > NO_DISCOUNT) applyDiscount(finalCost, discount) else finalCost
}
