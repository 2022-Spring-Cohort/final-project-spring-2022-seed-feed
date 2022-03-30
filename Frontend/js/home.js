export default function home(plants) {
    return `
    <main class="mainContent">
    <div class="mainSection">
    <h1>Want to start a garden, but don't know when to plant?</h1>
   
    <input type="text" class="zipcode" placeholder="Enter Your Zipcode">
    <br>
    <button class="vegButton">List of Vegetables</button>

    ${plants.map(plant =>{
        return `
        <form>
       <p class="vegList">${plant.name}</p>
        <input type="hidden" class="chosenVeg" value="${plant.id}">
    </form>`
    }).join("")
    }
    <br>
    <img class="vegImg" src="img/veg.png">
</div>
</main>
    
    
    `
}