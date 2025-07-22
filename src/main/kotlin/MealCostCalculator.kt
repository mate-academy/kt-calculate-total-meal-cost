fun calculateTotalMealCost(baseAmount: Double,
                           taxRate: Double,
                           tipPercentage: Double,
                           discount: Double = 0.0): Double {
    var currentAmount = baseAmount
    fun addTax() {
        currentAmount += currentAmount * taxRate
    }
    fun addTip() {
        currentAmount += currentAmount * tipPercentage
    }
    fun addDiscount() {
        currentAmount -= discount
    }
    addTax()
    addTip()
    addDiscount()
    return currentAmount
}
