fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {

    fun applyTax(amount: Double): Double {
        return amount + (amount * taxRate)
    }

    fun applyTip(amount: Double): Double {
        return amount + (amount * tipPercentage)
    }

    fun applyDiscount(amount: Double): Double {
        return if (discount > 0.0) amount - discount else amount
    }

    val tax = applyTax(baseCost)
    val tip = applyTip(tax)
    return applyDiscount(tip)
}
