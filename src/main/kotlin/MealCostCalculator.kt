fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(baseCost: Double, taxRate: Double): Double = baseCost + baseCost * taxRate
    fun applyTip(baseCost: Double, tipPercentage: Double): Double = baseCost + baseCost * tipPercentage
    fun applyDiscount(baseCost: Double, discount: Double): Double = baseCost - discount

    return applyDiscount(applyTip(applyTax(baseCost, taxRate), tipPercentage), discount)
}
