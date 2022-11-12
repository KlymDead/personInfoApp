public class Person {
    private String name;
    private String surname;
    private String city;
    private long number;

    public Person(String name, String surname, String city, long number){
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.number = number;
    }
    public String call(){
        return "You can call Mr. " + this.name + " " + this.surname + " from " + this.city + " with number " + this.number;
    }


}
