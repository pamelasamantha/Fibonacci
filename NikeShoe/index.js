

let errorParagraph = document.getElementById("error")
console.log(errorParagraph)

function purchase() {
    //onsole.log("button clicked")
    errorParagraph.textContent = "Something went wrong, please try again"
}