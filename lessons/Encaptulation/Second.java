public class Second{
	private String collegeName,name,department;
	private byte age,sem;
	//Setting all variables
	public void setCollege(String newCollegeName,String newName,String newDepartment,byte newAge,byte newSem){
		this.collegeName=newCollegeName;
		this.name=newName;
		this.department=newDepartment;
		this.age=newAge;
		this.sem=newSem;
	}
	public String getCollegeName(){
		return collegeName;
	}
	public String getName(){
		return name;
	}
	public String getDepartment(){
		return department;
	}
	public byte getAge(){
		return age;
	}
	public byte getSem(){
		return sem;
	}
}