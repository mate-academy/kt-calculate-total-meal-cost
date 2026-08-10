
fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double
                           , discount: Double = 0.0) : Double {
    fun applyTax(cost: Double) = cost +cost * taxRate

    fun applyTip(cost:Double) = cost + cost * tipPercentage

    fun applyDiscount(count: Double) = count - discount

    val totalCost = applyDiscount(applyTip(applyTax(baseCost)))
    return totalCost
}
