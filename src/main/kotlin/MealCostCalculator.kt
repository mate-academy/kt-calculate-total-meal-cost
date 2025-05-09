fun calculateTotalMealCost(
    baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0
): Double {
    fun applyTax() = baseCost.times(taxRate).plus(baseCost)
    fun applyTip() = applyTax().plus(applyTax().times(tipPercentage))
    fun applyDiscount() = applyTip().minus(discount)
    return applyDiscount()
}
