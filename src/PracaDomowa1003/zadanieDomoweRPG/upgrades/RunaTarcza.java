package PracaDomowa1003.zadanieDomoweRPG.upgrades;

import PracaDomowa1003.zadanieDomoweRPG.Character;

public class RunaTarcza extends Dekorator {
	Character character;
	static final int DEF = 5;

	public RunaTarcza(Character character) {
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
		return character.getDefence() + DEF;
	}

	@Override
	public void setDefence(int defence) {
		this.character.setDefence(DEF);
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
		return "z runą +" + DEF;
	}
}
