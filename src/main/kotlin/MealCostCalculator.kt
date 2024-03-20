import java.util.Base64

// create a function and implement it
fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {
    var totalAmount = baseCost

    fun applyTax(): Double {
        totalAmount +=totalAmount * taxRate
        return totalAmount;
    }

    fun applyTip(): Double {
        totalAmount += totalAmount * tipPercentage
        return totalAmount;
    }

    fun applyDiscount() {
        totalAmount -= discount
    }
    applyTax()
    applyTip()
    applyDiscount()
    return totalAmount;
}
