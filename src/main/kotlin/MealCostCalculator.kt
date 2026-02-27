const val ZERODISCOUNT = 0.0

fun calculateTotalMealCost(baseCost: Double,
                           taxRate: Double,
                           tipPercentage: Double,
                           discount: Double = ZERODISCOUNT) : Double {

    fun applyTax(baseCost: Double, taxRate: Double): Double {
        return baseCost + (baseCost * taxRate)
    }

    fun applyTip(costAfterTax: Double, tipPercentage: Double): Double {
        return costAfterTax + (costAfterTax * tipPercentage)
    }

    fun applyDiscount(costAfterTip: Double, discount: Double): Double {
        return costAfterTip - discount
    }

    val costAfterTip = applyTip(applyTax(baseCost, taxRate), tipPercentage)

    if(discount > ZERODISCOUNT) {
        return applyDiscount(costAfterTip, discount)
    }

    return costAfterTip
}
