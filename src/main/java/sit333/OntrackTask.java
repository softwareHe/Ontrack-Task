package sit333;

public class OntrackTask{
	
	public String getAssignmentStatus(String taskName) {
        if (taskName.equals("Task1.1p")) {
            return "checked";
        } else if (taskName.equals("Task2.1p")) {
            return "resubmit";
        } else if (taskName.equals("Task3.1p")) {
            return "redo";
        } else if (taskName.equals("Task5.1p")) {
            return "waiting to be marked";
        }
        
        return "not submitted";
	}
}
