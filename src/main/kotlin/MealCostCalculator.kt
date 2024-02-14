fun calculateTotalMealCost(
    baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0
): Double {
    val addPercent = { base: Double, percent: Double -> base + base * percent }

    fun applyTax(value: Double, taxRate: Double) = addPercent(value, taxRate)

    fun applyTip(value: Double, tipPercentage: Double) = addPercent(value, tipPercentage)

    fun applyDiscount(value: Double, taxRate: Double) = value - discount

    return applyDiscount(applyTip(applyTax(baseCost, taxRate), tipPercentage), discount)
}
