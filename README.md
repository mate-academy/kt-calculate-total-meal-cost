# Calculate total meal cost

Create a Kotlin function that calculates the total cost of a meal, including tax and tip, with the option to apply a discount for special occasions.

#### Requirements:

1. **Main Function**: Create the `calculateTotalMealCost` function, that should calculate the total cost of a meal, including tax and tip. Optionally, it can apply a discount if specified (is greater than 0.0).

2. **Local Functions**: Inside the main function, define the following local functions:
    - `applyTax`: Calculates and adds tax to the meal's base cost.
    - `applyTip`: Adds a tip based on the cost after tax.
    - `applyDiscount`: Applies a discount to the final cost, after tax and tip, if a discount condition is met.

3. **Parameters**:
    - `baseCost`: The base cost of the meal (before tax and tip).
    - `taxRate`: The tax rate to apply to the base cost.
    - `tipPercentage`: The percentage of the cost after tax to add as a tip.
    - `discount`: An optional discount amount to apply at the end. Default should be `0`.

4. **Return**: The function should return the total cost of the meal after applying tax, tip, and any discount.

### Example of function invocation

```kotlin
fun main() {
    val baseCost = 100.0
    val taxRate = 0.1 // 10%
    val tipPercentage = 0.15 // 15%
    val discount = 10.0 // $10 discount for special occasions

    val totalMealCost = calculateTotalMealCost(baseCost, taxRate, tipPercentage, discount)
    println("Total meal cost: $totalMealCost")
}
```
