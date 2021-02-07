package story;

import chars_weapons.Bandit;
import chars_weapons.Bow;
import chars_weapons.Dagger;
import chars_weapons.Enemy;
import chars_weapons.LocCurrent;
import chars_weapons.MagicStaff;
import chars_weapons.Mudcrab;
import chars_weapons.Rat;
import chars_weapons.Sword;
import chars_weapons.Unarmed;

public class Location {
	
	Main mainC; //Game
	Display disp; //UI
	SetMenu menuC; //VisibilityManager
	Location2 location2;
	Hero hero=new Hero(); //player
	Enemy enemy; //Super monster
	LocCurrent a = new LocCurrent();

	
	String heroClass;
	public int goldenRelic;
	public int key=0;
	public int healthPotion=0;

	
	public Location(Main main, Display display, SetMenu menu, Location2 level2) {
		mainC=main;
		disp=display;
		menuC=menu;
		location2=level2;
	}
	
	public void chosenOption(String choice) {
		switch(choice) {
		case "warrior": 
		disp.statusClassName.setText("Warrior"); 
		heroClass="Warrior"; 
		hero.hp=30; 
		disp.statusHealthNum.setText(""+hero.hp); 
		hero.equipedWeapon = new Sword();
		disp.statusWeaponName.setText(hero.equipedWeapon.weaponName);
		break;
		
		case "mage": 
		disp.statusClassName.setText("Mage"); 
		heroClass="Mage"; 
		hero.hp=20; 
		disp.statusHealthNum.setText(""+hero.hp); 
		hero.equipedWeapon = new MagicStaff();
		disp.statusWeaponName.setText(hero.equipedWeapon.weaponName);
		break;
		
		case "archer": 
		disp.statusClassName.setText("Archer"); 
		heroClass="Archer"; 
		hero.hp=24; 
		disp.statusHealthNum.setText(""+hero.hp); 
		hero.equipedWeapon = new Bow();
		disp.statusWeaponName.setText(hero.equipedWeapon.weaponName);
		break;
		
		case "rogue": 
		disp.statusClassName.setText("Rogue"); 
		heroClass="Rogue"; 
		hero.hp=26; 
		disp.statusHealthNum.setText(""+hero.hp);
		hero.equipedWeapon = new Dagger();
		disp.statusWeaponName.setText(hero.equipedWeapon.weaponName);
		break;
		
		case "continue": 
			if(heroClass!="") {
				startArea();
			}
		break;
		
		case "goToMenu":
			startSettings();
			disp.statusClassName.setText("");
			break;
			
		case "searchDoor":
			Door();
			break;
			
		case "enterCastle":
			Castle();
			break;
		
		case "back":
			startArea();
			break;
		
		case "camp":
			Camp();
			break;
		
		case "searchKey":
			searchKey();
			break;
			
		case "ruins":
			Ruins();
			break;
			
		case "fight":
			Battle();
			break;
			
		case "attack":
			Attack();
			break;
			
		case "enemyAttack":
			EnemyTurn();
			break;
			
		case "enemyDefeated":
			Victorius();
			break;
			
		case "defeated":
			Lost();
			break;
				
		case "startMenu":
			StartMenu();
			break;
			
		case "climbLevel2":
			location2.startArea2();
			break;
			
			
			
		}
	}
	
	public void startSettings() {
		a.setLevel(1);
		hero.hp=25;
		disp.statusHealthNum.setText(""+hero.hp);
		hero.equipedWeapon = new Unarmed();
		disp.statusWeaponName.setText(hero.equipedWeapon.weaponName);
		disp.statusLevelNum.setText(""+hero.heroLevel);
		disp.statusExpNum.setText(""+hero.experienceTotal);
		disp.statusGoldNum.setText(""+hero.gold);
		heroClass="";
		goldenRelic=0;
		
		disp.gameText.setText("Choose your class: ");
		disp.option1.setText("Warrior");
		disp.option2.setText("Mage");
		disp.option3.setText("Archer");
		disp.option4.setText("Rogue");
		disp.option5.setText("Continue");
			
		mainC.place1="warrior";
		mainC.place2="mage";
		mainC.place3="archer";
		mainC.place4="rogue";
		mainC.place5="continue";
	}
	
	public void startArea() {
		hero.currentLevel.level=1;
		disp.gameText.setText("You are outside of ancient Castle known to contain ancient golden relic.\nDoors can be opened by a key");
		if(key==1) {
			disp.option1.setText("(Gate opened)Enter inside");
			mainC.place1="enterCastle";
		}else if(key==0) {
			disp.option1.setText("Search for hidden key");
			mainC.place1="searchKey";
		}
		
		disp.option2.setText("Go to your camp");
		disp.option3.setText("Go to neaby ruins");
		disp.option4.setText("Search around door");
		disp.option5.setText("Go back");
	
		mainC.place2="camp";
		mainC.place3="ruins";
		mainC.place4="searchDoor";
		mainC.place5="goToMenu";
	}
	
	public void searchKey() {
		disp.gameText.setText("After closely observing the area, you have come to conclusion that this type of door can be opened by pressing secret plate. \n Maybe you should go back and search area near door");
		disp.option1.setText("Go back to the door");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("");
		disp.option5.setText("");
		
		mainC.place1="back";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="";
		mainC.place5="";
	}
	
	public void Camp() {
		disp.gameText.setText("After resting in your camp your health increased by 4");
		hero.hp=hero.hp+4;
		disp.statusHealthNum.setText(""+hero.hp);
		disp.option1.setText("Go back");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("");
		disp.option5.setText("");
		
		mainC.place1="back";
	
	}
	
	public void Ruins() {
		
		int opponentChoice = new java.util.Random().nextInt(10);
		if(opponentChoice<=3) {
			enemy = new Rat();
		}
		else if(opponentChoice==4 && opponentChoice<=6) {
			enemy = new Mudcrab();
		}
		else if(opponentChoice==7 && opponentChoice<=9) {
			enemy = new Bandit();
		}
		
		
		disp.gameText.setText("Exploring the ruins, you are attacked by a "+enemy.enemyName+"!");
		disp.option1.setText("Fight");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("");
		disp.option5.setText("Go back");
		
	
		mainC.place1="fight";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="";
		mainC.place5="back";
	}
	
	public void Battle() {
		disp.gameText.setText("You have decided to fight "+enemy.enemyName);
		disp.option1.setText("Attack");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("");
		disp.option5.setText("Escape");
		
		mainC.place1="attack";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="";
		mainC.place5="back";
	}
	
	public void Attack() {
		int heroAttack = new java.util.Random().nextInt(hero.equipedWeapon.weaponDamage);
		disp.gameText.setText("You strike the "+enemy.enemyName+" inflicting "+heroAttack+" damage");
		enemy.hp=enemy.hp-heroAttack;
		
		disp.option1.setText("Next turn");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("");
		disp.option5.setText("");
		
		if(enemy.hp<=0) {
			mainC.place1="enemyDefeated";
		}
		else if(enemy.hp>0) {
			mainC.place1="enemyAttack";
		}
	}
	
	public void EnemyTurn() {
		int enemyAttack = new java.util.Random().nextInt(enemy.attackDamage);
		disp.gameText.setText(enemy.enemyName+" strikes back and inflicts "+enemyAttack+ " damage");
		
		hero.hp=hero.hp-enemyAttack;
		disp.statusHealthNum.setText(""+hero.hp);
		
		disp.option1.setText("Next turn");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("");
		disp.option5.setText("");
		
		if(hero.hp<=0) {
			mainC.place1="defeated";
		}
		else if(hero.hp>=0) {
			mainC.place1="attack";
		}
		
		mainC.place2="";
		mainC.place3="";
		mainC.place4="";
		mainC.place5="back";
	}
	
	public void Victorius() {
		int goldChance = new java.util.Random().nextInt(50);
		disp.gameText.setText("You are victorius against the fight with "+enemy.enemyName+"\n Enemy dropped "+goldChance+" gold");
		hero.gold=hero.gold+goldChance;
		disp.statusGoldNum.setText(""+hero.gold);
		hero.experienceTotal=hero.experienceTotal+50;
		disp.statusExpNum.setText(""+hero.experienceTotal);
		hero.experience=hero.experience+50;
		hero.enemiesDefeated++;
		if(hero.experience>=100) {
			hero.experience=0;
			hero.heroLevel++;
			hero.equipedWeapon.weaponDamage+=2;
			disp.statusLevelNum.setText(""+hero.heroLevel);
		}
		
		
		disp.option1.setText("Go back");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("");
		disp.option5.setText("");
		
		mainC.place1="back";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="";
		mainC.place5="";
	}
	
	public void Lost() {
		disp.gameText.setText("You have been defeated by "+enemy.enemyName);
		disp.option1.setText("Go back to the start menu");
		mainC.place1="startMenu";
	}
	
	public void StartMenu() {
		menuC.startScreen();
		startSettings();
	}
	
	
	public void Door() {
		disp.gameText.setText("Searching for key, you pressed secret pressure plate, unlocking the gate");
		key=1;
		disp.option1.setText("Go back");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("");
		disp.option5.setText("");
		
		mainC.place1="continue";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="";
		mainC.place5="";
	}
	
	public void Castle() {
		disp.gameText.setText("You entered inside castle.");
		disp.option1.setText("Go north");
		disp.option2.setText("Go east");
		disp.option3.setText("Go south(exit)");
		disp.option4.setText("Go west");
		disp.option5.setText("Climb the stairs(next level)");
		
		mainC.place1="north";
		mainC.place2="east";
		mainC.place3="back";
		mainC.place4="west";
		mainC.place5="climbLevel2";
	}
	

	
	
	
		
	
	

	
	
	
}
