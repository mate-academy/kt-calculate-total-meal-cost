// create a function and implement it
fun calculateTotalMealCost(baseCost: Double, taxRate: Double,
                           tipPercentage: Double = 0.15, discount: Double = 0.0): Double {
    fun applyTax () : Double {
        return baseCost * taxRate
    }

    fun applyTip () : Double {
        return (baseCost + applyTax()) * tipPercentage
    }

    fun applyDiscount () : Double {
        return discount
    }

    return baseCost + applyTax() + applyTip() - applyDiscount()
}
