# Curie : The Voice Assistant
The Curie is Java based voice assistant that perform task with you voice command. We used Microsoft Azure APIs for [Speech Synthesis](https://en.wikipedia.org/wiki/Speech_synthesis)(text to speech) and [Speech Recognition](https://en.wikipedia.org/wiki/Speech_recognition)(speech to text). Curie will take voice command as input, convert that voice into string and perform task according to it and at last give the result as output in form of speech.

### Java Features Used in this project:

- 1). Java Speech API
- 2). Web Scrapping through Java
- 3). String Operations
- 4). Java Swing and Java AWT
- 5). Java Event Handling and Exception Handling
- 6). Interface and Inheritance
 - 7).  Aggregation

### Project Features: 

- **Speech Recognition** : The ability to convert spoken language into text, so that the assistant can understand and respond to spoken commands and queries. For now, it can only understand English.

- **Speech Synthesis** : The ability to convert text into spoken language, so that the assistant can speak or read out responses or information to the user. For now, it can only speak in English.

- **User Friendly** : A simple and intuitive interface that allows users to quickly and easily interact with the assistant using natural language. User can ask any question or can give any command and voice will act according to it.

- **Web Scrapping** : The ability to automatically extract information from websites using tool like Selenium, using APIs, or using web scraping frameworks. The ability to extract specific pieces of information from web pages, such as prices, reviews, contact information, and more.

- **Robust** : I can handle a wide range of Exception that can disrupt the flow of working process of it.

### Quicstart with Curie : the voice Assistant

- 1). *Create a Maven Project.* Here we are providing a very good introductory video about maven and [how to make maven project](https://www.youtube.com/watch?v=bSaBmXFym30)

- 2). *Create a pom.xml file in your project and write this in your pom.xml file*
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.curie</groupId>
    <artifactId>Curie</artifactId>
    <version>1.0-SNAPSHOT</version>

    <build>
        <plugins>
            <plugin>
                <!-- Build an executable JAR -->
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>3.1.0</version>
                <configuration>
                    <archive>
                        <manifest>
                            <mainClass>org.curie.Main</mainClass>
                        </manifest>
                    </archive>
                </configuration>
            </plugin>
        </plugins>
    </build>

    <repositories>
        <repository>
            <id>maven-cognitiveservices-speech</id>
            <name>Microsoft Cognitive Services Speech Maven Repository</name>
            <url>https://azureai.azureedge.net/maven/</url>
        </repository>

        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-controls</artifactId>
            <version>19</version>
        </dependency>

        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-fxml</artifactId>
            <version>19</version>
        </dependency>

        <dependency>
            <groupId>org.controlsfx</groupId>
            <artifactId>controlsfx</artifactId>
            <version>11.1.2</version>
        </dependency>

        <dependency>
            <groupId>org.kordamp.bootstrapfx</groupId>
            <artifactId>bootstrapfx-core</artifactId>
            <version>0.4.0</version>
        </dependency>

        <dependency>
            <groupId>com.microsoft.cognitiveservices.speech</groupId>
            <artifactId>client-sdk</artifactId>
            <version>1.24.2</version>
        </dependency>

        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>4.0.1</version>
        </dependency>

        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.7.1</version>
        </dependency>

        <dependency>
            <groupId>org.apache.opennlp</groupId>
            <artifactId>opennlp-tools</artifactId>
            <version>2.1.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.beust/jcommander -->
        <dependency>
            <groupId>com.beust</groupId>
            <artifactId>jcommander</artifactId>
            <version>1.82</version>
        </dependency>
    </dependencies>

    <properties>
        <maven.compiler.source>19</maven.compiler.source>
        <maven.compiler.target>19</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
</project>

- 3). *Take your free Student Azure Subscription. Make a Resource in Speech Services to use APIs. You'll get your API key and your API region. Put that in Main.java application as string.*

- 4). *Your curie is ready to work.*

#### Hope you Like and Appreaciate our Project

# Made with ❤️ by [Abhay Gayakwad](https://github.com/abhi128125), [Niraj Parmar](https://github.com/Niraj1608) and [Jeel Patel](https://github.com/iamj33l)
