package com.sunzhen.File.test01.game;

import javax.swing.*;
import java.awt.*;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/30 - 10 - 30 - 14:32
 * @Description: com.sunzhen.game
 * @version: 1.0
 */
public class StartGame {
    public static void main(String[] args) {
        //创建一个窗体
        JFrame jf = new JFrame();
        //给窗体设置一个标题:
        jf.setTitle("适度游戏益智,沉迷游戏伤身 by-sunzhen");
        //设置窗体坐标,对应窗体的宽和高;
        //jf.setBounds(x,y,800,800);
        //想要获取屏幕的宽:
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        jf.setBounds((width-800)/2,(height-800)/2,800,800);//居中
        //设置窗体大小不可调:
        jf.setResizable(false);
        //关闭窗口时程序随之关闭:
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //创建面板:
        GamePanel gp = new GamePanel();
        //将面板加入到窗体中:
        jf.add(gp);
        //默认情况下窗体是隐藏的;必须将窗体进行显现:细节-->这个显现的方法最好放在最后;
        jf.setVisible(true);
    }
}
