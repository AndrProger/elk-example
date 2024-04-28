plugins {
    kotlin("jvm") version "1.9.23"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    //logback - logging library
    implementation("ch.qos.logback:logback-classic:1.2.3")

    // Kafka clients for send to kafka
    implementation("org.apache.kafka:kafka-clients:2.8.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}