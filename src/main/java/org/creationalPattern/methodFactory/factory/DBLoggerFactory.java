package org.creationalPattern.methodFactory.factory;

import org.creationalPattern.methodFactory.product.DBLogger;
import org.creationalPattern.methodFactory.product.Logger;

public class DBLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new DBLogger();
    }
}
