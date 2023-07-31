package machine;
public abstract class Machine {

    private double weight;

    double height;

    public Machine() {

    }

    public Machine(double weight) {
        this.weight = weight;

    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeigth() {
        return this.weight;
    }

    public void start() {
        System.out.println("machine start...");
    }

    public void stop() {
        System.out.println("machine stop...");
    }

    public static final String staticMethod(String x, String y) {
        return x + y;
    }

    // Factory Pattern
    public static Machine produce(int code) {
        switch (code) {
            case 1:
                return new Machine();
            case 2:
                return new Laptop();
        }
        return new Machine();
    }

    public static void stop(int code) { /// what machine going to stop????
        Machine machine = Machine.produce(code);
        machine.stop(); // different child class will have different implementation
    }

    public static void main(String[] args) {
        int pockeyMoney = 100;
        boolean stopCondition = pockeyMoney < 0; // ????

        if(stopCondition){
        Machine machine1 = Machine.produce(1); // Machine;
        machine1.stop(); // machine stop...
        }
        Machine machine2 = Machine.produce(2); // Laptop
        machine2.stop(); // Laptop Stop...


    }

}
