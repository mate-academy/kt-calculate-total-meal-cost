// create a function and implement it
fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0) :Double {
    fun applyTax(cost : Double) = cost + cost * taxRate
    fun applyTip(cost : Double) = cost + cost * tipPercentage
    fun applyDiscount(cost : Double) = if (discount > 0) cost - discount else cost

    val costWithTax = applyTax(baseCost)
    val costWithTipAndTax = applyTip(costWithTax)
    return applyDiscount(costWithTipAndTax)
}
