// create a function and implement it
fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {
    fun applyTax(): Double {
        return baseCost + (baseCost * taxRate)
    }

    fun applyTip(costAfterTax: Double): Double {
        return costAfterTax + (costAfterTax * tipPercentage)
    }

    fun applyDiscount(cost: Double, discount: Double): Double {
        return cost - discount
    }
    return applyDiscount(applyTip(applyTax()), discount)
}
