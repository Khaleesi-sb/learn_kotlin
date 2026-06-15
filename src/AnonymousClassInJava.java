public class AnonymousClassInJava{
    public static void main(String[] args) {
        Food food1 = new Food("Bengali"){ // anonymous inner class
            void taste() {
                System.out.println("Heaven");
            }
        };
        Food food2 = new Food("Punjabi");
        food1.taste();
        food2.taste();
        Food.GlobalFood food3 = new Food.GlobalFood("Italian");
        food3.taste2();
        Eat eat = new Eat() {
            @Override
            public void whatToEat() {
                System.out.println("Food");
            }
        };

    }
}

interface Eat{
    void whatToEat();
}

class Food{
    String type;
    Food(String type){
        this.type = type;
    }
    void taste(){
        System.out.println("All good");
    }

    static class GlobalFood{
        String type;
        GlobalFood(String type){
            this.type = type;
        }
        void taste2(){
            System.out.println("Depends");
        }
    }
}
