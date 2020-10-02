/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1form.form;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author trancaominhbach
 */
public class control extends JFrame{
    public control(String title) throws HeadlessException{
        super(title);
        this.setSize(720,1080);
    }
    public static void main(String[] args) {
        control f = new control("Quan ly sinh vien");
        formsv sv = new formsv();
        f.setVisible(true);
        f.add(sv);
    }
}
