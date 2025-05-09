// create a function and implement it
const val ZERO = 0.0
 fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = ZERO): Double {
     var result = baseCost
     fun applyTax(tax: Double) {
         result += (result * tax)
     }

    fun applyTip(tip: Double) {
        result += (result * tip)
    }

    fun applyDiscount(discount: Double) {
        result -= discount
    }

    applyTax(taxRate)
    applyTip(tipPercentage)

    if (discount > ZERO) {
        applyDiscount(discount)
    }

    return result
 }
