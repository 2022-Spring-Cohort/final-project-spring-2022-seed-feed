export default function singlePlantRecipeView(recipes){
return`
${recipes.hits.map(hit => {
    return`
    <div class="singleRecipeDiv">
<h1>${hit.recipe.label}</h1>
<a href="${hit.recipe.url}">
<img class="recipeImage" src="${hit.recipe.images.SMALL.url}"></a>
</div>`
}).join("")
}

`

}

//Possibly add plant recipes back in here at the top. Need to pass in a plant.