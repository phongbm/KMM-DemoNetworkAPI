plugins {
    id("com.android.application")
    kotlin("android")
}

dependencies {
    implementation(project(":shared"))

    implementation("androidx.core:core-ktx:1.6.0")

    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")
    implementation("com.google.android.material:material:1.4.0")

    // Compose
    implementation("androidx.compose.ui:ui:1.0.1")
    implementation("androidx.compose.ui:ui-tooling:1.0.1")
    implementation("androidx.compose.foundation:foundation:1.0.1")
    implementation("androidx.compose.material:material:1.0.1")
    implementation("androidx.compose.material:material-icons-core:1.0.1")
    implementation("androidx.compose.material:material-icons-extended:1.0.1")
    implementation("androidx.compose.runtime:runtime-livedata:1.0.0")
    implementation("androidx.compose.runtime:runtime-rxjava2:1.0.0")
    implementation("androidx.activity:activity-compose:1.3.1")
}

android {
    compileSdk = 30

    defaultConfig {
        applicationId = "com.phongbm.demonetworkapi.android"
        minSdk = 23
        targetSdk = 30
        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    buildFeatures {
        compose = true
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.0"
    }
}