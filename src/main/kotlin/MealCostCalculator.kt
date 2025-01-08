fun calculateTotalMealCost(
    baseCost: Double,
    taxRate: Double,
    tipPercentage: Double,
    discount: Double = 0.0
): Double {
    fun applyTax(baseCost: Double, taxRate: Double): Double {
        if (taxRate > 0.0) {
            return baseCost * taxRate
        }
        return 0.0
    }

    fun applyTip(baseCost: Double, tipPercentage: Double): Double {
        if (tipPercentage > 0.0) {
            return baseCost * tipPercentage
        }
        return 0.0
    }

    fun applyDiscount(baseCost: Double, discount: Double): Double {
        if (discount > 0.0) {
            return baseCost + applyTax(baseCost, taxRate) +
                    applyTip((baseCost + applyTax(baseCost, taxRate)), tipPercentage) - discount
        }
        return baseCost + applyTax(baseCost, taxRate) +
                applyTip((baseCost + applyTax(baseCost, taxRate)), tipPercentage)
    }

    return applyDiscount(baseCost, discount)
}
