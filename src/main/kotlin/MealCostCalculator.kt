//// create a function and implement it
//applyTax that calculates and adds tax to the meal's base cost;
//applyTip that adds a tip based on the cost after tax;
//applyDiscount that applies a discount to the final cost, after tax and tip, if a discount condition is met.

fun calculateTotalMealCost(baseCost: Double, taxRate: Double, tipPercentage: Double, discount: Double = 0.0): Double {
    fun applyTax(baseCost: Double, taxRate: Double): Double {
        val taxValue = baseCost * taxRate
        return baseCost + taxValue
    }

    fun applyTip(costWithTax: Double, tipPercentage: Double): Double {
        val tipValue = costWithTax * tipPercentage
        return costWithTax + tipValue
    }

    fun applyDiscount(costWithTaxAndTip: Double, discount: Double = 0.0): Double {
        return if (discount > 0.0) costWithTaxAndTip - discount else costWithTaxAndTip
    }

    return applyDiscount(applyTip(applyTax(baseCost, taxRate), tipPercentage), discount);
}
