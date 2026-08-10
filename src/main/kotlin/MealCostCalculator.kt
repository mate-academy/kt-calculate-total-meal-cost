
fun calculateTotalMealCost(baseCost: Double, taxRate : Double,
                           tipPercentage : Double, discount : Double = 0.0 ) : Double {
    fun applyTax(baseCost: Double, taxRate: Double) : Double  = baseCost * taxRate
    fun applyTip(total: Double, tipPercentage: Double) : Double = total * tipPercentage

    val totalWithTax = applyTax(baseCost, taxRate)
    val totalWithTip = applyTip(baseCost + totalWithTax, tipPercentage)
    return baseCost + totalWithTax + totalWithTip - discount
}
