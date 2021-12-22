export class Employee{
    empID:number=123;
    empName:string="Santosh";
    empSal:number=24714;
    constructor(i:number,n:string,s:number){
        this.empID=i;
        this.empName=n;
        this.empSal=s;
    }
    display(){
        console.log(this.empID);
        console.log(this.empName);
        console.log(this.empSal);
    }


}

var e1=new Employee(122,"ramesh",23456);
e1.display();

//var e1=new Employee();
//e1.display();