const val BASE_COST = 100.0
const val TAX_RATE = 0.1
const val TIP_PERCENTAGE = 0.15
const val DISCOUNT = 10.0
const val DEFAULT_DISCOUNT = 0.0

fun main() {
    val totalMealCost = calculateTotalMealCost(BASE_COST, TAX_RATE, TIP_PERCENTAGE, DISCOUNT)
    println("Total meal cost: $totalMealCost")
}

fun calculateTotalMealCost(
    cost: Double, tax: Double, tip: Double,
    discount: Double = DEFAULT_DISCOUNT
): Double {
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