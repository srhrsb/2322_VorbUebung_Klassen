public class Car {
    private String brand;
    private int seats;

    public Car(String brand){
        this.brand = brand;
        this.seats = 5;
    }

    public Car(String brand, int seats){
        this.brand = brand;
        this.seats = seats;
    }

    public void setSeats(int seats){
       this.seats = Math.clamp(seats, 2, 8);
    }


}
