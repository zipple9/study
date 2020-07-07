* 如果pom配置里 '<packaging>pom</packaging>'  则改模块一般用于父子模块统一管理，不应该有代码？

* optional
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
            <optional>true</optional>
        </dependency>
如果一个项目中的依赖使用了 <optional>true</optional>。其他项目将该项目作为依赖引用时，不会引用被optional标记的依赖
比如A中有actuator optional依赖，B依赖A，则B中没有actuator依赖，除非显式引用，或者去除optional
