// create a function and implement it

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    var price: Double = baseCost

    fun applyTax() {
        price += price * taxRate
    }

    fun applyTip() {
        price += price * tipPercentage
    }

    fun applyDiscount() {
        price -= discount
    }

    applyTax()
    applyTip()
    applyDiscount()

    return price;
}
