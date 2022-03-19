package transportation_problem;

/**
 * @author Junho
 * @date 2022/3/17 20:30
 */
public class transportation_node {
	String NodeName;
	int quantity;
	int isSource;		
	int id;
	public transportation_node(String NodeName,int quantity,int isSource,int id) {
		this.NodeName = NodeName;
		this.quantity = quantity;
		this.isSource = isSource;
		this.id = id;
	} 

	public boolean isSource() {
		if(this.isSource == 1) {
			return true;
		}
	return false;
	}
}
