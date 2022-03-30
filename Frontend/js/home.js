export default function home(plants) {
    return `
    <main class="mainContent">
    <div class="mainSection">
    <h1>Want to start a garden, but don't know when to plant?</h1>
   
    <input type="text" class="zipcode" placeholder="Enter Your Zipcode">
    <br>
    <button class="vegButton">List of Vegetables</button>
    <div id="myDropdown" class="dropdown-content hide">

     ${plants.map(plant =>{ 
        return `
        <section>
       <p class="vegList">${plant.name}</p>
        <input type="hidden" class="chosenVeg" value="${plant.id}">
    </section>`
    }
    ).join("")
    } 
    </div>
    <br>
    <img class="vegImg" src="img/veg.png">
</div>
</main>
    
    
    `
}