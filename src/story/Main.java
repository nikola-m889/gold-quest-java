/*
package story;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import chars_weapons.LocL1;
import chars_weapons.LocL2;

public class Main {
	
	Display display = new Display();//UI
	Option option  = new Option(); //Listener
	SetMenu menu = new SetMenu(display); //Visibility
	Location2 location2 = new Location2(this,display,menu);
	Location location = new Location(this,display,menu,location2);
	Hero hero = new Hero();
	
	String place1,place2,place3,place4,place5;

	public static void main(String[] args) {
		
		new Main();
	}
	
	public Main() {
		display.startDisplay(option);
		menu.startScreen();
		location.startSettings();
		
	}
	
	
	public class Option implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			String selectedOption = event.getActionCommand();
			
			if(location.hero.currentLevel.level==1) {
				System.out.println("location 1");
				switch(selectedOption) {
				case "begin": menu.gameScreen(); location.startSettings(); break;
				case "one": location.chosenOption(place1); break;
				case "two": location.chosenOption(place2); break;
				case "three": location.chosenOption(place3); break;
				case "four": location.chosenOption(place4); break;
				case "five": location.chosenOption(place5); break;
				}
			}
	
	
			
		}
	}

}
*/

/* v2
package story;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import chars_weapons.LocCurrent;
import chars_weapons.LocL1;
import chars_weapons.LocL2;

public class Main {
	
	Display display = new Display();//UI
	Option option  = new Option(); //Listener
	SetMenu menu = new SetMenu(display); //Visibility
	Location2 location2 = new Location2(this,display,menu);
	Location location = new Location(this,display,menu,location2);
	Hero hero = new Hero();
	String place1,place2,place3,place4,place5;
	LocCurrent a = new LocCurrent();
	
	public static void main(String[] args) {
		
		new Main();
	}
	
	public Main() {
		display.startDisplay(option);
		menu.startScreen();
		location.startSettings();
		
	}
	
	
	public class Option implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			String selectedOption = event.getActionCommand();
			
			if(location.hero.currentLevel.level==1) {
				System.out.println("location 1");
				System.out.println("selectedOption,level:"+a.level);
				switch(selectedOption) {
				case "begin": menu.gameScreen(); location.startSettings(); break;
				case "one": location.chosenOption(place1); break;
				case "two": location.chosenOption(place2); break;
				case "three": location.chosenOption(place3); break;
				case "four": location.chosenOption(place4); break;
				case "five": location.chosenOption(place5); break;
				}
			}else if(location2.hero.currentLevel.level==2) {
				
				switch(selectedOption) {
				
				case "one": location2.chosenOption(place1); break;
				case "two": location2.chosenOption(place2); break;
				case "three": location2.chosenOption(place3); break;
				case "four": location2.chosenOption(place4); break;
				case "five": location2.chosenOption(place5); break;
				}
			}
	
	
			
		}
	}

}
*/

package story;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import chars_weapons.LocCurrent;


public class Main {
	
	Display display = new Display();//UI
	Option option  = new Option(); //Listener
	SetMenu menu = new SetMenu(display); //Visibility
	Location2 location2 = new Location2(this,display,menu);
	Location location = new Location(this,display,menu,location2);
	Hero hero = new Hero();
	String place1,place2,place3,place4,place5;
	String store1,store2,store3,store4,store5,store6;
	LocCurrent a = new LocCurrent();

	
	public static void main(String[] args) {
		
		new Main();
	}
	
	public Main() {
		display.startDisplay(option);
		menu.startScreen();
		location.startSettings();
	}
	
	
	public class Option implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			String selectedOption = event.getActionCommand();
			
			if(a.level==1) {
				switch(selectedOption) {
				case "begin": menu.gameScreen(); location.startSettings(); break;
				case "one": location.chosenOption(place1); break;
				case "two": location.chosenOption(place2); break;
				case "three": location.chosenOption(place3); break;
				case "four": location.chosenOption(place4); break;
				case "five": location.chosenOption(place5); break;
				case "item1": location.chosenOption(store1);break;
				case "item2": location.chosenOption(store2);break;
				case "item3": location.chosenOption(store3);break;
				case "item4": location.chosenOption(store4);break;
				case "item5": location.chosenOption(store5);break;
				case "item6": location.chosenOption(store6);break;
				}
			}else if(a.level==2) {
				switch(selectedOption) {
				case "one": location2.chosenOption(place1); break;
				case "two": location2.chosenOption(place2); break;
				case "three": location2.chosenOption(place3); break;
				case "four": location2.chosenOption(place4); break;
				case "five": location.Castle(); a.level=1;break;
				}
			}
		}
	}
	
}