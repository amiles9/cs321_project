package com.example;

public class WorkflowTest extends Test{
    
    public WorkflowTest(){
        constructorTest();
        emptyQueueTest();
        addReviewFormTest();
        addApproveFormTest();
        illegalReviewAdd();
        illegalApproveAdd();
        nextFormTests();
    }
    
    public void constructorTest() {
        // Arrange
        WorkflowTable current = new WorkflowTable();
        String testName = "constructorTest";
        // Assert
        assertNotEquals(testName, "current", null);
    }

    
    public void emptyQueueTest(){
        // Arrange
        WorkflowTable current = new WorkflowTable();
        String testName = "emptyQueueTest";
        // Assert
        assertEquals(testName, current.nextReviewForm(), -1);
        assertEquals(testName, current.nextApproveForm(), -1);
    }

    
    public void addReviewFormTest(){
        // Arrange
        WorkflowTable current = new WorkflowTable();
        String testName = "addReviewFormTest";
        // Act
        current.addReviewForm(1);
        // Assert
        assertEquals(testName, current.nextReviewForm(), 1);
    }
    
    public void addApproveFormTest(){
        // Arrange
        WorkflowTable current = new WorkflowTable();
        String testName = "addApproveFormTest";
        // Act
        current.addApproveForm(1);
        // Assert
        assertEquals(testName, current.nextApproveForm(), 1);
    }


    public void illegalReviewAdd(){
        // Arrange
        WorkflowTable current = new WorkflowTable();
        String testName = "illegalReviewAdd";
        System.out.print(testName+": ");
        // Assert
        try{
            current.addReviewForm(-5);
        }
        catch (IllegalArgumentException e){
            System.out.print("Success\n");
            return;
        }
        System.out.print("Fail\n");    
    }

    public void illegalApproveAdd(){
        // Arrange
        WorkflowTable current = new WorkflowTable();
        String testName = "illegalApproveAdd";
        System.out.print(testName+": ");
        // Assert
        try{
            current.addApproveForm(-5);
        }
        catch (IllegalArgumentException e){
            System.out.print("Success\n");
            return;
        }
        System.out.print("Fail\n"); 
    }

    
    public void nextFormTests(){
        // Arrange
        WorkflowTable current = new WorkflowTable();
        String testName = "nextFormTests";
        // Act
        current.addApproveForm(2);
        current.addReviewForm(2);
        // Assert
        assertEquals(testName, current.nextReviewForm(), 2);
        assertEquals(testName, current.nextApproveForm(), 2);
    }
}
