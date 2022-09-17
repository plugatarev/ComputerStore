# **Spring Boot - Computer Store**
[![Build Status](https://travis-ci.org/syqu22/spring-boot-shop-sample.svg?branch=master)](https://travis-ci.org/syqu22/spring-boot-shop-sample)

## Description
Store that sells computers and accessories with the following type of goods:  
• Desktop computers  
• Laptops  
• Monitors  
• Hard disks

## Installation

You can clone this repository and use it locally:
```sh
$ git clone 
```

**Using Maven plugin**

First you should do clean installation:
```sh
$ mvn clean install
```
You can start application using Spring Boot custom command:
```sh
$ mvn spring-boot:run
```



## REST API
###Desktop Computer
 - **GET /products/desktopComputers** - _get all desktop computers_  
 - **POST /products/desktopComputers<br/>
 {BodyExample} := { "serialNumber": "R2D1", "price": 1321.0, "vendor": "1hp", "productAvailable": 11, "type": "DESKTOP_COMPUTER", "formFactor": "DESKTOP" }** 
_create new desktop computer with {BodyExample} parameters_  
 - **GET /products/desktopComputers/{id}** - _get desktop computers with identifier {id}_  
 - **PUT /products/desktopComputers/{id}<br/>
   {BodyExample} := { "serialNumber": "Q2f1", "price": 1237.0, "vendor": "1hp", "productAvailable": 12, "type": "DESKTOP_COMPUTER", "formFactor": "DESKTOP" }**
_update desktop computer with identifier {id} based by {BodyExample}_  

###Laptops
- **GET /products/laptops** - _get all laptops_
- **POST /products/laptops<br/>
  {BodyExample} := { "serialNumber": "R2D1", "price": 1321.0, "vendor": "lenvo", "productAvailable": 11, "type": "LAPTOP", "diagonal": "FIFTEEN" }**
  _create new laptop with {BodyExample} parameters_
- **GET /products/laptops/{id}** - _get laptop with identifier {id}_
- **PUT /products/laptops/{id}<br/>
  {BodyExample} := { "serialNumber": "Q2f1", "price": 1237.0, "vendor": "hunf", "productAvailable": 12, "type": "LAPTOP", "diagonal": "FOURTEEN" }**
  _update laptop with identifier {id} based by {BodyExample}_

###Hard Disk
- **GET /products/hardDisks** - _get all hard disks_
- **POST /products/hardDisks<br/>
  {BodyExample} := { "serialNumber": "R2D1", "price": 1321.0, "vendor": "wer", "productAvailable": 11, "type": "HARD_DISK", "capacity": 512 }**
  _create new hard disk with {BodyExample} parameters_
- **GET /products/hardDisks/{id}** - _get hard disk with identifier {id}_
- **PUT /products/hardDisks/{id}<br/>
  {BodyExample} := { "serialNumber": "Q2f1", "price": 1237.0, "vendor": "dfgf", "productAvailable": 12, "type": "HARD_DISK", "capacity": 128 }**
  _update hard disk with identifier {id} based by {BodyExample}_

###Monitors
- **GET /products/monitors** - _get all monitors_
- **POST /products/monitors<br/>
  {BodyExample} := { "serialNumber": "R2D1", "price": 1321.0, "vendor": "lk213", "productAvailable": 11, "type": "MONITOR", "diagonal": 20 }**
  _create new monitor with {BodyExample} parameters_
- **GET /products/monitors/{id}** - _get monitor with identifier {id}_
- **PUT /products/monitors/{id}<br/>
  {BodyExample} := { "serialNumber": "Q2f1", "price": 1237.0, "vendor": "ghfd", "productAvailable": 12, "type": "MONITOR", "diagonal": 24 }**
  _update monitor with identifier {id} based by {BodyExample}_