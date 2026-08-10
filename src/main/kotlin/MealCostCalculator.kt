// create a function and implement it

fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0): Double {
    fun applyTax(cost: Double): Double {
        return cost + (cost * taxRate)
    }

    fun applyTip(cost: Double): Double {
        return cost + (cost * tipPercentage)
    }

    fun applyDiscount(cost: Double): Double {
        return if (discount > 0.0) cost - discount else cost
    }

    val costAfterTax = applyTax(baseCost)
    val costAfterTip = applyTip(costAfterTax)
    return applyDiscount(costAfterTip)
}
