fun calculateTotalMealCost(baseCost: Double, taxRate: Double,
                           tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(baseCost: Double): Double {
        var res = baseCost
        res += baseCost * taxRate
        return res
    }
    fun applyTip(baseCost: Double): Double {
        var res = baseCost
        res += res * tipPercentage
        return res
    }
    fun applyDiscount(baseCost: Double): Double {
        return baseCost - discount
    }
    val res = applyDiscount(applyTip(applyTax(baseCost)))
    return res
}
