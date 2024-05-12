plugins {
    id("com.android.library") version "8.4.0"
    id("org.mozilla.rust-android-gradle.rust-android") version "0.9.4"
}

android {
    namespace = "com.foo.test"
    compileSdk = 34
}

cargo {
    module = "../rust"
    libname = "test"
    targets = listOf("arm64")
}
