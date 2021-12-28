# Learn Java logging frameworks
Here are a list of example of logging frameworks
Due to my company I have to use as backend log4j2

| Frawework | interface or backend end | last version | remarks |
| ------------- | ------------- | ------------- | ------------- |
| log4j1  | backend | 1.2.17 08/2012 | Deprecated |
| log4j2  | backend | 2.17.0 12/2021 | OK for production |
| flogger  | interface | 0.7.4 12/2021 | OK for production with log4j2 |
| slf4j 1.7  | interface | 1.7.32 12/2021 | OK for production with log4j2 |
| slf4j 2  | interface | Alpha | no yet ok for production |

## Old log4j 1.X
This library is **deprecated** and mustn't be used anymore as backend.
But if you have a dependency which needs log4j 1.X.
You should be to use the brigde library to log4j2.

## Log4j2
This library can be considered as the main framework.

## Flogger
This is a powerful framework using a fluent API (less rich than Slf4j).
Its integration with LOG4j2 as backend is now easy.
This framework has no dependency.

I suggest to used above log4j2 for production.
 

## Slf4j 1.7.X
Current stable version
it has no fluent API
it has no level FATAL


## Slf4j 2.X
### Fluent API
Examples

logger.atInfo().log(simpleMessage);

logger.addArgument(...).log(...);

logger.addKeyValue(k,v).log(...);

logger.setCause(...).log(...);

and you can combine several methods and finish it by log(...)

logger.setCause(...).addKeyValue(k,v).addKeyValue(k,v).addArgument(...).addArgument(...).log(...);

### Issues
issue with the integration with log4j2

