package Demo03;

import java.io.File;

public class FilesFind_All {
    public static void main(String[] args) {
        File file= new File("E:\\Java学习\\新建文件夹 (2)");
        A(file);
    }
    public static void A(File dir){
        //System.out.println(dir);
        File[] files =dir.listFiles();
        for(File f : files){
            //System.out.println(f);
            if(f.isDirectory()){
                A(f);
            }else{
                System.out.println(f);
            }
        }
    }
}
