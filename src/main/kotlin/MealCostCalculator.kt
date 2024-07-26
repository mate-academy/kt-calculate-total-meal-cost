// create a function and implement it
fun main() {
    val baseCost = 100.0
    val taxRate = 0.1 // 10%
    val tipPercentage = 0.15 // 15%
    val discount = 10.0 // $10 discount for special occasions

    val totalMealCost = calculateTotalMealCost(baseCost, taxRate, tipPercentage, discount)
    println("Total meal cost: $totalMealCost")
}

fun calculateTotalMealCost(baseCost : Double, taxRate : Double, tipPercentage : Double, discount : Double = 0.0) : Double {
    fun applyTax(baseCost : Double, taxRate : Double) = baseCost * (1 + taxRate)
    fun tipPercentage(baseCost : Double, tipPercentage : Double) = baseCost * (1 + tipPercentage)
    fun applyDiscount(baseCost : Double, discount : Double) = baseCost - discount

    var totalSum: Double = applyTax(baseCost, taxRate)
    totalSum = tipPercentage(totalSum, tipPercentage)
    totalSum = applyDiscount(totalSum, discount)

    return totalSum
}