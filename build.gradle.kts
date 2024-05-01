plugins {
    kotlin("jvm") version "1.9.23"
}

group = "com.example"
version = "1"

repositories {
    mavenCentral()
}

dependencies {

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("net.logstash.logback:logstash-logback-encoder:7.4")

    //logback - logging library
    implementation("ch.qos.logback:logback-classic:1.4.12")

    // Kafka clients for send to kafka
    implementation("org.apache.kafka:kafka-clients:3.4.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}