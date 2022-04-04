export default function allRecipesView(plants){
return`
<div class="allRecipes">

${plants.map(plant => {
    return`
    <div class="allRecDiv">
    <input type="hidden" class="plantRecId" value="${plant.id}">
    <h2 class="plantName">${plant.name} recipes</h2>
    <img class="plantPhoto" src=${plant.photoLink}>
    </div>`
    }).join("")
    }


</div>
`


}