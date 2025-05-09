private const val DEFAULT_DISCOUNT = 0.0
fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = DEFAULT_DISCOUNT
): Double {
    fun applyTax(cost: Double): Double {
        return cost + (cost * taxRate)
    }
    fun applyTip(cost: Double): Double {
        return cost + (cost * tipPercentage)

    }
    fun applyDiscount(cost: Double): Double {
        if (discount > DEFAULT_DISCOUNT) {
            return cost - discount
        } else {
            return cost
        }
    }
    var totalCost = baseCost
    totalCost = applyTax(totalCost)
    totalCost = applyTip(totalCost)
    totalCost = applyDiscount(totalCost)

    return totalCost
}
