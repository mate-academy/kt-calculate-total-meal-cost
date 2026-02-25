fun calculateTotalMealCost(
    baseCost : Double,
    taxRate : Double,
    tipPercentage : Double,
    discount : Double = 0.0
) : Double {
    fun applyTax() : Double {
        return baseCost * (taxRate + 1)
    }

    fun applyTip(costWithTax : Double) : Double {
        return costWithTax * (tipPercentage + 1)
    }

    fun applyDiscount(costWithTaxAndTip : Double) : Double {
        return costWithTaxAndTip - discount
    }

    return applyDiscount(applyTip(applyTax()))
}
