import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/**TransportType деген enum туз. Ичине ар кандай типтеги унааларды жаз. Мисалы: CAR, BUS, TRUCK.

 Enum-дын ичинде бир  метод болсун:
 public  double calculateTravelCost(double distance);
 Бул метод транспорттун ар бир түрү үчүн өзүнүн жол баасын эсептеп чыгышы керек.

 (CAR)  Автоунаанын бир километринин баасы $0,1.
 (BUS)  Автобустун бир километринин баасы $0,05
 (TRUCK.) Трак үчүн бир километрдин баасы $0,02 **/
        Scanner sc = new Scanner(System.in);



                System.out.println("write distance of the car: ");
                System.out.println("total price of the car: " + TransportType.CAR.calculateTravelCost(sc.nextDouble()));


                System.out.println("write distance of the bus:");
                System.out.println("total price of the bus: " + TransportType.BUS.calculateTravelCost(sc.nextDouble()));


                System.out.println("write distance of the truck: ");
                System.out.println("total price of the truck: " + TransportType.TRUCK.calculateTravelCost(sc.nextDouble()));

            }
        }









