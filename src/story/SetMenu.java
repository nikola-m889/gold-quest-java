package story;

public class SetMenu {

	Display disp;
	
	public SetMenu(Display display) {
		disp=display;
	}
	
	public void startScreen() {
		disp.questName.setVisible(true);
		disp.questPanel.setVisible(true);
		disp.statusPanel.setVisible(false);
		disp.statusPanel2.setVisible(false);
		disp.gameTextPanel.setVisible(false);
		disp.optionPanel.setVisible(false);
		disp.weaponsPanel.setVisible(false);
		disp.optionWeapons.setVisible(false);
		disp.itemsPanel.setVisible(false);
		disp.optionItems.setVisible(false);
	}
	
	public void gameScreen() {
		disp.questName.setVisible(false);
		disp.questPanel.setVisible(false);
		disp.statusPanel.setVisible(true);
		disp.statusPanel2.setVisible(true);
		disp.gameTextPanel.setVisible(true);
		disp.optionPanel.setVisible(true);
		disp.weaponsPanel.setVisible(false);
		disp.optionWeapons.setVisible(false);
		disp.itemsPanel.setVisible(false);
		disp.optionItems.setVisible(false);
	}
	public void storeScreen() {
		disp.questName.setVisible(false);
		disp.questPanel.setVisible(false);
		disp.statusPanel.setVisible(true);
		disp.statusPanel2.setVisible(true);
		disp.gameTextPanel.setVisible(false);
		disp.optionPanel.setVisible(true);
		disp.weaponsPanel.setVisible(true);
		disp.optionWeapons.setVisible(true);
		disp.itemsPanel.setVisible(true);
		disp.optionItems.setVisible(true);
	}
}
