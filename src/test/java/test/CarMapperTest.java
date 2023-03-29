package test;

import domain.Car;
import domain.CarType;
import dto.CarDto;
import mapper.CarMapper;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarMapperTest {
    @Test
    public void shouldMapCarToDto(){
        //give
        CarType carType = new CarType("sedan");
        Car car =new Car("Morris",5,carType);

        //when
        CarDto carDto = CarMapper.INSTANCE.carToCarDTO(car);

        //then
        assertNotNull(carDto);
        assertEquals(carDto.getMake(),car.getMake());
        assertEquals(carDto.getSeatCount(),car.getNumberOfSeats());
        assertEquals(carDto.getType(),carType);
    }
}
