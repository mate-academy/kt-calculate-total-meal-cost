// create a function and implement it
fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {

    fun applyPercentage(total: Double, percentage: Double): Double {
       return total + total * percentage
    }

    return applyPercentage(applyPercentage(baseCost, taxRate), tipPercentage) - discount
}
