package com.huawei.java.main;

/**
 * @author Junho
 * @date 2022/3/17 20:30
 */
public class transportation_node {
	/**
	 * 编号
	 */
	int id;

	/**
	 * 节点名称
	 */
	String NodeName;

	/**
	 * 是否为边缘节点
	 * 0：是客户节点
	 * 1：是边缘节点
	 */
	int isSource;

	/**
	 * Qos
	 */
	int quantity;

	public transportation_node(String NodeName,int quantity,int isSource,int id) {
		this.NodeName = NodeName;
		this.quantity = quantity;
		this.isSource = isSource;
		this.id = id;
	}

	/**
	 * 判断是否为边缘节点
	 * @return
	 */
	public boolean isSource() {
		if(this.isSource == 1) {
			return true;
		}
		return false;
	}
}
