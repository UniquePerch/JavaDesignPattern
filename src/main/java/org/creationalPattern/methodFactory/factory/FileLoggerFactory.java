package org.creationalPattern.methodFactory.factory;

import org.creationalPattern.methodFactory.product.FileLogger;
import org.creationalPattern.methodFactory.product.Logger;

public class FileLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
