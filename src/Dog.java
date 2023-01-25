public class Dog extends Animal {
    private double weight;
    public Dog(String name,int age,String color,double weight){
        super(name,age,color);
this.weight = weight;
    }
public void eatDog(){
    super.eat();
}
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
