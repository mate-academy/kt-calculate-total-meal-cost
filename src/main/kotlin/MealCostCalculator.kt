fun calculateTotalMealCost(baseCost: Double, taxRate: Double,
                           tipPercentage: Double, discount: Double = 0.0) : Double {
    var totalCost: Double = baseCost

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
