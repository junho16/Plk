package transportation_problem;

import java.io.IOException;
import java.util.List;
import ilog.concert.IloException;

public class solve {
	public static void main(String[] args) throws IOException, IloException {
		Readfile file = new Readfile("F:\\Desktop\\SDK_java\\CodeCraft-2022\\src\\transportation_problem\\transportation_node.txt","F:\\Desktop\\SDK_java\\CodeCraft-2022\\src\\transportation_problem\\transportation_relation.txt");
		List<transportation_node> transportationNodeList = file.transportationNodeList;
		transportation_relation transportationRelation = file.transportationRelation;
		
		model_transportation model = new model_transportation();
		model.bulidModel(transportationNodeList, transportationRelation);
	}
}
