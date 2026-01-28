## Подробное описание

- **Стек**:
  - SwiftUI, iOS 17.0+, Swift 5.9
  - Swift Package Manager (SPM)
  - XcodeGen

---

## Структура проекта

- `Demo/` — исходники демо‑приложения
  - `DemoApp.swift` — точка входа SwiftUI‑приложения
  - `ContentView.swift` — экран, демонстрирующий `SimpleTextFieldView` из пакета `NAHUI`
  - `Assets.xcassets` — ассеты приложения
- `project.yml` — конфигурация XcodeGen
- `Demo.xcodeproj/` — сгенерированный Xcode‑проект (может быть пересоздан)

---

## XcodeGen

Конфигурация проекта описана в файле `project.yml`.

Ключевые моменты:

- **Имя проекта**: `Demo`
- **Цель**: `Demo` (iOS application)
- **Bundle ID**: `ru.nahui3.Demo-NAHUI`
- **Deployment target**: iOS 17.0
- **Источники**: папка `Demo`
- **Зависимость по SPM**:
  - пакет `NAHUI` по адресу `https://github.com/nahui3/ios` (ветка `main`)
  - продукт `NAHUI` подключён как зависимость цели `Demo`

### Установка XcodeGen

```bash
brew install xcodegen
```

### Генерация проекта

Из корня iOS‑проекта (`ios/`):

```bash
cd ios
xcodegen generate
open Demo.xcodeproj
```

> Изменения структуры файлов и настроек проекта следует вносить в `project.yml`, а затем снова вызывать `xcodegen generate`.

---

## Подключение SPM‑пакета NAHUI

В `project.yml` описан Swift Package:

- **URL**: `https://github.com/nahui3/ios`
- **Ветка**: `main`
- **Продукт**: `NAHUI`

XcodeGen генерирует Xcode‑проект так, чтобы цель `Demo` имела зависимость от продукта `NAHUI`. При открытии `Demo.xcodeproj` Xcode автоматически подтянет пакет.

Технически это аналогично ручному добавлению пакета через:

- **File → Add Packages...**
- указание URL `https://github.com/nahui3/ios`
- добавление продукта `NAHUI` к цели `Demo`

---

## Демонстрация SimpleTextFieldView

В `ContentView.swift` используется компонент `SimpleTextFieldView` из пакета `NAHUI`.

Основные моменты:

- импорт модуля:

```swift
import SwiftUI
import NAHUI
```

- состояние для ввода текста и использование `SimpleTextFieldView`:

```swift
@State private var name: String = ""

var body: some View {
    NavigationStack {
        VStack(spacing: 24) {
            SimpleTextFieldView(
                text: $name,
                title: "Имя",
                placeholder: "Введите имя"
            )

            if !name.isEmpty {
                Text("Вы ввели: \(name)")
                    .font(.title3.weight(.semibold))
                    .frame(maxWidth: .infinity, alignment: .leading)
            } else {
                Text("Начните вводить текст в поле выше")
                    .foregroundStyle(.secondary)
                    .frame(maxWidth: .infinity, alignment: .leading)
            }

            Spacer()
        }
        .padding(.horizontal, 20)
        .padding(.top, 32)
        .animation(.easeInOut(duration: 0.2), value: name)
        .navigationTitle("Demo NAHUI")
    }
}
```

Экран демонстрирует:

- работу биндинга `Binding<String>` в `SimpleTextFieldView`
- обновление текста под полем ввода по мере изменения состояния `name`

