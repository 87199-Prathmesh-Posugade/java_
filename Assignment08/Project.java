import java.io.Serializable;

public class Project implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pId;
	private String title;
	private int teamSize;
	private double projectCost;
	private String tech;

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public Project(int pId) {
		this.pId = pId;
	}

	public double getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(double projectCost) {
		this.projectCost = projectCost;
	}

	public Project(int pId, String title, int teamSize, double projectCost, String tech) {
		this.pId = pId;
		this.title = title;
		this.teamSize = teamSize;
		this.projectCost = projectCost;
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Project [id=" + pId + ", t=" + title + ", tS=" + teamSize + ", pCost=" + projectCost + ", tech=" + tech
				+ "]";
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(pId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Project d = (Project) obj;
		return d.pId == this.pId;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

}