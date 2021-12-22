"use strict";
exports.__esModule = true;
var Emp = /** @class */ (function () {
    function Emp(code, name) {
        var _this = this;
        this.display = function () { console.log(_this.empCode + '' + _this.empName); };
        this.empCode = code;
        this.empName = name;
    }
    return Emp;
}());
exports["default"] = Emp;
var emp = new Emp(1, 'ram');
emp.display();
