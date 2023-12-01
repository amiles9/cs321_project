package com.example;
import java.util.LinkedList;
import java.util.Queue;

public class WorkflowTable{
    // Queues to store form IDs for reviewers and approvers
    private Queue<Integer> reviewer_queue;
    private Queue<Integer> approver_queue;

    // Constructor to initialize queues
    public WorkflowTable(){
        reviewer_queue = new LinkedList<Integer>();
        approver_queue = new LinkedList<Integer>();
    }

    // Method to add a form to the review queue
    public void addReviewForm(int id){
        // Check if the id is a nonnegative integer
        if (id < 0) {
            throw new IllegalArgumentException("Invalid argument: id must be an integer");
        }
        // Add the form ID to the review queue
        this.reviewer_queue.add(id);
    }
    // Method to add a form to the approver queue
    public void addApproveForm(int id){
        // Check if the id is aa nonnegative integer
        if (id < 0) {
            throw new IllegalArgumentException("Invalid argument: id must be an integer");
        }
        // Add the form ID to the approve queue
        this.approver_queue.add(id);
    }

    // Method to get the next form in the review queue
    public int nextReviewForm(){
        // Check if the review queue is empty
        if(reviewer_queue.peek() == null){
            return -1; // Return -1 if the queue is empty
        }
        else return reviewer_queue.poll(); // Return and remove the next form ID from the review queue
    }

    // Method to get the next form in the approve queue
    public int nextApproveForm(){
         // Check if the approve queue is empty
        if(approver_queue.peek() == null){
            return -1;// Return -1 if the queue is empty
        }
        else return approver_queue.poll();// Return and remove the next form ID from the approve queue
    }
    

    // Private helper method to check if a value is an integer
    private boolean isInteger(int value) {
        try {
            Integer.parseInt(String.valueOf(value));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}