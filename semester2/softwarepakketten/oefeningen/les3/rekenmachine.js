function calculate() {
    var num1 = parseInt(document.getElementById("num1").value);
    var num2 = parseInt(document.getElementById("num2").value);
    var op = document.getElementById("operator").value;
    console.log(num1);
    console.log(num2);
    console.log(op);

    var res;
    switch(op) {
    case "plus":
        res = num1 + num2;
        break;
    case "min":
        res = num1 - num2;
        break;
    case "div":
        if (num2 === 0) {
            res = "Error: cannot divide by zero";
            break;
        }
        res = num1 / num2;
        break;
    case "mult":
        res = num1 * num2;
        break;
    default:
        //
    }
    console.log(res);
    document.getElementById("output").innerHTML = res;
};
