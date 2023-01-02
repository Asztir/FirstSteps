package ClassMethod;

public class App {
    public String appInfo;
    public String whatHeDoes;
    public int serialNumber;
    public App(String appInfo,String  whatHeDoes, int serialNumber){
        this.appInfo = appInfo;
        this.whatHeDoes = whatHeDoes;
        this.serialNumber = serialNumber;
        System.out.println("This app is " + appInfo + " and he " + whatHeDoes);
        System.out.println("His serial number is " + serialNumber);
    }
}

