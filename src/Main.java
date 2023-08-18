public class Main {
    public static void main(String[] args) {
       Boss boss=new Boss();
       boss.setDamage(80);
       boss.setDefense("phisycal");
       boss.setHealth(750);
        System.out.println(boss.getDamage() + " " + boss.getHealth() + " " + boss.getDefense());
    }
}