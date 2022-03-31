import home from "./home.js";




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
    // const vegBtn = containerEl.querySelector(".vegButton");
    // vegBtn.addEventListener("click", myFunction);
    
}
makeHomeView();

// function myFunction() {
//     const dropdown = document.getElementById("myDropdown");
//     if (dropdown.classList.contains("hide")) {
//         dropdown.classList.remove("hide");
//         dropdown.classList.add("show");
//     }
//     else {
//         dropdown.classList.remove("show");
//         dropdown.classList.add("hide");
//     }


// }
// window.onclick = function(event) {
//     if (!event.target.matches('.vegButton')) {
//       var dropdowns = document.getElementsByClassName("dropdown-content");
//       var i;
//       for (i = 0; i < dropdowns.length; i++) {
//         var openDropdown = dropdowns[i];
//         if (openDropdown.classList.contains('show')) {
//           openDropdown.classList.remove('show');
//           openDropdown.classList.add('hide');
//         }
//       }
//     }
//   }

function ValidateVegSelection()  {  
    var checkboxes = document.getElementsByName("veg_select");  
    var numberOfCheckedItems = 0;  
    for(var i = 0; i < checkboxes.length; i++)  
    {  
        if(checkboxes[i].checked)  
            numberOfCheckedItems++;  
    }  
    if(numberOfCheckedItems > 2)  
    {  
        alert("You can't select more than two favorite pets!");  
        return false;  
    }  
}  



// *************************************************
// **************************************************
// THIS IS THE SINGLE PLANT VIEW SECTION:
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

