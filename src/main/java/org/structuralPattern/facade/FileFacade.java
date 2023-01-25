package org.structuralPattern.facade;

public class FileFacade extends AbstractFileFacade{
    private FileReader reader;
    private FileWriter writer;
    private FileEncoder encoder;

    public FileFacade(){
        reader = new FileReader();
        writer = new FileWriter();
        encoder = new FileEncoder();
    }

    public void fileEncrypt(String inputPath,String outputPath){
        String str = reader.read(inputPath);
        String es = encoder.encode(str);
        writer.write(es,outputPath);
    }
}
