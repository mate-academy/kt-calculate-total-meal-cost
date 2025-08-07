// create a function and implement it
fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(baseCost: Double, taxRate: Double): Double {
        return baseCost * taxRate + baseCost
    }

    fun applyTip(baseCost: Double, tipPercentage: Double): Double {
        return baseCost * tipPercentage + baseCost
    }

    fun applyDiscount(baseCost: Double, discount: Double): Double {
        return baseCost - discount
    }

    return applyDiscount(applyTip(applyTax(baseCost, taxRate), tipPercentage), discount)
}
