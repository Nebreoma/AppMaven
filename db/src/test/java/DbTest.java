import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DbTest {
    @Test
    public void testGetDbSetting() {
        //Arrange
        DbSetting dbSettingExpented = new DbSetting ("Name", "Password");
        Db dbExpented = new Db(dbSettingExpented);
        //Act
        DbSetting dbSettingActual = dbExpented.getDbSetting();
        //Assert
        assertEquals(dbSettingExpented, dbSettingActual);
    }

}
