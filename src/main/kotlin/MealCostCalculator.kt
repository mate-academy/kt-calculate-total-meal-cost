// create a function and implement it
const val DISCOUNT_LEVEL: Double = 0.00

fun calculateTotalMealCost(baseCost: Double,
                           taxRate: Double,
                           tipPercentage: Double,
                           discount: Double = DISCOUNT_LEVEL): Double {
    var totalMealCost: Double = baseCost
    fun applyTax(taxRate: Double) {
        totalMealCost += (baseCost * taxRate)
    }

    fun applyTip(tipPercentage: Double) {
        totalMealCost += (totalMealCost * tipPercentage)
    }

    fun applyDiscount(discount: Double) : Double {
        totalMealCost -= discount
        return totalMealCost
    }

    applyTax(taxRate)
    applyTip(tipPercentage)
    return if (discount == DISCOUNT_LEVEL) totalMealCost else applyDiscount(discount)
}
