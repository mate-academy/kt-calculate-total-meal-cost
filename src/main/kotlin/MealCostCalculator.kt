// create a function and implement it
fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0) : Double {

    fun applyTax(): Double {
        return baseCost + baseCost * taxRate
    }

    fun applyTip(): Double {
        val costAfterTax = applyTax()
        return  costAfterTax + costAfterTax * tipPercentage
    }

    fun applyDiscount() : Double {
        return applyTip() - discount
    }

    return applyDiscount()
}
