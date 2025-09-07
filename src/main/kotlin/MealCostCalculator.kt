
fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {

    fun applyTax(cost: Double) : Double {
        return cost + cost * taxRate
    }
    fun applyTip(cost: Double) : Double {
        return applyTax(cost) + applyTax(cost) * tipPercentage
    }
    fun applyDiscount(cost: Double) : Double {
        return applyTip(cost) - discount
    }
    return applyDiscount(baseCost)
}
