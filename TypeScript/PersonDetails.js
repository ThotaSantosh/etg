"use strict";
exports.__esModule = true;
var PersonDetails = /** @class */ (function () {
    function PersonDetails() {
        this.first = "santosh";
        this.last = "thota";
    }
    PersonDetails.prototype.getFullName = function () {
        return this.first + this.last;
    };
    PersonDetails.prototype.display = function () {
        console.log(this.first);
        console.log(this.last);
        console.log(this.getFullName());
    };
    return PersonDetails;
}());
var p1 = new PersonDetails();
p1.getFullName();
p1.display();
