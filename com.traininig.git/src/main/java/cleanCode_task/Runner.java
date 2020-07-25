package cleanCode_task;

import java.util.Arrays;
import java.util.List;

public class Runner {
    static List<Plane> planes = Arrays.asList(

            new PassengerPlane("Boeing-737"),
            new PassengerPlane("Boeing-737-800"),
            new PassengerPlane("Boeing-747"),
            new PassengerPlane("Airbus A320"),
            new PassengerPlane("Airbus A330"),
            new PassengerPlane("Embraer 190"),
            new PassengerPlane("Sukhoi Superjet 100"),
            new PassengerPlane("Bombardier CS300"),
            new PassengerPlane(12_000, 60_500, 164,900),
            new PassengerPlane(12_300, 63_870, 192, 900),
            new PassengerPlane(16_100, 70_500, 242, 900),
            new PassengerPlane(11_800, 65_500, 188, 930),
            new PassengerPlane(14_800, 80_500, 222, 990),
            new PassengerPlane(8_100, 30_800, 64, 870),
            new PassengerPlane(11_500, 50_500, 140, 870),
            new PassengerPlane(11_000, 60_700, 196, 920),

            new MilitaryPlane("B-1B Lancer"),
            new MilitaryPlane("B-2 Spirit"),
            new MilitaryPlane("B-52 Stratofortress"),
            new MilitaryPlane("F-15"),
            new MilitaryPlane("F-22"),
            new MilitaryPlane("C-130 Hercules"),
            new MilitaryPlane(1_050, 21_000, 80_000, MilitaryType.BOMBER),
            new MilitaryPlane(1_030, 22_000, 70_000, MilitaryType.BOMBER),
            new MilitaryPlane(1_000, 20_000, 80_000, MilitaryType.BOMBER),
            new MilitaryPlane(1_500, 12_000, 10_000, MilitaryType.FIGHTER),
            new MilitaryPlane(1_550, 13_000, 11_000, MilitaryType.FIGHTER),
            new MilitaryPlane(650, 5_000, 11_0000, MilitaryType.TRANSPORT)
    );

    public static void main(String[] args) {

        Airport airport = new Airport(planes);

        Airport militaryAirport = new Airport(airport.getMilitaryPlanes());

        Airport passengerAirport = new Airport(airport.getPlanes());
    }
}
