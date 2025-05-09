fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {

    fun applyTax(baseCost: Double, taxRate: Double): Double {
        return baseCost * (1 + taxRate)
    }

    fun applyTip(costAfterTax: Double, tipPercentage: Double): Double {
        return costAfterTax * (1 + tipPercentage)
    }

    fun applyDiscount(totalCost: Double, discount: Double): Double {
        return totalCost - discount
    }

    val costAfterTax = applyTax(baseCost, taxRate)

    val costAfterTip = applyTip(costAfterTax, tipPercentage)

    val finalCost = if (discount > 0) applyDiscount(costAfterTip, discount) else costAfterTip

    return finalCost
}
