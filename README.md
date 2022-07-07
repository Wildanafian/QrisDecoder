# Qris Decoder

[![](https://jitpack.io/v/Wildanafian/QrisDecoder.svg)](https://jitpack.io/#Wildanafian/QrisDecoder)

An android library for split QRIS string into readable & useable string or model

## Preparation

Step 1. Add jitpack in your root build.gradle:
```
allprojects {
    repositories {
      ...
      maven { url 'https://jitpack.io' }
    }
  }
```

Step 2. Add the dependency
```
dependencies {
      implementation 'com.github.Wildanafian:QrisDecoder:latest-release'
  }
```
  
## How to use
There are 2 types of result you can get, result in model or just raw string
```
with(QrDecoderHelper()) {
           
            //put your raw QR string here
            decodeQR("raw string")

            //get result in model
            val data = getResult()
            Log.d("##", "In model: " +data.isValid)
            Log.d("##", "In model: " +data.data?.tag00)

            val dataTag = getResultRawTag()
            Log.d("##", "In model: " +data.isValid)
            Log.d("##", "In model: " +data.data?.merchantCity)

            //get result in string
            Log.d("##", "In String: " +getResultInString())
}
```
