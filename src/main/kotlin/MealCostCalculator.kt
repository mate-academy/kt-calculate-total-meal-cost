// create a function and implement it

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double{

    fun applyTax(cost: Double): Double {
        return cost + (cost * taxRate)
    }

    fun applyTip(costWithTax: Double): Double {
        return costWithTax + (costWithTax * tipPercentage)
    }

    fun applyDiscount(totalCost: Double): Double {
        return if (discount > 0.0) totalCost - discount else totalCost
    }

    val costWithTax = applyTax(baseCost)
    val costWithTip = applyTip(costWithTax)
    val finalCost = applyDiscount(costWithTip)
    return finalCost
}
