package org.example.methodFactory.factory;

import org.example.methodFactory.product.FileLogger;
import org.example.methodFactory.product.Logger;

public class FileLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
