fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(cost: Double): Double = cost + cost * taxRate
    fun applyTip(cost: Double): Double = cost + cost * tipPercentage
    fun applyDiscount(cost: Double): Double = cost - discount

    val costAfterTax = applyTax(baseCost)
    val costAfterTip = applyTip(costAfterTax)
    val totalCost = applyDiscount(costAfterTip)

    return totalCost
}
