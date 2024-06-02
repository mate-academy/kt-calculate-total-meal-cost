// create a function and implement it
const val DISCOUNT_LEVEL: Double = 0.00
fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = DISCOUNT_LEVEL): Double {
    fun tax(baseCost: Double, taxRate: Double): Double {
        return baseCost * taxRate
    }

    fun tip(baseCost: Double, tipPercentage: Double): Double {
        return baseCost * tipPercentage
    }

    val costAfterTaxRate = tax(baseCost, taxRate)
    val costAfterTipPercentage = tip(baseCost, tipPercentage)
    val totalCost = baseCost + costAfterTaxRate + costAfterTipPercentage

    return if (discount > DISCOUNT_LEVEL) totalCost - discount else totalCost
}
