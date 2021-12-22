import { PersonInterface } from "./PersonInterface";
class PersonDetails implements PersonInterface{
    first: string="santosh";
    last: string="thota";
    getFullName(): string {
       return this.first+this.last;
    }
    display(){
        console.log(this.first);
        console.log(this.last);
        console.log(this.getFullName());
    }

}
var p1=new PersonDetails();
p1.getFullName();
p1.display();