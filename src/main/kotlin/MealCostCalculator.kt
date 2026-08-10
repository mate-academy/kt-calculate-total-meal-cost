// create a function and implement it

const val DEFAULT_BASE_COST = 100.0
const val DEFAULT_TAX_RATE = 0.1
const val DEFAULT_TIP_PERCENTAGE = 0.15
const val DEFAULT_DISCOUNT = 10.0

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double,
                           discount: Double = 0.0): Double {

    fun applyTax(cost: Double): Double {
        return cost + (cost * taxRate)
    }


    fun applyTip(cost: Double): Double {
        return cost + (cost * tipPercentage)
    }

    fun applyDiscount(cost: Double): Double {
        return if (discount > 0.0) cost - discount else cost
    }

    val costAfterTax = applyTax(baseCost)
    val costAfterTip = applyTip(costAfterTax)
    val totalCost = applyDiscount(costAfterTip)

    return totalCost
}

fun main() {
    val baseCost = DEFAULT_BASE_COST
    val taxRate = DEFAULT_TAX_RATE
    val tipPercentage = DEFAULT_TIP_PERCENTAGE
    val discount = DEFAULT_DISCOUNT

    val totalMealCost = calculateTotalMealCost(baseCost, taxRate, tipPercentage, discount)
    println("Загальна вартість страви: $totalMealCost")
}
