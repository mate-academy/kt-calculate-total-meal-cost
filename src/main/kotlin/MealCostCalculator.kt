// create a function and implement it
fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {
    fun applyTax(baseCost: Double, taxRate: Double) = baseCost + baseCost * taxRate
    val tax = applyTax(baseCost, taxRate)

    fun applyTip(baseCostWithTax: Double, tipPercentage: Double) = baseCostWithTax + baseCostWithTax * tipPercentage
    val tip = applyTip(tax, tipPercentage)

    fun applyDiscount(baseCostWitTaxAndTip: Double, discount: Double) =
        baseCostWitTaxAndTip - discount

    if (discount == 0.0) {
        return tip
    }

    return applyDiscount(tip, discount)
}
