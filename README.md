# Usage
run `./gradlew dynamicfeature:connectedDebugAndroidTest`
It will throw this error `java.util.concurrent.ExecutionException: com.android.tools.build.bundletool.model.exceptions.InvalidCommandException: The APK Set archive does not contain the following modules: [dynamicfeature]`
# Workaround
Change dynamicfeature removable value to true
```xml
<dist:removable dist:value="true" />
```