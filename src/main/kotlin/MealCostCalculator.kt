// create a function and implement it
fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(price: Double, taxRate: Double): Double = price + price * taxRate
    fun applyTip(price: Double, tipPercentage: Double): Double = price + price * tipPercentage
    fun applyDiscount(price: Double, discount: Double): Double {
        return if (discount > 0) price - discount else price
    }

    return applyDiscount(applyTip(applyTax(baseCost, taxRate), tipPercentage), discount)
}
