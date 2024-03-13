public class Truck extends Car {
    private int load;

    public Truck( String brand, int load){
        super(brand);
        this.load = load;
    }

  @Override
    public void setSeats( int seats ){
        super.setSeats(seats);
        System.out.println("Der Truck hat "+ seats +" Sitze");
    }


}
