import org.slf4j.LoggerFactory

fun main() {

    println("Hello, World! It's example of using KafkaAppender in Logback.")
    val logger = LoggerFactory.getLogger("main")

    logger.info("Hello, World!")

}