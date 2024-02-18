// create a function and implement it
fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
) : Double {
    fun applyTax() : Double {
        return baseCost + baseCost * taxRate
    }
    var appliedTax = applyTax()
    fun applyTip() : Double {
        return appliedTax + appliedTax * tipPercentage
    }

    var appliedTip = applyTip()
    fun applyDiscount() : Double {
        return appliedTip - discount
    }
    return applyDiscount()
}
