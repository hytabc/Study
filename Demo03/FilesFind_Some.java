package Demo03;

import java.io.File;

public class FilesFind_Some {
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
                String path = dir.getPath();
                boolean b = path.endsWith("第1节");
                if(b){
                    System.out.println(dir);
                }

                /*
                String name = f.getName();//文件名
                //String path = f.getPath();//全部路径
                //String s = f.toString();//同上
                //转换为小写
                name=name.toLowerCase();
                boolean b = name.endsWith(".url");
                if(b){
                    System.out.println(f);
                }
                */
                /*if(f.getName().toLowerCase().endsWith(".url")||f.getName().toLowerCase().endsWith("下载必看.txt")){
                    //boolean delete = f.delete();
                    //System.out.println(delete);
                    System.out.println("已删除:"+f);
                }*/
                /*if(dir.getPath().startsWith("第1节")){
                        System.out.println(dir);
                }*/
            }
        }
    }
}
