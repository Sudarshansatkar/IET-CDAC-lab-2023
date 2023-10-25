package p1;

public class EmpPojo
{
	int id;
	String ename,job;
	int mgr,sal,deptno;
	
	public EmpPojo()
	{
		super();
	}

	public EmpPojo(int id, String ename, String job, int mgr, int sal, int deptno) {
		super();
		this.id = id;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.sal = sal;
		this.deptno = deptno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "EmpPojo [id=" + id + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", sal=" + sal + ", deptno="
				+ deptno + "]";
	}
	
	
	
	
	
}
