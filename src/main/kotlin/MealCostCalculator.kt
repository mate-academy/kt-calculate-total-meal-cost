

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0) : Double{
    var finalCost = 0.0
    fun applyTax() {
       finalCost = baseCost + baseCost * taxRate
    }
    fun applyTip() {
        finalCost += finalCost * tipPercentage
    }
    fun applyDiscount() {
        finalCost -= discount
    }
    applyTax()
    applyTip()
    applyDiscount()
    return finalCost
}
