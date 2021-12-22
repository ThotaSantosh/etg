class Emp{
    empCode:number;
    empName:string;

    constructor(code:number,name:string){
        this.empCode=code;
        this.empName=name;
    }
    display =() => {console.log(this.empCode+''+this.empName)}
}

export default Emp;

let emp=new Emp(1,'ram');
emp.display();