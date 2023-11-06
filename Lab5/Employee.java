package Lab5;


public class Employee {
    private String name;
    private String email;
    private Integer hourRate; //Salar pe ora
    private Integer capacity; //ore pe zi
    private Integer freeDays; //zile libere pe sapt


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getHourRate() {
        return hourRate;
    }

    public void setHourRate(Integer hourRate) {
        this.hourRate = hourRate;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getFreeDays() {
        return freeDays;
    }

    public void setFreeDays(Integer freeDays) {
        this.freeDays = freeDays;
    }

    private int calculateDailyIncome(){
        int dailyIncome = this.hourRate * this.capacity;
        return dailyIncome;
    }

    public void calculateMonthlyIncome(){
        int income = calculateDailyIncome() * (20 - this.freeDays);
        System.out.println("Income is: " + income);
    }
}
