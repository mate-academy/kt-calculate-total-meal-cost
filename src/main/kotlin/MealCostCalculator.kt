fun calculateTotalMealCost(baseCost: Double,
                           taxRate: Double,
                           tipPercentage: Double,
                           discount: Double = 0.0) : Double {

    fun applyTax(baseCost: Double, taxRate: Double) : Double = baseCost + (baseCost * taxRate)

    fun applyTip(costAfterTax: Double, tipPercentage: Double) : Double = costAfterTax + (costAfterTax * tipPercentage)

    fun applyDiscount(costAfterTipAndTax: Double, discount: Double) : Double = costAfterTipAndTax -  discount

    return applyDiscount(applyTip(applyTax(baseCost, taxRate), tipPercentage), discount)
}
