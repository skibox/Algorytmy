package PracaDomowa1003.zadanieDomoweRPG.upgrades;

import PracaDomowa1003.zadanieDomoweRPG.Character;

public class DodatkowaTorba extends Dekorator{
	
	Character character;
	
	public DodatkowaTorba(Character character) {
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
		return character.getDefence();
	}

	@Override
	public void setDefence(int defence) {
		
	}

	@Override
	public int getPackVolume() {
		return character.getPackVolume() + 1;
	}

	@Override
	public void setPackVolume(int packVolume) {
		
	}

	@Override
	public String getName() {
		return "Dodatkowa torba";
	}

}
