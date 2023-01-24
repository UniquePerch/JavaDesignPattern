package org.structuralPattern.compsite.file;

import java.util.LinkedList;
import java.util.List;

public class Folder extends AbstractFile{
    private final List<AbstractFile> list = new LinkedList<>();

    private String name;

    public Folder(String name){
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) throws Exception {
        list.add(file);
    }

    @Override
    public void remove(AbstractFile file) throws Exception {
        list.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) throws Exception {
        return list.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("正在对文件夹进行杀毒:" + this.name);
        for (AbstractFile file : list){ //递归调用
            file.killVirus();
        }
    }
}
