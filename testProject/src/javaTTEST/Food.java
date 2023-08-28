package javaTTEST;

public class Food {
	
    private String name;
    private int kcal;
    
	public Food() {
    }

    public Food(String name, int kcal) {
        this.name = name;
        this.kcal = kcal;
    }
    
    public String getName() {
        return name;
    }
    public int getKcal() {
        return kcal;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setKcal(int kcal) {
        this.kcal = kcal;
    }
    
    public String toString() {
    	return "음식이름" + name + "칼로리" + "kcal";
    }
    
}
