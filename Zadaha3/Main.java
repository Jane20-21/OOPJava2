package JavaHomeWork.Zadaha3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Илья"); 
        Dog dog = new Dog("Барбос", "гав-гав"); 
        Cat cat = new Cat("Мурзик", "мяу-мяу"); 
        Fish fish = new Fish("Золотко");
        person.choice(); 
        int personChoise = person.call(dog, cat); 
        if (personChoise == 1) { 
            dog.moving(); 
            person.getFeed(); 
            dog.eat();  
        } else if (personChoise == 2) {  
            cat.moving();  
            person.getFeed(); 
            cat.eat(); 
        } else if (personChoise == 3) {  
            person.getFeed(); 
            fish.moving(); 
            fish.eat(); 
        }
    }
}