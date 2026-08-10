
const val HUNDRED_PERCENTAGE = 100.0
fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {
    fun applyTax() = taxRate * baseCost
    fun applyTip() = (baseCost + applyTax()) * tipPercentage
    fun applyDiscount() = baseCost * discount / HUNDRED_PERCENTAGE
    return baseCost + applyTax() + applyTip() - applyDiscount()
}
