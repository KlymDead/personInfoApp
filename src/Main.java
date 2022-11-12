public class Main {
    public static void main(String[] args) {
        Person willSmith = new Person("Will", "Smith", "New York", 2936729462846l);
        String callMr1 = willSmith.call();
        System.out.println(callMr1);
        Person jackieChan = new Person("Jackie", "Chan", "Shanghai", 12312412412l);
        String callMr2 = jackieChan.call();
        System.out.println(callMr2);
        Person sherlockHolmes = new Person("Sherlock", "Holmes", "London", 37742123513l);
        String callMr3 = sherlockHolmes.call();
        System.out.println(callMr3);
    }
}