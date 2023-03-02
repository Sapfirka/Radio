import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(4);
        int expected = 4;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(10);
        int expected = 0;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOver0RadioStation() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(5);
        stat.nextRadioStation();
        int expected = 6;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMaxRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(9);
        stat.nextRadioStation();
        int expected = 0;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mooveNextRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(9);
        stat.nextRadioStation();
        int expected = 0;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void mooveBackRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(0);
        stat.stepBackRadioStation();
        int expected = 9;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mooveBackLessThanMinRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(-1);
        int expected = stat.currentRadioStation;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mooveBackLess9RadioStation() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(8);
        stat.stepBackRadioStation();
        int expected = 7;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(6);
        int expected = 6;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUnderMinVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(-1);
        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMaxVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(11);
        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(3);
        stat.increaseVolume();
        int expected = 4;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseOverVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(10);
        stat.increaseVolume();
        int expected = stat.currentVolume;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldReduceVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(3);
        stat.reduceVolume();
        int expected = 2;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceMinVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(0);
        stat.reduceVolume();
        int expected = stat.currentVolume;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}