

let num1 = 8
let num2 = 2


document.getElementById("num1").textContent = num1
document.getElementById("num2").textContent = num2


let total = document.getElementById("total")

function add() {
    let result = num1 + num2
   total.textContent = "Total: " + result
}

function subtract() {
    let result = num1 - num2
   total.textContent = "Total: " + result

}


function divide() {
    let result = num1 / num2
   total.textContent = "Total: " + result

}


function multiply() {
    let result = num1 * num2
   total.textContent = "Total: " + result

}


