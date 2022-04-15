export default function singlePlantRecipeView(recipes){
return `
<div class="button_edaman-badge_div">
<img alt="Back Button" class ="backBtn" src="/img/back_arrow.png">

<div class="edamam-badge" id="edamam-badge" data-color="badge">

<a href="https://www.edamam.com/" target="_blank"
rel="noopener noreferrer">
<img alt="Image of the Edaman Badge. Click this image to open www.edamam.com in a new tab." src="./img/branded_logos/Edamam_Badge_Transparent.svg" /></a>
</div>

</div>

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