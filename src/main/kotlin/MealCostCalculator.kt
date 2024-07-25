const val DEFAULT_DISCOUNT = 0.0
const val TEN_PERCENT = 0.1
const val FIFTEEN_PERCENT = 0.15

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = DEFAULT_DISCOUNT): Double {
    fun applyTax(cost: Double): Double {
        return cost + (cost * taxRate)
    }

    fun applyTip(cost: Double): Double {
        return cost + (cost * tipPercentage)
    }

    fun applyDiscount(cost: Double): Double {
        return if (discount > 0) {
            cost - discount
        } else {
            cost
        }
    }

    val costWithTax = applyTax(baseCost)
    val costWithTip = applyTip(costWithTax)
    val totalCost = applyDiscount(costWithTip)

    return totalCost
}

fun main() {
    val BASE_COST = 100.0
    val TAX_RATE = TEN_PERCENT
    val TIP_PERCENTAGE = FIFTEEN_PERCENT
    val DISCOUNT = 10.0

    val totalMealCost = calculateTotalMealCost(BASE_COST, TAX_RATE, TIP_PERCENTAGE, DISCOUNT)
    println("Total meal cost: $totalMealCost")
}