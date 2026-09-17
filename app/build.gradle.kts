
plugins {
    id("com.github.ben-manes.versions") version "0.54.0"
    application
    checkstyle
    id("com.diffplug.spotless") version "8.10.1"
    id("org.sonarqube") version "7.5.0.8588"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
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
spotless {
    java {
        importOrder()
        removeUnusedImports()
        googleJavaFormat().aosp()
        formatAnnotations()
        leadingTabsToSpaces(4)
    }
}
sonar {
    properties {
        property("sonar.projectKey", "Hun43rd_java-project-61")
        property("sonar.organization", "hun43rd")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}
