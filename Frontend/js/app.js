import home from "./home.js";
import selectedPlantsView from "./selectedPlantsView.js";
import header from "./header.js";
import footer from "./footer.js";
import allRecipesView from "./allRecipesView.js";






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
  containerEl.innerHTML = header();
  containerEl.innerHTML += home(plants);
  containerEl.innerHTML += footer();
  //bind function will go here
  const checkBoxDivs = containerEl.querySelector(".veg_id");

  //Submit button
  const submit_button = document.querySelector(".submitButton");
  submit_button.addEventListener("click", ValidateVegSelection);
  console.log(plants.id);

  // //All recipes button
  const allRecButton = document.querySelector(".allRecipesButton");
  allRecButton.addEventListener("click", makeAllRecipesView)
}
   
makeHomeView();

// *************************************************
// **************************************************
// THIS IS THE SELECTED PLANTS VIEW SECTION:
// *************************************************

//Once the submit button is clicked on the homepage, the function below runs

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
// THIS IS THE ALL RECIPE VIEW SECTION:
// *************************************************
  
function makeAllRecipesView(plants){

  fetch("http://localhost:8080/")
  .then((res) => res.json())
  .then((plants) => {
      makeAllRecipesViewFromJson(plants);
  })
}
function makeAllRecipesViewFromJson(plants){
containerEl.innerHTML = header();
containerEl.innerHTML += allRecipesView(plants);
containerEl.innerHTML += footer();
}







// *************************************************
// **************************************************
// THIS IS THE SINGLE PLANT RECIPES VIEW SECTION:
// *************************************************




// *************************************************
// **************************************************
// THIS IS THE SINGLE RECIPE VIEW SECTION, FROM PLANT:
// *************************************************







