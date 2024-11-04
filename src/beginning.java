final public class beginning extends average{

    public beginning(experience ex, job_hours hours, String title) {
        super(ex, hours, title);
    }

    @Override
    public void exp() {
        super.exp();
        System.out.println("Hours = " + getHours());
    }


}
