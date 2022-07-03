package CVApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PDServiceTest {

    @Test

    public void ShouldSaveName(){
        NameRepo nameRepo = mock(NameRepo.class);
        PDService pdService = new PDService(nameRepo);

     Name newName = new Name("2D1345","Ben", "Bo");

     when(nameRepo.save(newName)).thenReturn(newName);
     var actual = pdService.createName(newName);

     assertEquals(actual.getFirstName(), "Ben");




    }
}