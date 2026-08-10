// create a function and implement it
fun calculateTotalMealCost(baseCost: Double,
                           taxRate: Double,
                           tipPercentage: Double,
                           discount: Double = 0.0): Double {
    fun applyTax(): Double {
        return (baseCost * taxRate) + baseCost
    }

    fun applyTip(): Double {
        val baseCostAndTax = applyTax()
        return (baseCostAndTax * tipPercentage) + baseCostAndTax
    }

    fun applyDiscount(): Double {
        val totalCost = applyTip()
        return totalCost - discount
    }

    return applyDiscount()
}
