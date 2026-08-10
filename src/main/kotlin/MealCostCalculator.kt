// create a function and implement it

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(base: Double, tax: Double): Double {
        return base + base * tax
    }

    fun applyTip(sum: Double, tip: Double): Double {
        return sum + sum * tip
    }

    fun applyDiscount(sum: Double, discount: Double): Double {
        return sum - discount
    }

    val costWithTax = applyTax(baseCost, taxRate)
    val costWithTip = applyTip(costWithTax, tipPercentage)
    return applyDiscount(costWithTip, discount)
}
