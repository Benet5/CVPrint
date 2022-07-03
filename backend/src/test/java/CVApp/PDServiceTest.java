package CVApp;

import org.junit.jupiter.api.Test;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PDServiceTest {

    @Test

    public void ShouldSaveName(){
        PersonRepo personRepo = mock(PersonRepo.class);
        PDService pdService = new PDService(personRepo);

        Address address = new Address("Dorfstraße 1", "22179 Hamburg");
     Person newName = new Person("2D1345","Ben", "Bo", address, "01.01.2000", "boschlo@rg.de", 012736542 );

     when(personRepo.save(newName)).thenReturn(newName);
     var actual = pdService.createPerson(newName);

     assertEquals(actual.getFirstName(), "Ben");


    }
}