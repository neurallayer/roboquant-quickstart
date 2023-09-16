package $package

import org.roboquant.strategies.HistoricPriceStrategy
import org.roboquant.strategies.Rating

/**
 * Basic trend-following breakout strategy
 *
 * @param period the period to use for checking this is indeed a breakout
 */
class MyStrategy(period: Int) : HistoricPriceStrategy(period) {

    /**
     * This method will be called by the superclass for every asset in the feed once
     * there is enough data collected for that asset.
     */
    override fun generateRating(data: DoubleArray): Rating? {
        return when (data.last()) {
            data.max() -> Rating.BUY
            data.min() -> Rating.SELL
            else -> null
        }
    }

}
