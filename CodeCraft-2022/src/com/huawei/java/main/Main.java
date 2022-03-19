package com.huawei.java.main;

import ilog.concert.IloException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Main {


	/**
	 * load dll文件
	 */
	static {
		try {
			InputStream in = solve.class
					.getResourceAsStream("cplex1290.dll");

			System.out.println("solve.class.getClass()" + in);

			File ffile = new File("");
			String filePath = null;
			filePath = ffile.getAbsolutePath() + File.separator
					+ "helloMyCplex1290.dll";
			System.out.println("filePath helloMyCplex1290.dll is " + filePath);
			File dll = new File(filePath);
			FileOutputStream out = new FileOutputStream(dll);

			int i;
			byte[] buf = new byte[1024];
			try {
				while ((i = in.read(buf)) != -1) {
					out.write(buf, 0, i);
				}
			} finally {
				in.close();
				out.close();
			}
			System.load(dll.getAbsolutePath());//
			dll.deleteOnExit();

		} catch (Exception e) {
			System.err.println("load jni error!");
		}
	}
	public static void main(String[] args) throws IOException, IloException {

		Readfile file = new Readfile(
				"transportation_node.txt",
				"transportation_relation.txt");
//		Readfile file = new Readfile(
//				"CodeCraft-2022/src/testdata/new/transportation_node.txt",
//				"CodeCraft-2022/src/testdata/new/transportation_relation.txt");
//		Readfile file = new Readfile(
//				"F:\\Desktop\\Plk\\CodeCraft-2022\\src\\testdata\\new\\transportation_node.txt",
//				"F:\\Desktop\\Plk\\CodeCraft-2022\\src\\testdata\\new\\transportation_relation.txt");
		List<transportation_node> transportationNodeList = file.transportationNodeList;
		transportation_relation transportationRelation = file.transportationRelation;

		model_transportation model = new model_transportation();
		model.bulidModel(transportationNodeList, transportationRelation);
	}
}