const val ZERO_DISCOUNT = 0.0


fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double?): Double {
    fun applyTax(baseCost: Double, taxRate: Double): Double {
        return baseCost + baseCost * taxRate
    }

    fun applyTip(cost: Double, tipPercentage: Double): Double {
        return cost * tipPercentage + cost
    }

    fun applyDiscount(cost: Double, discount: Double?): Double {
        val finalDiscount = discount ?: ZERO_DISCOUNT
        return cost - cost * finalDiscount

    }

    var result = applyTax(baseCost, taxRate)
    result = applyTip(result, tipPercentage)
    result = applyDiscount(result, discount)
    return result
}
