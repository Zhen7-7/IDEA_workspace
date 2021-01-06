package com.sunzhen.File.test01.game;

import javax.swing.*;
import java.net.URL;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/30 - 10 - 30 - 14:07
 * @Description: com.sunzhen.game
 * @version: 1.0
 * Images这个类 专门用来获取游戏中的图片
 */
public class Images {
    /**/
    //将图片的真实路径封装成一个对象
    public static  URL bodyURL = Images.class.getResource("/images/body.png");
    //将图片封装为程序中的一个对象; 设为静态可以通过类名去访问
    public static ImageIcon bodyImg = new ImageIcon(bodyURL);

    public static  URL downURL = Images.class.getResource("/images/down.png");
    public static ImageIcon downImg = new ImageIcon(downURL);

    public static  URL foodURL = Images.class.getResource("/images/food.png");
    public static ImageIcon foodImg = new ImageIcon(foodURL);

    public static  URL headerURL = Images.class.getResource("/images/header.png");
    public static ImageIcon headerImg = new ImageIcon(headerURL);

    public static  URL leftURL = Images.class.getResource("/images/left.png");
    public static ImageIcon leftImg = new ImageIcon(leftURL);

    public static  URL rightURL = Images.class.getResource("/images/right.png");
    public static ImageIcon rightImg = new ImageIcon(rightURL);

    public static  URL upURL = Images.class.getResource("/images/up.png");
    public static ImageIcon upImg = new ImageIcon(upURL);
}
