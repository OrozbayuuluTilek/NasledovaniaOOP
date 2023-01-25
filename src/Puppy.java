public class Puppy extends Animal{
    private String nickName;
    public Puppy(String name, int age, String color,String nickName) {
        super(name, age, color);
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
/** toString менен кайтаруу **/
@Override
   public String toString(){
     return "name: "+getName()+"age: "+getAge()+"color: "+getColor()+" nick"+getNickName();
/** toString жок кайтаруу **/
//     public String number(){
//     return "name: "+getName()+"age: "+getAge()+"color: "+getColor()+" nick"+getNickName();
    }
}
