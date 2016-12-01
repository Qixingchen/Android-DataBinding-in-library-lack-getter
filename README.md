# Android-DataBinding-in-library-lack-getter

Data binding using in library will lack getter for fields.

The generated binding class is at https://gist.github.com/Qixingchen/ff42cd45e2a1185b5e3f6d9eee5640c2

You can use ./gradlew :app:assembleRelease to build application and
use ./gradlew :databindingnogetterinlibrary:assembleRelease to build library.
The library build will failed with error "getText() not found"
