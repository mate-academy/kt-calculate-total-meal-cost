const val ZERO_DISCOUNT = 0.0

fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = ZERO_DISCOUNT
): Double {

    fun applyTax(baseCost: Double, taxRate: Double): Double =
        baseCost + baseCost * taxRate

    fun applyTip(cost: Double, tipPercentage: Double): Double =
        cost + cost * tipPercentage

    fun applyDiscount(cost: Double, discount: Double): Double =
        cost - cost * discount

    var result = applyTax(baseCost, taxRate)
    result = applyTip(result, tipPercentage)
    result = applyDiscount(result, discount)

    return result
}
