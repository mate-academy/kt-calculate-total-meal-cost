private const val DEFAULT_DISCOUNT = 0.0

// create a function and implement it
fun calculateTotalMealCost(
    baseCost: Double, taxRate: Double,
    tipPercentage: Double, discount: Double = DEFAULT_DISCOUNT
): Double {
    var result: Double

    val applyTax: (Double, Double) -> Double = { a, b -> a + (a * b) }
    fun applyTip(amount: Double, percentage: Double): Double {
        return amount + (amount * percentage)
    }

    fun applyDiscount(amount: Double, discount: Double): Double {
        return amount - discount
    }
    result = applyTax(baseCost, taxRate)
    result = applyTip(result, tipPercentage)
    result = applyDiscount(result, discount)
    return result
}
