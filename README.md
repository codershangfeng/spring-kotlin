# spring-kotlin

## How to build

1. Prerequisites(https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/#_system_requirements_2)

    - Install [SDKMAN](https://sdkman.io/install)
        ```sh
        $ curl -s "https://get.sdkman.io" | bash
        $ source "$HOME/.sdkman/bin/sdkman-init.sh"
        $ sdk version
        ```

    - Install [jEnv](https://www.jenv.be/)
        ```sh
        $ brew install jenv
        ```

    - Install [GraalVM](https://www.graalvm.org/)
        Using brew:
        ```sh
        $ brew install --cask graalvm/tap/graalvm-ce-java11
        ```
    - Use jEnv to manage GraalVM JDK
        1. Add to jEnv
            ```sh
            $ jenv add /Library/Java/JavaVirtualMachines/graalvm-ce-javaV-XX.Y.Z/Contents/Home
            ```
            For example:
            ```sh
            $ jenv add /Library/Java/JavaVirtualMachines/graalvm-ce-java11-21.0.0/Contents/Home/
            graalvm64-11.0.10 added
            11.0.10 added
            11.0 added
            11 added
            ```
        1. Set as current java runtime (`local`)
            For example, using the added version (*11*) as previous step.
            ```sh
            jenv local 11
            ```

    - Install native-image
        ```sh
        $ gu install native-image
        ```

1. Build approaches


    - [With native imave Maven plugin](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/#getting-started-native-image)
        ```sh
        $ mvn spring-boot:build-image
        ```

    - [With Buildpacks](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/#getting-started-buildpacks)
        ```sh
        $ mvn clean -Pnative-image package
        ```