package PracaDomowa1003.zadanie4;

public class FasadaLaboratorium {
	Koko koko;
	CukierPuder cukierPuder;
	Talk talk;
	
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
	}
	
	public void addSugar() {
		cukierPuder.add();
	}
	
	public void addKoko() {
		koko.add();
	}
	
	public void showAmounts() {
		System.out.println("Koko: " + koko.getAmount());
		System.out.println("Cukier: " + cukierPuder.getAmount());
		System.out.println("Talk: " + talk.getAmount());
	}
	
	

	
}
