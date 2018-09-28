
public class Course {
	private String courseTitle;
	private double courseCost;
	
	Course(String courseTitle, double courseCost){
		this.courseTitle = courseTitle;
		this.courseCost = courseCost;
	}
	
	public String getCourseTitle() {
		return this.courseTitle;		
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public double getCourseCost() {
		return this.courseCost;
	}
	public void setCourseCost(double courseCost) {
		this.courseCost = courseCost;
	}
}
