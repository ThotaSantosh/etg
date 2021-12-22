class Bank{
    accId:number;
    accName:string;
    accBal:number;
    
    constructor(i:number,n:string,b:number){
        this.accId=i;
        this.accName=n;
        this.accBal=b;
    }
    deposit(amount:number):number{
        return amount+this.accBal;
    }
    display(){
        console.log(this.accBal);
        console.log(this.accId);
        console.log(this.accName);
        console.log(this.deposit(500));
    }
}

var b1=new Bank(101,"santosh",20000);
b1.display();