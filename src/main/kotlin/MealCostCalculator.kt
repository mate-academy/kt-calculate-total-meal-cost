// create a function and implement it
fun calculateTotalMealCost(baseCost: Double,
                           taxRate: Double,
                           tipPercentage: Double,
                           discount: Double = 0.0): Double {
    fun applyTax(baseCost: Double, taxRate: Double): Double {
        return (baseCost * taxRate) + baseCost
    }
    fun applyTip(tipPercentage: Double): Double {
        return (applyTax(baseCost, taxRate) * tipPercentage) + applyTax(baseCost, taxRate)
    }
    fun applyDiscount(discount: Double): Double {
        return applyTip(tipPercentage) - discount
    }
    return applyDiscount(discount)
}
