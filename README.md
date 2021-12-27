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
Example

logger.atInfo().log(simpleMessage);

### Issues
need java9 for integration with log4j2

