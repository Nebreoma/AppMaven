import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {
    MyService myService = new MyService();
    @Test
    public void testSetMyEntity() {
        //Arrange
        MyEntity myEntityExpented = new MyEntity("Expented");
        //Act
        MyEntity myEntityActual = myService.setMyEntity(myEntityExpented);
        //Assert
        assertEquals(myEntityExpented, myEntityActual);
    }

    @Test
    public void testGetName() {
        //Arrange
        String Expented = "myService";
        //Act
        String Actual = myService.getName();
        //Assert
        assertEquals(Expented, Actual);
    }
}
