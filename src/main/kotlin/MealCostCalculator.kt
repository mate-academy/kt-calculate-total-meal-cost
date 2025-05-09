// create a function and implement it
fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {
    fun applyTax(baseCost: Double, taxRate: Double): Double {
        return baseCost + baseCost * taxRate
    }

    fun applyTip(taxed: Double, tipPercentage: Double): Double {
        return taxed + taxed * tipPercentage
    }

    fun applyDiscount(taxAndTip: Double, discount: Double): Double {
        return taxAndTip - discount
    }
    val taxed: Double = applyTax(baseCost, taxRate)
    val taxAndTip: Double = applyTip(taxed, tipPercentage)
    return applyDiscount(taxAndTip, discount)
}
