fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {
    fun applyTax(cost: Double, rate: Double): Double {
        return cost + (cost * rate)
    }

    fun applyTip(costWithTax: Double, percentage: Double): Double {
        return costWithTax + (costWithTax * percentage)
    }

    fun applyDiscount(totalCost: Double, discountAmount: Double): Double {
        return totalCost - discountAmount
    }


    return applyDiscount(
        applyTip(
            applyTax(baseCost, taxRate),
            tipPercentage
        ),
        discount
    );
}
