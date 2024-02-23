private const val DEFAULT_DISCOUNT = 0.0

fun calculateTotalMealCost(baseCost: Double,
                           taxRate: Double,
                           tipPercentage: Double,
                           discount: Double = DEFAULT_DISCOUNT) : Double {

    fun applyTax(baseCost: Double, taxRate: Double): Double {
        return baseCost + baseCost * taxRate
    }

    fun applyTip(costWithTax: Double, tipPercentage: Double): Double {
        return costWithTax + costWithTax * tipPercentage
    }

    fun applyDiscount(costWithTaxTips: Double, discount: Double): Double {
        return costWithTaxTips - discount
    }

    return applyDiscount(applyTip(applyTax(baseCost, taxRate), tipPercentage), discount)
}
