plugins {
    id("com.github.ben-manes.versions") version "0.54.0"
    application
    checkstyle
    id("com.diffplug.spotless") version "8.10.1"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "hexlet.code.App"
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

checkstyle {
    toolVersion = "10.12.4"
    configFile = file("config/checkstyle/checkstyle.xml")
    isShowViolations = true
    isIgnoreFailures = false
}
