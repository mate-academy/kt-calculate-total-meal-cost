const val ONE = 1.0

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount:
        Double = 0.0) : Double {

    fun applyTax(baseValue: Double, taxRate: Double) : Double {
        return baseValue * (ONE + taxRate)
    }

    fun applyTip(baseValue: Double, tipPercentage : Double) : Double {
        return baseValue * (ONE + tipPercentage)
    }

    fun applyDiscount(baseValue: Double, discount : Double) : Double {
        return baseValue - discount
    }

    var totalCost = applyTax(baseCost, taxRate)
    totalCost = applyTip(totalCost, tipPercentage)
    totalCost = applyDiscount(totalCost, discount)

    return totalCost
}
