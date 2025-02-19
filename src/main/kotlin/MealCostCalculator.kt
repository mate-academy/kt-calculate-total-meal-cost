// create a function and implement it
const val ZERO = 0.0
fun calculateTotalMealCost(
    baseCost : Double,
    taxRate : Double,
    tipPercentage: Double,
    discount : Double = ZERO
) : Double {
    var finalCost = baseCost

    fun applyTax(taxRate: Double) {
        finalCost += baseCost * taxRate
    }

    fun applyTip(tipPercentage: Double) {
        finalCost += finalCost * tipPercentage
    }

    fun applyDiscount(discount: Double) {
        finalCost -= discount
    }

    applyTax(taxRate)
    applyTip(tipPercentage)
    applyDiscount(discount)

    return finalCost
}
