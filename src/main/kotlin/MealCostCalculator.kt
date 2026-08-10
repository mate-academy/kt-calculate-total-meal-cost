fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double{
    fun applyTax(amount: Double, taxRate: Double): Double {
        return amount + amount * taxRate
    }

    fun applyTip(amount: Double, tipPercentage: Double): Double {
        return amount + amount * tipPercentage
    }

    fun applyDiscount(amount: Double, discount: Double): Double {
        return amount - discount
    }

    val baseCostWithTax: Double = applyTax(baseCost, taxRate)
    val baseCostWithTaxAndTip: Double = applyTip(baseCostWithTax, tipPercentage)

    return applyDiscount(baseCostWithTaxAndTip, discount)
}
