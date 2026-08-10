fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax() = baseCost + baseCost * taxRate

    fun applyTip() = applyTax() + applyTax() * tipPercentage

    fun applyDiscount() = applyTip() - discount

    return applyDiscount()
}
