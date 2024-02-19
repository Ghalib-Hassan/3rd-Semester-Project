/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graph32;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author shah
 */
public class MyPanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        //Background color
        Color c1 = new Color(0, 255, 255);
        setBackground(c1); 

       //Mountain
        Color c14 = new Color(59, 48, 32);
        g.setColor(c14);
        Color c15 = new Color(151, 124, 83);
        int[] mx = {1100, 1180, 1260};
        int[] my = {700, 450, 700};
        g.fillPolygon(mx, my, 3);
        
        g.setColor(Color.white);
        int[] nx = {950, 1030, 1110};
        int[] ny = {700, 550, 700};
        g.drawPolygon(nx, ny, 3);
        g.setColor(c14);
        g.fillPolygon(nx, ny, 3);
        
        g.setColor(Color.white);
        int[] ox = {800, 880, 960};
        int[] oy = {700, 350, 700};
        g.drawPolygon(ox, oy, 3);
        g.setColor(c14);
        g.fillPolygon(ox, oy, 3);
        
        g.setColor(Color.white);
        int[] qx = {600, 680, 760};
        int[] qy = {700, 520, 700};
        g.drawPolygon(qx, qy, 3);
        g.setColor(c15);
        g.fillPolygon(qx, qy, 3);
        
        g.setColor(Color.white);
        int[] px = {700, 780, 860};
        int[] py = {700, 500, 700};
        g.drawPolygon(px, py, 3);
        g.setColor(c15);
        g.fillPolygon(px, py, 3);
        
        g.setColor(Color.white);
        int[] rx = {440, 520, 600};
        int[] ry = {700, 450, 700};
        g.drawPolygon(rx, ry, 3);
        g.setColor(c14);
        g.fillPolygon(rx, ry, 3);
        
        g.setColor(Color.white);
        int[] sx = {300, 380, 460};
        int[] sy = {700, 400, 700};
        g.drawPolygon(sx, sy, 3);
        g.setColor(c14);
        g.fillPolygon(sx, sy, 3);
        
        g.setColor(Color.white);
        int[] tx = {150, 280, 410};
        int[] ty = {700, 600, 700};
        g.drawPolygon(tx, ty, 3);
        g.setColor(c15);
        g.fillPolygon(tx, ty, 3);
        
        g.setColor(Color.white);
        int[] ux = {0, 130, 260};
        int[] uy = {700, 450, 700};
        g.drawPolygon(ux, uy, 3);
        g.setColor(c14);
        g.fillPolygon(ux, uy, 3);
        
        g.setColor(Color.white);
        int[] vx = {0, 10, 50};
        int[] vy = {700, 400, 700};
        g.drawPolygon(vx, vy, 3);
        g.setColor(c15);
        g.fillPolygon(vx, vy, 3);
       
       //My name
       Color c2 = new Color(0, 0, 64);
       g.setColor(c2);
       Graphics2D g2 = (Graphics2D) g;
       g2.setStroke(new BasicStroke(3));
        g.drawArc(50, 70, 50, 70, 45, 290);
        g.drawLine(80, 100, 100, 100);
        g.drawLine(100, 100, 100, 140);
        g.drawLine(110, 70, 110, 140);
        g.drawLine(110, 105, 140, 105);
        g.drawLine(140, 70, 140, 140);
        g.drawLine(150, 140, 170, 70);
        g.drawLine(170, 70, 190, 140);
        g.drawLine(160, 110, 180, 110);
        g.drawLine(200, 70, 200, 140);
        g.drawLine(200, 140, 230, 140);
        g.drawLine(240, 70, 270, 70);
        g.drawLine(255, 70, 255, 140);
        g.drawLine(240, 140, 270, 140);
        g.drawLine(290, 70, 290, 140);
        g.drawArc(280, 70, 40, 35, 120, -240);
        g.drawArc(285, 100, 40, 40, 140, -270);
        
        //Design for G
        g.drawArc(60, 80, 30, 50, 100, 220);
        g.drawArc(55, 60, 40, 40, 45, 100);
        //Design for G
        
        g.drawLine(400, 70, 400, 140);
        g.drawLine(440, 70, 440, 140);
        g.drawLine(400, 105, 440, 105);
        g.drawLine(450, 140, 470, 70);
        g.drawLine(470, 70, 490, 140);
        g.drawLine(460, 110, 480, 110);
        g.drawArc(495, 70, 40, 35, 0, 270);         //Start of first "s"
        g.drawArc(495, 105, 40, 35, 90, -270);
        g.drawArc(550, 70, 40, 35, 0, 270);          //Start of second "s"
        g.drawArc(550, 105, 40, 35, 90, -270);
        g.drawLine(595, 140, 615, 70);
        g.drawLine(615, 70, 635, 140);
        g.drawLine(605, 110, 625, 110);
        g.drawLine(645, 70, 645, 140);
        g.drawLine(645, 70, 685, 140);
        g.drawLine(685, 140, 685, 70);
        
        //Design for H
        g.drawLine(407, 70, 407, 101);
        g.drawLine(407, 101, 425, 101);
        g.drawLine(435, 110, 435, 140);
        //Design for H
        
        Color c4 = new Color(255, 255, 255);
        g.setColor(c4);
        g.drawLine(40, 150, 700, 150);
        g.drawLine(40, 155, 700, 155);
        
        
        //My father name
        Color c5 = new Color(0, 0, 128);
        g.setColor(c5);
        g.drawLine(50, 190, 50, 250);
        g.drawLine(50, 190, 80, 250);
        g.drawLine(80, 250, 110, 190);
        g.drawLine(110, 190, 110, 250);
        g.drawLine(125, 190, 125, 220);
        g.drawArc(125, 190, 50, 60, 180, 180);
        g.drawLine(175, 190, 175, 220);
        g.drawLine(185, 190, 185, 250);
        g.drawLine(185, 220, 215, 220);
        g.drawLine(215, 190, 215, 250);
        g.drawLine(225, 250, 245, 190);
        g.drawLine(245, 190, 265, 250);
        g.drawLine(235, 220, 255, 220);
        g.drawLine(275, 190, 275, 250);   //first M
        g.drawLine(275, 190, 305, 250);
        g.drawLine(305, 250, 335, 190);
        g.drawLine(335, 190, 335, 250);
        g.drawLine(345, 190, 345, 250);   //second M
        g.drawLine(345, 190, 375, 250);
        g.drawLine(375, 250, 405, 190);
        g.drawLine(405, 190, 405, 250);
        g.drawLine(415, 250, 435, 190);
        g.drawLine(435, 190, 455, 250);
        g.drawLine(425, 220, 445, 220);
        g.drawLine(465, 190, 465, 250);
        g.drawArc(430, 190,70, 60, 270, 180);
        
        //Design for M
        g.drawLine(105, 210, 105, 250);
        g.drawLine(55, 185, 80, 230);
        //Design for M
        
        g.drawLine(550, 250, 570, 190);
        g.drawLine(570, 190, 590, 250);
        g.drawLine(560, 220, 580, 220);
        g.drawLine(600, 190, 600, 250);    //first B
        g.drawArc(590, 190, 40, 35, 235, 250);
        g.drawArc(595, 220, 40, 35, 235, 260);
        g.drawLine(640, 190, 640, 250);
        g.drawArc(630, 190, 40, 35, 235, 250);
        g.drawArc(635, 220, 40, 35, 235, 260);
        g.drawLine(680, 250, 700, 190);
        g.drawLine(700, 190, 720, 250);
        g.drawLine(690, 220, 710, 220);
        g.drawArc(725, 190, 40, 30, 0, 270);
        g.drawArc(725, 220, 40, 30, 90, -270);
        
        //Design for A
        g.drawLine(545, 250, 565, 190);
        g.drawLine(577, 225, 585, 250);
        g.drawLine(565, 225, 577, 225);
        //Design for A
        
        Color c6 = new Color(255, 255, 255);
        g.setColor(c6);
        g.drawLine(40, 260, 780, 260);
        g.drawLine(40, 265, 780, 265);
        
        
        //My roll number
        Color c7 = new Color(207, 16, 26);
        g.setColor(c7);
        g.drawArc(50, 330, 70, 70, 45, 270);
        g.drawArc(120, 330, 40, 40, 0, 270);         
        g.drawArc(120, 370, 40, 30, 90, -270);
        g.drawLine(170, 370, 190, 370);
        g.drawLine(170, 371, 190, 371);
        g.drawLine(170, 372, 190, 372);
        g.drawArc(51, 330, 70, 70, 45, 270);
        g.drawArc(121, 330, 40, 40, 0, 270);         
        g.drawArc(121, 370, 40, 30, 90, -270);
        g.drawArc(52, 330, 70, 70, 45, 270);
        g.drawArc(122, 330, 40, 40, 0, 270);         
        g.drawArc(122, 370, 40, 30, 90, -270); 
        g.drawArc(53, 330, 70, 70, 45, 270);
        g.drawArc(123, 330, 40, 40, 0, 270);         
        g.drawArc(123, 370, 40, 30, 90, -270);
        
        g.setColor(Color.white);
        int[] ax = {215, 215, 220, 260, 265, 265, 225, 270, 270, 210, 210, 255, 255, 225, 225};
        int[] ay = {335, 320, 310, 310, 320, 350, 390, 390, 400, 400, 390, 345, 320, 320, 335};
        g.drawPolygon(ax, ay, 15);
        g.setColor(Color.RED);
        g.fillPolygon(ax, ay, 15);
        
        g.setColor(Color.white);
        int[] bx = {310, 310, 330, 330, 283, 283, 300, 300, 285, 285, 299};
        int[] by = {310, 395, 395, 400, 400, 395, 395, 320, 330, 320, 310};
        g.drawPolygon(bx, by, 11);
        g.setColor(Color.RED);
        g.fillPolygon(bx, by, 11);
        
        g.setColor(Color.white);
        int[] cx = {350, 350, 370, 370, 323, 323, 340, 340, 325, 325, 339};
        int[] cy = {310, 395, 395, 400, 400, 395, 395, 320, 330, 320, 310};
        g.drawPolygon(cx, cy, 11);
        g.setColor(Color.RED);
        g.fillPolygon(cx, cy, 11);
        
        g.setColor(Color.white);
        int[] dx = {380, 420, 430, 430, 425, 430, 430, 420, 380, 385, 420, 420, 400, 400, 420, 420, 385};
        int[] dy = {310, 310, 315, 350, 352, 355, 395, 400, 400, 395, 395, 355, 355, 350, 350, 315, 315};
        g.drawPolygon(dx, dy, 17);
        g.setColor(Color.RED);
        g.fillPolygon(dx, dy, 17);
        
        g.setColor(Color.white);
        int[] ex = {440, 480, 490, 490, 485, 490, 490, 480, 440, 445, 480, 480, 460, 460, 480, 480, 445};
        int[] ey = {310, 310, 315, 350, 352, 355, 395, 400, 400, 395, 395, 355, 355, 350, 350, 315, 315};
        g.drawPolygon(ex, ey, 17);
        g.setColor(Color.RED);
        g.fillPolygon(ex, ey, 17);
        
        g.setColor(Color.white);
        int[] fx = {530, 530, 550, 550, 503, 503, 520, 520, 505, 505, 519};
        int[] fy = {310, 395, 395, 400, 400, 395, 395, 320, 330, 320, 310};
        g.drawPolygon(fx, fy, 11);
        g.setColor(Color.RED);
        g.fillPolygon(fx, fy, 11);
        
        g.setColor(c6);
        g.drawLine(40,410, 560, 410);
        g.drawLine(40, 415, 560, 415);
        
        
        //Clouds
        g.setColor(Color.white);
        g.fillArc(800, 100, 120, 70, 0, 360);
        g.fillArc(900, 100, 120, 70, 0, 360);
        g.fillArc(1000, 100, 120, 70, 0, 360);
        
        g.fillArc(700, 30, 120, 70, 0, 360);
        g.fillArc(800, 30, 120, 70, 0, 360);
        g.fillArc(900, 30, 120, 70, 0, 360);
        
        g.fillArc(1050, 30, 120, 70, 0, 360);
        g.fillArc(1150, 30, 120, 70, 0, 360);
        g.fillArc(1250, 30, 120, 70, 0, 360);
        
        g.fillArc(1130, 100, 120, 70, 0, 360);
        g.fillArc(1230, 100, 120, 70, 0, 360);
        g.fillArc(1330, 100, 120, 70, 0, 360);
        
        //Tree
        Color c12 = new Color(58, 29, 0);
        g.setColor(c12);
        g.fillArc(1210, 390, 150, 330, 240, 220);
        g.fillArc(1250, 390, 150, 330, 240, 220);
        
        g.setColor(Color.black);
        int[] gx = {1100, 1140, 1290, 1290, 1130, 1000, 1080, 1130, 1097};
        int[] gy = {470, 485, 500, 510, 510, 530, 510, 500, 480};
        g.setColor(c12);
        g.fillPolygon(gx, gy, 9);
        
        g.setColor(Color.green);
        g.fillArc(1000, 300, 250, 90, 90, 360);
        g.fillArc(1150, 300, 250, 90, 90, 360);
        g.fillArc(1150, 350, 250, 120, 90, 360);
        g.fillArc(850, 230, 250, 90, 0, 360);
        g.fillArc(950, 230, 350, 90, 0, 360);
        g.fillArc(1200, 230, 350, 90, 0, 360);
        
        //House
        int[] hx = {1210, 1230, 1190};
        int[] hy = {450, 470, 470};
        int[] ix = {1210, 1280, 1280, 1230};
        int[] iy = {450, 450, 470, 470};
        
        Color c13 = new Color(255, 255, 48);
        g.setColor(c13);
        g.fillPolygon(hx, hy, 3);
        g.fillPolygon(ix, iy, 4);
        g.fillRect(1230, 470, 50, 30);
        g.fillRect(1190, 470, 40, 30);
        g.setColor(Color.black);
        g.fillOval(1200, 475, 20, 20);
        
        g.setColor(Color.black);
        g.drawPolygon(hx, hy, 3);
        g.drawPolygon(ix, iy, 4);
        g.drawRect(1230, 470, 50, 30);
        g.drawRect(1190, 470, 40, 30);
        g.drawOval(1200, 475, 20, 20);
        
        //Birds
        int[] jx = {800, 805, 810, 810, 805, 800};
        int[] jy = {400, 405, 400, 400, 410, 410};
        g.fillPolygon(jx, jy, 5);
        int[] kx = {820, 825, 830, 830, 825, 820};
        int[] ky = {420, 425, 420, 420, 430, 420};
        g.fillPolygon(kx, ky, 5);
        int[] lx = {810, 815, 820, 820, 815, 810};
        int[] ly = {430, 435, 430, 430, 440, 430};
        g.fillPolygon(lx, ly, 5);
        
        
//        g.drawLine(100, 200, 400, 500);
//        g.drawLine(100, 500, 400, 200);
//        g.drawLine(250, 200, 250, 500);
//        
//        g.drawRect(100, 200, 300, 300);
//        g.drawOval(225, 200, 50, 300);
        
        
        //g.drawOval(100, 200, 300, 300);
        //g.drawOval(150, 300, 200, 100);
        
        //g.drawArc(100, 200, 300, 300, 45, 90);
        
        //Star and moon
       /*
        g.drawArc(100, 150, 350, 450, 90, 180);
        g.drawArc(170, 150, 200, 450, 90, 180);
        g.drawLine(230, 500, 325, 200);
        g.drawLine(325, 200, 400, 500);
        g.drawLine(400, 500, 180, 280);
        g.drawLine(180, 280, 470, 280);
        g.drawLine(470, 280, 230, 500);
       */ 
       
        
        
        
        
        
        
        
        
        
        
        
        //g.drawArc(700, 500, 1300, 400, 90, 270);
        //Color c8 = new Color(100, 255, 0);
        /*Color c9 = new Color(22, 82, 104);
        Color c10 = new Color(45, 91, 117);
        Color c11 = new Color(67, 113, 129);
        g.setColor(c8);
        g.setColor(c9);
        g.setColor(c10);*/
        //g.setColor(c8);
        //g.fillArc(700, 500, 1300, 400, 90, 270);
        
        
        
        //g.drawArc(730, 190, 40, 40, 0, 200);
        //g.drawLine(730, 215, 770, 225);
        //g.drawArc(730, 210, 40, 40, 180, 200);
        
        
        //int[] vx = {200, 100, 100, 300, 300};
        //int[] vy = {150, 200, 350, 350, 200};
        //g.drawPolyline(vx, vy, 5);
        //g.fillPolygon(vx, vy, 5);               
        
        //int[] ax = {200, 100, 100, 200, 200};
        //int[] ay = {50, 100, 250, 250, 100};
        //g.drawPolyline(ay, ay, 5);
        
    }
    
}
