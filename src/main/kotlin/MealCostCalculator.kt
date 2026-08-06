import java.math.BigDecimal

// create a function and implement it
fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double  = 0.0
): Double {
    var totalPrice = BigDecimal.valueOf(baseCost)

    fun applyTax(taxRate: Double) {
        totalPrice = totalPrice.multiply(BigDecimal.valueOf(1 + taxRate))
    }

    fun applyTip(tipPercentage: Double) {
        totalPrice = totalPrice
            .add(totalPrice.multiply(BigDecimal.valueOf(tipPercentage)))
    }

    fun applyDiscount(discount: Double) {
        totalPrice = totalPrice.subtract(BigDecimal.valueOf(discount))
    }

    if (taxRate > 0) applyTax(taxRate)
    if (tipPercentage > 0) applyTip(tipPercentage)
    if (discount > 0) applyDiscount(discount)

    return totalPrice.toDouble()
}
