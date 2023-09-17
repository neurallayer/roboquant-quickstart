Welcome
=======
This project has been created by the `roboquant-quickstart` Maven archetype. There is a small default application included that you can find at:

    src/main/kotlin/${groupId.replace('.','/')}/App.kt

At the same location you can also find a basic implementation of a strategy called `MyStrategy`.

By default, the following roboquant modules are included in the project:

- roboquant: the core module of roboquant
- roboquant-ta: adds technical analysis indicators and strategies
- roboquant-avro: adds support for Avro files and comes with several demo feeds

The `pom.xml` file also already contains references to the other modules, ready to be uncommented. 

Compile your Application
========================
To compile your application, you can enter the following command from the command-line:

```shell
mvn compile
```

Run your Application
====================
To run your application, you can enter the following command from the command-line:

```shell
mvn compile exec:java
```
The default included application will run a small back-test and print a summary of the account at the end.


You can also create and run a Docker image. Make sure Docker is running because by default the image will be published to your local Docker repo. Also, you might need to configure the correct platform in the pom.xml. 

```shell
mvn compile jib:dockerBuild 
docker run ${groupId.replace('.','/')}/${artifactId}
```

Next Steps
==========
It is recommended to use an IDE like *IntelliJ IDEA* if you want to develop an application that contains more than just a few lines of code. The free community edition of IntelliJ IDEA already has all the required features to get started.

It can also easily import your project. Just follow these steps after installing and started IntelliJ IDEA:

1. Select from menubar `File` -> `New` -> `Project from Existing Sources...`
2. Navigate to the directory that contains your project -> click `open`
3. select `Import project from external model` -> select `Maven` -> click `create`
4. Done 

You are now ready to develop your trading application in IntelliJ IDEA.
