const val HUNDRED = 100

fun calculateTotalMealCost(
    baseCost : Double, taxRate : Double,
    tipPercentage : Double, discount : Double = 0.0) : Double {
    var result = baseCost
    fun applyTax() {
        result += result * taxRate
    }
    fun applyTip() {
        result += result * tipPercentage
    }
    fun applyDiscount() {
        result -= discount
    }
    applyTax()
    applyTip()
    applyDiscount()
    return result
}
