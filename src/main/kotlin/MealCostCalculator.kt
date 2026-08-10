
fun calculateTotalMealCost(
    baseCost: Double, taxRate: Double,
    tipPercentage: Double, discount: Double = 0.0) : Double {

    fun applyTax(baseCost: Double, taxRate: Double) = baseCost + baseCost * taxRate

    fun applyTip(all: Double, tipPercentage: Double) = all + all * tipPercentage

    fun applyDiscount(all: Double, discount: Double) = all - discount

    return applyDiscount(applyTip(applyTax(baseCost, taxRate), tipPercentage), discount)
}
