class Person1{
    name;
    age;

    constructor(n,a){
        this.name=n;
        this.age=a;
    }

    greeting(){
        console.log('${this.name}');
    }
}

module.exports=PersonDetails;