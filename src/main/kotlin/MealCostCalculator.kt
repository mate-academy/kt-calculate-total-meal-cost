// create a function and implement it
fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.00,
): Double {
    fun applyTax(baseCost: Double, taxRate: Double,): Double =
        baseCost + baseCost * taxRate
    fun applyTip(priceWithTax: Double, tipPercentage: Double): Double =
        priceWithTax + priceWithTax * tipPercentage
    fun applyDiscount(priceWithTaxAndTips: Double, discount: Double): Double =
        priceWithTaxAndTips - discount

    var finalPrice = applyTax(baseCost, taxRate)
    finalPrice = applyTip(finalPrice, tipPercentage)
    return applyDiscount(finalPrice, discount)
}
