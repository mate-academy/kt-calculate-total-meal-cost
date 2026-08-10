fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {
    fun applyTax(): Double = baseCost * taxRate
    fun applyTip(): Double = (baseCost + applyTax()) * tipPercentage
    fun applyDiscount(): Double = discount
    return baseCost + applyTax() + applyTip() - applyDiscount()
}
