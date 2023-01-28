package org.behavioralPattern.visitor;

public interface Employee {
    public void accept(Department handler);
}
