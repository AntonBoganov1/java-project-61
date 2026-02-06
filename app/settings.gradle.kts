pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    resolutionStrategy {
        eachPlugin {
            when(requested.id.id) {
                "com.github.ben-manes.versions" -> useModule("com.github.ben-manes:gradle-versions-plugin:${requested.version}")
            }
        }
    }
}
rootProject.name = "app"