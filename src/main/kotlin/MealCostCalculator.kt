fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {

    fun applyTax(cost: Double, taxRate: Double): Double {
        return cost * (1 + taxRate)
    }

    fun applyTip(cost: Double, tipPercentage: Double): Double {
        return cost * (1 + tipPercentage)
    }

    fun applyDiscount(cost: Double, discount: Double): Double {
        return cost - discount
    }

    val costWithTax = applyTax(baseCost, taxRate)
    val costWithTip = applyTip(costWithTax, tipPercentage)
    val totalCost = applyDiscount(costWithTip, discount)

    return totalCost
}
