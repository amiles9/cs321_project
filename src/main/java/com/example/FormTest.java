package com.example;

public class FormTest extends Test{

    public FormTest(){
        testFormConstructor();
        getStatusTest();
        setStatusTest();
        getFormTest();
        getIDTest();
        getFormNegativeIntegerTest();
        testGetImmigrantFirstName();
        testGetImmigrantLastName();
        testGetImmigrantAlienNumber();
        testGetRelativeFirstName();
        testGetRelativeLastName();
        testGetRelativeAlienNumber();
        testGetEmail();
        testUpdateDatabase();
    }

    public void testFormConstructor() {
        // Arrange
        String immigrantFirstName = "John";
        String immigrantLastName = "Doe";
        String immigrantAlienNumber = "A123456";
        String relativeFirstName = "Jane";
        String relativeLastName = "Smith";
        String relativeAlienNumber = "B789012";
        String testName = "testFormConstructor";

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
        assertEquals(testName, immigrantFirstName, form.getImmigrantFirstName());
        assertEquals(testName, immigrantLastName, form.getImmigrantLastName());
        assertEquals(testName, immigrantAlienNumber, form.getImmigrantAlienNumber());
        assertEquals(testName, relativeFirstName, form.getRelativeFirstName());
        assertEquals(testName, relativeLastName, form.getRelativeLastName());
        assertEquals(testName, relativeAlienNumber, form.getRelativeAlienNumber());
    }

    
    public void getStatusTest(){
        // Arrange
        Form form = new Form();
        String status = "R";
        String testName = "getStatusTest";

        
        // Act
        form.setStatus(status);

        // Assert
        assertEquals(testName, form.getStatus(), status);
    }
    
    public void getFormTest(){
        // Arrange
        Form form = new Form();
        String testName = "getFormTest";

        // Act
        form.updateDatabase();
        App.workflowTable.addApproveForm(form.getID());

        // Assert
        assertEquals(testName, Form.getForm(form.getID()), form);
    }
    
    public void setStatusTest() {
        // Arrange
        Form form = new Form();
        String testName = "setStatusTest";
        // Act
        form.setStatus("Updated");
        // Assert
        assertEquals(testName, form.getStatus(), "Updated");

        // Arrange
        Form editedForm = new Form();
        // Act
        editedForm.setStatus("Edited");
        // Assert
        assertEquals(testName, editedForm.getStatus(), "Edited");

        // Arrange
        Form inReviewForm = new Form();
        // Act
        inReviewForm.setStatus("Review");
        // Assert
        assertEquals(testName, inReviewForm.getStatus(), "Review");

        // Arrange
        Form inApprovalForm = new Form();
        // Act
        inApprovalForm.setStatus("Approval");
        // Assert
        assertEquals(testName, inApprovalForm.getStatus(), "Approval");

        // Arrange
        Form approvedForm = new Form();
        // Act
        approvedForm.setStatus("Approved");
        // Assert
        assertEquals(testName, approvedForm.getStatus(), "Approved");
    }

    
    public void getIDTest() {
        // Arrange
        Form form = new Form();
        form.setID(0);
        String testName = "getIDTest";
        // Assert
        assertEquals(testName, form.getID(), 0);
    }

    
    public void getFormNegativeIntegerTest() {
        String testName = "getFormNegativeIntegerTest";
        System.out.print(testName+": ");
        // Assert
        try{
            Form.getForm(-1);
        }
        catch (IllegalArgumentException e){
            System.out.print("Success\n");
            return;
        }
        System.out.print("Fail\n");
    }

    
    public void testGetImmigrantFirstName() {
        String testName = "testGetImmigrantFirstName";
        // Arrange
        Form instance = new Form();
        instance.setImmigrantFirstName("John");

        // Act
        String result = instance.getImmigrantFirstName();

        // Assert
        assertEquals(testName, "John", result);
    }

    
    public void testGetImmigrantLastName() {
        String testName = "testGetImmigrantLastName";
        // Arrange
        Form instance = new Form();
        instance.setImmigrantLastName("Doe");

        // Act
        String result = instance.getImmigrantLastName();

        // Assert
        assertEquals(testName, "Doe", result);
    }

    
    public void testGetImmigrantAlienNumber() {
        String testName = "testGetImmigrantAlienNumber";
        // Arrange
        Form instance = new Form();
        instance.setImmigrantAlienNumber("A123456");

        // Act
        String result = instance.getImmigrantAlienNumber();

        // Assert
        assertEquals(testName, "A123456", result);
    }

    
    public void testGetRelativeFirstName() {
        String testName = "testGetRelativeFirstName";
        // Arrange
        Form instance = new Form();
        instance.setRelativeFirstName("Jane");

        // Act
        String result = instance.getRelativeFirstName();

        // Assert
        assertEquals(testName, "Jane", result);
    }

    
    public void testGetRelativeLastName() {
        String testName = "testGetRelativeLastName";
        // Arrange
        Form instance = new Form();
        instance.setRelativeLastName("Smith");

        // Act
        String result = instance.getRelativeLastName();

        // Assert
        assertEquals(testName, "Smith", result);
    }

    
    public void testGetRelativeAlienNumber() {
        String testName = "testGetRelativeAlienNumber";
        // Arrange
        Form instance = new Form();
        instance.setRelativeAlienNumber("B789012");

        // Act
        String result = instance.getRelativeAlienNumber();

        // Assert
        assertEquals(testName, "B789012", result);
    }

    
    public void testGetEmail() {
        String testName = "testGetEmail";
        // Arrange
        Form instance = new Form();
        instance.setEmail("john.doe@example.com");

        // Act
        String result = instance.getEmail();

        // Assert
        assertEquals(testName, "john.doe@example.com", result);
    }

    
    public void testUpdateDatabase() {
        String testName = "testUpdateDatabase";
        // Arrange
        Form form = new Form("John", "Doe", "A123456", "Jane", "Smith", "B789012");

        // Act
        boolean result = form.updateDatabase();

        // Assert
        assertEquals(testName, result, true);
    }



}
