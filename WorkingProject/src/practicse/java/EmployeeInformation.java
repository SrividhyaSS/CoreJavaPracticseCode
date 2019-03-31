package practicse.java;

public class EmployeeInformation {
	
	int AssociateID;
	String AssociateName;
	
public EmployeeInformation (int AssociateID, String AssociateName)
{
	this.AssociateID = AssociateID;
	this.AssociateName = AssociateName;
}
public int getAssociateID() {
	return AssociateID;
}

public void setAssociateID(int associateID) {
	AssociateID = associateID;
}

public String getAssociateName() {
	return AssociateName;
}

public void setAssociateName(String associateName) {
	AssociateName = associateName;
}
}
