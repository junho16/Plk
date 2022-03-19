package transportation_problem;

import java.io.*;
import java.util.*;

/**
 * @author Junho
 * @date 2022/3/17 20:30
 */
public class Readfile {
	List<transportation_node> transportationNodeList = new ArrayList<transportation_node>();
	transportation_relation transportationRelation;
	
	public Readfile(String path1,String path2) throws IOException {
		readtransportation_node(path1);
		transportation_relation(path2);
	}
	
	public void readtransportation_node(String path) throws IOException {


////		InputStream inputStream = solve.class.getResourceAsStream("transportation_node.txt");
//		InputStream inputStream = Readfile.class.getResourceAsStream(path);
//		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
//
//		String line = "";
//		br.readLine();
//		while((line = br.readLine()) != null){//一行一行读
//			System.out.println(line);
//			String[] tokens = line.split(" ");
//
//			transportation_node Temp = new transportation_node(tokens[0],Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]));
//			transportationNodeList.add(Temp);
//			line = br.readLine();
////		    tokens = line.split("\\s+");
//			if(line != null)
//				tokens = line.split(" ");
//			else
//				break;
//		}
//		br.close();
		InputStream inputStream = Readfile.class.getResourceAsStream(path);
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
//		BufferedReader br = new BufferedReader(new FileReader(path));

		String line = new String();

		//读取变量
	    br.readLine();
	    line = br.readLine();
//	    String[] tokens = line.split("\\s+");
		String[] tokens = line.split(" ");
		while(tokens.length > 0) {
			transportation_node Temp = new transportation_node(tokens[0],Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]));
			transportationNodeList.add(Temp);
		    line = br.readLine();
//		    tokens = line.split("\\s+");
			if(line != null)
				tokens = line.split(" ");
			else
				break;
		}
		br.close();
	}
	
	public void transportation_relation(String path) throws IOException {

//		BufferedReader br = new BufferedReader(new FileReader(path));
		InputStream inputStream = Readfile.class.getResourceAsStream(path);
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

		String line[] = new String[100];
		int row = 0;
		line[row] = br.readLine();
		while(line[row] != null) {
			row++;
			line[row] = br.readLine();
		}

//		String[] tokens = line[0].split("\\s+");
		String[] tokens = line[0].split(" ");
		int column = tokens.length;
		int [] dis = new int[(row-1)*column];

		for (int i = 1; i < row; i++) {
			tokens = line[i].split(" ");
//			tokens = line[i].split("\\s+");
			for (int j = 1; j <= column; j++) {
				dis[(column)*(i-1)+j-1] = Integer.parseInt(tokens[j]);
			}
		}
		transportationRelation = new transportation_relation(dis);
		br.close();
	}
}
