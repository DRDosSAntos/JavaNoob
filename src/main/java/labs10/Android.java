package labs10;

public class Android implements Chargeable{

    private int level = 0;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String charge(int amount) {

        if (level < 100){
            level = level + amount;
            System.out.println("Charging... current charge-level: " + level + "%");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return charge(1);
        } else{
            System.out.println("\nCharging complete");
        }
        return "\nFurther charging rejected, charge-level cannot exceed 100%";
    }

}
