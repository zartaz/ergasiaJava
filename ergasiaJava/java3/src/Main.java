public class Main {

    public static void main(String[] args) {
	FilmProgram thriller = new FilmProgram();
	Film dracula = new Film("dracula","iskioupis",110,"11/11/2007");
	Film leykes = new Film("fredy kruger","karakatsanis",125,"08/08/2008");
	Film Bob = new Film("Spongebob","eleftheriou",180,"07/07/2007");

	dracula.setCandidacy(true);
	leykes.setCandidacy(true);

	thriller.storeFilm(dracula);
	thriller.storeFilm(leykes);
	thriller.storeFilm(Bob);


	System.out.println("\n");
	System.out.println("***** QUESTION e: show the list of all the films *****\n");
	thriller.showFilms(thriller.getList());
	System.out.println("--------------------\n");

	System.out.println("***** QUESTION f: show the list of films that are candidate for OSCAR *****\n");
	thriller.showFilms(thriller.candidateFilms());
	System.out.println("--------------------\n");

	thriller.showFilms(thriller.monthFilms(8));
	System.out.println("--------------------\n");
	System.out.println("The mean playing time of all the films in the collection is "+thriller.filmsMeanTime());
	System.out.println("--------------------\n");

	System.out.println("Search for dracula\n");
	thriller.findfilm("dracula");
	System.out.println("--------------------\n");

	System.out.println("Search for gouzgounis\n");
	thriller.findfilm("gouzgounis");
	System.out.println("--------------------");

    }
}
