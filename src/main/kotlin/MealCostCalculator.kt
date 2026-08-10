// create a function and implement it
fun calculateTotalMealCost(baseCost: Double, taxRate: Double,
                           tipPercentage: Double, discount: Double = 0.0): Double {
    var totalMealCost: Double = baseCost

    fun applyTax(currentMealCost: Double, taxRate: Double): Double {
        return currentMealCost + (currentMealCost * taxRate)
    }

    fun applyTip(currentMealCost: Double, tipPercentage: Double): Double {
         return currentMealCost + (currentMealCost * tipPercentage)
    }

    fun applyDiscount(currentMealCost: Double, discount: Double): Double {
        return currentMealCost - discount
    }

    totalMealCost = applyTax(totalMealCost, taxRate)
    totalMealCost = applyTip(totalMealCost, tipPercentage)
    if (discount != 0.0) {
        totalMealCost = applyDiscount(totalMealCost, discount)
    }

    return totalMealCost
}
