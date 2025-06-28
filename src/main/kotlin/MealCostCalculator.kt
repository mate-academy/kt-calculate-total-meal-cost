fun calculateTotalMealCost(baseCost: Double, taxRate: Double = 0.1,
                           tipPercentage: Double = 0.15, discount: Double = 0.0): Double {
    fun applyTax(cost: Double): Double {
        return cost + cost * taxRate
    }

    fun applyTip(cost: Double): Double {
        return cost + cost * tipPercentage
    }

    fun applyDiscount(cost: Double): Double {
        return cost - discount
    }

    val withTax = applyTax(baseCost)
    val withTip = applyTip(withTax)
    val finalCost = applyDiscount(withTip)

    return finalCost
}
const val BASEMEALCOST = 100.0
fun main() {
    val totalMealCost = calculateTotalMealCost(BASEMEALCOST,
        taxRate = 0.08, tipPercentage = 0.18, discount = 5.0)
    println("Total meal cost: $totalMealCost")
}
