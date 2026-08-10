const val PERCENT = 100.0;

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(): Double {
        return baseCost + (baseCost / PERCENT * (taxRate * PERCENT))
    }
    fun applyTip(): Double {
        return applyTax() + (applyTax() / PERCENT * (tipPercentage * PERCENT))
    }
    fun applyDiscount(): Double {
        return applyTip() - discount
    }
    return applyDiscount()
}
