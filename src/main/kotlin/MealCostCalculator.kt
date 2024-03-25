fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {
    fun applyTax(cost: Double): Double {
        return cost * (1 + taxRate)
    }

    fun applyTip(costAfterTax: Double): Double {
        return costAfterTax * (1 + tipPercentage)
    }

    fun applyDiscount(costAfterTaxAndTip: Double): Double {
        return costAfterTaxAndTip - discount
    }

    val costAfterTax = applyTax(baseCost)
    val costAfterTaxAndTip = applyTip(costAfterTax)
    val totalCost = if (discount > 0) {
        applyDiscount(costAfterTaxAndTip)
    } else {
        costAfterTaxAndTip
    }

    return totalCost
}
