// create a function and implement it
fun calculateTotalMealCost(price : Double, tax : Double,
                           tip : Double, discount : Double = 0.0
) : Double {
    fun applyTax(price : Double, tax : Double) : Double {
        return price * (1 + tax)
    }
    fun applyTip(taxedPrice : Double, tip : Double) : Double {
        return taxedPrice * (1 + tip)
    }
    fun applyDiscount(calculatedPrice : Double, discount : Double) : Double {
        return if (discount > 0.0) calculatedPrice - discount else calculatedPrice
    }
    val taxed = applyTax(price, tax)
    val tipped = applyTip(taxed, tip)
    val calculatedPrice = applyDiscount(tipped, discount)
    return calculatedPrice
}
