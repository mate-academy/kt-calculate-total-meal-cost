fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(cost: Double): Double {
        return cost * (1 + taxRate)
    }

    fun applyTip(costAfterTax: Double): Double {
        return costAfterTax * (1 + tipPercentage)
    }

    fun applyDiscount(finalCost : Double): Double {
        return finalCost - discount
    }

    val costAfterTax = applyTax(baseCost)
    val costAfterTip = applyTip(costAfterTax)
    val finalCost = if (discount > 0.0) {
        applyDiscount(costAfterTip)
    } else {
        costAfterTip
    }
    return finalCost
}
