plugins {
    id("java")
    id("com.github.ben-manes.versions") version "0.54.0"
    application
    id("org.sonarqube") version "7.3.1.8318"
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
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
sonar {
  properties {
    property("sonar.projectKey", "Hun43rd_java-project-61")
    property("sonar.organization", "hun43rd")
  }
}
checkstyle {
    toolVersion = "10.12.4"
    configFile = file("config/checkstyle/checkstyle.xml")
    isShowViolations = true
    isIgnoreFailures = false
}
