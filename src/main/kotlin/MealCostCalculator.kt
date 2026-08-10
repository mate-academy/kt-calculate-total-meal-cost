// create a function and implement it

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(cost: Double, taxRate: Double) = cost + cost * taxRate
    fun applyTip(cost: Double, tipPercentage: Double) = cost + cost * tipPercentage
    fun applyDiscount(cost: Double, discount: Double) = cost - discount

    val costWithTax = applyTax(baseCost, taxRate)
    val costWithTip = applyTip(costWithTax, tipPercentage)
    val costWithDiscount = applyDiscount(costWithTip, discount)
    return costWithDiscount
}
