//document.getElementById("countNum").innerText = 5


let countNum = document.getElementById("counter") //pass in argument
let saveNum = document.getElementById("save")

//initialize the count as 0
let count = 0


//increment button 
function increment() {
    count++ //increment counter 
    countNum.innerText = count //change the count number display text 
}

//save button 
function save() {
    let prevCount = count + " - " //store previous entries seperated by dash
    //saveNum.innerText += prevCount //display previous numbers (innerText wont return hidden elements)
    saveNum.textContent += prevCount //textContent displays the included white spaces after the number
    countNum.textContent = 0 //resets counter
    count = 0 //reset counter from 0 (without increment from previous number)
}

//decrement button 
function decrement() {
    count--
    countNum.innerText = count
}


