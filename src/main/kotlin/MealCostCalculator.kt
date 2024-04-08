// create a function and implement it

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(cost: Double, taxRate: Double): Double = cost * (1 + taxRate)

    fun applyTip(cost: Double, tipPercentage: Double): Double = cost * (1 + tipPercentage)

    fun applyDiscount(cost: Double, discount: Double) : Double = cost - discount

    return applyDiscount(applyTip(applyTax(baseCost, taxRate), tipPercentage), discount)
}
