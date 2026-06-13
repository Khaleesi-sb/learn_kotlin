public class Human {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void someFun(){
        MainKt.add(5, 6);
        First.dataTypes();
    }

    public static void main(String[] args){
        Human human = new Human();
        human.someFun();
        First.calculateAmount(70);
    }
}
