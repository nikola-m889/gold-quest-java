package story;

import chars_weapons.Bandit;
import chars_weapons.Bow;
import chars_weapons.Dagger;
import chars_weapons.EnchantDagger;
import chars_weapons.EnchantStaff;
import chars_weapons.EnchantSword;
import chars_weapons.Enemy;
import chars_weapons.Legendary_Sword;
import chars_weapons.LocCurrent;
import chars_weapons.LocKey;
import chars_weapons.MagicStaff;
import chars_weapons.Mudcrab;
import chars_weapons.Rat;
import chars_weapons.Skeleton;
import chars_weapons.Skeleton_Guardian;
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
	LocKey l = new LocKey();

	
	String heroClass;
	public int goldenRelic;
	public int key=0;
	public int bossKey=0;
	public int healthPotion=0;
	boolean armorLight=false;
	boolean armorHeavy=false;
	boolean bossDefeated=false;
	boolean InCastle=false;
	

	
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
			InCastle=false;
			break;
		
		case "camp":
			Camp();
			break;
		
		case "searchKey":
			searchKey();
			break;
			
		case "ruins":
			try {Ruins();}catch(Exception e) {}
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
			
		case "backToGame":
			menuC.gameScreen();
			startArea();
			break;
		
		case "backToCastleL1":
			Castle();
			break;
			
		case "north":
			North();
			break;
			
		case "east":
			East();
			break;
			
		case "west":
			West();
		break;
			
		case "buyDagger":
			hero.equipedWeapon = new EnchantDagger();
			if(hero.gold >= 30) {
				hero.gold = hero.gold - 30;
				disp.statusGoldNum.setText(""+hero.gold);
				disp.statusWeaponName.setText(hero.equipedWeapon.weaponName);
			}
			break;
			
		case "buySword":
			hero.equipedWeapon = new EnchantSword();
			if(hero.gold >= 50) {
				hero.gold = hero.gold - 50;
				disp.statusGoldNum.setText(""+hero.gold);
				disp.statusWeaponName.setText(hero.equipedWeapon.weaponName);
			}	
			break;
			
		case "buyStaff":
			hero.equipedWeapon = new EnchantStaff();
			if(hero.gold >= 70) {
				hero.gold = hero.gold - 70;
				disp.statusGoldNum.setText(""+hero.gold);
				disp.statusWeaponName.setText(hero.equipedWeapon.weaponName);
			}
			break;
			
		case "buyPotion":
			if(hero.gold>=10) {
			hero.hp=hero.hp+20;
			hero.gold=hero.gold-10;
			disp.statusHealthNum.setText(""+hero.hp);
			disp.statusGoldNum.setText(""+hero.gold);
			}
			break;
			
		case "buyLightArmor":
			if(hero.gold>=50 && armorLight==false) {
			armorLight=true;
			if(armorHeavy==true) {
				armorHeavy=false;
				hero.hp=hero.hp-120;
			}
			hero.hp=hero.hp+70;
			hero.gold=hero.gold-50;
			disp.statusHealthNum.setText(""+hero.hp);
			disp.statusGoldNum.setText(""+hero.gold);
			}
			break;
		
		case "buyHeavyArmor":
			if(hero.gold>=70 && armorHeavy==false) {
				armorHeavy=true;
				if(armorLight==true) {
					armorLight=false;
					hero.hp=hero.hp-70;
				}
				hero.hp=hero.hp+120;
				hero.gold=hero.gold-70;
				disp.statusHealthNum.setText(""+hero.hp);
				disp.statusGoldNum.setText(""+hero.gold);
			}
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
		disp.gameText.setText("After closely observing the area, you have come to conclusion that this type of door can be opened by pressing a secret plate. \n Maybe you should go back and search area near the door");
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
		menuC.storeScreen();
		disp.statusHealthNum.setText(""+hero.hp);
		disp.option1.setText("");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("");
		disp.option5.setText("Go back");
		
		disp.storeButton1.setText("Buy");
		disp.storeButton2.setText("Buy");
		disp.storeButton3.setText("Buy");
		disp.storeButton4.setText("Buy");
		disp.storeButton5.setText("Buy");
		disp.storeButton6.setText("Buy");
		
		mainC.store1="buyDagger";
		mainC.store2="buySword";
		mainC.store3="buyStaff";
		mainC.store4="buyPotion";
		mainC.store5="buyLightArmor";
		mainC.store6="buyHeavyArmor";
		
		mainC.place1="";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="";
		mainC.place5="backToGame";
	
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
		if(InCastle==true) {
			mainC.place5="backToCastleL1";
		}else if(InCastle==false) {
			mainC.place5="back";
		}
		
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
		if(InCastle==true) {
			mainC.place5="backToCastleL1";
		}else if(InCastle==false) {
			mainC.place5="back";
		}
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
			hero.hp=0;
			disp.statusHealthNum.setText(""+hero.hp);
			mainC.place1="defeated";
		}
		else if(hero.hp>=0) {
			mainC.place1="attack";
		}
		
		mainC.place2="";
		mainC.place3="";
		mainC.place4="";
		if(InCastle==true) {
			mainC.place5="backToCastleL1";
		}else if(InCastle==false) {
			mainC.place5="back";
		}
	}
	
	public void Victorius() {
		int goldChance = new java.util.Random().nextInt(50);
		disp.gameText.setText("You are victorius against the fight with "+enemy.enemyName+"\n Enemy dropped "+goldChance+" gold");
		if(enemy.enemyName=="Skeleton Guardian") {
			disp.gameText.setText("Guardian dropped "+goldChance+" gold "+"and the key needed to unlock treasure room in the level above");
			bossKey=1;
			l.setKey(1);
		}
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
		
		if(InCastle==true) {
			mainC.place1="backToCastleL1";
		}else if(InCastle==false) {
			mainC.place1="back";
		}
		mainC.place2="";
		mainC.place3="";
		mainC.place4="";
		mainC.place5="";
	}
	
	public void Lost() {
		disp.statusHealthNum.setText(""+hero.hp);
		disp.gameText.setText("You have been defeated by a "+enemy.enemyName);
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
		InCastle=true;
		disp.gameText.setText("You are inside the castle.");
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
	
	public void North() {
		disp.gameText.setText("You found small health potion, restoring your health by 5");
		hero.hp=hero.hp+5;
		disp.statusHealthNum.setText(""+hero.hp);
		disp.option1.setText("");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("");
		disp.option5.setText("go back to previous room");
		
		mainC.place1="";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="";
		mainC.place5="backToCastleL1";
	}
	
	public void East() {
		int castleEnemyChance = new java.util.Random().nextInt(10);
		if(castleEnemyChance<=5) {
			enemy = new Skeleton();
		}
		else if(castleEnemyChance>=6 && bossKey==0) {
			enemy = new Skeleton_Guardian();
		}
			
		disp.gameText.setText("Exploring the eastern part of the castle you are attacked by "+enemy.enemyName);
		disp.option1.setText("Attack");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("");
		disp.option5.setText("Escape");
		
		mainC.place1="attack";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="";
		mainC.place5="backToCastleL1";
	}
	
	public void West() {
		disp.gameText.setText("Exploring the western part of the castle you have found a legendary sword");
		hero.equipedWeapon= new Legendary_Sword();
		disp.statusWeaponName.setText(hero.equipedWeapon.weaponName);
		disp.option1.setText("");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("");
		disp.option5.setText("go back");
		
		mainC.place1="";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="";
		mainC.place5="backToCastleL1";
	}
	


	
	
	
		
	
	

	
	
	
}
