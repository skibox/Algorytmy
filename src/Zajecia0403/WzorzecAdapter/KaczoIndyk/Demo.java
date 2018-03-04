package Zajecia0403.WzorzecAdapter.KaczoIndyk;

public class Demo {
	public static void main(String[] args) {
		Indyk indyk = new DzikiIndyk();
		Kaczka czyToKaczkaCzyToIndyk = new IndykAdapter(indyk);

		indyk.gulgaj();
		czyToKaczkaCzyToIndyk.kwacz();
	}
}
