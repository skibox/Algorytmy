package PracaDomowa1003.zadanieDomoweRPG.upgrades;

import PracaDomowa1003.zadanieDomoweRPG.Character;

public class RunaMiecz extends Dekorator{
	
	Character character;
	static final int ATT = 5;
	public RunaMiecz(Character character) {
		this.character = character;
	}
	
	@Override
	public int getAttack() {
		return character.getAttack() + ATT;
	}

	@Override
	public void setAttack(int attack) {
		this.attack += ATT;
	}

	@Override
	public int getDefence() {
		return character.getDefence();
	}

	@Override
	public void setDefence(int defence) {
		
	}

	@Override
	public int getPackVolume() {
		return character.getPackVolume();
	}

	@Override
	public void setPackVolume(int packVolume) {
		
	}

	@Override
	public String getName() {
		return " z runą +" + ATT;
	}
}
