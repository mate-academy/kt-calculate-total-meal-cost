fun calculateTotalMealCost(baseCost: Double,
                           taxRate : Double,
                           tipPercentage : Double = 0.0,
                           discount : Double = 0.0) : Double =
            (baseCost
            + baseCost
            * taxRate
            + (baseCost + baseCost * taxRate)
            * tipPercentage) - discount

