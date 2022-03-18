package com.huawei.java.main;

import ilog.concert.IloException;

import java.io.IOException;
import java.util.List;

/**
 * @author Junho
 * @date 2022/3/17 20:30
 */
public class solve {
	public static void main(String[] args) throws IOException, IloException {
		Readfile file = new Readfile("transportation_node.txt","transportation_relation.txt");
		List<transportation_node> transportationNodeList = file.transportationNodeList;
		transportation_relation transportationRelation = file.transportationRelation;
		
		model_transportation model = new model_transportation();
		model.bulidModel(transportationNodeList, transportationRelation);
	}
}
