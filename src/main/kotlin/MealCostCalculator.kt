// create a function and implement it
import kotlin.math.round

const val BASE_COST = 100.0 // The base cost of the meal
const val TAX_RATE = 0.1 // 10% tax rate
const val TIP_PERCENTAGE = 0.15 // 15% tip
const val DISCOUNT = 10.0 // $10 discount (can be 0.0 if no discount)

fun main() {
    val totalMealCost = calculateTotalMealCost(BASE_COST, TAX_RATE, TIP_PERCENTAGE, DISCOUNT)
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
