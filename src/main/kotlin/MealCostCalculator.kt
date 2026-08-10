// create a function and implement it
fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {
    var totalCost = baseCost

    fun applyTax(): Double {
        totalCost += baseCost * taxRate
        return totalCost
    }

    fun applyTip(): Double {
        totalCost += totalCost * tipPercentage
        return totalCost
    }

    val applyDiscount: (Double) -> Unit = {
        if (discount > 0) totalCost -= discount
    }

    applyTax()
    applyTip()
    applyDiscount(discount)

    return totalCost
}
