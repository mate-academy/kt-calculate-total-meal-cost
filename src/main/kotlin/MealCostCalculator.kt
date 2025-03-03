// create a function and implement it

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Any {
    var totalSum = baseCost
    fun applyTax(): Double {
        totalSum += baseCost * taxRate
        return totalSum
    }
    fun applyTip(): Double {
        totalSum += totalSum * tipPercentage
        return totalSum
    }
    fun applyDiscount(): Double {
        totalSum -= discount
        return totalSum
    }
    totalSum = applyTax()
    println(totalSum)
    totalSum = applyTip()
    println(totalSum)
    totalSum = applyDiscount()
    println(totalSum)
    return totalSum
}
