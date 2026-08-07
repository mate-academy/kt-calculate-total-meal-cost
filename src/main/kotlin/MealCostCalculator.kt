fun main() {
    val baseCost = 100.0
    val taxRate = 0.1 // 10%
    val tipPercentage = 0.15 // 15%
    val discount = 10.0 // $10 discount for special occasions

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
       return cost + cost * taxRate
    }

    fun applyTip(cost: Double): Double {
       return cost + cost * tipPercentage
    }

    fun applyDiscount(cost: Double): Double {
        return cost - discount
    }

    val costWithTax = applyTax(baseCost)
    val costWithTip = applyTip(costWithTax)
    val finalCost = applyDiscount(costWithTip)

    return finalCost
}
