fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {
    fun applyTax() : Double = baseCost + baseCost * taxRate
    fun applyTip() : Double = applyTax() * tipPercentage
    return applyTax() + applyTip() - discount
}
