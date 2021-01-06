package com.sunzhen.IOStream;

import java.io.*;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/16 - 11 - 16 - 15:24
 * @Description: com.sunzhen.IOStream
 * @version: 1.0
 */
public class Test_System_IO {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        File f =new  File("E:\\Demo.txt");
        FileWriter fw=new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        String s = br.readLine();
        while (!s.equals("exit")){
            bw.write(s);
            bw.newLine();
            s= br.readLine();
        }


        br.close();
        bw.close();




    }
}
