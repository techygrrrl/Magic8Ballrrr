import org.jetbrains.dokka.DokkaConfiguration.Visibility
import org.jetbrains.dokka.gradle.DokkaTask

/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin library project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.5.1/userguide/building_java_projects.html
 */

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.6.21"

    // Apply the java-library plugin for API and implementation separation.
    `java-library`

    `maven-publish`

    id("org.jetbrains.dokka") version "1.9.10"
}

group = "com.github.techygrrrl"
version = "main-SNAPSHOT"

// Configure all single-project Dokka tasks at the same time,
// such as dokkaHtml, dokkaJavadoc and dokkaGfm.
tasks.withType<DokkaTask>().configureEach {
    dokkaSourceSets.configureEach {
        documentedVisibilities.set(
            setOf(
                Visibility.PUBLIC,
                Visibility.PROTECTED,
            )
        )

        perPackageOption {
            matchingRegex.set(".*internal.*")
            suppress.set(true)
        }
    }
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use implementation("") for internal packages, and api("") for exported ones

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

tasks.dokkaHtml {
    moduleName.set("Magic8Ballrrr")
    outputDirectory.set(buildDir.resolve("docs"))
}

publishing {
    repositories {
        maven {
            name = "Magic8Ballrrr"
            url = uri("https://github.com/techygrrrl/Magic8Ballrrr")
        }
    }

    publications {
        create<MavenPublication>("Magic8Ballrrr") {
            from(components["java"])
        }
    }
}
