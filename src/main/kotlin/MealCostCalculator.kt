const val DISCOUNT_BY_DEFAULT = 0.0

fun calculateTotalMealCost(baseCost: Double,
                           taxRate: Double,
                           tipPercentage: Double,
                           discount: Double = DISCOUNT_BY_DEFAULT): Double {

    var cost = baseCost

    fun applyTax(baseCost: Double) {
        cost += baseCost * taxRate
    }
    fun applyTip() {
        cost += cost * tipPercentage
    }
    fun applyDiscount(discount: Double) {
        cost -= discount
    }

    applyTax(baseCost)
    applyTip()
    applyDiscount(discount)
    return cost
}
