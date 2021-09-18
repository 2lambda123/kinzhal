plugins {
    kotlin("jvm")
    `publish-conventions`
}

repositories {
    mavenCentral()
//    maven(url = "https://s01.oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    implementation(project(":kinzhal-annotations"))
//    implementation("com.daugeldauge.kinzhal:kinzhal-annotations:0.0.1-SNAPSHOT")
    implementation("com.google.devtools.ksp:symbol-processing-api:1.5.30-1.0.0")
    implementation("com.squareup:kotlinpoet:1.9.0")

    testImplementation("com.github.tschuchortdev:kotlin-compile-testing-ksp:1.4.4")
    testImplementation(kotlin("test"))
}
