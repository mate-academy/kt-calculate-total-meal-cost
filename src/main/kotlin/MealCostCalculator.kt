fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(baseCost: Double, taxRate: Double): Double {
        return baseCost + baseCost * taxRate
    }

    fun applyTip(baseCost: Double, tipPercentage: Double): Double {
        return baseCost + baseCost * tipPercentage
    }

    fun applyDiscount(baseCost: Double, discount: Double): Double {
        return baseCost -  discount
    }

    return applyDiscount(applyTip(applyTax(baseCost, taxRate), tipPercentage), discount)
}
