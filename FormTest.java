import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.*;

public class FormTest {

    @Test
    public void testFormConstructor() {
        // Arrange
        String immigrantFirstName = "John";
        String immigrantLastName = "Doe";
        String immigrantAlienNumber = "A123456";
        String relativeFirstName = "Jane";
        String relativeLastName = "Smith";
        String relativeAlienNumber = "B789012";

        // Act
        Form form = new Form(
            immigrantFirstName,
            immigrantLastName,
            immigrantAlienNumber,
            relativeFirstName,
            relativeLastName,
            relativeAlienNumber
        );

        // Assert
        assertEquals(immigrantFirstName, form.getImmigrantFirstName());
        assertEquals(immigrantLastName, form.getImmigrantLastName());
        assertEquals(immigrantAlienNumber, form.getImmigrantAlienNumber());
        assertEquals(relativeFirstName, form.getRelativeFirstName());
        assertEquals(relativeLastName, form.getRelativeLastName());
        assertEquals(relativeAlienNumber, form.getRelativeAlienNumber());
    }

    @Test
    public void getStatusTest(){
        // Arrange
        Form form = new Form();
        String status = "R";
        
        // Act
        form.setStatus(status);

        // Assert
        assertEquals(form.getStatus(), status);
    }
    @Test
    public void setStatusTest(){
        // Arrange
        Form form = new Form();
        String status = "R";
        
        // Act
        form.setStatus(status);

        // Assert
        assertEquals(form.status, status);
    }
    @Test
    public void getFormTest(){
        // Arrange
        Form form = new Form();
        int id = 0;

        // Act
        form.setID(id);
        form.updateDatabase();

        // Assert
        assertEquals(Form.getForm(id), form);
    }

    @Test
    public void submitFormTest() {
        // Arrange
        Form form = new Form();
        // Act
        form.submitForm();
        // Assert
        assertEquals(form.getStatus(), "Submitted");

        // Arrange
        Form nullForm = new Form().setForm(null);
        // Act
        nullForm.submitForm();
        // Assert
        assertEquals(nullForm.getStatus(), "NULL FORM");
    }

    @Test
    public void updateFormStatusTest() {
        // Arrange
        Form form = new Form();
        // Act
        form.updateFormStatus("Updated");
        // Assert
        assertEquals(form.getStatus(), "Updated");

        // Arrange
        Form nullForm = new Form().setForm(null);
        // Act
        nullForm.updateFormStatus("Updated");
        // Assert
        assertEquals(nullForm.getStatus(), "NULL FORM");

        // Arrange
        Form editedForm = new Form().setForm("Edited");
        // Act
        editedForm.updateFormStatus("Edited");
        // Assert
        assertEquals(editedForm.getStatus(), "Edited");

        // Arrange
        Form inReviewForm = new Form().setForm("Review");
        // Act
        inReviewForm.updateFormStatus("Review");
        // Assert
        assertEquals(inReviewForm.getStatus(), "Review");

        // Arrange
        Form inApprovalForm = new Form().setForm("Approval");
        // Act
        inApprovalForm.updateFormStatus("Approval");
        // Assert
        assertEquals(inApprovalForm.getStatus(), "Approval");

        // Arrange
        Form approvedForm = new Form().setForm("Approved");
        // Act
        approvedForm.updateFormstatus("Approved");
        // Assert
        assertEquals(approvedForm.getStatus(), "Approved");
    }

    @Test
    public void getIDTest() {
        // Arrange
        Form form = new Form().setID(0);
        // Assert
        assertEquals(form.getID(), 0);

        // Arrange
        Form nullForm = new Form().setID(null);
        // Assert
        assertEquals(nullForm.getID(), null);

        // Arrange
        Form editedForm = new Form().setID(-1);
        // Assert
        assertEquals(editedForm.getID(), null);
    }

    @Test
    public void getFormNullTest() {
        // Assert
        assertThrows(IllegalArgumentException.class, () -> form.getForm(null));
    }

    @Test
    public void getFormNonIntegerTest() {
        // Assert
        assertThrows(IllegalArgumentException.class, () -> form.getForm("nonIntegerValue"));
    }

    @Test
    public void testGetImmigrantFirstName() {
        // Arrange
        YourClass instance = new YourClass();
        instance.setImmigrantFirstName("John");

        // Act
        String result = instance.getImmigrantFirstName();

        // Assert
        assertEquals("John", result);
    }

    @Test
    public void testGetImmigrantLastName() {
        // Arrange
        YourClass instance = new YourClass();
        instance.setImmigrantLastName("Doe");

        // Act
        String result = instance.getImmigrantLastName();

        // Assert
        assertEquals("Doe", result);
    }

    @Test
    public void testGetImmigrantAlienNumber() {
        // Arrange
        YourClass instance = new YourClass();
        instance.setImmigrantAlienNumber("A123456");

        // Act
        String result = instance.getImmigrantAlienNumber();

        // Assert
        assertEquals("A123456", result);
    }

    @Test
    public void testGetRelativeFirstName() {
        // Arrange
        YourClass instance = new YourClass();
        instance.setRelativeFirstName("Jane");

        // Act
        String result = instance.getRelativeFirstName();

        // Assert
        assertEquals("Jane", result);
    }

    @Test
    public void testGetRelativeLastName() {
        // Arrange
        YourClass instance = new YourClass();
        instance.setRelativeLastName("Smith");

        // Act
        String result = instance.getRelativeLastName();

        // Assert
        assertEquals("Smith", result);
    }

    @Test
    public void testGetRelativeAlienNumber() {
        // Arrange
        YourClass instance = new YourClass();
        instance.setRelativeAlienNumber("B789012");

        // Act
        String result = instance.getRelativeAlienNumber();

        // Assert
        assertEquals("B789012", result);
    }

    @Test
    public void testGetEmail() {
        // Arrange
        YourClass instance = new YourClass();
        instance.setEmail("john.doe@example.com");

        // Act
        String result = instance.getEmail();

        // Assert
        assertEquals("john.doe@example.com", result);
    }

    @Test
    public void testUpdateDatabase() {
        // Arrange
        Form form = new Form("John", "Doe", "A123456", "Jane", "Smith", "B789012");

        // Act
        boolean result = form.updateDatabase();

        // Assert
        assertTrue("updateDatabase should return true", result);
    }



}
