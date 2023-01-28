package org.behavioralPattern.visitor;

public abstract class Department {
    public abstract void visit(FulltimeEmployee employee);

    public abstract void visit(ParttimeEmployee employee);
}
