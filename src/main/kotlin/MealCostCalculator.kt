// create a function and implement it

fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {
    var totalCost = baseCost

    fun applyTax(): Double {
        totalCost += totalCost * taxRate
        return totalCost
    }

    fun applyTip(): Double {
        totalCost += totalCost * tipPercentage
        return totalCost
    }

    fun applyDiscount(): Double {
        if (discount > 0.0) {
            totalCost -= discount
        }
        return totalCost
    }

    applyTax()
    applyTip()
    applyDiscount()

    return totalCost
}
