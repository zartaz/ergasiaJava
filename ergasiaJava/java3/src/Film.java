public class Film {
    private String title;
    private String director;
    private int playingTime;
    private boolean candidacy;
    private String showDate;

    public Film(String title, String director, int playingTime, String showDate) {
        this.title = title;
        this.director = director;
        this.playingTime = playingTime;
        this.showDate = showDate;
        this.candidacy = false;
    }

    public Film(String title) {
        this.title = title;
        this.director = "unknown";
        this.playingTime = -1;
        this.candidacy = false;
        this.showDate = "unknown";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    public boolean isCandidacy() {
        return candidacy;
    }

    public void setCandidacy(boolean candidacy) {
        this.candidacy = candidacy;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public void print(){
        System.out.println(title+", Director "+director);
        System.out.println(playingTime+" minutes "+showDate);
        if (candidacy)
            System.out.println("Candidate for Oscar!");
    }
}
