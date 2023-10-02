public class OurStory{
    public static void main(String[] args) {
        //class objname = new constructor
        Hero mainCharacter = new Hero("Power Sheller","Manipulates the Matrix");
        System.out.println(mainCharacter);

        Hero bestFriend = new Hero("Nic Cage","Steals the jewel");
        System.out.println(bestFriend);

        Hero villain = new Hero("Zander","bomb a puppy factory");
        System.out.println(villain);

        Hero person1 = new Hero("ChatGPT");
        System.out.println(person1);
    }
}