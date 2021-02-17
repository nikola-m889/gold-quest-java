/*
package story;


import chars_weapons.Enemy;
import chars_weapons.LocL2;


public class Location2{
	
	Main mainC;
	Display disp;
	SetMenu menuC;
	Hero hero = new Hero();
	Enemy enemy;
	
	
	
	public Location2(Main main, Display display,SetMenu menu) {
		mainC=main;
		disp=display;
		menuC=menu;
		hero.currentLevel = new LocL2();
	}
	
	public void chosenOption(String choice) {
		switch(choice) {
		case "north": northL2(); break;
		case "east": eastL2(); break;
		case "south": southL2(); break;
		case "west": westL2(); break;
		case "back": startArea2(); break;
		}
	}
	
	public void startArea2() {

		System.out.println("inside location2, location is set to "+hero.currentLevel.level);
		disp.gameText.setText("You have climbed to level 2");
		disp.option1.setText("Go north");
		disp.option2.setText("Go east");
		disp.option3.setText("Go south");
		disp.option4.setText("Go west");
		disp.option5.setText("Go to the next level");
	
		
		
		mainC.place1="north";
		mainC.place2="east";
		mainC.place3="south";
		mainC.place4="west";
		mainC.place5="level3";
	}
	
	public void northL2() {
		disp.gameText.setText("north");
		disp.option1.setText("");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("");
		disp.option5.setText("");
		
		mainC.place1="north";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="";
		mainC.place5="";
	}
	
	public void eastL2() {
		disp.gameText.setText("east");
		disp.option1.setText("");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("");
		disp.option5.setText("");
		
		mainC.place1="east";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="";
		mainC.place5="";
	}
	
	public void southL2() {
		disp.gameText.setText("go back to previous level");
		disp.option1.setText("");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("");
		disp.option5.setText("");
		
		mainC.place1="south";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="";
		mainC.place5="";
	}
	
	public void westL2() {
		disp.gameText.setText("west");
		disp.option1.setText("");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("");
		disp.option5.setText("");
		
		mainC.place1="west";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="";
		mainC.place5="";
	}
	
}
*/

package story;


import chars_weapons.Enemy;
import chars_weapons.Legendary_MageStaff;
import chars_weapons.LocCurrent;
import chars_weapons.LocKey;



public class Location2{
	
	Main mainC;
	Display disp;
	SetMenu menuC;
	Hero hero = new Hero();
	Enemy enemy;
	LocCurrent a = new LocCurrent();
	LocKey l = new LocKey();
	boolean potionFound=false;
	boolean relicFound=false;

	
	
	public Location2(Main main, Display display,SetMenu menu) {
		mainC=main;
		disp=display;
		menuC=menu;
	}
	
	public void chosenOption(String choice) {
		switch(choice) {
		case "north": northL2(); break;
		case "east": eastL2(); break;
		case "south": southL2(); break;
		case "west": westL2(); break;
		case "back": startArea2(); break;
		case "locked": Locked(); break;
		
		}
	}
	
	public void startArea2() {
		a.setLevel(2);
		disp.gameText.setText("You have climbed to level 2");
		
		if(l.bossKey==0) {
			mainC.place1="locked";
			disp.option1.setText("Treasure room(locked)");
		}
		else if(l.bossKey==1) {
			mainC.place1="north";
			disp.option1.setText("Treasure room");
		}
		
		disp.option2.setText("Go to right room");
		disp.option3.setText("Go to left room");
		disp.option4.setText("Explore current location");
		disp.option5.setText("Go to previous level");
	
		
		mainC.place2="east";
		mainC.place3="south";
		mainC.place4="west";
		
	}
	
	public void Locked() {
		disp.gameText.setText("Door to tresure room is locked, you must get key from skeleton guardian bellow");
		disp.option1.setText("");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("Go to previous room");
		disp.option5.setText("Go to previous level");
		
		mainC.place1="";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="back";
		
		
	}
	
	public void northL2() {
		if(relicFound==true)
			disp.gameText.setText("Tresure room is empty since you took golden relic.");
		else
			disp.gameText.setText("You have found golden relic!");
			relicFound=true;
		
		disp.option1.setText("");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("Go to previous room");
		disp.option5.setText("Go to previous level");
		
		mainC.place1="";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="back";
	}
	
	public void eastL2() {
		disp.gameText.setText("You have found legendary mage staff!");
		hero.equipedWeapon=new Legendary_MageStaff();
		disp.statusWeaponName.setText(hero.equipedWeapon.weaponName);
		disp.option1.setText("");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("go to previous room");
		disp.option5.setText("go to previous level");
		
		mainC.place1="";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="back";
	}
	
	public void southL2() {
		disp.gameText.setText("You found nothing of value");
		
		disp.option1.setText("");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("Return to previous room");
		disp.option5.setText("Return to previous level");
		
		mainC.place1="";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="back";
	}
	
	public void westL2() {
		if(potionFound==false) {
			disp.gameText.setText("After exploring the current level, you found powerful health potion, increasing your health by 200");
			hero.hp=hero.hp+200;
			disp.statusHealthNum.setText(""+hero.hp);
			potionFound=true;
		}else if(potionFound==true){
			disp.gameText.setText("After exploring the current level, you found nothing except empty bottle of health potion.");
		}
		
		
		disp.option1.setText("");
		disp.option2.setText("");
		disp.option3.setText("");
		disp.option4.setText("Return to previous room");
		disp.option5.setText("Return to previous level");
		
		mainC.place1="west";
		mainC.place2="";
		mainC.place3="";
		mainC.place4="back";
	}
	
}