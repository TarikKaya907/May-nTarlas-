/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayintarlasi2;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class anaekran2 {
protected int kolonsayi =9;    
protected int sutunsayi =9;
protected int mayin =10;
    JFrame frm= new JFrame("mayın tarlası");

    public static void main(String[] args) {
        anaekran2 ekran= new anaekran2();
        ekran.ilkekran();
    }
public void ilkekran(){
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frm.getContentPane().add(new mayinkoyma(9,9,10).getContent());
frm.setSize(550,450);
frm.setLocation(300,100);
frm.setVisible(true);
JMenuBar secenek= new JMenuBar();
secenek.setSize(550,100);
oyunsecenekleri(secenek);
frm.setJMenuBar(secenek);
frm.repaint();
frm.revalidate();

}
public void oyunsecenekleri(JMenuBar secenek) {
    JMenu dosya = new JMenu("Game");
    secenek.add(dosya);
    JMenuItem New= new JMenuItem("NEW");
    dosya.add(New);
    JMenuItem beginner = new JMenuItem("beginner");
    dosya.add(beginner);
    JMenuItem intermediate= new JMenuItem("Intermediate");
    dosya.add(intermediate);
    JMenuItem expert = new JMenuItem("Expert");
    dosya.add(expert);
    JMenuItem exit = new JMenuItem("Exit");
    dosya.add(exit);
    exit.addActionListener(new ActionListener() {
        
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    });
    New.addActionListener(new ActionListener() {
    @Override
public void actionPerformed(ActionEvent e) {
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.setVisible(false);
anaekran2 ekran = new anaekran2();
JFrame frame = new JFrame ("game");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(new mayinkoyma(9,9,10).getContent());
frame.setSize(550,450);
frame.setLocation(300,100);
frame.setVisible(true);
JMenuBar secenek = new JMenuBar();
frame.setJMenuBar(secenek);
ekran.oyunsecenekleri(secenek);
ekran.frm= frame;
}
});
beginner.addActionListener(new ActionListener() {
   @Override
public void actionPerformed(ActionEvent e) {   
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.setVisible(false);
    anaekran2 ekran = new anaekran2();
JFrame frame = new JFrame ("game");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(new mayinkoyma(9,9,10).getContent());
frame.setSize(550,450);
frame.setLocation(300,100);
frame.setVisible(true);
JMenuBar secenek = new JMenuBar();
frame.setJMenuBar(secenek);
ekran.oyunsecenekleri(secenek);
ekran.frm= frame;
}
});
intermediate.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent e) { 
       frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.setVisible(false);
    anaekran2 ekran = new anaekran2();
    JFrame frame = new JFrame ("game");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(new mayinkoyma(16,16,40).getContent());
frame.setSize(700,500);
frame.setLocation(300,50);
frame.setVisible(true);
JMenuBar secenek = new JMenuBar();
frame.setJMenuBar(secenek);
ekran.oyunsecenekleri(secenek);
ekran.frm= frame;
}
});
expert.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent e) { 
       frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.setVisible(false);
    anaekran2 ekran = new anaekran2();
    JFrame frame = new JFrame ("game");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(new mayinkoyma(16,30,99).getContent());
frame.setSize(1550,650);
frame.setLocation(200,30);
frame.setVisible(true);
JMenuBar secenek = new JMenuBar();
frame.setJMenuBar(secenek);
ekran.oyunsecenekleri(secenek);
ekran.frm= frame;
}
});
   
}

}