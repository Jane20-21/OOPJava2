package JavaHomeWork.Zadaha1;

public class Main {
    public static void main(String[] args) {
            Person irina = new Person("Ирина", 50);
            Person ilya = new Person("Илья", 60);
            Person vasya = new Person("Вася", 31);
            Person masha = new Person("Маша", 21);
            Person jane = new Person("Женя", 18);
            Person ivan = new Person("Ваня", 5);
            GeoTree gt = new GeoTree();
            gt.appendPerentChild(irina, vasya); 
            gt.appendPerentChild(irina, masha); 
            gt.appendPerentChild(vasya, jane); 
            gt.appendPerentChild(vasya, ivan); 
            gt.appendVifeHusbent(irina, ilya); 
            gt.appendPerentChild(ilya, vasya); 
            gt.appendPerentChild(ilya, masha); 

            System.out.println("Дети Ирины");
            System.out.println(new Reserch(gt).spend(irina, Relationship.parent));
            System.out.println("Дети Игоря");
            System.out.println(new Reserch(gt).spend(ilya, Relationship.parent));
            System.out.println("Муж Ирины");
            System.out.println(new Reserch(gt).spend(irina, Relationship.wife));
            System.out.println(new Reserch(gt).searchAge());
    }
}