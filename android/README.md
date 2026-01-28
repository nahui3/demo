## Demo-приложение для библиотеки nahui3/android

Минимальное Android-приложение на Jetpack Compose, демонстрирующее использование библиотеки [`nahui3/android`](https://github.com/nahui3/android).

### Быстрый старт

1. Склонируйте репозиторий библиотеки в папку `external/android-ui`:

   ```bash
   cd android
   git clone https://github.com/nahui3/android.git external/android-ui
   ```

2. Откройте папку `android` в Android Studio и запустите приложение.

### Использование

Приложение демонстрирует компонент `FieldWithText` из библиотеки:

```kotlin
import com.nahui3.android.ui.FieldWithText

FieldWithText(label = "Ваш текст")
```

### Технические детали

- Библиотека подключена через Gradle `includeBuild` в `settings.gradle.kts`
- Зависимость объявлена как `implementation("com.nahui3.android:nahui3-android-ui")`
- JVM target: 21
