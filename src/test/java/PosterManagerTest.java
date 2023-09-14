import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void posterZeroTest() {
        PosterManager manager = new PosterManager();

        String[] actual = manager.findLast();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void posterOneTest() {
        PosterManager manager = new PosterManager();
        manager.addPoster("Film x 1");


        String[] actual = manager.findLast();
        String[] expected = {"Film x 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void posterTest() {
        PosterManager manager = new PosterManager();
        manager.addPoster("Film x 1");
        manager.addPoster("Film yyy 2");
        manager.addPoster("Film 3");

        String[] actual = manager.findLast();
        String[] expected = {"Film 3", "Film yyy 2", "Film x 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void PosterMaxTest() {
        PosterManager manager = new PosterManager();
        manager.addPoster("Film x 1");
        manager.addPoster("Film yyy");
        manager.addPoster("Film 3");
        manager.addPoster("Film Goblin");
        manager.addPoster("Film 123");

        String[] actual = manager.findLast();
        String[] expected = {"Film 123", "Film Goblin", "Film 3", "Film yyy", "Film x 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void PosterUpLimitTest() {
        PosterManager manager = new PosterManager();
        manager.addPoster("Film x 1");
        manager.addPoster("Film yyy");
        manager.addPoster("Film 3");
        manager.addPoster("Film Goblin");
        manager.addPoster("Film 123");
        manager.addPoster("Film Film Film");

        String[] actual = manager.findLast();
        String[] expected = {"Film Film Film", "Film 123", "Film Goblin", "Film 3", "Film yyy"};

        Assertions.assertArrayEquals(expected, actual);
    }
}
