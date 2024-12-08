abstract class GameObject {
        String name;
        int id;

        public GameObject(String name, int id) {
            this.name = name;
            this.id = id;
        }

        abstract void displayDetails();

        public double computeValue(double parameter) {
            return parameter ;
        }
    }



