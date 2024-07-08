## app-theme
用于存放统一的样式，目前只针对 compose 的。

### 如何使用
[![](https://jitpack.io/v/foodiestudio/app-theme.svg)](https://jitpack.io/#foodiestudio/app-theme)

```kotlin
setContent {
    ApplicationTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = AppTheme.colors.background) {
            Greeting("Android")
        }
    }
}
```

另外，Jetpack Compose 里使用 CompositionLocal 来实现 Theme-Overlay

**注意:** 请使用 `AppTheme` 而不是直接使用 `MaterialTheme`
