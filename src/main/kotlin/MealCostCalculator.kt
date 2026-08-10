const val PERCENTAGE = 100.0
fun calculateTotalMealCost(baseCost : Double, taxRate : Double,
                           tipPercentage : Double, discount: Double = 0.0) : Double {
    fun applyTax(): Double {
        return taxRate * baseCost
    }
    fun applyTip(): Double {
        return (baseCost + applyTax()) * tipPercentage
    }
    fun applyDiscount(): Double {
        return baseCost * discount / PERCENTAGE
    }
    return baseCost + applyTax() + applyTip() - applyDiscount()
}
