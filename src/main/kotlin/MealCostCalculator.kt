fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount:Double = 0.0): Double {
    fun applyTax(): Double {
        return baseCost + (baseCost * taxRate)
    }
    fun applyTip(): Double {
        return applyTax() + (applyTax() * tipPercentage)
    }
    fun applyDiscount(): Double {
        return applyTip() - discount
    }
    return applyDiscount()
}
