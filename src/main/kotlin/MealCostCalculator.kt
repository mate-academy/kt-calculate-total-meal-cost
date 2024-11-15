// create a function and implement it
import kotlin.math.round

fun main() {
    val baseCost = 100.0
    val taxRate = 0.1 // 10%
    val tipPercentage = 0.15 // 15%
    val discount = 10.0 // $10 discount for special occasions

    val totalMealCost = calculateTotalMealCost(baseCost, taxRate, tipPercentage, discount)
    println("Total meal cost: $totalMealCost")
}

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(baseCost: Double, taxRate: Double): Double {
        return baseCost * taxRate
    }

    fun applyTip(costAfterTax: Double, tipPercentage: Double): Double {
        return costAfterTax * tipPercentage
    }

    fun applyDiscount(totalCost: Double, discount: Double): Double {
        return totalCost - discount
    }

    val taxAmount = applyTax(baseCost, taxRate)
    val costAfterTax = baseCost + taxAmount
    val tipAmount = applyTip(costAfterTax, tipPercentage)

    var totalCost = baseCost + taxAmount + tipAmount

    if (discount > 0.0) {
        totalCost = applyDiscount(totalCost, discount)
    }

    return round(totalCost * 100) / 100.0
}
