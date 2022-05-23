package testdata;

public class User {
    private final String firstName;
    private final String secondName;
    private final String adress;
    private final String phone;
    private final String station;


    public User(String firstName, String secondName, String adress, String phone, String station) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.adress = adress;
        this.phone = phone;
        this.station = station;
    }

    public static User getUser1() {
        return new User(
                "Ксения",
                "Сегень",
                "Москва, улица Мира 1",
                "89888888888",
                "Черкизовская"
        );
    }

    public static User getUser2() {
        return new User(
                "Иванна",
                "Иванова",
                "Москва, улица Мира 2",
                "89888888889",
                "Маяковская"
        );
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhone() {
        return phone;
    }

    public String getStation() {
        return station;
    }

}
