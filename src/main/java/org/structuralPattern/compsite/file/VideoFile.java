package org.structuralPattern.compsite.file;

public class VideoFile extends AbstractFile{
    private String name;

    public VideoFile(String name){
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) throws Exception {
        throw new Exception("不支持该方法");
    }

    @Override
    public void remove(AbstractFile file) throws Exception {
        throw new Exception("不支持该方法");
    }

    @Override
    public AbstractFile getChild(int i) throws Exception {
        throw new Exception("不支持该方法");
    }

    @Override
    public void killVirus() {
        System.out.println("对视频文件进行杀毒:" + this.name);
    }
}
