fun calculateTotalMealCost(
    baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0
): Double {
    var totalCost = baseCost

    fun applyTax() {
        totalCost += totalCost * taxRate
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
