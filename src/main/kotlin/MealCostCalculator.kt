// create a function and implement it
const val BASE_COST = 100.0
const val TAX_RATE = 0.1 // 10%
const val TIP_PERCENTAGE = 0.15 // 15%
const val DISCOUNT = 10.0 // $10 discount for special occasions

fun main() {
    val totalMealCost = calculateTotalMealCost(BASE_COST, TAX_RATE, TIP_PERCENTAGE, DISCOUNT)
    println("Total meal cost: $totalMealCost")
}

fun calculateTotalMealCost(baseCost : Double, taxRate : Double
                           , tipPercentage : Double, discount : Double = 0.0) : Double {
    fun applyTax(baseCost : Double, taxRate : Double) = baseCost * (1 + taxRate)
    fun tipPercentage(baseCost : Double, tipPercentage : Double) = baseCost * (1 + tipPercentage)
    fun applyDiscount(baseCost : Double, discount : Double) = baseCost - discount

    var totalSum: Double = applyTax(baseCost, taxRate)
    totalSum = tipPercentage(totalSum, tipPercentage)
    totalSum = applyDiscount(totalSum, discount)

    return totalSum
}
