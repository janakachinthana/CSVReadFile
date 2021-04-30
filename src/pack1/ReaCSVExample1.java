package pack1;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;   

public class ReaCSVExample1 {

	public static void main(String[] args)   
	{  
	String line = "";  
	String splitBy = ",";  
	try   
	{  
	//parsing a CSV file into BufferedReader class constructor  
	BufferedReader br = new BufferedReader(new FileReader("C:\\CSVDemo.csv"));  
	while ((line = br.readLine()) != null)   //returns a Boolean value  
	{  
		String[] employee = line.split(splitBy);    // use comma as separator  
		if(line.contains("PhD") ) {
			if(!employee[12].equals(" publications")) {
				int x = Integer.parseInt(employee[12]);
				if(x >= 15) {
					System.out.println(employee[0] + ", " + employee[1] + ", " + employee[2] + ", " + employee[3] + ", " + employee[4] + ", " + employee[5] + ", " + employee[6] + ", " + employee[7] + ", " + employee[8] + ", " + employee[9] + ", " + employee[10] + ", " + employee[11] + ", " + employee[12]);
					System.out.println("Full Professor \n");
				}
				else if(x >= 8) {
					System.out.println(employee[0] + ", " + employee[1] + ", " + employee[2] + ", " + employee[3] + ", " + employee[4] + ", " + employee[5] + ", " + employee[6] + ", " + employee[7] + ", " + employee[8] + ", " + employee[9] + ", " + employee[10] + ", " + employee[11] + ", " + employee[12]);
					System.out.println("Associate Professor \n");
				}
			}
			
			
		}
		else if(line.contains("BSc") ){
			int x = Integer.parseInt(employee[12]);
			if(x >= 8) {
				System.out.println(employee[0] + ", " + employee[1] + ", " + employee[2] + ", " + employee[3] + ", " + employee[4] + ", " + employee[5] + ", " + employee[6] + ", " + employee[7] + ", " + employee[8] + ", " + employee[9] + ", " + employee[10] + ", " + employee[11] + ", " + employee[12]);
				System.out.println("Senior Lecturer \n");
			}
			else if(x < 8) {
				System.out.println(employee[0] + ", " + employee[1] + ", " + employee[2] + ", " + employee[3] + ", " + employee[4] + ", " + employee[5] + ", " + employee[6] + ", " + employee[7] + ", " + employee[8] + ", " + employee[9] + ", " + employee[10] + ", " + employee[11] + ", " + employee[12]);
				System.out.println("Lecturer \n");
			}
			
		}
		else {
			System.out.println(employee[0] + ", " + employee[1] + ", " + employee[2] + ", " + employee[3] + ", " + employee[4] + ", " + employee[5] + ", " + employee[6] + ", " + employee[7] + ", " + employee[8] + ", " + employee[9] + ", " + employee[10] + ", " + employee[11] + ", " + employee[12]);
			System.out.println("Instructor \n");
		}
	}  
	}   
	catch (IOException e)   
	{  
	e.printStackTrace();  
	}  
	}  
}
