package ClassMethod;

public class AppTest {
    public static void main(String[] args) {
        AppAndroid android = new AppAndroid("android", "game Player", 5678);
        android.run();
        AppIphon iphon = new AppIphon("iOS", "phone", 1234);
        iphon.run();
    }

}
