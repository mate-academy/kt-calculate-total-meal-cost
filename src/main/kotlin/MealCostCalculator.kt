
const val DEFAULT_DISCOUNT = 0.0
fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = DEFAULT_DISCOUNT,
    ): Double {
    var totalCost = baseCost

    fun applyTax() {
        totalCost += baseCost * taxRate
    }

    fun applyTip() {
        totalCost += totalCost * tipPercentage
    }

    fun applyDiscount() {
        totalCost -= discount
    }

    applyTax()
    applyTip()
    applyDiscount()

    return totalCost
}
