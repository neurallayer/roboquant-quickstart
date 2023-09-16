package $package

import org.roboquant.metrics.AccountMetric
import org.roboquant.Roboquant
import org.roboquant.avro.AvroFeed
import kotlin.system.exitProcess

fun main() {

    // Create an instance of MyStrategy with 26-day history
    val strategy = MyStrategy(period = 26)

    // Define the metric(s) you want to monitor
    val metric = AccountMetric()

    // Create an instance of Roboquant
    val roboquant = Roboquant(strategy, metric)

    // Create the data feed that will be used for the back test
    // This demo feed contains several years worth of daily S&P 500 stock prices
    val feed = AvroFeed.sp500()

    // Run the back test
    roboquant.run(feed)

    // Print the account summary
    println(roboquant.broker.account.summary())

    // Exit
    exitProcess(0)
}
