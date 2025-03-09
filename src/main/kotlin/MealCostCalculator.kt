// create a function and implement it
fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): String {
    fun applyTax(finalCost: Double) = finalCost + (finalCost * taxRate)
    fun applyTip(finalCost: Double) = finalCost + (finalCost * tipPercentage)
    fun applyDiscount(finalCost: Double) = finalCost - discount

    var finalCost = baseCost
    finalCost = applyTax(finalCost)
    finalCost = applyTip(finalCost)
    finalCost = applyDiscount(finalCost)
    return "Total meal cost: $finalCost."
}
