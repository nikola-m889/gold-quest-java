/*
package story;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import story.Main.Option;

public class Display {

	JFrame window;
	JPanel questName,questPanel, statusPanel, gameTextPanel, optionPanel;
	JLabel questTitle,statusHealth,statusHealthNum,statusWeapon,statusWeaponName,statusClass,statusClassName;
	JButton questActivate,option1,option2,option3,option4,option5;
	JTextArea gameText;
	Font titleFont = new Font("Times New Roman",Font.PLAIN,80);
	Font menuFont = new Font("Times New Roman",Font.PLAIN,28);
	Font optionFont = new Font("Times New Roman",Font.PLAIN,22);
	Hero hero = new Hero();
	
	public void startDisplay(Option option) {
		
		window = new JFrame();
		window.setSize(800,600);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//start menu
		questName = new JPanel();
		questName.setBounds(130,70,500,150);
		questName.setBackground(Color.black);
		questTitle = new JLabel("Gold Quest");
		questTitle.setForeground(Color.orange);
		questTitle.setFont(titleFont);
		questName.add(questTitle);
		window.add(questName);
		
		questPanel = new JPanel();
		questPanel.setBounds(310,400,190,80);
		questPanel.setBackground(Color.black);
		questPanel.setForeground(Color.orange);
		questActivate = new JButton("Start Game");
		questActivate.setFont(menuFont);
		questActivate.setBackground(Color.black);
		questActivate.setForeground(Color.orange);
		questActivate.setFocusPainted(false);
		questActivate.addActionListener(option);
		questActivate.setActionCommand("begin");
		questPanel.add(questActivate);
		window.add(questPanel);
		
		// game menu
		// status panel
		statusPanel = new JPanel();
		statusPanel.setBounds(80,40,600,30);
		statusPanel.setBackground(Color.black);
		statusPanel.setLayout(new GridLayout(1,6));
		window.add(statusPanel);
		
		statusHealth = new JLabel("HP:");
		statusHealth.setFont(menuFont);
		statusHealth.setForeground(Color.orange);
		statusPanel.add(statusHealth);
		statusHealthNum = new JLabel();
		statusHealthNum.setFont(menuFont);
		statusHealthNum.setForeground(Color.orange);
		statusPanel.add(statusHealthNum);
		statusWeapon = new JLabel("Weapon:");
		statusWeapon.setFont(menuFont);
		statusWeapon.setForeground(Color.orange);
		statusPanel.add(statusWeapon);
		statusWeaponName = new JLabel();
		statusWeaponName.setFont(menuFont);
		statusWeaponName.setForeground(Color.orange);
		statusPanel.add(statusWeaponName);
		statusClass = new JLabel("Class:");
		statusClass.setFont(menuFont);
		statusClass.setForeground(Color.orange);
		statusPanel.add(statusClass);
		statusClassName = new JLabel();
		statusClassName.setFont(menuFont);
		statusClassName.setForeground(Color.orange);
		statusPanel.add(statusClassName);
		
		gameTextPanel = new JPanel();
		gameTextPanel.setBounds(80, 100, 600, 200);
		gameTextPanel.setBackground(Color.black);
		window.add(gameTextPanel);
		
		gameText = new JTextArea("Second menu main text");
		gameText.setBounds(80, 150, 600, 200);
		gameText.setFont(menuFont);
		gameText.setBackground(Color.black);
		gameText.setForeground(Color.orange);
		gameText.setLineWrap(true);
		gameText.setWrapStyleWord(true);
		gameText.setEditable(false);
		gameTextPanel.add(gameText);
		
		optionPanel = new JPanel();
		optionPanel.setBounds(250,300,300,250);
		optionPanel.setBackground(Color.black);
		optionPanel.setLayout(new GridLayout(5,1));
		window.add(optionPanel);
		
		option1 = new JButton("option1");
		option1.setFont(optionFont);
		option1.addActionListener(option);
		option1.setActionCommand("one");
		option1.setBackground(Color.black);
		option1.setForeground(Color.orange);
		option1.setFocusPainted(false);
		optionPanel.add(option1);
		
		option2 = new JButton("option2");
		option2.setFont(optionFont);
		option2.addActionListener(option);
		option2.setActionCommand("two");
		option2.setBackground(Color.black);
		option2.setForeground(Color.orange);
		option2.setFocusPainted(false);
		optionPanel.add(option2);
		
		option3 = new JButton("option3");
		option3.setFont(optionFont);
		option3.addActionListener(option);
		option3.setActionCommand("three");
		option3.setBackground(Color.black);
		option3.setForeground(Color.orange);
		option3.setFocusPainted(false);
		optionPanel.add(option3);
		
		option4 = new JButton("option4");
		option4.setFont(optionFont);
		option4.addActionListener(option);
		option4.setActionCommand("four");
		option4.setBackground(Color.black);
		option4.setForeground(Color.orange);
		option4.setFocusPainted(false);
		optionPanel.add(option4);
		
		option5 = new JButton("option5");
		option5.setFont(optionFont);
		option5.addActionListener(option);
		option5.setActionCommand("five");
		option5.setBackground(Color.black);
		option5.setForeground(Color.orange);
		option5.setFocusPainted(false);
		optionPanel.add(option5);
		
		
		window.setVisible(true);
	}
	
}
*/


package story;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import story.Main.Option;

public class Display {

	JFrame window;
	JPanel questName,questPanel, statusPanel, statusPanel2, gameTextPanel, optionPanel;
	JLabel questTitle,statusHealth,statusHealthNum,statusWeapon,statusWeaponName,statusClass,statusClassName, statusLevel, statusLevelNum,statusExp,statusExpNum,statusGold,statusGoldNum;
	JButton questActivate,option1,option2,option3,option4,option5;
	JTextArea gameText;
	Font titleFont = new Font("Times New Roman",Font.PLAIN,80);
	Font menuFont = new Font("Times New Roman",Font.PLAIN,26);
	Font optionFont = new Font("Times New Roman",Font.PLAIN,22);
	Hero hero = new Hero();

	
	public void startDisplay(Option option) {
		
		window = new JFrame();
		window.setSize(800,600);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//start menu
		questName = new JPanel();
		questName.setBounds(130,70,500,150);
		questName.setBackground(Color.black);
		questTitle = new JLabel("Gold Quest");
		questTitle.setForeground(Color.orange);
		questTitle.setFont(titleFont);
		questName.add(questTitle);
		window.add(questName);
		
		questPanel = new JPanel();
		questPanel.setBounds(310,400,190,80);
		questPanel.setBackground(Color.black);
		questPanel.setForeground(Color.orange);
		questActivate = new JButton("Start Game");
		questActivate.setFont(menuFont);
		questActivate.setBackground(Color.black);
		questActivate.setForeground(Color.orange);
		questActivate.setFocusPainted(false);
		questActivate.addActionListener(option);
		questActivate.setActionCommand("begin");
		questPanel.add(questActivate);
		window.add(questPanel);
		
		// game menu
		// status panel
		statusPanel = new JPanel();
		statusPanel.setBounds(80,25,600,30);
		statusPanel.setBackground(Color.black);
		statusPanel.setLayout(new GridLayout(1,6));
		window.add(statusPanel);
		
		statusHealth = new JLabel("HP:");
		statusHealth.setFont(menuFont);
		statusHealth.setForeground(Color.orange);
		statusPanel.add(statusHealth);
		statusHealthNum = new JLabel();
		statusHealthNum.setFont(menuFont);
		statusHealthNum.setForeground(Color.orange);
		statusPanel.add(statusHealthNum);
		statusWeapon = new JLabel("Weapon:");
		statusWeapon.setFont(menuFont);
		statusWeapon.setForeground(Color.orange);
		statusPanel.add(statusWeapon);
		statusWeaponName = new JLabel();
		statusWeaponName.setFont(menuFont);
		statusWeaponName.setForeground(Color.orange);
		statusPanel.add(statusWeaponName);
		statusClass = new JLabel("Class:");
		statusClass.setFont(menuFont);
		statusClass.setForeground(Color.orange);
		statusPanel.add(statusClass);
		statusClassName = new JLabel();
		statusClassName.setFont(menuFont);
		statusClassName.setForeground(Color.orange);
		statusPanel.add(statusClassName);
		
		statusPanel2 = new JPanel();
		statusPanel2.setBounds(80,65,600,30);
		statusPanel2.setBackground(Color.black);
		statusPanel2.setLayout(new GridLayout(1,6));
		window.add(statusPanel2);
		
		statusLevel = new JLabel("Level:");
		statusLevel.setFont(menuFont);
		statusLevel.setForeground(Color.orange);
		statusPanel2.add(statusLevel);
		statusLevelNum = new JLabel();
		statusLevelNum.setFont(menuFont);
		statusLevelNum.setForeground(Color.orange);
		statusPanel2.add(statusLevelNum);
		statusExp = new JLabel("Exp:");
		statusExp.setFont(menuFont);
		statusExp.setForeground(Color.orange);
		statusPanel2.add(statusExp);
		statusExpNum = new JLabel();
		statusExpNum.setFont(menuFont);
		statusExpNum.setForeground(Color.orange);
		statusPanel2.add(statusExpNum);
		statusGold = new JLabel("Gold:");
		statusGold.setFont(menuFont);
		statusGold.setForeground(Color.orange);
		statusPanel2.add(statusGold);
		statusGoldNum = new JLabel();
		statusGoldNum.setFont(menuFont);
		statusGoldNum.setForeground(Color.orange);
		statusPanel2.add(statusGoldNum);
		
		
		gameTextPanel = new JPanel();
		gameTextPanel.setBounds(80, 100, 600, 200);
		gameTextPanel.setBackground(Color.black);
		window.add(gameTextPanel);
		
		gameText = new JTextArea("Second menu main text");
		gameText.setBounds(80, 150, 600, 200);
		gameText.setFont(menuFont);
		gameText.setBackground(Color.black);
		gameText.setForeground(Color.orange);
		gameText.setLineWrap(true);
		gameText.setWrapStyleWord(true);
		gameText.setEditable(false);
		gameTextPanel.add(gameText);
		
		optionPanel = new JPanel();
		optionPanel.setBounds(250,300,300,250);
		optionPanel.setBackground(Color.black);
		optionPanel.setLayout(new GridLayout(5,1));
		window.add(optionPanel);
		
		option1 = new JButton("option1");
		option1.setFont(optionFont);
		option1.addActionListener(option);
		option1.setActionCommand("one");
		option1.setBackground(Color.black);
		option1.setForeground(Color.orange);
		option1.setFocusPainted(false);
		optionPanel.add(option1);
		
		option2 = new JButton("option2");
		option2.setFont(optionFont);
		option2.addActionListener(option);
		option2.setActionCommand("two");
		option2.setBackground(Color.black);
		option2.setForeground(Color.orange);
		option2.setFocusPainted(false);
		optionPanel.add(option2);
		
		option3 = new JButton("option3");
		option3.setFont(optionFont);
		option3.addActionListener(option);
		option3.setActionCommand("three");
		option3.setBackground(Color.black);
		option3.setForeground(Color.orange);
		option3.setFocusPainted(false);
		optionPanel.add(option3);
		
		option4 = new JButton("option4");
		option4.setFont(optionFont);
		option4.addActionListener(option);
		option4.setActionCommand("four");
		option4.setBackground(Color.black);
		option4.setForeground(Color.orange);
		option4.setFocusPainted(false);
		optionPanel.add(option4);
		
		option5 = new JButton("option5");
		option5.setFont(optionFont);
		option5.addActionListener(option);
		option5.setActionCommand("five");
		option5.setBackground(Color.black);
		option5.setForeground(Color.orange);
		option5.setFocusPainted(false);
		optionPanel.add(option5);
		
		
		window.setVisible(true);
	}
	
}

