package PracaDomowa1003.zadanieDomoweRPG;

public abstract class Character {
	protected String name;
	protected int attack;
	protected int defence;
	protected int packVolume;
	
	public abstract int getAttack();
	
	public abstract void setAttack(int attack);
	
	public abstract int getDefence();
	
	public abstract void setDefence(int defence);
	
	public abstract int getPackVolume();
	
	public abstract void setPackVolume(int packVolume);
	
	public abstract String getName();
	
	
	
}
