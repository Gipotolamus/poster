public class PosterManager {
    private String[] posters = new String[0];
    private int max;

    public PosterManager() {
        this.max = 5;
    }

    public PosterManager(int max) {
        this.max = max;
    }

    public void addPoster(String poster) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        this.posters = tmp;
    }

    public String[] findAll() {
        return posters;
    }

    public String[] findLast() {
        int resultLength;
        if (posters.length < max) {
            resultLength = posters.length;
        } else {
            resultLength = max;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = posters[posters.length - 1 - i];
        }
        return tmp;
    }
}
