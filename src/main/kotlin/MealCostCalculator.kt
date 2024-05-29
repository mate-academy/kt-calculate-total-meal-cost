// create a function and implement it

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tip: Double, discount: Double = 0.0): Double {
    var result: Double = baseCost;
    fun applyTax() {
        result += result * taxRate
    }

    fun applyTip() {
        result += result * tip
    }

    fun applyDiscount() {
        result -= discount
    }

    applyTax()
    applyTip()
    applyDiscount()
    return result
}
