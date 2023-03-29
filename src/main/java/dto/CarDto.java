package dto;

import domain.CarType;

public class CarDto {

    private String make;
    private int seatCount;
    private CarType type;

    public CarDto() {
    }

    public CarDto(String make, int seatCount, CarType type) {
        this.make = make;
        this.seatCount = seatCount;
        this.type = type;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }


}
