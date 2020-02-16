package Unit2.Task6;

import Unit2.Task7.SuperPuper;

@SuperPuper("Boat assembly")
public class AtomicBoat {
    @SuperPuper("current status of boat")
    private String status = "стоим на месте";

    @SuperPuper("component - electric motor")
    class ElectricalEngine {
        @SuperPuper("indicator of sufficient energy")
        private boolean energy = true;

        @SuperPuper("engine starting")
        private void start() {
            if (energy) {
                status = "в пути";
            }
        }

        @SuperPuper("engine stop")
        private void stop() {
            status = "стоим на месте";
        }
    }

    @SuperPuper("boat movement")
    public void go() {
        new ElectricalEngine().start();
    }

    @SuperPuper("get current status of boat")
    public String getStatus() {
        return status;
    }
}