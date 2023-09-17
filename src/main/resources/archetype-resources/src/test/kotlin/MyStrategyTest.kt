package $package

import org.roboquant.strategies.Rating
import kotlin.test.Test
import kotlin.test.assertEquals

internal class MyStrategyTest {

    @Test
    fun test() {
        val strategy = MyStrategy(5)
        val prices = doubleArrayOf(100.0, 100.0, 101.0, 102.0, 105.0)
        val rating = strategy.generateRating(prices)
        assertEquals(Rating.BUY, rating)
    }

}
