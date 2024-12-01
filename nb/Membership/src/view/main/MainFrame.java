/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.main;

import java.awt.FlowLayout;
import javax.swing.*;
import model.*;
import view.jenismember.JenisMemberFrame;
import view.member.MemberFrame;
import dao.*;

/**
 *
 * @author Haida
 */
public class MainFrame extends JFrame {
    private JenisMemberFrame jenisMemberFrame;
    private MemberFrame memberFrame;
    private JButton buttonJenisMember;
    private JButton buttonMember;
    private JenisMemberDao jenisMemberDao;
    private MemberDao memberDao;
    
    public MainFrame() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.setSize(400, 500);
        
        this.jenisMemberDao = new JenisMemberDao();
        this.memberDao = new MemberDao();
        
        this.jenisMemberFrame = new JenisMemberFrame(jenisMemberDao);
        this.memberFrame = new MemberFrame(memberDao, jenisMemberDao);
        
        this.setLayout(new FlowLayout());
        MainButtonActionListener actionListener = new MainButtonActionListener(this);
        
        this.buttonJenisMember = new JButton("Jenis Member");
        this.buttonMember = new JButton("Member");
        
        this.buttonJenisMember.addActionListener(actionListener);
        this.buttonMember.addActionListener(actionListener);
        
        this.add(buttonJenisMember);
        this.add(buttonMember);
    }
    
    public JButton getButtonJenisMember() {
        return buttonJenisMember;
    }
    
    public JButton getButtonMember() {
        return buttonMember;
    }
    
    public void showJenisMemberFrame() {
        if (jenisMemberFrame == null) {
            jenisMemberFrame = new JenisMemberFrame(jenisMemberDao);
        }
        jenisMemberFrame.setVisible(true);
    }
    
    public void showMemberFrame() {
        if (memberFrame == null) {
            memberFrame = new MemberFrame(memberDao, jenisMemberDao);
        }
        memberFrame.populateCombojenis();
        memberFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame f = new MainFrame();
                f.setVisible(true);
            }
        });
    }
}
