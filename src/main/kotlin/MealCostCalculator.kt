const val PERCENTAGE = 100

fun calculateTotalMealCost(baseCost: Double, taxRate: Double,
                           tipPercentage: Double, discount: Double = 0.0 ) : Double {
    fun applyTax() = baseCost * taxRate
    fun applyTip() = (baseCost + applyTax()) * tipPercentage
    fun applyDiscount() = baseCost * discount / PERCENTAGE

    return baseCost + applyTax() + applyTip() - applyDiscount()
}
