package homework.model.vo;

public class Employee {
    // 필드
	public String name;
	public String team;
    String position;
    int salary;
    private int bonus;
    
    public void setBonus(int bonus) {
        this.bonus = bonus; 
    }

    public int getBonus() {
        return bonus;       
    }
}
