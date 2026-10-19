public class DivineWeapon extends Artifact {

    private String essenceType;

    public DivineWeapon(String essenceType) {
        super("Celestial Bronze");
        this.essenceType = essenceType;
        System.out.println("Its essence is now glowing with " + essenceType + " energy.");
    }
}
