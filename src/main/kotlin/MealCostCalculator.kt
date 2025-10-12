
fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {

    fun applyTax(cost: Double, rate: Double): Double {
        return cost * (1.0 + rate)
    }

    fun applyTip(costWithTax: Double, percentage: Double): Double {
        return costWithTax * (1.0 + percentage)
    }

    fun applyDiscount(finalCost: Double, discountAmount: Double): Double {
        return if (discountAmount > 0.0) {
            maxOf(0.0, finalCost - discountAmount)
        } else {
            finalCost
        }
    }

    // 1. Застосування податку
    val costWithTax = applyTax(baseCost, taxRate)

    // 2. Застосування чайових до вартості після сплати податків
    val costWithTaxAndTip = applyTip(costWithTax, tipPercentage)

    // 3. Застосування знижки
    val finalCost = applyDiscount(costWithTaxAndTip, discount)

    return finalCost
}

fun main() {
    val baseCost = 100.0
    val taxRate = 0.1 // 10%
    val tipPercentage = 0.15 // 15%
    val discount = 10.0 // $10 знижка для особливих випадків

    val totalMealCost = calculateTotalMealCost(baseCost, taxRate, tipPercentage, discount)
    println("Total meal cost: $totalMealCost") // Очікуваний результат: 116.5

    // Приклад без знижки (використовується значення за замовчуванням)
    val baseCost2 = 50.0
    val taxRate2 = 0.05 // 5%
    val tipPercentage2 = 0.2 // 20%

    val totalMealCostNoDiscount = calculateTotalMealCost(baseCost2, taxRate2, tipPercentage2)
    println("Total meal cost (no discount): $totalMealCostNoDiscount") // Очікуваний результат: 63.0

}
