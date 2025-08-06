fun main() {
    val baseCost = 100.0
    val taxRate = 0.1 // 10%
    val tipPercentage = 0.15 // 15%
    val discount = 10.0 // $10 discount for special occasions

    val totalMealCost = calculateTotalMealCost(baseCost, taxRate, tipPercentage, discount)
    println("Total meal cost: $totalMealCost")
}

fun calculateTotalMealCost(cost: Double, tax: Double, tip: Double, discount: Double = 0.0): Double {
    var total = cost
    fun applyTax() {
        total += (total * tax)
    }

    fun applyTip() {
        total += (total * tip)
    }

    fun applyDiscount() {
        total -= discount
    }

    applyTax()
    applyTip()
    applyDiscount()
    return total
}