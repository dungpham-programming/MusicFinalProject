plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.mue.music"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mue.music"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(libs.glide)                 // Thêm thư viện glide để hiển thị ảnh từ Internet
    annotationProcessor(libs.compiler)
    implementation(libs.gson)                    // gson để chuyển đổi JSON về Object
    implementation(libs.retrofit)               // Retrofit cung cấp các HTTP method
    implementation(libs.retrofit2.converter.gson)         // Convert Object sang JSON cung cấp bởi Retrofit
    implementation(libs.material)
}