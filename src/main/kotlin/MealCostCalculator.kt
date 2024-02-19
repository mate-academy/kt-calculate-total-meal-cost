// create a function and implement it
const val DEFAULT_DISCOUNT = 0.0

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double,
                           discount: Double = DEFAULT_DISCOUNT): Double {
    var totalMealCost: Double

    fun applyTax(mealCost: Double, taxRate: Double): Double {
        return mealCost + (mealCost * taxRate)
    }

    totalMealCost = applyTax(baseCost, taxRate)

    fun applyTip(mealCost: Double, tipPercentage: Double): Double {
        return mealCost + (mealCost * tipPercentage)
    }

    totalMealCost = applyTip(totalMealCost, tipPercentage)

    fun applyDiscount(mealCost: Double, discount: Double): Double {
        return mealCost - discount
    }

    totalMealCost = applyDiscount(totalMealCost, discount)

    return totalMealCost
}
