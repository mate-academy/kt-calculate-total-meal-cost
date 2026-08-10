fun main() {
    val baseCost = BASE_COST
    val taxRate = TAX_RATE
    val tipPercentage = TIP_PERCENTAGE
    val discount = DISCOUNT_AMOUNT

    val totalMealCost = calculateTotalMealCost(baseCost, taxRate, tipPercentage, discount)
    println("Total meal cost: $totalMealCost")
}
const val BASE_COST = 100.0
const val TAX_RATE = 0.10
const val TIP_PERCENTAGE = 0.15
const val DISCOUNT_AMOUNT = 10.0
const val ZERO: Double = 0.0

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {

    fun applyTax(baseCost: Double, taxRate: Double): Boolean {
        return baseCost > ZERO && taxRate > ZERO
    }

    fun applyTip(tipPercentage: Double): Boolean {
        return tipPercentage > ZERO
    }

    fun applyDiscount(discount: Double): Boolean {
        return discount >= ZERO
    }

    if (!applyTax(baseCost, taxRate) && !applyTip(tipPercentage) && !applyDiscount(discount)) {
        return ZERO
    }

    return baseCost
        .plus(baseCost.times(taxRate))
        .plus(baseCost.plus(baseCost.times(taxRate)).times(tipPercentage))
        .minus(discount)
}
