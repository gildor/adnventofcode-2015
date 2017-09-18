plugins {
    application
    id("org.jetbrains.kotlin.jvm") version "1.1.4-3"
}

application {
    mainClassName = "MainKt"
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jre8")
    testImplementation("junit:junit:4.12")
}