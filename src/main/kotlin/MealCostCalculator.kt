// create a function and implement it

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {

    fun applyTax(cost: Double): Double {
        return cost + (cost * taxRate)
    }

    fun applyTip(costAfterTax: Double): Double{
        return costAfterTax + (costAfterTax * tipPercentage)
    }

    fun applyDiscount(costAfterTip: Double): Double{
        return if (discount > 0.0) costAfterTip - discount else costAfterTip
    }

    val costAfterTax = applyTax(baseCost)
    val costAfterTip = applyTip(costAfterTax)
    val finalCost = applyDiscount(costAfterTip)

    return finalCost
}

fun main() {
    val baseCost = 100.0
    val taxRate = 0.1
    val tipPercentage = 0.15
    val discount = 10.0

    val totalMealCost = calculateTotalMealCost(baseCost, taxRate, tipPercentage, discount)
    println("Total meal cost: $totalMealCost")
}
