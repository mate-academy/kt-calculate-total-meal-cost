fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(cost: Double): Double {
        return cost + (taxRate * cost)
    }

    fun applyTip(cost: Double): Double {
        return cost + (tipPercentage * cost)
    }

    fun applyDiscount(cost: Double, discount: Double): Double {
        return if (discount > 0) cost - discount else cost
    }

    val costWithTax = applyTax(baseCost)
    val costWithTip = applyTip(costWithTax)
    return applyDiscount(costWithTip, discount)
}
