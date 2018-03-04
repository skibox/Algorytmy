package Zajecia0403.FasadaUbrania.Garderoba;

public class Demo {
	public static void main(String[] args) {
		FasadaGarderoba fasadaGarderoba = new FasadaGarderoba();
		fasadaGarderoba.wearForSummer();
		System.out.println(fasadaGarderoba.showClothes());
		System.out.println();
		fasadaGarderoba.wearForSpring();
		System.out.println(fasadaGarderoba.showClothes());
		System.out.println();
		fasadaGarderoba.wearForWinter();
		System.out.println(fasadaGarderoba.showClothes());
		System.out.println();
		fasadaGarderoba.justPutThemClothes();
		System.out.println(fasadaGarderoba.showClothes());
		System.out.println();
	}
}
