# spring-kotlin

[Spring Navite Office Docs](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/#overview)

## How to build

1. Prerequisites(https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/#_system_requirements_2)

    - Install GraalVM Java SDK

        1. Using [SDKMAN](https://sdkman.io/install)
            ```sh
            $ curl -s "https://get.sdkman.io" | bash
            $ source "$HOME/.sdkman/bin/sdkman-init.sh"
            $ sdk version
            ```
            - Install GraalVM with `sdk install java 21.0.0.r8-grl` for Java 8 or `sdk install java 21.0.0.r11-grl` for Java 11.
            - Make sure to use the newly installed JDK with sdk use java 21.0.0.r8-grl or sdk use java 21.0.0.r11-grl.


        2. Using GraalVM with jEnv

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
                2. Set as current java runtime (`local`)
                    For example, using the added version (*11*) as previous step.
                    ```sh
                    jenv local 11
                    ```

    - Install native-image
        ```sh
        $ gu install native-image
        ```

1. Build approaches


    - [With native image Maven plugin](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/#getting-started-native-image)
        ```sh
        $ mvn spring-boot:build-image
        ```

    - [With Buildpacks](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/#getting-started-buildpacks)
        ```sh
        $ mvn clean -Pnative-image package
        ```