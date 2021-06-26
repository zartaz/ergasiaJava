public class Main {

    public static void main(String[] args) {
	Computer ktinos = new Computer("pyrgos1",1500.00,10);
	Computer xalaropyrgos = new Computer("aio",330.00,4);
	Laptop zartonium = new Laptop("laptopara",3500.00,10,3.2);
	Laptop iskioup = new Laptop("notepad",15.20,2,0.3);

	System.out.println(ktinos.toString());
	System.out.println(xalaropyrgos.toString());
	System.out.println(zartonium.toString());
	System.out.println(iskioup.toString());

// xrisimopoiisa tostring() giati den xreiazetai na kanw extra methodo gia print, einai i default !
	}
}
