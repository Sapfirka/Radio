import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void picAmountStation() {
        Radio stat = new Radio(20);
        stat.setCurrentRadioStation(15);
        int expected = 15;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void picAmountStation0() {
        Radio stat = new Radio(20);
        stat.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

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
        Radio stat = new Radio(9);
        stat.setCurrentRadioStation(15);
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
    public void mooveNextRadioStation() {
        Radio stat = new Radio(30);
        stat.setCurrentRadioStation(29);
        stat.nextRadioStation();
        int expected = 0;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void mooveBackRadioStation() {
        Radio stat = new Radio(30);
        stat.setCurrentRadioStation(0);
        stat.stepBackRadioStation();
        int expected = 29;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mooveBack0RadioStation() {
        Radio stat = new Radio(30);
        stat.setCurrentRadioStation(6);
        stat.stepBackRadioStation();
        int expected = 5;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() {
        Radio stat = new Radio();
        stat.setVolume(6);
        int expected = 6;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUnderMinVolume() {
        Radio stat = new Radio();
        stat.setVolume(-1);
        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMaxVolume() {
        Radio stat = new Radio();
        stat.setVolume(101);
        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio stat = new Radio();
        stat.setVolume(3);
        stat.increaseVolume();
        int expected = 4;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume100() {
        Radio stat = new Radio();
        stat.setVolume(100);
        stat.increaseVolume();
        int expected = 100;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldReduceVolume() {
        Radio stat = new Radio();
        stat.setVolume(3);
        stat.reduceVolume();
        int expected = 2;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceMinVolume() {
        Radio stat = new Radio();
        stat.setVolume(0);
        stat.reduceVolume();
        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}