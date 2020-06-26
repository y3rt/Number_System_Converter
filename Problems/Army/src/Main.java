class Army {

    public static void createArmy() {
        Unit alpha = new Unit("Alpha");
        Unit bravo = new Unit("Bravo");
        Unit charlie = new Unit("Charlie");
        Unit delta = new Unit("Delta");
        Unit echo = new Unit("Echo");

        Knight blackKnight = new Knight("Black");
        Knight whiteKnight = new Knight("White");
        Knight redKnight = new Knight("Red");

        General zod = new General("Zod");

        Doctor honeydew = new Doctor("Dr. Bunsen Honeydew");

    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}
