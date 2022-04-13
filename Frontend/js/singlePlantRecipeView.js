export default function singlePlantRecipeView(recipes){
return `
<img class ="backBtn" src="/img/back_arrow.png">

<div class="singleRecipes">
${recipes.hits
  .map((hit) => {
    return `

<div class="singleRecipeDiv">

<h2 class"recipeTitle">${hit.recipe.label}</h2>
<a href="${hit.recipe.url}" target="_blank" rel="noopener noreferrer">
<img alt="Image for ${hit.recipe.label} recipe. Click here to open the link in a new window." class="recipeImage" src="${hit.recipe.images.SMALL.url}"></a>
</div>
`;
  })
  .join("")}
</div>

`;

}

//Possibly add plant recipes back in here at the top. Need to pass in a plant.