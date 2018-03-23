package PracaDomowa1003.zadanie4;

public class FasadaLaboratorium {
	Koko koko;
	CukierPuder cukierPuder;
	Talk talk;
	
	int sugarAdded = 0;
	int talkAdded = 0;
	
	double kokoToAdulterants = 0.0;
	
	public FasadaLaboratorium(Koko koko) {
		this.koko = koko;
	}
	
	public FasadaLaboratorium(Koko koko, CukierPuder cukierPuder, Talk talk) {
		this.koko = koko;
		this.cukierPuder = cukierPuder;
		this.talk = talk;
	}
	
//	public FasadaLaboratorium(Object ... objects) {
//		if(objects[0] != null) this.koko = (Koko)objects[0];
//		if(objects[1] != null) this.cukierPuder = (CukierPuder)objects[1];
//		if(objects[2] != null) this.talk = (Talk)objects[2];
//	}
	
	public void addTalk() {
		talk.add();
		talkAdded += 100;
	}
	
	public void addSugar() {
		cukierPuder.add();
		sugarAdded += 100;
	}
	
	public void addKoko() {
		koko.add();
	}
	
	public void showAmounts() {
		System.out.println("Koko: " + koko.getAmount());
		System.out.println("Cukier: " + cukierPuder.getAmount());
		System.out.println("Talk: " + talk.getAmount());
	}
	
	public void getKoko30() {
		this.cukierPuder = new CukierPuder(0);
		this.talk = new Talk(0);
		while((double)koko.getAmount() / (koko.getAmount() + cukierPuder.getAmount() + talk.getAmount()) > 0.3){
			addSugar();
			addSugar();
			addTalk();
		}
		kokoToAdulterants = (double)koko.getAmount() / (koko.getAmount() + cukierPuder.getAmount() + talk.getAmount());

	}
	
	public void getKokoPremium60() {
		this.cukierPuder = new CukierPuder(0);
		this.talk = new Talk(0);
		while((double)koko.getAmount() / (koko.getAmount() + cukierPuder.getAmount() + talk.getAmount()) > 0.6){
			addSugar();
			addSugar();
			addTalk();
		}
		kokoToAdulterants = (double)koko.getAmount() / (koko.getAmount() + cukierPuder.getAmount() + talk.getAmount());

	}
	

	
}
