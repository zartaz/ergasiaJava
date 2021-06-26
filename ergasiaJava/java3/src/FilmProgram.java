import java.util.ArrayList;

public class FilmProgram {
    ArrayList<Film> list = new ArrayList<>();

    public FilmProgram() {

    }
    public void storeFilm(Film f){
        list.add(f);
    }
    public ArrayList<Film> getList(){
        return list;
    }
    public ArrayList<Film> candidateFilms(){
        ArrayList<Film> OscarList = new ArrayList<>();
        for (Film film : list) {
            if (film.isCandidacy())
                OscarList.add(film);
        }
        return OscarList;
    }
    public ArrayList<Film> monthFilms(int month){
        ArrayList<Film> monthList = new ArrayList<>();
        for (Film film : list){
            if (month==Integer.parseInt(film.getShowDate().substring(3,5)))
                monthList.add(film);
        }
        return monthList;
    }

    public double filmsMeanTime(){
        double totalTime = 0;
        for (Film film:list) {
            totalTime+=film.getPlayingTime();
        }
        return totalTime/list.size();
    }

    public void findfilm(String title){
        for (Film film:list){
            if (title.equals(film.getTitle())){
                film.print();
                return;
            }
        }
        System.out.println("The film "+title+" does not belong to the collection 2");
    }

    public void showFilms(ArrayList<Film> alist){
        for (Film film:alist){
            film.print();
            System.out.println();
        }
    }

}
