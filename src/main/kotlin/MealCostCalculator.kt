const val DEFAULT_DISCOUNT = 0.0

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0) : Double {
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
    return if (discount == DEFAULT_DISCOUNT) totalMealCost else applyDiscount(discount)
}
