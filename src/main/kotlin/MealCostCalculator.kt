// create a function and implement it
fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(cost: Double, taxRate: Double): Double {
        return cost * (1 + taxRate)
    }

    fun applyTip(cost: Double, tipPercentage: Double): Double {
        return cost * (1 + tipPercentage)
    }

    fun applyDiscount(cost: Double, discount: Double): Double {
        var result = cost - discount
        if (result < 0) {
            result = 0.0
        }
        return result
    }

    var totalCost = applyTax(baseCost, taxRate)
    totalCost = applyTip(totalCost, tipPercentage)
    totalCost = applyDiscount(totalCost, discount)

    return totalCost
}
