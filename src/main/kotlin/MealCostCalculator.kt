fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(cost: Double, taxRate: Double): Double {
        return cost + (cost * taxRate)
    }

    fun applyTip(cost: Double, tipPercentage: Double): Double {
        return cost + (cost * tipPercentage)
    }

    fun applyDiscount(cost: Double, discount: Double): Double {
        return if (discount > 0) {
            cost - discount
        } else {
            cost
        }
    }

    val costWithTax = applyTax(baseCost, taxRate)
    val costWithTip = applyTip(costWithTax, tipPercentage)
    val totalCost = applyDiscount(costWithTip, discount)

    return totalCost
}

fun main() {
    val baseCost = 100.0
    val taxRate = 0.1
    val tipPercentage = 0.15
    val discount = 10.0

    val totalMealCost = calculateTotalMealCost(baseCost, taxRate, tipPercentage, discount)
    println("Total meal cost: $totalMealCost")
}
