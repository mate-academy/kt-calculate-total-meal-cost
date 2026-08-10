// create a function and implement it
const val BASE_COST = 348.0
const val TAX_RATE = 0.1
const val TIP_PERCENTAGE = 0.1
const val DISCOUNT = 10.0

fun calculateTotalMealCost (baseCost :Double, taxRate :Double, tipPercentage :Double, discount :Double = 0.0): Double {
    fun applyTax(cost: Double): Double {
        return cost + (cost*taxRate)
    }
    fun applyTip(cost: Double): Double {
        return  cost + (cost*tipPercentage)
    }
    fun applyDiscount(cost: Double): Double {
        return if (discount > 0.0) cost - discount else cost
    }
    var totalCost = baseCost
    totalCost = applyTax(totalCost)
    totalCost = applyTip(totalCost)
    totalCost = applyDiscount(totalCost)
    return totalCost
}
fun main() {
    val totalMealCost = calculateTotalMealCost(BASE_COST, TAX_RATE, TIP_PERCENTAGE, DISCOUNT)
    println("Total meal cost: $totalMealCost")
}
