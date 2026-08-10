import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MealCostCalculatorTest {
    @Test
    fun calculateTotalMealCost_WithDiscount_AppliesDiscountCorrectly() {
        // given
        val baseCost = 100.0
        val taxRate = 0.1 // 10%
        val tipPercentage = 0.15 // 15%
        val discount = 10.0 // $10 discount

        // when
        val result = calculateTotalMealCost(baseCost, taxRate, tipPercentage, discount)

        // then
        val expected = (baseCost + baseCost * taxRate + (baseCost + baseCost * taxRate) * tipPercentage) - discount
        assertEquals(expected, result)
    }

    @Test
    fun calculateTotalMealCost_WithBaseCostOnly_ReturnTheBasePriceAsIs() {
        // given
        val baseCost = 100.0
        val taxRate = 0.0 // 0%
        val tipPercentage = 0.0 // 0%
        val discount = 0.0 // $0 discount

        // when
        val result = calculateTotalMealCost(baseCost, taxRate, tipPercentage, discount)

        // then
        val expected = 100.0
        assertEquals(expected, result)
    }
    @Test
    fun calculateTotalMealCost_NoDiscount_AppliesNoDiscount() {
        // given
        val baseCost = 50.0
        val taxRate = 0.08 // 8%
        val tipPercentage = 0.2 // 20%

        // when
        val result = calculateTotalMealCost(baseCost, taxRate, tipPercentage)

        // then
        val expected = baseCost + baseCost * taxRate + (baseCost + baseCost * taxRate) * tipPercentage
        assertEquals(expected, result)
    }
}
