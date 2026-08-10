// create a function and implement it
fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    val tax = baseCost * taxRate
    val tip = (baseCost + tax) * tipPercentage
    return baseCost + tax + tip - discount
}
