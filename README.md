# learn-logging
learn java logging framework

## Old log4j 1.X
This library is deprecated and mustn't be used anymore.
But if you have a dependency which needs log4j 1.X.
You should be to use the brigde library to log4j2.

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

