fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(baseCost: Double, taxRate: Double) = baseCost + baseCost * taxRate
    fun applyTip(taxCost: Double, tipPercentage: Double) = taxCost + taxCost * tipPercentage
    fun applyDiscount(fullPrice: Double, discount: Double) = fullPrice - discount

    val applyTax = applyTax(baseCost, taxRate)
    val applyTip = applyTip(applyTax, tipPercentage)

    return applyDiscount(applyTip, discount)
}
