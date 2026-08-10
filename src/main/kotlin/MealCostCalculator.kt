// create a function and implement it

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {

    fun applyTax(baseCost: Double): Double {
        return baseCost + baseCost * taxRate
    }

    fun applyTip(costAfterTax: Double): Double {
        return costAfterTax + costAfterTax * tipPercentage
    }

    fun applyDiscount(costAfterTaxAndTip: Double): Double {
        return costAfterTaxAndTip - discount
    }


    return applyDiscount(applyTip(applyTax(baseCost)))
}
