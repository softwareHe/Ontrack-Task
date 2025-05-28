package sit333;

import static org.junit.Assert.*;

import org.junit.Test;


public class OntrackTest{

	    @Test
	    public void testAssignmentStatusChecked() {
	        OntrackTask inbox = new OntrackTask();
	        String result = inbox.getAssignmentStatus("Task1.1p");
	        assertEquals("checked", result);
	    }

	    @Test
	    public void testAssignmentStatusResubmit() {
	        OntrackTask inbox = new OntrackTask();
	        String result = inbox.getAssignmentStatus("Task2.1p");
	        assertEquals("resubmit", result);
	    }

	    @Test
	    public void testAssignmentStatusRedo() {
	        OntrackTask inbox = new OntrackTask();
	        String result = inbox.getAssignmentStatus("Task3.1p");
	        assertEquals("redo", result);
	    }
	
}

