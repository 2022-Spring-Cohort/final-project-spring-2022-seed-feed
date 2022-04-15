export default function allRecipesView(plants){
return `
<div class="button_edaman-badge_div">
<img alt="Back Button" class="backBtn" src="/img/back_arrow.png">
<div class="edamam-badge" id="edamam-badge" data-color="badge">
<a href="https://www.edamam.com/" target="_blank"
rel="noopener noreferrer">
<img alt="Image of the Edaman Badge. Click this image to open www.edamam.com in a new tab." src="./img/branded_logos/Edamam_Badge_Transparent.svg" /></a></div>
</div>
<div class="allRecipes">

${plants
  .map((plant) => {
    return `
    
    <div class="allRecDiv">

    <input type="hidden" class="plantRecId" value="${plant.id}">
    <h2 class="plantName">${plant.name} recipes</h2>
    <img alt="Image for ${plant.name} recipe. Click here to see the recipes." class="plantPhoto" src=${plant.photoLink}>

    </div>`;
  })
  .join("")}


</div>
`;


}