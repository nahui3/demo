# Demo NAHUI (iOS)

Короткий демо‑проект на SwiftUI, который показывает работу Swift Package `NAHUI` из репозитория [`nahui3/ios`](https://github.com/nahui3/ios).  
Подробная документация вынесена в `docs/guide.md`.

---

## Как запустить и использовать

- **Требования**: установленный Homebrew, Xcode, internet для загрузки SPM‑пакетов.
- Все необходимые шаги можно выполнить, просто скопировав блок ниже в терминал:

```bash
# перейти в корень монорепозитория (если вы ещё не там)
# cd /путь/к/репозиторию

# перейти в папку iOS‑проекта
cd ios

# при необходимости установить XcodeGen
brew list xcodegen >/dev/null 2>&1 || brew install xcodegen

# сгенерировать Xcode‑проект из project.yml
xcodegen generate

# открыть сгенерированный проект в Xcode
open Demo.xcodeproj
```

Дальше в Xcode:

- выберите симулятор (например, iPhone 16);
- запустите приложение (`Cmd+R`);  
- на экране откроется форма с `SimpleTextFieldView`, где вводимый текст сразу отображается ниже.

