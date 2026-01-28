pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Demo"
include(":app")

// Подключаем библиотеку nahui3/android как отдельный билд.
// Её исходники должны лежать в android/external/android-ui (обычный git clone).
includeBuild("external/android-ui") {
    dependencySubstitution {
        // Любая зависимость на com.nahui3.android:nahui3-android-ui
        // будет подменена на корневой проект included build (":")
        substitute(module("com.nahui3.android:nahui3-android-ui"))
            .using(project(":"))
    }
}