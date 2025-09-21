public class Main {
    public static void main(String[] args) {
        //Visitor objects
        SizeCalculatorVisitor sc = new SizeCalculatorVisitor();
        SearchVisitor sv = new SearchVisitor();

        //Top level elements
        Directory main = new Directory("main");
        Directory fun = new Directory("fun");
        Directory school = new Directory("school");
        main.subElements.put("fun", fun);
        main.subElements.put("school", school);


        //Entertainment elements
        Directory songs = new Directory("songs");
        fun.subElements.put("songs", songs);
        File enterSandman = new File("enterSandman", 2);
        File symphonyOfDestruction = new File("symphonyOfDestruction", 2);
        File paranoid = new File("paranoid", 2);
        songs.subElements.put("enterSandman", enterSandman);
        songs.subElements.put("symphonyOfDestruction", symphonyOfDestruction);
        songs.subElements.put("paranoid", paranoid);

        Directory movies = new Directory("movies");
        fun.subElements.put("movies", movies);
        File starWars = new File("starWars", 10);
        movies.subElements.put("starWars", starWars);

        Directory games = new Directory("games");
        fun.subElements.put("games", games);
        File darkSouls = new File("darkSouls", 20);
        File dbd = new File("dbd", 30);
        games.subElements.put("darkSouls", darkSouls);
        games.subElements.put("dbd", dbd);

        File catVideo = new File("catVideo", 8);
        fun.subElements.put("catVideo", catVideo);


        //School elements
        File studyPlans = new File("studyPlans", 8);
        File homework = new File("homework", 8);
        File assignments = new File("assignments", 8);
        school.subElements.put("studyPlans", studyPlans);
        school.subElements.put("homework", homework);
        school.subElements.put("assignments", assignments);


        //size tests
        sc.size=0;
        school.accept(sc);
        System.out.println("Size of school files: " + sc.size);

        sc.size=0;
        fun.accept(sc);
        System.out.println("Size of fun files: " + sc.size);

        sc.size=0;
        main.accept(sc);
        System.out.println("Size of all the files: " + sc.size);


        //search tests
        sv.matches=0;
        sv.subString="work";
        homework.accept(sv);
        System.out.println("How many times the word 'work' appears in the homework files name: " + sv.matches);

        sv.matches=0;
        sv.subString="a";
        fun.accept(sv);
        System.out.println("How many times 'a' appears in the fun directory: " + sv.matches);



    }
}