// create a function and implement it
fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax() : Double {
        return baseCost * taxRate
    }

    fun applyTip(afterTax: Double): Double {
        return afterTax * tipPercentage
    }

    fun applyDiscount(afterTip: Double) : Double {
        return afterTip - discount
    }

    val afterTax: Double = baseCost + applyTax()
    val afterTip: Double = afterTax + applyTip(afterTax)
    val afterDiscount: Double = applyDiscount(afterTip)

    return afterDiscount
}
