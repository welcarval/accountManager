plugins {
    java
    id("org.springframework.boot") version "3.3.4"
    id("io.spring.dependency-management") version "1.1.6"
}

group = "dev.arcturuz"
version = "0.0.1-SNAPSHOT"
description = "accountManager"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    // variables
    val mapstructVersion = "1.6.3"
    val lombokVersion = "1.18.46"
    val lombokMapstructBindingVersion = "0.2.0"

    // implementation
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.mapstruct:mapstruct:${mapstructVersion}")
    implementation("org.springframework.boot:spring-boot-starter-web")

    // compile
    compileOnly("org.projectlombok:lombok:${lombokVersion}")

    // runtime
    runtimeOnly("com.h2database:h2")

    // test implementation
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    // test runtime
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // annotation processor
    annotationProcessor("org.projectlombok:lombok:${lombokVersion}")
    annotationProcessor("org.projectlombok:lombok-mapstruct-binding:${lombokMapstructBindingVersion}")
    annotationProcessor("org.mapstruct:mapstruct-processor:$mapstructVersion")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
