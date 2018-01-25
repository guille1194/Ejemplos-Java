package tectijuana.checksys.hibernate;

public class Checklist {

	private Integer idChecklist;
	
	public Checklist() {
		// TODO Auto-generated constructor stub
	}

	//siempre debe ser getId(), setId()
	//<property name = id>
	public Integer getIdChecklist() {
		return idChecklist;
	}

	public void setIdChecklist(Integer idChecklist) {
		this.idChecklist = idChecklist;
	}
}