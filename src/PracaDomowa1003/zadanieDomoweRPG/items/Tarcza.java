package PracaDomowa1003.zadanieDomoweRPG.items;

import PracaDomowa1003.zadanieDomoweRPG.Character;

public class Tarcza extends Character{
	Character character;
	
	public Tarcza(Character character) {
		this.character = character;
	}
	
	@Override
	public int getAttack() {
		return character.getAttack();
	}

	@Override
	public void setAttack(int attack) {
		
	}

	@Override
	public int getDefence() {
		return 0;
	}

	@Override
	public void setDefence(int defence) {
		
	}

	@Override
	public int getPackVolume() {
		return 0;
	}

	@Override
	public void setPackVolume(int packVolume) {
		
	}

	@Override
	public String getName() {
		return null;
	}

}
