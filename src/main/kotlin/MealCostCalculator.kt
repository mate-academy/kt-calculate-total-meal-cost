// create a function and implement it
const val ZERO = 0.0

fun calculateTotalMealCost(baseCost:Double,
                           taxRate:Double,
                           tipPercent:Double,
                           discount:Double = ZERO) : Double {
    fun applyTax() : Double {
        return baseCost * taxRate + baseCost
    }
    fun applyTip(sum:Double):Double {
        return sum * tipPercent + sum
    }
    fun applyDiscount(sum:Double):Double {
        return sum - discount
    }
    return applyDiscount(applyTip(applyTax()))
}
