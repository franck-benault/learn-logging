# Learn Java logging frameworks
Here are a list of example of logging frameworks
Due to my company I have to use as backend log4j2

| Frawework | interface or backend end | last version | remarks |
| ------------- | ------------- | ------------- | ------------- |
| log4j1  | backend | 1.2.17 08/2012 | Deprecated |
| log4j2  | backend | 2.17.1 12/2021 | Ready for production |
| flogger  | interface | 0.7.4 12/2021 | Ready for production with log4j2 |
| slf4j 1.7  | interface | 1.7.32 12/2021 | Ready for production with log4j2 |
| slf4j 2  | interface | Alpha | Not yet ready for production |
| logback  | backend | 1.2.10 12/2021 | Ready for production |
| tinylog  | backend | 2.4.1 12/2021 | Ready for production |

## Links

* https://www.baeldung.com/java-logging-intro

## Old log4j 1.X
This library is **deprecated** and mustn't be used anymore as backend.
But if you have a dependency which needs log4j 1.X.
You should be to use the brigde library to log4j2.

But because this version is still used in old project, a reload project has been created **reload4j**.
https://reload4j.qos.ch/

## Log4j2
web site https://logging.apache.org/log4j/2.x/

This library can be considered as the main framework.

## Flogger
web site https://google.github.io/flogger/

This is a powerful framework using a fluent API (less rich than Slf4j).
Its integration with LOG4j2 as backend is now easy.
This framework has no dependency.

I suggest to used above log4j2 for production.
 

## Slf4j 1.7.X
web site  https://www.slf4j.org/

Current stable version
it has no fluent API
it has no level FATAL


## Slf4j 2.X
### Fluent API
Examples

```java
logger.atInfo().log(simpleMessage);

logger.addArgument(...).log(...);

logger.addKeyValue(k,v).log(...);

logger.setCause(...).log(...);

//and you can combine several methods and finish it by log(...)

logger.setCause(...).addKeyValue(k,v).addKeyValue(k,v).addArgument(...).addArgument(...).log(...);
```

### Issues
issue with the integration with log4j2

## Logback

web site https://logback.qos.ch/

## Tinylog

web site https://tinylog.org/

