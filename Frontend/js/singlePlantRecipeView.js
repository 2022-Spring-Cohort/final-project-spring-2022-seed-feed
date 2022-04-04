export default function singlePlantRecipeView(plants, recipeName){
return`
${plants.map(plant => {
    return`
<h1>${plant.name}</h1>
<h2>${plant.recipeName}</h2>
`
}).join("")
}

`

}