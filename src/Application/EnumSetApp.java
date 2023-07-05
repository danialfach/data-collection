package Application;

import java.util.EnumSet;

public class EnumSetApp {
    public static enum Gender{
        MALE, FEMALE, NOT_MENTION
    }
    public static void main(String[] args) {
//        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        Gender[] values = Gender.values();
        for (var gender : values){
            System.out.println(gender);
        }
    }
}
