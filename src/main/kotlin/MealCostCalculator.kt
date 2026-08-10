// create a function and implement it
fun calculateTotalMealCost(baseCost: Double,
                           taxRate: Double,
                           tipPercentage: Double,
                           discount: Double = 0.0): Double {
    fun applyTax(baseCost: Double, taxRate: Double) = baseCost + baseCost * taxRate
    fun applyTip(totalWithTax: Double, tipPercentage: Double) =  totalWithTax + totalWithTax * tipPercentage
    fun applyDiscount(totalWithTip: Double, discount: Double) = totalWithTip - discount

    val withTax = applyTax(baseCost, taxRate)
    val withTip = applyTip(withTax, tipPercentage)

    return applyDiscount(withTip, discount)
}
