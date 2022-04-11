export default function allRecipesView(plants){
return`
<button class ="backBtn">Back Button</button>
<div class="allRecipes">

${plants.map(plant => {
    return `
    
    <div class="allRecDiv">

    <input type="hidden" class="plantRecId" value="${plant.id}">
    <h2 class="plantName">${plant.name} recipes</h2>
    <img alt="Image for ${plant.name} recipe. Click here to see the recipes." class="plantPhoto" src=${plant.photoLink}>

    </div>`;
    }).join("")
    }


</div>
`


}