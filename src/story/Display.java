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
	JPanel questName,questPanel, statusPanel, statusPanel2, gameTextPanel, optionPanel,weaponsPanel,itemsPanel,optionWeapons,optionWeapons2, optionItems;
	JLabel questTitle,statusHealth,statusHealthNum,statusWeapon,statusWeaponName,statusClass,statusClassName, statusLevel, statusLevelNum,statusExp,statusExpNum,statusGold,statusGoldNum,weaponsTitle,weaponsSword,weaponsDagger,weaponsStaff,itemsTitle,itemsPotion,itemsArmor1,itemsArmor2;
	JButton questActivate,option1,option2,option3,option4,option5,storeButton1,storeButton2,storeButton3,storeButton4,storeButton5,storeButton6;
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
		
		//store
		
		weaponsPanel = new JPanel();
		weaponsPanel.setBounds(10,95,250,200);
		weaponsPanel.setBackground(Color.black);
		weaponsPanel.setLayout(new GridLayout(4,1));
		window.add(weaponsPanel);
		
		weaponsTitle = new JLabel("Weapons:");
		weaponsTitle.setFont(optionFont);
		weaponsTitle.setForeground(Color.orange);
		weaponsPanel.add(weaponsTitle);
		
		weaponsDagger = new JLabel("Enchanted Dagger(30 gold)");
		weaponsDagger.setFont(optionFont);
		weaponsDagger.setForeground(Color.orange);
		weaponsPanel.add(weaponsDagger);
		weaponsSword = new JLabel("Enchanted Sword(50 gold)");
		weaponsSword.setFont(optionFont);
		weaponsSword.setForeground(Color.orange);
		weaponsPanel.add(weaponsSword);
		weaponsStaff = new JLabel("Enchanted Staff(70 gold)");
		weaponsStaff.setFont(optionFont);
		weaponsStaff.setForeground(Color.orange);
		weaponsPanel.add(weaponsStaff);
		
		optionWeapons = new JPanel();
		optionWeapons.setBounds(300,105,70,190);
		optionWeapons.setBackground(Color.black);
		optionWeapons.setLayout(new GridLayout(3,1));
		window.add(optionWeapons);
		
		
		
		storeButton1 = new JButton("");
		storeButton1.setFont(optionFont);
		storeButton1.addActionListener(option);
		storeButton1.setActionCommand("item1");
		storeButton1.setBackground(Color.black);
		storeButton1.setForeground(Color.orange);
		storeButton1.setFocusPainted(false);
		optionWeapons.add(storeButton1);
		
		storeButton2 = new JButton("");
		storeButton2.setFont(optionFont);
		storeButton2.addActionListener(option);
		storeButton2.setActionCommand("item2");
		storeButton2.setBackground(Color.black);
		storeButton2.setForeground(Color.orange);
		storeButton2.setFocusPainted(false);
		optionWeapons.add(storeButton2);
		
		storeButton3 = new JButton("");
		storeButton3.setFont(optionFont);
		storeButton3.addActionListener(option);
		storeButton3.setActionCommand("item3");
		storeButton3.setBackground(Color.black);
		storeButton3.setForeground(Color.orange);
		storeButton3.setFocusPainted(false);
		optionWeapons.add(storeButton3);
		
		// store second column
		
		itemsPanel = new JPanel();
		itemsPanel.setBounds(390,95,250,190);
		itemsPanel.setBackground(Color.black);
		itemsPanel.setLayout(new GridLayout(4,1));
		window.add(itemsPanel);
		
		itemsTitle = new JLabel("Items:");
		itemsTitle.setFont(optionFont);
		itemsTitle.setForeground(Color.orange);
		itemsPanel.add(itemsTitle);
		
		itemsPotion = new JLabel("Health Potion (10gold)");
		itemsPotion.setFont(optionFont);
		itemsPotion.setForeground(Color.orange);
		itemsPanel.add(itemsPotion);
		
		itemsArmor1 = new JLabel("Light Armor (50gold)");
		itemsArmor1.setFont(optionFont);
		itemsArmor1.setForeground(Color.orange);
		itemsPanel.add(itemsArmor1);
		
		itemsArmor2 = new JLabel("Heavy Armor (70gold");
		itemsArmor2.setFont(optionFont);
		itemsArmor2.setForeground(Color.orange);
		itemsPanel.add(itemsArmor2);
		
		optionItems = new JPanel();
		optionItems.setBounds(650,105,70,190);
		optionItems.setBackground(Color.black);
		optionItems.setLayout(new GridLayout(3,1));
		window.add(optionItems);
		
		
		storeButton4 = new JButton("");
		storeButton4.setFont(optionFont);
		storeButton4.addActionListener(option);
		storeButton4.setActionCommand("item4");
		storeButton4.setBackground(Color.black);
		storeButton4.setForeground(Color.orange);
		storeButton4.setFocusPainted(false);
		optionItems.add(storeButton4);
		
		storeButton5 = new JButton("");
		storeButton5.setFont(optionFont);
		storeButton5.addActionListener(option);
		storeButton5.setActionCommand("item5");
		storeButton5.setBackground(Color.black);
		storeButton5.setForeground(Color.orange);
		storeButton5.setFocusPainted(false);
		optionItems.add(storeButton5);
		
		storeButton6 = new JButton("");
		storeButton6.setFont(optionFont);
		storeButton6.addActionListener(option);
		storeButton6.setActionCommand("item6");
		storeButton6.setBackground(Color.black);
		storeButton6.setForeground(Color.orange);
		storeButton6.setFocusPainted(false);
		optionItems.add(storeButton6);
		
		
		window.setVisible(true);
	}
	
}

