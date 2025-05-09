fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double,
                           discount: Double = 0.0): Double {
    fun applyTax(baseCost: Double, taxRate: Double): Double {
        return baseCost + (baseCost * taxRate)
    }
    val priceAfterTax = applyTax(baseCost, taxRate)
    fun applyTip (priceAfterTax: Double, tipPercentage: Double): Double {
        return priceAfterTax + (priceAfterTax * tipPercentage)
    }
    val priceWithTip = applyTip(priceAfterTax, tipPercentage)

    fun applyDiscount(priceWithTip: Double, discount: Double) : Double {
        return priceWithTip - discount
    }
    return applyDiscount(priceWithTip, discount)
}
