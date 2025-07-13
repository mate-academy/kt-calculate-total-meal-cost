const val BASECOST = 100.0
const val TAXRATE = 0.1
const val TIP_PERCENTAGE = 1.0
const val DISCOUNT = 10.0

fun main() {
    val baseCost = BASECOST
    val taxRate = TAXRATE
    val tipPercentage = TIP_PERCENTAGE
    val discount = DISCOUNT

    val totalMealCost = calculateTotalMealCost(baseCost, taxRate, tipPercentage, discount)
    println("Total meal cost: $totalMealCost")
}

fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {

    fun applyTax(cost: Double): Double {
        return cost + (cost * taxRate)
    }

    fun applyTip(cost: Double): Double {
        return cost + (cost * tipPercentage)
    }

    fun applyDiscount(totalCost: Double): Double {
        return if (discount > 0.0) totalCost - discount else totalCost
    }

    val costAfterTax = applyTax(baseCost)
    val costAfterTip = applyTip(costAfterTax)
    val finalCost = applyDiscount(costAfterTip)

    return finalCost
}
