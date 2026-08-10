fun calculateTotalMealCost(baseCost :Double, taxRate :Double, tipPercentage :Double, discount :Double = 0.0) :Double {
    fun applyTax(value :Double) :Double {
        return value + value * taxRate
    }

    fun applyTip(value :Double) :Double {
        return value + value * tipPercentage
    }

    fun applyDiscount(value :Double) :Double {
        return value - discount
    }

    var totalMealCost = applyTax(baseCost)
    totalMealCost = applyTip(totalMealCost)
    totalMealCost = applyDiscount(totalMealCost)

    return totalMealCost
}
