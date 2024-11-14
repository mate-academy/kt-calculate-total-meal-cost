// create a function and implement it
fun calculateTotalMealCost(baseCost: Double, taxRate: Double,
                           tipPercentage: Double, discount: Double = 0.00) : Double {
    fun applyTax(price: Double) = price.plus(price.times(taxRate))

    fun applyTip(price: Double) = price.plus(price.times(tipPercentage))

    fun applyDiscount(price: Double) = if (discount > 0.00) price.minus(discount) else price

    return applyDiscount(applyTip(applyTax(baseCost)))
}
