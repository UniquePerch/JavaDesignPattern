package org.structuralPattern.compsite.file;

public class ImageFile extends AbstractFile{
    private String name;

    public ImageFile(String name){
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
        System.out.println("对图像文件杀毒:" + this.name);
    }
}
