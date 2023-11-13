public class AnimalFactory {
    public static Animal createAnimal(String type){
        if("canine".equals(type)){
            return new Dog();
        }else {
            return new Cat();
        }
    }
}
