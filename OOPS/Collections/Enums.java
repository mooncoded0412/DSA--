package Collections;

public class Enums {
    //all enums explicitly extend java.lang.Enum class 
    //an Enum cant be a super class (inheritance)
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //these are called enum constants 
        //every single enum constant is public, static and final
        //since final we cant create child enums
        //type is week here 
        //constructor 
        Week(){
        System.out.println("Constructor called for "+ this);
        }
        //this cnstructor is not public or protected only private or default
        //we dont want to create new obejcts because this is not the ENUM concpet 

    }

    public static void main(String[] args) {
        //the idea is for a particular class you will have some particular number of particular objects only example Months = 12 not 13 
        Week week;
        week = Week.Monday;
        //internally :
        //public static final week Monday = new Week();

        /*for(Week day : Week.values()){
          System.out.println(day);
        }*/

        System.out.println(Week.Wednesday.ordinal());
        System.out.println(week.ordinal());
    }
}
