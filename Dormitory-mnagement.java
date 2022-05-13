

public class proctorMananger {

	public string address;
	public int age;
	public int blockNo;
	public string campus;
	public string ciity;
	public string first_name;
	public string last_name;
	private int proctorManagerId;
	public string sex;
	public student m_student;
	public building m_building;

	public proctorMananger(){

	}

	public void finalize() throws Throwable {

	}

	public void addProctor(){

	}

	public void arrangeBuilding(){

	}

}


public class building {

	public int bllock_capacity;
	public string block_name;
	public int no_dorm;
	public int noStudAssigned;
	public string proctorAssigned;
	public dorm m_dorm;
	public material m_material;

	public building(){

	}

	public void finalize() throws Throwable {

	}

	public void addBuilding(){

	}

	public void assignProctor(){

	}

	public void getBildingStatus(){

	}

}


public class student {

	public int age;
	public string block_name;
	public string department;
	public int dorm_no;
	public string faculity;
	public string first_name;
	public string last_name;
	public string sex;
	private string studentId;
	public int year;
	public dorm m_dorm;
	public department m_department;
	public material m_material;

	public student(){

	}

	public void finalize() throws Throwable {

	}

	public void register(){

	}

	public void submitInfo(){

	}

	public void viewInfo(){

	}

}



public class faculity {

	public string faculity_name;
	private int faculity_no;
	public int noOfdepartment;
	public department m_department;

	public faculity(){

	}

	public void finalize() throws Throwable {

	}

	public void get_faculity(){

	}

}



public class department {

	public string dep_name;
	private int dep_no;
	public int faculity_no;

	public department(){

	}

	public void finalize() throws Throwable {

	}

	public void getDepartment(){

	}

}


public class dorm {

	public int block_no;
	public int capacity;
	public int dorm_no;
	public int free_dorm;
	public int no_student;
	public material m_material;

	public dorm(){

	}

	public void finalize() throws Throwable {

	}

	public void getDorm(){

	}

	public void recordDorm(){

	}

}

/*the last class material*/

public class material {

	public int block_no;
	public string blockName;
	public int dormNo;
	public string itemType;
	public string quantity;

	public material(){

	}

	public void finalize() throws Throwable {

	}

	public void checkStatus(){

	}

	public void getMaterial(){

	}

}