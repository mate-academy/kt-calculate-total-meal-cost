fun calculateTotalMealCost(baseCost: Double, taxRate: Double,
                           tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(cost: Double): Double {
        return cost + cost * taxRate
    }

    fun applyTip(cost: Double): Double {
        return cost + cost * tipPercentage
    }

    fun applyDiscount(cost: Double): Double {
        return cost - discount
    }

    var totalCost = baseCost
    totalCost = applyTax(totalCost)
    totalCost = applyTip(totalCost)

    if (discount > 0.0) {
        totalCost = applyDiscount(totalCost)
    }
    return totalCost
}
