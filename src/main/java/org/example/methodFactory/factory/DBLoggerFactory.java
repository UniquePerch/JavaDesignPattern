package org.example.methodFactory.factory;

import org.example.methodFactory.product.DBLogger;
import org.example.methodFactory.product.Logger;

public class DBLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new DBLogger();
    }
}
