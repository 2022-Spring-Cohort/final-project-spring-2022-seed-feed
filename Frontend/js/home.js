export default function home(plants) {
    return `
    <main class="mainContent">
    <div class="mainSection">
    <h1>Want to start a garden, but don't know when to plant?</h1>
   
   <input type="text" class="zipcode" placeholder="Enter Your Zipcode"> 
    <br>
   

 
 

        <section>
        <form method="post" action="/Tests/Post">  
   
    <legend>Plants to check</legend>  
       <fieldset>
     ${plants
            .map((plant) => {
                return `


    <input type="checkbox" name="veg_select" value="${plant.name}" onclick="return ValidateVegSelection();">${plant.name}<br>  
  
        <br>  

 
 `;
            })
            .join("")} 
           </fieldset>  
</form>
    </section>
    <input type="submit" value="Submit now">  
    <br>
    <img class="vegImg" src="img/veg.png">

    </div>
</main>
    
    
    `;
}
