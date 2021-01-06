package com.sunzhen.File.test01.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

/**
 * @Auther: sunzhen
 * @Date: 2020/10/30 - 10 - 30 - 15:39
 * @Description: com.sunzhen.game
 * @version: 1.0
 * GamePanel 继承了JPanel才 具备面板的功能,才能成为一个面板;
 */
public class GamePanel extends JPanel {
    //定义两个数组:
    //设置蛇的长度:
    int length;
    //一个存储蛇的x轴的坐标;
    int[] snakeX = new int[200];
    //一个存储蛇的y轴的坐标;
    int[] snakeY = new int[200];
    //游戏只有两个状态: 开始,暂停;
    boolean isStart = false; //默认暂停;
    //定义一个定时器
    Timer timer;
    //设置蛇的行走方向:
    String direction ;
    //定义食物的x和y的坐标
    int foodX;
    int foodY;
    //定义一个积分:
    int score;
    //加入一个变量,去判断小球的死亡状态;
    boolean isDie = false; //默认情况下小球没有死亡
    public void init(){
        length = 3;
        //初始化蛇头坐标;
        snakeX[0] = 175;
        snakeY[0] = 275;
        //初始化第一节身子坐标
        snakeX[1] = 150;
        snakeY[1] = 275;
        //初始化第二节身子坐标
        snakeX[2] = 125;
        snakeY[2] = 275;
        direction = "R";//L U D
        //初始化食物的坐标
        foodX = 300;
        foodY = 200;
    }
    public GamePanel(){//构造器;
        init();
        //将焦点定位在当前操作的面板上;
        this.setFocusable(true);
        //加入监听
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {//监听键盘的按下操作
                super.keyPressed(e);
                int keyCode = e.getKeyChar();
                System.out.println(keyCode);
                if(keyCode==KeyEvent.VK_SPACE){//监听空格;
                    if(isDie){
                        //全部恢复到初始状态
                        init();
                        isDie = false;
                    }else {
                        //没有死亡操作

                        isStart = !isStart;//监听到空格,开始变暂停,暂停变空格
                        repaint();//重绘
                    }
                }
                //监听向上箭头;
                if(keyCode==53){
                    direction = "U";
                }
                //监听向下箭头;
                if(keyCode==50){
                    direction = "D";
                }
                //监听向左箭头;
                if(keyCode==49){
                    direction = "L";
                }
                //监听向右箭头;
                if(keyCode==51){
                    direction = "R";
                }
            }
        });
        //对定时器进行初始化操作;
        timer = new Timer(200, new AbstractAction() {
            /*
            AbstractAction 是事件监听
            相当于每100ms监听一下你是否发生了动作
            具体的动作放入actionperformed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isStart && isDie==false) {//游戏开始的时候,蛇才动;
                    //后一节身子走到前一节身子的位置上;
                    for (int i = length-1 ; i>0 ; i--) {
                        snakeX[i]= snakeX[i-1];
                        snakeY[i]= snakeY[i-1];
                    }
                    //动蛇头:
                    if("R".equals(direction)){
                        snakeX[0]+=25;
                    }
                    if ("L".equals(direction)){
                        snakeX[0]-=25;
                    }
                    if ("U".equals(direction)){
                        snakeY[0]-=25;
                    }
                    if ("D".equals(direction)){
                        snakeY[0]+=25;
                    }
                    //防止蛇超出边界:
                    if(snakeX[0]>750){
                        snakeX[0]=25;
                    }
                    if(snakeX[0]<25){
                        snakeX[0]=750;
                    }
                    if(snakeY[0]>725){
                        snakeY[0]=100;
                    }
                    if(snakeY[0]<100){
                        snakeY[0]=725;
                    }
                    //检测碰撞动作:
                    //食物的坐标和蛇头的坐标重合,才是碰撞;
                    if (snakeX[0]==foodX && snakeY[0]==foodY) {
                        //蛇长度+1
                        length++;
                        //食物坐标发生改变 随机生成坐标,且是25的倍速
                       /* [25,750] -> [1,30]*25
                        [100,725] -> [4,29]*25
                        Math.Random() -->[0.0,1.0)
                        new Random().nextInt(26) -->[0,26);[0,25] +4
                        */
                        foodX =( (int)((Math.random())*30)+1)*25;//[25,750]
                        foodY =( new Random().nextInt(26)+4)*25;//[100,725]
                        //吃上食物,积分加10;
                        score += 10;

                    }
                    //死亡判定:
                    for (int i = 1; i < length; i++) {
                        if (snakeX[0]==snakeX[i]&&snakeY[0]==snakeY[i]){
                            //死亡 状态改为true
                            isDie= true;

                        }
                    }
                    repaint();//刷新页面;

                }
            }
        });
        //定时器必须要启动:
        timer.start();
    }
    /*
    paintComponent这个方法比较特殊,这个方法就属于图形版的"main"方法;
    自动调用
    */

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //填充背景颜色 :
        this.setBackground(new Color(102, 204, 255));
        //画头部的图片:
        /*
        paintIcon的四个参数:
        this-当前面板  g-使用的画笔  x,y-对定坐标
         */
        Images.headerImg.paintIcon(this,g,10,10);
        //调节画笔颜色
        g.setColor(new Color(255, 105, 180));
        //画一个矩形;
        g.fillRect(10,70,770,665);

        //画小蛇:
        //画蛇头:
        if("R".equals(direction)){
            Images.rightImg.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
        if("L".equals(direction)){
            Images.leftImg.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
        if("U".equals(direction)){
            Images.upImg.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
        if("D".equals(direction)){
            Images.downImg.paintIcon(this,g,snakeX[0],snakeY[0]);
        }

       /*//画第一节蛇身:
        Images.bodyImg.paintIcon(this,g,snakeX[1],snakeY[1]);
        //画第二节蛇身:
        Images.bodyImg.paintIcon(this,g,snakeX[2],snakeY[2]);*/
       //优化为循环画身子;
        for (int i = 1; i < length ; i++) {
            Images.bodyImg.paintIcon(this,g,snakeX[i],snakeY[i]);
        }

        //如果界面是暂停的,界面中间就应该有一句提示语;
        if(isStart==false){
            //画一个文字:
            g.setColor(new Color(14, 10, 19));
            //三个参数  字体  文字  字号
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            //三个参数   内容  xy坐标
            g.drawString("点击空格开始游戏",250,330);
        }
        g.setColor(new Color(107, 148, 255));
        g.setFont(new Font("微软雅黑",Font.BOLD,20));
        g.drawString("您的积分为:"+score,620,40);
        //画食物:
        Images.foodImg.paintIcon(this,g,foodX,foodY);
        //画入死亡状态;
        if(isDie){
            g.setColor(new Color(255, 82, 68));
            g.setFont(new Font("微软雅黑",Font.BOLD,20));
            g.drawString("死亡!!!按下空格重新游戏.\n您的积分为:"+score,250,330);
        }

    }
}
