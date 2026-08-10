fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {
    fun applyTax(baseCost: Double, taxRate: Double): Double =
        baseCost + (baseCost * taxRate)

    fun applyTip(afterTax: Double, tipPercentage: Double): Double =
        afterTax + (afterTax * tipPercentage)

    fun applyDiscount(finalCost: Double, discount: Double): Double =
        if (discount > 0.0) finalCost - discount else finalCost

    return applyDiscount(
        applyTip(applyTax(baseCost, taxRate), tipPercentage),
        discount
    );
}
