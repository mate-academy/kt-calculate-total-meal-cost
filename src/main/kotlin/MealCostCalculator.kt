
fun calculateTotalMealCost(baseCost: Double,
                           taxRate: Double,
                           tipPercentage: Double,
                           discount: Double) : Double {
    var totalCost: Double = 0.0

    fun applyTax(mealCost: Double,
                 taxRate: Double) : Double {
        return baseCost.plus(baseCost.times(taxRate))
    }

    fun applyTip(mealCost: Double, tipPercentage: Double): Double {
        return mealCost.plus(mealCost.times(tipPercentage))
    }


    fun applyDiscount(mealCost: Double, discount: Double): Double {
        return mealCost.minus(discount)
    }

    totalCost = applyTax(baseCost, taxRate)
    totalCost = applyTip(totalCost, tipPercentage)
    if (discount > 0) {
        totalCost = applyDiscount(totalCost, discount)
    }
    return totalCost
}

fun calculateTotalMealCost(baseCost: Double,
                           taxRate: Double,
                           tipPercentage: Double) : Double {
    var totalCost: Double = 0.0

    fun applyTax(mealCost: Double,
                 taxRate: Double) : Double {
        return mealCost.plus(mealCost.times(taxRate))
    }

    fun applyTip(mealCost: Double, tipPercentage: Double): Double {
        return mealCost.plus(mealCost.times(tipPercentage))
    }

    fun applyDiscount(mealCost: Double, discount: Double): Double {
        return mealCost.minus(discount)
    }

    totalCost = applyTax(baseCost, taxRate)
    totalCost = applyTip(totalCost, tipPercentage)

    return totalCost
}

