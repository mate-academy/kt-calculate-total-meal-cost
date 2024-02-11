fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {
    fun applyTax() = taxRate * baseCost
    fun applyTip() = (baseCost + applyTax()) * tipPercentage
    fun applyDiscount() = baseCost * discount / 100
    return baseCost + applyTax() + applyTip() - applyDiscount()
}
