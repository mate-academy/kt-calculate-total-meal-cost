fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0,
): Double {
    fun applyTax(baseCost: Double, taxRate: Double) = baseCost + baseCost * taxRate

    fun applyTip(costAfterTax: Double, tipPercentage: Double) = costAfterTax + costAfterTax * tipPercentage

    fun applyDiscount(costAfterTaxAndTip: Double, discount: Double) = costAfterTaxAndTip - discount

    val costAfterTax = applyTax(baseCost, taxRate)
    val costAfterTaxAndTip = applyTip(costAfterTax, tipPercentage)

    return applyDiscount(costAfterTaxAndTip, discount)
}
