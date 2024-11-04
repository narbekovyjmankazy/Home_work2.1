public class professional {
    private experience ex;
    private job_hours hours;
    private String title;

    public professional(experience ex, job_hours hours, String title) {
        this.ex = ex;
        this.hours = hours;
        this.title = title;
    }

    public experience getEx() {
        return ex;
    }

    public job_hours getHours() {
        return hours;
    }

    public String getTitle() {
        return title;
    }
}
