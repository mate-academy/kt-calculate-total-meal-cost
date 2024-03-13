// create a function and implement it
fun calculateTotalMealCost (baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax() = baseCost + baseCost * taxRate
    fun applyTip(tax: Double) = tax + tax * tipPercentage
    fun applyDiscount(tip: Double) = tip - discount
    return applyDiscount(applyTip(applyTax()))
}
