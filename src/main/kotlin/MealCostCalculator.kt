fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {
    fun applyTax(cost: Double): Double {
        return cost * (1 + taxRate)
    }

    fun applyTip(cost: Double): Double {
        return cost * (1 + tipPercentage)
    }

    fun applyDiscount(cost: Double): Double {
        return if (discount > 0) cost - discount else cost
    }

    val costAfterTax = applyTax(baseCost)
    val costAfterTip = applyTip(costAfterTax)
    val finalCost = applyDiscount(costAfterTip)

    return finalCost
}