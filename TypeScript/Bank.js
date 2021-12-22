var Bank = /** @class */ (function () {
    function Bank(i, n, b) {
        this.accId = i;
        this.accName = n;
        this.accBal = b;
    }
    Bank.prototype.deposit = function (amount) {
        return amount + this.accBal;
    };
    Bank.prototype.display = function () {
        console.log(this.accBal);
        console.log(this.accId);
        console.log(this.accName);
        console.log(this.deposit(500));
    };
    return Bank;
}());
var b1 = new Bank(101, "santosh", 20000);
b1.display();
