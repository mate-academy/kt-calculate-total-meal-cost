private const val FULL_RATE = 100.0
private const val ZERO_COST = 0.0
private const val TAX_RATE = 0.1
private const val TIP_PRECENTAGEP = 0.15
private const val DISCOUNT = 10.0
private const val BASE_COST2 = 50.0
private const val TAX_RATE2 = 0.05
private const val TIP_PRECENTAGE2 = 0.2
fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = ZERO_COST
): Double {

    fun applyTax(cost: Double, taxRate: Double) = cost + cost * taxRate
    fun applyTip(cost: Double, percentage: Double) = cost + cost * percentage
    fun applyDiscount(cost: Double, discount: Double) = cost - discount

    val costWithTax = applyTax(baseCost, taxRate)

    val costWithTaxAndTip = applyTip(costWithTax, tipPercentage)

    val costWithDiscount = applyDiscount(costWithTaxAndTip, discount)

    return costWithDiscount
}

fun main() {
    val baseCost = FULL_RATE
    val taxRate = TAX_RATE // 10%
    val tipPercentage = TIP_PRECENTAGEP // 15%
    val discount = DISCOUNT // $10 знижка для особливих випадків

    val totalMealCost = calculateTotalMealCost(baseCost, taxRate, tipPercentage, discount)
    println("Total meal cost: $totalMealCost") // Очікуваний результат: 116.5

    // Приклад без знижки (використовується значення за замовчуванням)
    val baseCost2 = BASE_COST2
    val taxRate2 = TAX_RATE2 // 5%
    val tipPercentage2 = TIP_PRECENTAGE2 // 20%

    val totalMealCostNoDiscount = calculateTotalMealCost(baseCost2, taxRate2, tipPercentage2)
    println("Total meal cost (no discount): $totalMealCostNoDiscount") // Очікуваний результат: 63.0

}
