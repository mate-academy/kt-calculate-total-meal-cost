# Calculate Total Meal Cost

In this task, create a Kotlin function that calculates the total cost of a meal, including tax and tip, with the option to apply a discount for special occasions.

## Requirements

1. **Main Function**: create a `calculateTotalMealCost` function that should calculate the total cost of a meal, including tax and tip. Optionally, it can apply a discount if specified (greater than `0.0`).

2. **Local Functions**: inside the main function, define the following local functions:
    - `applyTax` that calculates and adds tax to the meal's base cost;
    - `applyTip` that adds a tip based on the cost after tax;
    - `applyDiscount` that applies a discount to the final cost, after tax and tip, if a discount condition is met.

3. **Parameters**:
    - `baseCost` is the base cost of the meal (before tax and tip);
    - `taxRate` is the tax rate to apply to the base cost;
    - `tipPercentage` is the percentage of the cost after tax to add as a tip;
    - `discount` is an optional discount amount to apply at the end. Default should be `0`.

4. **Return**: the function should return the total cost of the meal after applying tax, tip, and any discount.

## Example of Function Invocation

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
