pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        //jcenter()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven  ("https://jitpack.io")
    }
}
rootProject.name = "Project"
include(":app")
