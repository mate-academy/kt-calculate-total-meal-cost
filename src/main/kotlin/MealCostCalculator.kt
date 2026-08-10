// create a function and implement it
fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
) : Double {
    var cost = baseCost
    fun applyTax() {
        cost += cost.times(taxRate)
    }

    fun applyTip() {
        cost += cost.times(tipPercentage)
    }

    fun applyDiscount() {
        cost -= discount
    }

    applyTax()
    applyTip()
    applyDiscount()
    return cost
}
