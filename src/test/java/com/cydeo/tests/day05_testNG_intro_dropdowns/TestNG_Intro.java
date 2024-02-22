package com.cydeo.tests.day05_testNG_intro_dropdowns;


import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {



       @BeforeClass
        public void setupClass(){
            System.out.println("----> Before class is running!!!");
        }
        @AfterClass
        public void tearDownClass(){
            System.out.println("----> After class is running!!!");
        }
        @BeforeMethod
        public void setupMethod(){
            System.out.println("--> Before method is running...");
        }

        @AfterMethod
        public void tearDownMethod(){
            System.out.println("--> After method is running...");
        }

        @Test(priority = 1)
        public void test1(){
            System.out.println("Test 1 is running...");
            //Assert Equals method will compare two of the same values. If returns true, pass. False, fails.
            String actual = "apple";
            String expected = "apple";

            Assert.assertEquals(actual, expected);

        }

        @Test (priority = 2)
        public void test2(){
            System.out.println("Test 2 is running...");

            String actual = "white";
            String expected = "white";

            Assert.assertTrue(actual.equals(expected));
        }


    }
/*
package com.cydeo.tests.day05_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupClass(){
        System.out.println("----> Before class is running!!!");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("----> After class is running!!!");
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("--> Before method is running...");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("--> After method is running...");
    }

    @Test (priority = 1)
    public void test1(){
        System.out.println("Test 1 is running...");
        //Assert Equals method will compare two of the same values. If returns true, pass. False, fails.
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual, expected);

    }

    @Test (priority = 2)
    public void test2(){
        System.out.println("Test 2 is running...");

        String actual = "white";
        String expected = "white";

        Assert.assertTrue(actual.equals(expected));
    }


}
 */
/*
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>selenium-project</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>

        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.17.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.6.3</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.testng/testng -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.9.0</version>
            <scope>compile</scope>
        </dependency>


    </dependencies>


 */