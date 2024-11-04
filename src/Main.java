public class Main {
    public static void main(String[] args) {
        average objectA = new average(experience.YEARS_4, new job_hours("8"), "Alex");
        beginning objectB = new beginning(experience.YEARS_2, new job_hours("5"), "Bob");
        beginning objectC = new beginning(experience.YEARS_2, new job_hours("3"), "John");

        objectA.info();
        objectA.exp();

        objectB.info();
        objectB.exp();
        
        objectC.info();
        objectC.exp();
    }
}