package JavaHomeWork.Zadaha2;

public class Main {
    public static void main(String[] args) {
        Person vasia = new Person("Vasia", "No");
        Locker locker = new Locker("Close");
        System.out.println("Начальное состояние");
        System.out.println(vasia);
        System.out.println(locker);
        if ((vasia.getKey() == "Yes" || vasia.getKey() == "No") && locker.getStatus() == "Open") {
            System.out.println("Шкаф уже открыт");
        } else if (vasia.getKey() == "Yes" && locker.getStatus() == "Close") {
            Locker.openLocker(vasia, locker);
            System.out.println(vasia);
            System.out.println(locker);
        } else if (vasia.getKey() == "No" && locker.getStatus() == "Close") {
            Person.poisk(vasia, locker);
            System.out.println(vasia);
            System.out.println(locker);
            Locker.openLocker(vasia, locker);
            System.out.println(locker);
        }
    }
}
