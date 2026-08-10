fun calculateTotalMealCost(baseCost: Double, taxRate: Double,
                           tipPercentage: Double, discount: Double = 0.0): Double {

    fun applyTax(baseCost: Double, taxRate: Double) : Double {
        return baseCost + baseCost * taxRate
    }

    fun applyTip(baseCost: Double, taxRate: Double, tipPercentage: Double): Double {
        val applyTax = applyTax(baseCost, taxRate)
        return applyTax * tipPercentage
    }

    fun applyDiscount(baseCost: Double, taxRate: Double,
                      tipPercentage: Double, discount: Double): Double {
        val applyTip = applyTip(baseCost, taxRate, tipPercentage)

        return applyTip - discount
    }

    return applyTax(baseCost, taxRate) + applyDiscount(baseCost, taxRate, tipPercentage, discount)
}
