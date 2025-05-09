fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0) : Double {

    fun applyTax() : Double {
        return baseCost + (baseCost * taxRate)
    }
    fun applyTip(afterTaxCost: Double) : Double {
        return afterTaxCost + (afterTaxCost * tipPercentage)
    }
    fun applyDiscount(afterDiscountCost: Double) : Double {
        return afterDiscountCost - discount
    }

    return applyDiscount(applyTip(applyTax()))
}
