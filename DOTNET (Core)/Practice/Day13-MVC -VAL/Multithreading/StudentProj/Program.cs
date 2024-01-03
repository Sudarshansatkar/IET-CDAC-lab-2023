using BOL;
using BLL;
using Util;

StudentManager smgr = new StudentManager();
List<Student> s_arr = new List<Student>();
s_arr = smgr.getStudents();

Print.putData(s_arr);
Print.getData();




