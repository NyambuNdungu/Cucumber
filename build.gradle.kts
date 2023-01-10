plugins {
    id("java")
    id ("se.thinkcode.cucumber-runner") version "0.0.8"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testImplementation("junit:junit:4.13.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation(platform("io.cucumber:cucumber-bom:7.10.1"))



    testImplementation("io.cucumber:cucumber-java")
    testImplementation("io.cucumber:cucumber-junit-platform-engine")
    testImplementation("org.junit.platform:junit-platform-suite")
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.cucumber:cucumber-java:7.10.1")
    testImplementation("io.cucumber:cucumber-junit:7.10.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()

    systemProperty("cucumber.junit-platform.naming-strategy", "long")
}