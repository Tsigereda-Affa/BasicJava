public class Scanner {
    public static void main( String[] args ){
        Scanner scn = new scanner(System.in);
        //imports the java util

        //gets it to the next line
        String name= "tutu" ;
        String breed="white";
        int age=10;
        System.out.print( "Greetings. What is your pet's name? " );
        name = scn.next();
        System.out.print( "What kind of animal is " + name + "? " );
        System.out.print( "How old is " + name + "? ");

        System.out.println( name + " is your " + breed + " and it is " + age );
        breed = scn.next();
        age= scn.next();
    }
}

