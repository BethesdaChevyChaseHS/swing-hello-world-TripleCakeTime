package com.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) { 
      //add your code here!
      JFrame frame = new JFrame("Hello Swing");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(600,200);
      
      JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
      JButton button1 = new JButton("press me");
      JButton button2 = new JButton("press me to");
      JButton button3 = new JButton("press me more");
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout());
      panel.setSize(1000,200);
      
      panel.add(label);
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      frame.add(panel);
      
      button1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
          label.setText("You did it!");
        }
      });
      button2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
          label.setText("You did it! AGAIN!");
        }
      });
      button3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
          label.setText("You did it! better");
        }
      });

      frame.pack();                
      frame.setLocationRelativeTo(null); 
      frame.setVisible(true);





      
    }
}