package Profession;
/*
 * @author Robson
 */
public class main {

	 public static void main(String[] args) {
	        employees employees = new employees();
	        List<hockeyplayer> hockeyPlayers = employees.getHockeyPlayer();
	        List<professor> professors = employees.getProfessor();
	        List<parent> parents = employees.getParent();
	        List<gasstationattendant> gasstationattendants = employees.getGasStationAttendant();

	        /*
	         * printing sorted
	         */
	        System.out.println("Printing all Hockey Players before sort:");
	        for(hockeyplayer hockeyPlayer : hockeyPlayers){
	            System.out.println(hockeyPlayer);
	        }
	        Collections.sort(hockeyPlayers);
	        System.out.println("\nPrinting all Hockey Players after sort:");
	        for(hockeyplayer hockeyPlayer : hockeyPlayers){
	            System.out.println(hockeyPlayer);
	        }

	        System.out.println("\n\nPrinting all Professors before sort:");
	        for(professor professor : professors){
	            System.out.println(professor);
	        }
	        Collections.sort(professors);
	        System.out.println("\nPrinting all Professors after sort:");
	        for(professor professor : professors){
	            System.out.println(professor);
	        }

	        System.out.println("\n\nPrinting all Parents before sort:");
	        for(parent parent : parents){
	            System.out.println(parent);
	        }
	        Collections.sort(parents);
	        System.out.println("\nPrinting all Parents after sort:");
	        for(parent parent : parents){
	            System.out.println(parent);
	        }

	        System.out.println("\n\nPrinting all Gas Station Attendants before sort:");
	        for(GasStationAttendant gasStationAttendant : gasStationAttendants){
	            System.out.println(gasStationAttendant);
	        }
	        Collections.sort(gasStationAttendants);
	        System.out.println("\nPrinting all Gas Station Attendants after sort:");
	        for(gasstationattendant gasStationAttendant : gasStationAttendants){
	            System.out.println(gasStationAttendant);
	        }

	        /*
	         * Printing equals Employee
	         */
	        System.out.println("\n\nEquals Hockey Players in the list: ");
	        employees.printEqualEmployee(hockeyPlayers);

	        System.out.println("\nEquals Professors in the list: ");
	        employees.printEqualEmployee(professors);

	        System.out.println("\nEquals Parents in the list: ");
	        employees.printEqualEmployee(parents);

	        System.out.println("\nEquals Gas Station Attendants in the list: ");
	        employees.printEqualEmployee(gasStationAttendants);
	    }
	}

}
