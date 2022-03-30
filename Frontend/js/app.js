import home from "./home.js";

const containerEl = document.querySelector(".container");
function makeHomeView(){
    console.log("working");
    containerEl.innerHTML = home(plants);

}

function makeHomeViewFromJSON(plants){
    
}
makeHomeView();