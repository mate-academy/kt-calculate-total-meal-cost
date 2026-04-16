private const val BASE = 100.0

private const val TAX_RATE = 0.1

private const val TIPS = 0.15

private const val DISCOUNT = 10.0

// create a function and implement it
fun main() {
    val baseCost = BASE
    val taxRate = TAX_RATE // 10%
    val tipPercentage = TIPS // 15%
    val discount = DISCOUNT // $10 discount for special occasions

    val totalMealCost = calculateTotalMealCost(baseCost, taxRate, tipPercentage, discount)
    println("Total meal cost: $totalMealCost")
}

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(): Double {
        return baseCost * (1 + taxRate)
    }

    fun applyTip(): Double {
        return applyTax() * (1 + tipPercentage)
    }

    fun applyDiscount(): Double {
        return applyTip() - discount
    }

    return applyDiscount()
}
