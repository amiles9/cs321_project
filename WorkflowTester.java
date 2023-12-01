import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.Test;

import com.example.WorkflowTable;


public class WorkflowTester {
    

    @Test
    public void constructorTest() {
        // Arrange
        WorkflowTable current = new WorkflowTable();
        // Assert
        assertNotNull("The created object should not be null", current);
    }

    @Test
    public void emptyQueueTest(){
        // Arrange
        WorkflowTable current = new WorkflowTable();
        // Assert
        assertEquals(current.nextReviewForm(), -1);
        assertEquals(current.nextApproveForm(), -1);
    }

    @Test
    public void addReviewForm_test(){
        // Arrange
        WorkflowTable current = new WorkflowTable();
        // Act
        current.addReviewForm(1);
        // Assert
        assertEquals(current.nextReviewForm(), 1);
    }

    @Test
    public void testAddReviewFormWithNonInteger() {
        // Arrange
        WorkflowTable current = new WorkflowTable();
        // Assert
        assertThrows(IllegalArgumentException.class, () -> current.add_review_form("nonIntegerValue"));
    }

    @Test
    public void testAddReviewFormWithNull() {
        // Arrange
        WorkflowTable current = new WorkflowTable();
        // Assert
        assertThrows(IllegalArgumentException.class, () -> current.add_review_form(null));
    }

    @Test
    public void addApproveForm_test(){
        // Arrange
        WorkflowTable current = new WorkflowTable();
        // Act
        current.addApproveForm(1);
        // Assert
        assertEquals(current.nextApproveForm(), 1);
    }

    @Test
    public void testAddApproveFormWithNonInteger() {
        // Arrange
        WorkflowTable current = new WorkflowTable();
        
        // Assert
        assertThrows(IllegalArgumentException.class, () -> current.add_approve_form("nonIntegerValue"));
    }

    @Test
    public void testAddApproveFormWithNull() {
        // Arrange
        WorkflowTable current = new WorkflowTable();
        // Assert
        assertThrows(IllegalArgumentException.class, () -> current.add_approve_form(null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalReviewAdd(){
        // Arrange
        WorkflowTable current = new WorkflowTable();
        // Act
        current.addReviewForm(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalApproveAdd(){
        // Arrange
        WorkflowTable current = new WorkflowTable();
        // Act
        current.addApproveForm(-5);
    }

    @Test
    public void nextFormTests(){
        // Arrange
        WorkflowTable current = new WorkflowTable();
        // Act
        current.addApproveForm(2);
        current.addReviewForm(2);
        // Assert
        assertEquals(current.nextReviewForm(), 2);
        assertEquals(current.nextApproveForm(), 2);
    }
}
