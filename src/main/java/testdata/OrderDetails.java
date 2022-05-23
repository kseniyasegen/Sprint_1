package testdata;

public class OrderDetails {
    private final String comment;
    private final String date;


    public OrderDetails(String comment, String date) {
        this.comment = comment;
        this.date = date;
    }

    public static OrderDetails getOrderDetails1() {
        return new OrderDetails(
                "Как можно скорее",
                "03.06.2022"
        );
    }

    public static OrderDetails getOrderDetails2() {
        return new OrderDetails(
                "Мжно не торопиться",
                "12.12.2022"
        );
    }

    public String getComment() {
        return comment;
    }

    public String getDate() {
        return date;
    }

}
