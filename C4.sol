pragma solidity ^0.8;

contract student{
    struct Student{
        int stud_id;
        string name;
        string department;
    }

    Student[] Students;

    function add_stud(int stud_id, string memory name, string memory department) public {
        Student memory stud = Student(stud_id, name,department);
        Students.push(stud);
    }

    function getStudetn(int stud_id) public  view returns (string memory, string memory){
        for (uint i=0; i<Students.length; i++){
            Student memory stud = Students[i]; // Changed here
            if(stud.stud_id == stud_id){
                return (stud.name, stud.department);
            }
        }
        return("Not found", "Not Found");
    }
}
