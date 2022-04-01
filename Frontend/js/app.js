import home from "./home.js";
import selectedPlantsView from "./selectedPlantsView.js";





// *************************************************
// **************************************************
// THIS IS THE HOMEVIEW SECTION:
// *************************************************
const containerEl = document.querySelector(".container");
function makeHomeView(){
    console.log("working");
    fetch("http://localhost:8080/")
    .then((res) => res.json())
    .then((plants) => {
        makeHomeViewFromJSON(plants);
    })
    

}

function makeHomeViewFromJSON(plants){
  containerEl.innerHTML = home(plants);
  //bind function will go here
  const checkBoxDivs = containerEl.querySelector(".veg_id");

    const submit_button = document.querySelector(".submitButton");


  submit_button.addEventListener("click", ValidateVegSelection);
  console.log(plants.id);
}
   
makeHomeView();



function ValidateVegSelection()  { 


var array = [];
var queryString = "";
var checkboxes = document.querySelectorAll("input:checked");
// console.log(checkboxes)
for (var i = 0; i < checkboxes.length; i++) {
  console.log(checkboxes[i].parentElement.querySelector(".veg_id").value);
  array.push(checkboxes[i].parentElement.querySelector(".veg_id").value);
  queryString +=
    checkboxes[i].parentElement.querySelector(".veg_id").value + "," ;
  // TRIM QUERYSTRING HERE AS STRETCH GOAL
}

fetch("http://localhost:8080/plants?plantsIds="+queryString) 
.then(res => res.json())
.then(plants =>{
  makeSelectedPlantViewFromJson(plants);
})
}  
function makeSelectedPlantViewFromJson(plants){
containerEl.innerHTML = selectedPlantsView(plants);

}






// *************************************************
// **************************************************
// THIS IS THE SELECTED PLANTS VIEW SECTION:
// *************************************************



// *************************************************
// **************************************************
// THIS IS THE SINGLE PLANT RECIPES VIEW SECTION:
// *************************************************




// *************************************************
// **************************************************
// THIS IS THE SINGLE RECIPE VIEW SECTION, FROM PLANT:
// *************************************************





// *************************************************
// **************************************************
// THIS IS THE ALL RECIPE VIEW SECTION:
// *************************************************

