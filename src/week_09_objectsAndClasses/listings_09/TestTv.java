package week_09_objectsAndClasses.listings_09;

public class TestTv {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        Tv tv2 = new Tv();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);


    }
}
