// create a function and implement it
fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {

    fun applyTax(baseCost: Double, taxRate: Double): Double {
        return baseCost + baseCost * taxRate
    }

    fun applyTip(totalCost: Double, tipPercentage: Double): Double {
        return totalCost + totalCost * tipPercentage
    }

    fun applyDiscount(generalCost: Double, discount: Double): Double {
        return  generalCost - discount
    }
    return applyDiscount(applyTip(applyTax(baseCost, taxRate), tipPercentage), discount)
}
