# Trace Request API

[![Build Status](https://travis-ci.org/imamchishty/trace-request-api.svg?branch=master "trace-request-api")](https://travis-ci.org/imamchishty/trace-request-api) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.shedhack.trace/trace-request-api/badge.svg?style=plastic)](https://maven-badges.herokuapp.com/maven-central/com.shedhack.filter/trace-request-api)

## Introduction

Request Filter API provides an API which is used by [filter-request-id](https://github.com/imamchishty/filter-request-id).
You need to provide implementations of some of this libraries interface and inject those implementations to the [__LoggingRequestFilter__](https://github.com/imamchishty/filter-request-id/blob/master/src/main/java/com/shedhack/filter/requestid/filter/LoggingRequestFilter.java).
You could implement DB logging, file etc.

This library provides:

- __HttpHeaderKeysEnum__: header keys that available in the HTTP request.

- __LoggingHandler__: this interface is used by [__LoggingRequestFilter__](https://github.com/imamchishty/filter-request-id/blob/master/src/main/java/com/shedhack/filter/requestid/filter/LoggingRequestFilter.java). This class can take one or more implementations.
These implementations allow the RequestModel to be logged to whatever sink required. A default impl has been provided __DefaultLoggingHandler__, this uses SLF4J to log the model at INFO level. 
The MDC is set by __LoggingRequestFilter__.

- __RequestModel__: Model stored in the thread local. 

- __RequestThreadLocalHelper__: please see the next section.

## Thread Local

The request Id is also stored as a Thread Local variable. A static library, [Thread Local Utility](https://github.com/imamchishty/trace-request-api/blob/master/src/main/java/com/shedhack/filter/api/threadlocal/RequestThreadLocalHelper.java) has been used to manage it (set/get/remove). The object stored in the TL is a [__RequestModel__](https://github.com/imamchishty/trace-request-api/blob/master/src/main/java/com/shedhack/filter/api/model/RequestModel.java).
You can use this library to get access to the variable. The filter will also clear the TL. 

## Dependencies

SLF4J API for logging:

        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>1.7.21</version>
        </dependency>
        
## Java requirements

Project has been built using JDK 1.8.

## Maven central

This artifact is available in [Maven Central](https://maven-badges.herokuapp.com/maven-central/com.shedhack.filter/trace-request-api).
 
    <dependency>
        <groupId>com.shedhack.filter</groupId>
        <artifactId>trace-request-api</artifactId>
        <version>x.x.x</version>
    </dependency>    


Contact
-------

	Please feel free to contact me via email, imamchishty@gmail.com
