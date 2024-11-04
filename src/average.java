public class average extends professional{

    public average(experience ex, job_hours hours, String title) {
        super(ex, hours, title);
    }

    public void exp() {
        System.out.println("Experience = " + getEx());
    }

    public final void info() {
        System.out.println("Experience =" + getEx() + " Hours =" + getHours() + " Name =" + getTitle());
    }
}
