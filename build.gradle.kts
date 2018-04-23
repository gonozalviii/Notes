import de.dynamicfiles.projects.gradle.plugins.javafx.JavaFXGradlePluginExtension

group = "com.oc"
version = "1.0-SNAPSHOT"

buildscript {
    dependencies {
        classpath("de.dynamicfiles.projects.gradle.plugins:javafx-gradle-plugin:8.8.2")
    }
    repositories {
        mavenLocal()
        mavenCentral()
    }
}

apply {
    plugin("javafx-gradle-plugin")
}

plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit", "junit", "4.12")
    implementation("de.jensd:fontawesomefx:8.9")
}

tasks {
    withType<Wrapper>{
        gradleVersion = "4.6"
    }
}

configure<JavaFXGradlePluginExtension> {
    mainClass = "com.oc.Main"
    vendor = "OC"
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

application {
    mainClassName = "com.oc.Main"
}