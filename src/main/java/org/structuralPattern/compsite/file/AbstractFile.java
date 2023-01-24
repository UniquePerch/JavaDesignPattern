package org.structuralPattern.compsite.file;

public abstract class AbstractFile {//缺点：不够安全

    public abstract void add(AbstractFile file) throws Exception;

    public abstract void remove(AbstractFile file) throws Exception;

    public abstract AbstractFile getChild(int i) throws Exception;

    public abstract void killVirus();
}
