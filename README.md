# IBKR Demo

This is a Maven project containing a minimal Java program that demonstrates how to connect to Interactive Brokers via IB Gateway.

## Setup

This demo requires having an open account with [Interactive Brokers](https://www.interactivebrokers.com/en/home.php).

### TWS API

To compile this demo program, we'll need to download the TWS API from the [Interactive Brokers website](https://interactivebrokers.github.io/#). Extract the TWS API files to our desired location and find the `IBJts/source/JavaClient` directory. This directory contains a Maven library with the Interactive Brokers Java APIs to interact with IB Gateway (and TWS). Run `mvn install` in this directory to install this library to our local Maven repository.

Find the `pom.xml` in the `IBJts/source/JavaClient` directory. Note the Maven artifact name of the library. The artifact name is defined by the part in `pom.xml` that looks something like the following:

```xml
<groupId>com.interactivebrokers</groupId>
<artifactId>tws-api</artifactId>
<version>X.X.X-SNAPSHOT</version>
```

Add this artifact name as a dependency in the `pom.xml` for this Maven project (i.e. `ibkrdemo`).

```xml
  ...
  <dependencies>

    <!-- IBKR TWS API -->
    <dependency>
      <groupId>com.interactivebrokers</groupId>
      <artifactId>tws-api</artifactId>
      <version>9.73.01-SNAPSHOT</version>
    </dependency>
  </dependencies>
  ...
```

### IB Gateway

This demo requires a working installation of IB Gateway to run successfully. Download the IB Gateway installer from the [Interactive Brokers website](https://www.interactivebrokers.com/en/trading/ibgateway-stable.php). After installation, we will need to open the IB Gateway program and login for paper trading using Interactive Brokers credentials for an existing account prior to running the demo. Once we've logged into IB Gateway, we're ready to run the demo.

## Running the program

Use the following command to run this program using Maven.

```bash
mvn exec:java -Dexec.mainClass="ydtak.ibkrdemo.IbkrDemo"
```

When run successfully, this program will connect to IB Gateway, wait for 5 seconds, and then disconnect. It prints the following to the terminal.

```bash
Connect ack.
Successfully connected to IB Gateway!
Connection closed.
```
