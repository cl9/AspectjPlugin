# AspectjPlugin
config aspect in gradle for android
1. 在项目根目录的`build.gradle`添加依赖：
````
repositories {
    jcenter()
}
dependencies {
    ...
    classpath 'com.zero:AspectPlugin:1.0.0'
}
````
2. 在模块中依赖插件AspectjPlugin，并依赖aspectjrt
````
apply plugin: 'aspectj.plugin'
````
````
api 'org.aspectj:aspectjrt:1.9.1'
````
