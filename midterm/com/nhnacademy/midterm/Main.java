package com.nhnacademy.midterm;

import com.nhnacademy.midterm.element.StringToken;
import com.nhnacademy.midterm.util.JavaFileUtil;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        String targetJavaFileName="ErrorManager";
        //application 실행되는 경로
        String basePath = System.getProperty("user.dir");
        String filePath1 = basePath + File.separator + "data" + File.separator + targetJavaFileName + ".java";
        List<String> lines = JavaFileUtil.getInstance().read(filePath1);

        for(String line : lines){
            StringTokenizer st = new StringTokenizer(line, "\n",true);

            while (st.hasMoreTokens()) {
                System.out.print("<font color='gray'>");
                System.out.print(st.nextToken());
                System.out.println("</font>");
            }
        }

        StringBuilder sb  = new StringBuilder();
        /**Sample**********************************************/
        sb.append("<span style='color:blue'>public</span>");
        sb.append("&nbsp;<span style='color:blue'>class</span>");
        sb.append("&nbsp;Sample {<br> &nbsp;&nbsp;&nbsp;&nbsp; ");
        sb.append("<span style='color:blue'>int </span>");
        sb.append("i = 5; <br>");
        sb.append("}<br/>");
        /**Sample**********************************************/

        String templateHtmlPath = basePath + File.separator +"data"+ File.separator+"template.html";
        String destHtmlPath = basePath + File.separator +"html"+ File.separator + targetJavaFileName + ".html";
        JavaFileUtil.getInstance().createHtml(templateHtmlPath,destHtmlPath,sb.toString());
    }

}
