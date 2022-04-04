export default function singlePlantRecipeView(recipes){
return`
${recipes.hits.map(hit => {
    return`
<h1>${hit.recipe.label}</h1>
`
}).join("")
}

`

}