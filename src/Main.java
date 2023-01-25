import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Bobik ",5,"black",4.5);
         Cat cat = new Cat("Cat",2,"white");
         Puppy puppy = new Puppy("nick",34,"whit","nick");
        System.out.println("name: "+dog.getName()+" age: "+dog.getAge()+" color: "+dog.getColor()+
                " weigth: "+dog.getWeight()+"nick name: "+puppy.getNickName());
dog.eat();
            }

}